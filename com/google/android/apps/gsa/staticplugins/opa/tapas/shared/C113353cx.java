package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.graphics.drawable.Drawable;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cx */
/* compiled from: PG */
public final /* synthetic */ class C113353cx implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f313879a;

    public /* synthetic */ C113353cx(String str) {
        this.f313879a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f313879a;
        C59071e eVar = C113367dh.f313907a;
        return (Drawable) ((Optional) obj).orElseThrow(new C113349ct(str));
    }
}
