package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0392m;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.p096h.C1951d;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.suggest.C138018aj;
import com.google.android.apps.search.googleapp.search.suggest.C138019ak;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.C46897i;
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
import com.google.apps.tiktok.p3674l.p3679c.C47395h;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p4948ba.p4949a.C64369b;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.Locale;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69072co;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.o */
/* compiled from: PG */
public final class C138613o extends C138599bh implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C138676y f376984a;

    /* renamed from: c */
    private Context f376985c;

    /* renamed from: d */
    private final C2393x f376986d = new C2393x(this);

    /* renamed from: e */
    private final C47515ab f376987e = new C47515ab(this);

    /* renamed from: f */
    private boolean f376988f;

    @Deprecated
    public C138613o() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C138676y mo17754z() {
        C138676y yVar = this.f376984a;
        if (yVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f376988f) {
            return yVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114384b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f376985c == null) {
            this.f376985c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f376985c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f376987e.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f376986d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f376987e.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f376987e.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f376987e.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f376987e.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f376987e.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f376987e.mo51381i();
        try {
            super.onCreate(bundle);
            C138676y a = mo17754z();
            a.f377191j = a.f377186e.mo33916a(a.f377187f);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f376987e.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C0392m mVar;
        String str;
        super.onCreateDialog(bundle);
        C138676y a = mo17754z();
        if (a.f377190i) {
            C138030av avVar = a.f377182a.f375493b;
            if (avVar == null) {
                avVar = C138030av.f375536m;
            }
            String str2 = avVar.f375539b;
            C138034az a2 = C138034az.m224336a(avVar.f375545i);
            if (a2 == null) {
                a2 = C138034az.NONE;
            }
            String name = a2.name();
            C138029au a3 = C138029au.m224331a(avVar.f375541d);
            if (a3 == null) {
                a3 = C138029au.QUERY;
            }
            String name2 = a3.name();
            ArrayList arrayList = new ArrayList();
            for (C64369b name3 : new C62963cj(avVar.f375542e, C138030av.f375535f)) {
                arrayList.add(name3.name());
            }
            C138032ax a4 = C138032ax.m224334a(avVar.f375547k);
            if (a4 == null) {
                a4 = C138032ax.INVALID;
            }
            String format = String.format(Locale.US, "Text: %s\nSource: %s\nType: %s\nSubtypes: %s\nGroup: %s\nScore: %d", new Object[]{str2, name, name2, arrayList, a4.name(), Integer.valueOf(avVar.f375546j)});
            C44581b a5 = a.f377189h.mo110993a(a.f377183b, Optional.empty());
            a5.f1347a.f1326g = format;
            a5.mo47602u(a.f377183b.getString(17039370), C138619u.f376998a);
            return a5.create();
        }
        C138019ak akVar = a.f377182a;
        int a6 = C138018aj.m224328a(akVar.f375494c);
        if (a6 == 0) {
            a6 = 1;
        }
        int i = a6 - 1;
        if (i != 0) {
            String str3 = "Report Feedback Clicked";
            int i2 = 108190;
            int i3 = 2132150228;
            if (i == 1) {
                boolean z = akVar.f375497f;
                if (!z) {
                    i3 = R.style.SuggestAlertDialogTheme;
                }
                C44581b a7 = a.f377189h.mo110993a(a.f377183b, Optional.m71637of(Integer.valueOf(i3)));
                a7.f1347a.f1326g = a.f377182a.f375495d;
                a7.mo47602u(a.f377183b.getString(17039370), new C47752cq(a.f377185d, "OK Clicked", new C138616r(a)));
                if (z) {
                    str = a.f377183b.getString(R.string.ga_report_this);
                } else {
                    str = a.f377183b.getString(R.string.ga_common_learn_more);
                }
                C47770dh dhVar = a.f377185d;
                C138617s sVar = new C138617s(a, z);
                if (true != z) {
                    str3 = "Learn More Clicked";
                }
                a7.mo47599r(str, new C47752cq(dhVar, str3, sVar));
                if (z) {
                    a7.mo47607z(a.mo114462a());
                }
                C0392m create = a7.create();
                if (true != z) {
                    i2 = 108189;
                }
                a.mo114463b(create, 108188, 108187, i2);
                return create;
            } else if (i != 2) {
                C44581b a8 = a.f377189h.mo110993a(a.f377183b, Optional.m71637of(Integer.valueOf(R.style.SuggestAlertDialogTheme)));
                C138019ak akVar2 = a.f377182a;
                if ((akVar2.f375492a & 32) != 0) {
                    a8.mo47604w(akVar2.f375498g);
                }
                C138019ak akVar3 = a.f377182a;
                if ((4 & akVar3.f375492a) != 0) {
                    a8.f1347a.f1326g = akVar3.f375495d;
                }
                C138030av avVar2 = akVar3.f375493b;
                if (avVar2 == null) {
                    avVar2 = C138030av.f375536m;
                }
                C138029au a9 = C138029au.m224331a(avVar2.f375541d);
                if (a9 == null) {
                    a9 = C138029au.QUERY;
                }
                if (a9 == C138029au.ACCESS_NOW_PROMO) {
                    C47400m mVar2 = a.f377184c;
                    C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
                    C139779t tVar = C139779t.HOME_SCREEN;
                    fVar.copyOnWrite();
                    C139767h hVar = (C139767h) fVar.instance;
                    hVar.f379872b = tVar.f379907i;
                    hVar.f379871a |= 1;
                    fVar.copyOnWrite();
                    C139767h hVar2 = (C139767h) fVar.instance;
                    hVar2.f379871a |= 2;
                    hVar2.f379873c = true;
                    a8.mo47601t(R.string.googleapp_see_updates, new C47395h(mVar2, new C139760a((C139767h) fVar.build())));
                }
                return a8.create();
            } else {
                boolean z2 = akVar.f375497f;
                if (!z2) {
                    i3 = R.style.SuggestAlertDialogTheme;
                }
                C44581b a10 = a.f377189h.mo110993a(a.f377183b, Optional.m71637of(Integer.valueOf(i3)));
                a10.f1347a.f1326g = a.f377182a.f375495d;
                a10.mo47602u(a.f377183b.getString(17039370), new C47752cq(a.f377185d, "OK Clicked", new C138614p(a)));
                if (z2) {
                    a10.mo47599r(a.f377183b.getString(R.string.ga_report_this), new C47752cq(a.f377185d, str3, new C138615q(a)));
                }
                mVar = a10.create();
                a.mo114463b(mVar, 108186, 108187, 108190);
            }
        } else {
            C44581b a11 = a.f377189h.mo110993a(a.f377183b, Optional.m71637of(2132150227));
            a11.mo47604w(a.f377182a.f375498g);
            a11.f1347a.f1326g = C1951d.m5280a(a.f377182a.f375495d, 0);
            a11.mo47602u(a.f377183b.getString(R.string.ga_suggestion_history_deletion_delete_button), new C47752cq(a.f377185d, "Deletion Clicked", new C138674w(a)));
            a11.mo47599r(a.f377183b.getString(R.string.ga_suggestion_history_deletion_cancel_button), new C47752cq(a.f377185d, "Deletion Cancel Clicked", new C138675x(a)));
            a11.mo47607z(a.mo114462a());
            mVar = a11.create();
            a.mo114463b(mVar, 108184, 108185, 108183);
        }
        return mVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f376987e.mo51381i();
        try {
            View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            C47831fm.m85019n();
            return onCreateView;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f376987e.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f376987e.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f376987e.mo51376d();
        try {
            super.onDetach();
            this.f376988f = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f376987e.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f376987e.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f376987e.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean O = this.f54440b.mo24732O();
            if (a != null) {
                a.close();
            }
            return O;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f376987e.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f376987e.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f376987e.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f376987e.mo51381i();
        try {
            super.onStart();
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f376987e.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f376987e.mo51381i();
        try {
            this.f54440b.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C138612n.m225081a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f376987e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f376987e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f376987e;
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
        C47515ab abVar = this.f376987e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f376987e;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f376987e;
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
        this.f376987e.mo51381i();
        try {
            if (!this.f376988f) {
                super.onAttach(context);
                if (this.f376984a == null) {
                    Object jN = mo114385d().mo17653jN();
                    C47400m mVar = (C47400m) ((C74176nj) jN).f206730b.f198027a.f199472ff.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C138613o) {
                        C138613o oVar = (C138613o) fragment;
                        C68225k.m98532d(oVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C138019ak akVar = (C138019ak) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C138019ak.f375490i, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(akVar);
                        this.f376984a = new C138676y(mVar, oVar, (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b(), akVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), ((C74176nj) jN).f206677a.d.mo67738ao(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).mo69694ee(), ((C46897i) new C69072co(((C74176nj) jN).f206730b.f198027a.f199228b.f198009I).f185290a.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45360415").mo50907f());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f376987e, this.f376986d));
                    } else {
                        String obj = C138676y.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f376987e;
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
                C138612n.m225081a(th, th2);
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
