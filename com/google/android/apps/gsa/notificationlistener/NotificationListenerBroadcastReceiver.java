package com.google.android.apps.gsa.notificationlistener;

import android.content.Intent;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* compiled from: PG */
public class NotificationListenerBroadcastReceiver extends C83398n {

    /* renamed from: c */
    private static final C59071e f227250c = C59071e.m91332i("com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver");

    /* renamed from: a */
    public C68214a f227251a;

    /* renamed from: b */
    public C83410z f227252b;

    /* renamed from: d */
    private C36599b f227253d;

    /* renamed from: e */
    private C36599b f227254e;

    /* renamed from: f */
    private C36599b f227255f;

    /* renamed from: b */
    private static C83400p m132700b(Intent intent) {
        C83400p b = C83405u.m132748b();
        if (intent.hasExtra("category_messages")) {
            C58976aa aaVar = C58975e.f156826a;
            b.mo76679b().mo55395g(new C83401q(intent.getStringArrayExtra("category_messages")));
        }
        if (intent.getBooleanExtra("has_reply_action", false)) {
            C58976aa aaVar2 = C58975e.f156826a;
            b.mo76679b().mo55395g(new C83403s());
        }
        if (intent.hasExtra("target_packages")) {
            C58976aa aaVar3 = C58975e.f156826a;
            b.mo76679b().mo55395g(new C83404t(intent.getStringArrayExtra("target_packages")));
        }
        return b;
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            r0 = 13
            com.google.android.apps.gsa.p5846e.C74507e.m120467c(r0)
            r13.mo76697a(r14)
            java.lang.String r0 = r15.getAction()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 6
            r4 = 5
            r5 = 2
            r6 = 4
            r7 = 3
            switch(r1) {
                case -2102010121: goto L_0x0083;
                case -2000261033: goto L_0x0078;
                case -779754306: goto L_0x006d;
                case -638538352: goto L_0x0063;
                case -390278376: goto L_0x0059;
                case -273250687: goto L_0x004f;
                case 436943707: goto L_0x0045;
                case 585034046: goto L_0x003a;
                case 1139426265: goto L_0x0030;
                case 1200040672: goto L_0x0026;
                case 1636005993: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x008d
        L_0x001b:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.GET_APP_NOTIFICATIONS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x0026:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.UNREGISTER_MORRIS_NOTIFICATION_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 6
            goto L_0x008e
        L_0x0030:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.REGISTER_MORRIS_NOTIFICATION_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 5
            goto L_0x008e
        L_0x003a:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.UNREGISTER_CHARGING_AMBIENT_NOTIFICATION_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 8
            goto L_0x008e
        L_0x0045:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.GET_PARSED_NOTIFICATIONS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 2
            goto L_0x008e
        L_0x004f:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.MARK_AS_READ_NOTIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 4
            goto L_0x008e
        L_0x0059:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.REPLY_NOTIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 3
            goto L_0x008e
        L_0x0063:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.GET_ACTIVE_NOTIFICATIONS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 0
            goto L_0x008e
        L_0x006d:
            java.lang.String r1 = "com.google.android.carassistant.REGISTER_AUTO_SUGGESTION_NOTIFICATION_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 9
            goto L_0x008e
        L_0x0078:
            java.lang.String r1 = "com.google.android.carassistant.UNREGISTER_AUTO_SUGGESTION_NOTIFICATION_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 10
            goto L_0x008e
        L_0x0083:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.REGISTER_CHARGING_AMBIENT_NOTIFICATION_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008d
            r0 = 7
            goto L_0x008e
        L_0x008d:
            r0 = -1
        L_0x008e:
            java.lang.String r1 = "Morris notification listener mapping returned null."
            java.lang.String r8 = "NlsReceiver"
            java.lang.String r9 = "AUTO_SUGGESTION"
            java.lang.String r10 = "CHARGING_AMBIENT"
            java.lang.String r11 = "MORRIS"
            java.lang.String r12 = "notification_key"
            switch(r0) {
                case 0: goto L_0x0234;
                case 1: goto L_0x020e;
                case 2: goto L_0x01d5;
                case 3: goto L_0x01ab;
                case 4: goto L_0x0181;
                case 5: goto L_0x014e;
                case 6: goto L_0x011f;
                case 7: goto L_0x00fd;
                case 8: goto L_0x00df;
                case 9: goto L_0x00bd;
                case 10: goto L_0x009f;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x0259
        L_0x009f:
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            dagger.a r14 = r13.f227251a
            java.lang.Object r14 = r14.mo27525b()
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r14 = r14.get(r9)
            com.google.android.libraries.search.assistant.t.c.b r14 = (com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b) r14
            r13.f227255f = r14
            if (r14 == 0) goto L_0x0259
            r14.mo21529a()
            return
        L_0x00bd:
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r15 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r15 == 0) goto L_0x0259
            dagger.a r15 = r13.f227251a
            java.lang.Object r15 = r15.mo27525b()
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r15 = r15.get(r9)
            com.google.android.libraries.search.assistant.t.c.b r15 = (com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b) r15
            r13.f227255f = r15
            if (r15 == 0) goto L_0x0259
            android.content.Context r14 = r14.getApplicationContext()
            com.google.android.apps.gsa.notificationlistener.C83387d.m132712b(r14, r15)
            return
        L_0x00df:
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            dagger.a r14 = r13.f227251a
            java.lang.Object r14 = r14.mo27525b()
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r14 = r14.get(r10)
            com.google.android.libraries.search.assistant.t.c.b r14 = (com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b) r14
            r13.f227254e = r14
            if (r14 == 0) goto L_0x0259
            r14.mo21529a()
            return
        L_0x00fd:
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r15 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r15 == 0) goto L_0x0259
            dagger.a r15 = r13.f227251a
            java.lang.Object r15 = r15.mo27525b()
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r15 = r15.get(r10)
            com.google.android.libraries.search.assistant.t.c.b r15 = (com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b) r15
            r13.f227254e = r15
            if (r15 == 0) goto L_0x0259
            android.content.Context r14 = r14.getApplicationContext()
            com.google.android.apps.gsa.notificationlistener.C83387d.m132712b(r14, r15)
            return
        L_0x011f:
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            dagger.a r14 = r13.f227251a
            java.lang.Object r14 = r14.mo27525b()
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r14 = r14.get(r11)
            com.google.android.libraries.search.assistant.t.c.b r14 = (com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b) r14
            r13.f227253d = r14
            if (r14 == 0) goto L_0x013d
            r14.mo21529a()
            return
        L_0x013d:
            com.google.common.f.e r14 = f227250c
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r8)
            r15 = 6624(0x19e0, float:9.282E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r15)).mo56386p(r1)
            return
        L_0x014e:
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r15 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r15 == 0) goto L_0x0259
            dagger.a r15 = r13.f227251a
            java.lang.Object r15 = r15.mo27525b()
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r15 = r15.get(r11)
            com.google.android.libraries.search.assistant.t.c.b r15 = (com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b) r15
            r13.f227253d = r15
            if (r15 == 0) goto L_0x0170
            android.content.Context r14 = r14.getApplicationContext()
            com.google.android.apps.gsa.notificationlistener.C83387d.m132712b(r14, r15)
            return
        L_0x0170:
            com.google.common.f.e r14 = f227250c
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r8)
            r15 = 6621(0x19dd, float:9.278E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r15)).mo56386p(r1)
            return
        L_0x0181:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            com.google.android.apps.gsa.notificationlistener.z r14 = r13.f227252b
            java.lang.String r0 = r15.getStringExtra(r12)
            java.lang.String r1 = "dismiss_msg_notification"
            boolean r15 = r15.getBooleanExtra(r1, r2)
            com.google.android.apps.gsa.notificationlistener.d r1 = r14.f227306b
            boolean r1 = com.google.android.apps.gsa.notificationlistener.C83391h.m132726f()
            if (r1 == 0) goto L_0x01a1
            r14.mo76704b(r0, r15)
            return
        L_0x01a1:
            r14.f227313i = r3
            r14.f227310f = r0
            r14.f227312h = r15
            r14.mo76706d()
            return
        L_0x01ab:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            com.google.android.apps.gsa.notificationlistener.z r14 = r13.f227252b
            java.lang.String r0 = r15.getStringExtra(r12)
            java.lang.String r1 = "reply_message"
            java.lang.String r15 = r15.getStringExtra(r1)
            com.google.android.apps.gsa.notificationlistener.d r1 = r14.f227306b
            boolean r1 = com.google.android.apps.gsa.notificationlistener.C83391h.m132726f()
            if (r1 == 0) goto L_0x01cb
            r14.mo76705c(r0, r15)
            return
        L_0x01cb:
            r14.f227313i = r4
            r14.f227310f = r0
            r14.f227311g = r15
            r14.mo76706d()
            return
        L_0x01d5:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            com.google.android.apps.gsa.notificationlistener.p r14 = m132700b(r15)
            com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs.f252367m
            java.lang.String r1 = "notification_parse_configs"
            boolean r2 = r15.hasExtra(r1)
            if (r2 == 0) goto L_0x01f2
            android.os.Parcelable r15 = r15.getParcelableExtra(r1)
            r0 = r15
            com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs r0 = (com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs) r0
        L_0x01f2:
            com.google.android.apps.gsa.notificationlistener.z r15 = r13.f227252b
            com.google.android.apps.gsa.notificationlistener.u r14 = r14.mo76678a()
            com.google.android.apps.gsa.notificationlistener.d r1 = r15.f227306b
            boolean r1 = com.google.android.apps.gsa.notificationlistener.C83391h.m132726f()
            if (r1 == 0) goto L_0x0204
            r15.mo76709g(r14, r0)
            return
        L_0x0204:
            r15.f227313i = r6
            r15.f227308d = r14
            r15.f227309e = r0
            r15.mo76706d()
            return
        L_0x020e:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            com.google.android.apps.gsa.notificationlistener.p r14 = m132700b(r15)
            com.google.android.apps.gsa.notificationlistener.z r15 = r13.f227252b
            com.google.android.apps.gsa.notificationlistener.u r14 = r14.mo76678a()
            com.google.android.apps.gsa.notificationlistener.d r0 = r15.f227306b
            boolean r0 = com.google.android.apps.gsa.notificationlistener.C83391h.m132726f()
            if (r0 == 0) goto L_0x022c
            r15.mo76708f(r14)
            return
        L_0x022c:
            r15.f227313i = r7
            r15.f227308d = r14
            r15.mo76706d()
            return
        L_0x0234:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r14 = com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a.m65148d(r14)
            if (r14 == 0) goto L_0x0259
            com.google.android.apps.gsa.notificationlistener.p r14 = m132700b(r15)
            com.google.android.apps.gsa.notificationlistener.z r15 = r13.f227252b
            com.google.android.apps.gsa.notificationlistener.u r14 = r14.mo76678a()
            com.google.android.apps.gsa.notificationlistener.d r0 = r15.f227306b
            boolean r0 = com.google.android.apps.gsa.notificationlistener.C83391h.m132726f()
            if (r0 == 0) goto L_0x0252
            r15.mo76707e(r14)
            return
        L_0x0252:
            r15.f227313i = r5
            r15.f227308d = r14
            r15.mo76706d()
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
