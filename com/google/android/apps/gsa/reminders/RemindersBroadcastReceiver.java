package com.google.android.apps.gsa.reminders;

import com.google.android.apps.gsa.reminders.p6485a.C84254a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* compiled from: PG */
public class RemindersBroadcastReceiver extends C84253a {

    /* renamed from: a */
    public static final C59071e f229276a = C59071e.m91332i("com.google.android.apps.gsa.reminders.RemindersBroadcastReceiver");

    /* renamed from: k */
    private static final C58528ij f229277k = C58528ij.m90013M("com.google.android.apps.gsa.sidekick.main.reminders.ACTION_EXECUTE_REMINDER_ACTION", "com.google.android.apps.gsa.sidekick.main.reminders.ACTION_NOTIFICATION_CLICK", "com.google.android.apps.gsa.sidekick.main.reminders.ACTION_REMINDERS_CHANGED", "com.google.android.apps.gsa.sidekick.main.reminders.ACTION_REMINDER_FIRED");

    /* renamed from: b */
    public C68214a f229278b;

    /* renamed from: c */
    public C91097g f229279c;

    /* renamed from: d */
    public C68214a f229280d;

    /* renamed from: e */
    public C22871g f229281e;

    /* renamed from: f */
    public C68214a f229282f;

    /* renamed from: g */
    public C68214a f229283g;

    /* renamed from: h */
    public C118561t f229284h;

    /* renamed from: i */
    public C84254a f229285i;

    /* renamed from: j */
    public C21370a f229286j;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.google.assistant.e.j.aas} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            r2 = 15
            com.google.android.apps.gsa.p5846e.C74507e.m120467c(r2)
            java.lang.String r2 = "RemindersReceiver"
            if (r13 == 0) goto L_0x026d
            java.lang.String r3 = r13.getAction()
            if (r3 != 0) goto L_0x0011
            goto L_0x026d
        L_0x0011:
            java.lang.String r3 = r13.getAction()
            com.google.common.b.ij r4 = f229277k
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x026a
            r11.mo77742a(r12)
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r4 = r3.hashCode()
            r5 = 3
            r6 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            switch(r4) {
                case -1981664145: goto L_0x004d;
                case 412835659: goto L_0x0043;
                case 1811279276: goto L_0x0039;
                case 2116141214: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0057
        L_0x002f:
            java.lang.String r4 = "com.google.android.apps.gsa.sidekick.main.reminders.ACTION_NOTIFICATION_CLICK"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0039:
            java.lang.String r4 = "com.google.android.apps.gsa.sidekick.main.reminders.ACTION_REMINDERS_CHANGED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0057
            r3 = 2
            goto L_0x0058
        L_0x0043:
            java.lang.String r4 = "com.google.android.apps.gsa.sidekick.main.reminders.ACTION_REMINDER_FIRED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0057
            r3 = 3
            goto L_0x0058
        L_0x004d:
            java.lang.String r4 = "com.google.android.apps.gsa.sidekick.main.reminders.ACTION_EXECUTE_REMINDER_ACTION"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0057
            r3 = 0
            goto L_0x0058
        L_0x0057:
            r3 = -1
        L_0x0058:
            java.lang.String r4 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ENTRIES"
            if (r3 == 0) goto L_0x01f2
            r10 = 0
            if (r3 == r8) goto L_0x014c
            if (r3 == r7) goto L_0x00b8
            if (r3 == r5) goto L_0x0065
            goto L_0x0269
        L_0x0065:
            java.lang.String r3 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_TASK"
            android.os.Parcelable r1 = r13.getParcelableExtra(r3)
            com.google.android.gms.reminders.model.Task r1 = (com.google.android.gms.reminders.model.Task) r1
            if (r1 == 0) goto L_0x009f
            java.lang.Boolean r3 = r1.mo122078o()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x007a
            goto L_0x009f
        L_0x007a:
            com.google.android.gms.reminders.model.Location r3 = r1.mo122074k()
            if (r3 == 0) goto L_0x0093
            com.google.common.f.e r1 = f229276a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r2)
            java.lang.String r3 = "unexpected location reminder"
            r4 = 7121(0x1bd1, float:9.979E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r3)
            goto L_0x009f
        L_0x0093:
            com.google.android.apps.gsa.reminders.a.a r3 = r11.f229285i
            com.google.android.libraries.f.a r4 = r11.f229286j
            long r4 = r4.mo26870b()
            com.google.assistant.e.j.aas r10 = r3.mo77743a(r12, r1, r4)
        L_0x009f:
            if (r10 != 0) goto L_0x00b4
            com.google.common.f.e r0 = f229276a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Could not parse Task proto"
            r2 = 7134(0x1bde, float:9.997E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x00b4:
            com.google.android.libraries.search.assistant.proactive.p2770b.C36232a.m64676c(r12, r10, r7)
            return
        L_0x00b8:
            java.lang.String r0 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_HAS_ACTIVE_REMINDERS"
            boolean r0 = r13.getBooleanExtra(r0, r9)
            java.lang.String r3 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_INACTIVE_REMINDER_IDS"
            java.util.ArrayList r3 = r13.getStringArrayListExtra(r3)
            if (r0 != 0) goto L_0x013a
            if (r3 == 0) goto L_0x0269
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0269
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            dagger.a r0 = r11.f229283g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.sidekick.main.entry.ay r0 = (com.google.android.apps.gsa.sidekick.main.entry.C91320ay) r0
            com.google.common.util.concurrent.cx r0 = r0.mo85612a()
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92910s(r0)
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r5 = r0.mo56113h()
            if (r5 == 0) goto L_0x00f9
            com.google.android.apps.gsa.reminders.f r5 = new com.google.android.apps.gsa.reminders.f
            r5.<init>(r3, r4)
            java.lang.Object r0 = r0.mo56107c()
            com.google.ai.b.ii r0 = (com.google.p375ai.p378b.C7744ii) r0
            r5.mo86660l(r0)
        L_0x00f9:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x013a
            dagger.a r0 = r11.f229280d     // Catch:{ RuntimeException -> 0x010b }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ RuntimeException -> 0x010b }
            com.google.android.apps.gsa.sidekick.main.notifications.aa r0 = (com.google.android.apps.gsa.sidekick.main.notifications.C91486aa) r0     // Catch:{ RuntimeException -> 0x010b }
            r0.mo85830a(r4)     // Catch:{ RuntimeException -> 0x010b }
            goto L_0x011e
        L_0x010b:
            r0 = move-exception
            com.google.common.f.e r3 = f229276a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r5, r2)
            java.lang.String r2 = "Not removing reminder notification."
            r5 = 7127(0x1bd7, float:9.987E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r2)
        L_0x011e:
            android.content.BroadcastReceiver$PendingResult r0 = r11.goAsync()
            dagger.a r2 = r11.f229282f
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.sidekick.main.entry.ak r2 = (com.google.android.apps.gsa.sidekick.main.entry.C91306ak) r2
            com.google.common.util.concurrent.cx r2 = r2.mo85592e(r4)
            com.google.android.libraries.gsa.k.g r3 = r11.f229281e
            com.google.android.apps.gsa.reminders.e r4 = new com.google.android.apps.gsa.reminders.e
            r4.<init>(r0)
            java.lang.String r0 = "HandleDismissedEntries"
            r3.mo28211k(r2, r0, r4)
        L_0x013a:
            java.lang.String r0 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_HAS_LOCATION_REMINDERS"
            boolean r0 = r13.getBooleanExtra(r0, r9)
            if (r0 == 0) goto L_0x0269
            com.google.android.apps.gsa.tasks.t r0 = r11.f229284h
            com.google.android.apps.gsa.tasks.by r1 = com.google.android.apps.gsa.tasks.C118522by.OPA_NOTIFICATION_DELAYED_TRIGGER_SYNC
            com.google.android.apps.gsa.tasks.ag r2 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            r0.mo103754e(r1, r2)
            return
        L_0x014c:
            java.util.List r0 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150939e(r13, r4)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x01b1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x015f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0191
            java.lang.Object r3 = r2.next()
            com.google.ai.b.hj r3 = (com.google.p375ai.p378b.C7718hj) r3
            com.google.ai.b.pw r4 = r3.f26979t
            if (r4 != 0) goto L_0x0171
            com.google.ai.b.pw r4 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x0171:
            int r4 = r4.f27898a
            r4 = r4 & 32
            if (r4 == 0) goto L_0x015f
            com.google.ai.b.pw r4 = r3.f26979t
            if (r4 != 0) goto L_0x017d
            com.google.ai.b.pw r4 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x017d:
            java.lang.String r4 = r4.f27899b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x015f
            com.google.ai.b.pw r3 = r3.f26979t
            if (r3 != 0) goto L_0x018b
            com.google.ai.b.pw r3 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x018b:
            java.lang.String r3 = r3.f27899b
            r1.add(r3)
            goto L_0x015f
        L_0x0191:
            dagger.a r2 = r11.f229278b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.sidekick.shared.l.a r2 = (com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a) r2
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L_0x01b1
            if (r2 == 0) goto L_0x01b1
            android.content.BroadcastReceiver$PendingResult r3 = r11.goAsync()
            com.google.android.libraries.gsa.k.g r4 = r11.f229281e
            com.google.android.apps.gsa.reminders.c r5 = new com.google.android.apps.gsa.reminders.c
            r5.<init>(r2, r1, r3)
            java.lang.String r1 = "BumpLocationReminder"
            r4.mo28212l(r1, r5)
        L_0x01b1:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01b8
            goto L_0x01cb
        L_0x01b8:
            int r1 = r0.size()
            int r1 = r1 + r6
            java.lang.Object r0 = r0.get(r1)
            com.google.ai.b.hj r0 = (com.google.p375ai.p378b.C7718hj) r0
            com.google.ai.b.pw r0 = r0.f26979t
            if (r0 != 0) goto L_0x01c9
            com.google.ai.b.pw r0 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x01c9:
            java.lang.String r10 = r0.f27899b
        L_0x01cb:
            com.google.android.apps.gsa.shared.util.t.g r0 = r11.f229279c
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.google.android.apps.gsa.sidekick.main.reminders.EXTRA_FROM_NOTIFICATION"
            r1.putExtra(r2, r8)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L_0x01e2
            java.lang.String r2 = "com.google.android.apps.gsa.sidekick.main.reminders.EXTRA_REMINDER_ID"
            r1.putExtra(r2, r10)
        L_0x01e2:
            com.google.android.apps.gsa.shared.az.a r2 = com.google.android.apps.gsa.sidekick.shared.p7243l.C91759e.f255897a
            android.content.Intent r1 = r2.mo83277a(r1)
            r2 = 276856832(0x10808000, float:5.0684313E-29)
            r1.addFlags(r2)
            r0.mo65089a(r1)
            return
        L_0x01f2:
            java.lang.String r0 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ACTION_TO_EXECUTE"
            int r0 = r13.getIntExtra(r0, r9)
            if (r0 != 0) goto L_0x01fc
            goto L_0x0269
        L_0x01fc:
            java.util.List r6 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150939e(r13, r4)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x0209:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0237
            java.lang.Object r4 = r2.next()
            com.google.ai.b.hj r4 = (com.google.p375ai.p378b.C7718hj) r4
            int r5 = r4.f26955a
            r7 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 & r7
            if (r5 == 0) goto L_0x0209
            com.google.ai.b.pw r5 = r4.f26979t
            if (r5 != 0) goto L_0x0223
            com.google.ai.b.pw r5 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x0223:
            java.lang.String r5 = r5.f27899b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0209
            com.google.ai.b.pw r4 = r4.f26979t
            if (r4 != 0) goto L_0x0231
            com.google.ai.b.pw r4 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x0231:
            java.lang.String r4 = r4.f27899b
            r3.add(r4)
            goto L_0x0209
        L_0x0237:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0248
            java.lang.String r2 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ID"
            java.lang.String r2 = r13.getStringExtra(r2)
            if (r2 == 0) goto L_0x0269
            r3.add(r2)
        L_0x0248:
            dagger.a r2 = r11.f229278b
            java.lang.Object r2 = r2.mo27525b()
            if (r2 == 0) goto L_0x0269
            java.lang.String r2 = "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_DELETE_NOTIFICATION_ON_SUCC"
            boolean r5 = r13.getBooleanExtra(r2, r9)
            android.content.BroadcastReceiver$PendingResult r7 = r11.goAsync()
            com.google.android.libraries.gsa.k.g r8 = r11.f229281e
            com.google.android.apps.gsa.reminders.d r9 = new com.google.android.apps.gsa.reminders.d
            r1 = r9
            r2 = r11
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "ExecuteReminderAction"
            r8.mo28212l(r0, r9)
        L_0x0269:
            return
        L_0x026a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x026d:
            com.google.common.f.e r0 = f229276a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "onReceive: received unexpected null or empty Intent"
            r2 = 7130(0x1bda, float:9.991E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.reminders.RemindersBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
