package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Intent;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.u */
/* compiled from: PG */
public final /* synthetic */ class C118682u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f331077a;

    public /* synthetic */ C118682u(boolean z) {
        this.f331077a = z;
    }

    public final Object apply(Object obj) {
        Intent intent = (Intent) obj;
        intent.putExtra("IS_VISIBLE", this.f331077a);
        return intent;
    }
}
