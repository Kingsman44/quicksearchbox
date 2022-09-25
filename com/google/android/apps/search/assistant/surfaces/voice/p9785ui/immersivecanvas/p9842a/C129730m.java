package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129710g;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51851bl;
import com.google.assistant.p3897e.p3921j.p3926e.C51854bo;
import com.google.assistant.p3897e.p3921j.p3926e.C51856bq;
import com.google.assistant.p3897e.p3921j.p3926e.C51859bt;
import com.google.assistant.p3897e.p3921j.p3926e.C51885cs;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66629d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.m */
/* compiled from: PG */
public final class C129730m implements C17268f {

    /* renamed from: a */
    private static final C59071e f355994a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.m");

    /* renamed from: b */
    private static final C33480d f355995b = C33480d.m62053a("show_html_immersive_args", "assistant.api.client_op.ui.ShowHtmlImmersiveArgs", C51885cs.f136078y);

    /* renamed from: c */
    private final C129711b f355996c;

    /* renamed from: d */
    private final C129710g f355997d;

    /* renamed from: e */
    private int f355998e = 0;

    /* renamed from: f */
    private int f355999f = 2;

    public C129730m(C129711b bVar, C129710g gVar) {
        this.f355996c = bVar;
        this.f355997d = gVar;
    }

    /* renamed from: a */
    public final void mo23256a() {
        ((C59052c) ((C59052c) f355994a.mo56224b()).mo56372aa(38434)).mo56386p("CMM session completed successfully");
        this.f355996c.mo109203c(this.f355999f);
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f355994a.mo56226d()).mo56382g(th)).mo56372aa(38435)).mo56386p("CMM session ended with error");
        this.f355997d.mo109200a();
        this.f355996c.mo109203c(this.f355999f);
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        Object obj;
        C52076ei eiVar;
        int a;
        C51854bo boVar;
        C62940bt r0 = C62942bv.checkIsLite(C66629d.f181275b);
        ciVar.mo58887l(r0);
        Object l = ciVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C52081en enVar = ((C51195j) obj).f133275j;
        if (enVar == null) {
            enVar = C52081en.f136679i;
        }
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                eiVar = (C52076ei) epVar.f136693c;
            } else {
                eiVar = C52076ei.f136664f;
            }
            C51809dy dyVar = eiVar.f136668c;
            if (dyVar == null) {
                dyVar = C51809dy.f135933f;
            }
            if (dyVar.f135936b.equals("ui.SHOW_HTML_IMMERSIVE")) {
                C33480d dVar = f355995b;
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                C51885cs csVar = (C51885cs) dVar.mo38883d(dwVar.f135932a);
                C51859bt btVar = csVar.f136085d;
                if (btVar == null) {
                    btVar = C51859bt.f136033c;
                }
                int i = 1;
                if (btVar.f136035a == 5) {
                    C129711b bVar = this.f355996c;
                    C51859bt btVar2 = csVar.f136085d;
                    if (btVar2 == null) {
                        btVar2 = C51859bt.f136033c;
                    }
                    if (btVar2.f136035a == 5) {
                        boVar = (C51854bo) btVar2.f136036b;
                    } else {
                        boVar = C51854bo.f136022e;
                    }
                    C51851bl blVar = (C51851bl) boVar.toBuilder();
                    int i2 = this.f355998e;
                    blVar.copyOnWrite();
                    C51854bo boVar2 = (C51854bo) blVar.instance;
                    boVar2.f136024a |= 2;
                    boVar2.f136027d = (long) i2;
                    bVar.mo109201a((C51854bo) blVar.build());
                    this.f355998e++;
                } else {
                    C51859bt btVar3 = csVar.f136085d;
                    if (btVar3 == null) {
                        btVar3 = C51859bt.f136033c;
                    }
                    if (btVar3.f136035a == 7) {
                        this.f355997d.mo109200a();
                        C51859bt btVar4 = csVar.f136085d;
                        if (btVar4 == null) {
                            btVar4 = C51859bt.f136033c;
                        }
                        if (btVar4.f136035a == 7 && (a = C51856bq.m86401a(((Integer) btVar4.f136036b).intValue())) != 0) {
                            i = a;
                        }
                        this.f355999f = i;
                    }
                }
            }
        }
    }
}
