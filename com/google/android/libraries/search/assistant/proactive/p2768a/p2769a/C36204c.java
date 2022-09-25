package com.google.android.libraries.search.assistant.proactive.p2768a.p2769a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60944c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65839h;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.proactive.a.a.c */
/* compiled from: PG */
public final class C36204c implements C36202a {

    /* renamed from: a */
    public final AccountId f94578a;

    /* renamed from: b */
    public final C38424a f94579b;

    /* renamed from: c */
    private final C21370a f94580c;

    /* renamed from: d */
    private final C38469m f94581d;

    /* renamed from: e */
    private final C60887da f94582e;

    public C36204c(C21370a aVar, AccountId accountId, C60887da daVar, C38469m mVar, C38424a aVar2) {
        this.f94580c = aVar;
        this.f94578a = accountId;
        this.f94582e = daVar;
        this.f94581d = mVar;
        this.f94579b = aVar2;
    }

    /* renamed from: b */
    private final C60870cx m64603b(C65839h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        String str = hVar.f178979b;
        C38469m mVar = this.f94581d;
        C65753ak akVar = C65753ak.ASSISTANT_ASPIRE_ACTIVITY;
        C63088z byteString = hVar.toByteString();
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long b = C60944c.m93089b(Duration.ofMillis(this.f94580c.mo26870b()));
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = b;
        C65139d dVar2 = (C65139d) cVar.build();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        dVar2.getClass();
        azVar.f178796b = dVar2;
        azVar.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AspireActivityElement";
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C63070h hVar2 = (C63070h) gVar.build();
        hVar2.getClass();
        azVar2.f178799e = hVar2;
        azVar2.f178795a |= 8;
        return C47633f.m84733g(mVar.mo41434e(akVar, (C65768az) ayVar.build())).mo51516i(new C36203b(this), this.f94582e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo40012a(android.content.Intent r7) {
        /*
            r6 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "button-type"
            java.lang.String r0 = r7.getStringExtra(r0)
            boolean r1 = com.google.common.base.C58837ba.m90859h(r0)
            if (r1 == 0) goto L_0x0013
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92898g()
            return r7
        L_0x0013:
            int r1 = r0.hashCode()
            r2 = -1844280858(0xffffffff921281e6, float:-4.622959E-28)
            r3 = 1
            if (r1 == r2) goto L_0x002d
            r2 = 2104194(0x201b82, float:2.948604E-39)
            if (r1 == r2) goto L_0x0023
            goto L_0x0037
        L_0x0023:
            java.lang.String r1 = "DONE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0038
        L_0x002d:
            java.lang.String r1 = "SNOOZE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            java.lang.String r1 = "Invalid intent."
            r2 = 3
            r4 = 4
            java.lang.String r5 = "aspiration-id"
            if (r0 == 0) goto L_0x00db
            if (r0 == r3) goto L_0x004e
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r0 = "Unknown Aspire action."
            r7.<init>(r0)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
            return r7
        L_0x004e:
            if (r7 == 0) goto L_0x00d1
            boolean r0 = r7.hasExtra(r5)
            if (r0 != 0) goto L_0x0058
            goto L_0x00d1
        L_0x0058:
            java.lang.String r7 = r7.getStringExtra(r5)     // Catch:{ NullPointerException -> 0x00cb, IllegalArgumentException -> 0x00c9 }
            r7.getClass()
            com.google.protos.p.b.h r0 = com.google.protos.p5129p.p5131b.C65839h.f178976g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.p.b.g r0 = (com.google.protos.p5129p.p5131b.C65838g) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
            int r5 = r1.f178978a
            r3 = r3 | r5
            r1.f178978a = r3
            r1.f178979b = r7
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            r7.f178980c = r2
            int r1 = r7.f178978a
            r1 = r1 | 2
            r7.f178978a = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            r7.f178981d = r4
            int r1 = r7.f178978a
            r1 = r1 | r4
            r7.f178978a = r1
            com.google.android.libraries.f.a r7 = r6.f94580c
            long r3 = r7.mo26870b()
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r3)
            long r3 = com.google.common.p4580v.C60944c.m93089b(r7)
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            int r1 = r7.f178978a
            r1 = r1 | 8
            r7.f178978a = r1
            r7.f178982e = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            r7.f178983f = r2
            int r1 = r7.f178978a
            r1 = r1 | 16
            r7.f178978a = r1
            com.google.protobuf.bv r7 = r0.build()
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            com.google.common.util.concurrent.cx r7 = r6.m64603b(r7)
            goto L_0x00da
        L_0x00c9:
            r7 = move-exception
            goto L_0x00cc
        L_0x00cb:
            r7 = move-exception
        L_0x00cc:
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
            goto L_0x00da
        L_0x00d1:
            java.lang.Exception r7 = new java.lang.Exception
            r7.<init>(r1)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
        L_0x00da:
            return r7
        L_0x00db:
            if (r7 == 0) goto L_0x015e
            boolean r0 = r7.hasExtra(r5)
            if (r0 != 0) goto L_0x00e5
            goto L_0x015e
        L_0x00e5:
            java.lang.String r7 = r7.getStringExtra(r5)     // Catch:{ NullPointerException -> 0x0158, IllegalArgumentException -> 0x0156 }
            r7.getClass()
            com.google.protos.p.b.h r0 = com.google.protos.p5129p.p5131b.C65839h.f178976g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.p.b.g r0 = (com.google.protos.p5129p.p5131b.C65838g) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
            int r5 = r1.f178978a
            r5 = r5 | r3
            r1.f178978a = r5
            r1.f178979b = r7
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            r7.f178980c = r3
            int r1 = r7.f178978a
            r1 = r1 | 2
            r7.f178978a = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            r7.f178981d = r4
            int r1 = r7.f178978a
            r1 = r1 | r4
            r7.f178978a = r1
            com.google.android.libraries.f.a r7 = r6.f94580c
            long r3 = r7.mo26870b()
            j$.time.Duration r7 = p3186j$.time.Duration.ofMillis(r3)
            long r3 = com.google.common.p4580v.C60944c.m93089b(r7)
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            int r1 = r7.f178978a
            r1 = r1 | 8
            r7.f178978a = r1
            r7.f178982e = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            r7.f178983f = r2
            int r1 = r7.f178978a
            r1 = r1 | 16
            r7.f178978a = r1
            com.google.protobuf.bv r7 = r0.build()
            com.google.protos.p.b.h r7 = (com.google.protos.p5129p.p5131b.C65839h) r7
            com.google.common.util.concurrent.cx r7 = r6.m64603b(r7)
            goto L_0x0167
        L_0x0156:
            r7 = move-exception
            goto L_0x0159
        L_0x0158:
            r7 = move-exception
        L_0x0159:
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
            goto L_0x0167
        L_0x015e:
            java.lang.Exception r7 = new java.lang.Exception
            r7.<init>(r1)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92899h(r7)
        L_0x0167:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.p2768a.p2769a.C36204c.mo40012a(android.content.Intent):com.google.common.util.concurrent.cx");
    }
}
