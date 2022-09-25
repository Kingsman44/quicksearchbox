package com.google.android.libraries.surveys.internal.view;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.ab */
/* compiled from: PG */
public final /* synthetic */ class C43073ab implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112653a;

    public /* synthetic */ C43073ab(C43091at atVar) {
        this.f112653a = atVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C43091at atVar = this.f112653a;
        if (i != 4) {
            return false;
        }
        atVar.mo46154i(atVar.f112687d, atVar.f112696m, atVar.f112692i, C43066o.m75995p(atVar.f112690g));
        atVar.f112685b.dismissAllowingStateLoss();
        return atVar.f112695l;
    }
}
