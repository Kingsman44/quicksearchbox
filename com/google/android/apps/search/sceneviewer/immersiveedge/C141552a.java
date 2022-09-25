package com.google.android.apps.search.sceneviewer.immersiveedge;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.a */
/* compiled from: PG */
public final /* synthetic */ class C141552a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141553b f384211a;

    /* renamed from: b */
    public final /* synthetic */ Uri f384212b;

    public /* synthetic */ C141552a(C141553b bVar, Uri uri) {
        this.f384211a = bVar;
        this.f384212b = uri;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f384211a.getContext().startActivity(new Intent("android.intent.action.VIEW", this.f384212b));
    }
}
