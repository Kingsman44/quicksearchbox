package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.b */
/* compiled from: PG */
final class C18827b extends C18831bd {

    /* renamed from: a */
    private final C58495hd f53022a;

    /* renamed from: b */
    private final C58495hd f53023b;

    /* renamed from: c */
    private final C58495hd f53024c;

    /* renamed from: d */
    private final Optional f53025d;

    /* renamed from: e */
    private final C18872cr f53026e;

    public C18827b(C58495hd hdVar, C58495hd hdVar2, C58495hd hdVar3, Optional optional, C18872cr crVar) {
        if (hdVar != null) {
            this.f53022a = hdVar;
            if (hdVar2 != null) {
                this.f53023b = hdVar2;
                if (hdVar3 != null) {
                    this.f53024c = hdVar3;
                    if (optional != null) {
                        this.f53025d = optional;
                        this.f53026e = crVar;
                        return;
                    }
                    throw new NullPointerException("Null bundleOptional");
                }
                throw new NullPointerException("Null mediaIdToParent");
            }
            throw new NullPointerException("Null folderIdToName");
        }
        throw new NullPointerException("Null suggestedMediaItems");
    }

    /* renamed from: a */
    public final C18872cr mo24176a() {
        return this.f53026e;
    }

    /* renamed from: b */
    public final C58495hd mo24177b() {
        return this.f53023b;
    }

    /* renamed from: c */
    public final C58495hd mo24178c() {
        return this.f53024c;
    }

    /* renamed from: d */
    public final C58495hd mo24179d() {
        return this.f53022a;
    }

    /* renamed from: e */
    public final Optional mo24180e() {
        return this.f53025d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18831bd) {
            C18831bd bdVar = (C18831bd) obj;
            return this.f53022a.equals(bdVar.mo24179d()) && this.f53023b.equals(bdVar.mo24177b()) && this.f53024c.equals(bdVar.mo24178c()) && this.f53025d.equals(bdVar.mo24180e()) && this.f53026e.equals(bdVar.mo24176a());
        }
    }

    public final int hashCode() {
        return ((((((((C58758qx.m90643a(this.f53022a.entrySet()) ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f53023b.entrySet())) * 1000003) ^ C58758qx.m90643a(this.f53024c.entrySet())) * 1000003) ^ this.f53025d.hashCode()) * 1000003) ^ this.f53026e.hashCode();
    }

    public final String toString() {
        String obj = this.f53022a.toString();
        String obj2 = this.f53023b.toString();
        String obj3 = this.f53024c.toString();
        String obj4 = this.f53025d.toString();
        String obj5 = this.f53026e.toString();
        return "MediaBrowserSubscriptionResult{suggestedMediaItems=" + obj + ", folderIdToName=" + obj2 + ", mediaIdToParent=" + obj3 + ", bundleOptional=" + obj4 + ", status=" + obj5 + "}";
    }
}
