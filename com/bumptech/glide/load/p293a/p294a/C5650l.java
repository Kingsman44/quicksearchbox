package com.bumptech.glide.load.p293a.p294a;

import android.util.Log;
import com.bumptech.glide.p291h.C5630q;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.a.a.l */
/* compiled from: PG */
public final class C5650l implements C5640b {

    /* renamed from: a */
    private final C5646h f17021a;

    /* renamed from: b */
    private final C5649k f17022b;

    /* renamed from: c */
    private final Map f17023c;

    /* renamed from: d */
    private final Map f17024d;

    /* renamed from: e */
    private final int f17025e;

    /* renamed from: f */
    private int f17026f;

    public C5650l() {
        this.f17021a = new C5646h();
        this.f17022b = new C5649k();
        this.f17023c = new HashMap();
        this.f17024d = new HashMap();
        this.f17025e = 4194304;
    }

    /* renamed from: f */
    private final C5639a m14670f(Class cls) {
        C5639a aVar = (C5639a) this.f17024d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C5647i();
            } else if (cls.equals(byte[].class)) {
                aVar = new C5644f();
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            this.f17024d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: g */
    private final Object m14671g(C5648j jVar, Class cls) {
        C5639a f = m14670f(cls);
        Object a = this.f17021a.mo12120a(jVar);
        if (a != null) {
            this.f17026f -= f.mo12101a(a) * f.mo12102b();
            m14673i(f.mo12101a(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(f.mo12104d(), 2)) {
            Log.v(f.mo12104d(), "Allocated " + jVar.f17018a + " bytes");
        }
        return f.mo12103c(jVar.f17018a);
    }

    /* renamed from: h */
    private final NavigableMap m14672h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f17023c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f17023c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: i */
    private final void m14673i(int i, Class cls) {
        NavigableMap h = m14672h(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) h.get(valueOf);
        if (num == null) {
            String obj = toString();
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + obj);
        } else if (num.intValue() == 1) {
            h.remove(valueOf);
        } else {
            h.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: j */
    private final void m14674j(int i) {
        while (this.f17026f > i) {
            Object b = this.f17021a.mo12121b();
            C5630q.m14607d(b, "Argument must not be null");
            C5639a f = m14670f(b.getClass());
            this.f17026f -= f.mo12101a(b) * f.mo12102b();
            m14673i(f.mo12101a(b), b.getClass());
            if (Log.isLoggable(f.mo12104d(), 2)) {
                Log.v(f.mo12104d(), "evicted: " + f.mo12101a(b));
            }
        }
    }

    /* renamed from: a */
    public final synchronized Object mo12105a(int i, Class cls) {
        C5648j jVar;
        Integer num = (Integer) m14672h(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f17026f;
            if (i2 != 0) {
                if (this.f17025e / i2 < 2) {
                    if (num.intValue() > i * 8) {
                    }
                }
            }
            jVar = this.f17022b.mo12128d(num.intValue(), cls);
        }
        jVar = this.f17022b.mo12128d(i, cls);
        return m14671g(jVar, cls);
    }

    /* renamed from: b */
    public final synchronized void mo12106b() {
        m14674j(0);
    }

    /* renamed from: c */
    public final synchronized void mo12107c(Object obj) {
        Class<?> cls = obj.getClass();
        C5639a f = m14670f(cls);
        int a = f.mo12101a(obj);
        int b = f.mo12102b() * a;
        int i = 1;
        if (b <= (this.f17025e >> 1)) {
            C5648j d = this.f17022b.mo12128d(a, cls);
            this.f17021a.mo12122c(d, obj);
            NavigableMap h = m14672h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(d.f17018a));
            Integer valueOf = Integer.valueOf(d.f17018a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i));
            this.f17026f += b;
            m14674j(this.f17025e);
        }
    }

    /* renamed from: d */
    public final synchronized void mo12108d(int i) {
        if (i >= 40) {
            mo12106b();
        } else if (i >= 20 || i == 15) {
            m14674j(this.f17025e >> 1);
        }
    }

    /* renamed from: e */
    public final synchronized Object mo12109e(Class cls) {
        return m14671g(this.f17022b.mo12128d(8, cls), cls);
    }

    public C5650l(int i) {
        this.f17021a = new C5646h();
        this.f17022b = new C5649k();
        this.f17023c = new HashMap();
        this.f17024d = new HashMap();
        this.f17025e = i;
    }
}
