package p3186j$.wrapper.java.nio.file;

import java.nio.file.FileAlreadyExistsException;
import p3186j$.nio.file.C40949a;

/* renamed from: j$.wrapper.java.nio.file.e */
final class C41341e extends C40949a {
    C41341e(FileAlreadyExistsException fileAlreadyExistsException) {
        super(fileAlreadyExistsException.getFile(), fileAlreadyExistsException.getOtherFile(), fileAlreadyExistsException.getReason());
    }
}
