package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91392d;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91398j;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91667f;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8178yk;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.dk */
/* compiled from: PG */
final class C104624dk implements C91398j {

    /* renamed from: a */
    final /* synthetic */ C104627dn f291260a;

    /* renamed from: b */
    private final C91667f f291261b;

    /* renamed from: c */
    private final int f291262c;

    /* renamed from: d */
    private final int f291263d;

    /* renamed from: e */
    private final List f291264e;

    /* renamed from: f */
    private final C7718hj f291265f;

    /* renamed from: g */
    private C9270n f291266g;

    public C104624dk(C104627dn dnVar, C91667f fVar, C9270n nVar, C7718hj hjVar, int i, int i2, List list) {
        this.f291260a = dnVar;
        this.f291261b = fVar;
        this.f291266g = nVar;
        this.f291265f = hjVar;
        this.f291263d = i;
        this.f291262c = i2;
        this.f291264e = list;
    }

    /* renamed from: a */
    public final void mo85735a(C7718hj hjVar) {
        C7718hj g = this.f291261b.mo86085g();
        if (C91978bb.m150942h(g, hjVar)) {
            C7711hc hcVar = (C7711hc) hjVar.toBuilder();
            if ((g.f26955a & 128) != 0) {
                C8178yk ykVar = g.f26973n;
                if (ykVar == null) {
                    ykVar = C8178yk.f28736g;
                }
                hcVar.copyOnWrite();
                C7718hj hjVar2 = (C7718hj) hcVar.instance;
                ykVar.getClass();
                hjVar2.f26973n = ykVar;
                hjVar2.f26955a |= 128;
            }
            mo85736b((C7718hj) hcVar.build());
        }
    }

    /* renamed from: b */
    public final void mo85736b(C7718hj hjVar) {
        boolean z;
        C9270n f;
        Object obj;
        int i = 0;
        if (C91978bb.m150942h(this.f291261b.mo86085g(), hjVar)) {
            this.f291261b.mo86086h(hjVar);
            z = true;
        } else {
            z = false;
        }
        C1970e c = this.f291261b.mo86081c();
        if (!(c == null || (obj = c.f5889b) == null)) {
            for (C7718hj hjVar2 : (C7718hj[]) obj) {
                if (C91978bb.m150942h(hjVar2, hjVar)) {
                    this.f291261b.mo86090l(hjVar2, hjVar);
                    z = true;
                }
            }
        }
        if (z && (f = this.f291261b.mo86084f(this.f291260a.f291268a)) != null) {
            C9270n nVar = this.f291266g;
            if (nVar != null && f.f32075b.size() == nVar.f32075b.size()) {
                while (i < f.f32075b.size()) {
                    if (C104627dn.m173186f((C9278v) f.f32075b.get(i)).equals(C104627dn.m173186f((C9278v) nVar.f32075b.get(i)))) {
                        i++;
                    }
                }
                return;
            }
            C104627dn dnVar = this.f291260a;
            for (C91392d d : dnVar.f291271d) {
                dnVar.f291270c.mo77634d(d);
            }
            dnVar.f291271d.clear();
            ((C23193m) dnVar.f291269b.mo94217l()).mo28652f();
            this.f291266g = f;
            C104627dn dnVar2 = this.f291260a;
            dnVar2.mo94286h(f, this.f291261b, this.f291265f, this.f291264e, dnVar2.f291276i, this.f291263d, this.f291262c, dnVar2.f291279l, dnVar2.f291278k, false);
        }
    }
}
