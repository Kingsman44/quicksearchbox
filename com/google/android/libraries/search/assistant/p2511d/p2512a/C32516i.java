package com.google.android.libraries.search.assistant.p2511d.p2512a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.search.assistant.d.a.i */
/* compiled from: PG */
public final /* synthetic */ class C32516i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32519l f87107a;

    /* renamed from: b */
    public final /* synthetic */ C32512e f87108b;

    public /* synthetic */ C32516i(C32519l lVar, C32512e eVar) {
        this.f87107a = lVar;
        this.f87108b = eVar;
    }

    public final void run() {
        Object obj;
        C34822b bVar;
        C32519l lVar = this.f87107a;
        C32512e eVar = this.f87108b;
        C2164c cVar = (C2164c) lVar.f87115e.remove(Long.valueOf(eVar.f87098d));
        if (cVar != null) {
            int i = eVar.f87096b;
            int i2 = i != 0 ? i != 2 ? i != 3 ? 0 : 2 : 1 : 3;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == 0) {
                C62940bt r0 = C62942bv.checkIsLite(lVar.f87111a.f87085b);
                eVar.mo58887l(r0);
                Object l = eVar.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                cVar.mo5437b(obj);
            } else if (i3 == 1) {
                if (i == 3) {
                    bVar = (C34822b) eVar.f87097c;
                } else {
                    bVar = C34822b.f92358d;
                }
                cVar.mo5439d(C34830d.m63594a(bVar));
            } else if (i3 == 2) {
                cVar.mo5439d(new C62974ct("Outcome not set"));
            }
        }
    }
}
