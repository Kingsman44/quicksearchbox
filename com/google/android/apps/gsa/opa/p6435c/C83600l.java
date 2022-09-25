package com.google.android.apps.gsa.opa.p6435c;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.libraries.gsa.conversation.clientop.communication.p1843a.C22411a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.opa.c.l */
/* compiled from: PG */
final class C83600l {

    /* renamed from: a */
    public final PhoneStateListener f227906a;

    /* renamed from: b */
    public String f227907b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public final TelephonyManager f227908c;

    /* renamed from: d */
    public final Object f227909d = new Object();

    /* renamed from: e */
    public C60870cx f227910e;

    /* renamed from: f */
    public C60870cx f227911f;

    /* renamed from: g */
    public C22411a f227912g;

    /* renamed from: h */
    public long f227913h;

    /* renamed from: i */
    public long f227914i;

    /* renamed from: j */
    final /* synthetic */ C83601m f227915j;

    public C83600l(C83601m mVar) {
        this.f227915j = mVar;
        this.f227908c = (TelephonyManager) mVar.f227917b.getSystemService("phone");
        this.f227912g = new C83595g();
        this.f227906a = new C83596h(this);
        this.f227910e = null;
        this.f227911f = null;
    }

    /* renamed from: a */
    public final C60870cx mo76954a(String str, long j) {
        C83601m mVar = this.f227915j;
        return mVar.f227918c.mo28203c("#getDurationFromCallLog", ((C86124t) mVar.f227919d.mo27525b()).mo79743a(C90066dr.f249663F), new C83592d(this, str, j));
    }

    /* renamed from: b */
    public final void mo76955b() {
        PhoneStateListener phoneStateListener;
        synchronized (this.f227909d) {
            TelephonyManager telephonyManager = this.f227908c;
            if (!(telephonyManager == null || (phoneStateListener = this.f227906a) == null)) {
                telephonyManager.listen(phoneStateListener, 0);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo76956c() {
        boolean z;
        synchronized (this.f227909d) {
            z = this.f227913h > -1;
        }
        return z;
    }
}
