package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125131de;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126232bs;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126233bt;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.x */
/* compiled from: PG */
public final /* synthetic */ class C125420x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125374ab f345893a;

    /* renamed from: b */
    public final /* synthetic */ C125131de f345894b;

    public /* synthetic */ C125420x(C125374ab abVar, C125131de deVar) {
        this.f345893a = abVar;
        this.f345894b = deVar;
    }

    public final void accept(Object obj) {
        C125374ab abVar = this.f345893a;
        C125131de deVar = this.f345894b;
        Void voidR = (Void) obj;
        if (deVar != null) {
            C126233bt btVar = abVar.f345784c;
            btVar.f347843d.execute(C47810es.m84977q(new C126232bs(btVar, deVar)));
        }
        if (!abVar.f345786e.get()) {
            C46459k.m82829b(abVar.f345789h.mo107566a(abVar.f345793l.mo107514g()), "Pre-warming speech alternatives cache failed. [SD]", new Object[0]);
            C46459k.m82829b(abVar.f345790i.mo106984a(abVar.f345793l.mo107514g()), "Pre-warming formatter cache failed. [SD]", new Object[0]);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
