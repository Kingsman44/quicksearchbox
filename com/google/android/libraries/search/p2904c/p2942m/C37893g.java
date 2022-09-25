package com.google.android.libraries.search.p2904c.p2942m;

import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.m.g */
/* compiled from: PG */
public final class C37893g extends C37896j {

    /* renamed from: a */
    public final C37363a f100475a;

    /* renamed from: b */
    private final C60870cx f100476b;

    /* renamed from: c */
    private final int f100477c;

    public C37893g(C60870cx cxVar, C37363a aVar, int i) {
        this.f100476b = cxVar;
        if (aVar != null) {
            this.f100475a = aVar;
            this.f100477c = i;
            return;
        }
        throw new NullPointerException("Null audioAdapter");
    }

    /* renamed from: a */
    public final int mo41136a() {
        return this.f100477c;
    }

    /* renamed from: b */
    public final C37363a mo41137b() {
        return this.f100475a;
    }

    /* renamed from: c */
    public final C60870cx mo41138c() {
        return this.f100476b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37896j) {
            C37896j jVar = (C37896j) obj;
            return this.f100476b.equals(jVar.mo41138c()) && this.f100475a.equals(jVar.mo41137b()) && this.f100477c == jVar.mo41136a();
        }
    }

    public final int hashCode() {
        return ((((this.f100476b.hashCode() ^ 1000003) * 1000003) ^ this.f100475a.hashCode()) * 1000003) ^ this.f100477c;
    }

    public final String toString() {
        String obj = this.f100476b.toString();
        String obj2 = this.f100475a.toString();
        int i = this.f100477c;
        return "ExternalNotifyStartListeningData{audioInterceptResultFuture=" + obj + ", audioAdapter=" + obj2 + ", sessionToken=" + i + "}";
    }
}
