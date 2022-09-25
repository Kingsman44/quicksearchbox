package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9859d;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.d.c */
/* compiled from: PG */
final /* synthetic */ class C129881c implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129885g f356305a;

    public C129881c(C129885g gVar) {
        this.f356305a = gVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C129966q qVar = (C129966q) obj;
        C129885g gVar = this.f356305a;
        if (qVar != null) {
            String str = qVar.f356471d;
            C69664n.m101060f(str, "state.sourceLocale");
            gVar.f356315g = str;
            String str2 = qVar.f356472e;
            C69664n.m101060f(str2, "state.targetLocale");
            gVar.f356316h = str2;
            C129918b a = C129918b.m212112a(qVar.f356473f);
            if (a == null) {
                a = C129918b.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                gVar.mo109320c().setTextColor(gVar.mo109318a());
                gVar.mo109322e().setTextColor(gVar.mo109319b());
                gVar.mo109321d().setTextColor(gVar.mo109319b());
            } else if (ordinal == 2) {
                gVar.mo109322e().setTextColor(gVar.mo109318a());
                gVar.mo109320c().setTextColor(gVar.mo109319b());
                gVar.mo109321d().setTextColor(gVar.mo109319b());
            } else if (ordinal == 3) {
                gVar.mo109321d().setTextColor(gVar.mo109318a());
                gVar.mo109322e().setTextColor(gVar.mo109319b());
                gVar.mo109320c().setTextColor(gVar.mo109319b());
            }
        }
    }
}
