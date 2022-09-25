package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* renamed from: com.google.common.b.gl */
/* compiled from: PG */
public final class C58476gl extends C58528ij {

    /* renamed from: a */
    private final transient EnumSet f156103a;

    /* renamed from: b */
    private transient int f156104b;

    public C58476gl(EnumSet enumSet) {
        this.f156103a = enumSet;
    }

    /* renamed from: b */
    public static C58528ij m89803b(EnumSet enumSet) {
        int size = enumSet.size();
        if (size == 0) {
            return C58733pz.f156496a;
        }
        if (size != 1) {
            return new C58476gl(enumSet);
        }
        return new C58759qy(C58557jl.m90133n(enumSet));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    public final boolean contains(Object obj) {
        return this.f156103a.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof C58476gl) {
            collection = ((C58476gl) collection).f156103a;
        }
        return this.f156103a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58476gl) {
            obj = ((C58476gl) obj).f156103a;
        }
        return this.f156103a.equals(obj);
    }

    public final int hashCode() {
        int i = this.f156104b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f156103a.hashCode();
        this.f156104b = hashCode;
        return hashCode;
    }

    public final boolean isEmpty() {
        return this.f156103a.isEmpty();
    }

    /* renamed from: lA */
    public final C58800sl iterator() {
        return C58570jy.m90153e(this.f156103a.iterator());
    }

    public final int size() {
        return this.f156103a.size();
    }

    public final String toString() {
        return this.f156103a.toString();
    }

    /* renamed from: v */
    public final boolean mo55230v() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58475gk(this.f156103a);
    }
}
