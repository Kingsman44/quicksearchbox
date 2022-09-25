package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: com.google.common.b.eo */
/* compiled from: PG */
public final class C58425eo extends C58444fg implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final int f156037a;

    /* renamed from: b */
    private final Queue f156038b;

    public C58425eo(int i) {
        C58838bb.m90871f(i >= 0, "maxSize (%s) must >= 0", i);
        this.f156038b = new ArrayDeque(i);
        this.f156037a = i;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.f156037a) {
            return C58570jy.m90163o(this, collection.iterator());
        }
        clear();
        return C58557jl.m90136q(this, C58557jl.m90126g(collection, size - this.f156037a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Collection mo55040b() {
        return this.f156038b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Queue mo55234c() {
        return this.f156038b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156038b;
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    public final boolean add(Object obj) {
        obj.getClass();
        if (this.f156037a == 0) {
            return true;
        }
        if (size() == this.f156037a) {
            this.f156038b.remove();
        }
        this.f156038b.add(obj);
        return true;
    }
}
