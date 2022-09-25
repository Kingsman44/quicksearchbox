package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b.C129121i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b.C129123k;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b.C129124l;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128559p;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.i */
/* compiled from: PG */
final class C129134i implements C128559p {

    /* renamed from: a */
    final /* synthetic */ C129132h f354754a;

    public C129134i(C129132h hVar) {
        this.f354754a = hVar;
    }

    /* renamed from: a */
    public final void mo107983a(Throwable th) {
        C59104x d = C129132h.f354740a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FluidActionsContentFragment");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(38201)).mo56386p("Failed to receive ReadNotificationReplyResult");
    }

    /* renamed from: b */
    public final void mo107984b(C128548e eVar) {
        C129132h hVar = this.f354754a;
        try {
            C128547d b = eVar.mo108513b((Runnable) null);
            C58976aa aaVar = C58975e.f156826a;
            C46439e eVar2 = hVar.f354743d;
            C129123k kVar = hVar.f354748i;
            C129121i iVar = new C129121i(kVar, (C129124l) eVar.f353476a);
            C46438d a = C46438d.m82809a(C60856cj.m92905n(C47810es.m84965e(iVar), kVar.f354715b));
            eVar2.mo50428h(a.f121541a, (Object) null, hVar.f354750k);
            b.mo108511a((Object) null);
        } catch (IllegalStateException unused) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }
}
