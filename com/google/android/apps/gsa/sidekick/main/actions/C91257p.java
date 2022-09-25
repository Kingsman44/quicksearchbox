package com.google.android.apps.gsa.sidekick.main.actions;

import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.shared.util.C91957ah;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7918ou;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.p */
/* compiled from: PG */
public final class C91257p extends C91253l {

    /* renamed from: b */
    private final C7918ou f254697b;

    public C91257p(C91376f fVar, C7718hj hjVar, C7708h hVar, C21370a aVar, C7918ou ouVar) {
        super(fVar, hjVar, hVar, aVar);
        ouVar.getClass();
        this.f254697b = ouVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7752iq mo85520b(C7708h hVar, long j) {
        C7751ip ipVar = (C7751ip) C91957ah.m150910a(this.f254689a, hVar, j, (C7669fo) null).toBuilder();
        C7918ou ouVar = this.f254697b;
        ipVar.copyOnWrite();
        C7752iq iqVar = (C7752iq) ipVar.instance;
        ouVar.getClass();
        iqVar.f27153w = ouVar;
        iqVar.f27131a |= 524288;
        return (C7752iq) ipVar.build();
    }
}
