package com.google.android.libraries.places.widget.internal.p2440a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146036p;
import com.google.android.libraries.places.api.p2437b.C31859o;
import com.google.android.libraries.places.widget.internal.common.C31915c;
import com.google.android.libraries.places.widget.internal.common.C31919g;
import com.google.android.libraries.places.widget.internal.common.C31920h;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.libraries.places.widget.internal.a.k */
/* compiled from: PG */
public final /* synthetic */ class C31909k implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C31912n f85798a;

    /* renamed from: b */
    public final /* synthetic */ String f85799b;

    public /* synthetic */ C31909k(C31912n nVar, String str) {
        this.f85798a = nVar;
        this.f85799b = str;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C31912n nVar = this.f85798a;
        String str = this.f85799b;
        if (!((C146014aj) abVar).f394703b) {
            Exception f = abVar.mo122487f();
            if (f == null) {
                nVar.f85806b.f85852f++;
                List a = ((C31859o) abVar.mo122488g()).mo37433a();
                if (a.isEmpty()) {
                    str.getClass();
                    C31919g i = C31920h.m59473i(6);
                    ((C31915c) i).f85835a = str;
                    nVar.mo37653e(i.mo37677a());
                    return;
                }
                a.getClass();
                C31919g i2 = C31920h.m59473i(5);
                ((C31915c) i2).f85836b = C58485gu.m89842j(a);
                nVar.mo37653e(i2.mo37677a());
                return;
            }
            nVar.f85806b.f85853g++;
            Status a2 = C31912n.m59429a(f);
            if (!C31912n.m59430f(a2)) {
                str.getClass();
                a2.getClass();
                C31919g i3 = C31920h.m59473i(7);
                C31915c cVar = (C31915c) i3;
                cVar.f85835a = str;
                cVar.f85839e = a2;
                nVar.mo37653e(i3.mo37677a());
                return;
            }
            nVar.mo37653e(C31920h.m59472h(a2));
        }
    }
}
