package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.assistant.p3897e.p3917i.p3918a.C51336dy;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.handsfree.mda.MdaSignalsSupplier$getMdaSignals$2", mo61344c = "MdaSignalsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {66, 66})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.c.g */
/* compiled from: PG */
public final class C127945g extends C69572j implements C69630p {

    /* renamed from: a */
    int f352173a;

    /* renamed from: b */
    final /* synthetic */ C127947i f352174b;

    /* renamed from: c */
    final /* synthetic */ C34053bp f352175c;

    /* renamed from: d */
    private /* synthetic */ Object f352176d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127945g(C127947i iVar, C34053bp bpVar, C69577g gVar) {
        super(2, gVar);
        this.f352174b = iVar;
        this.f352175c = bpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127945g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        List list;
        C71604be beVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f352173a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f352176d;
            C71604be c = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C127944f(this.f352174b, this.f352175c, (C69577g) null), 3);
            C71604be c2 = C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C127943e(this.f352174b, (C69577g) null), 3);
            this.f352176d = c2;
            this.f352173a = 1;
            Object a = c.mo62825a(this);
            if (a != aVar) {
                Object obj2 = a;
                beVar = c2;
                obj = obj2;
            }
            return aVar;
        } else if (i != 1) {
            list = (List) this.f352176d;
            C69714l.m101134b(obj);
            return new C127940b(list, (C51336dy) obj);
        } else {
            beVar = (C71604be) this.f352176d;
            C69714l.m101134b(obj);
        }
        List list2 = (List) obj;
        this.f352176d = list2;
        this.f352173a = 2;
        Object a2 = beVar.mo62825a(this);
        if (a2 != aVar) {
            list = list2;
            obj = a2;
            return new C127940b(list, (C51336dy) obj);
        }
        return aVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C127945g gVar2 = new C127945g(this.f352174b, this.f352175c, gVar);
        gVar2.f352176d = obj;
        return gVar2;
    }
}
