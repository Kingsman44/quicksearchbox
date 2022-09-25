package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.common.p4522b.C58495hd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.i */
/* compiled from: PG */
abstract class C12842i {
    /* renamed from: c */
    static C12842i m29087c(List list) {
        HashMap hashMap = new HashMap();
        Optional empty = Optional.empty();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12842i iVar = (C12842i) it.next();
            hashMap.putAll(iVar.mo20804a());
            if (iVar.mo20805b().isPresent()) {
                empty = iVar.mo20805b();
            }
        }
        return new C12834a(C58495hd.m89898l(hashMap), empty);
    }

    /* renamed from: a */
    public abstract C58495hd mo20804a();

    /* renamed from: b */
    public abstract Optional mo20805b();
}
