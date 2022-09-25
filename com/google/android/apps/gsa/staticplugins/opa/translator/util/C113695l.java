package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.l */
/* compiled from: PG */
public final class C113695l {

    /* renamed from: a */
    final /* synthetic */ InterpreterInputButtonPlateView f314895a;

    public C113695l(InterpreterInputButtonPlateView interpreterInputButtonPlateView) {
        this.f314895a = interpreterInputButtonPlateView;
    }

    /* renamed from: a */
    public final View mo100528a(boolean z) {
        if (z) {
            return this.f314895a.mo100377f().mo100438a();
        }
        return this.f314895a.mo100374c().mo100393a();
    }

    /* renamed from: b */
    public final void mo100529b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f314895a.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: c */
    public final void mo100530c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f314895a.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
