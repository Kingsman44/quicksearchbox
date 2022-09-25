package com.google.android.libraries.search.rendering.xuikit.p3130c;

import java.io.File;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.o */
/* compiled from: PG */
public final class C40291o {

    /* renamed from: a */
    public final C40267ag f105840a;

    /* renamed from: b */
    public final File f105841b;

    public C40291o(C40267ag agVar, File file) {
        C69664n.m101061g(agVar, "source");
        this.f105840a = agVar;
        this.f105841b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40291o)) {
            return false;
        }
        C40291o oVar = (C40291o) obj;
        return this.f105840a == oVar.f105840a && C69664n.m101066l(this.f105841b, oVar.f105841b);
    }

    public final int hashCode() {
        int hashCode = this.f105840a.hashCode() * 31;
        File file = this.f105841b;
        return hashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        C40267ag agVar = this.f105840a;
        File file = this.f105841b;
        return "GetResult(source=" + agVar + ", file=" + file + ")";
    }
}
