package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p6976ag.p6978b.C89106a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.continuation.j */
/* compiled from: PG */
public final class C108508j implements C89106a {

    /* renamed from: a */
    public static final C58974d f301909a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f301910b;

    /* renamed from: c */
    public ViewGroup f301911c = null;

    /* renamed from: d */
    public AcpPlateLayout f301912d = null;

    /* renamed from: e */
    public View f301913e = null;

    /* renamed from: f */
    public View f301914f = null;

    /* renamed from: g */
    public View f301915g = null;

    /* renamed from: h */
    public C60870cx f301916h = C60856cj.m92898g();

    public C108508j(C22871g gVar) {
        this.f301910b = gVar;
    }

    /* renamed from: a */
    public final void mo96944a(Context context, Intent intent) {
        AcpPlateLayout acpPlateLayout = this.f301912d;
        if (acpPlateLayout != null) {
            acpPlateLayout.mo96934a();
        }
        this.f301910b.mo28213m("handleDeepLink", 150, new C108507i(context, intent));
    }
}
