package com.google.android.libraries.lens.view.infopanel;

import android.support.p031v4.app.C0154a;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26973i;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27126ab;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27128ad;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27129ae;
import com.google.android.libraries.lens.view.p2056af.C25073c;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25483a;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.lens.view.srpx.C28049o;
import com.google.android.libraries.lens.view.srpx.p2170a.C28033d;
import com.google.android.libraries.lens.view.weblrp.C28191f;
import com.google.android.libraries.lens.view.weblrp.C28192g;
import com.google.android.libraries.lens.view.weblrp.C28195j;
import com.google.android.libraries.lens.view.weblrp.C28201o;
import com.google.android.libraries.lens.view.weblrp.C28202p;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.p3372e.C43505c;
import com.google.android.libraries.web.contrib.p3372e.C43506d;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4538j.p4539a.C59305c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.common.p4541l.C59318af;
import com.google.common.p4541l.C59334q;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59892ba;
import com.google.common.p4552o.p4563i.C59895bd;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.C60789b;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.lens.view.infopanel.i */
/* compiled from: PG */
public final /* synthetic */ class C27191i implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27195m f74324a;

    public /* synthetic */ C27191i(C27195m mVar) {
        this.f74324a = mVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C27126ab abVar;
        View b;
        byte[] bArr;
        InputStream inputStream;
        C28201o d;
        C27195m mVar = this.f74324a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C26973i iVar = (C26973i) axVar.mo56107c();
            boolean h = iVar.mo32414e().mo56113h();
            if (h) {
                mVar.f74361y.mo32358h(((Integer) iVar.mo32414e().mo56107c()).intValue());
            } else {
                InfoPanelView infoPanelView = mVar.f74361y;
                infoPanelView.mo32358h(0);
                infoPanelView.f73489c.f73586a.mo17754z().mo32649d(false);
            }
            if (!h) {
                mVar.mo32632l();
                if (!mVar.f74359w || !mVar.f74340d.mo31462g(C26239a.ONELRP_STICKY_WEBVIEW_ENABLED) || (!iVar.mo32433q() && !iVar.mo32425n())) {
                    C28201o d2 = mVar.mo32625d();
                    if (d2 != null) {
                        C0154a aVar = new C0154a(mVar.f74338b.getChildFragmentManager());
                        aVar.mo516m(d2);
                        aVar.mo509f();
                    }
                } else if (mVar.f74359w && mVar.f74340d.mo31462g(C26239a.ONELRP_STICKY_WEBVIEW_ENABLED) && iVar.mo32425n() && (d = mVar.mo32625d()) != null) {
                    C28191f a = d.mo17754z().mo33715a();
                    a.getClass();
                    C28195j f = a.mo17754z();
                    f.f76734h.requireView().setVisibility(4);
                    C43262m mVar2 = f.f76738l;
                    C43255f m = C43257h.m76306m("about:blank");
                    C43316a aVar2 = (C43316a) C43323b.f113174a.createBuilder();
                    C62940bt btVar = C25486d.f69438f;
                    C25483a aVar3 = (C25483a) C25486d.f69437e.createBuilder();
                    aVar3.copyOnWrite();
                    C25486d dVar = (C25486d) aVar3.instance;
                    dVar.f69443d = 2;
                    dVar.f69440a |= 4;
                    aVar2.mo58885m(btVar, (C25486d) aVar3.build());
                    m.mo46343d((C43323b) aVar2.build());
                    mVar2.mo46333b(m.mo46365k());
                }
            }
            boolean z = !iVar.mo32425n() && !h && !((Boolean) iVar.mo32418h().mo56109e(false)).booleanValue();
            if (z) {
                C25073c cVar = mVar.f74355s;
                int r = mVar.mo32638r();
                if (cVar.mo30253b()) {
                    C37215b bVar = cVar.f68323b;
                    C37258g gVar = C37194a.f98562cS;
                    C62940bt btVar2 = C59898bg.f161867w;
                    C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
                    C59892ba baVar = (C59892ba) C59895bd.f161854d.createBuilder();
                    baVar.copyOnWrite();
                    C59895bd bdVar = (C59895bd) baVar.instance;
                    bdVar.f161857b = r - 1;
                    bdVar.f161856a |= 1;
                    C59895bd bdVar2 = (C59895bd) baVar.build();
                    afVar.copyOnWrite();
                    C59898bg bgVar = (C59898bg) afVar.instance;
                    bdVar2.getClass();
                    bgVar.f161886r = bdVar2;
                    bgVar.f161869a |= 65536;
                    bVar.mo19974a(gVar.mo40812e(btVar2, (C59898bg) afVar.build()));
                }
                mVar.f74350n.mo19974a(C37194a.f98479ap.mo40815i(C62722b.OK));
                if (!iVar.mo32433q()) {
                    if (mVar.f74362z) {
                        C28306ab.m52929e(mVar.f74361y.f73489c.f73587b);
                    }
                    InfoPanelView infoPanelView2 = mVar.f74361y;
                    infoPanelView2.f73495i = true;
                    mVar.f74332D = new C28452b(mVar.f74342f.mo33802c(infoPanelView2.f73489c.f73587b, mVar.f74341e.mo33805a(C28427h.m53115a(51782))));
                    mVar.f74362z = true;
                } else {
                    if (mVar.f74362z) {
                        mVar.f74362z = false;
                        C28306ab.m52929e(mVar.f74361y.f73489c.f73587b);
                    }
                    mVar.f74361y.f73495i = false;
                }
            }
            if (!mVar.mo32637q(iVar)) {
                mVar.f74361y.mo32373r(iVar.mo32412b());
            }
            mVar.mo32633m(true);
            if (iVar.mo32425n()) {
                ((C58970a) ((C58970a) C27195m.f74328a.mo56224b()).mo56372aa(49505)).mo56386p("onModelChanged(): loading");
                mVar.mo32630i(iVar);
                LensResultPanelBottomsheetBehavior.m50197t(mVar.f74361y).f73744b = true;
            } else {
                ((C58970a) ((C58970a) C27195m.f74328a.mo56224b()).mo56372aa(49502)).mo56386p("onModelChanged(): results");
                mVar.mo32630i(iVar);
                if (!h) {
                    if (iVar.mo32433q()) {
                        C58833ax i = iVar.mo32420i();
                        C58833ax j = iVar.mo32421j();
                        C58833ax f2 = iVar.mo32416f();
                        if (mVar.f74359w && mVar.f74340d.mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING) && mVar.f74361y.mo32375t()) {
                            InfoPanelView infoPanelView3 = mVar.f74361y;
                            infoPanelView3.f73494h = infoPanelView3.mo32356f();
                            View childAt = infoPanelView3.mo32356f().getChildAt(0);
                            if (childAt.getParent() != null) {
                                ((ViewGroup) childAt.getParent()).removeView(childAt);
                            }
                            infoPanelView3.f73494h.removeAllViews();
                            infoPanelView3.f73489c.f73588c.removeAllViews();
                            infoPanelView3.f73489c.f73588c.addView(childAt);
                        }
                        mVar.f74361y.f73496j.f73797b = false;
                        C28201o e = mVar.mo32626e();
                        e.mo17754z().mo33716b(mVar.f74331C);
                        C28191f a2 = e.mo17754z().mo33715a();
                        if (a2 != null) {
                            a2.mo17754z().f76750x = mVar;
                        }
                        C28202p f3 = e.mo17754z();
                        boolean z2 = mVar.f74330B;
                        C28191f a3 = f3.mo33715a();
                        a3.getClass();
                        C28195j f4 = a3.mo17754z();
                        f4.f76731e = (C59308f) i.mo56111f();
                        f4.f76749w = f2;
                        f4.f76748v = z2;
                        if (!j.mo56113h()) {
                            bArr = null;
                        } else {
                            f4.f76728b.mo19974a(C37194a.f98602dc);
                            byte[] N = ((C63088z) j.mo56107c()).mo59174N();
                            bArr = C60789b.m92792b(N, N.length);
                            C37215b bVar2 = f4.f76728b;
                            C37252a i2 = C37194a.f98603dd.mo40815i(C62722b.OK);
                            C62940bt btVar3 = C59898bg.f161867w;
                            C59870af afVar2 = (C59870af) C59898bg.f161866v.createBuilder();
                            C59892ba baVar2 = (C59892ba) C59895bd.f161854d.createBuilder();
                            int i3 = true != z2 ? 3 : 2;
                            baVar2.copyOnWrite();
                            C59895bd bdVar3 = (C59895bd) baVar2.instance;
                            bdVar3.f161858c = i3 - 1;
                            bdVar3.f161856a |= 2;
                            C59895bd bdVar4 = (C59895bd) baVar2.build();
                            afVar2.copyOnWrite();
                            C59898bg bgVar2 = (C59898bg) afVar2.instance;
                            bdVar4.getClass();
                            bgVar2.f161886r = bdVar4;
                            bgVar2.f161869a |= 65536;
                            ((C37253b) i2).mo40792p(btVar3, (C59898bg) afVar2.build());
                            bVar2.mo19974a(i2);
                        }
                        f4.f76730d = bArr;
                        f4.f76734h.requireView().setVisibility(0);
                        String f5 = f4.f76737k.mo31461f(C26239a.ONELRP_ORIGIN_URL);
                        if (true == f5.isEmpty()) {
                            f5 = "https://www.google.com/";
                        }
                        C43255f m2 = C43257h.m76306m(f5);
                        if (f4.f76740n.mo30940a() || f4.f76740n.mo30941b()) {
                            C58833ax b2 = f4.mo33712b();
                            if (b2.mo56113h() && !((String) b2.mo56107c()).equals("https://lens.google.com/")) {
                                m2 = C43257h.m76306m((String) b2.mo56107c());
                            }
                        }
                        if (f4.f76749w.mo56113h()) {
                            C43316a aVar4 = (C43316a) C43323b.f113174a.createBuilder();
                            C62940bt btVar4 = C25486d.f69438f;
                            C25483a aVar5 = (C25483a) C25486d.f69437e.createBuilder();
                            aVar5.copyOnWrite();
                            C25486d dVar2 = (C25486d) aVar5.instance;
                            dVar2.f69443d = 1;
                            dVar2.f69440a |= 4;
                            String afVar3 = ((C24203af) f4.f76749w.mo56107c()).toString();
                            aVar5.copyOnWrite();
                            C25486d dVar3 = (C25486d) aVar5.instance;
                            dVar3.f69440a |= 1;
                            dVar3.f69441b = afVar3;
                            boolean z3 = f4.f76748v;
                            aVar5.copyOnWrite();
                            C25486d dVar4 = (C25486d) aVar5.instance;
                            dVar4.f69440a = 2 | dVar4.f69440a;
                            dVar4.f69442c = z3;
                            aVar4.mo58885m(btVar4, (C25486d) aVar5.build());
                            m2.mo46343d((C43323b) aVar4.build());
                        }
                        f4.mo33713d(m2);
                        try {
                            byte[] bArr2 = f4.f76730d;
                            if (bArr2 != null) {
                                inputStream = new ByteArrayInputStream(bArr2);
                            } else {
                                C59308f fVar = f4.f76731e;
                                fVar.getClass();
                                C59334q qVar = new C59334q(new C59305c(fVar.f157474a).f157465a);
                                Charset charset = StandardCharsets.UTF_8;
                                charset.getClass();
                                inputStream = new C59318af(new StringReader((String) qVar.f157522a), charset);
                            }
                            C43505c.m76763a(m2, new C43506d(inputStream, C28192g.f76724a));
                            f4.f76738l.mo46333b(m2.mo46365k());
                        } catch (IOException e2) {
                            throw i$$ExternalSyntheticBackport0.m50413m("Unhandled exception", e2);
                        }
                    } else {
                        C58485gu l = iVar.mo32423l();
                        int size = l.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C27129ae aeVar = (C27129ae) l.get(i4);
                            View b3 = mVar.f74345i.mo32452b(aeVar);
                            if (b3 != null) {
                                InfoPanelView infoPanelView4 = mVar.f74361y;
                                if (!infoPanelView4.mo32375t()) {
                                    infoPanelView4.mo32357g();
                                }
                                infoPanelView4.f73489c.f73587b.addView(b3, infoPanelView4.f73488b.size());
                                infoPanelView4.f73488b.add(b3);
                            } else {
                                ((C58970a) ((C58970a) C27195m.f74328a.mo56226d()).mo56372aa(49503)).mo56389s("onModelChanged(): null view for %s", aeVar.mo32561a());
                            }
                        }
                    }
                }
                if (!iVar.mo32422k().mo56113h()) {
                    mVar.mo32632l();
                } else if (h) {
                    C28033d dVar5 = (C28033d) iVar.mo32422k().mo56107c();
                    C28049o b4 = mVar.mo32624b();
                    if (b4 != null) {
                        b4.mo17754z().mo33503d(mVar.f74352p.mo33497a(dVar5, mVar.f74338b.getContext(), mVar.mo32627f()), dVar5.mo33487a());
                    } else {
                        mVar.mo32629h(dVar5, C58836b.f156633a);
                    }
                } else {
                    mVar.mo32629h((C28033d) iVar.mo32422k().mo56107c(), iVar.mo32416f());
                }
                if (iVar.mo32413d().mo56113h() && (b = mVar.f74345i.mo32452b(abVar)) != null) {
                    mVar.f74361y.mo32372q(b, !(abVar = (C27126ab) iVar.mo32413d().mo56107c()).mo32562b());
                }
                LensResultPanelBottomsheetBehavior.m50197t(mVar.f74361y).f73744b = false;
            }
            if (z) {
                C58485gu l2 = iVar.mo32423l();
                int size2 = l2.size();
                int i5 = 0;
                while (i5 < size2) {
                    int i6 = i5 + 1;
                    if (((C27129ae) l2.get(i5)).mo32561a() != C27128ad.OFFLINE_ITEM) {
                        i5 = i6;
                    } else {
                        mVar.f74350n.mo19974a(C37194a.f98626e.mo40815i(C62722b.UNAVAILABLE));
                        return;
                    }
                }
                if (iVar.mo32422k().mo56113h() || iVar.mo32433q()) {
                    mVar.f74329A = true;
                    return;
                }
                mVar.f74329A = false;
                InfoPanelView infoPanelView5 = mVar.f74361y;
                infoPanelView5.getViewTreeObserver().addOnPreDrawListener(new C26984ab(infoPanelView5, new C27123e(mVar)));
            }
        }
    }
}
