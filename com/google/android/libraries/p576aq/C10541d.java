package com.google.android.libraries.p576aq;

import android.util.Property;
import com.google.common.base.C58832aw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.aq.d */
/* compiled from: PG */
public final class C10541d extends C10542e {

    /* renamed from: a */
    private final Property f35294a;

    /* renamed from: b */
    private final List f35295b;

    @SafeVarargs
    public C10541d(Property property, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        this.f35295b = arrayList;
        this.f35294a = property;
        arrayList.addAll(Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final Object mo18594a() {
        return this.f35294a.get(this.f35295b.get(0));
    }

    /* renamed from: d */
    public final boolean mo18597d(Object obj) {
        boolean z = false;
        for (Object next : this.f35295b) {
            if (!obj.equals(this.f35294a.get(next)) || !m25522r(obj)) {
                this.f35294a.set(next, obj);
                z = true;
            }
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10541d) {
            C10541d dVar = (C10541d) obj;
            if (!C58832aw.m90831a(this.f35294a, dVar.f35294a) || !C58832aw.m90831a(this.f35295b, dVar.f35295b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35294a, this.f35295b});
    }
}
