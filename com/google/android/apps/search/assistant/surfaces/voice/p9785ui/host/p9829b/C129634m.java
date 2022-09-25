package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129668f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129669g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9836c.C129606a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9836c.C129607b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9836c.C129611f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.FragmentHostMainFragmentPeer$tryEnterWithAnimation$1", mo61344c = "FragmentHostMainFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {568, 570})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.m */
/* compiled from: PG */
final class C129634m extends C69572j implements C69630p {

    /* renamed from: a */
    int f355770a;

    /* renamed from: b */
    final /* synthetic */ C129636o f355771b;

    /* renamed from: c */
    final /* synthetic */ Fragment f355772c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129634m(C129636o oVar, Fragment fragment, C69577g gVar) {
        super(2, gVar);
        this.f355771b = oVar;
        this.f355772c = fragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129634m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355770a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            NavigatorArgs$Transition navigatorArgs$Transition = this.f355771b.mo109137c().f355879c;
            if (navigatorArgs$Transition != null) {
                C129636o oVar = this.f355771b;
                oVar.mo109146n(C129669g.m211718b(oVar.mo109137c(), (C129541aa) null, (C129676j) null, 11));
                C129611f a = this.f355771b.f355800t.mo69423a(new C129606a(navigatorArgs$Transition.f355867a));
                Fragment fragment = this.f355772c;
                C129668f fVar = navigatorArgs$Transition.f355868b;
                this.f355770a = 1;
                if (a.mo109130a(fragment, fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                C129611f a2 = this.f355771b.f355800t.mo69423a(C129607b.f355721a);
                Fragment fragment2 = this.f355772c;
                C129668f fVar2 = C129668f.DEFAULT;
                this.f355770a = 2;
                if (a2.mo109130a(fragment2, fVar2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129634m(this.f355771b, this.f355772c, gVar);
    }
}
