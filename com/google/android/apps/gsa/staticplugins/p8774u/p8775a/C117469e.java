package com.google.android.apps.gsa.staticplugins.p8774u.p8775a;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87306ae;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87307af;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87321d;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87333p;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90227c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117489e;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117490f;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117493i;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.a.e */
/* compiled from: PG */
public final class C117469e extends C23056g implements C117490f, C87334q {

    /* renamed from: a */
    public static final C59071e f326040a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.u.a.e");

    /* renamed from: b */
    public final C117493i f326041b;

    /* renamed from: c */
    public final Context f326042c;

    /* renamed from: d */
    C60870cx f326043d;

    /* renamed from: e */
    C117473i f326044e;

    /* renamed from: f */
    private final Map f326045f = new HashMap();

    /* renamed from: g */
    private final C22871g f326046g;

    /* renamed from: h */
    private final C23052c f326047h;

    /* renamed from: i */
    private final AccessibilityManager f326048i;

    /* renamed from: j */
    private final C86124t f326049j;

    /* renamed from: k */
    private final C21370a f326050k;

    /* renamed from: l */
    private C117480p f326051l;

    public C117469e(C23052c cVar, C117493i iVar, Context context, C22871g gVar, C86124t tVar, C21370a aVar) {
        super(cVar);
        this.f326042c = context;
        this.f326047h = cVar;
        this.f326041b = iVar;
        this.f326046g = gVar;
        this.f326049j = tVar;
        this.f326050k = aVar;
        this.f326048i = (AccessibilityManager) context.getSystemService("accessibility");
        cVar.mo28433w(C87333p.class, new C117468d(this));
    }

    /* renamed from: j */
    public static C117494j m195233j(int i) {
        int i2 = i - 1;
        C117494j jVar = C117494j.ANIMATE_FADE_IN;
        if (i != 0) {
            switch (i2) {
                case 1:
                    return C117494j.ANIMATE_FADE_IN;
                case 2:
                    return C117494j.ANIMATE_FADE_OUT;
                case 3:
                    return C117494j.ANIMATE_SLIDE_UP;
                case 4:
                    return C117494j.ANIMATE_SLIDE_DOWN;
                case 5:
                    return C117494j.ANIMATE_FADE_IN_SLIDE_UP;
                case 6:
                    return C117494j.ANIMATE_FADE_OUT_SLIDE_DOWN;
                default:
                    ((C59052c) ((C59052c) f326040a.mo56225c()).mo56372aa(18240)).mo56387q("Unable to recognize bottom sheet animation %d", i2);
                    return null;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo80980c(C87321d dVar) {
        C117480p pVar = this.f326051l;
        if (pVar != null) {
            pVar.mo80980c(dVar);
        }
    }

    /* renamed from: d */
    public final void mo80981d(C87321d dVar, int i) {
        C117480p pVar = this.f326051l;
        if (pVar != null) {
            pVar.mo103327l(dVar, i);
            pVar.mo103328m(dVar, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.apps.gsa.staticplugins.u.a.r} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103314e(com.google.android.apps.gsa.staticplugins.p8774u.p8775a.C117479o r8) {
        /*
            r7 = this;
            com.google.android.apps.gsa.staticplugins.u.b.i r0 = r7.f326041b
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo103332e()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0
            java.lang.Object r0 = r0.f63720e
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00fb
            com.google.common.util.concurrent.cx r0 = r7.f326043d
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x001d
            r0.cancel(r2)
            r7.f326043d = r1
        L_0x001d:
            com.google.android.apps.gsa.staticplugins.u.b.i r0 = r7.f326041b
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo103332e()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r0.mo28730f(r3, r2)
            com.google.android.apps.gsa.staticplugins.u.a.i r0 = r7.f326044e
            if (r0 != 0) goto L_0x003e
            com.google.common.f.e r8 = f326040a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Bottom sheet element is null during dismiss"
            r1 = 18244(0x4744, float:2.5565E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x003e:
            com.google.android.apps.gsa.staticplugins.u.b.i r0 = r7.f326041b
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo103331d()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0
            java.lang.Object r0 = r0.f63720e
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x006e
            com.google.common.f.e r0 = f326040a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r3 = "The animation-out type in the bottom sheet model are not present."
            r4 = 18243(0x4743, float:2.5564E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.staticplugins.u.b.i r0 = r7.f326041b
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo103331d()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0
            com.google.android.apps.gsa.staticplugins.u.b.j r3 = com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j.ANIMATE_FADE_OUT
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            r0.mo28730f(r3, r2)
        L_0x006e:
            com.google.android.apps.gsa.staticplugins.u.b.i r0 = r7.f326041b
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo103331d()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0
            java.lang.Object r0 = r0.f63720e
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.u.b.j r0 = (com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j) r0
            com.google.android.apps.gsa.staticplugins.u.a.a r2 = new com.google.android.apps.gsa.staticplugins.u.a.a
            r2.<init>(r7, r8)
            com.google.android.apps.gsa.staticplugins.u.b.j r8 = com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j.ANIMATE_FADE_IN
            int r8 = r0.ordinal()
            r3 = 1
            if (r8 == r3) goto L_0x00ce
            r4 = 3
            if (r8 == r4) goto L_0x00bd
            r4 = 5
            if (r8 == r4) goto L_0x00ac
            com.google.common.f.e r8 = f326040a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            r4 = 18239(0x473f, float:2.5558E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r4)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            java.lang.String r4 = "Unexpected transition animation: %s"
            java.lang.String r0 = r0.f326130g
            r8.mo56389s(r4, r0)
            goto L_0x00e7
        L_0x00ac:
            java.util.Map r8 = r7.f326045f
            com.google.android.apps.gsa.staticplugins.u.b.j r1 = com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j.ANIMATE_FADE_OUT_SLIDE_DOWN
            com.google.android.apps.gsa.staticplugins.u.a.r r4 = new com.google.android.apps.gsa.staticplugins.u.a.r
            java.lang.String r5 = r1.f326130g
            com.google.android.libraries.gsa.monet.service.c r6 = r7.f63405W
            r4.<init>(r5, r6)
            r8.put(r1, r4)
            goto L_0x00de
        L_0x00bd:
            java.util.Map r8 = r7.f326045f
            com.google.android.apps.gsa.staticplugins.u.b.j r1 = com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j.ANIMATE_SLIDE_DOWN
            com.google.android.apps.gsa.staticplugins.u.a.r r4 = new com.google.android.apps.gsa.staticplugins.u.a.r
            java.lang.String r5 = r1.f326130g
            com.google.android.libraries.gsa.monet.service.c r6 = r7.f63405W
            r4.<init>(r5, r6)
            r8.put(r1, r4)
            goto L_0x00de
        L_0x00ce:
            java.util.Map r8 = r7.f326045f
            com.google.android.apps.gsa.staticplugins.u.b.j r1 = com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j.ANIMATE_FADE_OUT
            com.google.android.apps.gsa.staticplugins.u.a.r r4 = new com.google.android.apps.gsa.staticplugins.u.a.r
            java.lang.String r5 = r1.f326130g
            com.google.android.libraries.gsa.monet.service.c r6 = r7.f63405W
            r4.<init>(r5, r6)
            r8.put(r1, r4)
        L_0x00de:
            java.util.Map r8 = r7.f326045f
            java.lang.Object r8 = r8.get(r0)
            r1 = r8
            com.google.android.apps.gsa.staticplugins.u.a.r r1 = (com.google.android.apps.gsa.staticplugins.p8774u.p8775a.C117482r) r1
        L_0x00e7:
            r1.getClass()
            r1.f326095c = r2
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r0 = r1.f326093a
            r8.putBoolean(r0, r3)
            com.google.android.libraries.gsa.monet.shared.m r0 = r1.f326094b
            r0.mo28332B(r8)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8774u.p8775a.C117469e.mo103314e(com.google.android.apps.gsa.staticplugins.u.a.o):void");
    }

    /* renamed from: f */
    public final void mo103315f() {
        C117473i iVar;
        ((C23251a) this.f326041b.mo103332e()).mo28730f(true, false);
        if (this.f326044e == null) {
            ((C59052c) ((C59052c) f326040a.mo56225c()).mo56372aa(18247)).mo56386p("Bottom sheet element shouldn't be null");
            return;
        }
        if (!this.f326048i.isTouchExplorationEnabled() && (iVar = this.f326044e) != null && iVar.f326064e) {
            this.f326043d = this.f326046g.mo28208h("dismissBottomSheetAfterTimeoutRunnable", (long) this.f326048i.getRecommendedTimeoutMillis((int) iVar.f326068i, 6), new C117466b(this));
        }
        C117480p pVar = this.f326051l;
        if (pVar != null) {
            C117473i iVar2 = this.f326044e;
            pVar.f326083f = true;
            pVar.f326085h = false;
            if (iVar2 == null) {
                ((C59052c) ((C59052c) C117480p.f326078a.mo56225c()).mo56372aa(18267)).mo56386p("current bottom sheet element shouldn't be null");
            } else {
                iVar2.f326062c.mo80958d().mo80954c();
                int i = pVar.f326087j;
                if (i != 0) {
                    pVar.mo103326k(i);
                    pVar.f326087j = 0;
                }
                C117473i iVar3 = pVar.f326082e;
                if (iVar3 == iVar2) {
                    pVar.f326082e = null;
                } else if (pVar.f326084g || iVar3 == null) {
                    pVar.mo103321e();
                } else {
                    pVar.mo103325j(iVar3);
                    pVar.f326082e = null;
                    pVar.f326086i = 3;
                }
            }
        }
        if (this.f326047h.mo28420E()) {
            mo103318k(8);
        }
    }

    /* renamed from: h */
    public final void mo103316h() {
        C117473i iVar = this.f326044e;
        if (iVar != null && iVar.f326062c.mo80968i()) {
            mo103318k(1);
        }
    }

    /* renamed from: i */
    public final void mo103317i(C117489e eVar) {
        mo103318k(eVar == C117489e.TOUCH_INSIDE ? 6 : 5);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C90227c cVar = (C90227c) C23245b.m43557b(protoParcelable, C90227c.f252063c.getParserForType(), C62921ba.m95368a(), true);
        cVar.getClass();
        C90229e a = C90229e.m146771a(cVar.f252066b);
        if (a == null) {
            a = C90229e.UNKNOWN;
        }
        C23251a aVar = (C23251a) this.f326041b.mo103339l();
        C90229e a2 = C90229e.m146771a(cVar.f252066b);
        if (a2 == null) {
            a2 = C90229e.UNKNOWN;
        }
        aVar.mo28730f(C58833ax.m90834k(a2), false);
        this.f326051l = new C117480p(this.f326050k, a, this.f326049j);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C117480p pVar = this.f326051l;
        if (pVar != null) {
            C117469e eVar = pVar.f326080c;
            if (eVar == null) {
                pVar.f326080c = this;
            } else if (eVar == this) {
                ((C59052c) ((C59052c) C117480p.f326078a.mo56226d()).mo56372aa(18270)).mo56386p("Bottomsheet controller already registered");
                int i = C90755l.f253831a;
            } else {
                ((C59052c) ((C59052c) C117480p.f326078a.mo56226d()).mo56372aa(18269)).mo56386p("Trying to register two controllers into the BottomSheetManager");
                int i2 = C90755l.f253831a;
            }
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        mo103318k(8);
        C117480p pVar = this.f326051l;
        if (pVar != null && this == pVar.f326080c) {
            Iterator it = pVar.f326081d.iterator();
            while (it.hasNext()) {
                ((C117473i) it.next()).f326062c.mo80958d().mo80952a(new C87307af(C87306ae.BOTTOM_SHEET_UNREGISTERED));
            }
            pVar.f326080c = null;
            pVar.f326079b.f326091a = null;
            pVar.f326081d.clear();
        }
    }

    /* renamed from: iy */
    public final void mo80982iy() {
        C117480p pVar = this.f326051l;
        if (pVar != null) {
            pVar.mo80982iy();
        }
    }

    /* renamed from: iz */
    public final void mo80983iz() {
        C117480p pVar = this.f326051l;
        if (pVar != null) {
            pVar.mo80982iy();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo103318k(int i) {
        C117480p pVar;
        C117473i iVar = this.f326044e;
        if (iVar != null && (pVar = this.f326051l) != null) {
            C87321d dVar = iVar.f326062c;
            pVar.mo103327l(dVar, i);
            pVar.mo103328m(dVar, i);
        }
    }
}
