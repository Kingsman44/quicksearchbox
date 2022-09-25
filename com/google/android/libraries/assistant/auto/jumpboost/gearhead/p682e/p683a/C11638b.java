package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p682e.p683a;

import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C11638b implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C11638b f37601a = new C11638b();

    private /* synthetic */ C11638b() {
    }

    public final C60870cx apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92899h(new Exception("Failed to get GearheadDirectActionProxy"));
        }
        return C2169h.m6027a(new C11639c(optional));
    }
}
