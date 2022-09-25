package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.base.ai */
/* compiled from: PG */
public final class C58818ai extends C58815af implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C58817ah f156608a;

    /* renamed from: b */
    private final C58815af f156609b;

    public C58818ai(C58817ah ahVar, C58815af afVar) {
        ahVar.getClass();
        this.f156608a = ahVar;
        this.f156609b = afVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo56071a(Object obj) {
        return this.f156609b.mo56076c(this.f156608a.apply(obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo56072b(Object obj, Object obj2) {
        return this.f156609b.mo56077d(this.f156608a.apply(obj), this.f156608a.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58818ai) {
            C58818ai aiVar = (C58818ai) obj;
            return this.f156608a.equals(aiVar.f156608a) && this.f156609b.equals(aiVar.f156609b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f156608a, this.f156609b});
    }

    public final String toString() {
        return this.f156609b + ".onResultOf(" + this.f156608a + ")";
    }
}
