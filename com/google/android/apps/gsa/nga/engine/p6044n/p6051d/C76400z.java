package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.z */
/* compiled from: PG */
public final /* synthetic */ class C76400z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C76363at f211540a;

    /* renamed from: b */
    public final /* synthetic */ Map f211541b;

    public /* synthetic */ C76400z(C76363at atVar, Map map) {
        this.f211540a = atVar;
        this.f211541b = map;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C76363at atVar = this.f211540a;
        Map map = this.f211541b;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            ((C58970a) ((C58970a) C76363at.f211461a.mo56226d()).mo56372aa(3546)).mo56386p("Answer from OPA has empty requestId, ignoring.");
        } else {
            atVar.f211466e.mo72182c(str, (C58495hd) Collection.EL.stream(map.entrySet()).collect(C58370cn.m89403c(C76352ai.f211449a, new C76353aj(atVar), C76354ak.f211451a)));
        }
    }
}
