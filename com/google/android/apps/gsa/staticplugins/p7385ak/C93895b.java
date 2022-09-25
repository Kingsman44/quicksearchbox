package com.google.android.apps.gsa.staticplugins.p7385ak;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p5129p.p5131b.C65761as;
import java.util.HashMap;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.b */
/* compiled from: PG */
public final /* synthetic */ class C93895b implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C93895b f262242a = new C93895b();

    private /* synthetic */ C93895b() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        HashMap hashMap = new HashMap();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C65761as asVar = (C65761as) guVar.get(i);
            C51058ev evVar = asVar.f178779b;
            if (evVar == null) {
                evVar = C51058ev.f132941o;
            }
            String str = evVar.f132944b;
            if (!hashMap.containsKey(str) || ((C65761as) Objects.requireNonNull((C65761as) hashMap.get(str))).f178780c <= asVar.f178780c) {
                C51058ev evVar2 = asVar.f178779b;
                if (evVar2 == null) {
                    evVar2 = C51058ev.f132941o;
                }
                hashMap.put(evVar2.f132944b, asVar);
            }
        }
        return C58495hd.m89898l(hashMap);
    }
}
