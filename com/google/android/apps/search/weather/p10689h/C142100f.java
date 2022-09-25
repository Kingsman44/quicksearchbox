package com.google.android.apps.search.weather.p10689h;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.search.weather.h.f */
/* compiled from: PG */
public final /* synthetic */ class C142100f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C142102h f385518a;

    public /* synthetic */ C142100f(C142102h hVar) {
        this.f385518a = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C142102h hVar = this.f385518a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        hVar.f385523d = z;
    }
}
