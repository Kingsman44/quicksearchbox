package com.google.android.apps.search.assistant.surfaces.dictation.service.endpoint;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.C2382m;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125909d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126346w;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;

/* compiled from: PG */
public final class AssistantDictationService extends C125430f implements C47231d {

    /* renamed from: b */
    private C125426b f345897b;

    /* renamed from: c */
    private boolean f345898c;

    /* renamed from: d */
    private final C47550bb f345899d = new C47550bb(this);

    /* renamed from: e */
    private boolean f345900e;

    @Deprecated
    public AssistantDictationService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C125426b mo17754z() {
        C125426b bVar = this.f345897b;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f345900e) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        C47573bx a = this.f345899d.mo51409a(intent);
        try {
            this.f6618a.mo5765a(C2382m.ON_START);
            C125426b a2 = mo17754z();
            if (!a2.f345910c) {
                ((C59052c) ((C59052c) C125426b.f345908a.mo56224b()).mo56372aa(36551)).mo56386p("Rejecting binding: dictation is disabled. [SD]");
                iBinder = null;
            } else {
                iBinder = a2.f345909b.mo58121a();
            }
            a.close();
            return iBinder;
        } catch (Throwable th) {
            C125423a.m205388a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f345899d.mo51410b();
        try {
            this.f345898c = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f345897b == null) {
                if (!this.f345898c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f345900e) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo106970b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo106970b().mo17653jN();
                    aso aso = ((amb) jN).f197807b.d;
                    this.f345897b = new C125426b(((amb) jN).mo65957u(), (C126346w) ((amb) jN).f197742O.mo17428b(), new C125909d(aso.mo67845eM()).mo107162a((Context) aso.f201488a.g.mo17428b()));
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f345898c = false;
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
                C125423a.m205388a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f345899d.mo51412d();
        try {
            super.onDestroy();
            this.f345900e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C125423a.m205388a(th, th);
        }
        throw th;
    }
}
