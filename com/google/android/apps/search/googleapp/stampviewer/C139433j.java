package com.google.android.apps.search.googleapp.stampviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139353i;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139357m;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139382a;
import com.google.android.apps.search.googleapp.stampviewer.p10495g.C139397a;
import com.google.android.apps.search.googleapp.stampviewer.p10495g.C139411o;
import com.google.android.apps.search.googleapp.stampviewer.p10495g.C139413p;
import com.google.android.apps.search.googleapp.stampviewer.p10499j.C139434a;
import com.google.android.apps.search.googleapp.stampviewer.preview.C139468l;
import com.google.android.apps.search.googleapp.stampviewer.preview.C139483z;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139491b;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139492c;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139495f;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139499j;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139500k;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139502m;
import com.google.android.apps.search.googleapp.stampviewer.viewpager.C139503n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.logging.p3046g.C39195a;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47704d;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47706f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4552o.C59748ee;
import com.google.common.p4552o.C59749ef;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4242bp.p4253e.p4254a.C56194n;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.j */
/* compiled from: PG */
public final class C139433j extends C139486s implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139439m f379133a;

    /* renamed from: c */
    private Context f379134c;

    /* renamed from: d */
    private final C2393x f379135d = new C2393x(this);

    /* renamed from: e */
    private boolean f379136e;

    @Deprecated
    public C139433j() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C139433j m226574a(AccountId accountId, C139324f fVar) {
        C139433j jVar = new C139433j();
        C68324h.m98669f(jVar);
        C47247a.m84047b(jVar, accountId);
        C47243l.m84039a(jVar, fVar);
        return jVar;
    }

    /* renamed from: b */
    public final C139439m mo17754z() {
        C139439m mVar = this.f379133a;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379136e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47222f mo114960d() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379134c == null) {
            this.f379134c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379134c;
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
        return this.f379135d;
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
            C139417i.m226554a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139439m b = mo17754z();
            if (b.f379148b.f378928b.size() == 1 && ((C56610b) b.f379148b.f378928b.get(0)).f151151j && bundle == null && b.f379148b.f378934h) {
                b.f379161o.mo19974a(C37182a.f97945dR);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139417i.m226554a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        C139483z zVar;
        C139491b bVar;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139439m b = mo17754z();
            b.mo114964a(bundle);
            View inflate = layoutInflater.inflate(R.layout.googleapp_stamp_viewer_fragment, viewGroup, false);
            C28313c a = b.f379152f.f76990a.mo33805a(C28427h.m53115a(92624));
            if ((b.f379148b.f378927a & 2) != 0) {
                C62940bt btVar = C39195a.f103147a;
                C59748ee eeVar = (C59748ee) C59749ef.f161436c.createBuilder();
                C60214n nVar = b.f379148b.f378930d;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                eeVar.copyOnWrite();
                C59749ef efVar = (C59749ef) eeVar.instance;
                nVar.getClass();
                efVar.f161440b = nVar;
                efVar.f161439a |= 1;
                a.mo33858f(new C28353e(btVar, (C59749ef) eeVar.build()));
            }
            b.f379152f.mo33801b(inflate, a);
            ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.googleapp_stamp_viewer_view_pager);
            C139492c cVar = b.f379154h;
            FragmentManager childFragmentManager = b.f379149c.getChildFragmentManager();
            C139317ac acVar = b.f379150d;
            int i = b.f379164r;
            C139326h hVar = b.f379148b.f378933g;
            if (hVar == null) {
                hVar = C139326h.f378938c;
            }
            boolean z = hVar.f378941b;
            C139324f fVar = b.f379148b;
            boolean z2 = fVar.f378934h;
            AccountId accountId = b.f379147a;
            boolean z3 = fVar.f378935i;
            C139343y a2 = C139343y.m226483a(fVar.f378936j);
            if (a2 == null) {
                a2 = C139343y.VIEWER_MODE_UNSPECIFIED;
            }
            C139343y yVar = a2;
            C139434a aVar = (C139434a) cVar.f379290a.mo17428b();
            aVar.getClass();
            Long l = (Long) cVar.f379291b.mo17428b();
            l.getClass();
            long longValue = l.longValue();
            Boolean bool = (Boolean) cVar.f379292c.mo17428b();
            bool.getClass();
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) cVar.f379293d.mo17428b();
            bool2.getClass();
            boolean booleanValue2 = bool2.booleanValue();
            childFragmentManager.getClass();
            accountId.getClass();
            yVar.getClass();
            C139491b bVar2 = r8;
            C139491b bVar3 = new C139491b(aVar, longValue, booleanValue, booleanValue2, childFragmentManager, acVar, i, z, z2, accountId, z3, yVar);
            b.f379162p = bVar2;
            viewPager.mo9171w();
            viewPager.mo9172x(new C139495f());
            C47707g gVar = b.f379151e;
            C139491b bVar4 = b.f379162p;
            bVar4.getClass();
            viewPager.mo9146k(new C47704d(gVar, bVar4));
            C139317ac acVar2 = b.f379150d;
            C139491b bVar5 = b.f379162p;
            bVar5.getClass();
            acVar2.f378903b.add(bVar5);
            C47707g gVar2 = b.f379151e;
            C139491b bVar6 = b.f379162p;
            bVar6.getClass();
            viewPager.mo9137f(new C47706f(gVar2, bVar6, "StampViewerFragmentPeer StampViewerViewPagerAdapter"));
            C139413p pVar = b.f379167u;
            C139317ac acVar3 = b.f379150d;
            int a3 = C56194n.m87920a(b.f379148b.f378932f);
            int i2 = a3 == 0 ? 1 : a3;
            C139326h hVar2 = b.f379148b.f378933g;
            if (hVar2 == null) {
                hVar2 = C139326h.f378938c;
            }
            C139326h hVar3 = hVar2;
            hVar3.getClass();
            C39141kp kpVar = (C39141kp) pVar.f379087a.mo17428b();
            kpVar.getClass();
            C46801dp dpVar = (C46801dp) pVar.f379088b.mo17428b();
            dpVar.getClass();
            C139397a aVar2 = (C139397a) pVar.f379089c.mo17428b();
            aVar2.getClass();
            C37215b bVar7 = (C37215b) pVar.f379090d.mo17428b();
            bVar7.getClass();
            Long l2 = (Long) pVar.f379091e.mo17428b();
            l2.getClass();
            long longValue2 = l2.longValue();
            C139411o oVar = r6;
            C139411o oVar2 = new C139411o(acVar3, i2, hVar3, kpVar, dpVar, aVar2, bVar7, longValue2);
            viewPager.mo9137f(new C47706f(b.f379151e, oVar, "StampViewerFragmentPeer RecommendationsListener"));
            oVar.mo114948b(b.f379164r);
            C139500k kVar = b.f379158l;
            int i3 = b.f379164r;
            C139491b bVar8 = b.f379162p;
            bVar8.getClass();
            C28443m mVar = (C28443m) kVar.f379304a.mo17428b();
            mVar.getClass();
            b.f379159m = new C139499j(mVar, i3, bVar8);
            viewPager.mo9137f(new C47706f(b.f379151e, b.f379159m, "SwipeLoggingListener"));
            viewPager.mo9148m(b.f379164r, false);
            if (b.f379156j) {
                C139503n nVar2 = b.f379157k;
                C139317ac acVar4 = b.f379150d;
                C139382a aVar3 = (C139382a) nVar2.f379309a.mo17428b();
                aVar3.getClass();
                C139502m mVar2 = new C139502m(aVar3, acVar4);
                mVar2.mo115012b(b.f379164r);
                viewPager.mo9137f(new C47706f(b.f379151e, mVar2, "ViewpagerFootprintsLogger"));
            }
            Fragment a4 = C139468l.m226674a(b.f379149c);
            if (a4 != null) {
                b.f379165s = (C139483z) new C2368bp(a4).mo5770a(C139483z.class);
            }
            C139483z zVar2 = b.f379165s;
            if (zVar2 != null) {
                b.f379166t = zVar2.f379265d.mo61654n(new C139438l(b));
                if (b.f379165s.f379264c.equals(C139343y.VIEWER_MODE_FULLSCREEN) && (bVar = b.f379162p) != null) {
                    bVar.f379276d = C139343y.VIEWER_MODE_FULLSCREEN;
                }
            }
            C139343y a5 = C139343y.m226483a(b.f379148b.f378936j);
            if (a5 == null) {
                a5 = C139343y.VIEWER_MODE_UNSPECIFIED;
            }
            if (a5.equals(C139343y.VIEWER_MODE_INLINE) || ((zVar = b.f379165s) != null && zVar.f379264c.equals(C139343y.VIEWER_MODE_INLINE))) {
                C139439m.m226587c("W,3:4.01", (ConstraintLayout) inflate);
            }
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th2) {
            C139417i.m226554a(th, th2);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C139439m b = mo17754z();
            b.f379150d.f378903b.clear();
            C69803b bVar = b.f379166t;
            if (bVar != null) {
                C69828d.m101309f((AtomicReference) bVar);
                b.f379166t = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C139417i.m226554a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379136e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139417i.m226554a(th, th);
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
            C139417i.m226554a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C139439m b = mo17754z();
            View view = b.f379149c.getView();
            if (view != null) {
                bundle.putInt("stampViewerCurrentPosition", ((ViewPager) view.findViewById(R.id.googleapp_stamp_viewer_view_pager)).mo9122a());
                ProtoParsers.m95533p(bundle, "stampViewerAmpWebViewParamsList", new ArrayList(b.f379150d.mo114892c()));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139417i.m226554a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C139439m b = mo17754z();
            C47393f.m84233d(this, C139357m.class, new C139440n(b));
            C47393f.m84233d(this, C139353i.class, new C139441o(b));
            C47393f.m84233d(this, C32214c.class, new C139442p(b));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139417i.m226554a(th, th);
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
            if (!this.f379136e) {
                super.onAttach(context);
                if (this.f379133a == null) {
                    this.f379133a = ((C139484q) mo115005f().mo17653jN()).mo115003dF();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379135d));
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
                C139417i.m226554a(th, th2);
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
