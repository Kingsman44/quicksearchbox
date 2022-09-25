package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.c */
/* compiled from: PG */
public final /* synthetic */ class C103954c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104123t f289323a;

    /* renamed from: b */
    public final /* synthetic */ String f289324b;

    /* renamed from: c */
    public final /* synthetic */ C29409fd f289325c;

    /* renamed from: d */
    public final /* synthetic */ C28708an f289326d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f289327e;

    public /* synthetic */ C103954c(C104123t tVar, String str, C29409fd fdVar, C28708an anVar, C58833ax axVar) {
        this.f289323a = tVar;
        this.f289324b = str;
        this.f289325c = fdVar;
        this.f289326d = anVar;
        this.f289327e = axVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104123t tVar = this.f289323a;
        String str = this.f289324b;
        C29409fd fdVar = this.f289325c;
        C28708an anVar = this.f289326d;
        C58833ax axVar = this.f289327e;
        if (!((Boolean) obj).booleanValue()) {
            ((C58970a) ((C58970a) C104123t.f289645a.mo56226d()).mo56372aa(21674)).mo56389s("Group %s failed to remove. Continuing attempt.", str);
        }
        C22871g gVar = tVar.f289648d;
        C29343e eVar = new C29343e();
        eVar.mo34326b(anVar);
        eVar.f79533b = axVar;
        return gVar.mo28210j(fdVar.mo34712a(eVar.mo34325a()), "[NGA] loggingOutput", new C104114k(str));
    }
}
