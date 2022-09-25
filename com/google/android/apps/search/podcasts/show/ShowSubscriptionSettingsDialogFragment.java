package com.google.android.apps.search.podcasts.show;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141263a;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47754cs;
import com.google.apps.tiktok.tracing.C47770dh;
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
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ShowSubscriptionSettingsDialogFragment extends C141132aq implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: b */
    private C141128am f383105b;

    /* renamed from: c */
    private Context f383106c;

    /* renamed from: d */
    private final C2393x f383107d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f383108e = new C47515ab(this);

    /* renamed from: f */
    private boolean f383109f;

    @Deprecated
    public ShowSubscriptionSettingsDialogFragment() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141128am mo17754z() {
        C141128am amVar = this.f383105b;
        if (amVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383109f) {
            return amVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116161b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383106c == null) {
            this.f383106c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383106c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f383108e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f383107d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f383108e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f383108e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f383108e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f383108e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f383108e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f383108e.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f383108e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f383108e.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C141128am a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            View inflate = layoutInflater.inflate(R.layout.podcasts_show_subscription_settings_dialog_fragment, viewGroup, false);
            C69664n.m101060f(inflate, "inflater.inflate(\n      …hToRoot= */ false\n      )");
            int i2 = C141263a.f383505a;
            Context context = inflate.getContext();
            C69664n.m101060f(context, "rootView.context");
            boolean a2 = C141263a.m229295a(context);
            if (a.f383157a.f382004j) {
                if (a2) {
                    Context context2 = inflate.getContext();
                    C69664n.m101060f(context2, "rootView.context");
                    i = C141264b.m229297a(context2, R.attr.colorOnSurface);
                } else {
                    Context context3 = inflate.getContext();
                    C69664n.m101060f(context3, "rootView.context");
                    i = C141264b.m229297a(context3, R.attr.colorOnSurfaceVariant);
                }
                SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.podcasts_show_auto_download_switch);
                switchCompat.setVisibility(0);
                switchCompat.setEnabled(a2);
                switchCompat.setChecked(a.f383157a.f382008n);
                switchCompat.setTextColor(i);
                switchCompat.setOnCheckedChangeListener(new C47754cs(a.f383159c, new C141124ai(a), "Toggle auto download new episodes for show"));
                inflate.findViewById(R.id.podcasts_show_auto_download_bar).setVisibility(0);
                SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(R.id.podcasts_show_notifications_switch);
                switchCompat2.setVisibility(0);
                switchCompat2.setEnabled(a2);
                switchCompat2.setChecked(a.f383157a.f382009o);
                switchCompat2.setTextColor(i);
                switchCompat2.setOnCheckedChangeListener(new C47754cs(a.f383159c, new C141125aj(a), "Toggle new episode notifications for show"));
                inflate.findViewById(R.id.podcasts_show_notifications_bar).setVisibility(0);
            }
            inflate.findViewById(R.id.podcasts_unsubscribe_button).setOnClickListener(new C47591co(a.f383159c, "Unsubscribe and dismiss show subscription settings dialog.", new C141126ak(a)));
            if (!a2) {
                inflate.findViewById(R.id.podcasts_install_app_bar).setVisibility(0);
                inflate.findViewById(R.id.podcasts_install_app).setVisibility(0);
                TextView textView = (TextView) inflate.findViewById(R.id.podcasts_get_the_app_link_text);
                textView.setVisibility(0);
                textView.setText(R.string.podcasts_install_google_podcasts_accept);
                textView.setOnClickListener(new C47591co(a.f383159c, "open Play Store to download Google Podcasts", new C141127al(textView)));
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f383108e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f383108e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f383108e.mo51376d();
        try {
            super.onDetach();
            this.f383109f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f383108e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f383108e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f383108e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54441a.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f383108e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f383108e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f383108e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f383108e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f383108e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f383108e.mo51381i();
        try {
            this.f54441a.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141123ah.m229130a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f383108e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f383108e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f383108e;
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
        C47515ab abVar = this.f383108e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f383108e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f383108e;
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
        this.f383108e.mo51381i();
        try {
            if (!this.f383109f) {
                super.onAttach(context);
                if (this.f383105b == null) {
                    Object jN = mo116174d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C140646b bVar = (C140646b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C140646b.f381993r, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(bVar);
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof ShowSubscriptionSettingsDialogFragment) {
                        ShowSubscriptionSettingsDialogFragment showSubscriptionSettingsDialogFragment = (ShowSubscriptionSettingsDialogFragment) fragment;
                        C68225k.m98532d(showSubscriptionSettingsDialogFragment);
                        this.f383105b = new C141128am(bVar, showSubscriptionSettingsDialogFragment, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f383108e, this.f383107d));
                    } else {
                        String obj = C141128am.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f383108e;
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
                C141123ah.m229130a(th, th2);
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
