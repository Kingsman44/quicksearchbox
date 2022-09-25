package com.google.android.libraries.lens.view.p2159q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.mdi.C29690f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.lens.view.q.ay */
/* compiled from: PG */
final class C27604ay implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24471z f75417a;

    /* renamed from: b */
    final /* synthetic */ C24450e f75418b;

    /* renamed from: c */
    final /* synthetic */ boolean f75419c;

    /* renamed from: d */
    final /* synthetic */ String f75420d;

    /* renamed from: e */
    final /* synthetic */ C24465t f75421e;

    /* renamed from: f */
    final /* synthetic */ C27608bb f75422f;

    public C27604ay(C27608bb bbVar, C24471z zVar, C24450e eVar, boolean z, String str, C24465t tVar) {
        this.f75422f = bbVar;
        this.f75417a = zVar;
        this.f75418b = eVar;
        this.f75419c = z;
        this.f75420d = str;
        this.f75421e = tVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C27608bb.f75425a.mo56226d()).mo56382g(th)).mo56372aa(49317)).mo56389s("download failed for %s", this.f75421e.f66967b);
        this.f75422f.mo33132h(this.f75417a, this.f75418b, this.f75419c, true != (th instanceof CancellationException) ? 3 : 4);
        C27608bb bbVar = this.f75422f;
        String str = (String) bbVar.f75438n.mo31240b().mo55367b().getOrDefault(this.f75421e.f66967b, BuildConfig.FLAVOR);
        if (!str.isEmpty()) {
            C60856cj.m92911t(bbVar.f75436l.mo46039a(new C27581ab(str), bbVar.f75433i), C47810es.m84974n(new C27605az(str)), bbVar.f75433i);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            C58974d dVar = C27608bb.f75425a;
            this.f75422f.mo33132h(this.f75417a, this.f75418b, this.f75419c, 1);
            return;
        }
        if (this.f75420d.isEmpty()) {
            C58974d dVar2 = C27608bb.f75425a;
        } else {
            C58974d dVar3 = C27608bb.f75425a;
        }
        C27608bb bbVar = this.f75422f;
        C24465t tVar = this.f75421e;
        C24450e eVar = this.f75418b;
        C24446ah a = C24446ah.m45519a(bbVar.mo33130f(fVar, tVar).f66922d);
        if (a == null) {
            a = C24446ah.STATUS_UNKNOWN;
        }
        if (a == C24446ah.STATUS_MODEL_CONFIG_INCORRECT) {
            C27608bb.m51392i(eVar, C27608bb.m51390d(tVar, 2));
            return;
        }
        C27608bb.m51392i(eVar, C27608bb.m51391e(tVar, 2));
        bbVar.f75439o.remove(tVar.f66967b);
    }
}
