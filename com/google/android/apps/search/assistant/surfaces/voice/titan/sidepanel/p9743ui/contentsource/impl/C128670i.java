package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128122w;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9737a.C128581b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.C128661a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.drltranscription.impl.C128686a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9749c.C128659a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.voiceplatevisibility.impl.C128687a;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.i */
/* compiled from: PG */
public final class C128670i implements C128661a {

    /* renamed from: a */
    public static final C59071e f353709a = C59071e.m91331h();

    /* renamed from: b */
    public final C128667f f353710b;

    /* renamed from: c */
    public final C128664c f353711c;

    /* renamed from: d */
    public C83320io f353712d;

    /* renamed from: e */
    public String f353713e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C70862aj f353714f;

    /* renamed from: g */
    public C70862aj f353715g;

    /* renamed from: h */
    public final C128122w f353716h;

    /* renamed from: i */
    public final C128686a f353717i;

    /* renamed from: j */
    public final C128687a f353718j;

    public C128670i(Optional optional, C128686a aVar, C128687a aVar2, C128667f fVar, C128664c cVar, C47215a aVar3) {
        C69664n.m101061g(optional, "voicePlateClassicServiceArg");
        C69664n.m101061g(aVar, "drlTranscriptionForwarder");
        C69664n.m101061g(aVar2, "voicePlateVisibilityForwarder");
        C69664n.m101061g(aVar3, "fragmentHost");
        this.f353717i = aVar;
        this.f353718j = aVar2;
        this.f353710b = fVar;
        this.f353711c = cVar;
        C83320io ioVar = C83320io.f227132d;
        C69664n.m101060f(ioVar, "getDefaultInstance()");
        this.f353712d = ioVar;
        this.f353716h = (C128122w) optional.orElse(null);
        aVar3.getLifecycle().mo5790b(new SidePanelVoicePlateContentSourceImpl$1(this, aVar3));
    }

    /* renamed from: a */
    public final C83320io mo108605a() {
        return this.f353712d;
    }

    /* renamed from: b */
    public final C128581b mo108606b() {
        C128667f fVar = this.f353710b;
        int i = fVar.f353704c;
        int i2 = i - 1;
        C128659a aVar = C128659a.UNINITIALIZED;
        C128098bt btVar = C128098bt.IDLE;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return C128581b.LISTENING;
        } else {
            if (i2 == 1) {
                return C128581b.USER_INPUT;
            }
            if (i2 == 2) {
                return C128581b.THINKING;
            }
            if (i2 == 3) {
                if (C128665d.f353700a[fVar.f353702a.ordinal()] == 1) {
                    return C128581b.THINKING;
                }
                return C128581b.GONE;
            }
            throw new C69677g();
        }
    }

    /* renamed from: c */
    public final void mo108609c() {
        C83320io ioVar = C83320io.f227132d;
        C69664n.m101060f(ioVar, "getDefaultInstance()");
        this.f353712d = ioVar;
        C128667f fVar = this.f353710b;
        fVar.f353702a = C128659a.UNINITIALIZED;
        fVar.f353704c = 4;
        fVar.mo108608a();
    }
}
