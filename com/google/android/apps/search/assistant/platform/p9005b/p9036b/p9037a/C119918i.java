package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32789ak;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.assistant.p3897e.p3921j.C52232kc;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71760h;
import kotlinx.coroutines.C71803m;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchConversationParamsFromClient$2", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {244})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.i */
/* compiled from: PG */
final class C119918i extends C69572j implements C69630p {

    /* renamed from: a */
    int f333952a;

    /* renamed from: b */
    final /* synthetic */ List f333953b;

    /* renamed from: c */
    final /* synthetic */ C119927r f333954c;

    /* renamed from: d */
    final /* synthetic */ boolean f333955d;

    /* renamed from: e */
    private /* synthetic */ Object f333956e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119918i(List list, C119927r rVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f333953b = list;
        this.f333954c = rVar;
        this.f333955d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119918i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333952a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f333956e;
            List list = this.f333953b;
            ArrayList<C32796ar> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (C32789ak.m60768a(((C32796ar) next).f87975a) == 1) {
                    arrayList.add(next);
                }
            }
            C119927r rVar = this.f333954c;
            boolean z = this.f333955d;
            ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
            for (C32796ar hVar : arrayList) {
                arrayList2.add(C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C119917h(rVar, hVar, z, (C69577g) null), 3));
            }
            this.f333952a = 1;
            obj = C71760h.m104949a(arrayList2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ArrayList<Optional> arrayList3 = new ArrayList<>();
        for (Object next2 : (Iterable) obj) {
            if (((Optional) next2).isPresent()) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C69540x.m100804k(arrayList3, 10));
        for (Optional optional : arrayList3) {
            arrayList4.add((C52232kc) optional.get());
        }
        return arrayList4;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C119918i iVar = new C119918i(this.f333953b, this.f333954c, this.f333955d, gVar);
        iVar.f333956e = obj;
        return iVar;
    }
}
