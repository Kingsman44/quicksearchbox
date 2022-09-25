package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Context;
import android.content.Intent;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bi */
/* compiled from: PG */
public final class C110350bi extends C110369ca {
    public C110350bi(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        super(context, aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo98583a(Intent intent) {
        intent.putExtra("use_charging", true);
        intent.setFlags(intent.getFlags() & -268468225);
    }
}
