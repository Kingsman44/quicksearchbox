package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129605c;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.FragmentHostMainFragmentPeer$performDismiss$1", mo61344c = "FragmentHostMainFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {516})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.g */
/* compiled from: PG */
final class C129628g extends C69572j implements C69630p {

    /* renamed from: a */
    int f355755a;

    /* renamed from: b */
    final /* synthetic */ C129636o f355756b;

    /* renamed from: c */
    final /* synthetic */ Runnable f355757c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129628g(C129636o oVar, Runnable runnable, C69577g gVar) {
        super(2, gVar);
        this.f355756b = oVar;
        this.f355757c = runnable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129628g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355755a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            View requireView = this.f355756b.f355783c.requireView();
            C69664n.m101060f(requireView, "fragment.requireView()");
            View s = C129636o.m211665s(requireView);
            this.f355755a = 1;
            if (((C129605c) this.f355756b.f355797q.mo5768a()).mo109122b(s, this) == aVar) {
                return aVar;
            }
        }
        this.f355757c.run();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129628g(this.f355756b, this.f355757c, gVar);
    }
}
