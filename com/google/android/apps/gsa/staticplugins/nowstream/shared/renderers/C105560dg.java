package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.p375ai.p378b.C7940pp;
import com.google.p375ai.p378b.C7941pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dg */
/* compiled from: PG */
public final /* synthetic */ class C105560dg implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105574du f294491a;

    public /* synthetic */ C105560dg(C105574du duVar) {
        this.f294491a = duVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105574du duVar = this.f294491a;
        C7941pq pqVar = (C7941pq) obj;
        int i = pqVar.f27882a;
        if ((i & 8) != 0) {
            int a = C7940pp.m22894a(pqVar.f27886e);
            if (a == 0) {
                a = 1;
            }
            duVar.f294516e = a - 1;
        }
        if ((i & 16) != 0) {
            duVar.f294517f = 0;
            int i2 = pqVar.f27887f;
            duVar.f294514c = i2;
            duVar.mo94919j(i2, false);
        }
        if ((pqVar.f27882a & 32) != 0) {
            duVar.f294518g = 0;
            int i3 = pqVar.f27888g;
            duVar.f294515d = i3;
            duVar.mo94920k(i3);
        }
        duVar.mo94922m();
    }
}
