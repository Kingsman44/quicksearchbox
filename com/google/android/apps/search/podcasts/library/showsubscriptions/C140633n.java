package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.support.p033v7.p040e.C0429k;
import android.view.View;
import com.google.android.apps.search.podcasts.library.showsubscriptions.p10584a.C140617a;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.n */
/* compiled from: PG */
public final class C140633n implements C46792di.C46793a {

    /* renamed from: a */
    final /* synthetic */ C140636q f381941a;

    public C140633n(C140636q qVar) {
        this.f381941a = qVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) C140636q.f381946a.mo56224b();
        cVar.mo56379ah(new C59094n(41611));
        cVar.mo56389s("Error updating subscriptions:", th);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C141252c cVar;
        FullScreenMessageView fullScreenMessageView;
        C140617a aVar = (C140617a) obj;
        C69664n.m101061g(aVar, "data");
        C140630k kVar = this.f381941a.f381950e;
        List list = aVar.f381905a;
        C69664n.m101061g(list, "newShowResults");
        List list2 = kVar.f381937a;
        kVar.f381937a = list;
        C0429k.m1383a(new C140629j(list2, list), false).mo1399b(kVar);
        C140636q qVar = this.f381941a;
        if (aVar.f381905a.isEmpty()) {
            cVar = C141252c.EMPTY;
        } else {
            cVar = C141252c.NONE;
        }
        View view = qVar.f381947b.getView();
        if (!(view == null || (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_message_layer)) == null)) {
            fullScreenMessageView.mo17754z().mo116270a(cVar);
        }
        C140636q qVar2 = this.f381941a;
        qVar2.f381955j = aVar.f381906b;
        if (!qVar2.f381956k) {
            C140621b bVar = qVar2.f381954i;
            if (bVar.f381916b) {
                qVar2.f381956k = true;
                qVar2.mo115805a(bVar);
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }

    /* renamed from: d */
    public final void mo50733d() {
    }

    /* renamed from: e */
    public final void mo50734e(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
    }

    /* renamed from: f */
    public final void mo50735f() {
    }
}
