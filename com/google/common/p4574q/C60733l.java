package com.google.common.p4574q;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58438fa;
import com.google.common.p4522b.C58585km;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58671nr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.q.l */
/* compiled from: PG */
public final class C60733l extends C58438fa implements Serializable, C58585km {

    /* renamed from: a */
    final C58585km f164740a;

    /* renamed from: b */
    transient Collection f164741b;

    /* renamed from: c */
    transient Map f164742c;

    public C60733l(C58585km kmVar) {
        kmVar.getClass();
        this.f164740a = kmVar;
    }

    /* renamed from: A */
    public final Collection mo54948A() {
        Collection collection = this.f164741b;
        if (collection != null) {
            return collection;
        }
        C60729h hVar = new C60729h(this.f164740a.mo54948A());
        this.f164741b = hVar;
        return hVar;
    }

    /* renamed from: C */
    public final Map mo54950C() {
        Map map = this.f164742c;
        if (map != null) {
            return map;
        }
        C60732k kVar = new C60732k(this, this.f164740a.mo54950C());
        this.f164742c = kVar;
        return kVar;
    }

    /* renamed from: H */
    public final boolean mo54955H(C58671nr nrVar) {
        boolean z = false;
        for (Map.Entry entry : nrVar.mo54948A()) {
            z |= mo54920x(entry.getKey(), entry.getValue());
        }
        return z;
    }

    /* renamed from: J */
    public final void mo54957J(Object obj, Iterable iterable) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C58585km mo55275b() {
        return this.f164740a;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Collection mo54902c(Object obj) {
        return mo54902c(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C58671nr mo55276d() {
        return this.f164740a;
    }

    /* renamed from: g */
    public final List mo55277g(Object obj) {
        return new C60730i(this.f164740a.mo55277g(obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f164740a;
    }

    /* renamed from: i */
    public final List mo55279i(Object obj, Iterable iterable) {
        C58585km kmVar = this.f164740a;
        ArrayList b = C58597ky.m90211b(iterable);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = b.get(i);
            C58838bb.m90863D(obj, "null key in entry (%s, %s)", obj, obj2);
            C58838bb.m90863D(obj2, "null value in entry (%s, %s)", obj, obj2);
        }
        return kmVar.mo55279i(obj, b);
    }

    /* renamed from: x */
    public final boolean mo54920x(Object obj, Object obj2) {
        C58838bb.m90863D(obj, "null key in entry (%s, %s)", obj, obj2);
        C58838bb.m90863D(obj2, "null value in entry (%s, %s)", obj, obj2);
        return this.f164740a.mo54920x(obj, obj2);
    }
}
