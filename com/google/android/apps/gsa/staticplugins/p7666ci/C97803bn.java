package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bn */
/* compiled from: PG */
public final /* synthetic */ class C97803bn implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273085a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f273086b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f273087c;

    /* renamed from: d */
    public final /* synthetic */ boolean f273088d;

    /* renamed from: e */
    public final /* synthetic */ ConcurrentHashMap f273089e;

    /* renamed from: f */
    public final /* synthetic */ C123777f f273090f;

    /* renamed from: g */
    public final /* synthetic */ boolean f273091g;

    /* renamed from: h */
    public final /* synthetic */ C58833ax f273092h;

    /* renamed from: i */
    public final /* synthetic */ C58833ax f273093i;

    /* renamed from: j */
    public final /* synthetic */ C58833ax f273094j;

    /* renamed from: k */
    public final /* synthetic */ C58833ax f273095k;

    public /* synthetic */ C97803bn(C97811bv bvVar, C53306j jVar, C58485gu guVar, boolean z, ConcurrentHashMap concurrentHashMap, C123777f fVar, boolean z2, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f273085a = bvVar;
        this.f273086b = jVar;
        this.f273087c = guVar;
        this.f273088d = z;
        this.f273089e = concurrentHashMap;
        this.f273090f = fVar;
        this.f273091g = z2;
        this.f273092h = axVar;
        this.f273093i = axVar2;
        this.f273094j = axVar3;
        this.f273095k = axVar4;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        boolean z;
        C97811bv bvVar = this.f273085a;
        C53306j jVar = this.f273086b;
        C58485gu guVar = this.f273087c;
        boolean z2 = this.f273088d;
        ConcurrentHashMap concurrentHashMap = this.f273089e;
        C123777f fVar = this.f273090f;
        boolean z3 = this.f273091g;
        C58833ax axVar = this.f273092h;
        C58833ax axVar2 = this.f273093i;
        C58833ax axVar3 = this.f273094j;
        C58833ax axVar4 = this.f273095k;
        List list = (List) obj;
        C58495hd l = C58495hd.m89898l(concurrentHashMap);
        C58800sl lA = l.keySet().iterator();
        while (true) {
            if (!lA.hasNext()) {
                z = false;
                break;
            }
            Integer num = (Integer) lA.next();
            if (bvVar.f273131l.mo103697i(num)) {
                Boolean bool = (Boolean) l.get(num);
                bool.getClass();
                if (!bool.booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            bvVar.f273127h.mo28212l("#startAssistantClientSync()", new C97798bi(bvVar, jVar, fVar));
        }
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        boolean z4 = guVar.contains(10) || guVar.contains(19);
        C97799bj bjVar = r1;
        C97811bv bvVar2 = bvVar;
        Stream stream = Collection.EL.stream(guVar);
        C58495hd hdVar = l;
        C58495hd hdVar2 = l;
        boolean z5 = z;
        C58833ax axVar5 = axVar4;
        C123777f fVar2 = fVar;
        C58833ax axVar6 = axVar3;
        boolean z6 = z4;
        C58833ax axVar7 = axVar2;
        C58833ax axVar8 = axVar6;
        C58833ax axVar9 = axVar;
        C58833ax axVar10 = axVar5;
        C123777f fVar3 = fVar;
        ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
        C58485gu guVar2 = guVar;
        C58833ax axVar11 = axVar9;
        C53306j jVar2 = jVar;
        C97799bj bjVar2 = new C97799bj(bvVar, jVar, z2, hdVar, z5, fVar2, z6, z3, axVar8, axVar10, concurrentHashMap3, axVar11, axVar7);
        C58485gu guVar3 = (C58485gu) stream.map(bjVar).collect(C58370cn.f155946a);
        C97811bv bvVar3 = bvVar2;
        return bvVar3.f273126g.mo28209i(C60856cj.m92906o(guVar3), "Build ProactiveDataList", new C97800bk(bvVar3, guVar2, guVar3, jVar2, fVar3, hdVar2));
    }
}
