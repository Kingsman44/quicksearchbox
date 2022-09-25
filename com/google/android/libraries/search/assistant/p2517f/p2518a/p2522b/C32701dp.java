package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SessionImpl$2", mo61344c = "SessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {94, 96})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dp */
/* compiled from: PG */
final class C32701dp extends C69572j implements C69630p {

    /* renamed from: a */
    int f87639a;

    /* renamed from: b */
    final /* synthetic */ C71604be f87640b;

    /* renamed from: c */
    final /* synthetic */ C32716ed f87641c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32701dp(C71604be beVar, C32716ed edVar, C69577g gVar) {
        super(2, gVar);
        this.f87640b = beVar;
        this.f87641c = edVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32701dp) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f87639a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71604be beVar = this.f87640b;
            this.f87639a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C32697dl dlVar = (C32697dl) obj;
        if (dlVar != null) {
            C32707dv dvVar = C32716ed.f87684a;
            C32716ed edVar = this.f87641c;
            List list = edVar.f87687d;
            C32680cv cvVar = edVar.f87688e;
            C32750fk fkVar = edVar.f87689f;
            C32700do doVar = new C32700do(edVar);
            this.f87639a = 2;
            if (dvVar.mo38261a(list, cvVar, fkVar, dlVar, doVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32701dp(this.f87640b, this.f87641c, gVar);
    }
}
