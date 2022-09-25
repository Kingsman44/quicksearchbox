package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.j */
/* compiled from: PG */
public final /* synthetic */ class C110774j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ List f308660a;

    public /* synthetic */ C110774j(List list) {
        this.f308660a = list;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        List<C83741am> list = this.f308660a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent() || ((Boolean) optional.get()).booleanValue()) {
            return C60856cj.m92900i(list);
        }
        ArrayList arrayList = new ArrayList();
        for (C83741am amVar : list) {
            C50818do doVar = amVar.f228252c;
            if (doVar == null) {
                doVar = C50818do.f132293H;
            }
            C50794cr a = C50794cr.m85938a(doVar.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            if (C83794j.f228391d.contains(a)) {
                arrayList.add(amVar);
            }
        }
        return C60856cj.m92900i(arrayList);
    }
}
