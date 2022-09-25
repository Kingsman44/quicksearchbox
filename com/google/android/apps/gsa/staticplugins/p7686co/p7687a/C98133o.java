package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90997f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.apps.gsa.sidekick.shared.util.C92001t;
import com.google.android.apps.gsa.sidekick.shared.util.C92003v;
import com.google.android.apps.gsa.sidekick.shared.util.C92005x;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.o */
/* compiled from: PG */
public final /* synthetic */ class C98133o implements C90997f {

    /* renamed from: a */
    public static final /* synthetic */ C98133o f274039a = new C98133o();

    private /* synthetic */ C98133o() {
    }

    /* renamed from: a */
    public final void mo84666a(C91006f fVar, C91000i iVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C92003v.f256505b);
        iVar.mo58887l(r0);
        Object l = iVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        for (C92005x h : (List) obj) {
            C92001t.m151015h(fVar, "entry", h);
        }
    }
}
