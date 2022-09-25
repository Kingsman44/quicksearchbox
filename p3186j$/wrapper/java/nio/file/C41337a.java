package p3186j$.wrapper.java.nio.file;

import java.nio.file.AccessDeniedException;
import p3186j$.nio.file.C40949a;

/* renamed from: j$.wrapper.java.nio.file.a */
final class C41337a extends C40949a {
    C41337a(AccessDeniedException accessDeniedException) {
        super(accessDeniedException.getFile(), accessDeniedException.getOtherFile(), accessDeniedException.getReason());
    }
}
