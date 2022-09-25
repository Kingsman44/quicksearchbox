package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129668f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.host.fragment.FragmentHostMainFragmentPeer$updateContent$1", mo61344c = "FragmentHostMainFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {403})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.n */
/* compiled from: PG */
final class C129635n extends C69572j implements C69630p {

    /* renamed from: a */
    int f355773a;

    /* renamed from: b */
    final /* synthetic */ C129636o f355774b;

    /* renamed from: c */
    final /* synthetic */ Fragment f355775c;

    /* renamed from: d */
    final /* synthetic */ Fragment f355776d;

    /* renamed from: e */
    final /* synthetic */ C129668f f355777e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129635n(C129636o oVar, Fragment fragment, Fragment fragment2, C129668f fVar, C69577g gVar) {
        super(2, gVar);
        this.f355774b = oVar;
        this.f355775c = fragment;
        this.f355776d = fragment2;
        this.f355777e = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129635n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355773a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C129636o oVar = this.f355774b;
            Fragment fragment = this.f355775c;
            Fragment fragment2 = this.f355776d;
            C129668f fVar = this.f355777e;
            this.f355773a = 1;
            if (fragment2.getClass().isInstance(fragment)) {
                oVar.mo109140f();
                obj2 = C69788q.f186170a;
            } else {
                obj2 = oVar.mo109139e(fragment, fragment2, fVar, this);
                if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                    obj2 = C69788q.f186170a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129635n(this.f355774b, this.f355775c, this.f355776d, this.f355777e, gVar);
    }
}
