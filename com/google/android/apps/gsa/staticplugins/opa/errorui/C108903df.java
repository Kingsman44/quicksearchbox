package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.gsa.searchplate.p6963a.C88894d;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.df */
/* compiled from: PG */
final class C108903df extends C88894d {

    /* renamed from: a */
    final /* synthetic */ C108904dg f302786a;

    public C108903df(C108904dg dgVar) {
        this.f302786a = dgVar;
    }

    /* renamed from: g */
    public final void mo17637g() {
        Activity activity = this.f302786a.getActivity();
        if (activity != null) {
            Intent A = C89429a.m145439A(this.f302786a.getActivity(), "and.opa.disabled.text", "com.google.android.googlequicksearchbox.TEXT_ASSIST", true);
            A.putExtra("MIC_NOT_SUPPORTED", true);
            activity.startActivity(A);
        }
    }

    /* renamed from: t */
    public final void mo17650t() {
        Activity activity = this.f302786a.getActivity();
        if (activity != null) {
            activity.startActivity(C89429a.m145443a(activity, "and.opa.disabled.superg"));
        }
    }
}
