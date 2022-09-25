package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.h */
/* compiled from: PG */
public final class C142701h {

    /* renamed from: a */
    public final C142758k f387210a;

    /* renamed from: b */
    public boolean f387211b;

    /* renamed from: c */
    public long f387212c;

    /* renamed from: d */
    public long f387213d;

    /* renamed from: e */
    public long f387214e;

    /* renamed from: f */
    public boolean f387215f;

    /* renamed from: g */
    public final Map f387216g;

    /* renamed from: h */
    public final List f387217h;

    /* renamed from: i */
    public final C144006f f387218i;

    /* renamed from: j */
    private long f387219j;

    /* renamed from: k */
    private long f387220k;

    public C142701h(C142701h hVar) {
        this.f387210a = hVar.f387210a;
        this.f387218i = hVar.f387218i;
        this.f387212c = hVar.f387212c;
        this.f387213d = hVar.f387213d;
        this.f387214e = hVar.f387214e;
        this.f387219j = hVar.f387219j;
        this.f387220k = hVar.f387220k;
        this.f387217h = new ArrayList(hVar.f387217h);
        this.f387216g = new HashMap(hVar.f387216g.size());
        for (Map.Entry entry : hVar.f387216g.entrySet()) {
            C142757j d = m231529d((Class) entry.getKey());
            ((C142757j) entry.getValue()).mo117461b(d);
            this.f387216g.put((Class) entry.getKey(), d);
        }
    }

    /* renamed from: d */
    private static C142757j m231529d(Class cls) {
        try {
            return (C142757j) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (e instanceof ReflectiveOperationException) {
                throw new IllegalArgumentException("Linkage exception", e);
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final C142757j mo117482a(Class cls) {
        C142757j jVar = (C142757j) this.f387216g.get(cls);
        if (jVar != null) {
            return jVar;
        }
        C142757j d = m231529d(cls);
        this.f387216g.put(cls, d);
        return d;
    }

    /* renamed from: b */
    public final C142757j mo117483b(Class cls) {
        return (C142757j) this.f387216g.get(cls);
    }

    /* renamed from: c */
    public final void mo117484c(C142757j jVar) {
        C143919bh.m233958a(jVar);
        Class<?> cls = jVar.getClass();
        if (cls.getSuperclass() == C142757j.class) {
            jVar.mo117461b(mo117482a(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    public C142701h(C142758k kVar, C144006f fVar) {
        this.f387210a = kVar;
        this.f387218i = fVar;
        this.f387219j = 1800000;
        this.f387220k = 3024000000L;
        this.f387216g = new HashMap();
        this.f387217h = new ArrayList();
    }
}
