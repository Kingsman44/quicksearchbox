package com.google.apps.tiktok.contrib.p3629c;

import android.app.Dialog;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.Window;
import androidx.navigation.C3836bd;
import androidx.navigation.C3863cd;
import androidx.navigation.fragment.C3884h;
import com.google.common.base.C58881cr;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.contrib.c.d */
/* compiled from: PG */
public final /* synthetic */ class C46483d implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Fragment f121630a;

    public /* synthetic */ C46483d(Fragment fragment) {
        this.f121630a = fragment;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Dialog dialog;
        Window window;
        Fragment fragment = this.f121630a;
        C69664n.m101061g(fragment, "fragment");
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof C3884h) {
                C3836bd bdVar = ((C3884h) fragment2).f12461a;
                if (bdVar != null) {
                    return bdVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().f650q;
            if (fragment3 instanceof C3884h) {
                C3836bd bdVar2 = ((C3884h) fragment3).f12461a;
                if (bdVar2 != null) {
                    return bdVar2;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return C3863cd.m11146a(view);
        }
        View view2 = null;
        C0260w wVar = fragment instanceof C0260w ? (C0260w) fragment : null;
        if (!(wVar == null || (dialog = wVar.getDialog()) == null || (window = dialog.getWindow()) == null)) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return C3863cd.m11146a(view2);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }
}
