package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.j */
/* compiled from: PG */
public final class C102179j {

    /* renamed from: a */
    public static final C59071e f285050a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.j");

    /* renamed from: b */
    public final C102178i f285051b;

    /* renamed from: c */
    public final C101781u f285052c;

    /* renamed from: d */
    public final C102170bn f285053d;

    /* renamed from: e */
    public C102169bm f285054e = C102169bm.NONE;

    public C102179j(C102178i iVar, C101781u uVar, C102170bn bnVar) {
        this.f285051b = iVar;
        this.f285052c = uVar;
        this.f285053d = bnVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo92930a() {
        FragmentManager childFragmentManager = this.f285051b.getChildFragmentManager();
        if (childFragmentManager != null) {
            return childFragmentManager.f634a.mo670b(R.id.fedhot_vaa_controller_fragment);
        }
        ((C59052c) ((C59052c) f285050a.mo56225c()).mo56372aa(20552)).mo56386p("ChildFragmentManager of fedHotOrVaaParentFragment is null!");
        return null;
    }
}
