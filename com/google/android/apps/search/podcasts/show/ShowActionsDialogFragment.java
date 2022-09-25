package com.google.android.apps.search.podcasts.show;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.widgets.p10620b.C141195a;
import com.google.android.apps.search.podcasts.widgets.p10620b.C141209o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.List;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ShowActionsDialogFragment extends C141130ao implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: b */
    private C141169q f383096b;

    /* renamed from: c */
    private Context f383097c;

    /* renamed from: d */
    private final C2393x f383098d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f383099e = new C47515ab(this);

    /* renamed from: f */
    private boolean f383100f;

    @Deprecated
    public ShowActionsDialogFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141169q mo17754z() {
        C141169q qVar = this.f383096b;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383100f) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116158b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383097c == null) {
            this.f383097c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383097c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f383099e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f383098d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f383099e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f383099e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f383099e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f383099e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f383099e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f383099e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f383099e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        C141195a aVar;
        C141195a aVar2;
        C141195a aVar3;
        List list;
        LayoutInflater layoutInflater2 = layoutInflater;
        this.f383099e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C141169q a = mo17754z();
            C69664n.m101061g(layoutInflater2, "inflater");
            View inflate = layoutInflater2.inflate(R.layout.podcasts_actions_bottom_sheet_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(\n      …hToRoot= */ false\n      )");
            C140646b bVar = a.f383255a.f383147a;
            if (bVar == null) {
                bVar = C140646b.f381993r;
            }
            C69664n.m101060f(bVar, "showActionsArgs.showItem");
            C141209o oVar = new C141209o(bVar);
            C140646b bVar2 = a.f383255a.f383147a;
            if (bVar2 == null) {
                bVar2 = C140646b.f381993r;
            }
            C54397cw a2 = C54397cw.m87374a(bVar2.f382010p);
            if (a2 == null) {
                a2 = C54397cw.UNRECOGNIZED;
            }
            if (a2 == C54397cw.SHOW_RECOMMEND_MORE) {
                String string = inflate.getContext().getString(R.string.podcasts_show_more_like_this);
                C69664n.m101060f(string, "rootView.context.getStri…asts_show_more_like_this)");
                String string2 = inflate.getContext().getString(R.string.podcasts_do_not_show_more_like_this);
                C69664n.m101060f(string2, "rootView.context.getStri…_not_show_more_like_this)");
                aVar = new C141195a(R.drawable.quantum_ic_favorite_vd_theme_24, R.attr.colorHeartButton, string, string2, new C141167o(a), (Integer) null);
            } else {
                String string3 = inflate.getContext().getString(R.string.podcasts_show_more_like_this);
                C69664n.m101060f(string3, "rootView.context.getStri…asts_show_more_like_this)");
                String string4 = inflate.getContext().getString(R.string.podcasts_show_more_like_this);
                C69664n.m101060f(string4, "rootView.context.getStri…asts_show_more_like_this)");
                aVar = new C141195a(R.drawable.quantum_ic_favorite_border_vd_theme_24, R.attr.colorOnSurfaceVariantCustom, string3, string4, new C141168p(a), (Integer) null);
            }
            C140646b bVar3 = a.f383255a.f383147a;
            if (bVar3 == null) {
                bVar3 = C140646b.f381993r;
            }
            C54397cw a3 = C54397cw.m87374a(bVar3.f382010p);
            if (a3 == null) {
                a3 = C54397cw.UNRECOGNIZED;
            }
            if (a3 == C54397cw.SHOW_RECOMMEND_LESS) {
                String string5 = inflate.getContext().getString(R.string.podcasts_show_fewer_like_this);
                C69664n.m101060f(string5, "rootView.context.getStri…sts_show_fewer_like_this)");
                String string6 = inflate.getContext().getString(R.string.podcasts_do_not_show_fewer_like_this);
                C69664n.m101060f(string6, "rootView.context.getStri…not_show_fewer_like_this)");
                aVar2 = new C141195a(R.drawable.quantum_gm_ic_thumb_down_filled_vd_theme_24, 16843827, string5, string6, new C141165m(a), (Integer) null);
            } else {
                String string7 = inflate.getContext().getString(R.string.podcasts_show_fewer_like_this);
                C69664n.m101060f(string7, "rootView.context.getStri…sts_show_fewer_like_this)");
                String string8 = inflate.getContext().getString(R.string.podcasts_show_fewer_like_this);
                C69664n.m101060f(string8, "rootView.context.getStri…sts_show_fewer_like_this)");
                aVar2 = new C141195a(R.drawable.quantum_gm_ic_thumb_down_vd_theme_24, R.attr.colorOnSurfaceVariantCustom, string7, string8, new C141166n(a), (Integer) null);
            }
            C140646b bVar4 = a.f383255a.f383147a;
            if (bVar4 == null) {
                bVar4 = C140646b.f381993r;
            }
            C54397cw a4 = C54397cw.m87374a(bVar4.f382010p);
            if (a4 == null) {
                a4 = C54397cw.UNRECOGNIZED;
            }
            if (a4 == C54397cw.SHOW_HIDE) {
                String string9 = inflate.getContext().getString(R.string.podcasts_block_show_from_recommendations);
                C69664n.m101060f(string9, "rootView.context.getStri…how_from_recommendations)");
                String string10 = inflate.getContext().getString(R.string.podcasts_unblock_show_from_recommendations);
                C69664n.m101060f(string10, "rootView.context.getStri…how_from_recommendations)");
                aVar3 = new C141195a(R.drawable.quantum_gm_ic_remove_circle_vd_theme_24, 16843827, string9, string10, new C141162j(a), (Integer) null);
            } else {
                String string11 = inflate.getContext().getString(R.string.podcasts_block_show_from_recommendations);
                C69664n.m101060f(string11, "rootView.context.getStri…how_from_recommendations)");
                String string12 = inflate.getContext().getString(R.string.podcasts_block_show_from_recommendations);
                C69664n.m101060f(string12, "rootView.context.getStri…how_from_recommendations)");
                aVar3 = new C141195a(R.drawable.quantum_gm_ic_remove_circle_outline_vd_theme_24, R.attr.colorOnSurfaceVariantCustom, string11, string12, new C141163k(a), (Integer) null);
            }
            C141164l lVar = new C141164l(a);
            C141120ae aeVar = a.f383255a;
            if (aeVar.f383148b) {
                C140646b bVar5 = aeVar.f383147a;
                if (bVar5 == null) {
                    bVar5 = C140646b.f381993r;
                }
                if (bVar5.f382007m) {
                    list = C69540x.m100947e(oVar, aVar, aVar2);
                } else {
                    list = C69540x.m100947e(oVar, aVar, aVar2, aVar3);
                }
            } else {
                list = C69540x.m100944b(oVar);
            }
            ((RecyclerView) inflate.findViewById(R.id.podcasts_actions_bottom_sheet_recycler_view)).setAdapter(a.f383257c.mo116222a(list, a.f383258d.mo50482c(a.f383256b), new C141161i(lVar)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C141160h.m229176a(th, th2);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f383099e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f383099e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f383099e.mo51376d();
        try {
            super.onDetach();
            this.f383100f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f383099e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f383099e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f383099e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54441a.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f383099e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f383099e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f383099e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f383099e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f383099e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f383099e.mo51381i();
        try {
            this.f54441a.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141160h.m229176a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f383099e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f383099e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f383099e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f383099e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f383099e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f383099e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f383099e.mo51381i();
        try {
            if (!this.f383100f) {
                super.onAttach(context);
                if (this.f383096b == null) {
                    Object jN = mo116170d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C141120ae aeVar = (C141120ae) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C141120ae.f383145c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(aeVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof ShowActionsDialogFragment) {
                        ShowActionsDialogFragment showActionsDialogFragment = (ShowActionsDialogFragment) fragment;
                        C68225k.m98532d(showActionsDialogFragment);
                        this.f383096b = new C141169q(aeVar, showActionsDialogFragment, ((C74176nj) jN).mo69714ey(), (C46485f) ((C74176nj) jN).f206995g.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f383099e, this.f383098d));
                    } else {
                        String obj = C141169q.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f383099e;
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
                C141160h.m229176a(th, th2);
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
