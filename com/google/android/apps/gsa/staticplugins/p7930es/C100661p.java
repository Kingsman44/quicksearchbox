package com.google.android.apps.gsa.staticplugins.p7930es;

import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.p */
/* compiled from: PG */
final class C100661p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C100664s f281476a;

    public C100661p(C100664s sVar) {
        this.f281476a = sVar;
    }

    public final void run() {
        ((C59052c) ((C59052c) C100664s.f281482a.mo56225c()).mo56372aa(33948)).mo56386p("Sending SMS timed out while sending.");
        synchronized (this.f281476a) {
            C100663r rVar = this.f281476a.f281491i;
            if (rVar != null) {
                rVar.mo91997a(new TimeoutException("TimeoutException: Send Sms timed out."));
            }
        }
    }
}
