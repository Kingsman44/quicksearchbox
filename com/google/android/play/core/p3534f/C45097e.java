package com.google.android.play.core.p3534f;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.f.e */
/* compiled from: PG */
public final class C45097e {

    /* renamed from: a */
    private final long f117758a;

    /* renamed from: b */
    private final Context f117759b;

    /* renamed from: c */
    private File f117760c;

    public C45097e(Context context) {
        this.f117759b = context;
        this.f117758a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: a */
    public static File m80266a(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: h */
    public static String m80267h(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: k */
    public static void m80268k(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File k : listFiles) {
                m80268k(k);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: l */
    public static void m80269l(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    /* renamed from: m */
    public static boolean m80270m(File file) {
        return !file.canWrite();
    }

    /* renamed from: n */
    public static void m80271n(File file) {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: o */
    private final File m80272o() {
        if (this.f117760c == null) {
            Context context = this.f117759b;
            if (context != null) {
                this.f117760c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f117760c, "splitcompat");
        m80271n(file);
        return file;
    }

    /* renamed from: b */
    public final File mo48929b() {
        File file = new File(mo48934g(), "native-libraries");
        m80271n(file);
        return file;
    }

    /* renamed from: c */
    public final File mo48930c(String str) {
        File a = m80266a(mo48929b(), str);
        m80271n(a);
        return a;
    }

    /* renamed from: d */
    public final File mo48931d() {
        File file = new File(mo48934g(), "unverified-splits");
        m80271n(file);
        return file;
    }

    /* renamed from: e */
    public final File mo48932e() {
        File file = new File(mo48934g(), "verified-splits");
        m80271n(file);
        return file;
    }

    /* renamed from: f */
    public final File mo48933f(String str) {
        return m80266a(mo48932e(), m80267h(str));
    }

    /* renamed from: g */
    public final File mo48934g() {
        File file = new File(m80272o(), Long.toString(this.f117758a));
        m80271n(file);
        return file;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Set mo48935i() {
        File e = mo48932e();
        HashSet hashSet = new HashSet();
        File[] listFiles = e.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && m80270m(file)) {
                    String name = file.getName();
                    hashSet.add(new C45087b(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: j */
    public final void mo48936j() {
        File o = m80272o();
        String[] list = o.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f117758a))) {
                    File file = new File(o, str);
                    Log.d("SplitCompat", "FileStorage: removing directory for different version code (directory = " + file.toString() + ", current version code = " + this.f117758a + ")");
                    m80268k(file);
                }
            }
        }
    }
}
