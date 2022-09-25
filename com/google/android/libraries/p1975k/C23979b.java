package com.google.android.libraries.p1975k;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.k.b */
/* compiled from: PG */
public class C23979b implements C24019l {
    private final int featureNameHash;
    private final int javaClassNameHash;
    private final int mappingRes;

    public C23979b(int i, int i2, int i3) {
        this.featureNameHash = i;
        this.javaClassNameHash = i2;
        this.mappingRes = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C24019l)) {
            return false;
        }
        C24019l lVar = (C24019l) obj;
        if (javaClassNameHash() == lVar.javaClassNameHash() && featureNameHash() == lVar.featureNameHash() && mappingRes() == lVar.mappingRes()) {
            return true;
        }
        return false;
    }

    public int featureNameHash() {
        return this.featureNameHash;
    }

    public int hashCode() {
        return Arrays.hashCode(new int[]{javaClassNameHash(), featureNameHash(), mappingRes()});
    }

    public int javaClassNameHash() {
        return this.javaClassNameHash;
    }

    public int mappingRes() {
        return this.mappingRes;
    }

    public String toString() {
        int javaClassNameHash2 = javaClassNameHash();
        int featureNameHash2 = featureNameHash();
        int mappingRes2 = mappingRes();
        return "java_hash=" + javaClassNameHash2 + ",feature_hash=" + featureNameHash2 + ",res=" + mappingRes2;
    }
}
