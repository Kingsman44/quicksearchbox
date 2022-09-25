package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83799o;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.an */
/* compiled from: PG */
public final /* synthetic */ class C110806an implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308717a;

    public /* synthetic */ C110806an(C110812at atVar) {
        this.f308717a = atVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308717a;
        C83800p pVar = (C83800p) obj;
        C58495hd i = pVar.mo77065i();
        ArrayList arrayList = new ArrayList();
        if (i.containsKey(C83799o.CURRENT)) {
            arrayList.addAll((Collection) i.get(C83799o.CURRENT));
        }
        if (i.containsKey(C83799o.OTHER) && atVar.f308734h.f256848d.mo86766v()) {
            arrayList.addAll((Collection) Collection.EL.stream((List) i.get(C83799o.OTHER)).filter(new C110807ao(atVar)).collect(Collectors.toList()));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(pVar.mo77061f());
        return atVar.f308727a.mo28210j(atVar.f308733g.mo77191a(new Pair(arrayList2, arrayList)), BuildConfig.FLAVOR, C110811as.f308726a);
    }
}
