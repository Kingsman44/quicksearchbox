package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a.C127885a;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a.C127887c;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.handsfree.mda.MdaSignalsSupplier$getMdaSignals$2$deferredPositionalAttributes$1", mo61344c = "MdaSignalsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {49, 50})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.c.f */
/* compiled from: PG */
final class C127944f extends C69572j implements C69630p {

    /* renamed from: a */
    int f352170a;

    /* renamed from: b */
    final /* synthetic */ C127947i f352171b;

    /* renamed from: c */
    final /* synthetic */ C34053bp f352172c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127944f(C127947i iVar, C34053bp bpVar, C69577g gVar) {
        super(2, gVar);
        this.f352171b = iVar;
        this.f352172c = bpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127944f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f352170a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C127887c cVar = this.f352171b.f352183c;
            C60870cx e = C71663i.m104692e(cVar.f352002a, (C71424ay) null, new C127885a(cVar, (C69577g) null), 3);
            this.f352170a = 1;
            obj = C71663i.m104690c(e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return (List) obj;
        } else {
            C69714l.m101134b(obj);
        }
        C127930i iVar = (C127930i) obj;
        if (iVar.f352149a != 1 || !((Boolean) iVar.f352150b).booleanValue()) {
            return C69496am.f185918a;
        }
        C127947i iVar2 = this.f352171b;
        C58528ij ijVar = iVar2.f352182b;
        C34053bp bpVar = this.f352172c;
        this.f352170a = 2;
        obj = iVar2.mo108291b(ijVar, bpVar, this);
        if (obj == aVar) {
            return aVar;
        }
        return (List) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127944f(this.f352171b, this.f352172c, gVar);
    }
}
