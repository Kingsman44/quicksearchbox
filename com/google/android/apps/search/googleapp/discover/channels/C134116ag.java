package com.google.android.apps.search.googleapp.discover.channels;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.ActionMenuView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2201h.C28430c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46801dp;
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
import com.google.apps.tiktok.media.C47449e;
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
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.ag */
/* compiled from: PG */
public final class C134116ag extends C134170ce implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134121al f365334a;

    /* renamed from: c */
    private Context f365335c;

    /* renamed from: d */
    private final C2393x f365336d = new C2393x(this);

    /* renamed from: e */
    private boolean f365337e;

    @Deprecated
    public C134116ag() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134121al mo17754z() {
        C134121al alVar = this.f365334a;
        if (alVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f365337e) {
            return alVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111569b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f365335c == null) {
            this.f365335c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f365335c;
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
        return this.f365336d;
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
            C134115af.m217575a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C134121al a = mo17754z();
            a.f365346d.mo50429i(a.f365358p);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134115af.m217575a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C134121al a = mo17754z();
            a.f365345c.mo50707a(a.f365347e.mo111577a(a.f365353k), a.f365357o);
            View inflate = layoutInflater.inflate(R.layout.googleapp_discover_channels_header_fragment_layout, viewGroup, false);
            C28306ab abVar = a.f365350h;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(125334)));
            ((TextView) inflate.findViewById(R.id.googleapp_discover_channels_title)).setText(a.f365344b.f141318d);
            Menu d = ((ActionMenuView) inflate.findViewById(R.id.googleapp_discover_channels_overflow_menu)).mo1896d();
            C0167am activity = a.f365348f.getActivity();
            C58838bb.m90866a(activity, "This fragment should only be inflated within ChannelActivityPeer.");
            activity.getMenuInflater().inflate(R.menu.googleapp_discover_channels_back_toolbar_menu, d);
            d.findItem(R.id.googleapp_discover_channels_feedback_menu_item).setOnMenuItemClickListener(new C47579cc(a.f365349g, "FeedbackButtonClicked", new C134120ak(a)));
            if (a.f365356n) {
                inflate.findViewById(R.id.googleapp_discover_channels_search_box_stub).setVisibility(0);
            }
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C134115af.m217575a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f365337e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134115af.m217575a(th, th);
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
            C134115af.m217575a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24720k(bundle);
            C134121al a = mo17754z();
            view.findViewById(R.id.googleapp_discover_channels_follow_button).setOnClickListener(new C47591co(a.f365349g, "FollowButtonClicked", new C28430c(a.f365351i, new C134117ah(a))));
            view.findViewById(R.id.googleapp_discover_channels_unfollow_button).setOnClickListener(new C47591co(a.f365349g, "FollowingButtonClicked", new C28430c(a.f365351i, new C134118ai(a))));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134115af.m217575a(th, th);
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
            if (!this.f365337e) {
                super.onAttach(context);
                if (this.f365334a == null) {
                    Object jN = mo111591d().mo17653jN();
                    Bundle b = ((C74176nj) jN).mo69504b();
                    C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    C53842b bVar = (C53842b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C53842b.f141313k, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                    C68225k.m98532d(bVar);
                    C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                    C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                    C134139ba baVar = (C134139ba) ((C74176nj) jN).f206730b.f198178cs.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C134116ag) {
                        C134116ag agVar = (C134116ag) fragment;
                        C68225k.m98532d(agVar);
                        this.f365334a = new C134121al(bVar, dpVar, eVar, baVar, agVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), ((C74176nj) jN).f206677a.d.mo67739ap(), ((C74176nj) jN).mo69511bG(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45351998").mo50907f(), ((C74176nj) jN).f206730b.f198027a.mo67080jU(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45358074").mo50907f(), (C47449e) ((C74176nj) jN).f207092s.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f365336d));
                    } else {
                        String obj = C134121al.class.toString();
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
                C134115af.m217575a(th2, th3);
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
