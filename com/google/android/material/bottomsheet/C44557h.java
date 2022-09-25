package com.google.android.material.bottomsheet;

import androidx.customview.p103b.C2150h;

/* renamed from: com.google.android.material.bottomsheet.h */
/* compiled from: PG */
final class C44557h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C44558i f115940a;

    public C44557h(C44558i iVar) {
        this.f115940a = iVar;
    }

    public final void run() {
        C44558i iVar = this.f115940a;
        iVar.f115942b = false;
        C2150h hVar = iVar.f115943c.f115864G;
        if (hVar == null || !hVar.mo5415l()) {
            C44558i iVar2 = this.f115940a;
            BottomSheetBehavior bottomSheetBehavior = iVar2.f115943c;
            if (bottomSheetBehavior.f115862E == 2) {
                bottomSheetBehavior.mo47512J(iVar2.f115941a);
                return;
            }
            return;
        }
        C44558i iVar3 = this.f115940a;
        iVar3.mo47536a(iVar3.f115941a);
    }
}
