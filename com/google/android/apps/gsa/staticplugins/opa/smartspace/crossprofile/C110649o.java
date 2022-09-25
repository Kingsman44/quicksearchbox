package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83799o;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.o */
/* compiled from: PG */
public final /* synthetic */ class C110649o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C110656v f308326a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308327b;

    /* renamed from: c */
    public final /* synthetic */ C83800p f308328c;

    public /* synthetic */ C110649o(C110656v vVar, C58872ci ciVar, C83800p pVar) {
        this.f308326a = vVar;
        this.f308327b = ciVar;
        this.f308328c = pVar;
    }

    public final Object apply(Object obj) {
        Collection collection;
        Collection collection2;
        C58833ax axVar;
        Collection collection3;
        C58495hd hdVar;
        C110656v vVar = this.f308326a;
        C58872ci ciVar = this.f308327b;
        C83800p pVar = this.f308328c;
        List list = (List) obj;
        if (list.get(0) == null) {
            collection = new ArrayList();
        } else {
            collection = (List) list.get(0);
        }
        if (list.get(1) == null) {
            collection2 = new ArrayList();
        } else {
            collection2 = (List) list.get(1);
        }
        if (list.get(2) == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = (C58833ax) list.get(2);
        }
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) vVar.f308345d.mo56226d()).mo56372aa(26593)).mo56386p("WorkProfileAccessEnabled: Missing weather card from content store");
        }
        if (list.get(3) == null) {
            collection3 = new ArrayList();
        } else {
            collection3 = (List) list.get(3);
        }
        if (!vVar.f308342a.mo77184w() || !vVar.f308342a.mo77185x()) {
            hdVar = C58495hd.m89901o(C83799o.CURRENT, collection, C83799o.OTHER, collection2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            hdVar = C58495hd.m89900n(C83799o.CURRENT, arrayList);
        }
        ciVar.mo56158a(TimeUnit.MILLISECONDS);
        C83798n a = pVar.mo77055a();
        a.mo77045d(hdVar);
        a.mo77047f(axVar);
        a.mo77046e(C58485gu.m89842j(collection3));
        return a.mo77042a();
    }
}
