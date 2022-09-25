package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.c */
/* compiled from: PG */
public final class C96123c extends C83907bm {

    /* renamed from: b */
    public static final /* synthetic */ int f269104b = 0;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        getActivity();
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            arguments.getClass();
            if (arguments.containsKey("id")) {
                Parcelable parcelable = arguments.getParcelable("id");
                parcelable.getClass();
                C83915b bVar = (C83915b) ((ProtoLiteParcelable) parcelable).mo84191d(C83915b.f228541j.getParserForType());
                if (bVar != null) {
                    new AlertDialog.Builder(getActivity()).setMessage(bVar.f228546d).setPositiveButton(bVar.f228548f, C96059a.f268976a).setOnDismissListener(new C96096b(this)).create().show();
                    return null;
                }
            }
        }
        mo77318iT().mo77313b();
        return null;
    }
}
