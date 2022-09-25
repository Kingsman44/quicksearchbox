package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c;

import android.content.Context;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147479b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10994b.C147490a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58817ah;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.af.a.b.c.c */
/* compiled from: PG */
public final class C147521c extends C147547u {

    /* renamed from: a */
    public final Context f398159a;

    /* renamed from: b */
    public final Executor f398160b;

    /* renamed from: c */
    public final C58817ah f398161c;

    /* renamed from: d */
    public final String f398162d;

    /* renamed from: e */
    public final C42813k f398163e;

    /* renamed from: f */
    public final C21370a f398164f;

    /* renamed from: g */
    public final C147490a f398165g;

    /* renamed from: h */
    public final C147479b f398166h;

    /* renamed from: i */
    private final C147545s f398167i;

    public C147521c(Context context, Executor executor, C58817ah ahVar, String str, C42813k kVar, C21370a aVar, C147479b bVar, C147545s sVar, C147490a aVar2) {
        this.f398159a = context;
        this.f398160b = executor;
        this.f398161c = ahVar;
        this.f398162d = str;
        this.f398163e = kVar;
        this.f398164f = aVar;
        this.f398166h = bVar;
        this.f398167i = sVar;
        this.f398165g = aVar2;
    }

    /* renamed from: a */
    public final Context mo124280a() {
        return this.f398159a;
    }

    /* renamed from: b */
    public final C21370a mo124281b() {
        return this.f398164f;
    }

    /* renamed from: c */
    public final C147490a mo124282c() {
        return this.f398165g;
    }

    /* renamed from: d */
    public final C42813k mo124283d() {
        return this.f398163e;
    }

    /* renamed from: e */
    public final C58817ah mo124284e() {
        return this.f398161c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147547u) {
            C147547u uVar = (C147547u) obj;
            return this.f398159a.equals(uVar.mo124280a()) && this.f398160b.equals(uVar.mo124287g()) && this.f398161c.equals(uVar.mo124284e()) && this.f398162d.equals(uVar.mo124286f()) && this.f398163e.equals(uVar.mo124283d()) && this.f398164f.equals(uVar.mo124281b()) && this.f398166h.equals(uVar.mo124288h()) && this.f398167i.equals(uVar.mo124290i()) && this.f398165g.equals(uVar.mo124282c());
        }
    }

    /* renamed from: f */
    public final String mo124286f() {
        return this.f398162d;
    }

    /* renamed from: g */
    public final Executor mo124287g() {
        return this.f398160b;
    }

    /* renamed from: h */
    public final C147479b mo124288h() {
        return this.f398166h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f398159a.hashCode() ^ 1000003) * 1000003) ^ this.f398160b.hashCode()) * 1000003) ^ this.f398161c.hashCode()) * 1000003) ^ this.f398162d.hashCode()) * 1000003) ^ this.f398163e.hashCode()) * 1000003) ^ this.f398164f.hashCode()) * 1000003) ^ this.f398166h.hashCode()) * 1000003) ^ this.f398167i.hashCode()) * 1000003) ^ this.f398165g.hashCode();
    }

    /* renamed from: i */
    public final C147545s mo124290i() {
        return this.f398167i;
    }

    public final String toString() {
        String obj = this.f398159a.toString();
        String obj2 = this.f398160b.toString();
        String obj3 = this.f398161c.toString();
        String str = this.f398162d;
        String obj4 = this.f398163e.toString();
        String obj5 = this.f398164f.toString();
        String obj6 = this.f398166h.toString();
        String obj7 = this.f398167i.toString();
        String obj8 = this.f398165g.toString();
        return "Deps{context=" + obj + ", ioExecutor=" + obj2 + ", accountToDirectoryUriFunction=" + obj3 + ", instanceId=" + str + ", fileStorage=" + obj4 + ", clock=" + obj5 + ", loggerFactory=" + obj6 + ", facsClientFactory=" + obj7 + ", flags=" + obj8 + "}";
    }
}
