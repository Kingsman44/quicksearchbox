package com.google.android.libraries.p590as.p593b.p596b;

import android.os.Build;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.as.b.b.ba */
/* compiled from: PG */
public final class C10846ba {

    /* renamed from: a */
    public static final C58974d f35901a = C58974d.m91134h("LPRequestState");

    /* renamed from: b */
    public final C42876ab f35902b;

    /* renamed from: c */
    public final C60887da f35903c;

    /* renamed from: d */
    public final String f35904d;

    /* renamed from: e */
    public final boolean f35905e;

    public C10846ba(C42876ab abVar, C60887da daVar, String str, boolean z) {
        this.f35902b = abVar;
        this.f35903c = daVar;
        this.f35904d = str;
        this.f35905e = z;
    }

    /* renamed from: a */
    public final C60870cx mo19313a(C10879g gVar) {
        ((C58970a) ((C58970a) f35901a.mo56224b()).mo56372aa(53977)).mo56389s("[%s] #addRequest", this.f35904d);
        return this.f35902b.mo46039a(new C10816at(gVar), this.f35903c);
    }

    /* renamed from: b */
    public final C60870cx mo19314b(C58528ij ijVar) {
        C60870cx cxVar;
        ((C58970a) ((C58970a) f35901a.mo56224b()).mo56372aa(53979)).mo56389s("[%s] #resolveDesiredLanguagePacks", this.f35904d);
        if (Build.VERSION.SDK_INT < 31) {
            cxVar = C60856cj.m92900i(C58733pz.f156496a);
        } else {
            C60870cx d = this.f35902b.mo46042d();
            C10820ax axVar = new C10820ax(this);
            cxVar = C60922j.m93044g(d, C47810es.m84963c(axVar), this.f35903c);
        }
        C10814ar arVar = new C10814ar(ijVar);
        return C60922j.m93044g(cxVar, C47810es.m84963c(arVar), this.f35903c);
    }

    /* renamed from: c */
    public final C60870cx mo19315c(C58528ij ijVar) {
        ((C58970a) ((C58970a) f35901a.mo56224b()).mo56372aa(53980)).mo56389s("[%s] #resolveUnusedLanguagePacks", this.f35904d);
        C60870cx b = mo19314b(ijVar);
        C10822az azVar = new C10822az(ijVar);
        return C60922j.m93044g(b, C47810es.m84963c(azVar), this.f35903c);
    }
}
