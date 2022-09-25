package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6350k.C81342b;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.p3926e.C52028i;
import com.google.assistant.p3897e.p3921j.p3926e.C52051j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.o */
/* compiled from: PG */
public final class C93225o extends C22538o {

    /* renamed from: a */
    public static final C58974d f259976a = C58974d.m91136j();

    /* renamed from: d */
    private static final Duration f259977d = Duration.ofSeconds(10);

    /* renamed from: e */
    private static final Duration f259978e = Duration.ofSeconds(3);

    /* renamed from: b */
    public final C22871g f259979b;

    /* renamed from: c */
    public final C60950i f259980c;

    /* renamed from: f */
    private final C81342b f259981f;

    public C93225o(C81342b bVar, C22871g gVar, C60950i iVar) {
        this.f259981f = bVar;
        this.f259979b = gVar;
        this.f259980c = iVar;
    }

    /* renamed from: b */
    public static C52070ec m153298b() {
        return C22402a.m41822b(C52235kf.DEADLINE_EXCEEDED, "Deadline exceeded while trying to perform a dynamic action.");
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        String str;
        Bundle bundle;
        C52028i iVar;
        C52028i iVar2;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C52051j jVar = (C52051j) m41992m(dwVar, "execute_action_args", C52051j.f136613d.getParserForType());
        int i = jVar.f136615a;
        if (i == 1) {
            str = "search";
        } else if (i == 3) {
            str = "checkout";
        } else {
            ((C58970a) ((C58970a) f259976a.mo56224b()).mo56372aa(13062)).mo56389s("Invalid data format - no valid action arguments:\n%s", jVar);
            throw new C22534k();
        }
        String str2 = str;
        if (i == 1) {
            bundle = new Bundle();
            if (jVar.f136615a == 1) {
                iVar = (C52028i) jVar.f136616b;
            } else {
                iVar = C52028i.f136556d;
            }
            bundle.putString("website", iVar.f136559b);
            if (jVar.f136615a == 1) {
                iVar2 = (C52028i) jVar.f136616b;
            } else {
                iVar2 = C52028i.f136556d;
            }
            bundle.putString("SEARCH_QUERY", iVar2.f136560c);
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        Instant plus = this.f259980c.mo57444a().plus(f259977d);
        Instant plus2 = this.f259980c.mo57444a().plus(f259978e);
        ((C58970a) ((C58970a) f259976a.mo56224b()).mo56372aa(13060)).mo56386p("Performing dynamic action.");
        return mo87571c(str2, bundle2, !jVar.f136617c, plus2, plus);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[Catch:{ IllegalArgumentException -> 0x0096 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo87571c(java.lang.String r11, android.os.Bundle r12, boolean r13, p3186j$.time.Instant r14, p3186j$.time.Instant r15) {
        /*
            r10 = this;
            com.google.common.v.i r0 = r10.f259980c
            j$.time.Instant r0 = r0.mo57444a()
            boolean r0 = r0.isAfter(r15)
            if (r0 == 0) goto L_0x0022
            com.google.common.f.a.d r11 = f259976a
            com.google.common.f.x r11 = r11.mo56224b()
            java.lang.String r12 = "Deadline for retrying dynamic actions exceeded."
            r13 = 13061(0x3305, float:1.8302E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.assistant.e.j.ec r11 = m153298b()
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        L_0x0022:
            com.google.android.libraries.gsa.k.g r0 = r10.f259979b
            com.google.android.apps.gsa.nga.shared.k.b r1 = r10.f259981f
            com.google.android.apps.gsa.nga.shared.k.a.c r1 = (com.google.android.apps.gsa.nga.shared.p6350k.p6351a.C81341c) r1
            j$.util.Optional r2 = r1.f222631d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x003c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "NgaInteractorConnectionInterface is not present."
            r1.<init>(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92899h(r1)
            goto L_0x009b
        L_0x003c:
            int r2 = r11.hashCode()     // Catch:{ IllegalArgumentException -> 0x0096 }
            r3 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            r4 = 1
            if (r2 == r3) goto L_0x0056
            r3 = 1536904518(0x5b9b4d46, float:8.7427169E16)
            if (r2 == r3) goto L_0x004c
            goto L_0x0060
        L_0x004c:
            java.lang.String r2 = "checkout"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r2 = "search"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0060
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = -1
        L_0x0061:
            if (r2 == 0) goto L_0x006e
            if (r2 != r4) goto L_0x0066
            goto L_0x0076
        L_0x0066:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0096 }
            java.lang.String r2 = com.google.android.apps.gsa.nga.shared.p6350k.p6351a.C81341c.f222629b     // Catch:{ IllegalArgumentException -> 0x0096 }
            r1.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0096 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0096 }
        L_0x006e:
            java.lang.String r2 = "SEARCH_QUERY"
            java.lang.String r2 = r12.getString(r2)     // Catch:{ IllegalArgumentException -> 0x0096 }
            if (r2 == 0) goto L_0x008e
        L_0x0076:
            com.google.android.apps.gsa.nga.shared.k.a.a r2 = new com.google.android.apps.gsa.nga.shared.k.a.a
            r2.<init>(r1, r11, r12, r13)
            com.google.common.util.concurrent.cx r2 = androidx.p104d.p105a.C2169h.m6027a(r2)
            j$.time.Duration r3 = com.google.android.apps.gsa.nga.shared.p6350k.p6351a.C81341c.f222628a
            long r3 = r3.toMillis()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gsa.k.g r1 = r1.f222632e
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r2, r3, r5, r1)
            goto L_0x009b
        L_0x008e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0096 }
            java.lang.String r2 = com.google.android.apps.gsa.nga.shared.p6350k.p6351a.C81341c.f222630c     // Catch:{ IllegalArgumentException -> 0x0096 }
            r1.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0096 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92899h(r1)
        L_0x009b:
            com.google.android.apps.gsa.staticplugins.accl.performers.n r2 = com.google.android.apps.gsa.staticplugins.accl.performers.C93224n.f259975a
            java.lang.String r3 = "Build ClientOp result."
            com.google.common.util.concurrent.cx r1 = r0.mo28209i(r1, r3, r2)
            com.google.android.apps.gsa.staticplugins.accl.performers.l r9 = new com.google.android.apps.gsa.staticplugins.accl.performers.l
            r2 = r9
            r3 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.String r11 = "Perform dynamic action."
            java.lang.Class<java.lang.Exception> r12 = java.lang.Exception.class
            com.google.common.util.concurrent.cx r11 = r0.mo28206f(r1, r11, r12, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.C93225o.mo87571c(java.lang.String, android.os.Bundle, boolean, j$.time.Instant, j$.time.Instant):com.google.common.util.concurrent.cx");
    }
}
