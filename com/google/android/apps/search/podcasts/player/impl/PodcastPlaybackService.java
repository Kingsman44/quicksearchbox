package com.google.android.apps.search.podcasts.player.impl;

import android.app.Service;
import android.content.Intent;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47540az;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47552bd;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import dagger.p5294a.C68225k;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class PodcastPlaybackService extends C140792a implements C47231d {

    /* renamed from: b */
    private C140820ba f382294b;

    /* renamed from: c */
    private boolean f382295c;

    /* renamed from: d */
    private final C47550bb f382296d = new C47550bb(this);

    /* renamed from: e */
    private boolean f382297e;

    @Deprecated
    public PodcastPlaybackService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C140820ba mo17754z() {
        C140820ba baVar = this.f382294b;
        if (baVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f382297e) {
            return baVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f382296d.mo51410b();
        try {
            this.f382295c = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f382294b == null) {
                if (!this.f382295c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f382297e) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo115901a().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo115901a().mo17653jN();
                    Service service = ((amb) jN).f197754a;
                    if (service instanceof PodcastPlaybackService) {
                        PodcastPlaybackService podcastPlaybackService = (PodcastPlaybackService) service;
                        C68225k.m98532d(podcastPlaybackService);
                        this.f382294b = new C140820ba(podcastPlaybackService, (C140812at) ((amb) jN).f197807b.d.f201898y.mo17428b());
                        a2.close();
                    } else {
                        String obj = C140820ba.class.toString();
                        String valueOf = String.valueOf(service.getClass());
                        throw new IllegalStateException("Attempt to inject a Service wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f382295c = false;
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
                C140818az.m228704a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f382296d.mo51412d();
        try {
            super.onDestroy();
            this.f382297e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140818az.m228704a(th, th);
        }
        throw th;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        C47550bb bbVar = this.f382296d;
        C47572bw d = C47831fm.m85009d();
        Service service = bbVar.f123400a;
        if ((i & 2) != 0) {
            str = "Retry " + service.getClass().getName() + ".onStartCommand";
        } else if ((i & 1) != 0) {
            str = "Redelivery " + service.getClass().getName() + ".onStartCommand";
        } else {
            str = String.valueOf(service.getClass().getName()).concat(".onStartCommand");
        }
        C47540az azVar = new C47540az(C47831fm.m85024s(bbVar.mo51413e("onStartCommand")), C47552bd.m84642a(service, intent, str, true), d);
        try {
            super.onStartCommand(intent, i, i2);
            C140820ba b = mo17754z();
            C140812at atVar = b.f382435b;
            PodcastPlaybackService podcastPlaybackService = b.f382434a;
            if (!C69664n.m101066l(intent != null ? intent.getAction() : null, atVar.f382400a)) {
                podcastPlaybackService.stopSelf();
            } else if (intent.getBooleanExtra(atVar.f382402c, true)) {
                podcastPlaybackService.startForeground(C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE, atVar.f382403d);
            } else {
                podcastPlaybackService.stopForeground(false);
            }
            azVar.close();
            return 2;
        } catch (Throwable th) {
            C140818az.m228704a(th, th);
        }
        throw th;
    }
}
