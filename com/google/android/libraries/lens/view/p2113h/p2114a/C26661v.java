package com.google.android.libraries.lens.view.p2113h.p2114a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.acq;
import com.google.common.p4552o.acr;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.h.a.v */
/* compiled from: PG */
public final class C26661v {

    /* renamed from: a */
    public final Object f72694a = new Object();

    /* renamed from: b */
    public final C21370a f72695b;

    /* renamed from: c */
    public final List f72696c = new ArrayList();

    /* renamed from: d */
    public long f72697d = 0;

    /* renamed from: e */
    public int f72698e = 9000;

    /* renamed from: f */
    private long f72699f = -1;

    static {
        C58974d.m91135i("ViewfinderEpisodeLogger");
    }

    public C26661v(C21370a aVar) {
        this.f72695b = aVar;
    }

    /* renamed from: a */
    public final acr mo31955a() {
        long c = this.f72695b.mo26871c();
        synchronized (this.f72694a) {
            if (this.f72699f == -1) {
                return null;
            }
            Iterable g = C58557jl.m90126g(this.f72696c, 1);
            acq acq = (acq) acr.f158321e.createBuilder();
            long j = this.f72699f;
            acq.copyOnWrite();
            acr acr = (acr) acq.instance;
            acr.f158323a = 1 | acr.f158323a;
            acr.f158324b = j;
            acq.copyOnWrite();
            acr acr2 = (acr) acq.instance;
            acr2.f158323a |= 2;
            acr2.f158325c = c;
            acq.copyOnWrite();
            acr acr3 = (acr) acq.instance;
            C62961ch chVar = acr3.f158326d;
            if (!chVar.mo58948c()) {
                acr3.f158326d = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll(g, (List) acr3.f158326d);
            acr acr4 = (acr) acq.build();
            this.f72699f = -1;
            this.f72698e -= Math.max(this.f72696c.size() - 1, 0);
            return acr4;
        }
    }

    /* renamed from: b */
    public final void mo31956b() {
        long c = this.f72695b.mo26871c();
        synchronized (this.f72694a) {
            this.f72699f = c;
            this.f72696c.clear();
        }
    }
}
