package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.player.p3561b.C45463av;
import com.google.android.youtube.player.p3561b.C45466ay;
import com.google.android.youtube.player.p3561b.C45467az;
import com.google.android.youtube.player.p3561b.C45469ba;
import com.google.android.youtube.player.p3561b.C45475bg;
import com.google.android.youtube.player.p3561b.C45485e;
import com.google.android.youtube.player.p3561b.C45489i;
import com.google.android.youtube.player.p3561b.C45490j;
import com.google.android.youtube.player.p3561b.C45495o;
import com.google.android.youtube.player.p3561b.C45496p;
import com.google.android.youtube.player.p3561b.C45498r;
import com.google.android.youtube.player.p3561b.C45499s;
import com.google.android.youtube.player.p3561b.C45500t;
import com.google.android.youtube.player.p3561b.C45502v;
import com.google.android.youtube.player.p3561b.C45503w;

public class YouTubeEmbedSupportFragment extends Fragment {

    /* renamed from: a */
    public final C45485e f118840a = new C45485e(this, new C45516l(this), new C45519o(this), new C45517m(this), new C45518n(this));

    /* renamed from: b */
    public final C45466ay f118841b = new C45466ay();

    /* renamed from: c */
    public final C45469ba f118842c = new C45469ba(this);

    /* renamed from: d */
    public final C45467az f118843d = new C45467az();

    /* renamed from: e */
    public C45509e f118844e = C45509e.f118951b;

    /* renamed from: a */
    public final void mo49570a() {
        C45503w wVar = this.f118840a.f118896h;
        wVar.f118939f = C45502v.f118933d;
        wVar.f118938e = new C45498r(wVar);
        wVar.mo49670j();
    }

    /* renamed from: b */
    public final void mo49571b() {
        C45503w wVar = this.f118840a.f118896h;
        wVar.f118939f = new C45500t(wVar);
        wVar.mo49669i();
    }

    /* renamed from: c */
    public final void mo49572c() {
        C45503w wVar = this.f118840a.f118896h;
        wVar.f118939f = C45502v.f118933d;
        wVar.f118938e = new C45499s(wVar);
        wVar.mo49670j();
    }

    /* renamed from: d */
    public final synchronized void mo49573d(C45438a aVar) {
        this.f118841b.mo49614a(aVar);
    }

    /* renamed from: e */
    public final synchronized void mo49574e(C45508d dVar) {
        this.f118843d.mo49617a(dVar);
    }

    /* renamed from: f */
    public final synchronized void mo49575f(C45511g gVar) {
        this.f118842c.mo49621a(gVar);
    }

    /* renamed from: g */
    public final void mo49576g(boolean z) {
        C45503w wVar = this.f118840a.f118896h;
        wVar.f118941h = new C45490j(wVar, z);
        wVar.mo49662a();
    }

    /* renamed from: h */
    public final void mo49577h(C45509e eVar) {
        this.f118844e = eVar != null ? eVar : C45509e.f118951b;
        C45503w wVar = this.f118840a.f118896h;
        wVar.f118940g = new C45489i(wVar, eVar != null);
        wVar.mo49663b();
    }

    /* renamed from: i */
    public final void mo49578i(String str) {
        C45503w wVar = this.f118840a.f118896h;
        C45502v vVar = C45502v.f118933d;
        wVar.f118938e = vVar;
        wVar.f118939f = vVar;
        wVar.f118941h = vVar;
        wVar.mo49665d();
        wVar.mo49666e();
        wVar.f118937d = new C45495o(wVar, str);
        wVar.mo49664c();
    }

    /* renamed from: j */
    public final void mo49579j() {
        C45503w wVar = this.f118840a.f118896h;
        C45502v vVar = C45502v.f118933d;
        wVar.f118938e = vVar;
        wVar.f118939f = vVar;
        wVar.f118941h = vVar;
        C45475bg bgVar = wVar.f118943j;
        if (bgVar != null) {
            try {
                bgVar.mo49588lt(7, bgVar.mo49586lr());
            } catch (RemoteException unused) {
                C45503w.m81248f();
            }
        }
    }

    /* renamed from: k */
    public final synchronized void mo49580k(C45438a aVar) {
        this.f118841b.mo49615b(aVar);
    }

    /* renamed from: l */
    public final synchronized void mo49581l(C45508d dVar) {
        this.f118843d.mo49618b(dVar);
    }

    /* renamed from: m */
    public final synchronized void mo49582m(C45511g gVar) {
        this.f118842c.mo49622b(gVar);
    }

    /* renamed from: n */
    public final C45463av mo49583n() {
        C45485e eVar = this.f118840a;
        if (eVar.f118904p != null) {
            C45510f fVar = C45510f.SUCCESS;
            C45463av b = C45463av.m81143b();
            b.mo49608d(fVar);
            return b;
        }
        C45463av avVar = eVar.f118891c;
        if (avVar != C45485e.f118889a) {
            return avVar;
        }
        C45463av b2 = C45463av.m81143b();
        eVar.f118891c = b2;
        eVar.f118899k = "AIzaSyC76tuQkztPY3i4JmVm0WzeaKlgL0tudCI";
        if (!eVar.f118902n) {
            return b2;
        }
        eVar.mo49651p("AIzaSyC76tuQkztPY3i4JmVm0WzeaKlgL0tudCI");
        return b2;
    }

    /* renamed from: o */
    public final void mo49584o(String str) {
        C45503w wVar = this.f118840a.f118896h;
        C45502v vVar = C45502v.f118933d;
        wVar.f118938e = vVar;
        wVar.f118939f = vVar;
        wVar.f118941h = vVar;
        wVar.mo49665d();
        wVar.mo49666e();
        C45463av a = C45463av.m81142a();
        wVar.f118942i = a;
        wVar.f118937d = new C45496p(wVar, str, a);
        wVar.mo49664c();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f118840a.mo49647l();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f118840a.mo49650o();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f118840a.mo49650o();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f118840a.mo49648m();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return this.f118840a.mo49638c();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f118840a.mo49655u();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f118840a.mo49656v();
    }

    public final void onDetach() {
        super.onDetach();
        this.f118840a.mo49639d();
    }

    public final void onPause() {
        super.onPause();
        this.f118840a.mo49640e();
    }

    public final void onResume() {
        super.onResume();
        this.f118840a.mo49641f();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f118840a.mo49642g(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f118840a.mo49643h();
    }

    public final void onStop() {
        super.onStop();
        this.f118840a.mo49644i();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f118840a.mo49649n();
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.f118840a.mo49645j(bundle);
    }
}
