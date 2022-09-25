package com.google.android.libraries.search.assistant.invocation.p2651n.p2652a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.a.c */
/* compiled from: PG */
public final class C33976c extends Exception {

    /* renamed from: a */
    private final C33974a f90593a;

    /* renamed from: b */
    private final String f90594b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33976c(C33974a aVar, String str) {
        super(str);
        C69664n.m101061g(aVar, "type");
        this.f90593a = aVar;
        this.f90594b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33976c)) {
            return false;
        }
        C33976c cVar = (C33976c) obj;
        return this.f90593a == cVar.f90593a && C69664n.m101066l(this.f90594b, cVar.f90594b);
    }

    public final String getMessage() {
        return this.f90594b;
    }

    public final int hashCode() {
        int hashCode = this.f90593a.hashCode() * 31;
        String str = this.f90594b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        C33974a aVar = this.f90593a;
        String str = this.f90594b;
        return "SystemUiException(type=" + aVar + ", message=" + str + ")";
    }
}
