package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agy */
/* compiled from: PG */
final class agy implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Type f20636a;

    /* renamed from: b */
    private final Type f20637b;

    /* renamed from: c */
    private final Type[] f20638c;

    public agy(Type type, Type type2, Type... typeArr) {
        Type type3;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            C6731ax.m18029e(z);
        }
        if (type == null) {
            type3 = null;
        } else {
            type3 = aha.m18711b(type);
        }
        this.f20636a = type3;
        this.f20637b = aha.m18711b(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f20638c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            C6731ax.m18030f(this.f20638c[i]);
            aha.m18720k(this.f20638c[i]);
            Type[] typeArr3 = this.f20638c;
            typeArr3[i] = aha.m18711b(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && aha.m18713d(this, (ParameterizedType) obj);
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f20638c.clone();
    }

    public final Type getOwnerType() {
        return this.f20636a;
    }

    public final Type getRawType() {
        return this.f20637b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f20638c) ^ this.f20637b.hashCode();
        Type type = this.f20636a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.f20638c.length;
        if (length == 0) {
            return aha.m18714e(this.f20637b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(aha.m18714e(this.f20637b));
        sb.append("<");
        sb.append(aha.m18714e(this.f20638c[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(aha.m18714e(this.f20638c[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
