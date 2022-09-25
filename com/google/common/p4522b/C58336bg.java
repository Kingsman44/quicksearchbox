package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.b.bg */
/* compiled from: PG */
public final class C58336bg extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58817ah f155905a;

    /* renamed from: b */
    final C58710pc f155906b;

    public C58336bg(C58817ah ahVar, C58710pc pcVar) {
        ahVar.getClass();
        this.f155905a = ahVar;
        this.f155906b = pcVar;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f155906b.compare(this.f155905a.apply(obj), this.f155905a.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58336bg) {
            C58336bg bgVar = (C58336bg) obj;
            return this.f155905a.equals(bgVar.f155905a) && this.f155906b.equals(bgVar.f155906b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f155905a, this.f155906b});
    }

    public final String toString() {
        return this.f155906b + ".onResultOf(" + this.f155905a + ")";
    }
}
