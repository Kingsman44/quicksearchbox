package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110374d;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110383m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58733pz;
import com.google.p4715m.p4716a.p4720b.p4721a.C62671aj;
import com.google.p4715m.p4716a.p4720b.p4721a.C62673al;
import com.google.p4715m.p4716a.p4720b.p4721a.C62682j;
import com.google.p4715m.p4716a.p4720b.p4721a.C62696x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.q */
/* compiled from: PG */
public final /* synthetic */ class C110219q implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C110224v f307123a;

    /* renamed from: b */
    public final /* synthetic */ Set f307124b;

    /* renamed from: c */
    public final /* synthetic */ C110374d f307125c;

    public /* synthetic */ C110219q(C110224v vVar, Set set, C110374d dVar) {
        this.f307123a = vVar;
        this.f307124b = set;
        this.f307125c = dVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        Set set;
        C62671aj ajVar;
        C58833ax axVar;
        C110224v vVar = this.f307123a;
        Set set2 = this.f307124b;
        C110374d dVar = this.f307125c;
        C62682j jVar = (C62682j) obj;
        C62682j jVar2 = (C62682j) vVar.f307138h.f307610b.mo3842a();
        if (jVar2 == null) {
            set = C58733pz.f156496a;
        } else {
            C62673al alVar = jVar2.f169233a;
            if (alVar == null) {
                alVar = C62673al.f169207b;
            }
            Iterator it = alVar.f169209a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ajVar = null;
                    break;
                }
                ajVar = (C62671aj) it.next();
                if (ajVar.f169203b == 2) {
                    break;
                }
            }
            if (ajVar == null) {
                set = C58733pz.f156496a;
            } else {
                set = new HashSet();
                for (C62696x xVar : ajVar.f169205d) {
                    if ((xVar.f169268a & 1) != 0) {
                        axVar = C58833ax.m90834k(xVar.f169269b);
                    } else {
                        axVar = C58836b.f156633a;
                    }
                    set.add(new C110383m(axVar, xVar.f169270c));
                }
            }
        }
        set2.addAll(set);
        dVar.mObservable.mo2879a();
    }
}
