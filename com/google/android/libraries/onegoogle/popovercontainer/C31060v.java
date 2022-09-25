package com.google.android.libraries.onegoogle.popovercontainer;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.v */
/* compiled from: PG */
public final /* synthetic */ class C31060v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f83650a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater f83651b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f83652c;

    /* renamed from: d */
    public final /* synthetic */ FrameLayout f83653d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f83654e;

    public /* synthetic */ C31060v(C31036ak akVar, LayoutInflater layoutInflater, ViewGroup viewGroup, FrameLayout frameLayout, Bundle bundle) {
        this.f83650a = akVar;
        this.f83651b = layoutInflater;
        this.f83652c = viewGroup;
        this.f83653d = frameLayout;
        this.f83654e = bundle;
    }

    public final void run() {
        C31036ak akVar = this.f83650a;
        LayoutInflater layoutInflater = this.f83651b;
        ViewGroup viewGroup = this.f83652c;
        FrameLayout frameLayout = this.f83653d;
        Bundle bundle = this.f83654e;
        C58838bb.m90884s(akVar.f83605i != null, "configuration can't be null after initialization.");
        ContextThemeWrapper d = ((C31041c) akVar.f83605i).f83624f.mo36585d(layoutInflater.getContext());
        if (akVar.getArguments() != null && akVar.getArguments().getBoolean("accountMenuFlavorsStyle", false)) {
            d = new ContextThemeWrapper(d, 2132149633);
        }
        if (akVar.getArguments() != null && akVar.getArguments().getBoolean("dialogCenteredStyle", false)) {
            d = new ContextThemeWrapper(d, 2132149640);
        }
        View inflate = LayoutInflater.from(d).inflate(R.layout.og_dialog, viewGroup, false);
        frameLayout.addView(inflate);
        ExpandableDialogView expandableDialogView = (ExpandableDialogView) inflate.findViewById(R.id.og_dialog_view);
        expandableDialogView.getClass();
        akVar.f83604h = expandableDialogView;
        ((C31041c) akVar.f83605i).f83619a.mo35894a(frameLayout);
        C31041c cVar = (C31041c) akVar.f83605i;
        boolean z = cVar.f83623e;
        ExpandableDialogView expandableDialogView2 = akVar.f83604h;
        expandableDialogView2.f83584l = cVar.f83625g;
        expandableDialogView2.mo35630b(cVar.f83622d);
        SparseArray sparseArray = null;
        Window window = akVar.getDialog() != null ? akVar.getDialog().getWindow() : null;
        ExpandableDialogView expandableDialogView3 = akVar.f83604h;
        expandableDialogView3.f83583k = window;
        expandableDialogView3.f83582j = new C31058t(akVar);
        akVar.getDialog().setOnKeyListener(new C31059u(akVar));
        C31039an anVar = akVar.f83603g;
        if (anVar != null) {
            akVar.mo36728a(anVar, akVar.f83604h);
            return;
        }
        if (bundle != null) {
            sparseArray = bundle.getSparseParcelableArray("viewHierarchyState");
        }
        akVar.f83602f = sparseArray;
    }
}
