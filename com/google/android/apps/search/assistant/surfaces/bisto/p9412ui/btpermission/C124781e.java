package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.btpermission;

import androidx.activity.result.C0815b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124920q;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.btpermission.e */
/* compiled from: PG */
public final /* synthetic */ class C124781e implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C124782f f344220a;

    public /* synthetic */ C124781e(C124782f fVar) {
        this.f344220a = fVar;
    }

    public final void onActivityResult(Object obj) {
        C124782f fVar = this.f344220a;
        C58800sl lA = C58495hd.m89898l((Map) obj).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                C59104x c = C124782f.f344221a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BTPermissionFragment");
                ((C59052c) ((C59052c) c).mo56372aa(36311)).mo56389s("Permission not granted for: %s", entry.getKey());
                fVar.f344222b.requireActivity().setResult(0);
                C47393f.m84237h(new C124920q("BluetoothPermission-Exit"), fVar.f344222b.requireView());
                return;
            }
        }
        fVar.mo106614a();
    }
}
