package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127361i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9796a.C129111c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b.C129114b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b.C129122j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b.C129123k;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128556m;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32950c;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33181f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33194h;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51484jk;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.h */
/* compiled from: PG */
public final class C129132h {

    /* renamed from: a */
    public static final C59071e f354740a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.h");

    /* renamed from: b */
    public final C129129e f354741b;

    /* renamed from: c */
    public final C46855i f354742c;

    /* renamed from: d */
    public final C46439e f354743d;

    /* renamed from: e */
    public final C129144s f354744e;

    /* renamed from: f */
    public final C127120a f354745f;

    /* renamed from: g */
    public final C32951d f354746g;

    /* renamed from: h */
    public final C129111c f354747h;

    /* renamed from: i */
    public final C129123k f354748i;

    /* renamed from: j */
    public final C129134i f354749j = new C129134i(this);

    /* renamed from: k */
    public final C129133a f354750k = new C129133a();

    /* renamed from: l */
    public final C128556m f354751l;

    /* renamed from: m */
    public final C33194h f354752m;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.h$a */
    /* compiled from: PG */
    final class C129133a implements C46440f {
        public C129133a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            if (th instanceof C129122j) {
                C59104x b = C129132h.f354740a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "FluidActionsContentFragment");
                ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(38200)).mo56386p("Received read notification input but did not update UI");
                return;
            }
            C59104x c = C129132h.f354740a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FluidActionsContentFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(38199)).mo56386p("Adapting read notification input failed");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C129132h.this.mo108860a((C51809dy) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C51809dy.f135933f, C62921ba.m95368a()));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C129132h(C129129e eVar, C129144s sVar, C46855i iVar, C46439e eVar2, C127120a aVar, C33194h hVar, C32951d dVar, C129111c cVar, C127361i iVar2, C128556m mVar, C129123k kVar) {
        this.f354741b = eVar;
        this.f354744e = sVar;
        this.f354742c = iVar;
        this.f354743d = eVar2;
        this.f354745f = aVar;
        this.f354752m = hVar;
        C32950c b = dVar.mo38370b();
        b.mo38368b(iVar2.mo108032a() == C51484jk.NGA);
        this.f354746g = b.mo38367a();
        this.f354747h = cVar;
        this.f354751l = mVar;
        this.f354748i = kVar;
    }

    /* renamed from: a */
    public final void mo108860a(C51809dy dyVar) {
        if (dyVar.f135936b.equals("notification.SHOW_CARD")) {
            C46439e eVar = this.f354743d;
            C129123k kVar = this.f354748i;
            C129114b bVar = new C129114b(kVar, dyVar);
            C46438d a = C46438d.m82809a(C60856cj.m92905n(C47810es.m84965e(bVar), kVar.f354715b));
            eVar.mo50428h(a.f121541a, (Object) null, this.f354750k);
            return;
        }
        Fragment c = this.f354741b.getChildFragmentManager().f634a.mo671c("FluidActionsFragment");
        if (c != null) {
            try {
                C58976aa aaVar = C58975e.f156826a;
                ((C33181f) ((C47231d) c).mo17754z()).mo38574a(dyVar);
            } catch (IllegalStateException e) {
                C59104x c2 = f354740a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "FluidActionsContentFragment");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(38205)).mo56386p("Failed to render ClientOp due to FluidActions fragment not initialized");
            }
        }
    }
}
