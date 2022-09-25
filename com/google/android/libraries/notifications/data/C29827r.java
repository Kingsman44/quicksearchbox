package com.google.android.libraries.notifications.data;

import com.google.p4160bf.p4164b.p4165a.C55660cp;
import com.google.p4160bf.p4164b.p4165a.C55661cq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import com.google.p4160bf.p4167c.p4168a.p4169a.p4170a.p4171a.C55688b;
import com.google.protobuf.C63070h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.data.r */
/* compiled from: PG */
public abstract class C29827r {
    /* renamed from: u */
    public static final List m55148u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29827r rVar = (C29827r) it.next();
            C55660cp cpVar = (C55660cp) C55661cq.f146868e.createBuilder();
            String j = rVar.mo35063j();
            cpVar.copyOnWrite();
            C55661cq cqVar = (C55661cq) cpVar.instance;
            j.getClass();
            cqVar.f146870a |= 1;
            cqVar.f146871b = j;
            long longValue = rVar.mo35060h().longValue();
            cpVar.copyOnWrite();
            C55661cq cqVar2 = (C55661cq) cpVar.instance;
            cqVar2.f146870a |= 2;
            cqVar2.f146872c = longValue;
            long longValue2 = rVar.mo35055d().longValue();
            cpVar.copyOnWrite();
            C55661cq cqVar3 = (C55661cq) cpVar.instance;
            cqVar3.f146870a |= 4;
            cqVar3.f146873d = longValue2;
            arrayList.add((C55661cq) cpVar.build());
        }
        return arrayList;
    }

    /* renamed from: v */
    public static C29793g m55149v() {
        C29793g gVar = new C29793g();
        gVar.mo35043b(C55586v.f146658u);
        gVar.mo35049h(1);
        gVar.mo35048g(1);
        gVar.mo35047f(1);
        gVar.mo35051j(1);
        gVar.f80763a = 0L;
        gVar.f80764b = 0L;
        gVar.f80771i = 0L;
        gVar.f80766d = 0L;
        gVar.f80770h = "chime_default_group";
        gVar.f80772j = 0L;
        gVar.mo35046e(Collections.emptyList());
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            gVar.f80774l = emptyList;
            gVar.mo35050i(1);
            return gVar;
        }
        throw new NullPointerException("Null actionList");
    }

    /* renamed from: a */
    public abstract C55586v mo35052a();

    /* renamed from: b */
    public abstract C55688b mo35053b();

    /* renamed from: c */
    public abstract C63070h mo35054c();

    /* renamed from: d */
    public abstract Long mo35055d();

    /* renamed from: e */
    public abstract Long mo35056e();

    /* renamed from: f */
    public abstract Long mo35058f();

    /* renamed from: g */
    public abstract Long mo35059g();

    /* renamed from: h */
    public abstract Long mo35060h();

    /* renamed from: i */
    public abstract String mo35062i();

    /* renamed from: j */
    public abstract String mo35063j();

    /* renamed from: k */
    public abstract String mo35064k();

    /* renamed from: l */
    public abstract String mo35065l();

    /* renamed from: m */
    public abstract List mo35066m();

    /* renamed from: n */
    public abstract List mo35067n();

    /* renamed from: o */
    public abstract int mo35068o();

    /* renamed from: p */
    public abstract int mo35069p();

    /* renamed from: q */
    public abstract int mo35070q();

    /* renamed from: r */
    public abstract int mo35071r();

    /* renamed from: s */
    public abstract int mo35072s();

    /* renamed from: t */
    public abstract C29793g mo35073t();
}
