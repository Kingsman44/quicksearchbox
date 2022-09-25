package com.google.android.apps.gsa.staticplugins.p7930es;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.C90739aw;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.s */
/* compiled from: PG */
public final class C100664s {

    /* renamed from: a */
    public static final C59071e f281482a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.es.s");

    /* renamed from: j */
    private static final Integer f281483j = 39;

    /* renamed from: b */
    public final Context f281484b;

    /* renamed from: c */
    public final C100666u f281485c;

    /* renamed from: d */
    public final C58833ax f281486d;

    /* renamed from: e */
    public final C58833ax f281487e;

    /* renamed from: f */
    public final C86124t f281488f;

    /* renamed from: g */
    public final C68214a f281489g;

    /* renamed from: h */
    final C90739aw f281490h;

    /* renamed from: i */
    C100663r f281491i;

    /* renamed from: k */
    private final C22871g f281492k;

    /* renamed from: l */
    private final C22871g f281493l;

    public C100664s(Context context, C22871g gVar, C22871g gVar2, C100666u uVar, C90739aw awVar, C58833ax axVar, C58833ax axVar2, C86124t tVar, C68214a aVar) {
        this.f281484b = context;
        this.f281492k = gVar;
        this.f281493l = gVar2;
        this.f281485c = uVar;
        this.f281490h = awVar;
        this.f281486d = axVar;
        this.f281487e = axVar2;
        this.f281488f = tVar;
        this.f281489g = aVar;
    }

    /* renamed from: d */
    public static ArrayList m166823d(Context context, int i) {
        Intent intent = new Intent("com.google.android.apps.gsa.staticplugins.xms.SMS_STATUS").setPackage(context.getPackageName());
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(PendingIntent.getBroadcast(context, f281483j.intValue() + i2, intent, true != C1888a.m5149c() ? 1073741824 : 1107296256));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C100663r mo91999a(int i, long j) {
        IntentFilter intentFilter = new IntentFilter("com.google.android.apps.gsa.staticplugins.xms.SMS_STATUS");
        C100670y yVar = new C100670y(this.f281492k, new C100661p(this));
        C100663r rVar = new C100663r(this, i, j, yVar);
        yVar.mo92005a();
        yVar.mo92006b();
        this.f281484b.registerReceiver(rVar, intentFilter);
        return rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo92000b(String str, String str2) {
        return this.f281493l.mo28201a("Sms database update", new C100660o(this, str2, str));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0087=Splitter:B:24:0x0087, B:29:0x009e=Splitter:B:29:0x009e} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.C60870cx mo92001c(int r12, java.lang.String r13, java.util.ArrayList r14, java.lang.Long r15) {
        /*
            r11 = this;
            java.lang.String r0 = "Unknown error: "
            java.lang.String r1 = "UnsupportedOperationException: "
            java.lang.String r2 = "Exception while sending SMS message from SmsManagerShim. "
            monitor-enter(r11)
            long r3 = r15.longValue()     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.es.r r15 = r11.mo91999a(r12, r3)     // Catch:{ all -> 0x0180 }
            r11.f281491i = r15     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.search.core.i.t r15 = r11.f281488f     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248153k     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            boolean r15 = r15.mo79746e(r3)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            if (r15 == 0) goto L_0x009e
            android.content.Context r15 = r11.f281484b     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            java.lang.String r3 = "telephony_subscription_service"
            java.lang.Object r15 = r15.getSystemService(r3)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            android.telephony.SubscriptionManager r15 = (android.telephony.SubscriptionManager) r15     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            if (r15 != 0) goto L_0x0029
            goto L_0x009e
        L_0x0029:
            int r15 = r15.getActiveSubscriptionInfoCountMax()     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            r3 = 1
            if (r15 <= r3) goto L_0x009e
            com.google.common.f.e r15 = f281482a     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.common.f.x r4 = r15.mo56224b()     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            r5 = 33956(0x84a4, float:4.7582E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            java.lang.String r5 = "Phone is multi sim"
            r4.mo56386p(r5)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            int r4 = android.telephony.SmsManager.getDefaultSmsSubscriptionId()     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            r5 = -1
            if (r4 >= 0) goto L_0x004e
            r4 = -1
        L_0x004e:
            if (r4 != r5) goto L_0x0087
            com.google.android.apps.gsa.staticplugins.es.u r4 = r11.f281485c     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            android.content.Context r6 = r11.f281484b     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            r7 = 0
            int r4 = r4.mo92003a(r7, r6)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.android.apps.gsa.staticplugins.es.u r6 = r11.f281485c     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            android.content.Context r7 = r11.f281484b     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            int r3 = r6.mo92003a(r3, r7)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            if (r4 != r5) goto L_0x0064
            r4 = r3
        L_0x0064:
            if (r4 != r5) goto L_0x0087
            com.google.common.f.x r12 = r15.mo56225c()     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            r13 = 33957(0x84a5, float:4.7584E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r13)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            java.lang.String r13 = "No active subscription Ids found in first and second SIM slots."
            r12.mo56386p(r13)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.android.apps.gsa.staticplugins.es.q r12 = new com.google.android.apps.gsa.staticplugins.es.q     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            java.lang.String r13 = "Failed to send SMS on Multi-SIM device. Error: No active subscription Ids found in first and second SIM slots."
            r12.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92899h(r12)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            monitor-exit(r11)     // Catch:{ all -> 0x0180 }
            return r12
        L_0x0087:
            android.content.Context r15 = r11.f281484b     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            java.util.ArrayList r9 = m166823d(r15, r12)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            android.telephony.SmsManager r5 = android.telephony.SmsManager.getSmsManagerForSubscriptionId(r4)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            r7 = 0
            r10 = 0
            r6 = r13
            r8 = r14
            r5.sendMultipartTextMessage(r6, r7, r8, r9, r10)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.android.apps.gsa.staticplugins.es.r r12 = r11.f281491i     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            com.google.common.util.concurrent.SettableFuture r12 = r12.f281477a     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            monitor-exit(r11)     // Catch:{ all -> 0x0180 }
            return r12
        L_0x009e:
            com.google.android.apps.gsa.shared.util.aw r15 = r11.f281490h     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            android.content.Context r3 = r11.f281484b     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            java.util.ArrayList r8 = m166823d(r3, r12)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            android.telephony.SmsManager r4 = r15.f253815a     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            r6 = 0
            r9 = 0
            r5 = r13
            r7 = r14
            r4.sendMultipartTextMessage(r5, r6, r7, r8, r9)     // Catch:{ IllegalArgumentException -> 0x0138, UnsupportedOperationException -> 0x00f5, RuntimeException -> 0x00b1 }
            goto L_0x017a
        L_0x00b1:
            r12 = move-exception
            com.google.common.f.e r13 = f281482a     // Catch:{ all -> 0x0180 }
            com.google.common.f.x r13 = r13.mo56225c()     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0180 }
            r14 = 33955(0x84a3, float:4.7581E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0180 }
            java.lang.String r14 = "Failed to Send SMS. Error: %s"
            java.lang.String r15 = r12.getMessage()     // Catch:{ all -> 0x0180 }
            r13.mo56389s(r14, r15)     // Catch:{ all -> 0x0180 }
            dagger.a r13 = r11.f281489g     // Catch:{ all -> 0x0180 }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.shared.logger.b.i r13 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r13     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.shared.logger.b.ae r14 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_XMSWORKER_SMS_UNKNOWN_ERR     // Catch:{ all -> 0x0180 }
            r13.mo83702b(r14)     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.es.r r13 = r11.f281491i     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.es.q r14 = new com.google.android.apps.gsa.staticplugins.es.q     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r15.<init>(r0)     // Catch:{ all -> 0x0180 }
            r15.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r15.toString()     // Catch:{ all -> 0x0180 }
            r14.<init>(r12)     // Catch:{ all -> 0x0180 }
            r13.mo91997a(r14)     // Catch:{ all -> 0x0180 }
            goto L_0x017a
        L_0x00f5:
            r12 = move-exception
            com.google.common.f.e r13 = f281482a     // Catch:{ all -> 0x0180 }
            com.google.common.f.x r13 = r13.mo56226d()     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0180 }
            r14 = 33954(0x84a2, float:4.758E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0180 }
            java.lang.String r14 = "Failed to Send SMS. Error: %s"
            java.lang.String r15 = r12.getMessage()     // Catch:{ all -> 0x0180 }
            r13.mo56389s(r14, r15)     // Catch:{ all -> 0x0180 }
            dagger.a r13 = r11.f281489g     // Catch:{ all -> 0x0180 }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.shared.logger.b.i r13 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r13     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.shared.logger.b.ae r14 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_XMSWORKER_SMS_UNKNOWN_ERR     // Catch:{ all -> 0x0180 }
            r13.mo83702b(r14)     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.es.r r13 = r11.f281491i     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.es.q r14 = new com.google.android.apps.gsa.staticplugins.es.q     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r15.<init>(r1)     // Catch:{ all -> 0x0180 }
            r15.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r15.toString()     // Catch:{ all -> 0x0180 }
            r14.<init>(r12)     // Catch:{ all -> 0x0180 }
            r13.mo91997a(r14)     // Catch:{ all -> 0x0180 }
            goto L_0x017a
        L_0x0138:
            r12 = move-exception
            com.google.common.f.e r13 = f281482a     // Catch:{ all -> 0x0180 }
            com.google.common.f.x r13 = r13.mo56225c()     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0180 }
            r14 = 33953(0x84a1, float:4.7578E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r14)     // Catch:{ all -> 0x0180 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0180 }
            java.lang.String r14 = "Failed to Send SMS. Error: %s"
            java.lang.String r15 = r12.getMessage()     // Catch:{ all -> 0x0180 }
            r13.mo56389s(r14, r15)     // Catch:{ all -> 0x0180 }
            dagger.a r13 = r11.f281489g     // Catch:{ all -> 0x0180 }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.shared.logger.b.i r13 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r13     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.shared.logger.b.ae r14 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_XMSWORKER_SMS_ILLEGAL_EXCEPTION     // Catch:{ all -> 0x0180 }
            r13.mo83702b(r14)     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.es.r r13 = r11.f281491i     // Catch:{ all -> 0x0180 }
            com.google.android.apps.gsa.staticplugins.es.q r14 = new com.google.android.apps.gsa.staticplugins.es.q     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r15.<init>(r2)     // Catch:{ all -> 0x0180 }
            r15.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r15.toString()     // Catch:{ all -> 0x0180 }
            r14.<init>(r12)     // Catch:{ all -> 0x0180 }
            r13.mo91997a(r14)     // Catch:{ all -> 0x0180 }
        L_0x017a:
            com.google.android.apps.gsa.staticplugins.es.r r12 = r11.f281491i     // Catch:{ all -> 0x0180 }
            com.google.common.util.concurrent.SettableFuture r12 = r12.f281477a     // Catch:{ all -> 0x0180 }
            monitor-exit(r11)     // Catch:{ all -> 0x0180 }
            return r12
        L_0x0180:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0180 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7930es.C100664s.mo92001c(int, java.lang.String, java.util.ArrayList, java.lang.Long):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final void mo92002e(long j, int i) {
        this.f281493l.mo28212l("Sms database update", new C100659n(this, j, i));
    }
}
