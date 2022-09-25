package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.s */
/* compiled from: PG */
public final /* synthetic */ class C126858s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126780ar f349332a;

    public /* synthetic */ C126858s(C126780ar arVar) {
        this.f349332a = arVar;
    }

    public final C60870cx apply(Object obj) {
        C126780ar arVar = this.f349332a;
        arVar.f349132k = (C119834cb) obj;
        arVar.f349133l.ifPresent(C126856q.f349330a);
        arVar.f349133l = Optional.empty();
        return C2169h.m6027a(new C126857r(arVar));
    }
}
