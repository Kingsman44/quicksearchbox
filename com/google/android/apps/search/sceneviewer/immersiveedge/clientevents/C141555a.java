package com.google.android.apps.search.sceneviewer.immersiveedge.clientevents;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.a */
/* compiled from: PG */
public final /* synthetic */ class C141555a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141556b f384222a;

    /* renamed from: b */
    public final /* synthetic */ Uri f384223b;

    public /* synthetic */ C141555a(C141556b bVar, Uri uri) {
        this.f384222a = bVar;
        this.f384223b = uri;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C47810es.m84979s(this.f384222a.f384224a, new Intent("android.intent.action.VIEW", this.f384223b));
    }
}
