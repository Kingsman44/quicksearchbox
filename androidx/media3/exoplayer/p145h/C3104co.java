package androidx.media3.exoplayer.p145h;

import android.net.Uri;
import androidx.media3.common.C2576ac;
import androidx.media3.common.C2589ap;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.exoplayer.p151k.C3253s;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2504h;
import androidx.media3.p132b.C2509m;
import androidx.media3.p132b.C2510n;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;

/* renamed from: androidx.media3.exoplayer.h.co */
/* compiled from: PG */
public final class C3104co extends C3005a {

    /* renamed from: a */
    private final C2510n f9099a;

    /* renamed from: b */
    private final C2504h f9100b;

    /* renamed from: c */
    private final C2680x f9101c;

    /* renamed from: d */
    private final C2651bm f9102d;

    /* renamed from: e */
    private final C2590aq f9103e;

    /* renamed from: f */
    private C2495an f9104f;

    public C3104co(C2589ap apVar, C2504h hVar) {
        C2589ap apVar2 = apVar;
        this.f9100b = hVar;
        C2576ac acVar = new C2576ac();
        acVar.f7104b = Uri.EMPTY;
        String uri = apVar2.f7145a.toString();
        uri.getClass();
        acVar.f7103a = uri;
        acVar.f7106d = C58485gu.m89842j(C58485gu.m89846n(apVar));
        acVar.f7107e = null;
        C2590aq a = acVar.mo6082a();
        this.f9103e = a;
        C2679w wVar = new C2679w();
        wVar.f7459k = apVar2.f7146b;
        wVar.f7451c = apVar2.f7147c;
        int i = apVar2.f7148d;
        wVar.f7452d = 1;
        int i2 = apVar2.f7149e;
        wVar.f7453e = 0;
        String str = apVar2.f7150f;
        wVar.f7450b = null;
        String str2 = apVar2.f7151g;
        wVar.f7449a = null;
        this.f9101c = new C2680x(wVar);
        this.f9099a = C2509m.m6615a(apVar2.f7145a, 0, Collections.emptyMap(), 0, -1, (String) null, 1);
        this.f9102d = new C3099cj(-9223372036854775807L, true, false, a);
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f9103e;
    }

    /* renamed from: c */
    public final void mo6747c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        this.f9104f = anVar;
        mo6952y(this.f9102d);
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        ((C3102cm) aqVar).f9089b.mo7251d((C3253s) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6753i() {
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        return new C3102cm(this.f9099a, this.f9100b, this.f9104f, this.f9101c, mo6944q(asVar));
    }
}
