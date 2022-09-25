package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ce */
/* compiled from: PG */
public final /* synthetic */ class C108875ce implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108877cg f302725a;

    /* renamed from: b */
    public final /* synthetic */ Context f302726b;

    public /* synthetic */ C108875ce(C108877cg cgVar, Context context) {
        this.f302725a = cgVar;
        this.f302726b = context;
    }

    public final void onClick(View view) {
        C108877cg cgVar = this.f302725a;
        Context context = this.f302726b;
        C83395k.m132733d(context);
        Intent c = C83395k.m132732c(context);
        if (c == null) {
            ((C59052c) ((C59052c) C108877cg.f302728b.mo56226d()).mo56372aa(24408)).mo56386p("Intent is null: notification listener permission activity could not be resolved");
        } else {
            cgVar.startActivity(c);
        }
        cgVar.mo77318iT().mo77312a();
    }
}
