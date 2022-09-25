package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ae */
/* compiled from: PG */
public final /* synthetic */ class C114383ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114384af f317131a;

    /* renamed from: b */
    public final /* synthetic */ Intent f317132b;

    /* renamed from: c */
    public final /* synthetic */ boolean f317133c;

    /* renamed from: d */
    public final /* synthetic */ int f317134d;

    /* renamed from: e */
    public final /* synthetic */ C84370p f317135e;

    /* renamed from: f */
    public final /* synthetic */ String f317136f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f317137g;

    /* renamed from: h */
    public final /* synthetic */ String f317138h;

    public /* synthetic */ C114383ae(C114384af afVar, Intent intent, boolean z, int i, C84370p pVar, String str, byte[] bArr, String str2) {
        this.f317131a = afVar;
        this.f317132b = intent;
        this.f317133c = z;
        this.f317134d = i;
        this.f317135e = pVar;
        this.f317136f = str;
        this.f317137g = bArr;
        this.f317138h = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dc, code lost:
        if (com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114384af.f317140b.contains(java.lang.Integer.valueOf(r13.getIntExtra("extra.screenId", -1))) != false) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0292  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.af r0 = r1.f317131a
            android.content.Intent r2 = r1.f317132b
            boolean r3 = r1.f317133c
            int r4 = r1.f317134d
            com.google.android.apps.gsa.search.core.a.p r5 = r1.f317135e
            java.lang.String r6 = r1.f317136f
            byte[] r7 = r1.f317137g
            java.lang.String r8 = r1.f317138h
            r9 = r17
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bi r9 = (com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114417bi) r9
            java.lang.String r10 = r9.f317254b
            java.lang.String r11 = "button-index"
            r12 = -1
            int r11 = r2.getIntExtra(r11, r12)
            java.lang.String r13 = "target-intent"
            android.os.Parcelable r13 = r2.getParcelableExtra(r13)
            android.content.Intent r13 = (android.content.Intent) r13
            java.lang.String r14 = "NotificationActions"
            if (r13 != 0) goto L_0x00a8
            java.lang.String r13 = "com.google.android.search.core.extra.EXTRA_OPA_PROACTIVE_OPAQUE_TOKEN"
            byte[] r13 = r2.getByteArrayExtra(r13)
            if (r13 != 0) goto L_0x0049
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114384af.f317139a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r10, r14)
            java.lang.String r10 = "Received intent without notification id and opaque token"
            r11 = 28965(0x7125, float:4.0589E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r11)).mo56386p(r10)
            r13 = 0
        L_0x0046:
            r10 = -1
            goto L_0x00e6
        L_0x0049:
            com.google.android.apps.gsa.search.core.i.t r15 = r0.f317145g
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247778na
            boolean r12 = r15.mo79746e(r12)
            com.google.android.apps.gsa.search.shared.h.h r15 = new com.google.android.apps.gsa.search.shared.h.h
            r15.<init>()
            r15.mo81686b()
            r1 = 1
            r15.f236560f = r1
            r12 = r12 ^ r1
            r15.f236497A = r12
            r12 = 0
            r15.f236540ak = r12
            r15.f236509M = r1
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.du r1 = com.google.android.apps.gsa.staticplugins.opa.p8378m.C109458d.m182155c(r13, r11, r10, r1)
            byte[] r1 = r1.toByteArray()
            r15.f236517U = r1
            com.google.android.apps.gsa.shared.search.QueryTriggerType r1 = com.google.android.apps.gsa.shared.search.QueryTriggerType.OPA_PROACTIVE_NOTIFICATION
            r15.f236572r = r1
            java.lang.String r1 = "and.opa.notification"
            r15.f236523a = r1
            boolean r1 = com.google.common.base.C58837ba.m90859h(r10)
            if (r1 != 0) goto L_0x0080
            r15.f236571q = r10
        L_0x0080:
            android.os.Bundle r1 = r15.mo81685a()
            java.lang.String r11 = "triggered_by"
            r12 = 24
            r1.putInt(r11, r12)
            r11 = 1
            if (r11 == r3) goto L_0x0092
            r3 = 268468224(0x10008000, float:2.5342157E-29)
            goto L_0x0094
        L_0x0092:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0094:
            com.google.common.base.ax r11 = r0.f317144f
            java.lang.Object r11 = r11.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r11 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r11
            android.content.Context r12 = r0.f317142d
            android.content.Intent r13 = r11.mo81687a(r12, r1, r3)
            java.lang.String r1 = "ved"
            r13.putExtra(r1, r10)
            goto L_0x0046
        L_0x00a8:
            java.lang.Class r1 = r0.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r13.setExtrasClassLoader(r1)
            java.lang.String r1 = "assistant-settings"
            java.lang.String r3 = r13.getScheme()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00df
            java.lang.String r1 = "assistant-handoff"
            java.lang.String r3 = r13.getScheme()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00df
            com.google.common.b.ij r1 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114384af.f317140b
            java.lang.String r3 = "extra.screenId"
            r10 = -1
            int r3 = r13.getIntExtra(r3, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x00e6
            goto L_0x00e0
        L_0x00df:
            r10 = -1
        L_0x00e0:
            java.lang.String r1 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT"
            r3 = 1
            r13.putExtra(r1, r3)
        L_0x00e6:
            r1 = 2
            if (r13 != 0) goto L_0x00ff
            if (r4 == r1) goto L_0x00ff
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114384af.f317139a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r14)
            java.lang.String r1 = "Cannot resolve intent."
            r2 = 28977(0x7131, float:4.0605E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0315
        L_0x00ff:
            if (r13 == 0) goto L_0x032c
            java.lang.String r3 = r13.getAction()
            java.lang.String r11 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ID"
            boolean r11 = r13.hasExtra(r11)
            if (r11 != 0) goto L_0x0327
            com.google.common.b.ij r11 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114384af.f317141c
            java.lang.String r12 = r13.getAction()
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L_0x011b
            goto L_0x0327
        L_0x011b:
            java.lang.String r11 = "appActionsNotificationsInfo"
            boolean r11 = r13.hasExtra(r11)
            if (r11 == 0) goto L_0x012c
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.al.bp.a r3 = r0.f317148j
            r3.mo78589d(r13)
            goto L_0x032c
        L_0x012c:
            java.lang.String r11 = "com.google.android.apps.gsa.staticplugins.opa.worker.proactive.TrySayingUtil.EXTRA_QUERY"
            boolean r12 = r13.hasExtra(r11)
            r14 = 4
            if (r12 == 0) goto L_0x01b3
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = r13.getStringExtra(r11)
            com.google.common.base.cr r9 = r0.f317152n
            java.lang.Object r9 = r9.mo6453a()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0196
            dagger.a r9 = r0.f317151m
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.c.j r9 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j) r9
            com.google.android.apps.gsa.opa.f.a.ac r10 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac.f227951e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.gsa.opa.f.a.ab r10 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab) r10
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.bi
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.apps.gsa.opa.f.a.ac r12 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r12
            int r11 = r11.ca
            r12.f227955c = r11
            int r11 = r12.f227953a
            r11 = r11 | r1
            r12.f227953a = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.gsa.opa.f.a.ac r11 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r11
            r12 = 1
            r11.f227954b = r12
            int r13 = r11.f227953a
            r12 = r12 | r13
            r11.f227953a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.gsa.opa.f.a.ac r11 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r11
            r3.getClass()
            int r12 = r11.f227953a
            r12 = r12 | r14
            r11.f227953a = r12
            r11.f227956d = r3
            com.google.protobuf.bv r3 = r10.build()
            com.google.android.apps.gsa.opa.f.a.ac r3 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac) r3
            r9.mo96272h(r3)
            goto L_0x032c
        L_0x0196:
            com.google.common.base.ax r9 = r0.f317144f
            java.lang.Object r9 = r9.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r9 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r9
            android.content.Context r10 = r0.f317142d
            com.google.android.apps.gsa.search.shared.h.h r11 = new com.google.android.apps.gsa.search.shared.h.h
            r11.<init>()
            r12 = 1
            r11.f236546aq = r12
            r11.f236547ar = r3
            android.os.Bundle r3 = r11.mo81685a()
            r9.mo81688b(r10, r3)
            goto L_0x032c
        L_0x01b3:
            boolean r11 = com.google.common.base.C58837ba.m90859h(r3)
            if (r11 != 0) goto L_0x0318
            java.lang.String r11 = "ASPIRE_BUTTON_ACTION"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x0318
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.b.a.c r0 = r0.f317153o
            java.lang.String r2 = "button-type"
            java.lang.String r2 = r13.getStringExtra(r2)
            boolean r3 = com.google.common.base.C58837ba.m90859h(r2)
            if (r3 == 0) goto L_0x01d4
            com.google.common.util.concurrent.C60856cj.m92898g()
            goto L_0x0315
        L_0x01d4:
            int r3 = r2.hashCode()
            r4 = -1844280858(0xffffffff921281e6, float:-4.622959E-28)
            if (r3 == r4) goto L_0x01ed
            r4 = 2104194(0x201b82, float:2.948604E-39)
            if (r3 == r4) goto L_0x01e3
            goto L_0x01f7
        L_0x01e3:
            java.lang.String r3 = "DONE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01f7
            r12 = 0
            goto L_0x01f8
        L_0x01ed:
            java.lang.String r3 = "SNOOZE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01f7
            r12 = 1
            goto L_0x01f8
        L_0x01f7:
            r12 = -1
        L_0x01f8:
            java.lang.String r2 = "Invalid intent."
            r3 = 3
            java.lang.String r4 = "aspiration-id"
            if (r12 == 0) goto L_0x0292
            r5 = 1
            if (r12 == r5) goto L_0x020e
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Unknown Aspire action."
            r0.<init>(r1)
            com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x0315
        L_0x020e:
            boolean r5 = r13.hasExtra(r4)
            if (r5 != 0) goto L_0x021e
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x0315
        L_0x021e:
            java.lang.String r2 = r13.getStringExtra(r4)     // Catch:{ NullPointerException -> 0x028c, IllegalArgumentException -> 0x028a }
            r2.getClass()
            com.google.protos.p.b.h r4 = com.google.protos.p5129p.p5131b.C65839h.f178976g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.p.b.g r4 = (com.google.protos.p5129p.p5131b.C65838g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.protos.p.b.h r5 = (com.google.protos.p5129p.p5131b.C65839h) r5
            int r6 = r5.f178978a
            r7 = 1
            r6 = r6 | r7
            r5.f178978a = r6
            r5.f178979b = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.protos.p.b.h r2 = (com.google.protos.p5129p.p5131b.C65839h) r2
            r2.f178980c = r3
            int r5 = r2.f178978a
            r1 = r1 | r5
            r2.f178978a = r1
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
            r1.f178981d = r14
            int r2 = r1.f178978a
            r2 = r2 | r14
            r1.f178978a = r2
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.f.a r2 = r0.f317224a
            long r5 = r2.mo26870b()
            long r1 = r1.toMicros(r5)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.protos.p.b.h r5 = (com.google.protos.p5129p.p5131b.C65839h) r5
            int r6 = r5.f178978a
            r6 = r6 | 8
            r5.f178978a = r6
            r5.f178982e = r1
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
            r1.f178983f = r3
            int r2 = r1.f178978a
            r2 = r2 | 16
            r1.f178978a = r2
            com.google.protobuf.bv r1 = r4.build()
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
            goto L_0x030b
        L_0x028a:
            r0 = move-exception
            goto L_0x028d
        L_0x028c:
            r0 = move-exception
        L_0x028d:
            com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x0315
        L_0x0292:
            boolean r5 = r13.hasExtra(r4)
            if (r5 != 0) goto L_0x02a1
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x0315
        L_0x02a1:
            java.lang.String r2 = r13.getStringExtra(r4)     // Catch:{ NullPointerException -> 0x0311, IllegalArgumentException -> 0x030f }
            r2.getClass()
            com.google.protos.p.b.h r4 = com.google.protos.p5129p.p5131b.C65839h.f178976g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.p.b.g r4 = (com.google.protos.p5129p.p5131b.C65838g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.protos.p.b.h r5 = (com.google.protos.p5129p.p5131b.C65839h) r5
            int r6 = r5.f178978a
            r7 = 1
            r6 = r6 | r7
            r5.f178978a = r6
            r5.f178979b = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.protos.p.b.h r2 = (com.google.protos.p5129p.p5131b.C65839h) r2
            r2.f178980c = r7
            int r5 = r2.f178978a
            r1 = r1 | r5
            r2.f178978a = r1
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
            r1.f178981d = r14
            int r2 = r1.f178978a
            r2 = r2 | r14
            r1.f178978a = r2
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.f.a r2 = r0.f317224a
            long r5 = r2.mo26870b()
            long r1 = r1.toMicros(r5)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.protos.p.b.h r5 = (com.google.protos.p5129p.p5131b.C65839h) r5
            int r6 = r5.f178978a
            r6 = r6 | 8
            r5.f178978a = r6
            r5.f178982e = r1
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
            r1.f178983f = r3
            int r2 = r1.f178978a
            r2 = r2 | 16
            r1.f178978a = r2
            com.google.protobuf.bv r1 = r4.build()
            com.google.protos.p.b.h r1 = (com.google.protos.p5129p.p5131b.C65839h) r1
        L_0x030b:
            r0.mo101316a(r1)
            goto L_0x0315
        L_0x030f:
            r0 = move-exception
            goto L_0x0312
        L_0x0311:
            r0 = move-exception
        L_0x0312:
            com.google.common.util.concurrent.C60856cj.m92899h(r0)
        L_0x0315:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x0361
        L_0x0318:
            if (r4 == r1) goto L_0x032c
            com.google.android.libraries.gsa.k.g r3 = r0.f317146h
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.z r10 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.z
            r10.<init>(r0, r13, r9, r2)
            java.lang.String r9 = "OPA Notification Tap"
            r3.mo28212l(r9, r10)
            goto L_0x032c
        L_0x0327:
            android.content.Context r3 = r0.f317142d
            r3.sendBroadcast(r13)
        L_0x032c:
            java.lang.String r3 = "explicit-dismiss-on-tap"
            r9 = 0
            boolean r3 = r2.getBooleanExtra(r3, r9)
            if (r3 != 0) goto L_0x0338
            if (r4 != r1) goto L_0x0343
            r4 = 2
        L_0x0338:
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r6)
            com.google.assistant.e.j.du r3 = com.google.android.apps.gsa.staticplugins.opa.p8378m.C109458d.m182153a(r3, r7)
            r5.mo77919a(r3)
        L_0x0343:
            if (r4 != r1) goto L_0x035f
            boolean r1 = r0.mo101306c(r8)
            if (r1 == 0) goto L_0x035f
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r1 = r0.f317154p
            com.google.common.util.concurrent.cx r1 = r1.mo79697b()
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aa r3 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aa
            r3.<init>(r0, r8, r6, r2)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r3)
            com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r0)
        L_0x035f:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
        L_0x0361:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114383ae.apply(java.lang.Object):java.lang.Object");
    }
}
