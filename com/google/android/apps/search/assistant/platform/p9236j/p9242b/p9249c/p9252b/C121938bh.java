package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33561b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33563d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.bh */
/* compiled from: PG */
final class C121938bh implements Callable {

    /* renamed from: a */
    final /* synthetic */ C33504b f338361a;

    /* renamed from: b */
    final /* synthetic */ C121940bj f338362b;

    /* renamed from: c */
    final /* synthetic */ C34037b f338363c;

    /* renamed from: d */
    final /* synthetic */ C129655b f338364d;

    public C121938bh(C33504b bVar, C121940bj bjVar, C129655b bVar2, C34037b bVar3) {
        this.f338361a = bVar;
        this.f338362b = bjVar;
        this.f338364d = bVar2;
        this.f338363c = bVar3;
    }

    public final /* synthetic */ Object call() {
        this.f338361a.setUiEnabled(true);
        this.f338362b.f338374i.set(false);
        C58976aa aaVar = C58975e.f156826a;
        Window window = this.f338361a.getWindow().getWindow();
        C69664n.m101058d(window);
        ViewGroup a = this.f338362b.mo105463a(window);
        C121940bj bjVar = this.f338362b;
        AccountId accountId = bjVar.f338368c;
        C28306ab abVar = bjVar.f338370e;
        C28313c a2 = bjVar.f338369d.mo33805a(C28427h.m53115a(152716));
        a2.mo33861i(C28439i.f77216b);
        a2.mo33859g(C28375ak.m53061c(152717));
        a2.mo33859g(C45954d.m82060a(accountId));
        abVar.mo33801b(a, a2);
        C33561b a3 = this.f338364d.mo109161a();
        C33563d dVar = a3.f89744b;
        Context context = window.getContext();
        C69664n.m101060f(context, "window.context");
        Context e = C121940bj.m201416e(context, dVar);
        this.f338362b.f338371f.set(dVar);
        FrameLayout frameLayout = new FrameLayout(e);
        frameLayout.setId(View.generateViewId());
        this.f338362b.f338372g.set(frameLayout);
        a.removeAllViews();
        a.addView(frameLayout);
        C121940bj.m201417f(e);
        return this.f338362b.mo105467g(frameLayout, e, a3, this.f338363c);
    }
}
