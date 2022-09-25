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
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140649a;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.android.apps.search.podcasts.widgets.p10620b.C141195a;
import com.google.android.apps.search.podcasts.widgets.p10620b.C141208n;
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
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.b */
/* compiled from: PG */
public final class C141133b extends C141129an implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: b */
    private C141159g f383180b;

    /* renamed from: c */
    private Context f383181c;

    /* renamed from: d */
    private final C2393x f383182d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f383183e = new C47515ab(this);

    /* renamed from: f */
    private boolean f383184f;

    @Deprecated
    public C141133b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141159g mo17754z() {
        C141159g gVar = this.f383180b;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383184f) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116167b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383181c == null) {
            this.f383181c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383181c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f383183e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f383182d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f383183e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f383183e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f383183e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f383183e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f383183e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f383183e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f383183e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        LayoutInflater layoutInflater2 = layoutInflater;
        this.f383183e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C141159g a = mo17754z();
            C69664n.m101061g(layoutInflater2, "inflater");
            View inflate = layoutInflater2.inflate(R.layout.podcasts_actions_bottom_sheet_fragment, viewGroup, false);
            String string = inflate.getContext().getString(R.string.podcasts_episode_list_sort_by);
            C69664n.m101060f(string, "rootView.context.getStri…sts_episode_list_sort_by)");
            C141208n nVar = new C141208n(string);
            String string2 = inflate.getContext().getString(R.string.podcasts_episode_sort_desc);
            C69664n.m101060f(string2, "rootView.context.getStri…dcasts_episode_sort_desc)");
            C140651c cVar = a.f383243a.f383144b;
            if (cVar == null) {
                cVar = C140651c.f382022c;
            }
            C140649a a2 = C140649a.m228441a(cVar.f382024a);
            if (a2 == null) {
                a2 = C140649a.UNRECOGNIZED;
            }
            C141195a aVar = new C141195a(a2 == C140649a.PUBLICATION_DATE_DESC ? R.drawable.quantum_gm_ic_check_vd_theme_24 : 0, R.attr.colorOnSurfaceVariantCustom, string2, string2, new C141158f(a), (Integer) null);
            String string3 = inflate.getContext().getString(R.string.podcasts_episode_sort_asc);
            C69664n.m101060f(string3, "rootView.context.getStri…odcasts_episode_sort_asc)");
            C140651c cVar2 = a.f383243a.f383144b;
            if (cVar2 == null) {
                cVar2 = C140651c.f382022c;
            }
            C140649a a3 = C140649a.m228441a(cVar2.f382024a);
            if (a3 == null) {
                a3 = C140649a.UNRECOGNIZED;
            }
            C141195a aVar2 = new C141195a(a3 == C140649a.PUBLICATION_DATE_ASC ? R.drawable.quantum_gm_ic_check_vd_theme_24 : 0, R.attr.colorOnSurfaceVariantCustom, string3, string3, new C141157e(a), (Integer) null);
            String string4 = inflate.getContext().getString(R.string.podcasts_episode_list_filter);
            C69664n.m101060f(string4, "rootView.context.getStri…asts_episode_list_filter)");
            C141208n nVar2 = new C141208n(string4);
            C140651c cVar3 = a.f383243a.f383144b;
            if (cVar3 == null) {
                cVar3 = C140651c.f382022c;
            }
            boolean z = cVar3.f382025b;
            String string5 = inflate.getContext().getString(z ? R.string.podcasts_show_completed_episodes : R.string.podcasts_hide_completed_episodes);
            C69664n.m101060f(string5, "rootView.context.getStri…pisodes\n        }\n      )");
            ((RecyclerView) inflate.findViewById(R.id.podcasts_actions_bottom_sheet_recycler_view)).setAdapter(a.f383245c.mo116222a(C69540x.m100947e(nVar, aVar, aVar2, nVar2, new C141195a(R.drawable.quantum_ic_history_vd_theme_24, R.attr.colorOnSurfaceVariantCustom, string5, string5, new C141152d(a, z), (Integer) null)), a.f383246d.mo50482c(a.f383244b), new C141137c(a)));
            C69664n.m101060f(inflate, "rootView");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th2) {
            C141107a.m229124a(th, th2);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f383183e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f383183e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f383183e.mo51376d();
        try {
            super.onDetach();
            this.f383184f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f383183e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f383183e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f383183e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54441a.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f383183e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f383183e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f383183e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f383183e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f383183e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f383183e.mo51381i();
        try {
            this.f54441a.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141107a.m229124a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f383183e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f383183e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f383183e;
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
        C47515ab abVar = this.f383183e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f383183e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f383183e;
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
        this.f383183e.mo51381i();
        try {
            if (!this.f383184f) {
                super.onAttach(context);
                if (this.f383180b == null) {
                    Object jN = mo116168d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C141118ac acVar = (C141118ac) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C141118ac.f383141c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(acVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141133b) {
                        C141133b bVar = (C141133b) fragment;
                        C68225k.m98532d(bVar);
                        this.f383180b = new C141159g(acVar, bVar, ((C74176nj) jN).mo69714ey(), (C46485f) ((C74176nj) jN).f206995g.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f383183e, this.f383182d));
                    } else {
                        String obj = C141159g.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f383183e;
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
                C141107a.m229124a(th, th2);
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
