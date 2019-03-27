package com.shree.web.repository;

import java.io.IOException;
import java.nio.file.Path;

public interface FileStorageRepository {
	public String saveFileGridFs(Path targetLocation) throws IOException;

	public String retrieveImageFile(String imageFileId) throws IOException;

}
