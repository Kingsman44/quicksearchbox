package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.w */
/* compiled from: PG */
public final /* synthetic */ class C17733w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17695aa f50953a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f50954b;

    public /* synthetic */ C17733w(C17695aa aaVar, C58480gp gpVar) {
        this.f50953a = aaVar;
        this.f50954b = gpVar;
    }

    public final Object apply(Object obj) {
        C17695aa aaVar = this.f50953a;
        Void voidR = (Void) obj;
        C58485gu f = this.f50954b.mo55394f();
        C58976aa aaVar2 = C58975e.f156826a;
        int i = ((C58724pq) f).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C48923y yVar = (C48923y) f.get(i2);
            C48919u uVar = yVar.f126603b;
            if (uVar == null) {
                uVar = C48919u.f126586g;
            }
            C48900b a = C48900b.m85301a(uVar.f126589b);
            if (a == null) {
                a = C48900b.UNSPECIFIED;
            }
            if (!aaVar.f50876b.containsKey(a)) {
                C59104x d = C17695aa.f50875a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CtfReceiver");
                ((C59052c) ((C59052c) d).mo56372aa(47030)).mo56387q("Cannot find the client: %s", a.f126548g);
            } else {
                C17731u uVar2 = new C17731u(aaVar, a, yVar);
                C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(uVar2), aaVar.f50877c), "Notifying client: %d", Integer.valueOf(a.f126548g));
            }
        }
        return null;
    }
}
