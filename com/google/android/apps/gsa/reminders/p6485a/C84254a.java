package com.google.android.apps.gsa.reminders.p6485a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;

/* renamed from: com.google.android.apps.gsa.reminders.a.a */
/* compiled from: PG */
public final class C84254a {

    /* renamed from: a */
    private static final C59071e f229293a = C59071e.m91332i("com.google.android.apps.gsa.reminders.a.a");

    /* renamed from: b */
    private final C86124t f229294b;

    public C84254a(C86124t tVar) {
        this.f229294b = tVar;
    }

    /* renamed from: b */
    private static void m134344b(C47872f fVar, String str, boolean z, String str2) {
        Uri uri;
        C58976aa aaVar = C58975e.f156826a;
        if (C58837ba.m90859h(str2)) {
            uri = null;
        } else {
            uri = Uri.parse("assistant-reminders://android/buttonAction?deleteNotificationonSuccess=" + z + "&reminderId=" + str2);
        }
        if (uri != null) {
            C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
            gVar.copyOnWrite();
            C47875i iVar = (C47875i) gVar.instance;
            str.getClass();
            iVar.f123947a = 1;
            iVar.f123948b = str;
            C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
            aVar.mo51701a(uri.toString());
            gVar.copyOnWrite();
            C47868b bVar = (C47868b) aVar.build();
            bVar.getClass();
            ((C47875i) gVar.instance).f123950d = bVar;
            fVar.mo51702a(gVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v6, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3897e.p3921j.aas mo77743a(android.content.Context r18, com.google.android.gms.reminders.model.Task r19, long r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.String r4 = "TaskToNotificationArgsP"
            r5 = 0
            if (r19 != 0) goto L_0x001e
            com.google.common.f.e r1 = f229293a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "Cannot create NotificationArgs for null Task"
            r3 = 7144(0x1be8, float:1.0011E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return r5
        L_0x001e:
            com.google.android.gms.reminders.model.TaskId r6 = r19.mo122077n()
            java.lang.String r6 = r6.mo122058h()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r7 = com.google.common.base.C58837ba.m90859h(r6)
            if (r7 == 0) goto L_0x0041
            com.google.common.f.e r1 = f229293a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "Reminder ID not found"
            r3 = 7143(0x1be7, float:1.001E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return r5
        L_0x0041:
            com.google.android.gms.reminders.model.Location r7 = r19.mo122074k()
            r8 = 129(0x81, float:1.81E-43)
            if (r7 != 0) goto L_0x0051
            com.google.android.gms.reminders.model.LocationGroup r7 = r19.mo122075l()
            if (r7 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r8 = 2
        L_0x0051:
            byte[] r7 = r19.mo122069I()     // Catch:{ ct -> 0x0488 }
            if (r7 != 0) goto L_0x005c
            com.google.assistant.ag.c.gs r7 = com.google.assistant.p3803ag.p3809c.C49107gs.f127001g     // Catch:{ ct -> 0x0488 }
            com.google.i.a.bd r10 = com.google.p4653i.p4654a.C61690bd.f166668a     // Catch:{ ct -> 0x0488 }
            goto L_0x008e
        L_0x005c:
            byte[] r7 = r19.mo122069I()     // Catch:{ ct -> 0x0488 }
            com.google.protobuf.ba r10 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0488 }
            com.google.i.a.bd r11 = com.google.p4653i.p4654a.C61690bd.f166668a     // Catch:{ ct -> 0x0488 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r11, (byte[]) r7, (com.google.protobuf.C62921ba) r10)     // Catch:{ ct -> 0x0488 }
            r10 = r7
            com.google.i.a.bd r10 = (com.google.p4653i.p4654a.C61690bd) r10     // Catch:{ ct -> 0x0488 }
            com.google.protobuf.bt r7 = com.google.assistant.p3803ag.p3809c.C49107gs.f127002h     // Catch:{ ct -> 0x0488 }
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)     // Catch:{ ct -> 0x0488 }
            r10.mo58887l(r7)     // Catch:{ ct -> 0x0488 }
            com.google.protobuf.bf r11 = r10.f169962ag     // Catch:{ ct -> 0x0488 }
            com.google.protobuf.bs r12 = r7.f169971d     // Catch:{ ct -> 0x0488 }
            java.lang.Object r11 = r11.mo58854l(r12)     // Catch:{ ct -> 0x0488 }
            if (r11 != 0) goto L_0x0083
            java.lang.Object r7 = r7.f169969b     // Catch:{ ct -> 0x0488 }
            goto L_0x0087
        L_0x0083:
            java.lang.Object r7 = r7.mo58889c(r11)     // Catch:{ ct -> 0x0488 }
        L_0x0087:
            com.google.assistant.ag.c.gs r7 = (com.google.assistant.p3803ag.p3809c.C49107gs) r7     // Catch:{ ct -> 0x0488 }
            int r11 = r7.f127007d     // Catch:{ ct -> 0x0488 }
            if (r11 == 0) goto L_0x008e
            r8 = r11
        L_0x008e:
            com.google.protobuf.bt r11 = com.google.assistant.p3812ah.p3813a.C49166d.f127136c
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r10.mo58887l(r11)
            com.google.protobuf.bf r12 = r10.f169962ag
            com.google.protobuf.bs r13 = r11.f169971d
            java.lang.Object r12 = r12.mo58854l(r13)
            if (r12 != 0) goto L_0x00a4
            java.lang.Object r11 = r11.f169969b
            goto L_0x00a8
        L_0x00a4:
            java.lang.Object r11 = r11.mo58889c(r12)
        L_0x00a8:
            com.google.assistant.ah.a.d r11 = (com.google.assistant.p3812ah.p3813a.C49166d) r11
            long r11 = r11.f127138a
            r13 = 0
            r15 = 0
            r9 = 1
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x00b6
            r11 = 1
            goto L_0x00b7
        L_0x00b6:
            r11 = 0
        L_0x00b7:
            com.google.assistant.e.j.aas r12 = com.google.assistant.p3897e.p3921j.aas.f134661u
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.j.aaj r12 = (com.google.assistant.p3897e.p3921j.aaj) r12
            java.lang.String r13 = r7.f127006c
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.assistant.e.j.aas r14 = (com.google.assistant.p3897e.p3921j.aas) r14
            r13.getClass()
            int r5 = r14.f134663a
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r14.f134663a = r5
            r14.f134675m = r13
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.assistant.e.j.aas r5 = (com.google.assistant.p3897e.p3921j.aas) r5
            r6.getClass()
            int r13 = r5.f134663a
            r13 = r13 | 256(0x100, float:3.59E-43)
            r5.f134663a = r13
            r5.f134670h = r6
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.assistant.e.j.aas r5 = (com.google.assistant.p3897e.p3921j.aas) r5
            r5.f134664b = r15
            int r13 = r5.f134663a
            r13 = r13 | r9
            r5.f134663a = r13
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f229294b
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90056dh.f249001b
            boolean r5 = r5.mo79746e(r13)
            if (r5 == 0) goto L_0x010e
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.assistant.e.j.aas r5 = (com.google.assistant.p3897e.p3921j.aas) r5
            int r13 = r5.f134663a
            r13 = r13 | 512(0x200, float:7.175E-43)
            r5.f134663a = r13
            java.lang.String r13 = "REMINDER"
            r5.f134671i = r13
        L_0x010e:
            com.google.android.gms.reminders.model.DateTime r5 = r19.mo122071h()
            if (r5 != 0) goto L_0x0117
        L_0x0114:
            r2 = 0
            goto L_0x0185
        L_0x0117:
            com.google.android.gms.reminders.model.DateTime r5 = r19.mo122071h()
            java.lang.Long r5 = com.google.android.libraries.p11024al.p11025a.C147754j.m240815c(r5)
            if (r5 != 0) goto L_0x0122
            goto L_0x0114
        L_0x0122:
            com.google.android.gms.reminders.model.DateTime r13 = r19.mo122071h()
            java.lang.Boolean r13 = r13.mo121993i()
            if (r13 == 0) goto L_0x017b
            com.google.android.gms.reminders.model.DateTime r13 = r19.mo122071h()
            java.lang.Boolean r13 = r13.mo121993i()
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x017b
            long r13 = r5.longValue()
            boolean r13 = android.text.format.DateUtils.isToday(r13)
            if (r13 == 0) goto L_0x014c
            r2 = 2132092992(0x7f152840, float:1.9826396E38)
            java.lang.String r2 = r1.getString(r2)
            goto L_0x0185
        L_0x014c:
            long r13 = r5.longValue()
            boolean r13 = com.google.android.apps.gsa.shared.util.C90769bm.m148271c(r13, r2)
            if (r13 == 0) goto L_0x015e
            r2 = 2132092999(0x7f152847, float:1.982641E38)
            java.lang.String r2 = r1.getString(r2)
            goto L_0x0185
        L_0x015e:
            long r13 = r5.longValue()
            boolean r2 = com.google.android.apps.gsa.shared.util.C90769bm.m148271c(r2, r13)
            if (r2 == 0) goto L_0x0170
            r2 = 2132093767(0x7f152b47, float:1.9827968E38)
            java.lang.String r2 = r1.getString(r2)
            goto L_0x0185
        L_0x0170:
            long r2 = r5.longValue()
            r5 = 18
            java.lang.String r2 = android.text.format.DateUtils.formatDateTime(r1, r2, r5)
            goto L_0x0185
        L_0x017b:
            long r2 = r5.longValue()
            r5 = 19
            java.lang.CharSequence r2 = com.google.android.apps.gsa.shared.p7019bc.C89407a.m145418a(r1, r2, r5, r15)
        L_0x0185:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x018b
            r2 = r3
            goto L_0x018f
        L_0x018b:
            java.lang.String r2 = r2.toString()
        L_0x018f:
            com.google.aq.a.a.u r5 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.aq.a.a.f r5 = (com.google.p3717aq.p3718a.p3719a.C47872f) r5
            java.lang.String r13 = r19.mo122067G()
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.aq.a.a.u r14 = (com.google.p3717aq.p3718a.p3719a.C47887u) r14
            r13.getClass()
            r14.f123978a = r9
            r14.f123979b = r13
            com.google.aq.a.a.b r13 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.aq.a.a.a r13 = (com.google.p3717aq.p3718a.p3719a.C47867a) r13
            java.lang.String r14 = "https://assistant.google.com/reminders/mainview"
            r13.mo51701a(r14)
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.aq.a.a.u r14 = (com.google.p3717aq.p3718a.p3719a.C47887u) r14
            com.google.protobuf.bv r13 = r13.build()
            com.google.aq.a.a.b r13 = (com.google.p3717aq.p3718a.p3719a.C47868b) r13
            r13.getClass()
            r14.f123984g = r13
            r5.copyOnWrite()
            com.google.protobuf.bv r13 = r5.instance
            com.google.aq.a.a.u r13 = (com.google.p3717aq.p3718a.p3719a.C47887u) r13
            r14 = 15
            int r14 = com.google.p3717aq.p3718a.p3719a.C47877k.m85093a(r14)
            r13.f123987j = r14
            r13 = 7
            if (r2 == 0) goto L_0x01e5
            r5.copyOnWrite()
            com.google.protobuf.bv r14 = r5.instance
            com.google.aq.a.a.u r14 = (com.google.p3717aq.p3718a.p3719a.C47887u) r14
            r14.f123980c = r13
            r14.f123981d = r2
        L_0x01e5:
            if (r11 != 0) goto L_0x02ec
            com.google.android.gms.reminders.model.Location r2 = r19.mo122074k()
            if (r2 != 0) goto L_0x0238
            com.google.android.gms.reminders.model.LocationGroup r2 = r19.mo122075l()
            if (r2 == 0) goto L_0x01f4
            goto L_0x0238
        L_0x01f4:
            com.google.android.gms.reminders.model.DateTime r2 = r19.mo122071h()
            if (r2 == 0) goto L_0x0236
            com.google.android.gms.reminders.model.DateTime r2 = r19.mo122071h()
            java.lang.Boolean r14 = r2.mo121993i()
            if (r14 == 0) goto L_0x0216
            java.lang.Boolean r2 = r2.mo121993i()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0216
            r2 = 2132092504(0x7f152658, float:1.9825406E38)
            java.lang.String r2 = r1.getString(r2)
            goto L_0x023f
        L_0x0216:
            com.google.android.gms.reminders.model.DateTime r2 = r19.mo122071h()
            java.lang.Boolean r2 = r2.mo121994j()
            if (r2 == 0) goto L_0x022e
            com.google.android.gms.reminders.model.DateTime r2 = r19.mo122071h()
            java.lang.Boolean r2 = r2.mo121994j()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0236
        L_0x022e:
            r2 = 2132092501(0x7f152655, float:1.98254E38)
            java.lang.String r2 = r1.getString(r2)
            goto L_0x023f
        L_0x0236:
            r2 = 0
            goto L_0x023f
        L_0x0238:
            r2 = 2132092503(0x7f152657, float:1.9825404E38)
            java.lang.String r2 = r1.getString(r2)
        L_0x023f:
            boolean r14 = com.google.common.base.C58837ba.m90859h(r2)
            if (r14 == 0) goto L_0x0259
            com.google.common.f.e r1 = f229293a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "Snooze message not found"
            r3 = 7141(0x1be5, float:1.0007E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            r1 = 0
            return r1
        L_0x0259:
            m134344b(r5, r2, r15, r6)
            r2 = 2132091935(0x7f15241f, float:1.9824252E38)
            java.lang.String r2 = r1.getString(r2)
            m134344b(r5, r2, r9, r6)
            java.lang.String r2 = r19.mo122067G()
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f229294b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90056dh.f249000a
            boolean r4 = r4.mo79746e(r6)
            if (r4 != 0) goto L_0x0275
            goto L_0x02ec
        L_0x0275:
            com.google.protobuf.bt r4 = com.google.assistant.p3821al.p3823b.C49237d.f127291c
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r10.mo58887l(r4)
            com.google.protobuf.bf r6 = r10.f169962ag
            com.google.protobuf.bs r10 = r4.f169971d
            java.lang.Object r6 = r6.mo58854l(r10)
            if (r6 != 0) goto L_0x028b
            java.lang.Object r4 = r4.f169969b
            goto L_0x028f
        L_0x028b:
            java.lang.Object r4 = r4.mo58889c(r6)
        L_0x028f:
            com.google.assistant.al.b.d r4 = (com.google.assistant.p3821al.p3823b.C49237d) r4
            int r4 = r4.f127293a
            int r4 = com.google.assistant.p3821al.p3823b.C49235b.m85390a(r4)
            if (r4 == 0) goto L_0x02ec
            r6 = 3
            if (r4 != r6) goto L_0x02ec
            com.google.aq.a.a.i r4 = com.google.p3717aq.p3718a.p3719a.C47875i.f123945g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.aq.a.a.g r4 = (com.google.p3717aq.p3718a.p3719a.C47873g) r4
            r6 = 2132085240(0x7f1509f8, float:1.9810673E38)
            java.lang.String r1 = r1.getString(r6)
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.aq.a.a.i r6 = (com.google.p3717aq.p3718a.p3719a.C47875i) r6
            r1.getClass()
            r6.f123947a = r9
            r6.f123948b = r1
            com.google.aq.a.a.b r1 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.aq.a.a.a r1 = (com.google.p3717aq.p3718a.p3719a.C47867a) r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "intent:#Intent;component=com.google.android.googlequicksearchbox/com.google.android.apps.gsa.staticplugins.opa.OpaActivity;B.opa_start_full_screen=true;i.requested_mic_state=3;B.opa_show_docked_ui=true;S.opa-query-string="
            r6.<init>(r10)
            r6.append(r2)
            java.lang.String r2 = ";end;"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r1.mo51701a(r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.aq.a.a.i r2 = (com.google.p3717aq.p3718a.p3719a.C47875i) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.aq.a.a.b r1 = (com.google.p3717aq.p3718a.p3719a.C47868b) r1
            r1.getClass()
            r2.f123950d = r1
            r5.mo51702a(r4)
        L_0x02ec:
            com.google.protobuf.cq r1 = r7.f127008e
            java.util.Iterator r1 = r1.iterator()
        L_0x02f2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0316
            java.lang.Object r2 = r1.next()
            com.google.f.a.f r2 = (com.google.p4605f.p4606a.C61078f) r2
            com.google.f.a.e r4 = r2.f165358a
            if (r4 != 0) goto L_0x0304
            com.google.f.a.e r4 = com.google.p4605f.p4606a.C61077e.f165352b
        L_0x0304:
            int r4 = r4.f165354a
            int r4 = com.google.p4605f.p4606a.C61076d.m93435a(r4)
            if (r4 == 0) goto L_0x02f2
            r6 = 2
            if (r4 != r6) goto L_0x02f2
            com.google.aq.a.a.u r1 = r2.f165359b
            if (r1 != 0) goto L_0x0317
            com.google.aq.a.a.u r1 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
            goto L_0x0317
        L_0x0316:
            r1 = 0
        L_0x0317:
            if (r1 != 0) goto L_0x031b
            goto L_0x03c2
        L_0x031b:
            int r2 = r1.f123978a
            if (r2 != r9) goto L_0x0324
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0325
        L_0x0324:
            r2 = r3
        L_0x0325:
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0343
            int r2 = r1.f123978a
            if (r2 != r9) goto L_0x0334
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0335
        L_0x0334:
            r2 = r3
        L_0x0335:
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.aq.a.a.u r4 = (com.google.p3717aq.p3718a.p3719a.C47887u) r4
            r2.getClass()
            r4.f123978a = r9
            r4.f123979b = r2
        L_0x0343:
            int r2 = r1.f123980c
            if (r2 != r13) goto L_0x034c
            java.lang.Object r2 = r1.f123981d
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x034d
        L_0x034c:
            r2 = r3
        L_0x034d:
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x036a
            int r2 = r1.f123980c
            if (r2 != r13) goto L_0x035c
            java.lang.Object r2 = r1.f123981d
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L_0x035c:
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.aq.a.a.u r2 = (com.google.p3717aq.p3718a.p3719a.C47887u) r2
            r3.getClass()
            r2.f123980c = r13
            r2.f123981d = r3
        L_0x036a:
            com.google.aq.a.a.b r2 = r1.f123984g
            if (r2 == 0) goto L_0x0377
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.aq.a.a.u r3 = (com.google.p3717aq.p3718a.p3719a.C47887u) r3
            r3.f123984g = r2
        L_0x0377:
            int r2 = r1.f123987j
            int r3 = com.google.p3717aq.p3718a.p3719a.C47877k.m85094b(r2)
            if (r3 != 0) goto L_0x0380
            goto L_0x0383
        L_0x0380:
            r4 = 2
            if (r3 == r4) goto L_0x0397
        L_0x0383:
            int r2 = com.google.p3717aq.p3718a.p3719a.C47877k.m85094b(r2)
            if (r2 != 0) goto L_0x038a
            r2 = 1
        L_0x038a:
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.aq.a.a.u r3 = (com.google.p3717aq.p3718a.p3719a.C47887u) r3
            int r2 = com.google.p3717aq.p3718a.p3719a.C47877k.m85093a(r2)
            r3.f123987j = r2
        L_0x0397:
            com.google.protobuf.cq r2 = r1.f123986i
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03c2
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.aq.a.a.u r2 = (com.google.p3717aq.p3718a.p3719a.C47887u) r2
            com.google.protobuf.cq r3 = com.google.p3717aq.p3718a.p3719a.C47887u.emptyProtobufList()
            r2.f123986i = r3
            com.google.protobuf.cq r1 = r1.f123986i
            java.util.Iterator r1 = r1.iterator()
        L_0x03b2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03c2
            java.lang.Object r2 = r1.next()
            com.google.aq.a.a.i r2 = (com.google.p3717aq.p3718a.p3719a.C47875i) r2
            r5.mo51703b(r2)
            goto L_0x03b2
        L_0x03c2:
            com.google.assistant.e.j.abc r1 = com.google.assistant.p3897e.p3921j.abc.f134691o
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.aax r1 = (com.google.assistant.p3897e.p3921j.aax) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.abc r2 = (com.google.assistant.p3897e.p3921j.abc) r2
            com.google.protobuf.bv r3 = r5.build()
            com.google.aq.a.a.u r3 = (com.google.p3717aq.p3718a.p3719a.C47887u) r3
            r3.getClass()
            r2.f134698e = r3
            int r3 = r2.f134694a
            r4 = 2
            r3 = r3 | r4
            r2.f134694a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.abc r2 = (com.google.assistant.p3897e.p3921j.abc) r2
            r2.f134697d = r9
            int r3 = r2.f134694a
            r3 = r3 | r9
            r2.f134694a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.abc r2 = (com.google.assistant.p3897e.p3921j.abc) r2
            r3 = 2
            r2.f134699f = r3
            int r3 = r2.f134694a
            r3 = r3 | 16
            r2.f134694a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.abc r2 = (com.google.assistant.p3897e.p3921j.abc) r2
            int r3 = r2.f134694a
            r3 = r3 | 32
            r2.f134694a = r3
            r3 = 11
            r2.f134700g = r3
            com.google.protobuf.bt r2 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.abc r1 = (com.google.assistant.p3897e.p3921j.abc) r1
            r12.mo58885m(r2, r1)
            com.google.assistant.e.j.aap r1 = com.google.assistant.p3897e.p3921j.aap.f134650h
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.aam r1 = (com.google.assistant.p3897e.p3921j.aam) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.aap r2 = (com.google.assistant.p3897e.p3921j.aap) r2
            int r3 = r2.f134652a
            r3 = r3 | r9
            r2.f134652a = r3
            r3 = 34
            r2.f134653b = r3
            if (r11 == 0) goto L_0x043e
            r2 = 2
            if (r8 != r2) goto L_0x043c
            r8 = 135(0x87, float:1.89E-43)
            goto L_0x043e
        L_0x043c:
            r8 = 136(0x88, float:1.9E-43)
        L_0x043e:
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.aap r2 = (com.google.assistant.p3897e.p3921j.aap) r2
            int r3 = r2.f134652a
            r3 = r3 | 4
            r2.f134652a = r3
            r2.f134655d = r8
            com.google.protobuf.ch r2 = r7.f127009f
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.aap r3 = (com.google.assistant.p3897e.p3921j.aap) r3
            com.google.protobuf.ch r4 = r3.f134656e
            boolean r5 = r4.mo58948c()
            if (r5 != 0) goto L_0x0464
            com.google.protobuf.ch r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r4)
            r3.f134656e = r4
        L_0x0464:
            com.google.protobuf.ch r3 = r3.f134656e
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r3)
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.aap r1 = (com.google.assistant.p3897e.p3921j.aap) r1
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.assistant.e.j.aas r2 = (com.google.assistant.p3897e.p3921j.aas) r2
            r1.getClass()
            r2.f134676n = r1
            int r1 = r2.f134663a
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r2.f134663a = r1
            com.google.protobuf.bv r1 = r12.build()
            com.google.assistant.e.j.aas r1 = (com.google.assistant.p3897e.p3921j.aas) r1
            return r1
        L_0x0488:
            com.google.common.f.e r1 = f229293a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r4)
            java.lang.String r2 = "Could not parse TaskExtensions for Reminder"
            r3 = 7142(0x1be6, float:1.0008E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.reminders.p6485a.C84254a.mo77743a(android.content.Context, com.google.android.gms.reminders.model.Task, long):com.google.assistant.e.j.aas");
    }
}
