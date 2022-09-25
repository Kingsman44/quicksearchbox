package org.p5610a.p5611a.p5612a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.p5610a.p5611a.p5612a.p5613a.C71957a;
import org.p5610a.p5611a.p5612a.p5613a.C71965i;
import org.p5610a.p5611a.p5612a.p5613a.C71969m;
import org.p5610a.p5611a.p5612a.p5615c.C71976a;
import org.p5610a.p5611a.p5612a.p5615c.C71977b;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: org.a.a.a.d */
/* compiled from: PG */
public final class C71978d {

    /* renamed from: a */
    public static final BigInteger f191683a;

    /* renamed from: b */
    public static final BigInteger f191684b;

    /* renamed from: c */
    public static final BigInteger f191685c;

    /* renamed from: d */
    public static final BigInteger f191686d;

    /* renamed from: e */
    public static final BigInteger f191687e;

    /* renamed from: f */
    public static final BigInteger f191688f;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        f191683a = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        f191684b = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        f191685c = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        f191686d = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        f191687e = multiply4;
        valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));
        f191688f = multiply5;
        valueOf.multiply(multiply5);
    }

    /* renamed from: a */
    public static FileInputStream m105260a(File file) {
        Objects.requireNonNull(file, "file");
        return new FileInputStream(file);
    }

    /* renamed from: b */
    public static String m105261b(File file, Charset charset) {
        InputStream newInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            String a = C71989i.m105286a(newInputStream, C71956a.m105231a(charset));
            if (newInputStream != null) {
                newInputStream.close();
            }
            return a;
        } catch (Throwable th) {
            C71975c.m105259a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public static void m105262c(File file) {
        Stream of = Stream.CC.m71936of((T[]) m105273n(file));
        C71977b bVar = C71977b.f191682a;
        AtomicReference atomicReference = new AtomicReference();
        AtomicInteger atomicInteger = new AtomicInteger();
        if (of == null) {
            of = Stream.CC.empty();
        }
        of.forEach(new C71976a(atomicReference, bVar, atomicInteger));
        List list = (List) atomicReference.get();
        if (!C71981e.m105280a(list)) {
            throw new C71981e(Objects.toString((Object) null, (String) null), list);
        }
    }

    /* renamed from: d */
    public static void m105263d(File file, File file2, CopyOption... copyOptionArr) {
        m105268i(file, file2);
        m105277r(file, "srcFile");
        m105267h(file, file2);
        m105274o(file2.getParentFile());
        Objects.requireNonNull(file2, "destFile");
        if (file2.exists()) {
            m105277r(file2, "destFile");
        }
        if (file2.exists()) {
            m105279t(file2, "destFile");
        }
        Files.copy(file.toPath(), file2.toPath(), copyOptionArr);
    }

    /* renamed from: e */
    public static void m105264e(File file) {
        Objects.requireNonNull(file, "directory");
        if (file.exists()) {
            if (file == null || !Files.isSymbolicLink(file.toPath())) {
                m105262c(file);
            }
            m105271l(file);
        }
    }

    /* renamed from: f */
    public static void m105265f(File file) {
        Objects.requireNonNull(file, "file");
        try {
            C71957a h = C71965i.m105251h(file.toPath(), C71965i.f191666b, C71969m.f191672a);
            if (h.f191656c.f191657a < 1 && h.f191655b.f191657a < 1) {
                new StringBuilder("File does not exist: ").append(file);
                throw new FileNotFoundException("File does not exist: ".concat(String.valueOf(file)));
            }
        } catch (IOException e) {
            new StringBuilder("Cannot delete file: ").append(file);
            throw new IOException("Cannot delete file: ".concat(String.valueOf(file)), e);
        }
    }

    /* renamed from: g */
    public static void m105266g(File file, String str) {
        if (file.exists()) {
            throw new C71970b(String.format("File element in parameter '%s' already exists: '%s'", new Object[]{str, file}));
        }
    }

    /* renamed from: h */
    public static void m105267h(File file, File file2) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.equals(file2.getCanonicalPath())) {
            throw new IllegalArgumentException(String.format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", new Object[]{canonicalPath, file, file2}));
        }
    }

    /* renamed from: i */
    public static void m105268i(File file, File file2) {
        m105276q(file, "source");
        Objects.requireNonNull(file2, "destination");
    }

    /* renamed from: j */
    public static void m105269j(File file, File file2) {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "destination");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    /* renamed from: k */
    public static byte[] m105270k(File file) {
        Objects.requireNonNull(file, "file");
        return Files.readAllBytes(file.toPath());
    }

    /* renamed from: l */
    public static void m105271l(File file) {
        Objects.requireNonNull(file, "file");
        Files.delete(file.toPath());
    }

    /* renamed from: m */
    public static void m105272m(File file, File file2, List list, CopyOption... copyOptionArr) {
        File[] n = m105273n(file);
        Objects.requireNonNull(file2, "destDir");
        if (file2.exists()) {
            m105275p(file2, "destDir");
        }
        m105274o(file2);
        m105279t(file2, "destDir");
        for (File file3 : n) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    m105272m(file3, file4, list, copyOptionArr);
                } else {
                    m105263d(file3, file4, copyOptionArr);
                }
            }
        }
        Objects.requireNonNull(file, "sourceFile");
        Objects.requireNonNull(file2, "targetFile");
        if (!file2.isFile()) {
            long millis = Files.getLastModifiedTime((Path) Objects.requireNonNull(file.toPath(), "file"), new LinkOption[0]).toMillis();
            Objects.requireNonNull(file2, "file");
            if (!file2.setLastModified(millis)) {
                throw new IOException(String.format("Failed setLastModified(%s) on '%s'", new Object[]{Long.valueOf(millis), file2}));
            }
            return;
        }
        C71965i.m105247d(file2.toPath(), file.toPath());
    }

    /* renamed from: n */
    public static File[] m105273n(File file) {
        Objects.requireNonNull(file, "directory");
        if (file.exists()) {
            m105275p(file, "directory");
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                return listFiles;
            }
            new StringBuilder("Unknown I/O error listing contents of directory: ").append(file);
            throw new IOException("Unknown I/O error listing contents of directory: ".concat(String.valueOf(file)));
        }
        throw new IllegalArgumentException("File system element for parameter 'directory' does not exist: '" + file + "'");
    }

    /* renamed from: o */
    public static void m105274o(File file) {
        if (file != null && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create directory '" + file + "'.");
        }
    }

    /* renamed from: p */
    public static void m105275p(File file, String str) {
        Objects.requireNonNull(file, str);
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Parameter '" + str + "' is not a directory: '" + file + "'");
        }
    }

    /* renamed from: q */
    public static void m105276q(File file, String str) {
        Objects.requireNonNull(file, str);
        if (!file.exists()) {
            throw new FileNotFoundException("File system element for parameter '" + str + "' does not exist: '" + file + "'");
        }
    }

    /* renamed from: r */
    public static void m105277r(File file, String str) {
        Objects.requireNonNull(file, str);
        if (!file.isFile()) {
            throw new IllegalArgumentException("Parameter '" + str + "' is not a file: " + file);
        }
    }

    /* renamed from: s */
    public static void m105278s(File file, byte[] bArr, int i) {
        Path path = ((File) Objects.requireNonNull(file, "file")).toPath();
        LinkOption[] linkOptionArr = C71965i.f191666b;
        OpenOption[] openOptionArr = C71965i.f191665a;
        if (!C71965i.m105248e(path, linkOptionArr)) {
            FileAttribute[] fileAttributeArr = new FileAttribute[0];
            Path a = C71965i.m105244a(path);
            if (LinkOption.NOFOLLOW_LINKS != null) {
                if (a == null) {
                    a = null;
                } else if (Files.isSymbolicLink(a)) {
                    a = Files.readSymbolicLink(a);
                }
            }
            if (a != null) {
                Files.createDirectories(a, fileAttributeArr);
            }
        }
        if (openOptionArr == null) {
            openOptionArr = C71965i.f191668d;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(openOptionArr));
        if (linkOptionArr == null) {
            linkOptionArr = C71965i.f191666b;
        }
        arrayList.addAll(Arrays.asList(linkOptionArr));
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) arrayList.toArray(C71965i.f191668d));
        try {
            newOutputStream.write(bArr, 0, i);
            if (newOutputStream != null) {
                newOutputStream.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C71975c.m105259a(th, th);
        }
        throw th;
    }

    /* renamed from: t */
    private static void m105279t(File file, String str) {
        Objects.requireNonNull(file, "file");
        if (!file.canWrite()) {
            throw new IllegalArgumentException("File parameter '" + str + " is not writable: '" + file + "'");
        }
    }
}
