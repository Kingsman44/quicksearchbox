package com.google.android.libraries.web.contrib.requestblock;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class RequestBlockMixin {

    /* renamed from: a */
    public final Fragment f114027a;

    /* renamed from: b */
    public final WebModelProvider f114028b;

    public RequestBlockMixin(Fragment fragment, WebModelProvider webModelProvider) {
        C69664n.m101061g(fragment, "fragment");
        this.f114027a = fragment;
        this.f114028b = webModelProvider;
    }

    /* renamed from: a */
    public final void mo46746a(String str) {
        if (this.f114027a.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
            throw new IllegalStateException(str.concat(" must be called at Fragment.onCreate."));
        }
    }

    /* renamed from: b */
    public final void mo46747b(int i, C43721h hVar) {
        C69664n.m101061g(hVar, "matcher");
        mo46746a("RequestBlockMixin#allow");
        C43720g gVar = (C43720g) this.f114028b.mo47072a(C43720g.class);
        C69664n.m101061g(hVar, "matcher");
        if (gVar.mo46757j()) {
            Map map = gVar.f114047b;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                gVar.f114047b.put(valueOf, hVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot both use RequestBlockMixin#allow and RequestBlockMixin#register. Please remove the latter.");
    }

    /* renamed from: c */
    public final void mo46748c(int i, C43721h hVar, C43714a aVar) {
        C69664n.m101061g(aVar, "callback");
        mo46746a("RequestBlockMixin#block");
        C43720g gVar = (C43720g) this.f114028b.mo47072a(C43720g.class);
        if (gVar.mo46757j()) {
            Map map = gVar.f114048c;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                gVar.f114048c.put(valueOf, new C43718e(hVar));
            }
            this.f114027a.getLifecycle().mo5790b(new RequestBlockMixin$block$1(gVar, i, aVar));
            return;
        }
        throw new IllegalStateException("Cannot both use RequestBlockMixin#block and RequestBlockMixin#register. Please remove the latter.");
    }

    /* renamed from: d */
    public final void mo46749d(int i, C43714a aVar) {
        mo46746a("RequestBlockMixin#blockAllRemaining");
        C43720g gVar = (C43720g) this.f114028b.mo47072a(C43720g.class);
        gVar.mo46753f(i);
        this.f114027a.getLifecycle().mo5790b(new RequestBlockMixin$blockAllRemaining$1(gVar, i, aVar));
    }
}
