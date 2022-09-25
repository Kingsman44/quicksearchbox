package com.google.android.libraries.lens.view.p2081au;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.au.f */
/* compiled from: PG */
final class C25556f extends C25562l {

    /* renamed from: a */
    private final int f69570a;

    /* renamed from: b */
    private final C24201ad f69571b;

    /* renamed from: c */
    private final C25560j f69572c;

    /* renamed from: d */
    private final C58833ax f69573d;

    /* renamed from: e */
    private final C25564n f69574e;

    /* renamed from: f */
    private final C60870cx f69575f;

    public C25556f(int i, C24201ad adVar, C25560j jVar, C58833ax axVar, C25564n nVar, C60870cx cxVar) {
        this.f69570a = i;
        if (adVar != null) {
            this.f69571b = adVar;
            if (jVar != null) {
                this.f69572c = jVar;
                this.f69573d = axVar;
                if (nVar != null) {
                    this.f69574e = nVar;
                    if (cxVar != null) {
                        this.f69575f = cxVar;
                        return;
                    }
                    throw new NullPointerException("Null completionFuture");
                }
                throw new NullPointerException("Null resultSource");
            }
            throw new NullPointerException("Null prefetchImage");
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final int mo30630a() {
        return this.f69570a;
    }

    /* renamed from: b */
    public final C24201ad mo30631b() {
        return this.f69571b;
    }

    /* renamed from: c */
    public final C25560j mo30632c() {
        return this.f69572c;
    }

    /* renamed from: d */
    public final C25564n mo30633d() {
        return this.f69574e;
    }

    /* renamed from: e */
    public final C58833ax mo30634e() {
        return this.f69573d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25562l) {
            C25562l lVar = (C25562l) obj;
            return this.f69570a == lVar.mo30630a() && this.f69571b.equals(lVar.mo30631b()) && this.f69572c.equals(lVar.mo30632c()) && this.f69573d.equals(lVar.mo30634e()) && this.f69574e.equals(lVar.mo30633d()) && this.f69575f.equals(lVar.mo30636f());
        }
    }

    /* renamed from: f */
    public final C60870cx mo30636f() {
        return this.f69575f;
    }

    public final int hashCode() {
        return ((((((((((this.f69570a ^ 1000003) * 1000003) ^ this.f69571b.hashCode()) * 1000003) ^ this.f69572c.hashCode()) * 1000003) ^ this.f69573d.hashCode()) * 1000003) ^ this.f69574e.hashCode()) * 1000003) ^ this.f69575f.hashCode();
    }

    public final String toString() {
        int i = this.f69570a;
        String obj = this.f69571b.toString();
        String obj2 = this.f69572c.toString();
        String obj3 = this.f69573d.toString();
        String obj4 = this.f69574e.toString();
        String obj5 = this.f69575f.toString();
        return "PendingEyesImageQuery{sourceVersion=" + i + ", query=" + obj + ", prefetchImage=" + obj2 + ", interaction=" + obj3 + ", resultSource=" + obj4 + ", completionFuture=" + obj5 + "}";
    }
}
