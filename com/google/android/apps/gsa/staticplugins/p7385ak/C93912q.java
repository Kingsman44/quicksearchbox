package com.google.android.apps.gsa.staticplugins.p7385ak;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65761as;
import java.util.ArrayList;
import java.util.HashSet;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.q */
/* compiled from: PG */
public final /* synthetic */ class C93912q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93914s f262262a;

    /* renamed from: b */
    public final /* synthetic */ String f262263b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f262264c;

    public /* synthetic */ C93912q(C93914s sVar, String str, C58485gu guVar) {
        this.f262262a = sVar;
        this.f262263b = str;
        this.f262264c = guVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93914s sVar = this.f262262a;
        String str = this.f262263b;
        C58485gu guVar = this.f262264c;
        C58495hd hdVar = (C58495hd) obj;
        C60870cx[] cxVarArr = new C60870cx[2];
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet<>(hdVar.keySet());
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C51058ev evVar = ((C65761as) guVar.get(i)).f178779b;
            if (evVar == null) {
                evVar = C51058ev.f132941o;
            }
            hashSet.remove(evVar.f132944b);
        }
        for (String a : hashSet) {
            C58976aa aaVar = C58975e.f156826a;
            C60870cx a2 = sVar.f262278o.a(str, C65753ak.DEVICE_INSTALLED_APPS, a);
            C90875ai.m148465b(C93887a.f262230a, a2, sVar.f262270g, "Geller delete logging").mo85223a(C93905j.f262254a);
            arrayList.add(a2);
        }
        cxVarArr[0] = C60856cj.m92892a(arrayList).mo57334a(C93906k.f262255a, C60826bg.f164896a);
        C58480gp e = C58485gu.m89837e();
        int size2 = guVar.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C65761as asVar = (C65761as) guVar.get(i2);
            C51058ev evVar2 = asVar.f178779b;
            if (evVar2 == null) {
                evVar2 = C51058ev.f132941o;
            }
            String str2 = evVar2.f132944b;
            if (!hdVar.containsKey(str2)) {
                e.mo55395g(asVar);
            } else {
                C65761as asVar2 = (C65761as) Objects.requireNonNull((C65761as) hdVar.get(str2));
                if (asVar2.equals(asVar)) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    C51058ev evVar3 = asVar2.f178779b;
                    if (evVar3 == null) {
                        evVar3 = C51058ev.f132941o;
                    }
                    String str3 = evVar3.f132944b;
                } else {
                    e.mo55395g(asVar);
                }
            }
        }
        C58485gu f = e.mo55394f();
        ArrayList arrayList2 = new ArrayList();
        int i3 = ((C58724pq) f).f156474d;
        for (int i4 = 0; i4 < i3; i4++) {
            C51058ev evVar4 = ((C65761as) f.get(i4)).f178779b;
            if (evVar4 == null) {
                evVar4 = C51058ev.f132941o;
            }
            String str4 = evVar4.f132944b;
            if (hdVar.containsKey(str4)) {
                C59104x b = C93914s.f262266a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "DeviceAppInfoWork");
                ((C59052c) ((C59052c) b).mo56372aa(19306)).mo56389s("remove existing package for update: %s", str4);
                arrayList2.add(sVar.f262278o.a(str, C65753ak.DEVICE_INSTALLED_APPS, str4));
            }
        }
        cxVarArr[1] = sVar.f262270g.mo28210j(C60856cj.m92892a(arrayList2).mo57334a(C93902g.f262249a, C60826bg.f164896a), "update changed items", new C93903h(sVar, str, f));
        return C60856cj.m92893b(cxVarArr).mo57334a(new C93904i(str), C60826bg.f164896a);
    }
}
