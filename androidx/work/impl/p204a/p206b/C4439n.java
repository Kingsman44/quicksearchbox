package androidx.work.impl.p204a.p206b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C4380ad;
import androidx.work.impl.utils.p210b.C4595b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.a.b.n */
/* compiled from: PG */
public final class C4439n extends C4431f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4439n(Context context, C4595b bVar) {
        super(context, bVar);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: a */
    public final IntentFilter mo9376a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x0039;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo9377b() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f14115a
            r1 = 0
            android.content.IntentFilter r2 = r5.mo9376a()
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r1 = 1
            if (r0 == 0) goto L_0x003a
            java.lang.String r2 = r0.getAction()
            if (r2 != 0) goto L_0x0015
            goto L_0x003a
        L_0x0015:
            java.lang.String r0 = r0.getAction()
            r2 = 0
            if (r0 == 0) goto L_0x0039
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L_0x0034
            r4 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r3 == r4) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0034:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.equals(r1)
        L_0x0039:
            r1 = 0
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p204a.p206b.C4439n.mo9377b():java.lang.Object");
    }

    /* renamed from: c */
    public final void mo9378c(Intent intent) {
        C69664n.m101061g(intent, "intent");
        if (intent.getAction() != null) {
            C4380ad.m12560h().mo9309a(C4440o.f14125a, "Received ".concat(String.valueOf(intent.getAction())));
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        mo9384g(true);
                    }
                } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    mo9384g(false);
                }
            }
        }
    }
}
