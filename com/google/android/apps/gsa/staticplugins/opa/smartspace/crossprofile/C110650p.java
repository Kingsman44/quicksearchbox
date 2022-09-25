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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.p */
/* compiled from: PG */
public final /* synthetic */ class C110650p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C110656v f308329a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f308330b;

    /* renamed from: c */
    public final /* synthetic */ C83800p f308331c;

    public /* synthetic */ C110650p(C110656v vVar, C58872ci ciVar, C83800p pVar) {
        this.f308329a = vVar;
        this.f308330b = ciVar;
        this.f308331c = pVar;
    }

    public final Object apply(Object obj) {
        Object obj2;
        C58833ax axVar;
        Collection collection;
        C110656v vVar = this.f308329a;
        C58872ci ciVar = this.f308330b;
        C83800p pVar = this.f308331c;
        List list = (List) obj;
        if (list.get(0) == null) {
            obj2 = new ArrayList();
        } else {
            obj2 = (List) list.get(0);
        }
        if (list.get(1) == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = (C58833ax) list.get(1);
        }
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) vVar.f308345d.mo56226d()).mo56372aa(26595)).mo56386p("Missing weather card from content store");
        }
        if (list.get(2) == null) {
            collection = new ArrayList();
        } else {
            collection = (List) list.get(2);
        }
        ciVar.mo56158a(TimeUnit.MILLISECONDS);
        C83798n a = pVar.mo77055a();
        a.mo77045d(C58495hd.m89900n(C83799o.CURRENT, obj2));
        a.mo77047f(axVar);
        a.mo77046e(C58485gu.m89842j(collection));
        return a.mo77042a();
    }
}
