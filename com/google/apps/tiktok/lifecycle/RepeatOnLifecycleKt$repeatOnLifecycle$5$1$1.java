package com.google.apps.tiktok.lifecycle;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71807q;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

/* compiled from: PG */
final class RepeatOnLifecycleKt$repeatOnLifecycle$5$1$1 implements C2389t {

    /* renamed from: a */
    final /* synthetic */ C2382m f123159a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f123160b;

    /* renamed from: c */
    final /* synthetic */ C71422aw f123161c;

    /* renamed from: d */
    final /* synthetic */ C2382m f123162d;

    /* renamed from: e */
    final /* synthetic */ C71807q f123163e;

    /* renamed from: f */
    final /* synthetic */ C71788b f123164f;

    /* renamed from: g */
    final /* synthetic */ C69630p f123165g;

    public RepeatOnLifecycleKt$repeatOnLifecycle$5$1$1(C2382m mVar, C69648ae aeVar, C71422aw awVar, C2382m mVar2, C71807q qVar, C71788b bVar, C69630p pVar) {
        this.f123159a = mVar;
        this.f123160b = aeVar;
        this.f123161c = awVar;
        this.f123162d = mVar2;
        this.f123163e = qVar;
        this.f123164f = bVar;
        this.f123165g = pVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        if (mVar == this.f123159a) {
            this.f123160b.f186027a = C71803m.m105043d(this.f123161c, (C69585o) null, (C71424ay) null, new C47419e(this.f123164f, this.f123165g, (C69577g) null), 3);
            return;
        }
        if (mVar == this.f123162d) {
            C71643cp cpVar = (C71643cp) this.f123160b.f186027a;
            if (cpVar != null) {
                cpVar.mo62723u((CancellationException) null);
            }
            this.f123160b.f186027a = null;
        }
        if (mVar == C2382m.ON_DESTROY) {
            this.f123163e.mo61338mb(C69788q.f186170a);
        }
    }
}
