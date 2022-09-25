package com.google.android.libraries.search.silk.web.notification;

import androidx.lifecycle.C2391v;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.p3205a.p3229r.C41732a;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.contrib.C44088f;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class SilkNotificationV2MessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f107020a = new C43775a("silk_notification_v2_port");

    /* renamed from: b */
    static final C58485gu f107021b = C58485gu.m89844l(new String[]{"getNotificationOptInStatus", "showNotificationOptInPage", "handleNotificationClientAction", "handleNotificationOptInPromoClientAction", "renderNotificationMenu"});

    /* renamed from: e */
    public static final /* synthetic */ int f107022e = 0;

    /* renamed from: c */
    public final C43952c f107023c;

    /* renamed from: d */
    public final C40769f f107024d;

    /* renamed from: f */
    private final C44084b f107025f;

    /* renamed from: g */
    private final C43269t f107026g;

    /* renamed from: h */
    private final boolean f107027h;

    public SilkNotificationV2MessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C43269t tVar, Optional optional) {
        this.f107025f = bVar;
        this.f107023c = gVar.mo46957a(f107020a);
        this.f107024d = fVar;
        this.f107026g = tVar;
        this.f107027h = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: h */
    private final void m70838h() {
        C58838bb.m90887v(this.f107026g.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "NotificationV2");
        this.f107025f.mo47055a(SilkNotificationV2Feature.class, C41732a.class).ifPresent(new C40846i(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f107027h) {
            m70838h();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f107027h) {
            m70838h();
        }
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
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
}
