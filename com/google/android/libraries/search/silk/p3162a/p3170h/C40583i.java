package com.google.android.libraries.search.silk.p3162a.p3170h;

import androidx.activity.result.C0815b;

/* renamed from: com.google.android.libraries.search.silk.a.h.i */
/* compiled from: PG */
public final /* synthetic */ class C40583i implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C40586l f106513a;

    public /* synthetic */ C40583i(C40586l lVar) {
        this.f106513a = lVar;
    }

    public final void onActivityResult(Object obj) {
        C40586l lVar = this.f106513a;
        if (((Integer) obj).intValue() == 2) {
            lVar.mo42534a().mo42537b(C40594r.CAN_ACCESS_LOCATION);
            return;
        }
        lVar.mo42534a().mo42537b(C40594r.CANNOT_ACCESS_LOCATION);
    }
}
