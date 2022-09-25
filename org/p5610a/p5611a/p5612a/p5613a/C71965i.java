package org.p5610a.p5611a.p5612a.p5613a;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.p3190io.UncheckedIOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: org.a.a.a.a.i */
/* compiled from: PG */
public final class C71965i {

    /* renamed from: a */
    public static final OpenOption[] f191665a = {StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};

    /* renamed from: b */
    public static final LinkOption[] f191666b = new LinkOption[0];
    @Deprecated

    /* renamed from: c */
    public static final LinkOption[] f191667c = {LinkOption.NOFOLLOW_LINKS};

    /* renamed from: d */
    public static final OpenOption[] f191668d = new OpenOption[0];

    /* renamed from: a */
    public static Path m105244a(Path path) {
        if (path == null) {
            return null;
        }
        return path.getParent();
    }

    /* renamed from: b */
    public static BasicFileAttributes m105245b(Path path, Class cls, LinkOption... linkOptionArr) {
        if (path == null) {
            return null;
        }
        try {
            return Files.readAttributes(path, cls, linkOptionArr);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static PosixFileAttributes m105246c(Path path, LinkOption... linkOptionArr) {
        return (PosixFileAttributes) m105245b(path, PosixFileAttributes.class, linkOptionArr);
    }

    /* renamed from: d */
    public static void m105247d(Path path, Path path2) {
        Objects.requireNonNull(path, "sourceFile");
        Files.setLastModifiedTime(path2, Files.getLastModifiedTime((Path) Objects.requireNonNull(path, "path"), new LinkOption[0]));
    }

    /* renamed from: e */
    public static boolean m105248e(Path path, LinkOption... linkOptionArr) {
        Objects.requireNonNull(path, "path");
        return linkOptionArr != null ? Files.exists(path, linkOptionArr) : Files.exists(path, new LinkOption[0]);
    }

    /* renamed from: f */
    public static boolean m105249f(Path path) {
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path);
        try {
            boolean hasNext = true ^ newDirectoryStream.iterator().hasNext();
            if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            return hasNext;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: g */
    public static LinkOption[] m105250g() {
        return (LinkOption[]) f191667c.clone();
    }

    /* renamed from: h */
    public static C71957a m105251h(Path path, LinkOption[] linkOptionArr, C71961e... eVarArr) {
        if (!Files.isDirectory(path, linkOptionArr)) {
            return m105252i(path, linkOptionArr, eVarArr);
        }
        C71962f fVar = new C71962f(new C71959c(), linkOptionArr, eVarArr, new String[0]);
        Objects.requireNonNull(path, "directory");
        if (m105248e(path, new LinkOption[0])) {
            Files.walkFileTree(path, fVar);
            return fVar.f191658a;
        }
        throw new IllegalArgumentException("File system element for parameter 'directory' does not exist: '" + path + "'");
    }

    /* renamed from: i */
    public static C71957a m105252i(Path path, LinkOption[] linkOptionArr, C71961e... eVarArr) {
        if (!Files.isDirectory(path, linkOptionArr)) {
            C71959c cVar = new C71959c();
            long j = 0;
            long size = (!m105248e(path, linkOptionArr) || Files.isSymbolicLink(path)) ? 0 : Files.size(path);
            try {
                if (Files.deleteIfExists(path)) {
                    cVar.f191656c.mo63132a();
                    cVar.f191654a.f191657a += size;
                    return cVar;
                }
            } catch (AccessDeniedException unused) {
            }
            Path a = m105244a(path);
            PosixFileAttributes posixFileAttributes = null;
            try {
                if (Stream.CC.m71936of((T[]) eVarArr).anyMatch(C71964h.f191664a)) {
                    posixFileAttributes = m105246c(a, linkOptionArr);
                    m105253j(path, linkOptionArr);
                }
                if (m105248e(path, linkOptionArr) && !Files.isSymbolicLink(path)) {
                    j = Files.size(path);
                }
                if (Files.deleteIfExists(path)) {
                    cVar.f191656c.mo63132a();
                    cVar.f191654a.f191657a += j;
                }
                if (posixFileAttributes != null) {
                    Files.setPosixFilePermissions(a, posixFileAttributes.permissions());
                }
                return cVar;
            } catch (Throwable th) {
                if (posixFileAttributes != null) {
                    Files.setPosixFilePermissions(a, posixFileAttributes.permissions());
                }
                throw th;
            }
        } else {
            throw new NoSuchFileException(path.toString());
        }
    }

    /* renamed from: j */
    public static void m105253j(Path path, LinkOption... linkOptionArr) {
        try {
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, linkOptionArr);
            if (dosFileAttributeView == null) {
                Path a = m105244a(path);
                if (!m105248e(a, linkOptionArr) || m105246c(a, linkOptionArr) == null) {
                    throw new IOException(String.format("DOS or POSIX file operations not available for '%s' %s", new Object[]{path, Arrays.toString(linkOptionArr)}));
                }
                List asList = Arrays.asList(new PosixFilePermission[]{PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE});
                if (a != null) {
                    Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(a, linkOptionArr);
                    posixFilePermissions.addAll(asList);
                    Files.setPosixFilePermissions(a, posixFilePermissions);
                    return;
                }
                return;
            }
            dosFileAttributeView.setReadOnly(false);
        } catch (IOException unused) {
        }
    }
}
