package com.google.android.apps.gsa.staticplugins.p7385ak;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.d */
/* compiled from: PG */
public final /* synthetic */ class C93899d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93914s f262244a;

    public /* synthetic */ C93899d(C93914s sVar) {
        this.f262244a = sVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93914s sVar = this.f262244a;
        List list = (List) obj;
        C58976aa aaVar = C58975e.f156826a;
        String F = sVar.f262267b.mo79659F();
        if (TextUtils.isEmpty(F)) {
            C59104x b = C93914s.f262266a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceAppInfoWork");
            ((C59052c) ((C59052c) b).mo56372aa(19301)).mo56386p("not active account, do not update cache cached apps delta");
            return C118826c.f331423b;
        }
        return sVar.f262270g.mo28209i(sVar.f262270g.mo28210j(sVar.f262269f.b(), "[DeviceAppInfoWorker]GetGeller", new C93907l(F)), "[DeviceAppInfoWorker]MaybeUpdateCachedAppsDelta", new C93908m(sVar, F));
    }
}
