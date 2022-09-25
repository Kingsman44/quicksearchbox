package com.google.android.libraries.places.widget.internal.p2440a;

import android.text.TextUtils;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146024d;
import com.google.android.libraries.places.api.p2437b.C31848d;
import com.google.android.libraries.places.api.p2437b.C31857m;
import com.google.android.libraries.places.api.p2437b.C31858n;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.places.widget.internal.a.l */
/* compiled from: PG */
public final /* synthetic */ class C31910l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31912n f85800a;

    /* renamed from: b */
    public final /* synthetic */ String f85801b;

    public /* synthetic */ C31910l(C31912n nVar, String str) {
        this.f85800a = nVar;
        this.f85801b = str;
    }

    public final void run() {
        C146006ab abVar;
        C31912n nVar = this.f85800a;
        String str = this.f85801b;
        C31901c cVar = nVar.f85805a;
        C58838bb.m90868c(!TextUtils.isEmpty(str));
        C31907i iVar = (C31907i) cVar;
        C31904f fVar = iVar.f85794e;
        if (fVar != null) {
            C31899a aVar = (C31899a) fVar;
            if (aVar.f85784b.equals(str)) {
                abVar = fVar.f85789c;
                abVar.getClass();
                abVar.mo122497p(new C31909k(nVar, str));
            }
            aVar.f85783a.f394725a.f394724a.mo122510x((Object) null);
        }
        C31899a aVar2 = new C31899a(new C146024d(), str);
        iVar.f85794e = aVar2;
        C31863s sVar = iVar.f85791b;
        C31857m j = C31858n.m59252j();
        C31848d dVar = (C31848d) j;
        dVar.f85482a = str;
        dVar.f85483b = iVar.f85792c.mo37656c();
        dVar.f85484c = iVar.f85792c.mo37657d();
        j.mo37420d(iVar.f85792c.mo37662h());
        dVar.f85487f = iVar.f85792c.mo37658e();
        j.mo37421e(iVar.f85792c.mo37665j());
        dVar.f85486e = iVar.f85793d;
        dVar.f85489h = aVar2.f85783a.f394725a;
        abVar = sVar.mo37396b(j.mo37448f()).mo122483b(new C31903e(aVar2));
        aVar2.f85789c = abVar;
        abVar.mo122497p(new C31909k(nVar, str));
    }
}
