package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19050h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51459im;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52470sy;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52510uk;
import com.google.assistant.p3897e.p3921j.C52511ul;
import com.google.assistant.p3897e.p3921j.C52512um;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Arrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bt */
/* compiled from: PG */
public final class C33025bt implements C33110f {

    /* renamed from: a */
    public static final C59071e f88431a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bt");

    /* renamed from: b */
    public static final C58528ij f88432b = C58528ij.m90011K("ui.SHOW_TEXT", "ui.SHOW_NATIVE_FORM");

    /* renamed from: c */
    public C51950fc f88433c = C51950fc.FORM_UI_THEME_DEFAULT;

    /* renamed from: d */
    C51953ff f88434d;

    /* renamed from: e */
    C52507uh f88435e;

    /* renamed from: f */
    Context f88436f;

    /* renamed from: g */
    C32988aj f88437g;

    /* renamed from: h */
    C32993ao f88438h;

    /* renamed from: i */
    C33144e f88439i;

    /* renamed from: j */
    private final C60887da f88440j;

    /* renamed from: k */
    private final C21370a f88441k;

    public C33025bt(C60887da daVar, C21370a aVar) {
        this.f88440j = daVar;
        this.f88441k = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo38501a(Context context, C51953ff ffVar, C52507uh uhVar, Optional optional, C33108d dVar) {
        C32993ao aoVar;
        C60870cx cxVar;
        C32993ao aoVar2;
        C60870cx cxVar2;
        C52507uh uhVar2;
        C60870cx cxVar3;
        C50969bn bnVar;
        C52470sy syVar;
        C52470sy syVar2;
        Context context2 = context;
        this.f88436f = context2;
        C52091ex c = dVar.mo38534c();
        C32951d a = dVar.mo38532a();
        C33144e b = dVar.mo38533b();
        this.f88436f = context2;
        this.f88434d = ffVar;
        this.f88435e = uhVar;
        this.f88437g = new C32988aj(c);
        if (a.mo38389s()) {
            aoVar = new C33017bl(this.f88437g);
        } else {
            aoVar = new C33018bm(this.f88437g);
        }
        this.f88438h = aoVar;
        this.f88439i = b;
        b.mo38550c(3);
        if (!this.f88437g.mo38453b().isPresent() || !this.f88437g.f88385c.isPresent()) {
            b.mo38549b(3);
            return C60856cj.m92900i(Optional.empty());
        }
        if (this.f88434d == null || this.f88435e == null || this.f88436f == null || this.f88437g == null || (aoVar2 = this.f88438h) == null) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else if (aoVar2.mo38472b() != C51936ep.MESSAGE) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            C51950fc a2 = C51950fc.m86447a(this.f88434d.f136324h);
            if (a2 == null) {
                a2 = C51950fc.FORM_UI_THEME_DEFAULT;
            }
            this.f88433c = a2;
            if (this.f88434d == null || (uhVar2 = this.f88435e) == null || this.f88436f == null || this.f88437g == null || this.f88438h == null) {
                cxVar2 = C60856cj.m92900i(Optional.empty());
            } else if (uhVar2.f137840a.size() != 1) {
                cxVar2 = C60856cj.m92900i(Optional.empty());
            } else {
                C52507uh uhVar3 = this.f88435e;
                if (!(uhVar3 == null || this.f88434d == null || this.f88437g == null)) {
                    for (C52490tr trVar : uhVar3.f137840a) {
                        if (trVar.f137798b == 13) {
                            syVar = (C52470sy) trVar.f137799c;
                        } else {
                            syVar = C52470sy.f137736c;
                        }
                        if ((syVar.f137738a & 1) != 0) {
                            if (trVar.f137798b == 13) {
                                syVar2 = (C52470sy) trVar.f137799c;
                            } else {
                                syVar2 = C52470sy.f137736c;
                            }
                            if (syVar2.f137739b.isEmpty()) {
                                C51459im imVar = (C51459im) ((C51460in) this.f88437g.mo38453b().get()).toBuilder();
                                imVar.copyOnWrite();
                                C51460in inVar = (C51460in) imVar.instance;
                                inVar.f134054a &= -5;
                                inVar.f134056c = C51460in.f134052e.f134056c;
                                C32988aj ajVar = this.f88437g;
                                ajVar.mo38455d(C33119g.m61466b(ajVar.mo38452a(), (C51460in) imVar.build()));
                            }
                        }
                    }
                }
                C32988aj ajVar2 = this.f88437g;
                ajVar2.mo38455d(C19050h.m36504a(this.f88436f, ajVar2.mo38452a(), this.f88435e));
                C52490tr trVar2 = (C52490tr) C58557jl.m90133n(this.f88435e.f137840a);
                if (this.f88437g == null || this.f88438h == null) {
                    cxVar3 = C60856cj.m92900i(false);
                } else {
                    if (trVar2.f137798b == 8 && (1 & trVar2.f137797a) != 0) {
                        C52479tg tgVar = (C52479tg) trVar2.f137799c;
                        Optional g = C33136x.m61490g(trVar2.f137800d, this.f88434d);
                        if (g.isPresent() && ((C51941eu) g.get()).f136277e == 16) {
                            Context context3 = this.f88436f;
                            C51941eu euVar = (C51941eu) g.get();
                            if (euVar.f136277e == 16) {
                                bnVar = (C50969bn) euVar.f136278f;
                            } else {
                                bnVar = C50969bn.f132678i;
                            }
                            cxVar3 = C60922j.m93044g(new C32985ag(context3, bnVar, tgVar, this.f88437g, this.f88438h, 2, this.f88440j, this.f88441k, a).mo38439g(), new C33024bs(this, trVar2), this.f88440j);
                        }
                    }
                    cxVar3 = C60856cj.m92900i(false);
                }
                cxVar2 = C60922j.m93045h(cxVar3, new C33023br(this, a, trVar2), this.f88440j);
            }
            cxVar = C60922j.m93044g(cxVar2, C47810es.m84963c(C33022bq.f88425a), this.f88440j);
        }
        return C60922j.m93044g(cxVar, new C33021bp(this, b), this.f88440j);
    }

    /* renamed from: b */
    public final Optional mo38502b(C58485gu guVar, C58485gu guVar2) {
        C32993ao aoVar;
        if (this.f88437g == null || (aoVar = this.f88438h) == null) {
            return Optional.empty();
        }
        if (aoVar.mo38476f().isPresent() && this.f88438h.mo38476f().get() != C51401gi.DOWNLOAD_ASSISTANT_PHOTOS) {
            Optional h = this.f88438h.mo38478h();
            if (h.isPresent()) {
                this.f88438h.mo38459D(C51401gi.DOWNLOAD_ASSISTANT_PHOTOS);
                return Optional.m71637of(C33118f.m61461b(Arrays.asList(new C51809dy[]{(C51809dy) h.get()}), C58733pz.f156496a, this.f88437g.mo38452a()));
            }
        }
        this.f88438h.mo38459D(C51401gi.FULFILLMENT);
        ArrayList arrayList = new ArrayList();
        Optional g = this.f88438h.mo38477g();
        if (g.isPresent()) {
            arrayList.add(C33116d.m61457p((C51809dy) g.get()));
        }
        Optional c = C33036j.m61312c(this.f88436f, this.f88438h, this.f88437g, this.f88434d);
        if (c.isPresent()) {
            arrayList.add((C51809dy) c.get());
        }
        arrayList.add(C33116d.m61448g(C52056o.f136624a));
        arrayList.addAll(guVar);
        arrayList.addAll(guVar2);
        this.f88438h.mo38460E();
        return Optional.m71637of(C33118f.m61461b(arrayList, C58733pz.f156496a, this.f88437g.mo38452a()));
    }

    /* renamed from: c */
    public final void mo38503c(String str, boolean z) {
        if (this.f88434d != null) {
            C52510uk ukVar = (C52510uk) C52513un.f137850b.createBuilder();
            C52511ul ulVar = (C52511ul) C52512um.f137845d.createBuilder();
            ulVar.copyOnWrite();
            C52512um umVar = (C52512um) ulVar.instance;
            umVar.f137847a |= 1;
            umVar.f137848b = str;
            ulVar.copyOnWrite();
            C52512um umVar2 = (C52512um) ulVar.instance;
            umVar2.f137847a |= 2;
            umVar2.f137849c = z;
            ukVar.mo53878a(ulVar);
            this.f88434d = C33136x.m61487d((C52513un) ukVar.build(), this.f88434d);
        }
    }

    /* renamed from: d */
    public final boolean mo38504d() {
        C51953ff ffVar = this.f88434d;
        if (ffVar == null) {
            return false;
        }
        if (C33136x.m61490g("omwh_confirmation_form_field_id", ffVar).isPresent() || C33136x.m61490g("omwh_information_form_field_id", this.f88434d).isPresent()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo38505e() {
        C51953ff ffVar = this.f88434d;
        if (ffVar == null) {
            return false;
        }
        Optional g = C33136x.m61490g("omwh_information_form_field_id", ffVar);
        if (g.isPresent() && !((C51941eu) g.get()).f136281i) {
            return true;
        }
        return false;
    }
}
