package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p682e.p683a;

import android.app.DirectAction;
import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.assistant.p1484g.p1502d.C18155ag;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.e.a.e */
/* compiled from: PG */
public final /* synthetic */ class C11641e implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ Optional f37604a;

    /* renamed from: b */
    public final /* synthetic */ DirectAction f37605b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f37606c;

    public /* synthetic */ C11641e(Optional optional, DirectAction directAction, Bundle bundle) {
        this.f37604a = optional;
        this.f37605b = directAction;
        this.f37606c = bundle;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        Optional optional = this.f37604a;
        ((C18155ag) optional.get()).mo23639e(this.f37605b, this.f37606c, new C11644h(cVar));
        return "IGearheadDirectActionProxy.performDirectAction";
    }
}
