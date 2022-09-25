package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113384dy;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113385dz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113396eg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113397eh;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48661v;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48665z;
import com.google.protobuf.C62995dn;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.eu */
/* compiled from: PG */
public final /* synthetic */ class C112413eu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C112433ff f311887a;

    /* renamed from: b */
    public final /* synthetic */ C48661v f311888b;

    /* renamed from: c */
    public final /* synthetic */ long f311889c;

    public /* synthetic */ C112413eu(C112433ff ffVar, C48661v vVar, long j) {
        this.f311887a = ffVar;
        this.f311888b = vVar;
        this.f311889c = j;
    }

    public final void run() {
        C112433ff ffVar = this.f311887a;
        C48661v vVar = this.f311888b;
        long j = this.f311889c;
        C121537f fVar = C112435fh.f311928a;
        Optional findFirst = Collection.EL.stream(ffVar.f311924a.mo100054M()).findFirst();
        if (!findFirst.isEmpty() && vVar.mo53165a((String) findFirst.get())) {
            C113384dy dyVar = (C113384dy) C113385dz.f313932h.createBuilder();
            String str = (String) findFirst.get();
            str.getClass();
            C62995dn dnVar = vVar.f125760a;
            if (dnVar.containsKey(str)) {
                C48665z zVar = (C48665z) dnVar.get(str);
                long b = C112435fh.m186260b(zVar, j, 1);
                dyVar.copyOnWrite();
                C113385dz dzVar = (C113385dz) dyVar.instance;
                dzVar.f313934a |= 32;
                dzVar.f313935b = (float) b;
                long b2 = C112435fh.m186260b(zVar, j, 3);
                dyVar.copyOnWrite();
                C113385dz dzVar2 = (C113385dz) dyVar.instance;
                dzVar2.f313934a |= 64;
                dzVar2.f313936c = (float) b2;
                long b3 = C112435fh.m186260b(zVar, j, 7);
                dyVar.copyOnWrite();
                C113385dz dzVar3 = (C113385dz) dyVar.instance;
                dzVar3.f313934a |= 128;
                dzVar3.f313937d = (float) b3;
                long b4 = C112435fh.m186260b(zVar, j, 14);
                dyVar.copyOnWrite();
                C113385dz dzVar4 = (C113385dz) dyVar.instance;
                dzVar4.f313934a |= 256;
                dzVar4.f313938e = (float) b4;
                long b5 = C112435fh.m186260b(zVar, j, 28);
                dyVar.copyOnWrite();
                C113385dz dzVar5 = (C113385dz) dyVar.instance;
                dzVar5.f313934a |= 512;
                dzVar5.f313939f = (float) b5;
                OptionalLong max = Collection.EL.stream(zVar.f125774b).mapToLong(C112403ek.f311863a).max();
                if (max.isPresent()) {
                    long asLong = max.getAsLong();
                    dyVar.copyOnWrite();
                    C113385dz dzVar6 = (C113385dz) dyVar.instance;
                    dzVar6.f313934a |= 1024;
                    dzVar6.f313940g = (float) (j - asLong);
                }
                C113396eg egVar = ffVar.f311925b;
                egVar.copyOnWrite();
                C113397eh ehVar = (C113397eh) egVar.instance;
                C113385dz dzVar7 = (C113385dz) dyVar.build();
                C113397eh ehVar2 = C113397eh.f314000f;
                dzVar7.getClass();
                ehVar.f314004c = dzVar7;
                ehVar.f314002a |= 2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
