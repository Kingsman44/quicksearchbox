package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gn */
/* compiled from: PG */
public final /* synthetic */ class C104076gn implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104078gp f289566a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f289567b;

    public /* synthetic */ C104076gn(C104078gp gpVar, C29409fd fdVar) {
        this.f289566a = gpVar;
        this.f289567b = fdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104078gp gpVar = this.f289566a;
        C29409fd fdVar = this.f289567b;
        Void voidR = (Void) obj;
        C58480gp e = C58485gu.m89837e();
        C58526ih ihVar = new C58526ih();
        C58800sl lA = gpVar.f289576d.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            String str = (String) entry.getKey();
            if (((Boolean) ((C58881cr) entry.getValue()).mo6453a()).booleanValue()) {
                ihVar.mo55373c(str);
            }
        }
        C58528ij f = ihVar.mo55486f();
        C58800sl lA2 = f.iterator();
        while (lA2.hasNext()) {
            e.mo55395g(((C28746bx) gpVar.f289575c.get((String) lA2.next())).mo19336b(fdVar));
        }
        e.mo55395g(gpVar.f289574b.mo93936c(fdVar, f));
        return C60856cj.m92894c(e.mo55394f()).mo57334a(C104074gl.f289564a, C60826bg.f164896a);
    }
}
