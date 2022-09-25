package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.b */
/* compiled from: PG */
final class C78675b extends C78699z {

    /* renamed from: a */
    private final String f216593a;

    /* renamed from: b */
    private final C60870cx f216594b;

    /* renamed from: c */
    private final Optional f216595c;

    public C78675b(String str, C60870cx cxVar, Optional optional) {
        if (str != null) {
            this.f216593a = str;
            if (cxVar != null) {
                this.f216594b = cxVar;
                if (optional != null) {
                    this.f216595c = optional;
                    return;
                }
                throw new NullPointerException("Null contentTask");
            }
            throw new NullPointerException("Null listenableFuture");
        }
        throw new NullPointerException("Null inputKey");
    }

    /* renamed from: a */
    public final C60870cx mo73576a() {
        return this.f216594b;
    }

    /* renamed from: b */
    public final Optional mo73577b() {
        return this.f216595c;
    }

    /* renamed from: c */
    public final String mo73578c() {
        return this.f216593a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78699z) {
            C78699z zVar = (C78699z) obj;
            return this.f216593a.equals(zVar.mo73578c()) && this.f216594b.equals(zVar.mo73576a()) && this.f216595c.equals(zVar.mo73577b());
        }
    }

    public final int hashCode() {
        return ((((this.f216593a.hashCode() ^ 1000003) * 1000003) ^ this.f216594b.hashCode()) * 1000003) ^ this.f216595c.hashCode();
    }

    public final String toString() {
        String str = this.f216593a;
        String obj = this.f216594b.toString();
        String obj2 = this.f216595c.toString();
        return "Status{inputKey=" + str + ", listenableFuture=" + obj + ", contentTask=" + obj2 + "}";
    }
}
