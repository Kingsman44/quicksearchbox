package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p682e.p683a;

import android.app.DirectAction;
import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C11637a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ DirectAction f37599a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f37600b;

    public /* synthetic */ C11637a(DirectAction directAction, Bundle bundle) {
        this.f37599a = directAction;
        this.f37600b = bundle;
    }

    public final C60870cx apply(Object obj) {
        DirectAction directAction = this.f37599a;
        Bundle bundle = this.f37600b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60856cj.m92899h(new Exception("Failed to get GearheadDirectActionProxy"));
        }
        return C2169h.m6027a(new C11641e(optional, directAction, bundle));
    }
}
