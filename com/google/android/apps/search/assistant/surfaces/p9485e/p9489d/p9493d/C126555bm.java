package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d;

import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a.C17341i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a.C17342j;
import com.google.android.libraries.search.assistant.p2511d.C32550m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.d.bm */
/* compiled from: PG */
final class C126555bm extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C69644aa f348521a;

    /* renamed from: b */
    final /* synthetic */ C126557bo f348522b;

    /* renamed from: c */
    final /* synthetic */ C71422aw f348523c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126555bm(C69644aa aaVar, C126557bo boVar, C71422aw awVar) {
        super(0);
        this.f348521a = aaVar;
        this.f348522b = boVar;
        this.f348523c = awVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        if (this.f348521a.f186023a) {
            C17342j jVar = this.f348522b.f348533c;
            return C32550m.m60364a(C47630c.m84724a(new C17341i(jVar, C126557bo.f348531a), jVar.f50184a), this.f348523c);
        }
        throw new IllegalStateException("Trying to create player without TTS response");
    }
}
