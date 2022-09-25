package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.bv */
/* compiled from: PG */
public final /* synthetic */ class C112769bv implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C112772by f312564a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f312565b;

    public /* synthetic */ C112769bv(C112772by byVar, C58485gu guVar) {
        this.f312564a = byVar;
        this.f312565b = guVar;
    }

    public final void onClick(View view) {
        C112772by byVar = this.f312564a;
        C58485gu guVar = this.f312565b;
        Context context = view.getContext();
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C112770bw.f312566a).collect(C58370cn.f155946a);
        if (!guVar2.isEmpty()) {
            C112775ca caVar = (C112775ca) byVar.f312587c.mo27525b();
            C112775ca.m186636a(context, new Intent("android.intent.action.VIEW", Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, ((C113321r) guVar2.get(0)).f313838e)));
        }
    }
}
