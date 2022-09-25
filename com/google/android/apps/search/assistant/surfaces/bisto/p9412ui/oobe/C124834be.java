package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.be */
/* compiled from: PG */
public final /* synthetic */ class C124834be implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C124838bi f344404a;

    public /* synthetic */ C124834be(C124838bi biVar) {
        this.f344404a = biVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C124838bi biVar = this.f344404a;
        C124920q qVar = new C124920q("BackButton");
        View e = biVar.f344409b.mo1322k().mo1177e(16908290);
        C58838bb.m90866a(e, "Activity must have content view to send an event!");
        C47393f.m84238i(R.id.tiktok_event_activity_listeners, qVar, e);
    }
}
