package com.google.android.apps.search.googleapp.compliance;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23930h;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23938p;
import com.google.android.libraries.p1969j.p1970a.p1971a.p1972a.C23939q;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.android.libraries.search.location.p3029a.C38590aj;
import com.google.android.libraries.search.location.p3029a.C38591ak;
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
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.compliance.c */
/* compiled from: PG */
public final class C133622c extends C133621bf implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C133644k f364006a;

    /* renamed from: b */
    private Context f364007b;

    /* renamed from: c */
    private final C2393x f364008c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f364009d = new C47515ab(this);

    /* renamed from: e */
    private boolean f364010e;

    @Deprecated
    public C133622c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133644k mo17754z() {
        C133644k kVar = this.f364006a;
        if (kVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f364010e) {
            return kVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111298b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f364007b == null) {
            this.f364007b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f364007b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f364009d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f364008c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f364009d.mo51380h(eyVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: jO */
    public final void mo29334jO() {
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f364009d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f364009d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f364009d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C47573bx f = this.f364009d.mo51378f("DialogFragment:onCancel");
        try {
            C133644k a = mo17754z();
            a.mo111314f(C38590aj.CONSENT_REASON_DISMISSED);
            C0167am activity = a.f364044a.getActivity();
            activity.getClass();
            activity.finish();
            f.close();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f364009d.mo51381i();
        try {
            super.onCreate(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f364009d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f364009d.mo51381i();
        try {
            C133644k a = mo17754z();
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C133622c cVar = a.f364044a;
            Dialog dialog = cVar.getDialog();
            if (dialog != null) {
                dialog.setOnShowListener(new C28458c(cVar, new C133638e(a, cVar)));
            }
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f364009d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f364009d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f364009d.mo51376d();
        try {
            super.onDetach();
            this.f364010e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f364009d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f364009d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f364009d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f364009d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f364009d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f364009d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f364009d.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f364009d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f364009d.mo51381i();
        try {
            C133644k a = mo17754z();
            super.onViewCreated(view, bundle);
            C23939q e = a.mo111313e();
            e.mo29352h(C23938p.CONSENT_DATA_LOADING);
            String string = a.f364044a.getString(R.string.googleapp_compliance_location_consent_accept_option1);
            String string2 = a.f364044a.getString(R.string.googleapp_compliance_location_consent_decline_option1);
            String string3 = a.f364044a.getString(R.string.googleapp_compliance_location_consent_temporary_allow, Long.valueOf(C38591ak.f102016a.toMinutes()));
            e.f65456d.setText(Spannable.Factory.getInstance().newSpannable(a.f364044a.getString(R.string.googleapp_compliance_location_consent_title_option2)));
            C58485gu n = C58485gu.m89846n(Spannable.Factory.getInstance().newSpannable(a.f364044a.getString(R.string.googleapp_compliance_location_consent_description_option5)));
            e.mo29346b(n, ((C58724pq) n).f156474d - 1);
            e.mo29349e(string2);
            e.mo29348d(new C133640g(a));
            e.mo29351g(string);
            e.mo29350f(new C133641h(a));
            e.mo29355k(3);
            e.f65460h.setText(string3);
            e.f65459g.setText(string3);
            C133642i iVar = new C133642i(a);
            e.f65460h.setOnClickListener(new C23930h(e, iVar));
            e.f65459g.setOnClickListener(new C23930h(e, iVar));
            e.f65467o = new C133643j(a);
            e.f65454b.setVisibility(8);
            e.f65455c.setVisibility(8);
            BottomSheetBehavior.m78767C((View) a.mo111313e().getParent()).mo47519v(3);
            e.mo29352h(C23938p.WAITING_FOR_USER_DECISION);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133602b.m216824a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f364009d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f364009d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f364009d;
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
        C47515ab abVar = this.f364009d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f364009d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f364009d;
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
        this.f364009d.mo51381i();
        try {
            if (!this.f364010e) {
                super.onAttach(context);
                if (this.f364006a == null) {
                    Object jN = mo111299f().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C133622c) {
                        C133622c cVar = (C133622c) fragment;
                        C68225k.m98532d(cVar);
                        C133644k kVar = new C133644k(context2, cVar, (C38586af) ((C74176nj) jN).f206730b.f198007G.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (HelpAndFeedbackStarter) ((C74176nj) jN).f207099z.mo17428b());
                        this.f364006a = kVar;
                        kVar.f364053i = this;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f364009d, this.f364008c));
                    } else {
                        String obj = C133644k.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f364009d;
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
                C133602b.m216824a(th, th2);
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
