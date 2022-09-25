package com.google.android.apps.search.pronunciationlearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.pronunciationlearning.content.C141365f;
import com.google.android.apps.search.pronunciationlearning.content.C141366g;
import com.google.android.apps.search.pronunciationlearning.content.C141376q;
import com.google.android.apps.search.pronunciationlearning.p10629b.C141330c;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141401a;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141404d;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141405e;
import com.google.android.apps.search.pronunciationlearning.p10636e.p10637a.C141407g;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141510c;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141511d;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.inject.p3660e.p3662b.C47260e;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58837ba;
import com.google.common.p4552o.aqe;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.pronunciationlearning.j */
/* compiled from: PG */
public final class C141415j extends C141325ak implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141419n f383858a;

    /* renamed from: c */
    private Context f383859c;

    /* renamed from: d */
    private final C2393x f383860d = new C2393x(this);

    /* renamed from: e */
    private boolean f383861e;

    @Deprecated
    public C141415j() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    static C141415j m229481a(AccountId accountId, String str) {
        C141415j jVar = new C141415j();
        C68324h.m98669f(jVar);
        C47247a.m84047b(jVar, accountId);
        C47243l.m84040b(jVar, str);
        return jVar;
    }

    /* renamed from: b */
    public final C141419n mo17754z() {
        C141419n nVar = this.f383858a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f383861e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47247a mo116354d() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f383859c == null) {
            this.f383859c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f383859c;
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
        return this.f383860d;
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
            C141414i.m229480a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int indexOf;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141419n b = mo17754z();
            String str = b.f383869e.f384127e;
            if (!(str == null || (indexOf = str.indexOf("-")) == -1)) {
                str = str.substring(0, indexOf);
            }
            C46801dp dpVar = b.f383867c;
            C141366g gVar = b.f383866b;
            dpVar.mo50707a(new C46719bc(gVar.f383766a, new C141365f(gVar, str), "PronunciationPracticeContent"), b.f383874j);
            View inflate = layoutInflater.inflate(R.layout.pronunciationlearning_content_fragment, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.pronunciationlearning_start_practice_button);
            String str2 = (String) b.f383869e.f384126d.get("PracticeButtonText");
            str2.getClass();
            textView.setText(str2);
            ((TextView) inflate.findViewById(R.id.pronunciationlearning_content_cancel_button)).setText(b.f383869e.mo116539a());
            TextView textView2 = (TextView) inflate.findViewById(R.id.pronunciationlearning_content_box_title);
            if (b.f383873i.equals(aqe.PRONUNCIATION_GRAMMAR)) {
                textView2.setText(b.f383868d.getResources().getString(R.string.pronunciationlearning_content_box_title_wo_dialect));
            } else {
                String str3 = (String) b.f383869e.f384126d.get("ContextBoxTitle");
                str3.getClass();
                textView2.setText(str3);
            }
            if (C58837ba.m90859h(b.f383870f)) {
                b.mo116420a(inflate);
            } else {
                b.mo116421b(inflate);
                ((EditText) inflate.findViewById(R.id.pronunciationlearning_content_input_box)).setText(b.f383870f);
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C141414i.m229480a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f383861e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141414i.m229480a(th, th);
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
            C141414i.m229480a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C141419n b = mo17754z();
            b.mo116422c();
            if (b.f383873i.equals(aqe.PRONUNCIATION_GRAMMAR) && !b.f383879o) {
                b.f383879o = true;
                C46801dp dpVar = b.f383867c;
                C141401a aVar = b.f383872h;
                C60870cx d = ((C141407g) aVar).f383838a.mo46042d();
                C141404d dVar = C141404d.f383835a;
                dpVar.mo50707a(new C46719bc(((C141407g) aVar).f383840c, new C141405e(C60922j.m93044g(d, C47810es.m84963c(dVar), ((C141407g) aVar).f383839b)), "PronunciationPracticeUsageHistory"), b.f383876l);
            }
            e.close();
            return;
        } catch (Throwable th) {
            C141414i.m229480a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C141419n b = mo17754z();
            int integer = b.f383865a.getResources().getInteger(R.integer.pronunciationlearning_content_input_box_max_length);
            View view = b.f383868d.getView();
            view.getClass();
            ((TextView) view.findViewById(R.id.pronunciationlearning_content_input_count)).setText(String.format(Locale.ROOT, "0 / %d", new Object[]{Integer.valueOf(integer)}));
            View view2 = b.f383868d.getView();
            view2.getClass();
            ((TextView) view2.findViewById(R.id.pronunciationlearning_start_practice_button)).setEnabled(false);
            View view3 = b.f383868d.getView();
            view3.getClass();
            TextView textView = (TextView) view3.findViewById(R.id.pronunciationlearning_content_input_box);
            textView.setOnFocusChangeListener(new C141417l(b));
            textView.addTextChangedListener(new C141418m(b));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141414i.m229480a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C141510c cVar = mo17754z().f383878n;
            if (cVar != null && cVar.f384120e.isShowing()) {
                cVar.f384120e.dismiss();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141414i.m229480a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C141419n b = mo17754z();
            C47393f.m84233d(this, C141376q.C141377a.class, new C141422o(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_start_practice_button), new C141423p(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_content_cancel_button), new C141424q(b));
            a.mo51254d(a.f123128b.findViewById(R.id.pronunciationlearning_content_input_box), new C141425r(b));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141414i.m229480a(th, th);
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

    /* JADX WARNING: type inference failed for: r12v0, types: [com.google.android.apps.search.pronunciationlearning.e.a.a, java.lang.Object] */
    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f383861e) {
                super.onAttach(context);
                if (this.f383858a == null) {
                    Object jN = mo116355f().mo17653jN();
                    Context context2 = (Context) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    C141366g gVar = new C141366g((C46723bg) ((C74176nj) jN).f206677a.ap.mo17428b(), (C42876ab) ((C74176nj) jN).f206730b.f198027a.f199574hb.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.p.mo17428b(), (C141330c) ((C74176nj) jN).f206836d.f205436r.mo17428b());
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141415j) {
                        C141415j jVar = (C141415j) fragment;
                        C68225k.m98532d(jVar);
                        String b = C47260e.m84065b(((C74176nj) jN).mo69504b());
                        C68225k.m98532d(b);
                        this.f383858a = new C141419n(context2, accountId, gVar, dpVar, jVar, (C141330c) ((C74176nj) jN).f206836d.f205436r.mo17428b(), (C141512e) ((C74176nj) jN).f206677a.d.f201639cs.mo17428b(), b, new C141511d(((C74176nj) jN).f206730b.f198663m), ((C74176nj) jN).f206730b.f198027a.mo67003gQ(), ((C74176nj) jN).f206836d.mo68997ae());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f383860d));
                    } else {
                        String obj = C141419n.class.toString();
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
                C141414i.m229480a(th, th2);
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
