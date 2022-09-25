package androidx.media3.common.p136b;

import java.io.File;

/* renamed from: androidx.media3.common.b.b */
/* compiled from: PG */
public final class C2614b {

    /* renamed from: a */
    public final File f7264a;

    /* renamed from: b */
    public final File f7265b;

    public C2614b(File file) {
        this.f7264a = file;
        this.f7265b = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    /* renamed from: a */
    public final void mo6187a() {
        this.f7264a.delete();
        this.f7265b.delete();
    }

    /* renamed from: b */
    public final boolean mo6188b() {
        return this.f7264a.exists() || this.f7265b.exists();
    }
}
