package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9838c;

import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129538a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129539b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129578c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129647z;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33562c;
import com.google.apps.tiktok.concurrent.C46459k;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.c.d */
/* compiled from: PG */
public final class C129652d implements C129540c {

    /* renamed from: a */
    private final C33562c f355838a;

    /* renamed from: b */
    private final FragmentManager f355839b;

    public C129652d(C33562c cVar, FragmentManager fragmentManager) {
        C69664n.m101061g(cVar, "assistLayerSession");
        C69664n.m101061g(fragmentManager, "fragmentManager");
        this.f355838a = cVar;
        this.f355839b = fragmentManager;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo109080a() {
        C129539b.m211487a(this);
    }

    /* renamed from: b */
    public final void mo109081b(C129538a aVar) {
        C69788q qVar;
        C69664n.m101061g(aVar, "reason");
        C129578c a = C129647z.m211697a(this.f355839b);
        if (a != null) {
            a.mo17754z().mo109144l(new C129651c(this, aVar));
            qVar = C69788q.f186170a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            mo109083d(aVar);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo109082c() {
        C129539b.m211488b(this);
    }

    /* renamed from: d */
    public final void mo109083d(C129538a aVar) {
        C69664n.m101061g(aVar, "reason");
        C46459k.m82829b(this.f355838a.mo38981a(), "Dismissing AssistLayer UI failed", new Object[0]);
    }
}
