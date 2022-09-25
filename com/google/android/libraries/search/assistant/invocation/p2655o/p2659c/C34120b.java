package com.google.android.libraries.search.assistant.invocation.p2655o.p2659c;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.c.b */
/* compiled from: PG */
public final class C34120b {

    /* renamed from: a */
    public final C34119a f90872a;

    /* renamed from: b */
    public final Object f90873b;

    /* renamed from: c */
    public final String f90874c;

    /* renamed from: d */
    public final long f90875d;

    public C34120b(C34119a aVar, Object obj, String str, long j) {
        C69664n.m101061g(aVar, "client");
        C69664n.m101061g(str, "connectionId");
        this.f90872a = aVar;
        this.f90873b = obj;
        this.f90874c = str;
        this.f90875d = j;
    }

    /* renamed from: a */
    public static /* synthetic */ C34120b m62740a(C34120b bVar, C34119a aVar, Object obj, long j, int i) {
        if ((i & 1) != 0) {
            aVar = bVar.f90872a;
        }
        C34119a aVar2 = aVar;
        if ((i & 2) != 0) {
            obj = bVar.f90873b;
        }
        Object obj2 = obj;
        String str = (i & 4) != 0 ? bVar.f90874c : null;
        if ((i & 8) != 0) {
            j = bVar.f90875d;
        }
        C69664n.m101061g(aVar2, "client");
        C69664n.m101061g(str, "connectionId");
        return new C34120b(aVar2, obj2, str, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34120b)) {
            return false;
        }
        C34120b bVar = (C34120b) obj;
        return C69664n.m101066l(this.f90872a, bVar.f90872a) && C69664n.m101066l(this.f90873b, bVar.f90873b) && C69664n.m101066l(this.f90874c, bVar.f90874c) && this.f90875d == bVar.f90875d;
    }

    public final int hashCode() {
        int hashCode = this.f90872a.hashCode() * 31;
        Object obj = this.f90873b;
        int hashCode2 = obj == null ? 0 : obj.hashCode();
        int hashCode3 = this.f90874c.hashCode();
        long j = this.f90875d;
        return ((((hashCode + hashCode2) * 31) + hashCode3) * 31) + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        C34119a aVar = this.f90872a;
        long j = this.f90875d;
        String a = C33914a.m62566a(this.f90873b);
        return "[client=" + aVar + ", epoch=" + j + ", configuration=@" + a + "]";
    }
}
