package com.google.p4591e.p4592a.p4603d;

import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.e.a.d.r */
/* compiled from: PG */
public class C61064r extends AbstractMap implements Cloneable {

    /* renamed from: b */
    Map f165339b = new C61050d();

    /* renamed from: c */
    final C61053g f165340c;

    public C61064r() {
        EnumSet<E> noneOf = EnumSet.noneOf(C61063q.class);
        this.f165340c = C61053g.m93405a(getClass(), noneOf.contains(C61063q.f165337a));
    }

    /* renamed from: b */
    public C61064r clone() {
        try {
            C61064r rVar = (C61064r) super.clone();
            C61054h.m93414h(this, rVar);
            rVar.f165339b = (Map) C61054h.m93407a(this.f165339b);
            return rVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public void mo57535c(String str, Object obj) {
        C61060n b = this.f165340c.mo57610b(str);
        if (b != null) {
            C61060n.m93426e(b.f165330b, this, obj);
            return;
        }
        if (this.f165340c.f165294b) {
            str = str.toLowerCase(Locale.US);
        }
        this.f165339b.put(str, obj);
    }

    public final Set entrySet() {
        return new C61062p(this);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C61060n b = this.f165340c.mo57610b(str);
        if (b != null) {
            return C61060n.m93425d(b.f165330b, this);
        }
        if (this.f165340c.f165294b) {
            str = str.toLowerCase(Locale.US);
        }
        return this.f165339b.get(str);
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        C61060n b = this.f165340c.mo57610b(str);
        if (b != null) {
            Object d = C61060n.m93425d(b.f165330b, this);
            C61060n.m93426e(b.f165330b, this, obj2);
            return d;
        }
        if (this.f165340c.f165294b) {
            str = str.toLowerCase(Locale.US);
        }
        return this.f165339b.put(str, obj2);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            mo57535c((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f165340c.mo57610b(str) == null) {
            if (this.f165340c.f165294b) {
                str = str.toLowerCase(Locale.US);
            }
            return this.f165339b.remove(str);
        }
        throw new UnsupportedOperationException();
    }
}
