package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agz */
/* compiled from: PG */
final class agz implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f20639a;

    /* renamed from: b */
    private final Type f20640b;

    public agz(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        boolean z = true;
        C6731ax.m18029e(length <= 1);
        C6731ax.m18029e(typeArr.length == 1);
        if (length == 1) {
            C6731ax.m18030f(typeArr2[0]);
            aha.m18720k(typeArr2[0]);
            C6731ax.m18029e(typeArr[0] != Object.class ? false : z);
            this.f20640b = aha.m18711b(typeArr2[0]);
            this.f20639a = Object.class;
            return;
        }
        C6731ax.m18030f(typeArr[0]);
        aha.m18720k(typeArr[0]);
        this.f20640b = null;
        this.f20639a = aha.m18711b(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && aha.m18713d(this, (WildcardType) obj);
    }

    public final Type[] getLowerBounds() {
        Type type = this.f20640b;
        if (type == null) {
            return aha.f20644a;
        }
        return new Type[]{type};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.f20639a};
    }

    public final int hashCode() {
        Type type = this.f20640b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f20639a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f20640b;
        if (type != null) {
            return "? super ".concat(String.valueOf(aha.m18714e(type)));
        }
        Type type2 = this.f20639a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends ".concat(String.valueOf(aha.m18714e(type2)));
    }
}
