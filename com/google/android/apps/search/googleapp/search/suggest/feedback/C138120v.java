package com.google.android.apps.search.googleapp.search.suggest.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.p8867w.p8879i.C118802c;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.gms.feedback.C144206k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47591co;
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
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.feedback.v */
/* compiled from: PG */
public final class C138120v extends C138099ap implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138093ak f375796a;

    /* renamed from: c */
    private Context f375797c;

    /* renamed from: d */
    private final C2393x f375798d = new C2393x(this);

    /* renamed from: e */
    private boolean f375799e;

    @Deprecated
    public C138120v() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C138093ak mo17754z() {
        C138093ak akVar = this.f375796a;
        if (akVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f375799e) {
            return akVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114148b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f375797c == null) {
            this.f375797c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f375797c;
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
        return this.f375798d;
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
            C138119u.m224478a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C138093ak a = mo17754z();
            a.f375716g.mo50429i(a.f375719j);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138119u.m224478a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C138093ak a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_suggest_feedback, viewGroup, false);
            ((ScrollView) inflate.findViewById(R.id.googleapp_suggest_feedback_scrollview)).setOnTouchListener(new C138092aj(a, (EditText) inflate.findViewById(R.id.googleapp_additional_comment_box), (EditText) inflate.findViewById(R.id.googleapp_other_option_edit)));
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.googleapp_suggest_feedback_toolbar);
            toolbar.mo2419t(new C47591co(a.f375717h, "Feedback back button pressed", new C138090ah(inflate)));
            toolbar.mo2404n(R.menu.googleapp_menu_send);
            MenuItem findItem = toolbar.mo2393g().findItem(R.id.googleapp_menu_send);
            findItem.setOnMenuItemClickListener(new C47579cc(a.f375717h, "Suggestion feedback send button clicked", new C138091ai(a, findItem)));
            ((TextView) inflate.findViewById(R.id.googleapp_suggestion_text)).setText(inflate.getResources().getString(R.string.ga_display_suggestion_text, new Object[]{a.f375712c.f375539b}));
            ((RadioButton) inflate.findViewById(R.id.googleapp_option1)).setOnClickListener(new C138121w(a));
            ((RadioButton) inflate.findViewById(R.id.googleapp_option2)).setOnClickListener(new C138084ab(a));
            ((RadioButton) inflate.findViewById(R.id.googleapp_option3)).setOnClickListener(new C138085ac(a));
            ((RadioButton) inflate.findViewById(R.id.googleapp_option4)).setOnClickListener(new C138086ad(a));
            ((RadioButton) inflate.findViewById(R.id.googleapp_option5)).setOnClickListener(new C138087ae(a));
            ((RadioButton) inflate.findViewById(R.id.googleapp_option6)).setOnClickListener(new C138088af(a));
            ((RadioButton) inflate.findViewById(R.id.googleapp_option_other)).setOnClickListener(new C138089ag(a));
            ((EditText) inflate.findViewById(R.id.googleapp_other_option_edit)).addTextChangedListener(new C138095al(a));
            TextView textView = (TextView) inflate.findViewById(R.id.googleapp_description);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C2043bi.m5514H(textView);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C138119u.m224478a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f375799e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138119u.m224478a(th, th);
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
            C138119u.m224478a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            int i = mo17754z().f375718i;
            if (i != 0) {
                bundle.putInt("SAVED_RADIO_BUTTON", i);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138119u.m224478a(th, th);
        }
        throw th;
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        C138093ak a = mo17754z();
        if (bundle != null && bundle.getInt("SAVED_RADIO_BUTTON") != 0) {
            a.mo114141f(bundle.getInt("SAVED_RADIO_BUTTON"));
            a.mo114143h();
        }
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
            if (!this.f375799e) {
                super.onAttach(context);
                if (this.f375796a == null) {
                    Object jN = mo114149d().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C138120v) {
                        C138120v vVar = (C138120v) fragment;
                        C68225k.m98532d(vVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C138098ao aoVar = (C138098ao) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C138098ao.f375725f, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(aoVar);
                        this.f375796a = new C138093ak(context2, vVar, aoVar, new C138109k((AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), (C46175b) ((C74176nj) jN).f206730b.f198398h.mo17428b(), (C137396a) ((C74176nj) jN).f206677a.c.f201191aY.mo17428b(), (C118802c) ((C74176nj) jN).f206677a.c.mo67621X(), ((C74176nj) jN).f206730b.mo66109cB(), (Context) ((C74176nj) jN).f206677a.g.mo17428b(), (C144206k) ((C74176nj) jN).f206677a.lg.mo17428b(), (C71422aw) ((C74176nj) jN).f206677a.H.mo17428b(), (C69585o) ((C74176nj) jN).f206677a.G.mo17428b()), (C46439e) ((C74176nj) jN).f206942f.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b(), ((C74176nj) jN).mo69694ee());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f375798d));
                    } else {
                        String obj = C138093ak.class.toString();
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
            Throwable th2 = th;
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C138119u.m224478a(th2, th3);
            }
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
