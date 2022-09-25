package com.google.android.libraries.assistant.auto.tng.morris.service;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14173n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public final class MorrisService extends C15455a implements C47231d {

    /* renamed from: a */
    private C15458d f46351a;

    /* renamed from: b */
    private boolean f46352b;

    /* renamed from: c */
    private final C47550bb f46353c = new C47550bb(this);

    /* renamed from: d */
    private boolean f46354d;

    @Deprecated
    public MorrisService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C15458d mo17754z() {
        C15458d dVar = this.f46351a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f46354d) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f46353c.mo51409a(intent);
        try {
            C15458d b = mo17754z();
            C59104x b2 = C15458d.f46359a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.Service");
            ((C59052c) ((C59052c) b2).mo56372aa(45908)).mo56389s("#onBind: %s", intent);
            C15457c cVar = new C15457c(b);
            a.close();
            return cVar;
        } catch (Throwable th) {
            C15456b.m32195a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f46353c.mo51410b();
        try {
            this.f46352b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f46351a == null) {
                if (!this.f46352b) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f46354d) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo22348a().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo22348a().mo17653jN();
                    aqy aqy = ((amb) jN).f197807b;
                    this.f46351a = new C15458d(((amb) jN).f197754a, (Context) ((amb) jN).f197807b.g.mo17428b(), (C86124t) ((amb) jN).f197807b.a.f202006C.mo17428b(), (C14113an) ((amb) jN).f197807b.a.f202694bs.mo17428b(), (C14115ap) ((amb) jN).f197807b.a.f202695bt.mo17428b(), (C14647d) ((amb) jN).f197807b.a.f202840ef.mo17428b(), aqy.a.f202841eg, new C14173n((Context) aqy.g.mo17428b(), (NotificationManager) ((amb) jN).f197807b.ah.mo17428b()));
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            C15458d b2 = mo17754z();
            C59104x b3 = C15458d.f46359a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "Morris.Service");
            ((C59052c) ((C59052c) b3).mo56372aa(45909)).mo56386p("#onCreate()");
            if (!b2.f46362d.mo79746e(C90051dc.f248829ak)) {
                b2.f46361c.stopSelf();
            }
            this.f46352b = false;
            b.close();
            return;
            throw th;
            throw th;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                C15456b.m32195a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f46353c.mo51412d();
        try {
            super.onDestroy();
            this.f46354d = true;
            d.close();
            return;
        } catch (Throwable th) {
            C15456b.m32195a(th, th);
        }
        throw th;
    }

    public final boolean onUnbind(Intent intent) {
        C47573bx f = this.f46353c.mo51414f();
        try {
            super.onUnbind(intent);
            C15458d b = mo17754z();
            C59104x b2 = C15458d.f46359a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.Service");
            ((C59052c) ((C59052c) b2).mo56372aa(45913)).mo56389s("#onUnBind: %s", intent);
            b.f46368j.hide();
            b.f46368j.dismiss();
            b.f46369k.dismiss();
            b.f46371m = C14499lm.f43848e;
            f.close();
            return false;
        } catch (Throwable th) {
            C15456b.m32195a(th, th);
        }
        throw th;
    }
}
