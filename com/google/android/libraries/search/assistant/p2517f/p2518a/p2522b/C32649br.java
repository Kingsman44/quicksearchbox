package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import android.util.LruCache;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.common.p4522b.C58671nr;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.br */
/* compiled from: PG */
public final class C32649br extends LruCache {

    /* renamed from: a */
    final /* synthetic */ C32650bs f87514a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32649br(int i, C32650bs bsVar) {
        super(i);
        this.f87514a = bsVar;
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C32810be beVar = (C32810be) obj;
        C32647bp bpVar = (C32647bp) obj2;
        C32647bp bpVar2 = (C32647bp) obj3;
        C69664n.m101061g(beVar, "key");
        if (bpVar2 == null) {
            C58671nr nrVar = this.f87514a.f87515a;
            C32796ar arVar = beVar.f87996b;
            if (arVar == null) {
                arVar = C32796ar.f87973c;
            }
            nrVar.mo54956I(arVar, beVar);
        }
    }

    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        C32810be beVar = (C32810be) obj;
        C32647bp bpVar = (C32647bp) obj2;
        C69664n.m101061g(beVar, "key");
        C69664n.m101061g(bpVar, "value");
        return beVar.getSerializedSize() + bpVar.f87509b;
    }
}
