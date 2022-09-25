package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import androidx.media3.common.C2590aq;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.exoplayer.p145h.C3034aq;
import androidx.media3.exoplayer.p145h.C3036as;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.exoplayer.p145h.C3115j;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.y */
/* compiled from: PG */
public final class C105830y extends C3115j {

    /* renamed from: a */
    public final C60870cx f295228a;

    /* renamed from: b */
    public final int f295229b;

    /* renamed from: c */
    public C58833ax f295230c;

    /* renamed from: d */
    public final C105824s f295231d;

    /* renamed from: e */
    private final C2590aq f295232e;

    /* renamed from: f */
    private C58833ax f295233f;

    public C105830y(C60870cx cxVar, C2590aq aqVar, int i, C105824s sVar) {
        C58836b bVar = C58836b.f156633a;
        this.f295233f = bVar;
        this.f295230c = bVar;
        this.f295228a = cxVar;
        this.f295232e = aqVar;
        this.f295229b = i;
        this.f295231d = sVar;
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f295233f.mo56113h() ? ((C3038au) this.f295233f.mo56107c()).mo6745a() : this.f295232e;
    }

    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        super.mo6750f(anVar);
        C58833ax k = C58833ax.m90834k(new C3086bx(new C105827v(this), C105828w.f295225a).mo6760b(this.f295232e));
        this.f295233f = k;
        mo7104k((Object) null, (C3038au) k.mo56107c());
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        C58838bb.m90883r(this.f295233f.mo56113h());
        ((C3038au) this.f295233f.mo56107c()).mo6752h(aqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo6964j(Object obj, C3038au auVar, C2651bm bmVar) {
        C62910ar arVar;
        Void voidR = (Void) obj;
        if (bmVar.mo6024e(0, new C2650bl(), 0).f7349n == -9223372036854775807L) {
            if (!this.f295230c.mo56113h()) {
                arVar = C62948a.f169987b;
            } else {
                C2650bl blVar = new C2650bl();
                ((C2651bm) this.f295230c.mo56107c()).mo6024e(0, blVar, 0);
                long j = blVar.f7349n;
                if (j == -9223372036854775807L) {
                    arVar = C62948a.f169987b;
                } else {
                    arVar = C62948a.m95458i(j);
                }
            }
            this.f295230c = C58833ax.m90834k(new C105829x(bmVar, arVar));
        } else {
            this.f295230c = C58833ax.m90834k(bmVar);
        }
        mo6952y((C2651bm) this.f295230c.mo56107c());
    }

    /* renamed from: m */
    public final C3034aq mo6757m(C3036as asVar, C3241g gVar, long j) {
        C58838bb.m90883r(this.f295233f.mo56113h());
        return ((C3038au) this.f295233f.mo56107c()).mo6757m(asVar, gVar, j);
    }
}
