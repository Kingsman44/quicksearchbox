package com.google.android.libraries.web.contrib.logging.internal;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.LoggingFeatureContract;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.p3355b.C43339h;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.contrib.C44088f;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.common.base.C58893dc;

/* compiled from: PG */
public final class LoggingSetup implements C44088f {

    /* renamed from: a */
    public C43706d f114005a;

    /* renamed from: b */
    private final Fragment f114006b;

    /* renamed from: c */
    private final C43712o f114007c;

    public LoggingSetup(final Fragment fragment, final C43269t tVar, C44084b bVar) {
        this.f114006b = fragment;
        this.f114007c = (C43712o) bVar.mo47055a(LoggingFeatureContract.class, C43712o.class).get();
        fragment.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                C43706d dVar;
                C43703a aVar;
                C0167am activity = fragment.getActivity();
                if ((activity == null || !activity.isChangingConfigurations() || !tVar.mo46384b().f112963b) && (dVar = LoggingSetup.this.f114005a) != null && (aVar = dVar.f114016a) != null) {
                    aVar.mo46740a((C43367l) null);
                }
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: g */
    public final void mo42597g() {
        C43339h hVar = (C43339h) new WebModelProvider(this.f114006b).mo47072a(C43339h.class);
        if (hVar.mo46464c() == null) {
            C43706d dVar = new C43706d(this.f114007c);
            this.f114005a = dVar;
            C58893dc.m90996a(dVar);
            hVar.f113208c.set(dVar);
            return;
        }
        this.f114005a = (C43706d) hVar.mo46464c();
    }
}
