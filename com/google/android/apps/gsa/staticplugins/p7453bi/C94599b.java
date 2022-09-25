package com.google.android.apps.gsa.staticplugins.p7453bi;

import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.b */
/* compiled from: PG */
final class C94599b extends C94613e {

    /* renamed from: a */
    private final C89020ar f264599a;

    /* renamed from: b */
    private final C89068x f264600b;

    /* renamed from: c */
    private final C89061q f264601c;

    public C94599b(C89020ar arVar, C89068x xVar, C89061q qVar) {
        if (arVar != null) {
            this.f264599a = arVar;
            if (xVar != null) {
                this.f264600b = xVar;
                if (qVar != null) {
                    this.f264601c = qVar;
                    return;
                }
                throw new NullPointerException("Null connectivityContext");
            }
            throw new NullPointerException("Null uploadSource");
        }
        throw new NullPointerException("Null httpRequestData");
    }

    /* renamed from: a */
    public final C89061q mo88534a() {
        return this.f264601c;
    }

    /* renamed from: b */
    public final C89068x mo88535b() {
        return this.f264600b;
    }

    /* renamed from: c */
    public final C89020ar mo88536c() {
        return this.f264599a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C94613e) {
            C94613e eVar = (C94613e) obj;
            return this.f264599a.equals(eVar.mo88536c()) && this.f264600b.equals(eVar.mo88535b()) && this.f264601c.equals(eVar.mo88534a());
        }
    }

    public final int hashCode() {
        return ((((this.f264599a.hashCode() ^ 1000003) * 1000003) ^ this.f264600b.hashCode()) * 1000003) ^ this.f264601c.hashCode();
    }

    public final String toString() {
        String obj = this.f264599a.toString();
        String obj2 = this.f264600b.toString();
        String obj3 = this.f264601c.toString();
        return "ExecuteRequestArguments{httpRequestData=" + obj + ", uploadSource=" + obj2 + ", connectivityContext=" + obj3 + "}";
    }
}
