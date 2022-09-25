package com.google.android.libraries.search.p2904c.p2942m;

import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.m.f */
/* compiled from: PG */
public final class C37888f extends C37877c {

    /* renamed from: a */
    private final C60870cx f100467a;

    /* renamed from: b */
    private final C37467cp f100468b;

    /* renamed from: c */
    private final C58833ax f100469c;

    /* renamed from: d */
    private final C58833ax f100470d;

    public C37888f(C60870cx cxVar, C37467cp cpVar, C58833ax axVar, C58833ax axVar2) {
        if (cxVar != null) {
            this.f100467a = cxVar;
            if (cpVar != null) {
                this.f100468b = cpVar;
                this.f100469c = axVar;
                this.f100470d = axVar2;
                return;
            }
            throw new NullPointerException("Null audioRouteType");
        }
        throw new NullPointerException("Null audioRouteDisconnectStatus");
    }

    /* renamed from: a */
    public final C37467cp mo41096a() {
        return this.f100468b;
    }

    /* renamed from: c */
    public final C58833ax mo41097c() {
        return this.f100470d;
    }

    /* renamed from: d */
    public final C58833ax mo41098d() {
        return this.f100469c;
    }

    /* renamed from: e */
    public final C60870cx mo41099e() {
        return this.f100467a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37877c) {
            C37877c cVar = (C37877c) obj;
            return this.f100467a.equals(cVar.mo41099e()) && this.f100468b.equals(cVar.mo41096a()) && this.f100469c.equals(cVar.mo41098d()) && this.f100470d.equals(cVar.mo41097c());
        }
    }

    public final int hashCode() {
        return ((((((this.f100467a.hashCode() ^ 1000003) * 1000003) ^ this.f100468b.hashCode()) * 1000003) ^ this.f100469c.hashCode()) * 1000003) ^ this.f100470d.hashCode();
    }

    public final String toString() {
        String obj = this.f100467a.toString();
        String obj2 = this.f100468b.toString();
        String obj3 = this.f100469c.toString();
        String obj4 = this.f100470d.toString();
        return "AudioRouteData{audioRouteDisconnectStatus=" + obj + ", audioRouteType=" + obj2 + ", handoffDataOptional=" + obj3 + ", audioSourceConnectionTokenOptional=" + obj4 + "}";
    }
}
