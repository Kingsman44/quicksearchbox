package com.google.android.libraries.p576aq;

import com.google.android.libraries.p576aq.p577a.C10483b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.aq.t */
/* compiled from: PG */
public final class C10557t extends C10563z {

    /* renamed from: a */
    public boolean f35322a;

    /* renamed from: b */
    private final Set f35323b = new HashSet();

    /* renamed from: c */
    private final Set f35324c = new HashSet();

    /* renamed from: d */
    private final Set f35325d = new HashSet();

    /* renamed from: e */
    private final Map f35326e = new HashMap();

    /* renamed from: f */
    private final C10486ac f35327f = new C10486ac(new C10555r(this), new C10556s(this));

    /* renamed from: g */
    private final C10483b f35328g;

    /* renamed from: h */
    private Object f35329h;

    public C10557t(C10483b bVar) {
        this.f35328g = bVar;
        this.f35322a = true;
    }

    /* renamed from: a */
    public final Object mo18594a() {
        Object obj;
        if (this.f35322a || this.f35329h == null) {
            this.f35325d.clear();
            this.f35325d.addAll(this.f35324c);
            this.f35324c.clear();
            Object a = this.f35328g.mo18519a();
            if (a != null) {
                if (this.f35322a && (obj = this.f35329h) != null && (!a.equals(obj) || !m25522r(a))) {
                    mo18625p();
                }
                this.f35329h = a;
            }
            this.f35322a = false;
        }
        Object obj2 = this.f35329h;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalArgumentException("evaluate cannot return null");
    }

    /* renamed from: b */
    public final void mo18595b() {
        if (this.f35329h == null) {
            this.f35329h = mo18622m();
        }
    }

    /* renamed from: c */
    public final void mo18596c() {
        this.f35322a = true;
        for (C10563z o : this.f35324c) {
            o.mo18624o(this.f35327f);
        }
        this.f35324c.clear();
    }

    /* renamed from: e */
    public final void mo18615e(C10563z zVar) {
        if (!equals(zVar)) {
            this.f35323b.add(zVar);
            this.f35325d.remove(zVar);
            this.f35324c.add(zVar);
            zVar.mo18623n(this.f35327f);
            return;
        }
        throw new IllegalArgumentException("Found a dependency to itself. Something is very wrong.");
    }

    /* renamed from: f */
    public final void mo18616f(C10563z zVar, String str) {
        this.f35326e.put(zVar, str);
    }

    /* renamed from: s */
    public final void mo18617s() {
        super.mo18617s();
        for (C10563z o : this.f35325d) {
            o.mo18624o(this.f35327f);
        }
        if (this.f35324c.isEmpty()) {
            throw new IllegalArgumentException("The Supplier for an Expression must call get on at least one source");
        }
    }
}
