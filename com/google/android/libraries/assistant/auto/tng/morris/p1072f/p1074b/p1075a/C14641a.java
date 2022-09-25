package com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.p1075a;

import android.app.KeyguardManager;
import android.content.Context;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.PowerManager;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14640a;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14642b;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14643c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.f.b.a.a */
/* compiled from: PG */
public final class C14641a implements C14643c {

    /* renamed from: a */
    private static final C59071e f44242a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.f.b.a.a");

    /* renamed from: b */
    private static final Instant f44243b = Instant.ofEpochMilli(Duration.ofMinutes(30).toMillis());

    /* renamed from: c */
    private static final Uri f44244c = new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.GsaPublicContentProvider").appendPath("morris_provider").appendPath("com.google.android.googlequicksearchbox.MorrisProvider").build();

    /* renamed from: d */
    private static final Uri f44245d = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();

    /* renamed from: e */
    private final Context f44246e;

    /* renamed from: f */
    private final C60950i f44247f;

    /* renamed from: g */
    private final PowerManager f44248g;

    /* renamed from: h */
    private final KeyguardManager f44249h;

    /* renamed from: i */
    private final DisplayManager f44250i;

    /* renamed from: j */
    private C14642b f44251j = C14642b.UNKNOWN;

    public C14641a(Context context, C60950i iVar) {
        this.f44246e = context;
        this.f44247f = iVar;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        this.f44248g = powerManager;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        keyguardManager.getClass();
        this.f44249h = keyguardManager;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.getClass();
        this.f44250i = displayManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r2 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r2 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r0 = 0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14640a m30667f(p3186j$.util.Optional r12) {
        /*
            r11 = this;
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_eligible"
            boolean r0 = r11.m30668g(r0)
            java.lang.String r1 = "Morris.DriveModeArbiterImpl"
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_set_car_mode"
            boolean r0 = r11.m30668g(r0)
            if (r0 != 0) goto L_0x0118
            com.google.android.libraries.assistant.auto.tng.morris.f.b.b r0 = r11.f44251j
            com.google.android.libraries.assistant.auto.tng.morris.f.b.b r2 = com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14642b.DRIVING
            if (r0 == r2) goto L_0x0118
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_bluetooth_connected_setting"
            r2 = 0
            r3 = 0
            android.content.Context r4 = r11.f44246e     // Catch:{ RuntimeException -> 0x0066 }
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch:{ RuntimeException -> 0x0066 }
            android.net.Uri r6 = f44244c     // Catch:{ RuntimeException -> 0x0066 }
            r4 = 1
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x0066 }
            r9[r3] = r0     // Catch:{ RuntimeException -> 0x0066 }
            r7 = 0
            r8 = 0
            r10 = 0
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ RuntimeException -> 0x0066 }
            if (r2 == 0) goto L_0x0045
            int r4 = r2.getCount()     // Catch:{ RuntimeException -> 0x0066 }
            if (r4 == 0) goto L_0x0045
            r2.moveToFirst()     // Catch:{ RuntimeException -> 0x0066 }
            int r0 = r2.getInt(r3)     // Catch:{ RuntimeException -> 0x0066 }
            r2.close()
            goto L_0x008e
        L_0x0045:
            com.google.common.f.e r4 = f44242a     // Catch:{ RuntimeException -> 0x0066 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ RuntimeException -> 0x0066 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0066 }
            r4.mo56378ag(r5, r1)     // Catch:{ RuntimeException -> 0x0066 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ RuntimeException -> 0x0066 }
            r5 = 45917(0xb35d, float:6.4343E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ RuntimeException -> 0x0066 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ RuntimeException -> 0x0066 }
            java.lang.String r5 = "Error querying Morris boolean: %s:"
            r4.mo56389s(r5, r0)     // Catch:{ RuntimeException -> 0x0066 }
            if (r2 == 0) goto L_0x008d
            goto L_0x008a
        L_0x0063:
            r12 = move-exception
            goto L_0x0112
        L_0x0066:
            r0 = move-exception
            com.google.common.f.e r4 = f44242a     // Catch:{ all -> 0x0063 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0063 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0063 }
            r4.mo56378ag(r5, r1)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0063 }
            com.google.common.f.x r0 = r4.mo56382g(r0)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0063 }
            r4 = 45918(0xb35e, float:6.4345E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ all -> 0x0063 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = "Exception while query"
            r0.mo56386p(r4)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x008d
        L_0x008a:
            r2.close()
        L_0x008d:
            r0 = 0
        L_0x008e:
            com.google.assistant.e.l.a.bn r0 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.m86698a(r0)
            com.google.assistant.e.l.a.bn r2 = com.google.assistant.p3897e.p3929l.p3930a.C52708bn.BT_TRIGGER_USER_ENABLED_ASK
            if (r0 == r2) goto L_0x0098
            goto L_0x0118
        L_0x0098:
            android.content.Context r0 = r11.f44246e
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r2 = "smartspace"
            int r0 = android.provider.Settings.Secure.getInt(r0, r2, r3)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_shown"
            boolean r0 = r11.m30668g(r0)
            if (r0 == 0) goto L_0x00b1
            com.google.android.libraries.assistant.auto.tng.morris.f.b.a r12 = com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14640a.SMARTSPACE
            goto L_0x00fe
        L_0x00b1:
            boolean r0 = r12.isPresent()
            if (r0 == 0) goto L_0x00d4
            com.google.common.v.i r0 = r11.f44247f
            j$.time.Instant r0 = r0.mo57444a()
            java.lang.Object r12 = r12.get()
            java.lang.Long r12 = (java.lang.Long) r12
            long r4 = r12.longValue()
            j$.time.Instant r12 = r0.minusMillis(r4)
            j$.time.Instant r0 = f44243b
            boolean r12 = r12.isBefore(r0)
            if (r12 == 0) goto L_0x00d4
            goto L_0x00fc
        L_0x00d4:
            android.os.PowerManager r12 = r11.f44248g
            boolean r12 = r12.isScreenOn()
            if (r12 == 0) goto L_0x00fc
            android.app.KeyguardManager r12 = r11.f44249h
            boolean r12 = r12.isKeyguardLocked()
            if (r12 != 0) goto L_0x00fc
            android.app.KeyguardManager r12 = r11.f44249h
            boolean r12 = r12.isDeviceLocked()
            if (r12 != 0) goto L_0x00fc
            android.hardware.display.DisplayManager r12 = r11.f44250i
            android.view.Display r12 = r12.getDisplay(r3)
            int r12 = r12.getState()
            r0 = 2
            if (r12 != r0) goto L_0x00fc
            com.google.android.libraries.assistant.auto.tng.morris.f.b.a r12 = com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14640a.MORRIS
            goto L_0x00fe
        L_0x00fc:
            com.google.android.libraries.assistant.auto.tng.morris.f.b.a r12 = com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14640a.NONE
        L_0x00fe:
            com.google.common.f.e r0 = f44242a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r1)
            java.lang.String r1 = "#getDriveModeNotificationAssignee(): Final assignee %s"
            r2 = 45923(0xb363, float:6.4352E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r12)
            return r12
        L_0x0112:
            if (r2 == 0) goto L_0x0117
            r2.close()
        L_0x0117:
            throw r12
        L_0x0118:
            com.google.common.f.e r12 = f44242a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r1)
            java.lang.String r0 = "#getDriveModeNotificationAssignee(): Not eligible, or bluetooth shoudldn't trigger notification"
            r1 = 45922(0xb362, float:6.435E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.android.libraries.assistant.auto.tng.morris.f.b.a r12 = com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14640a.NONE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.p1075a.C14641a.m30667f(j$.util.Optional):com.google.android.libraries.assistant.auto.tng.morris.f.b.a");
    }

    /* renamed from: g */
    private final boolean m30668g(String str) {
        C58976aa aaVar = C58975e.f156826a;
        Cursor cursor = null;
        try {
            cursor = this.f44246e.getContentResolver().query(f44244c, (String[]) null, (String) null, new String[]{str}, (String) null);
            if (cursor == null || cursor.getCount() == 0) {
                C59104x d = f44242a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.DriveModeArbiterImpl");
                ((C59052c) ((C59052c) d).mo56372aa(45925)).mo56389s("Error querying Morris boolean: %s:", str);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
            cursor.moveToFirst();
            boolean equals = "1".equals(cursor.getString(0));
            cursor.close();
            return equals;
        } catch (RuntimeException e) {
            C59104x c = f44242a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.DriveModeArbiterImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45926)).mo56386p("Exception while query");
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final C14640a mo21583a() {
        return m30667f(Optional.empty());
    }

    /* renamed from: b */
    public final C14640a mo21584b(Long l) {
        return m30667f(Optional.m71637of(l));
    }

    /* renamed from: c */
    public final C14642b mo21585c() {
        return this.f44251j;
    }

    /* renamed from: d */
    public final void mo21586d(C14642b bVar) {
        this.f44251j = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r2 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (r2 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        r2.close();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21587e() {
        /*
            r11 = this;
            java.lang.String r0 = "Morris.DriveModeArbiterImpl"
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "CarConnectionState"
            r2 = 0
            r3 = 0
            android.content.Context r4 = r11.f44246e     // Catch:{ RuntimeException -> 0x0052 }
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch:{ RuntimeException -> 0x0052 }
            android.net.Uri r6 = f44245d     // Catch:{ RuntimeException -> 0x0052 }
            r4 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x0052 }
            r7[r3] = r1     // Catch:{ RuntimeException -> 0x0052 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r2 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ RuntimeException -> 0x0052 }
            if (r2 == 0) goto L_0x0032
            int r5 = r2.getCount()     // Catch:{ RuntimeException -> 0x0052 }
            if (r5 == 0) goto L_0x0032
            r2.moveToFirst()     // Catch:{ RuntimeException -> 0x0052 }
            int r0 = r2.getInt(r3)     // Catch:{ RuntimeException -> 0x0052 }
            r2.close()
            r1 = 2
            if (r0 != r1) goto L_0x0079
            return r4
        L_0x0032:
            com.google.common.f.e r4 = f44242a     // Catch:{ RuntimeException -> 0x0052 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ RuntimeException -> 0x0052 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0052 }
            r4.mo56378ag(r5, r0)     // Catch:{ RuntimeException -> 0x0052 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ RuntimeException -> 0x0052 }
            r5 = 45920(0xb360, float:6.4348E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ RuntimeException -> 0x0052 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ RuntimeException -> 0x0052 }
            java.lang.String r5 = "Error querying Projected int: %s:"
            r4.mo56389s(r5, r1)     // Catch:{ RuntimeException -> 0x0052 }
            if (r2 == 0) goto L_0x0079
            goto L_0x0076
        L_0x0050:
            r0 = move-exception
            goto L_0x007a
        L_0x0052:
            r1 = move-exception
            com.google.common.f.e r4 = f44242a     // Catch:{ all -> 0x0050 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0050 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0050 }
            r4.mo56378ag(r5, r0)     // Catch:{ all -> 0x0050 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0050 }
            com.google.common.f.x r0 = r4.mo56382g(r1)     // Catch:{ all -> 0x0050 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0050 }
            r1 = 45921(0xb361, float:6.4349E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0050 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "Exception while query"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0079
        L_0x0076:
            r2.close()
        L_0x0079:
            return r3
        L_0x007a:
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.p1075a.C14641a.mo21587e():boolean");
    }
}
