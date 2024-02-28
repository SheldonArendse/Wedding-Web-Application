package za.ac.cput.reminisce.Services;

import za.ac.cput.reminisce.Models.Registry;

import java.util.List;

public interface RegistryBsInterface {
    public Registry getById(long id);
    public List<Registry> getRegistry(long WeddingID);
    public long addOne(long weddingId,Registry newRegistry);
    public boolean deleteOne(long id);
    public Registry updateOne(long id, Registry updatedRegistry);

    public void init();
    public void destroy();
}
