package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10068e.C132416a;
import com.google.android.gms.cast.framework.C143380a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.common.p4580v.C60948g;
import com.google.protobuf.p4750c.C62948a;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.m */
/* compiled from: PG */
public final class C132495m extends C132483bc implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C132478ay f361628a;

    /* renamed from: c */
    private Context f361629c;

    /* renamed from: d */
    private final C2393x f361630d = new C2393x(this);

    /* renamed from: e */
    private boolean f361631e;

    @Deprecated
    public C132495m() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C132478ay mo17754z() {
        C132478ay ayVar = this.f361628a;
        if (ayVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f361631e) {
            return ayVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo110768b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f361629c == null) {
            this.f361629c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f361629c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f361630d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C132494l.m215408a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C132478ay a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_news_player_fragment, viewGroup, false);
            ((Button) inflate.findViewById(R.id.assistant_news_player_skip_next)).setOnClickListener(new C47591co(a.f361593h, "skipNextButton clicked", new C132496n(a)));
            Button button = (Button) inflate.findViewById(R.id.assistant_news_player_skip_previous);
            if (button != null) {
                button.setOnClickListener(new C47591co(a.f361593h, "skipPreviousButton clicked", new C132497o(a)));
            }
            ((Button) inflate.findViewById(R.id.assistant_news_player_replay)).setOnClickListener(new C47591co(a.f361593h, "replayButton clicked", new C132498p(a)));
            ((Button) inflate.findViewById(R.id.assistant_news_player_forward)).setOnClickListener(new C47591co(a.f361593h, "forwardButton clicked", new C132499q(a)));
            a.f361587b = new C132506x(a, inflate.findViewById(R.id.assistant_news_player_info));
            C132446a q = a.f361586a.mo110715q();
            q.f361493a.mo1040h(new C132501s(a), (Handler) null);
            a.f361588c = new C132467an(a, inflate);
            a.f361589d = new C132459af(a, inflate);
            a.f361591f = new C132471ar(a, inflate);
            a.f361590e = new C132477ax(a, inflate);
            a.f361592g = new C132489g(inflate, a.f361586a, a.f361594i);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.assistant_news_player_bottom_sheet);
            if (linearLayout != null) {
                BottomSheetBehavior C = BottomSheetBehavior.m78767C(linearLayout);
                C.mo47519v(4);
                C.f115860C = true;
                C.mo47511I(1.0E-4f);
                C.mo47506D(new C132502t(a));
                View findViewById = inflate.findViewById(R.id.assistant_news_player_bottom_sheet_handle_layout);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new C47591co(a.f361593h, "bottomSheet toggle clicked", new C132500r(C)));
                }
            }
            new C132455ab(a, inflate.findViewById(R.id.assistant_news_player_overflow_menu_button));
            C132416a aVar = a.f361586a;
            boolean booleanValue = ((Boolean) a.f361598m.mo17428b()).booleanValue();
            MediaRouteButton mediaRouteButton = (MediaRouteButton) inflate.findViewById(R.id.assistant_news_player_media_route_button);
            if (mediaRouteButton != null && booleanValue) {
                C143380a.m232631a(inflate.getContext(), mediaRouteButton);
                inflate.findViewById(R.id.assistant_news_player_output_device_switcher).setVisibility(0);
                inflate.findViewById(R.id.assistant_news_player_output_device_switcher).setOnClickListener(new C132479az(mediaRouteButton));
                ((TextView) inflate.findViewById(R.id.assistant_news_player_output_device_name)).setText(aVar.mo110701c());
                C132446a q2 = aVar.mo110715q();
                q2.f361493a.mo1040h(new C132481ba(inflate, aVar), (Handler) null);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C132494l.m215408a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f361631e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C132494l.m215408a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C132494l.m215408a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C132478ay a = mo17754z();
            C52174hz a2 = a.f361586a.mo110699a();
            if (a2 != null) {
                a.mo110765c(a2);
                C132467an anVar = a.f361588c;
                anVar.getClass();
                anVar.f361563b.mObservable.mo2879a();
                C132459af afVar = a.f361589d;
                afVar.getClass();
                PlaybackStateCompat f = afVar.f361544a.f361586a.mo110715q().f361493a.mo1038f();
                if (f == null || f.f994a != 3) {
                    afVar.mo110748a();
                } else {
                    afVar.mo110749b();
                }
                C132477ax axVar = a.f361590e;
                axVar.getClass();
                PlaybackStateCompat f2 = axVar.f361583c.f361586a.mo110715q().f361493a.mo1038f();
                if (f2 != null) {
                    axVar.mo110762a(f2.f997d);
                }
                C132471ar arVar = a.f361591f;
                arVar.getClass();
                C132446a q = arVar.f361568a.f361586a.mo110715q();
                if (q.f361493a.mo1038f() != null) {
                    arVar.mo110758a(C62948a.m95459j(q.f361493a.mo1038f().f995b), C62948a.m95459j(q.f361493a.mo1036d().mo816a("android.media.metadata.DURATION")));
                }
                C132489g gVar = a.f361592g;
                gVar.getClass();
                gVar.f361622b = true;
                gVar.mo110774a();
                gVar.mo110775b();
            }
            e.close();
            return;
        } catch (Throwable th) {
            C132494l.m215408a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f361631e) {
                super.onAttach(context);
                if (this.f361628a == null) {
                    Object jN = mo110769d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C132495m) {
                        C132495m mVar = (C132495m) fragment;
                        C68225k.m98532d(mVar);
                        C68225k.m98532d(C60948g.f165068a);
                        C132484bd bdVar = new C132484bd((Context) ((C74176nj) jN).f206677a.g.mo17428b());
                        C47477n gY = ((C74176nj) jN).mo69794gY();
                        aqy aqy = ((C74176nj) jN).f206677a;
                        this.f361628a = new C132478ay(mVar, (C132416a) ((C74176nj) jN).f206677a.b.f200128dj.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C47449e) ((C74176nj) jN).f207092s.mo17428b(), (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b(), bdVar, gY, aqy.d.f201549bH, aqy.b.f200126dh);
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f361630d));
                    } else {
                        String obj = C132478ay.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C132494l.m215408a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
