package com.google.android.libraries.assistant.contexttrigger.p1466j;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.contexttrigger.C17742i;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17703ai;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17707am;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.q */
/* compiled from: PG */
public final class C17801q {

    /* renamed from: a */
    private static final C59071e f51091a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.j.q");

    /* renamed from: b */
    private final C21370a f51092b;

    /* renamed from: c */
    private final Context f51093c;

    /* renamed from: d */
    private final Executor f51094d;

    /* renamed from: e */
    private final C17707am f51095e;

    public C17801q(C21370a aVar, Context context, Executor executor, C17707am amVar) {
        this.f51092b = aVar;
        this.f51093c = context;
        this.f51094d = executor;
        this.f51095e = amVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo23465a(C17703ai aiVar, C17742i iVar, List list, List list2, List list3) {
        C58480gp e = C58485gu.m89837e();
        return C47633f.m84733g(aiVar.mo23444a(new C17798n(list, list2, e))).mo51516i(new C17799o(iVar, e), this.f51094d).mo51516i(new C17800p(iVar, list3), this.f51094d);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d0, code lost:
        if (com.google.protobuf.p4750c.C62953e.m95476a(r0, r1) >= 0) goto L_0x00d2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23466b(com.google.android.libraries.assistant.contexttrigger.p1466j.C17806v r11) {
        /*
            r10 = this;
            com.google.android.libraries.f.a r0 = r10.f51092b
            long r0 = r0.mo26870b()
            com.google.protobuf.fg r0 = com.google.protobuf.p4750c.C62953e.m95484i(r0)
            com.google.protobuf.bv r1 = r11.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r1 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r1
            int r2 = r1.f51107a
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 == 0) goto L_0x001c
            com.google.protobuf.fg r1 = r1.f51108b
            if (r1 != 0) goto L_0x001d
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c
            goto L_0x001d
        L_0x001c:
            r1 = r4
        L_0x001d:
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r2 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r2
            int r5 = r2.f51107a
            r6 = 2
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002d
            com.google.protobuf.fg r4 = r2.f51109c
            if (r4 != 0) goto L_0x002d
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x002d:
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r2 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r2
            com.google.protobuf.cq r2 = r2.f51110d
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x003b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r2.next()
            com.google.android.libraries.assistant.contexttrigger.j.u r5 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u) r5
            int r7 = r5.f51102d
            r8 = 3
            if (r7 != r8) goto L_0x0051
            java.lang.Object r7 = r5.f51103e
            com.google.assistant.ag.c.z r7 = (com.google.assistant.p3803ag.p3809c.C49156z) r7
            goto L_0x0053
        L_0x0051:
            com.google.assistant.ag.c.z r7 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x0053:
            com.google.protobuf.fg r7 = r7.f127114b
            if (r7 != 0) goto L_0x0059
            com.google.protobuf.fg r7 = com.google.protobuf.C63042fg.f170152c
        L_0x0059:
            int r9 = r5.f51102d
            if (r9 != r8) goto L_0x0062
            java.lang.Object r8 = r5.f51103e
            com.google.assistant.ag.c.z r8 = (com.google.assistant.p3803ag.p3809c.C49156z) r8
            goto L_0x0064
        L_0x0062:
            com.google.assistant.ag.c.z r8 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x0064:
            com.google.protobuf.fg r8 = r8.f127115c
            if (r8 != 0) goto L_0x006a
            com.google.protobuf.fg r8 = com.google.protobuf.C63042fg.f170152c
        L_0x006a:
            int r9 = r5.f51099a
            r9 = r9 & 16
            if (r9 == 0) goto L_0x009b
            int r5 = r5.f51104f
            int r5 = com.google.android.libraries.assistant.contexttrigger.p1466j.C17803s.m35057a(r5)
            if (r5 != 0) goto L_0x0079
            goto L_0x009b
        L_0x0079:
            if (r5 != r6) goto L_0x009b
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r7, r0)
            if (r5 <= 0) goto L_0x008b
            if (r4 == 0) goto L_0x0089
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r7, r4)
            if (r5 >= 0) goto L_0x008b
        L_0x0089:
            r4 = r7
            goto L_0x003b
        L_0x008b:
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r8, r0)
            if (r5 <= 0) goto L_0x003b
            if (r4 == 0) goto L_0x0099
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r8, r4)
            if (r5 >= 0) goto L_0x003b
        L_0x0099:
            r4 = r8
            goto L_0x003b
        L_0x009b:
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r7, r0)
            if (r5 <= 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00a9
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r7, r1)
            if (r5 >= 0) goto L_0x00ab
        L_0x00a9:
            r1 = r7
            goto L_0x003b
        L_0x00ab:
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r8, r0)
            if (r5 <= 0) goto L_0x003b
            if (r1 == 0) goto L_0x00b9
            int r5 = com.google.protobuf.p4750c.C62953e.m95476a(r8, r1)
            if (r5 >= 0) goto L_0x003b
        L_0x00b9:
            r1 = r8
            goto L_0x003b
        L_0x00bb:
            if (r1 == 0) goto L_0x00e4
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r0 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r0
            int r2 = r0.f51107a
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00d2
            com.google.protobuf.fg r0 = r0.f51108b
            if (r0 != 0) goto L_0x00cc
            com.google.protobuf.fg r0 = com.google.protobuf.C63042fg.f170152c
        L_0x00cc:
            int r0 = com.google.protobuf.p4750c.C62953e.m95476a(r0, r1)
            if (r0 < 0) goto L_0x00e4
        L_0x00d2:
            r0 = 0
            r10.mo23467c(r1, r0)
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r0 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r0
            r0.f51108b = r1
            int r1 = r0.f51107a
            r1 = r1 | r3
            r0.f51107a = r1
        L_0x00e4:
            if (r4 == 0) goto L_0x010c
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r0 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r0
            int r1 = r0.f51107a
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00fb
            com.google.protobuf.fg r0 = r0.f51109c
            if (r0 != 0) goto L_0x00f5
            com.google.protobuf.fg r0 = com.google.protobuf.C63042fg.f170152c
        L_0x00f5:
            int r0 = com.google.protobuf.p4750c.C62953e.m95476a(r0, r4)
            if (r0 < 0) goto L_0x010c
        L_0x00fb:
            r10.mo23467c(r4, r3)
            r11.copyOnWrite()
            com.google.protobuf.bv r11 = r11.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r11 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r11
            r11.f51109c = r4
            int r0 = r11.f51107a
            r0 = r0 | r6
            r11.f51107a = r0
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1466j.C17801q.mo23466b(com.google.android.libraries.assistant.contexttrigger.j.v):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo23467c(C63042fg fgVar, boolean z) {
        C17707am amVar = this.f51095e;
        PendingIntent broadcast = PendingIntent.getBroadcast(amVar.f50905a, 0, C147798a.m240896b(new Intent().setComponent(new ComponentName(amVar.f50905a, "com.google.android.libraries.assistant.contexttrigger.impl.ContextTriggerBroadcastReceiver_Receiver")).setAction(true != z ? "TIME TRIGGER ACTION" : "TIME TRIGGER ALLOW IDLE ACTION"), 201326592, 0), 201326592);
        broadcast.getClass();
        AlarmManager alarmManager = (AlarmManager) this.f51093c.getSystemService("alarm");
        alarmManager.getClass();
        if (z) {
            try {
                alarmManager.setExactAndAllowWhileIdle(1, C62953e.m95478c(fgVar), broadcast);
            } catch (SecurityException e) {
                ((C59052c) ((C59052c) ((C59052c) f51091a.mo56226d()).mo56382g(e)).mo56372aa(47055)).mo56386p("Failed to set exact alarm, fallback to inexact alarm");
                if (z) {
                    alarmManager.setAndAllowWhileIdle(1, C62953e.m95478c(fgVar), broadcast);
                } else {
                    alarmManager.set(1, C62953e.m95478c(fgVar), broadcast);
                }
            }
        } else {
            alarmManager.setExact(1, C62953e.m95478c(fgVar), broadcast);
        }
    }
}
