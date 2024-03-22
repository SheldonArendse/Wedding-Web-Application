package za.ac.cput.reminisce.Models;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Wedding {
    @Id
    private long eventId;
    @OneToOne
    @JoinColumn(name = "org_id")
    private Organizer orgId;
    private String venue;
    private Date date;
    private Time startTime;
    private int noOfTables, noOfSeats;

    public Wedding(){}

    private Wedding(Builder builder){

    }

    public long getEventId() {
        return eventId;
    }

    public Organizer getOrgId() {
        return orgId;
    }

    public String getVenue() {
        return venue;
    }

    public Date getDate() {
        return date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wedding wedding = (Wedding) o;
        return eventId == wedding.eventId && noOfTables == wedding.noOfTables && noOfSeats == wedding.noOfSeats && Objects.equals(orgId, wedding.orgId) && Objects.equals(venue, wedding.venue) && Objects.equals(date, wedding.date) && Objects.equals(startTime, wedding.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, orgId, venue, date, startTime, noOfTables, noOfSeats);
    }

    @Override
    public String toString() {
        return "Wedding{" +
                "eventId=" + eventId +
                ", orgId=" + orgId +
                ", venue='" + venue + '\'' +
                ", date=" + date +
                ", startTime=" + startTime +
                ", noOfTables=" + noOfTables +
                ", noOfSeats=" + noOfSeats +
                '}';
    }

    public static class Builder{
        private long eventId;
        private Organizer orgId;
        private String venue;
        private Date date;
        private Time startTime;
        private int noOfTables, noOfSeats;

        public Builder setEventId(long eventId) {
            this.eventId = eventId;
            return this;
        }

        public Builder setOrgId(Organizer orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setVenue(String venue) {
            this.venue = venue;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setStartTime(Time startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setNoOfTables(int noOfTables) {
            this.noOfTables = noOfTables;
            return this;
        }

        public Builder setNoOfSeats(int noOfSeats) {
            this.noOfSeats = noOfSeats;
            return this;
        }
        public Builder copy(Wedding obj){
            this.eventId = obj.eventId;
            this.orgId = obj.orgId;
            this.venue = obj.venue;
            this.date = obj.date;
            this.startTime = obj.startTime;
            this.noOfTables = obj.noOfTables;
            this.noOfSeats = obj.noOfSeats;
            return this;
        }
        public Wedding build(){
            return new Wedding(this);
        }
    }
}
