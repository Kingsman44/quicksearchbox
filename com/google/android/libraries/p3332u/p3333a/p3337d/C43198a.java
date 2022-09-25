package com.google.android.libraries.p3332u.p3333a.p3337d;

import com.google.android.libraries.search.p2993e.C38303b;
import java.util.Set;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.u.a.d.a */
/* compiled from: PG */
public final class C43198a {

    /* renamed from: a */
    public final Executor f112919a;

    /* renamed from: b */
    public final Set f112920b;

    /* renamed from: c */
    public final C38303b f112921c;

    /* renamed from: d */
    private final C43199b f112922d = null;

    public C43198a(Executor executor, Set set, C38303b bVar) {
        C69664n.m101061g(executor, "backgroundExecutor");
        C69664n.m101061g(set, "allowedAndroidComponents");
        this.f112919a = executor;
        this.f112920b = set;
        this.f112921c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43198a)) {
            return false;
        }
        C43198a aVar = (C43198a) obj;
        if (!C69664n.m101066l(this.f112919a, aVar.f112919a) || !C69664n.m101066l(this.f112920b, aVar.f112920b) || !C69664n.m101066l(this.f112921c, aVar.f112921c)) {
            return false;
        }
        C43199b bVar = aVar.f112922d;
        return C69664n.m101066l((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((((this.f112919a.hashCode() * 31) + this.f112920b.hashCode()) * 31) + this.f112921c.hashCode()) * 31;
    }

    public final String toString() {
        Executor executor = this.f112919a;
        Set set = this.f112920b;
        C38303b bVar = this.f112921c;
        return "GmsComplianceParams(backgroundExecutor=" + executor + ", allowedAndroidComponents=" + set + ", eventListener=" + bVar + ", mobileWebsiteButtonParams=null)";
    }
}
