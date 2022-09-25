package androidx.media3.p132b;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.media3.b.al */
/* compiled from: PG */
public final class C2493al implements C2505i {

    /* renamed from: a */
    public long f6845a;

    /* renamed from: b */
    public Uri f6846b = Uri.EMPTY;

    /* renamed from: c */
    private final C2505i f6847c;

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        int a = this.f6847c.mo5879a(bArr, i, i2);
        if (a != -1) {
            this.f6845a += (long) a;
        }
        return a;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        this.f6846b = nVar.f6891a;
        Collections.emptyMap();
        long b = this.f6847c.mo5880b(nVar);
        Uri c = mo5881c();
        c.getClass();
        this.f6846b = c;
        mo5883e();
        return b;
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6847c.mo5881c();
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f6847c.mo5882d();
    }

    /* renamed from: e */
    public final Map mo5883e() {
        return this.f6847c.mo5883e();
    }

    public C2493al(C2505i iVar) {
        iVar.getClass();
        this.f6847c = iVar;
        Collections.emptyMap();
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        anVar.getClass();
        this.f6847c.mo5884f(anVar);
    }
}
