package com.google.android.apps.gsa.staticplugins.p7613bw;

import android.content.IntentFilter;
import androidx.p128m.p129a.C2399d;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bw.c */
/* compiled from: PG */
public final /* synthetic */ class C97306c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97309f f271741a;

    /* renamed from: b */
    public final /* synthetic */ C2399d f271742b;

    public /* synthetic */ C97306c(C97309f fVar, C2399d dVar) {
        this.f271741a = fVar;
        this.f271742b = dVar;
    }

    public final void run() {
        C97309f fVar = this.f271741a;
        C2399d dVar = this.f271742b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("MediaControlWorker.ACTION_MEDIA_CONTROL_COMMAND");
        dVar.mo5803b(fVar.f271753i, intentFilter);
    }
}
