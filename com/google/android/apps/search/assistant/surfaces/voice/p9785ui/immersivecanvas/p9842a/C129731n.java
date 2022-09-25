package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17233b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.n */
/* compiled from: PG */
public final class C129731n implements C17233b {

    /* renamed from: a */
    private static final C59071e f356000a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.n");

    /* renamed from: b */
    private final C129703a f356001b;

    /* renamed from: c */
    private final C129711b f356002c;

    public C129731n(C129711b bVar, C129703a aVar) {
        this.f356002c = bVar;
        this.f356001b = aVar;
    }

    /* renamed from: a */
    public final void mo23247a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f356000a.mo56226d()).mo56382g(th)).mo56372aa(38436)).mo56386p("#onInitialS3RequestSendingFailure");
        this.f356001b.f355937a.mo19974a(C37176a.f97044eC.mo40815i(C62722b.INTERNAL));
    }

    /* renamed from: b */
    public final void mo23248b() {
        this.f356002c.mo109202b();
        this.f356001b.f355937a.mo19974a(C37176a.f97044eC.mo40815i(C62722b.OK));
    }

    /* renamed from: c */
    public final void mo23249c(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f356000a.mo56226d()).mo56382g(th)).mo56372aa(38437)).mo56386p("#onS3RequestStreamingFailure");
        this.f356001b.f355937a.mo19974a(C37176a.f97048eG.mo40805c(C62722b.INTERNAL));
    }

    /* renamed from: d */
    public final void mo23250d() {
        ((C59052c) ((C59052c) f356000a.mo56224b()).mo56372aa(38438)).mo56386p("#onS3RequestStreamingSuccessful");
        this.f356001b.f355937a.mo19974a(C37176a.f97048eG.mo40805c(C62722b.OK));
    }
}
