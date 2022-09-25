package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.dl */
/* compiled from: PG */
public final /* synthetic */ class C103993dl implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C104026er f289395a;

    /* renamed from: b */
    public final /* synthetic */ C29689e f289396b;

    public /* synthetic */ C103993dl(C104026er erVar, C29689e eVar) {
        this.f289395a = erVar;
        this.f289396b = eVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C104026er erVar = this.f289395a;
        C29689e eVar = this.f289396b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList = new ArrayList((C58485gu) obj);
        Collections.sort(arrayList, C104019ek.f289431a);
        C58833ax j = C58833ax.m90833j(((C86054o) erVar.f289464r.mo27525b()).mo79668a());
        String c = erVar.f289452f.mo74368c(C80627v.WEBREF);
        boolean f = erVar.f289452f.mo74371f();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C29690f fVar = (C29690f) arrayList.get(i);
            if (fVar != null) {
                C29689e a = C29689e.m54781a(fVar.f80415f);
                if (a == null) {
                    a = C29689e.UNSPECIFIED;
                }
                if (a.equals(eVar)) {
                    if (f) {
                        if (!j.equals(C58833ax.m90833j(C28694b.m53576a(fVar.f80413d)))) {
                        }
                    } else if (!fVar.f80413d.isEmpty() && !fVar.f80411b.equals(c)) {
                    }
                    if ((!fVar.f80411b.equals(c) || j.equals(C58833ax.m90833j(C28694b.m53576a(fVar.f80413d)))) && hashSet.add(fVar.f80411b)) {
                        hashSet2.add(fVar);
                    }
                }
            }
        }
        return hashSet2;
    }
}
