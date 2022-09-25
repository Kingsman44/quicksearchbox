package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C51995gu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.e */
/* compiled from: PG */
public final class C33031e implements C33110f {

    /* renamed from: a */
    public static final C58528ij f88451a = C58528ij.m90011K("ui.SHOW_TEXT", "ui.SHOW_NATIVE_FORM");

    /* renamed from: b */
    public C51950fc f88452b = C51950fc.FORM_UI_THEME_DEFAULT;

    /* renamed from: c */
    C51953ff f88453c;

    /* renamed from: d */
    C52507uh f88454d;

    /* renamed from: e */
    Context f88455e;

    /* renamed from: f */
    public C32988aj f88456f;

    /* renamed from: g */
    public C32993ao f88457g;

    /* renamed from: h */
    final C21370a f88458h;

    /* renamed from: i */
    private boolean f88459i = false;

    /* renamed from: j */
    private C32951d f88460j;

    /* renamed from: k */
    private final C60887da f88461k;

    public C33031e(C60887da daVar, C21370a aVar) {
        this.f88461k = daVar;
        this.f88458h = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo38501a(Context context, C51953ff ffVar, C52507uh uhVar, Optional optional, C33108d dVar) {
        C32993ao aoVar;
        C60870cx cxVar;
        C52507uh uhVar2;
        C50969bn bnVar;
        C50936ah ahVar;
        Optional optional2;
        C32993ao aoVar2;
        this.f88455e = context;
        this.f88456f = new C32988aj(dVar.mo38534c());
        C32951d a = dVar.mo38532a();
        this.f88460j = a;
        if (a.mo38384n()) {
            aoVar = new C33017bl(this.f88456f);
        } else {
            aoVar = new C33018bm(this.f88456f);
        }
        this.f88457g = aoVar;
        this.f88453c = ffVar;
        this.f88454d = uhVar;
        this.f88459i = C33119g.m61470f(this.f88456f.mo38452a());
        dVar.mo38533b().mo38550c(2);
        if (this.f88456f.f88385c.isPresent()) {
            C32951d dVar2 = this.f88460j;
            C51953ff ffVar2 = this.f88453c;
            if (ffVar2 == null || this.f88454d == null || this.f88456f == null || this.f88457g == null || this.f88455e == null) {
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                C51950fc a2 = C51950fc.m86447a(ffVar2.f136324h);
                if (a2 == null) {
                    a2 = C51950fc.FORM_UI_THEME_DEFAULT;
                }
                this.f88452b = a2;
                if (this.f88453c == null || (uhVar2 = this.f88454d) == null || this.f88456f == null || this.f88457g == null || this.f88455e == null) {
                    cxVar = C60856cj.m92900i(Optional.empty());
                } else if (uhVar2.f137840a.size() != 1) {
                    cxVar = C60856cj.m92900i(Optional.empty());
                } else {
                    C52490tr trVar = (C52490tr) C58557jl.m90133n(this.f88454d.f137840a);
                    int i = trVar.f137798b;
                    if (i == 9) {
                        if ((trVar.f137797a & 1) != 0 && ((C52475tc) trVar.f137799c).f137747b) {
                            Optional g = C33136x.m61490g(trVar.f137800d, this.f88453c);
                            if (g.isPresent() && ((C51941eu) g.get()).f136277e == 17) {
                                C51941eu euVar = (C51941eu) g.get();
                                if (euVar.f136277e == 17) {
                                    ahVar = (C50936ah) euVar.f136278f;
                                } else {
                                    ahVar = C50936ah.f132593m;
                                }
                                C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
                                C50931ac acVar = C50931ac.DEFAULT;
                                C50931ac a3 = C50931ac.m85981a(ahVar.f132602h);
                                if (a3 == null) {
                                    a3 = C50931ac.DEFAULT;
                                }
                                int ordinal = a3.ordinal();
                                if (ordinal == 1) {
                                    this.f88457g.mo38460E();
                                    if (this.f88453c == null || this.f88454d == null || this.f88456f == null || (aoVar2 = this.f88457g) == null || this.f88455e == null) {
                                        optional2 = Optional.empty();
                                    } else {
                                        aoVar2.mo38459D(C51401gi.CANCEL);
                                        ArrayList arrayList = new ArrayList();
                                        Optional c = mo38507c();
                                        if (c.isPresent()) {
                                            arrayList.add((C51809dy) c.get());
                                        }
                                        arrayList.add(C33116d.m61448g(C52056o.f136624a));
                                        optional2 = Optional.m71637of(C33118f.m61461b(arrayList, C58733pz.f156496a, this.f88456f.mo38452a()));
                                    }
                                    cxVar = C60856cj.m92900i(optional2);
                                } else if (ordinal == 2) {
                                    this.f88457g.mo38460E();
                                    if (!this.f88457g.mo38487q().isPresent()) {
                                        C33033g.m61306h(this.f88457g);
                                    }
                                    if (this.f88457g.mo38483m().isPresent() || (this.f88457g.mo38488r().isPresent() && this.f88457g.mo38493w().isPresent())) {
                                        cxVar = C60856cj.m92900i(mo38506b());
                                    }
                                }
                            }
                        }
                        cxVar = C60856cj.m92900i(Optional.empty());
                    } else {
                        if (i == 8 && (trVar.f137797a & 1) != 0) {
                            C52479tg tgVar = (C52479tg) trVar.f137799c;
                            Optional g2 = C33136x.m61490g(trVar.f137800d, this.f88453c);
                            if (g2.isPresent() && ((C51941eu) g2.get()).f136277e == 16) {
                                Context context2 = this.f88455e;
                                C51941eu euVar2 = (C51941eu) g2.get();
                                if (euVar2.f136277e == 16) {
                                    bnVar = (C50969bn) euVar2.f136278f;
                                } else {
                                    bnVar = C50969bn.f132678i;
                                }
                                cxVar = C60922j.m93044g(new C32985ag(context2, bnVar, tgVar, this.f88456f, this.f88457g, 2, this.f88461k, this.f88458h, dVar2).mo38439g(), C47810es.m84963c(new C33030d(this, trVar)), this.f88461k);
                            }
                        }
                        cxVar = C60856cj.m92900i(Optional.empty());
                    }
                }
            }
            return C60922j.m93044g(cxVar, C47810es.m84963c(new C33029c(this, dVar)), this.f88461k);
        }
        dVar.mo38533b().mo38549b(2);
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: b */
    public final Optional mo38506b() {
        C32993ao aoVar;
        Optional optional;
        if (this.f88460j == null || this.f88453c == null || this.f88454d == null || (aoVar = this.f88457g) == null || this.f88456f == null || this.f88455e == null) {
            return Optional.empty();
        }
        aoVar.mo38459D(C51401gi.FULFILLMENT);
        C58331bb bbVar = new C58331bb();
        Optional c = mo38507c();
        if (c.isPresent()) {
            bbVar.mo54920x(0, (C51809dy) c.get());
        }
        if (!this.f88459i || this.f88452b == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            Optional c2 = C33036j.m61312c(this.f88455e, this.f88457g, this.f88456f, this.f88453c);
            if (c2.isPresent()) {
                bbVar.mo54920x(0, (C51809dy) c2.get());
            }
        }
        bbVar.mo54920x(0, C33116d.m61448g(C52056o.f136624a));
        if (C33033g.m61308j(this.f88457g)) {
            optional = this.f88457g.mo38496z();
        } else {
            optional = this.f88457g.mo38474d();
        }
        if (optional.isPresent()) {
            bbVar.mo54920x(1, (C51809dy) optional.get());
        }
        bbVar.mo54920x(2, C33116d.m61447f());
        return Optional.m71637of(C33118f.m61460a(bbVar, this.f88456f.mo38452a()));
    }

    /* renamed from: c */
    public final Optional mo38507c() {
        C32988aj ajVar = this.f88456f;
        if (ajVar != null && ajVar.f88385c.isPresent()) {
            Optional e = C33036j.m61314e((C51406gn) this.f88456f.f88385c.get());
            if (e.isPresent()) {
                C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
                String str = (String) e.get();
                guVar.copyOnWrite();
                C52003hb hbVar = (C52003hb) guVar.instance;
                str.getClass();
                hbVar.f136478a |= 1;
                hbVar.f136479b = str;
                return Optional.m71637of(C33116d.m61452k((C52003hb) guVar.build()));
            }
        }
        return Optional.empty();
    }
}
