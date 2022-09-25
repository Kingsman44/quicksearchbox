package com.google.android.libraries.search.assistant.invocation.p2655o.p2665g.p2666a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34084ct;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.policy.conformance.SameClientAllowanceChecker$initialize$1$invokeSuspend$lambda-5$$inlined$combine$1$3", mo61344c = "SameClientAllowance.kt", mo61345d = "invokeSuspend", mo61346e = {342})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.g.a.o */
/* compiled from: PG */
public final class C34346o extends C69572j implements C69631q {

    /* renamed from: a */
    int f91311a;

    /* renamed from: b */
    /* synthetic */ Object f91312b;

    /* renamed from: c */
    private /* synthetic */ Object f91313c;

    public C34346o(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34346o oVar = new C34346o((C69577g) obj3);
        oVar.f91313c = (C71588o) obj;
        oVar.f91312b = (Object[]) obj2;
        return oVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91311a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r9 = this.f91313c;
            C69685i[] iVarArr = (C69685i[]) ((Object[]) this.f91312b);
            ArrayList arrayList = new ArrayList();
            for (C69685i iVar : iVarArr) {
                if (((C34120b) iVar.f186053b).f90872a.f90869a != C34037b.CLIENT_UNKNOWN) {
                    arrayList.add(iVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                C34084ct ctVar = ((C34014ad) ((C34120b) ((C69685i) next).f186053b).f90873b).f90667c;
                if (ctVar == null) {
                    ctVar = C34084ct.f90814b;
                }
                if (ctVar.f90816a) {
                    arrayList2.add(next);
                }
            }
            Set ab = C69540x.m100846ab(arrayList2);
            this.f91311a = 1;
            if (r9.mo20883a(ab, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
