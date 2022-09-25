package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94960u;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.ab */
/* compiled from: PG */
public final class C94983ab implements C87682aj {

    /* renamed from: a */
    public static final C59071e f265712a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.h.ab");

    /* renamed from: b */
    public static final C88244um[] f265713b = {C88244um.ON_TRANSCRIPTION_UPDATE, C88244um.UPDATE_RECOGNIZED_TEXT, C88244um.SHOW_RECOGNITION_STATE};

    /* renamed from: c */
    public final C95008z f265714c;

    /* renamed from: d */
    public final C95295ag f265715d;

    /* renamed from: e */
    public volatile boolean f265716e;

    /* renamed from: f */
    public volatile boolean f265717f;

    /* renamed from: g */
    public boolean f265718g;

    /* renamed from: h */
    public C95007y f265719h;

    /* renamed from: i */
    public C95294af f265720i;

    /* renamed from: j */
    public String f265721j;

    /* renamed from: k */
    public C94960u f265722k;

    /* renamed from: l */
    private final C22871g f265723l;

    public C94983ab(C22871g gVar, C95008z zVar, C95295ag agVar) {
        this.f265723l = gVar;
        this.f265714c = zVar;
        this.f265715d = agVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        this.f265723l.mo28212l("service-event", new C94982aa(this, serviceEventData));
    }
}
