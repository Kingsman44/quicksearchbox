package com.google.android.apps.gsa.staticplugins.chime.p7661f.p7662a.p7663a;

import android.databinding.C0118a;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.util.concurrent.C60845bz;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.f.a.a.c */
/* compiled from: PG */
public final class C97704c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C97705d f272818a;

    public C97704c(C97705d dVar) {
        this.f272818a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f272818a.f272823e.mo77192a(C118569b.SMARTSPACE_CHIME_REGISTRATION_WORKER_ENQUEUE_FAILURE, 1);
        C0118a.m116x(C97705d.f272819a.mo56226d(), "Failed to enqueue Periodic Chime registration task", 18987, th, C38505d.f101863a, Integer.valueOf(C89885b.SMARTSPACE_CHIME_REGISTRATION_ENQUEUE_WORK_FAILURE_VALUE));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        UUID uuid = (UUID) obj;
    }
}
