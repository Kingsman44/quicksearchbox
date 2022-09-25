package com.google.android.libraries.p576aq;

import android.os.Looper;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.p576aq.p577a.C10483b;
import com.google.common.p4522b.C58471gg;
import com.google.protobuf.C62942bv;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.aq.z */
/* compiled from: PG */
public abstract class C10563z {

    /* renamed from: a */
    private static final Deque f35338a = new ArrayDeque();

    /* renamed from: b */
    private final Set f35339b = new LinkedHashSet();

    /* renamed from: c */
    private final Set f35340c = new LinkedHashSet();

    /* renamed from: d */
    private boolean f35341d;

    /* renamed from: e */
    private boolean f35342e;

    static {
        Pattern.compile("id/(.*?)\\}");
        new ArrayList();
        new ArrayList();
    }

    public C10563z() {
        C10485ab.m25463b();
    }

    /* renamed from: f */
    private final void m25515f(int i, int i2) {
        if (i == 0) {
            mo18595b();
        } else if (i2 == 0) {
            mo18596c();
        }
    }

    /* renamed from: h */
    public static C10542e m25516h(Object obj) {
        return new C10543f(obj);
    }

    /* renamed from: i */
    public static C10557t m25517i(C10483b bVar) {
        return new C10557t(bVar);
    }

    /* renamed from: j */
    public static C10558u m25518j(Object obj) {
        return new C10558u(obj);
    }

    /* renamed from: k */
    public static C10563z m25519k(C10563z zVar, C147454r rVar) {
        return new C10540c(zVar, rVar);
    }

    /* renamed from: l */
    public static C10563z m25520l(Object obj) {
        return new C10554q(obj);
    }

    /* renamed from: q */
    public static void m25521q() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Sorcerer should only be used on the main thread");
        }
    }

    /* renamed from: r */
    static boolean m25522r(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String) || (obj instanceof Void) || (obj instanceof C58471gg) || (obj instanceof C62942bv);
    }

    /* renamed from: a */
    public abstract Object mo18594a();

    /* renamed from: b */
    public void mo18595b() {
    }

    /* renamed from: c */
    public void mo18596c() {
    }

    /* renamed from: e */
    public void mo18615e(C10563z zVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo18621g() {
        return this.f35339b.size();
    }

    /* renamed from: m */
    public final Object mo18622m() {
        try {
            m25521q();
            this.f35341d = true;
            f35338a.push(this);
            Object a = mo18594a();
            if (a != null) {
                mo18617s();
                if (this.f35342e) {
                    this.f35342e = false;
                    mo18625p();
                }
                return a;
            }
            throw new NullPointerException("onGet cannot return null");
        } catch (Exception e) {
            f35338a.clear();
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo18623n(C10486ac acVar) {
        m25521q();
        int g = mo18621g();
        this.f35339b.add(acVar);
        int g2 = mo18621g();
        if (g != g2) {
            m25515f(g, g2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo18624o(C10486ac acVar) {
        m25521q();
        int g = mo18621g();
        this.f35339b.remove(acVar);
        int g2 = mo18621g();
        if (g != g2) {
            m25515f(g, g2);
        }
    }

    /* renamed from: p */
    public final void mo18625p() {
        m25521q();
        if (!this.f35341d) {
            this.f35340c.clear();
            this.f35340c.addAll(this.f35339b);
            Set<C10486ac> set = this.f35340c;
            for (C10486ac acVar : set) {
                if (!acVar.f35263c && !acVar.f35264d) {
                    acVar.f35263c = true;
                    Runnable runnable = acVar.f35261a;
                    if (runnable != null) {
                        ((C10555r) runnable).f35320a.f35322a = true;
                    }
                }
            }
            for (C10486ac acVar2 : set) {
                if (acVar2.f35263c && !acVar2.f35264d) {
                    acVar2.f35264d = true;
                    acVar2.f35262b.run();
                    acVar2.f35264d = false;
                    acVar2.f35263c = false;
                }
            }
            return;
        }
        this.f35342e = true;
    }

    /* renamed from: s */
    public void mo18617s() {
        Deque deque;
        while (true) {
            deque = f35338a;
            if (((C10563z) deque.getFirst()).equals(this)) {
                break;
            }
            mo18615e((C10563z) deque.pop());
        }
        if (deque.size() == 1) {
            deque.clear();
        }
        this.f35341d = false;
    }
}
