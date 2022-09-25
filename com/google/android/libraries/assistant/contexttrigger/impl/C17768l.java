package com.google.android.libraries.assistant.contexttrigger.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.assistant.contexttrigger.C17693f;
import com.google.android.libraries.assistant.contexttrigger.C17742i;
import com.google.android.libraries.assistant.contexttrigger.p1454a.C17614j;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17797m;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.l */
/* compiled from: PG */
public final class C17768l implements C47102r {

    /* renamed from: a */
    public static final C59071e f51012a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.impl.l");

    /* renamed from: b */
    public final C46128f f51013b;

    /* renamed from: c */
    public final Executor f51014c;

    /* renamed from: d */
    public final Context f51015d;

    /* renamed from: e */
    private final C46175b f51016e;

    /* renamed from: f */
    private final C17797m f51017f;

    /* renamed from: g */
    private final Set f51018g;

    /* renamed from: h */
    private final C17658d f51019h;

    /* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.l$a */
    /* compiled from: PG */
    public interface C17769a {
        /* renamed from: es */
        C17742i mo23459es();

        /* renamed from: ev */
        C17614j mo23460ev();
    }

    public C17768l(Executor executor, C46175b bVar, Context context, C46128f fVar, C17797m mVar, Set set, C17658d dVar) {
        this.f51014c = executor;
        this.f51016e = bVar;
        this.f51015d = context;
        this.f51013b = fVar;
        this.f51017f = mVar;
        this.f51018g = set;
        this.f51019h = dVar;
    }

    /* renamed from: a */
    private final C60870cx m35031a(String str) {
        return C47633f.m84733g(this.f51016e.mo50247d()).mo51516i(new C17766j(this, str), this.f51014c).mo51515h(C17767k.f51011a, this.f51014c);
    }

    /* renamed from: c */
    private final C60870cx m35032c(Intent intent) {
        C58833ax a = C17749a.m35013a(intent);
        if (!a.mo56113h()) {
            C59104x c = f51012a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CtfBroadcastReceiver");
            ((C59052c) ((C59052c) c).mo56372aa(46992)).mo56386p("Received invalid Intent from Awareness API.");
            return C60866ct.f164955a;
        }
        C48917s sVar = ((C17693f) a.mo56107c()).f50869c;
        if (sVar == null) {
            sVar = C48917s.f126578f;
        }
        C48919u uVar = sVar.f126581b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        return C47633f.m84733g(m35031a(uVar.f126590c)).mo51516i(new C17762f(this, intent), this.f51014c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20087b(android.content.Intent r8, int r9) {
        /*
            r7 = this;
            com.google.common.f.e r9 = f51012a
            com.google.common.f.x r0 = r9.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "CtfBroadcastReceiver"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "#onReceive: %s"
            r3 = 46995(0xb793, float:6.5854E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r8)
            java.lang.String r0 = r8.getAction()
            if (r0 != 0) goto L_0x0020
            com.google.common.util.concurrent.cx r8 = r7.m35032c(r8)
            return r8
        L_0x0020:
            int r1 = r0.hashCode()
            r3 = 0
            java.lang.String r4 = "TIME TRIGGER ALLOW IDLE ACTION"
            java.lang.String r5 = "TIME TRIGGER ACTION"
            r6 = 1
            switch(r1) {
                case -525998223: goto L_0x0068;
                case 320622374: goto L_0x005e;
                case 344915962: goto L_0x0054;
                case 344915963: goto L_0x004a;
                case 798292259: goto L_0x0040;
                case 1054721130: goto L_0x0036;
                case 1355240816: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0070
        L_0x002e:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0070
            r0 = 2
            goto L_0x0071
        L_0x0036:
            java.lang.String r1 = "MEDIA_CHANGE_ACTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            r0 = 6
            goto L_0x0071
        L_0x0040:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            r0 = 0
            goto L_0x0071
        L_0x004a:
            java.lang.String r1 = "AWARENESS ACTION V2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            r0 = 4
            goto L_0x0071
        L_0x0054:
            java.lang.String r1 = "AWARENESS ACTION V1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            r0 = 3
            goto L_0x0071
        L_0x005e:
            java.lang.String r1 = "GEOFENCE_CHANGE_ACTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            r0 = 5
            goto L_0x0071
        L_0x0068:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = -1
        L_0x0071:
            switch(r0) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00df;
                case 2: goto L_0x00df;
                case 3: goto L_0x00da;
                case 4: goto L_0x0094;
                case 5: goto L_0x008e;
                case 6: goto L_0x0088;
                default: goto L_0x0074;
            }
        L_0x0074:
            com.google.common.f.x r8 = r9.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r2)
            java.lang.String r9 = "Unknown action"
            r0 = 46996(0xb794, float:6.5855E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56386p(r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a
            return r8
        L_0x0088:
            r8.toURI()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a
            return r8
        L_0x008e:
            r8.toURI()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a
            return r8
        L_0x0094:
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.contexttrigger.impl.C17749a.m35013a(r8)
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x00b2
            com.google.common.f.x r8 = r9.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r2)
            java.lang.String r9 = "Received invalid Intent from Awareness API."
            r0 = 46997(0xb795, float:6.5857E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56386p(r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a
            return r8
        L_0x00b2:
            java.lang.Object r9 = r0.mo56107c()
            com.google.android.libraries.assistant.contexttrigger.f r9 = (com.google.android.libraries.assistant.contexttrigger.C17693f) r9
            com.google.assistant.ag.b.a.s r9 = r9.f50869c
            if (r9 != 0) goto L_0x00be
            com.google.assistant.ag.b.a.s r9 = com.google.assistant.p3803ag.p3807b.p3808a.C48917s.f126578f
        L_0x00be:
            com.google.assistant.ag.b.a.u r9 = r9.f126581b
            if (r9 != 0) goto L_0x00c4
            com.google.assistant.ag.b.a.u r9 = com.google.assistant.p3803ag.p3807b.p3808a.C48919u.f126586g
        L_0x00c4:
            java.lang.String r9 = r9.f126590c
            com.google.common.util.concurrent.cx r9 = r7.m35031a(r9)
            com.google.apps.tiktok.tracing.contrib.b.f r9 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r9)
            com.google.android.libraries.assistant.contexttrigger.impl.h r0 = new com.google.android.libraries.assistant.contexttrigger.impl.h
            r0.<init>(r7, r8)
            java.util.concurrent.Executor r8 = r7.f51014c
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r9.mo51516i(r0, r8)
            return r8
        L_0x00da:
            com.google.common.util.concurrent.cx r8 = r7.m35032c(r8)
            return r8
        L_0x00df:
            com.google.android.libraries.assistant.contexttrigger.j.m r9 = r7.f51017f
            java.lang.String r8 = r8.getAction()
            r8.getClass()
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L_0x00f4
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x00f5
        L_0x00f4:
            r3 = 1
        L_0x00f5:
            com.google.common.base.C58838bb.m90868c(r3)
            com.google.common.util.concurrent.cx r8 = r9.mo23464b()
            return r8
        L_0x00fd:
            com.google.android.libraries.assistant.contexttrigger.d r8 = r7.f51019h
            boolean r8 = r8.f50789b
            if (r8 == 0) goto L_0x0136
            com.google.common.b.gp r8 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Set r9 = r7.f51018g
            java.util.Iterator r9 = r9.iterator()
        L_0x010d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r9.next()
            com.google.android.libraries.assistant.contexttrigger.a r0 = (com.google.android.libraries.assistant.contexttrigger.C17603a) r0
            com.google.common.util.concurrent.cx r0 = r0.mo23406a()
            r8.mo55395g(r0)
            goto L_0x010d
        L_0x0121:
            com.google.common.b.gu r8 = r8.mo55394f()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92896e(r8)
            com.google.apps.tiktok.tracing.contrib.b.f r8 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r8)
            com.google.android.libraries.assistant.contexttrigger.impl.g r9 = com.google.android.libraries.assistant.contexttrigger.impl.C17763g.f51004a
            java.util.concurrent.Executor r0 = r7.f51014c
            com.google.apps.tiktok.tracing.contrib.b.f r8 = r8.mo51515h(r9, r0)
            return r8
        L_0x0136:
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60866ct.f164955a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.impl.C17768l.mo20087b(android.content.Intent, int):com.google.common.util.concurrent.cx");
    }
}
