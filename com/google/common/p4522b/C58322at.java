package com.google.common.p4522b;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.at */
/* compiled from: PG */
public class C58322at extends C58307ae implements C58743qi {
    private static final long serialVersionUID = 7431625294878419160L;

    protected C58322at(Map map) {
        super(map);
    }

    /* renamed from: A */
    public final /* synthetic */ Collection mo54948A() {
        return (Set) super.mo54948A();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Collection mo54900a() {
        throw null;
    }

    /* renamed from: b */
    public final /* synthetic */ Collection mo54901b() {
        return Collections.emptySet();
    }

    /* renamed from: c */
    public final /* synthetic */ Collection mo54902c(Object obj) {
        return (Set) super.mo54902c(obj);
    }

    /* renamed from: e */
    public Collection mo54904e(Collection collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    /* renamed from: f */
    public Collection mo54905f(Object obj, Collection collection) {
        return new C58305ac(this, obj, (Set) collection);
    }

    /* renamed from: g */
    public final Set mo54985g() {
        return (Set) super.mo54948A();
    }

    /* renamed from: h */
    public final Set mo54986h(Object obj) {
        return (Set) super.mo54902c(obj);
    }

    /* renamed from: i */
    public final Set mo54987i(Object obj) {
        return (Set) super.mo54903d(obj);
    }
}
