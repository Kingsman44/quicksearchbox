package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.p098j.C2043bi;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.bottomsheet.i */
/* compiled from: PG */
final class C44558i {

    /* renamed from: a */
    public int f115941a;

    /* renamed from: b */
    public boolean f115942b;

    /* renamed from: c */
    final /* synthetic */ BottomSheetBehavior f115943c;

    /* renamed from: d */
    private final Runnable f115944d = new C44557h(this);

    public C44558i(BottomSheetBehavior bottomSheetBehavior) {
        this.f115943c = bottomSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47536a(int i) {
        WeakReference weakReference = this.f115943c.f115867J;
        if (weakReference != null && weakReference.get() != null) {
            this.f115941a = i;
            if (!this.f115942b) {
                C2043bi.m5520N((View) this.f115943c.f115867J.get(), this.f115944d);
                this.f115942b = true;
            }
        }
    }
}
