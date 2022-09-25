package com.facebook.litho.widget;

import com.facebook.litho.C6154cb;
import com.facebook.litho.C6407q;
import com.facebook.litho.p334j.C6399b;
import com.facebook.litho.p334j.C6400c;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.DesugarCollections;

/* renamed from: com.facebook.litho.widget.b */
/* compiled from: PG */
public abstract class C6441b implements C6491cw {

    /* renamed from: a */
    private final Map f19089a;

    /* renamed from: b */
    private Map f19090b = null;

    protected C6441b(C6414a aVar) {
        this.f19089a = aVar.f19038a;
    }

    /* renamed from: a */
    public final int mo13519a() {
        Map map = this.f19089a;
        if (map == null || !map.containsKey("span_size")) {
            return 1;
        }
        return ((Integer) this.f19089a.get("span_size")).intValue();
    }

    /* renamed from: b */
    public int mo13520b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public C6407q mo13521c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public C6154cb mo13522d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C6399b mo13523e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public C6400c mo13524f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final Object mo13525g(String str) {
        Map map = this.f19089a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: h */
    public String mo13526h() {
        return null;
    }

    /* renamed from: i */
    public final void mo13527i() {
    }

    /* renamed from: j */
    public void mo13528j(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public boolean mo13529k() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo13530l() {
        Map map = this.f19089a;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) this.f19089a.get("is_full_span")).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo13531m() {
        Map map = this.f19089a;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) this.f19089a.get("is_sticky")).booleanValue();
    }

    /* renamed from: n */
    public boolean mo13532n() {
        return false;
    }

    /* renamed from: o */
    public boolean mo13533o() {
        return false;
    }

    /* renamed from: p */
    public C21215m mo13534p() {
        return null;
    }

    /* renamed from: q */
    public final void mo13535q(Object obj) {
        if (this.f19090b == null) {
            this.f19090b = DesugarCollections.synchronizedMap(new HashMap());
        }
        this.f19090b.put("section_global_key", obj);
    }
}
