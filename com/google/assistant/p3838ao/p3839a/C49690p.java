package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3840a.C49403f;
import com.google.assistant.p3838ao.p3839a.p3845e.C49601dd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.assistant.ao.a.p */
/* compiled from: PG */
public final class C49690p {

    /* renamed from: a */
    private static final C58974d f128257a = C58974d.m91136j();

    /* renamed from: b */
    private final C49636f f128258b;

    /* renamed from: c */
    private final C49403f f128259c;

    /* renamed from: d */
    private C49601dd f128260d = C49601dd.f127995f;

    /* renamed from: e */
    private C49645h f128261e;

    /* renamed from: f */
    private int f128262f = 1;

    public C49690p(C49636f fVar, C49403f fVar2) {
        this.f128258b = fVar;
        this.f128259c = fVar2;
        this.f128261e = new C49689o(fVar, fVar2, this.f128260d);
    }

    /* renamed from: a */
    public final synchronized C49645h mo53327a() {
        return this.f128261e;
    }

    /* renamed from: b */
    public final synchronized int mo53328b() {
        return this.f128262f;
    }

    /* renamed from: c */
    public final synchronized void mo53329c(C49601dd ddVar) {
        long j = ddVar.f127997a;
        long j2 = this.f128260d.f127997a;
        if (j < j2) {
            ((C58970a) ((C58970a) f128257a.mo56224b()).mo56372aa(54823)).mo56350C("Received an older version of the config (%d vs %d), not replacing.", ddVar.f127997a, this.f128260d.f127997a);
        } else if (j == j2) {
            C58970a aVar = (C58970a) ((C58970a) f128257a.mo56224b()).mo56372aa(54822);
            Long valueOf = Long.valueOf(this.f128260d.f127997a);
            int i = this.f128262f;
            String str = i != 1 ? i != 2 ? "null" : "BUILT_IN" : "NONE";
            if (i != 0) {
                aVar.mo56359L("Received a config from %s with the same version (%d), not replacing the current one from %s.", "BUILT_IN", valueOf, str);
                return;
            }
            throw null;
        } else {
            ((C58970a) ((C58970a) f128257a.mo56224b()).mo56372aa(54821)).mo56351D("Received a new config, version: %d, source: %s.", ddVar.f127997a, "BUILT_IN");
            this.f128262f = 2;
            this.f128260d = ddVar;
            this.f128261e = new C49689o(this.f128258b, this.f128259c, this.f128260d);
        }
    }
}
