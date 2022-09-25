package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.libraries.gsa.p1876k.C22862b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.z.e.a.c.b */
/* compiled from: PG */
public final /* synthetic */ class C118982b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C68214a f331797a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f331798b;

    /* renamed from: c */
    public final /* synthetic */ C90021c f331799c;

    /* renamed from: d */
    public final /* synthetic */ b f331800d;

    /* renamed from: e */
    public final /* synthetic */ SharedPreferences f331801e;

    /* renamed from: f */
    public final /* synthetic */ C91123v f331802f;

    public /* synthetic */ C118982b(C68214a aVar, C68214a aVar2, C91123v vVar, C90021c cVar, b bVar, SharedPreferences sharedPreferences) {
        this.f331797a = aVar;
        this.f331798b = aVar2;
        this.f331802f = vVar;
        this.f331799c = cVar;
        this.f331800d = bVar;
        this.f331801e = sharedPreferences;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x039e, code lost:
        if (r1.startsWith("com.google.android.apps.gmm") == false) goto L_0x03ad;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r12 = this;
            dagger.a r0 = r12.f331797a
            dagger.a r1 = r12.f331798b
            com.google.android.apps.gsa.shared.util.v r2 = r12.f331802f
            com.google.android.apps.gsa.shared.m.c r3 = r12.f331799c
            com.google.android.apps.gsa.g.c.b r4 = r12.f331800d
            android.content.SharedPreferences r5 = r12.f331801e
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r0 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r0
            if (r0 != 0) goto L_0x001a
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x03d4
        L_0x001a:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r6 = r0.mo81643e()
            r7 = 0
            if (r6 == 0) goto L_0x002c
            com.google.z.c.z r6 = r6.f236262p
            if (r6 == 0) goto L_0x002c
            com.google.z.c.v r6 = r6.f184329b
            if (r6 != 0) goto L_0x002d
            com.google.z.c.v r6 = com.google.p5277z.p5282c.C68032v.f184320b
            goto L_0x002d
        L_0x002c:
            r6 = r7
        L_0x002d:
            if (r6 != 0) goto L_0x0033
            com.google.z.c.v r6 = r0.mo81648j()
        L_0x0033:
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r8 = r0.mo81643e()
            if (r8 == 0) goto L_0x007a
            int r8 = r8.f236259m
            com.google.bb.a.ab r8 = com.google.p4152bb.p4153a.C54944ab.m87544a(r8)
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90833j(r8)
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.UNKNOWN
            java.lang.Object r8 = r8.mo56109e(r9)
            com.google.bb.a.ab r8 = (com.google.p4152bb.p4153a.C54944ab) r8
            com.google.bb.a.ab r9 = com.google.p4152bb.p4153a.C54944ab.RECIPIENT
            if (r8 == r9) goto L_0x0055
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x005d
        L_0x0055:
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.t r8 = r0.mo81642c()
            java.util.List r8 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197537d(r8)
        L_0x005d:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x007a
            com.google.speech.a.a.b r0 = com.google.speech.p5195a.p5196a.C66422b.f180605k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.speech.a.a.a r0 = (com.google.speech.p5195a.p5196a.C66421a) r0
            r0.mo59622a(r8)
            com.google.protobuf.bv r0 = r0.build()
            com.google.speech.a.a.b r0 = (com.google.speech.p5195a.p5196a.C66422b) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x03d4
        L_0x007a:
            java.lang.String r8 = "GenericAction-Prompted-ContactName"
            if (r6 == 0) goto L_0x0195
            com.google.protobuf.cq r1 = r6.f184322a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x008a
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x03d4
        L_0x008a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0093:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0174
            java.lang.Object r3 = r1.next()
            com.google.z.c.ab r3 = (com.google.p5277z.p5282c.C67992ab) r3
            java.lang.String r3 = r3.f184230a
            java.lang.String r4 = "-Prompted-Recipient"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00b2
            com.google.speech.a.a.z r0 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197535b(r8)
            r2.add(r0)
            goto L_0x0174
        L_0x00b2:
            java.lang.String r4 = "-Prompted-ContactNameDisambiguation"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00c7
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.t r0 = r0.mo81642c()
            java.util.List r0 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197537d(r0)
            r2.addAll(r0)
            goto L_0x0174
        L_0x00c7:
            java.lang.String r4 = "-Prompted-Time"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L_0x0167
            java.lang.String r4 = "-Prompted-ReminderTrigger"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L_0x0167
            java.lang.String r4 = "-Prompted-DateTime"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L_0x0167
            java.lang.String r4 = "-Prompted-StartTime"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L_0x0167
            java.lang.String r4 = "-Prompted-TimeValue"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00f1
            goto L_0x0167
        L_0x00f1:
            java.lang.String r4 = "Prompted-Provider"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x0107
            java.lang.String r0 = "prompted-app-name"
            java.lang.String r1 = "app-actions"
            java.lang.String r3 = "app_biasing"
            com.google.speech.a.a.z r0 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r3, r0, r1)
            r2.add(r0)
            goto L_0x0174
        L_0x0107:
            java.lang.String r4 = "-Prompted-Read"
            boolean r4 = r3.endsWith(r4)
            java.lang.String r5 = "read-items"
            if (r4 == 0) goto L_0x011d
            java.lang.String r0 = "read_items_biasing"
            java.lang.String r1 = "SearchMessageAction-Prompted-Read"
            com.google.speech.a.a.z r0 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r0, r1, r5)
            r2.add(r0)
            goto L_0x0174
        L_0x011d:
            java.lang.String r4 = "-Prompted-Skip"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x0131
            java.lang.String r0 = "skip_items_biasing"
            java.lang.String r1 = "SearchMessageAction-Prompted-Skip"
            com.google.speech.a.a.z r0 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r0, r1, r5)
            r2.add(r0)
            goto L_0x0174
        L_0x0131:
            java.lang.String r4 = "-Prompted-Confirmed"
            boolean r4 = r3.endsWith(r4)
            if (r4 != 0) goto L_0x0159
            java.lang.String r4 = "-Prompted-Confirmation"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x0142
            goto L_0x0159
        L_0x0142:
            java.lang.String r4 = "-Prompted-FieldToChange"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L_0x0093
            java.lang.String r3 = "AddCalendarEvent-Prompted-FieldToChange"
            java.lang.String r4 = "calendar-actions"
            java.lang.String r5 = "calendar-biasing"
            com.google.speech.a.a.z r3 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r5, r3, r4)
            r2.add(r3)
            goto L_0x0093
        L_0x0159:
            java.lang.String r0 = "confirmation-cancellation"
            java.lang.String r1 = "confirmation"
            java.lang.String r3 = "confirmation_biasing"
            com.google.speech.a.a.z r0 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r3, r0, r1)
            r2.add(r0)
            goto L_0x0174
        L_0x0167:
            java.lang.String r0 = "time-context"
            java.lang.String r1 = "time-actions"
            java.lang.String r3 = "time_biasing"
            com.google.speech.a.a.z r0 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r3, r0, r1)
            r2.add(r0)
        L_0x0174:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0191
            com.google.speech.a.a.b r0 = com.google.speech.p5195a.p5196a.C66422b.f180605k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.speech.a.a.a r0 = (com.google.speech.p5195a.p5196a.C66421a) r0
            r0.mo59622a(r2)
            com.google.protobuf.bv r0 = r0.build()
            com.google.speech.a.a.b r0 = (com.google.speech.p5195a.p5196a.C66422b) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x03d4
        L_0x0191:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x03d4
        L_0x0195:
            java.lang.Object r0 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.l.h r0 = (com.google.android.apps.gsa.search.core.p6809l.C86159h) r0
            r1 = 0
            if (r0 == 0) goto L_0x01a2
            com.google.knowledge.b.k r7 = r0.mo79795e(r1)
        L_0x01a2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r2 = r2.mo85390b()
            if (r2 == 0) goto L_0x035f
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250423cp
            boolean r2 = r3.mo79746e(r2)
            if (r2 == 0) goto L_0x01e3
            java.lang.String r2 = "car_actions_biasing"
            java.lang.String r6 = "car_automation.action.union"
            java.lang.String r9 = "android-auto"
            com.google.speech.a.a.z r2 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r2, r6, r9)
            r0.add(r2)
            java.lang.String r2 = "car_top_radio_stations"
            java.lang.String r6 = "top_radio_station_frequencies"
            com.google.speech.a.a.z r2 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r2, r6, r9)
            r0.add(r2)
            java.lang.String r2 = "car_actions_numerics"
            java.lang.String r6 = "car_automation.action.numerics"
            com.google.speech.a.a.z r2 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r2, r6, r9)
            r0.add(r2)
            java.lang.String r2 = "car_manual_fixes"
            java.lang.String r6 = "manual_fixes"
            com.google.speech.a.a.z r2 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r2, r6, r9)
            r0.add(r2)
        L_0x01e3:
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250362bh
            boolean r2 = r3.mo79746e(r2)
            if (r2 == 0) goto L_0x0219
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.common.b.gu r6 = r4.d
            if (r6 == 0) goto L_0x020b
            java.util.Map r4 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197538e(r6)
            com.google.speech.a.a.z r4 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197536c(r4)
            if (r4 == 0) goto L_0x0201
            r2.add(r4)
        L_0x0201:
            java.lang.String r4 = "contact-disambig-static"
            com.google.speech.a.a.z r4 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197535b(r4)
            r2.add(r4)
            goto L_0x0216
        L_0x020b:
            com.google.android.speech.embedded.TaggerResult r4 = r4.a
            if (r4 == 0) goto L_0x0216
            com.google.speech.a.a.z r4 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197535b(r8)
            r2.add(r4)
        L_0x0216:
            r0.addAll(r2)
        L_0x0219:
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250367bm
            boolean r2 = r3.mo79746e(r2)
            if (r2 == 0) goto L_0x022e
            java.lang.String r2 = "radio-context"
            java.lang.String r4 = "radio-actions"
            java.lang.String r6 = "radio_biasing"
            com.google.speech.a.a.z r2 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r6, r2, r4)
            r0.add(r2)
        L_0x022e:
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250408ca
            boolean r2 = r3.mo79746e(r2)
            if (r2 == 0) goto L_0x035f
            java.lang.String r2 = "connected_phones_with_contact_sharing"
            com.google.common.b.pz r3 = com.google.common.p4522b.C58733pz.f156496a
            java.util.Set r2 = r5.getStringSet(r2, r3)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x035f
            java.lang.String r2 = "aae_offline_contact_grammar_dir"
            boolean r3 = r5.contains(r2)
            if (r3 == 0) goto L_0x035f
            java.lang.String r3 = ""
            java.lang.String r2 = r5.getString(r2, r3)
            java.io.File r3 = new java.io.File
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "/contacts.fst"
            java.lang.String r2 = r2.concat(r4)
            r3.<init>(r2)
            boolean r2 = r3.exists()
            if (r2 == 0) goto L_0x035f
            com.google.common.l.ac r2 = new com.google.common.l.ac     // Catch:{ IOException -> 0x0349 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0349 }
            byte[] r2 = r2.mo56803a()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)     // Catch:{ IOException -> 0x0349 }
            java.lang.String r3 = "dynamic_contacts"
            java.lang.String r4 = "dynamic-contacts"
            java.lang.String r5 = "contacts"
            com.google.speech.a.a.q r6 = com.google.speech.p5195a.p5196a.C66437q.f180645b     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.p r6 = (com.google.speech.p5195a.p5196a.C66436p) r6     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.o r8 = com.google.speech.p5195a.p5196a.C66435o.f180640d     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.l r8 = (com.google.speech.p5195a.p5196a.C66432l) r8     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.n r9 = com.google.speech.p5195a.p5196a.C66434n.f180635d     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.m r9 = (com.google.speech.p5195a.p5196a.C66433m) r9     // Catch:{ IOException -> 0x0349 }
            r9.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.n r10 = (com.google.speech.p5195a.p5196a.C66434n) r10     // Catch:{ IOException -> 0x0349 }
            int r11 = r10.f180637a     // Catch:{ IOException -> 0x0349 }
            r11 = r11 | 2
            r10.f180637a = r11     // Catch:{ IOException -> 0x0349 }
            r10.f180639c = r4     // Catch:{ IOException -> 0x0349 }
            r9.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r4 = r9.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.n r4 = (com.google.speech.p5195a.p5196a.C66434n) r4     // Catch:{ IOException -> 0x0349 }
            int r10 = r4.f180637a     // Catch:{ IOException -> 0x0349 }
            r10 = r10 | 1
            r4.f180637a = r10     // Catch:{ IOException -> 0x0349 }
            r4.f180638b = r5     // Catch:{ IOException -> 0x0349 }
            r8.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r4 = r8.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.o r4 = (com.google.speech.p5195a.p5196a.C66435o) r4     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r5 = r9.build()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.n r5 = (com.google.speech.p5195a.p5196a.C66434n) r5     // Catch:{ IOException -> 0x0349 }
            r5.getClass()     // Catch:{ IOException -> 0x0349 }
            r4.f180644c = r5     // Catch:{ IOException -> 0x0349 }
            int r5 = r4.f180642a     // Catch:{ IOException -> 0x0349 }
            r5 = r5 | 2
            r4.f180642a = r5     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r4 = r8.build()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.o r4 = (com.google.speech.p5195a.p5196a.C66435o) r4     // Catch:{ IOException -> 0x0349 }
            r6.mo59628b(r4)     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r4 = r6.build()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.q r4 = (com.google.speech.p5195a.p5196a.C66437q) r4     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.z r5 = com.google.speech.p5195a.p5196a.C66446z.f180663j     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.c r5 = (com.google.speech.p5195a.p5196a.C66423c) r5     // Catch:{ IOException -> 0x0349 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.z r6 = (com.google.speech.p5195a.p5196a.C66446z) r6     // Catch:{ IOException -> 0x0349 }
            int r8 = r6.f180665a     // Catch:{ IOException -> 0x0349 }
            r8 = r8 | 2
            r6.f180665a = r8     // Catch:{ IOException -> 0x0349 }
            r6.f180667c = r3     // Catch:{ IOException -> 0x0349 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.z r3 = (com.google.speech.p5195a.p5196a.C66446z) r3     // Catch:{ IOException -> 0x0349 }
            r6 = 4
            r3.f180666b = r6     // Catch:{ IOException -> 0x0349 }
            int r6 = r3.f180665a     // Catch:{ IOException -> 0x0349 }
            r6 = r6 | 1
            r3.f180665a = r6     // Catch:{ IOException -> 0x0349 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.z r3 = (com.google.speech.p5195a.p5196a.C66446z) r3     // Catch:{ IOException -> 0x0349 }
            r4.getClass()     // Catch:{ IOException -> 0x0349 }
            r3.f180671g = r4     // Catch:{ IOException -> 0x0349 }
            int r4 = r3.f180665a     // Catch:{ IOException -> 0x0349 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.f180665a = r4     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.k r3 = com.google.speech.p5195a.p5196a.C66431k.f180631c     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.j r3 = (com.google.speech.p5195a.p5196a.C66430j) r3     // Catch:{ IOException -> 0x0349 }
            r3.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.k r4 = (com.google.speech.p5195a.p5196a.C66431k) r4     // Catch:{ IOException -> 0x0349 }
            int r6 = r4.f180633a     // Catch:{ IOException -> 0x0349 }
            r6 = r6 | 1
            r4.f180633a = r6     // Catch:{ IOException -> 0x0349 }
            r4.f180634b = r2     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r2 = r3.build()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.k r2 = (com.google.speech.p5195a.p5196a.C66431k) r2     // Catch:{ IOException -> 0x0349 }
            r5.copyOnWrite()     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.z r3 = (com.google.speech.p5195a.p5196a.C66446z) r3     // Catch:{ IOException -> 0x0349 }
            r2.getClass()     // Catch:{ IOException -> 0x0349 }
            r3.f180672h = r2     // Catch:{ IOException -> 0x0349 }
            int r2 = r3.f180665a     // Catch:{ IOException -> 0x0349 }
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3.f180665a = r2     // Catch:{ IOException -> 0x0349 }
            com.google.protobuf.bv r2 = r5.build()     // Catch:{ IOException -> 0x0349 }
            com.google.speech.a.a.z r2 = (com.google.speech.p5195a.p5196a.C66446z) r2     // Catch:{ IOException -> 0x0349 }
            r0.add(r2)     // Catch:{ IOException -> 0x0349 }
            goto L_0x035f
        L_0x0349:
            r2 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.f331803a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "EmbeddedRecognitionCont"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Failed to read contact fst from file"
            r5 = 34298(0x85fa, float:4.8062E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
        L_0x035f:
            if (r7 == 0) goto L_0x0372
            boolean r2 = r7.f167006f
            if (r2 == 0) goto L_0x0372
            java.lang.String r2 = "music-service-controllable"
            java.lang.String r3 = "media-actions"
            java.lang.String r4 = "media_biasing"
            com.google.speech.a.a.z r2 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r4, r2, r3)
            r0.add(r2)
        L_0x0372:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r7 == 0) goto L_0x03ad
            boolean r3 = r7.f167005e
            if (r3 != 0) goto L_0x03a0
            com.google.protobuf.cq r3 = r7.f167010j
            if (r3 == 0) goto L_0x03ad
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0388
            goto L_0x03ad
        L_0x0388:
            java.lang.Object r1 = r3.get(r1)
            com.google.knowledge.b.b r1 = (com.google.knowledge.p4671b.C61808b) r1
            java.lang.String r1 = r1.f166970b
            java.lang.String r3 = "com.google.android.apps.maps"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x03a0
            java.lang.String r3 = "com.google.android.apps.gmm"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L_0x03ad
        L_0x03a0:
            java.lang.String r1 = "gmm-nav-actions"
            java.lang.String r3 = "gmm-actions"
            java.lang.String r4 = "gmm_biasing"
            com.google.speech.a.a.z r1 = com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118983c.m197534a(r4, r1, r3)
            r2.add(r1)
        L_0x03ad:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x03b6
            r0.addAll(r2)
        L_0x03b6:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x03d2
            com.google.speech.a.a.b r1 = com.google.speech.p5195a.p5196a.C66422b.f180605k
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.speech.a.a.a r1 = (com.google.speech.p5195a.p5196a.C66421a) r1
            r1.mo59622a(r0)
            com.google.protobuf.bv r0 = r1.build()
            com.google.speech.a.a.b r0 = (com.google.speech.p5195a.p5196a.C66422b) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x03d4
        L_0x03d2:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x03d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8913c.C118982b.mo17947a():java.lang.Object");
    }
}
