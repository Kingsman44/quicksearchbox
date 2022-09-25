package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.assistant.p3897e.p3921j.C52648zn;
import com.google.assistant.p3897e.p3921j.C52651zq;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.gsa.conversation.g.aq */
/* compiled from: PG */
public final /* synthetic */ class C22630aq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62334a;

    /* renamed from: b */
    public final /* synthetic */ C22668l f62335b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f62336c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f62337d;

    /* renamed from: e */
    public final /* synthetic */ C22618ae f62338e;

    public /* synthetic */ C22630aq(C22654bn bnVar, C22668l lVar, C60870cx cxVar, C60870cx cxVar2, C22618ae aeVar) {
        this.f62334a = bnVar;
        this.f62335b = lVar;
        this.f62336c = cxVar;
        this.f62337d = cxVar2;
        this.f62338e = aeVar;
    }

    public final Object call() {
        boolean z;
        int a;
        C22654bn bnVar = this.f62334a;
        C22668l lVar = this.f62335b;
        C60870cx cxVar = this.f62336c;
        C60870cx cxVar2 = this.f62337d;
        C22618ae aeVar = this.f62338e;
        if (lVar != bnVar.f62413k) {
            return C118826c.f331422a;
        }
        boolean z2 = false;
        List d = lVar.mo27781d(false);
        bnVar.f62413k = null;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        C52654zt ztVar = (C52654zt) C60856cj.m92909r(cxVar2);
        if (bnVar.f62416n) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (bnVar.mo27774p(d)) {
            int b = C52648zn.m86683b(ztVar.f138236b);
            if (b != 0 && b == 2 && (a = C52651zq.m86684a(ztVar.f138237c)) != 0 && a == 2) {
                z = true;
            } else {
                z = false;
            }
            if (bnVar.f62408f.mo27806g() || !z) {
                bnVar.mo27767h(C58836b.f156633a, aeVar);
                z2 = true;
            }
        }
        bnVar.mo27772n(aeVar, z2, booleanValue);
        return C118826c.f331422a;
    }
}
