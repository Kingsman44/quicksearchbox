package com.google.android.libraries.assistant.auto.tng.gmm.p988a.p989a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.a.a.a */
/* compiled from: PG */
public final class C13571a {
    /* renamed from: a */
    public static C13042d m29850a(C12991i iVar) {
        Object obj;
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
            return (C13042d) obj;
        }
        throw new IllegalStateException("Assistant Request does not have an aapAssistantRequestConfigExtension");
    }
}
