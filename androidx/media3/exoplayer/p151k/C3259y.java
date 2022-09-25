package androidx.media3.exoplayer.p151k;

import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2507k;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import java.util.Collections;

/* renamed from: androidx.media3.exoplayer.k.y */
/* compiled from: PG */
public final class C3259y implements C3252r {

    /* renamed from: a */
    public final long f9791a = C3027aj.f8771a.getAndIncrement();

    /* renamed from: b */
    public final C2510n f9792b;

    /* renamed from: c */
    public final int f9793c;

    /* renamed from: d */
    public final C2493al f9794d;

    /* renamed from: e */
    public volatile Object f9795e;

    /* renamed from: f */
    private final C3258x f9796f;

    public C3259y(C2505i iVar, Uri uri, int i, C3258x xVar) {
        C2510n a = C2509m.m6615a(uri, 0, Collections.emptyMap(), 0, -1, (String) null, 1);
        this.f9794d = new C2493al(iVar);
        this.f9792b = a;
        this.f9793c = i;
        this.f9796f = xVar;
    }

    /* renamed from: b */
    public final void mo6996b() {
    }

    /* renamed from: c */
    public final void mo6997c() {
        this.f9794d.f6845a = 0;
        C2507k kVar = new C2507k(this.f9794d, this.f9792b);
        try {
            kVar.mo5931a();
            Uri c = this.f9794d.mo5881c();
            c.getClass();
            this.f9795e = this.f9796f.mo6768a(c, kVar);
        } finally {
            C2612ak.m6941X(kVar);
        }
    }
}
