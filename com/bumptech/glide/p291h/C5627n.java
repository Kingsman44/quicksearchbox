package com.bumptech.glide.p291h;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.h.n */
/* compiled from: PG */
public class C5627n {

    /* renamed from: a */
    private final Map f16966a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f16967b;

    /* renamed from: c */
    private long f16968c;

    public C5627n(long j) {
        this.f16967b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo12075a(Object obj) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12076c(Object obj, Object obj2) {
    }

    /* renamed from: e */
    public final synchronized long mo12077e() {
        return this.f16967b;
    }

    /* renamed from: f */
    public final synchronized Object mo12078f(Object obj) {
        C5626m mVar = (C5626m) this.f16966a.get(obj);
        if (mVar == null) {
            return null;
        }
        return mVar.f16964a;
    }

    /* renamed from: g */
    public final synchronized Object mo12079g(Object obj, Object obj2) {
        C5626m mVar;
        int a = mo12075a(obj2);
        long j = (long) a;
        if (j >= this.f16967b) {
            mo12076c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f16968c += j;
        }
        Map map = this.f16966a;
        if (obj2 == null) {
            mVar = null;
        } else {
            mVar = new C5626m(obj2, a);
        }
        C5626m mVar2 = (C5626m) map.put(obj, mVar);
        if (mVar2 != null) {
            this.f16968c -= (long) mVar2.f16965b;
            if (!mVar2.f16964a.equals(obj2)) {
                mo12076c(obj, mVar2.f16964a);
            }
        }
        mo12081i(this.f16967b);
        if (mVar2 == null) {
            return null;
        }
        return mVar2.f16964a;
    }

    /* renamed from: h */
    public final synchronized Object mo12080h(Object obj) {
        C5626m mVar = (C5626m) this.f16966a.remove(obj);
        if (mVar == null) {
            return null;
        }
        this.f16968c -= (long) mVar.f16965b;
        return mVar.f16964a;
    }

    /* renamed from: i */
    public final synchronized void mo12081i(long j) {
        while (this.f16968c > j) {
            Iterator it = this.f16966a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C5626m mVar = (C5626m) entry.getValue();
            this.f16968c -= (long) mVar.f16965b;
            Object key = entry.getKey();
            it.remove();
            mo12076c(key, mVar.f16964a);
        }
    }
}
