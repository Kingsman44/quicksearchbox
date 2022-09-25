package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b.C109989c;
import com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b.C109992f;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54192i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57778j;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57741e;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57743g;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import dagger.C68214a;
import java.util.Iterator;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.C70129u;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5517i.C70101a;
import p5488io.p5490b.p5518j.C70111i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ka */
/* compiled from: PG */
public final class C108474ka extends C108232bc implements C108330es {

    /* renamed from: E */
    public static final /* synthetic */ int f301712E = 0;

    /* renamed from: F */
    private static final C59071e f301713F = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.ka");

    /* renamed from: D */
    public final Context f301714D;

    /* renamed from: G */
    private final C109992f f301715G;

    /* renamed from: H */
    private final C22871g f301716H;

    /* renamed from: a */
    public final C58833ax f301717a;

    /* renamed from: b */
    public final C54201r f301718b;

    /* renamed from: c */
    public C109989c f301719c;

    /* renamed from: d */
    public final LithoView f301720d;

    /* renamed from: e */
    public boolean f301721e = false;

    /* renamed from: f */
    public final C21232ab f301722f;

    /* renamed from: g */
    public final C68214a f301723g;

    /* renamed from: h */
    public final C69802a f301724h = new C69802a();

    public C108474ka(Context context, C21232ab abVar, C68214a aVar, C22871g gVar, C54201r rVar, C58833ax axVar, C109992f fVar) {
        super((byte[]) null);
        this.f301714D = context;
        this.f301722f = abVar;
        this.f301723g = aVar;
        this.f301718b = rVar;
        this.f301717a = axVar;
        this.f301715G = fVar;
        LithoView lithoView = new LithoView(context);
        this.f301720d = lithoView;
        this.f301716H = gVar;
        lithoView.setForceDarkAllowed(false);
    }

    /* renamed from: f */
    private final C57778j m180316f() {
        Object obj;
        C54201r rVar = this.f301718b;
        C62940bt r1 = C62942bv.checkIsLite(C54192i.f142222b);
        rVar.mo58887l(r1);
        Object l = rVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C57776h hVar = ((C57784p) obj).f154387d;
        if (hVar == null) {
            hVar = C57776h.f154365b;
        }
        for (C57778j jVar : hVar.f154367a) {
            C57780l lVar = jVar.f154373c;
            if (lVar == null) {
                lVar = C57780l.f154376c;
            }
            C62940bt r3 = C62942bv.checkIsLite(C57743g.f154270c);
            lVar.mo58887l(r3);
            if (lVar.f169962ag.mo58857o(r3.f169971d)) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo96789a(MediaMetadata mediaMetadata) {
        C57778j f;
        if (this.f301722f != null && this.f301723g != null && (f = m180316f()) != null && !f.f154371a.isEmpty()) {
            String str = f.f154371a;
            try {
                C57780l lVar = f.f154373c;
                if (lVar == null) {
                    lVar = C57780l.f154376c;
                }
                C63070h hVar = lVar.f154379b;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                C57741e eVar = (C57741e) C62942bv.parseFrom((C62942bv) C57741e.f154257j, hVar.f170218b, C62921ba.m95368a());
                C70129u j = this.f301722f.mo26139b(str).mo61651i(C108458jl.f301687a).mo61652l(C108464jr.f301695a).mo61652l(C108465js.f301696a).mo61657s().mo61671k(new C108466jt(eVar)).mo61670j(new C108467ju(this, mediaMetadata, eVar));
                C70128t tVar = C70111i.f186861b;
                C69822d dVar = C70101a.f186839g;
                this.f301724h.mo61462b(j.mo61672l(tVar).mo61668f(new C108468jv(this, str)).mo61666d(new C108469jw(this)).mo61673m());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f301713F.mo56225c()).mo56382g(e)).mo56372aa(24062)).mo56386p("Invalid MediaDetails format");
            }
        }
    }

    /* renamed from: b */
    public final void mo96790b(PlaybackState playbackState) {
        C57778j f;
        if (this.f301722f != null && this.f301723g != null && playbackState != null) {
            if (playbackState.getState() == 7) {
                this.f301716H.mo28212l("toast", new C108470jx(this));
            } else if ((playbackState.getState() == 0 || playbackState.getState() == 1 || playbackState.getState() == 3 || playbackState.getState() == 2) && (f = m180316f()) != null && !f.f154371a.isEmpty()) {
                String str = f.f154371a;
                C70129u j = this.f301722f.mo26139b(str).mo61651i(C108458jl.f301687a).mo61652l(C108464jr.f301695a).mo61652l(C108465js.f301696a).mo61657s().mo61671k(new C108471jy(f)).mo61670j(new C108472jz(playbackState));
                C70128t tVar = C70111i.f186861b;
                C69822d dVar = C70101a.f186839g;
                this.f301724h.mo61462b(j.mo61672l(tVar).mo61668f(new C108459jm(this, str)).mo61673m());
            }
        }
    }

    /* renamed from: c */
    public final void mo96791c() {
        C57778j f = m180316f();
        if (this.f301722f == null || f == null || f.f154371a.isEmpty()) {
            this.f301724h.mo61461a();
            this.f301724h.dispose();
            return;
        }
        String str = f.f154371a;
        C70129u j = this.f301722f.mo26139b(str).mo61651i(C108458jl.f301687a).mo61652l(C108464jr.f301695a).mo61652l(C108465js.f301696a).mo61657s().mo61671k(new C108460jn(f)).mo61670j(C108461jo.f301691a);
        C70128t tVar = C70111i.f186861b;
        C69822d dVar = C70101a.f186839g;
        this.f301724h.mo61462b(j.mo61672l(tVar).mo61668f(new C108462jp(this, str)).mo61665c(new C108463jq(this)).mo61673m());
    }

    /* renamed from: e */
    public final void mo96900e(ViewGroup viewGroup, C108237bh bhVar) {
        C68214a aVar;
        Object obj;
        MediaMetadata mediaMetadata;
        String str;
        Object obj2;
        if (this.f301719c != null) {
            if (this.f301720d.getParent() != null) {
                if (this.f301720d.getParent() != viewGroup) {
                    ((ViewGroup) this.f301720d.getParent()).removeView(this.f301720d);
                } else {
                    return;
                }
            }
            C109989c cVar = this.f301719c;
            cVar.getClass();
            cVar.mo98285a(this.f301720d, this.f301715G);
            if (bhVar.mo96660c() >= 0) {
                viewGroup.setPadding(bhVar.mo96660c(), viewGroup.getPaddingTop(), bhVar.mo96660c(), viewGroup.getPaddingBottom());
            }
            viewGroup.removeAllViews();
            viewGroup.addView(this.f301720d);
            C86124t tVar = this.f301041w;
            if (tVar != null && tVar.mo79746e(C90066dr.f249700w) && (aVar = this.f301723g) != null && aVar.mo27525b() != null && this.f301722f != null) {
                C68214a aVar2 = this.f301723g;
                aVar2.getClass();
                C108331et etVar = (C108331et) aVar2.mo27525b();
                C54201r rVar = this.f301718b;
                C62940bt r0 = C62942bv.checkIsLite(C54192i.f142222b);
                rVar.mo58887l(r0);
                Object l = rVar.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                C57776h hVar = ((C57784p) obj).f154387d;
                if (hVar == null) {
                    hVar = C57776h.f154365b;
                }
                Iterator it = hVar.f154367a.iterator();
                while (true) {
                    mediaMetadata = null;
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    C57778j jVar = (C57778j) it.next();
                    C57780l lVar = jVar.f154373c;
                    if (lVar == null) {
                        lVar = C57780l.f154376c;
                    }
                    C62940bt r3 = C62942bv.checkIsLite(C57743g.f154270c);
                    lVar.mo58887l(r3);
                    if (lVar.f169962ag.mo58857o(r3.f169971d)) {
                        C57780l lVar2 = jVar.f154373c;
                        if (lVar2 == null) {
                            lVar2 = C57780l.f154376c;
                        }
                        C62940bt r02 = C62942bv.checkIsLite(C57743g.f154270c);
                        lVar2.mo58887l(r02);
                        Object l2 = lVar2.f169962ag.mo58854l(r02.f169971d);
                        if (l2 == null) {
                            obj2 = r02.f169969b;
                        } else {
                            obj2 = r02.mo58889c(l2);
                        }
                        str = ((C57743g) obj2).f154272a;
                    }
                }
                etVar.mo96794c(str);
                MediaController mediaController = ((C108331et) this.f301723g.mo27525b()).f301347f;
                if (mediaController != null) {
                    mediaMetadata = mediaController.getMetadata();
                }
                mo96789a(mediaMetadata);
                ((C108331et) this.f301723g.mo27525b()).mo96792a(this);
            }
        }
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 62749;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 19;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C28292j jVar = this.f301030l;
        if (jVar != null) {
            return C28293k.m52908e(jVar, new C28293k[0]);
        }
        return null;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        mo96900e(blVar.f301081h, bhVar);
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        C109989c cVar = this.f301719c;
        if (cVar != null) {
            cVar.mo98286c(this.f301720d);
        }
        C68214a aVar = this.f301723g;
        if (!(aVar == null || aVar.mo27525b() == null)) {
            ((C108331et) this.f301723g.mo27525b()).f301346e.remove(this);
        }
        blVar.f301081h.removeAllViews();
    }
}
