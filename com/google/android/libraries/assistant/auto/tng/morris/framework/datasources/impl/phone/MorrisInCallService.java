package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.telecom.Call;
import android.telecom.CallAudioState;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.gms.car.CarCall;
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
import dagger.p5294a.C68225k;
import java.util.ArrayList;

/* compiled from: PG */
public final class MorrisInCallService extends C14914m implements C47231d {

    /* renamed from: a */
    private C14896ai f44784a;

    /* renamed from: b */
    private boolean f44785b;

    /* renamed from: c */
    private final C47550bb f44786c = new C47550bb(this);

    @Deprecated
    public MorrisInCallService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C14896ai mo17754z() {
        C14896ai aiVar = this.f44784a;
        if (aiVar != null) {
            return aiVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        C47573bx a = this.f44786c.mo51409a(intent);
        try {
            C14896ai b = mo17754z();
            String action = intent.getAction();
            if (action == null || !action.equals("Local_AGSA_intent")) {
                iBinder = super.onBind(intent);
            } else {
                iBinder = b.f44804c;
            }
            a.close();
            return iBinder;
        } catch (Throwable th) {
            C14920s.m31426a(th, th);
        }
        throw th;
    }

    public final void onCallAdded(Call call) {
        C47573bx c = this.f44786c.mo51411c("onCallAdded");
        try {
            super.onCallAdded(call);
            C14896ai b = mo17754z();
            C59104x b2 = C14896ai.f44802a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.InCallService");
            ((C59052c) ((C59052c) b2).mo56372aa(45748)).mo56389s("Call Added! %s", call);
            call.registerCallback(b.f44807f);
            CarCall c2 = b.f44806e.mo21837c(call);
            if (c2 != null) {
                b.mo21804a(new C14923v(c2));
            }
            c.close();
            return;
        } catch (Throwable th) {
            C14920s.m31426a(th, th);
        }
        throw th;
    }

    public final void onCallAudioStateChanged(CallAudioState callAudioState) {
        C47573bx c = this.f44786c.mo51411c("onCallAudioStateChanged");
        try {
            super.onCallAudioStateChanged(callAudioState);
            C14896ai b = mo17754z();
            C59104x b2 = C14896ai.f44802a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.InCallService");
            ((C59052c) ((C59052c) b2).mo56372aa(45749)).mo56386p("onCallAudioStateChanged!");
            b.mo21804a(new C14922u(callAudioState));
            c.close();
            return;
        } catch (Throwable th) {
            C14920s.m31426a(th, th);
        }
        throw th;
    }

    public final void onCallRemoved(Call call) {
        C47573bx c = this.f44786c.mo51411c("onCallRemoved");
        try {
            super.onCallRemoved(call);
            C14896ai b = mo17754z();
            C59104x b2 = C14896ai.f44802a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.InCallService");
            ((C59052c) ((C59052c) b2).mo56372aa(45750)).mo56386p("Call Removed!");
            call.unregisterCallback(b.f44807f);
            CarCall c2 = b.f44806e.mo21837c(call);
            if (c2 != null) {
                b.mo21804a(new C14921t(c2));
            }
            C14908g gVar = b.f44806e;
            if (((CarCall) gVar.f44832c.get(call)) != null) {
                gVar.f44832c.remove(call);
            } else {
                C59104x d = C14908g.f44830a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.CarCallMapper");
                ((C59052c) ((C59052c) d).mo56372aa(45671)).mo56386p("#removeCall(): Unable to remove call");
            }
            c.close();
            return;
        } catch (Throwable th) {
            C14920s.m31426a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f44786c.mo51410b();
        try {
            this.f44785b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f44784a == null) {
                if (this.f44785b) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo21840a().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo21840a().mo17653jN();
                    Service service = ((amb) jN).f197754a;
                    if (service instanceof MorrisInCallService) {
                        MorrisInCallService morrisInCallService = (MorrisInCallService) service;
                        C68225k.m98532d(morrisInCallService);
                        this.f44784a = new C14896ai(morrisInCallService, (C14908g) ((amb) jN).f197807b.d.f201726eZ.mo17428b());
                        a2.close();
                        this.f44784a.f44808g = this;
                    } else {
                        String obj = C14896ai.class.toString();
                        String valueOf = String.valueOf(service.getClass());
                        throw new IllegalStateException("Attempt to inject a Service wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
            }
            super.onCreate();
            this.f44785b = false;
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
                C14920s.m31426a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f44786c.mo51412d();
        try {
            super.onDestroy();
            d.close();
            return;
        } catch (Throwable th) {
            C14920s.m31426a(th, th);
        }
        throw th;
    }

    public final boolean onUnbind(Intent intent) {
        C47573bx f = this.f44786c.mo51414f();
        try {
            C14896ai b = mo17754z();
            boolean onUnbind = super.onUnbind(intent);
            C14908g gVar = b.f44806e;
            ArrayList<CarCall> arrayList = new ArrayList<>(gVar.f44832c.values());
            gVar.f44832c.clear();
            for (CarCall wVar : arrayList) {
                b.mo21804a(new C14924w(wVar));
            }
            f.close();
            return onUnbind;
        } catch (Throwable th) {
            C14920s.m31426a(th, th);
        }
        throw th;
    }
}
