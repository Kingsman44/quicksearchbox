package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.btpermission;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124920q;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.btpermission.b */
/* compiled from: PG */
public final /* synthetic */ class C124778b implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C124779c f344212a;

    public /* synthetic */ C124778b(C124779c cVar) {
        this.f344212a = cVar;
    }

    public final void onActivityResult(Object obj) {
        C124779c cVar = this.f344212a;
        if (((ActivityResult) obj).f2755a == -1) {
            C58976aa aaVar = C58975e.f156826a;
            cVar.mo106613a();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        cVar.f344214b.requireActivity().setResult(0);
        C47393f.m84237h(new C124920q("BluetoothEnable-Exit"), cVar.f344214b.requireView());
    }
}
