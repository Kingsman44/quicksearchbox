package com.google.android.libraries.lens.view.main;

import android.support.p031v4.app.FragmentManager;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.main.br */
/* compiled from: PG */
public final class C27328br {
    /* renamed from: a */
    public static C27384dt m50923a(FragmentManager fragmentManager) {
        C27292ai aiVar = (C27292ai) fragmentManager.f634a.mo671c("main_fragment");
        C58838bb.m90866a(aiVar, "attempt to inject MainFragmentPeer too early; use Lazy<> injection");
        return aiVar.mo17754z();
    }
}
