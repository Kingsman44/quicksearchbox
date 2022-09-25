package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p762b.p764b.p765a.p766a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.b.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C12190b {
    /* renamed from: a */
    public static /* synthetic */ C58833ax m28112a(long j, C12991i iVar) {
        Object obj;
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (a == C12989g.AUTO_PROJECTED) {
            C62940bt r0 = C62942bv.checkIsLite(C13042d.f40481n);
            iVar.mo58887l(r0);
            if (iVar.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C13042d.f40481n);
                iVar.mo58887l(r02);
                Object l = iVar.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l);
                }
                if (((C13042d) obj).f40491i) {
                    return C58833ax.m90834k(Long.valueOf(j));
                }
            }
        }
        return C58836b.f156633a;
    }
}
