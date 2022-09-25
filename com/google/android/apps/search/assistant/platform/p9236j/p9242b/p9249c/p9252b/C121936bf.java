package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.content.Context;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33561b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33563d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.bf */
/* compiled from: PG */
final class C121936bf implements Callable {

    /* renamed from: a */
    final /* synthetic */ C121940bj f338354a;

    /* renamed from: b */
    final /* synthetic */ C34037b f338355b;

    /* renamed from: c */
    final /* synthetic */ C129655b f338356c;

    public C121936bf(C121940bj bjVar, C129655b bVar, C34037b bVar2) {
        this.f338354a = bjVar;
        this.f338356c = bVar;
        this.f338355b = bVar2;
    }

    public final /* synthetic */ Object call() {
        C121925av avVar = (C121925av) this.f338354a.f338373h.get();
        if (avVar != null) {
            avVar.mo105448j("replacingFragment");
        }
        this.f338354a.f338367b.setUiEnabled(true);
        if (this.f338354a.f338374i.getAndSet(false)) {
            C33504b bVar = this.f338354a.f338367b;
            Bundle bundle = new Bundle();
            bundle.putBoolean("SHOW_UI_ONLY", true);
            bVar.show(bundle, 0);
        }
        C121940bj bjVar = this.f338354a;
        ViewGroup a = bjVar.mo105463a(bjVar.mo105464b());
        C58976aa aaVar = C58975e.f156826a;
        this.f338354a.mo105464b();
        C28306ab.m52931g(a);
        C33561b a2 = this.f338356c.mo109161a();
        C33504b bVar2 = this.f338354a.f338367b;
        C69664n.m101061g(bVar2, "apaVoiceInteractionSession");
        VoiceInteractionSession.Insets insets = new VoiceInteractionSession.Insets();
        insets.touchableInsets = 0;
        bVar2.mo38927l(insets);
        C33563d dVar = a2.f89744b;
        this.f338354a.f338371f.set(dVar);
        Context context = this.f338354a.mo105464b().getContext();
        C69664n.m101060f(context, "window.context");
        Context e = C121940bj.m201416e(context, dVar);
        FrameLayout frameLayout = new FrameLayout(e);
        frameLayout.setId(View.generateViewId());
        this.f338354a.f338372g.set(frameLayout);
        a.removeAllViews();
        a.addView(frameLayout);
        C121940bj.m201417f(e);
        C121940bj bjVar2 = this.f338354a;
        Object obj = bjVar2.f338372g.get();
        C69664n.m101058d(obj);
        return bjVar2.mo105467g((FrameLayout) obj, e, a2, this.f338355b);
    }
}
