package com.bumptech.glide.load.p299c.p305f;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.f.g */
/* compiled from: PG */
public final class C5917g {

    /* renamed from: a */
    private final List f17563a = new ArrayList();

    /* renamed from: a */
    public final synchronized C5915e mo12373a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C5918h.f17564a;
        }
        for (C5916f fVar : this.f17563a) {
            if (fVar.mo12372a(cls, cls2)) {
                return fVar.f17562c;
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        throw new IllegalArgumentException("No transcoder registered to transcode from " + valueOf + " to " + valueOf2);
    }

    /* renamed from: b */
    public final synchronized List mo12374b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C5916f fVar : this.f17563a) {
            if (fVar.mo12372a(cls, cls2) && !arrayList.contains(fVar.f17561b)) {
                arrayList.add(fVar.f17561b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized void mo12375c(Class cls, Class cls2, C5915e eVar) {
        this.f17563a.add(new C5916f(cls, cls2, eVar));
    }
}
