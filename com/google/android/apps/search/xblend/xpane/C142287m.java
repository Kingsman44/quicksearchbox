package com.google.android.apps.search.xblend.xpane;

import android.net.Uri;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c.C40510a;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c.C40511b;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c.C40512c;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c.C40513d;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c.C40514e;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40537f;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40538g;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3637b.C46716g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57798ab;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57813j;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57817n;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57819p;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57821r;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57827x;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.xblend.xpane.m */
/* compiled from: PG */
public final class C142287m implements C40538g {

    /* renamed from: a */
    public static final C59071e f386014a = C59071e.m91331h();

    /* renamed from: b */
    public final C142286l f386015b;

    /* renamed from: c */
    public final AccountId f386016c;

    /* renamed from: d */
    public final C142283i f386017d;

    /* renamed from: e */
    public final C40480q f386018e;

    /* renamed from: f */
    public final C40364q f386019f;

    /* renamed from: g */
    public C56943g f386020g;

    /* renamed from: h */
    public C28439i f386021h;

    /* renamed from: i */
    private final Optional f386022i;

    /* renamed from: j */
    private final C46801dp f386023j;

    /* renamed from: k */
    private final C40514e f386024k;

    /* renamed from: l */
    private final C28310af f386025l;

    /* renamed from: m */
    private final C28306ab f386026m;

    /* renamed from: n */
    private final C40358k f386027n;

    /* renamed from: o */
    private final C57695ab f386028o;

    /* renamed from: p */
    private final C40358k f386029p;

    /* renamed from: q */
    private final C28423g f386030q;

    public C142287m(C142286l lVar, AccountId accountId, C142283i iVar, Optional optional, C46801dp dpVar, C40480q qVar, C40514e eVar, C40364q qVar2, C28310af afVar, C28306ab abVar, C40358k kVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(optional, "authTokenProviderOptional");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(qVar, "tracer");
        C69664n.m101061g(qVar2, "logMetadataFactory");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "visualElementsView");
        C69664n.m101061g(kVar, "applicationLevelCounters");
        this.f386015b = lVar;
        this.f386016c = accountId;
        this.f386017d = iVar;
        this.f386022i = optional;
        this.f386023j = dpVar;
        this.f386018e = qVar;
        this.f386024k = eVar;
        this.f386019f = qVar2;
        this.f386025l = afVar;
        this.f386026m = abVar;
        this.f386027n = kVar;
        C57695ab abVar2 = C57695ab.XBLEND_ANDROID;
        this.f386028o = abVar2;
        this.f386029p = kVar.mo42414a(abVar2);
        this.f386030q = C45954d.m82060a(accountId);
    }

    /* renamed from: o */
    static /* synthetic */ void m231034o(C142287m mVar) {
        String string = mVar.f386017d.getString(R.string.xblend_xpane_fragment_generic_error_message);
        C69664n.m101060f(string, "fragment.getString(R.str…nt_generic_error_message)");
        mVar.mo117118l(string);
    }

    /* renamed from: p */
    private final ProgressBar m231035p() {
        return (ProgressBar) this.f386017d.requireView().findViewById(R.id.xblend_xpane_fragment_loading_indicator);
    }

    /* renamed from: q */
    private final C40537f m231036q() {
        Fragment c = this.f386017d.getChildFragmentManager().f634a.mo671c("XBlendFragment");
        if (c instanceof C40537f) {
            return (C40537f) c;
        }
        return null;
    }

    /* renamed from: a */
    public final View mo117112a() {
        View findViewById = this.f386017d.requireActivity().findViewById(16908290);
        C69664n.m101060f(findViewById, "fragment.requireActivity…yId(android.R.id.content)");
        return findViewById;
    }

    /* renamed from: b */
    public final View mo117113b() {
        C40537f q = m231036q();
        if (q != null) {
            return q.requireView();
        }
        return null;
    }

    /* renamed from: c */
    public final TextView mo117114c() {
        return (TextView) this.f386017d.requireView().findViewById(R.id.xblend_xpane_fragment_error_message);
    }

    /* renamed from: d */
    public final SwipeRefreshLayout mo117115d() {
        return (SwipeRefreshLayout) this.f386017d.requireView().findViewById(R.id.xblend_xpane_fragment_swipe_refresh);
    }

    /* renamed from: e */
    public final C46689ag mo42316e() {
        C40514e eVar = this.f386024k;
        return new C46719bc(eVar.f106308d, new C40513d(eVar), C40514e.f106305a);
    }

    /* renamed from: f */
    public final C57695ab mo42317f() {
        return this.f386028o;
    }

    /* renamed from: g */
    public final /* synthetic */ Optional mo42318g() {
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        return empty;
    }

    /* renamed from: h */
    public final Optional mo42319h() {
        Optional ofNullable = Optional.ofNullable(this.f386021h);
        C69664n.m101060f(ofNullable, "ofNullable(rootClientVisualElement)");
        return ofNullable;
    }

    /* renamed from: i */
    public final void mo117116i(C56943g gVar, boolean z) {
        C40510a aVar;
        String str = gVar.f151985b;
        C69664n.m101060f(str, "xBlendAddress.path");
        if (str.length() != 0 && m231036q() != null) {
            C46801dp dpVar = this.f386023j;
            C40514e eVar = this.f386024k;
            Locale locale = this.f386017d.getResources().getConfiguration().getLocales().get(0);
            C69664n.m101060f(locale, "{\n        configuration.locales[0]\n      }");
            Optional optional = this.f386022i;
            Map unmodifiableMap = Collections.unmodifiableMap(this.f386015b.f386013d);
            C69664n.m101060f(unmodifiableMap, "params.queryParametersMap");
            C69664n.m101061g(gVar, "xBlendAddress");
            C69664n.m101061g(locale, "locale");
            C69664n.m101061g(optional, "authTokenProviderOptional");
            C69664n.m101061g(unmodifiableMap, "queryParams");
            synchronized (eVar.f106310f) {
                C40510a aVar2 = eVar.f106311g;
                eVar.f106311g = new C40510a(gVar, locale, unmodifiableMap);
                if (!C69664n.m101066l(eVar.f106311g, aVar2) || z) {
                    eVar.mo42483b(eVar.f106311g, (C57827x) null);
                }
                aVar = eVar.f106311g;
            }
            C71422aw awVar = eVar.f106306b;
            C40511b bVar = new C40511b(eVar, aVar, gVar, locale, optional, unmodifiableMap, (C69577g) null);
            C40512c cVar = new C40512c(eVar, aVar, (C69577g) null);
            C46690ah ahVar = C40514e.f106305a;
            C69664n.m101060f(ahVar, "XBLEND_DATA_SOURCE_KEY");
            dpVar.mo50707a(C46716g.m83256a(awVar, bVar, cVar, ahVar), new C46792di() {
                /* renamed from: a */
                public final void mo18077a(Throwable th) {
                    C69664n.m101061g(th, C42181t.f110467a);
                    C142287m.this.mo117117j();
                    SwipeRefreshLayout d = C142287m.this.mo117115d();
                    if (d != null) {
                        d.mo8794l(false, false);
                    }
                    C59052c cVar = (C59052c) ((C59052c) C142287m.f386014a.mo56226d()).mo56382g(th);
                    cVar.mo56378ag(C40364q.f106014a, C142287m.this.f386019f.mo42422a());
                    cVar.mo56379ah(new C59094n(42049));
                    cVar.mo56386p("Error fetching remote content");
                    C142287m.m231034o(C142287m.this);
                }

                /* renamed from: b */
                public final /* synthetic */ void mo18078b(Object obj) {
                    C57798ab abVar;
                    C57798ab abVar2;
                    String str;
                    C57827x xVar = (C57827x) obj;
                    C69664n.m101061g(xVar, "response");
                    C142287m.this.mo117117j();
                    if (xVar.f154502b == 2) {
                        abVar = (C57798ab) xVar.f154503c;
                    } else {
                        abVar = C57798ab.f154412c;
                    }
                    int i = 1;
                    if ((abVar.f154414a & 1) != 0) {
                        if (xVar.f154502b == 2) {
                            abVar2 = (C57798ab) xVar.f154503c;
                        } else {
                            abVar2 = C57798ab.f154412c;
                        }
                        C57784p pVar = abVar2.f154415b;
                        if (pVar == null) {
                            pVar = C57784p.f154382f;
                        }
                        if ((pVar.f154384a & 1) != 0) {
                            if ((xVar.f154501a & 1) != 0) {
                                C57813j jVar = xVar.f154504d;
                                if (jVar == null) {
                                    jVar = C57813j.f154466e;
                                }
                                if ((jVar.f154468a & 16) != 0) {
                                    C57813j jVar2 = xVar.f154504d;
                                    if (jVar2 == null) {
                                        jVar2 = C57813j.f154466e;
                                    }
                                    C57821r rVar = jVar2.f154470c;
                                    if (rVar == null) {
                                        rVar = C57821r.f154482e;
                                    }
                                    C69664n.m101060f(rVar, "response.config.orientationLock");
                                    try {
                                        C0167am activity = C142287m.this.f386017d.getActivity();
                                        if (activity != null) {
                                            int a = C57819p.m88536a(rVar.f154485b);
                                            if (a == 0) {
                                                a = 1;
                                            }
                                            int i2 = a - 1;
                                            if (i2 != 1) {
                                                i = i2 != 2 ? -1 : 0;
                                            }
                                            activity.setRequestedOrientation(i);
                                        }
                                    } catch (IllegalStateException unused) {
                                        if (rVar.f154486c) {
                                            if ((rVar.f154484a & 4) != 0) {
                                                str = rVar.f154487d;
                                            } else {
                                                str = C142287m.this.f386017d.getString(R.string.xblend_xpane_fragment_generic_error_message);
                                            }
                                            C69664n.m101060f(str, "if (orientationLock.hasE…                        }");
                                            C142287m.this.mo117118l(str);
                                            return;
                                        }
                                    }
                                }
                            }
                            C142287m mVar = C142287m.this;
                            View b = mVar.mo117113b();
                            if (b != null) {
                                b.setVisibility(0);
                            }
                            TextView c = mVar.mo117114c();
                            if (c != null) {
                                c.setVisibility(8);
                            }
                        } else {
                            C59052c cVar = (C59052c) C142287m.f386014a.mo56225c();
                            cVar.mo56378ag(C40364q.f106014a, C142287m.this.f386019f.mo42422a());
                            cVar.mo56379ah(new C59094n(42050));
                            cVar.mo56386p("XBlend response ElementsOutput does not contain an Element tree");
                            C142287m.m231034o(C142287m.this);
                        }
                    } else {
                        C59052c cVar2 = (C59052c) C142287m.f386014a.mo56225c();
                        cVar2.mo56378ag(C40364q.f106014a, C142287m.this.f386019f.mo42422a());
                        cVar2.mo56379ah(new C59094n(42051));
                        cVar2.mo56386p("XBlend response does not contain an ElementsOutput");
                        C142287m.m231034o(C142287m.this);
                    }
                    SwipeRefreshLayout d = C142287m.this.mo117115d();
                    if (d != null) {
                        d.mo8794l(false, false);
                    }
                }

                /* renamed from: c */
                public final void mo18079c() {
                    SwipeRefreshLayout d = C142287m.this.mo117115d();
                    if (d == null || !d.f13509b) {
                        C142287m.this.mo117119m();
                    }
                }
            });
            C40358k kVar = this.f386029p;
            Uri parse = Uri.parse(gVar.f151985b);
            C69664n.m101060f(parse, "parse(xBlendAddress.path)");
            kVar.mo42415b(parse).mo42416c("XBlend.Container.Request");
        }
    }

    /* renamed from: j */
    public final void mo117117j() {
        ProgressBar p = m231035p();
        if (p != null) {
            p.setVisibility(8);
        }
    }

    /* renamed from: k */
    public final void mo42320k(C57817n nVar) {
        C69664n.m101061g(nVar, "xBlendNewVeTreeLoggingMetadata");
        if (this.f386021h == null) {
            int i = nVar.f154478a;
            int i2 = (i & 1) != 0 ? nVar.f154479b : 148232;
            int i3 = (i & 2) != 0 ? nVar.f154480c : 148233;
            C28306ab abVar = this.f386026m;
            C0167am requireActivity = this.f386017d.requireActivity();
            C28313c a = this.f386025l.mo33805a(C28427h.m53115a(i2));
            a.mo33859g(C28375ak.m53061c(i3));
            a.mo33859g(this.f386030q);
            int i4 = C28485y.f77298f;
            C28439i b = abVar.mo33801b(requireActivity.findViewById(16908290), a);
            C69664n.m101060f(b, "visualElementsView.bindR…el(authSideChannel)\n    )");
            this.f386021h = b;
            mo117112a().setTag(R.id.xblend_xpane_activity_ve, this.f386021h);
        }
    }

    /* renamed from: l */
    public final void mo117118l(String str) {
        View b = mo117113b();
        if (b != null) {
            b.setVisibility(8);
        }
        TextView c = mo117114c();
        if (c != null) {
            c.setText(str);
        }
        TextView c2 = mo117114c();
        if (c2 != null) {
            c2.setVisibility(0);
        }
    }

    /* renamed from: m */
    public final void mo117119m() {
        TextView c = mo117114c();
        if (c != null) {
            c.setVisibility(8);
        }
        ProgressBar p = m231035p();
        if (p != null) {
            p.setVisibility(0);
        }
    }

    /* renamed from: n */
    public final void mo117120n(boolean z) {
        if (z) {
            mo117119m();
        }
        C56943g gVar = this.f386020g;
        if (gVar == null) {
            C69664n.m101065k("address");
            gVar = null;
        }
        mo117116i(gVar, true);
    }
}
