package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.storage.j */
/* compiled from: PG */
public final class C42689j implements Comparable {

    /* renamed from: a */
    public final String f111906a;

    /* renamed from: b */
    public final C63088z f111907b;

    public C42689j(String str, C63088z zVar) {
        this.f111906a = str;
        this.f111907b = zVar;
        new ArrayList();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f111906a.compareTo(((C42689j) obj).f111906a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42689j) {
            C42689j jVar = (C42689j) obj;
            return this.f111906a.equals(jVar.f111906a) && C58832aw.m90831a(this.f111907b, jVar.f111907b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111906a, this.f111907b});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("id", this.f111906a);
        b.mo56102b("protoBytes", this.f111907b.mo59174N());
        return b.toString();
    }
}
