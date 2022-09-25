package com.google.android.libraries.search.video.lightbox;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.logging.p3046g.C39197c;
import com.google.android.libraries.search.video.p3191a.C41448g;
import com.google.android.libraries.search.video.p3191a.C41451j;
import com.google.android.libraries.search.video.p3191a.C41454m;
import com.google.android.libraries.search.video.p3196f.C41510d;
import com.google.android.libraries.search.video.p3196f.C41511e;
import com.google.android.libraries.search.video.p3196f.C41520n;
import com.google.android.libraries.search.video.p3196f.C41521o;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.android.libraries.search.video.players.C41593x;
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
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60308nu;
import com.google.common.p4552o.C60309nv;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a.C65584b;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.libraries.search.video.lightbox.k */
/* compiled from: PG */
public final class C41532k extends C41524c implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C41539r f108545a;

    /* renamed from: c */
    private Context f108546c;

    /* renamed from: d */
    private final C2393x f108547d = new C2393x(this);

    /* renamed from: e */
    private boolean f108548e;

    @Deprecated
    public C41532k() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo44051b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f108546c == null) {
            this.f108546c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f108546c;
    }

    /* renamed from: f */
    public final C41539r mo17754z() {
        C41539r rVar = this.f108545a;
        if (rVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f108548e) {
            return rVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f108547d;
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
            C41531j.m72607a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C41539r f = mo17754z();
        if (f.f108566j != configuration.orientation) {
            int i = configuration.orientation;
            f.f108566j = i;
            if (i == 2) {
                f.mo44059a();
                C41592w wVar = f.f108565i;
                if (wVar != null) {
                    wVar.mo44091n(true);
                }
            } else if (i == 1) {
                f.mo44060b();
                C41592w wVar2 = f.f108565i;
                if (wVar2 != null) {
                    wVar2.mo44091n(false);
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C41539r f = mo17754z();
            C41520n nVar = f.f108570n;
            View inflate = LayoutInflater.from(nVar.f108505c.getContext()).inflate(R.layout.lightbox, viewGroup, false);
            nVar.f108508f = inflate.findViewById(R.id.loading_indicator);
            nVar.f108510h = (ViewGroup) inflate.findViewById(R.id.video_player);
            nVar.f108511i = (ViewGroup) inflate.findViewById(R.id.video_container);
            nVar.f108513k = (TextView) inflate.findViewById(R.id.video_title);
            nVar.f108515m = (ImageView) inflate.findViewById(R.id.close_button);
            nVar.f108514l = (TextView) inflate.findViewById(R.id.video_attribution);
            nVar.f108516n = (LinearLayout) inflate.findViewById(R.id.lightbox_cta_button);
            nVar.f108517o = (TextView) inflate.findViewById(R.id.lightbox_cta_button_text);
            nVar.f108518p = (ViewGroup) inflate.findViewById(R.id.ad_video_end_overlay_container);
            nVar.f108509g = nVar.f108507e.mo44039a(nVar.f108518p, (C41510d) null);
            nVar.f108509g.mo44036b();
            C28313c a = f.f108561e.f76990a.mo33805a(C28427h.m53115a(132135));
            if ((f.f108559c.f152647a & 256) != 0) {
                C62940bt btVar = C39197c.f103149a;
                C60308nu nuVar = (C60308nu) C60309nv.f163190c.createBuilder();
                C57696b bVar = f.f108559c.f152655i;
                if (bVar == null) {
                    bVar = C57696b.f154137l;
                }
                C60214n nVar2 = bVar.f154142c;
                if (nVar2 == null) {
                    nVar2 = C60214n.f162914g;
                }
                nuVar.copyOnWrite();
                C60309nv nvVar = (C60309nv) nuVar.instance;
                nVar2.getClass();
                nvVar.f163194b = nVar2;
                nvVar.f163193a = 2;
                a.mo33858f(new C28353e(btVar, (C60309nv) nuVar.build()));
            }
            if (f.f108560d.getContext().getResources().getConfiguration().orientation == 1) {
                f.mo44060b();
            } else {
                f.mo44059a();
            }
            f.f108561e.mo33801b(inflate, a);
            ImageView imageView = f.f108570n.f108515m;
            imageView.getClass();
            imageView.setOnClickListener(new C47591co(f.f108564h, "Lightbox Close Button", new C41534m(f)));
            C57194y yVar = f.f108559c.f152648b;
            if (yVar == null) {
                yVar = C57194y.f152692i;
            }
            String str = yVar.f152699f;
            C41520n nVar3 = f.f108570n;
            TextView textView = nVar3.f108513k;
            TextView textView2 = nVar3.f108514l;
            LinearLayout linearLayout = nVar3.f108516n;
            ViewGroup viewGroup2 = nVar3.f108518p;
            if (!str.isEmpty()) {
                C41538q qVar = new C41538q(f);
                textView.getClass();
                textView.setOnClickListener(new C47591co(f.f108564h, "Lightbox Title", qVar));
                textView2.getClass();
                textView2.setOnClickListener(new C47591co(f.f108564h, "Lightbox Video Attribution", qVar));
                linearLayout.getClass();
                linearLayout.setOnClickListener(new C47591co(f.f108564h, "Lightbox CTA Button", qVar));
                viewGroup2.getClass();
                viewGroup2.setOnClickListener(new C47591co(f.f108564h, "Lightbox Replay Button Container", new C41537p(f)));
            }
            C28306ab abVar = f.f108561e;
            ImageView imageView2 = f.f108570n.f108515m;
            imageView2.getClass();
            abVar.mo33802c(imageView2, abVar.f76990a.mo33805a(C28427h.m53115a(132136)));
            C28306ab abVar2 = f.f108561e;
            TextView textView3 = f.f108570n.f108513k;
            textView3.getClass();
            abVar2.mo33802c(textView3, abVar2.f76990a.mo33805a(C28427h.m53115a(132137)));
            C28306ab abVar3 = f.f108561e;
            TextView textView4 = f.f108570n.f108514l;
            textView4.getClass();
            abVar3.mo33802c(textView4, abVar3.f76990a.mo33805a(C28427h.m53115a(132138)));
            C28306ab abVar4 = f.f108561e;
            LinearLayout linearLayout2 = f.f108570n.f108516n;
            linearLayout2.getClass();
            abVar4.mo33802c(linearLayout2, abVar4.f76990a.mo33805a(C28427h.m53115a(156122)));
            C28306ab abVar5 = f.f108561e;
            ViewGroup viewGroup3 = f.f108570n.f108518p;
            viewGroup3.getClass();
            abVar5.mo33802c(viewGroup3, abVar5.f76990a.mo33805a(C28427h.m53115a(157901)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C41531j.m72607a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C41539r f = mo17754z();
            C41592w wVar = f.f108565i;
            if (wVar != null) {
                wVar.mo44088k();
            }
            C41520n nVar = f.f108570n;
            C41592w wVar2 = nVar.f108512j;
            if (wVar2 != null) {
                wVar2.mo44089l(nVar);
            }
            C41511e eVar = nVar.f108509g;
            if (eVar != null) {
                eVar.mo44037c();
            }
            ImageView imageView = f.f108570n.f108515m;
            imageView.getClass();
            C28306ab.m52929e(imageView);
            TextView textView = f.f108570n.f108513k;
            textView.getClass();
            C28306ab.m52929e(textView);
            TextView textView2 = f.f108570n.f108514l;
            textView2.getClass();
            C28306ab.m52929e(textView2);
            LinearLayout linearLayout = f.f108570n.f108516n;
            linearLayout.getClass();
            C28306ab.m52929e(linearLayout);
            ViewGroup viewGroup = f.f108570n.f108518p;
            viewGroup.getClass();
            C28306ab.m52929e(viewGroup);
            C41451j jVar = f.f108568l;
            jVar.f108262a.remove(UUID.fromString(f.f108563g.f178261c));
            c.close();
            return;
        } catch (Throwable th) {
            C41531j.m72607a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f108548e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C41531j.m72607a(th, th);
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
            C41531j.m72607a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            mo17754z().mo44062d(6);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C41531j.m72607a(th, th);
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
            if (!this.f108548e) {
                super.onAttach(context);
                if (this.f108545a == null) {
                    Object jN = mo44050a().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C41532k) {
                        C41532k kVar = (C41532k) fragment;
                        C68225k.m98532d(kVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C65584b bVar = (C65584b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C65584b.f178257d, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(bVar);
                        this.f108545a = new C41539r(kVar, (C41448g) ((C74176nj) jN).f206723at.mo17428b(), bVar, (C41593x) ((C74176nj) jN).f206740bJ.mo17428b(), ((C74176nj) jN).mo69761fs(), new C41521o(((C74176nj) jN).f206889e, ((C74176nj) jN).f206673W, ((C74176nj) jN).f207092s, ((C74176nj) jN).f206741bK), ((C74176nj) jN).mo69758fp(), (C41454m) ((C74176nj) jN).f206673W.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), (C41451j) ((C74176nj) jN).f206730b.f198027a.f199449fI.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f108547d));
                    } else {
                        String obj = C41539r.class.toString();
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
                C41531j.m72607a(th2, th3);
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
