package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50073jo;
import com.google.assistant.p3861at.C50077js;
import com.google.assistant.p3861at.acz;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62971cq;
import java.util.Collection;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.l */
/* compiled from: PG */
public final /* synthetic */ class C101558l implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101560n f283402a;

    /* renamed from: b */
    public final /* synthetic */ Collection f283403b;

    public /* synthetic */ C101558l(C101560n nVar, Collection collection) {
        this.f283402a = nVar;
        this.f283403b = collection;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C101560n nVar = this.f283402a;
        Collection collection = this.f283403b;
        C50077js jsVar = ((acz) obj).f129013b;
        if (jsVar == null) {
            jsVar = C50077js.f130196b;
        }
        C62971cq cqVar = jsVar.f130198a;
        if (!cqVar.isEmpty() && ((C50073jo) cqVar.get(0)).f130190a) {
            return nVar.f283408e.mo28209i(C60856cj.m92896e((Iterable) Collection.EL.stream(collection).map(new C101551e(nVar)).collect(C58370cn.f155946a)), "merge all AccountLinkStates", C101552f.f283394a);
        }
        ((C59052c) ((C59052c) C101560n.f283404a.mo56225c()).mo56372aa(20340)).mo56386p("#handleAccountLinkSettingsUpdateResult - no update received.");
        return C60856cj.m92900i(C101548b.LINK_ACCOUNT_FAILED);
    }
}
