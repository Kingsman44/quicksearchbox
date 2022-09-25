package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135531ae;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135538al;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10265a.C135572a;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.account.AccountId;
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
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47767de;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.d */
/* compiled from: PG */
public final class C135741d extends C135756q implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C135748k f369729a;

    /* renamed from: c */
    private Context f369730c;

    /* renamed from: d */
    private final C2393x f369731d = new C2393x(this);

    /* renamed from: e */
    private boolean f369732e;

    @Deprecated
    public C135741d() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C135748k mo17754z() {
        C135748k kVar = this.f369729a;
        if (kVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f369732e) {
            return kVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo112521b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f369730c == null) {
            this.f369730c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f369730c;
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
        return this.f369731d;
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
            C135740c.m220223a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C135748k a = mo17754z();
            a.f369756o.mo50429i(a.f369760s);
            a.f369756o.mo50429i(a.f369761t);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135740c.m220223a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C135748k a = mo17754z();
            C69664n.m101061g(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.googleapp_browser_fragment_firstrun, viewGroup, false);
            a.f369754m.mo33801b(inflate, a.f369755n.mo33805a(C28427h.m53115a(141049)));
            TextView textView = (TextView) inflate.findViewById(R.id.googleapp_browser_firstrun_ok_button);
            a.f369754m.mo33801b(textView, a.f369755n.mo33805a(C28427h.m53115a(141051)));
            textView.setOnClickListener(new C47591co(a.f369751j, "Click FRE OK button", new C135743f(a)));
            View findViewById = inflate.findViewById(R.id.googleapp_browser_firstrun_settings_button);
            a.f369754m.mo33801b(findViewById, a.f369755n.mo33805a(C28427h.m53115a(141052)));
            findViewById.setOnClickListener(new C47591co(a.f369751j, "Click FRE Settings button", new C135744g(a)));
            TextView textView2 = (TextView) inflate.findViewById(R.id.googleapp_browser_firstrun_summary);
            CharSequence text = a.f369745d.requireContext().getText(R.string.googleapp_browser_firstrun_learn_more);
            C69664n.m101060f(text, "fragment.requireContext(…wser_firstrun_learn_more)");
            C135742e eVar = new C135742e(a);
            CharSequence text2 = a.f369745d.requireContext().getText(R.string.googleapp_browser_firstrun_summary);
            C69664n.m101060f(text2, "fragment.requireContext(…browser_firstrun_summary)");
            CharSequence text3 = a.f369745d.requireContext().getText(R.string.googleapp_browser_firstrun_summary_part2);
            C69664n.m101060f(text3, "fragment.requireContext(…r_firstrun_summary_part2)");
            SpannableString spannableString = new SpannableString(text2 + " " + text + " " + text3);
            spannableString.setSpan(new C47767de(a.f369751j, "GAB FRE learn more clicked", eVar), text2.length() + 1, text2.length() + text.length() + 1, 33);
            textView2.setText(spannableString);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            a.f369754m.mo33801b(textView2, a.f369755n.mo33805a(C28427h.m53115a(141050)));
            C69664n.m101060f(inflate, "root");
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C135740c.m220223a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f369732e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C135740c.m220223a(th, th);
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
            C135740c.m220223a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C135748k a = mo17754z();
            C69664n.m101061g(view, "view");
            C135572a aVar = a.f369757p;
            aVar.f369290a.mo83702b(C89849ae.GOOGLE_APP_BROWSER_FIRST_RUN_EXPERIENCE_SHOWN);
            C139787a aVar2 = a.f369758q;
            C139789b bVar = a.f369759r;
            C37215b bVar2 = aVar2.f379927a;
            C37252a c = C37182a.f98097gK.mo40805c(C62722b.OK);
            C139787a.m227254h(c, bVar);
            bVar2.mo19974a(c);
            C71803m.m105043d(a.f369749h, (C69585o) null, (C71424ay) null, new C135746i(a, (C69577g) null), 3);
            C71803m.m105043d(a.f369749h, (C69585o) null, (C71424ay) null, new C135747j(a, (C69577g) null), 3);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C135740c.m220223a(th, th);
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
        C135741d dVar = this;
        dVar.f122869b.mo51381i();
        try {
            if (!dVar.f369732e) {
                super.onAttach(context);
                if (dVar.f369729a == null) {
                    Object jN = mo112526d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C135739b bVar = (C135739b) ((C74176nj) jN).f206730b.f198027a.f199529gj.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C135741d) {
                        C135741d dVar2 = (C135741d) fragment;
                        C68225k.m98532d(dVar2);
                        C135531ae aeVar = (C135531ae) ((C74176nj) jN).f206730b.f198117bk.mo17428b();
                        C135538al bL = ((C74176nj) jN).f206677a.b.mo67301bL();
                        C135755p pVar = (C135755p) ((C74176nj) jN).f206730b.f198027a.f199528gi.mo17428b();
                        C71422aw awVar = (C71422aw) ((C74176nj) jN).f206677a.H.mo17428b();
                        C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                        C47770dh dhVar = (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b();
                        C139866a dz = ((C74176nj) jN).mo69662dz();
                        C139272a dD = ((C74176nj) jN).mo69614dD();
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C28310af afVar = (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b();
                        C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                        C135572a aVar = (C135572a) ((C74176nj) jN).f206657G.mo17428b();
                        C139787a aVar2 = (C139787a) ((C74176nj) jN).f206730b.f198166cg.mo17428b();
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C62921ba baVar = (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C139789b bVar2 = (C139789b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C139789b.f379928d, baVar);
                        C68225k.m98532d(bVar2);
                        C135748k kVar = r4;
                        C135748k kVar2 = new C135748k(accountId, bVar, dVar2, aeVar, bL, pVar, awVar, mVar, dhVar, dz, dD, abVar, afVar, eVar, aVar, aVar2, bVar2);
                        dVar = this;
                        dVar.f369729a = kVar;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(dVar.f122869b, dVar.f369731d));
                    } else {
                        String obj = C135748k.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = dVar.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
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
