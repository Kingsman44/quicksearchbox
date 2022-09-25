package p3186j$.wrapper.java.nio.file;

import android.os.Build;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.NotLinkException;

/* renamed from: j$.wrapper.java.nio.file.b */
public abstract class C41338b {
    /* renamed from: a */
    public static IOException m72304a(IOException iOException) {
        IOException fVar;
        if (iOException == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return iOException;
        }
        if (iOException instanceof AccessDeniedException) {
            fVar = new C41337a((AccessDeniedException) iOException);
        } else if (iOException instanceof AtomicMoveNotSupportedException) {
            fVar = new C41339c((AtomicMoveNotSupportedException) iOException);
        } else if (iOException instanceof DirectoryNotEmptyException) {
            fVar = new C41340d((DirectoryNotEmptyException) iOException);
        } else if (iOException instanceof FileAlreadyExistsException) {
            fVar = new C41341e((FileAlreadyExistsException) iOException);
        } else if (iOException instanceof FileSystemLoopException) {
            fVar = new C41343g((FileSystemLoopException) iOException);
        } else if (iOException instanceof NoSuchFileException) {
            fVar = new C41344h((NoSuchFileException) iOException);
        } else if (iOException instanceof NotDirectoryException) {
            fVar = new C41345i((NotDirectoryException) iOException);
        } else if (iOException instanceof NotLinkException) {
            fVar = new C41346j((NotLinkException) iOException);
        } else if (!(iOException instanceof FileSystemException)) {
            return iOException;
        } else {
            fVar = new C41342f((FileSystemException) iOException);
        }
        return fVar;
    }
}
