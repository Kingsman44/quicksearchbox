package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4546c.C59401i;
import com.google.common.p4543n.p4546c.C59405m;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fb */
/* compiled from: PG */
public final class C96206fb extends C83870ad {

    /* renamed from: a */
    public static final C59071e f269286a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fb");

    /* renamed from: b */
    static final Duration f269287b = Duration.ofSeconds(1);

    /* renamed from: c */
    static final Duration f269288c;

    /* renamed from: d */
    public static final C59407o f269289d;

    /* renamed from: e */
    public final C60888db f269290e;

    /* renamed from: f */
    public final C96410mq f269291f;

    /* renamed from: g */
    public final String f269292g;

    /* renamed from: h */
    public final C95299e f269293h;

    /* renamed from: i */
    public final AtomicReference f269294i;

    /* renamed from: j */
    public final long f269295j;

    /* renamed from: k */
    public final AtomicReference f269296k = new AtomicReference();

    /* renamed from: l */
    public C96205fa f269297l = C96205fa.PENDING;

    /* renamed from: m */
    public final boolean f269298m;

    /* renamed from: n */
    public final C60950i f269299n;

    /* renamed from: o */
    public final C83893b f269300o;

    /* renamed from: p */
    public final boolean f269301p;

    /* renamed from: q */
    private final C89492cd f269302q;

    /* renamed from: r */
    private final C84026u f269303r;

    /* renamed from: s */
    private final C69464a f269304s;

    /* renamed from: t */
    private final boolean f269305t;

    /* renamed from: u */
    private final String f269306u;

    /* renamed from: v */
    private final AtomicReference f269307v;

    static {
        Duration ofSeconds = Duration.ofSeconds(2);
        f269288c = ofSeconds;
        f269289d = new C59405m(new C59401i(C59407o.m92308d(ofSeconds), 2.0d, 5), 0.5d);
    }

    public C96206fb(C90021c cVar, C96410mq mqVar, C90851k kVar, C84026u uVar, C69464a aVar, C89492cd cdVar, boolean z, String str, String str2, C95299e eVar, AtomicReference atomicReference, AtomicReference atomicReference2, C60950i iVar, C83893b bVar) {
        this.f269291f = mqVar;
        this.f269290e = kVar.mo85208a("DataLayerApiBackground");
        this.f269303r = uVar;
        this.f269304s = aVar;
        this.f269302q = cdVar;
        this.f269293h = eVar;
        this.f269300o = bVar;
        boolean z2 = true;
        this.f269305t = z && str != null;
        this.f269292g = C58837ba.m90858g(str);
        str2.getClass();
        this.f269306u = str2;
        this.f269307v = atomicReference;
        this.f269294i = atomicReference2;
        this.f269295j = cVar.mo79743a(C90122ft.f250874m);
        boolean e = cVar.mo79746e(C90122ft.f250878q);
        this.f269298m = e;
        this.f269301p = (!e || !cVar.mo79746e(C90122ft.f250866e)) ? false : z2;
        this.f269299n = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo90005a() {
        C96201ex exVar = (C96201ex) this.f269296k.getAndSet((Object) null);
        if (exVar != null) {
            return C60846c.m92878g(C60838bs.m92859i(this.f269291f.mo90111a(exVar)), Exception.class, C96198eu.f269269a, this.f269290e);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final boolean mo90006b(byte[] bArr) {
        if (bArr == null) {
            C59104x d = f269286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDataLayerSeq");
            ((C59052c) ((C59052c) d).mo56372aa(16996)).mo56386p("Data is null.");
            return false;
        }
        try {
            C63138d dVar = (C63138d) C62942bv.parseFrom((C62942bv) C63138d.f170494j, bArr, C62921ba.m95368a());
            if ((dVar.f170496a & 1) != 0) {
                C58976aa aaVar = C58975e.f156826a;
                C95299e eVar = this.f269293h;
                String str = dVar.f170497b;
                if (eVar.f266649d) {
                    C59104x d2 = C95299e.f266645a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
                    ((C59052c) ((C59052c) d2).mo56372aa(14859)).mo56389s("session ended already %s", eVar.f266648c);
                }
                eVar.f266652g = true;
                eVar.mo89236f((C60292ne) eVar.mo89231a(str, (C124548d) null).build());
                this.f269307v.set(dVar);
                return true;
            }
            C59104x d3 = f269286a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "BistoDataLayerSeq");
            ((C59052c) ((C59052c) d3).mo56372aa(16995)).mo56386p("No Model ID.");
            return false;
        } catch (C62974ct e) {
            C59104x d4 = f269286a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "BistoDataLayerSeq");
            ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e)).mo56372aa(16994)).mo56386p("Error parsing proto.");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        if (!this.f269305t || this.f269297l == C96205fa.SUCCEEDED) {
            return C58836b.f156633a;
        }
        if (this.f269297l == C96205fa.FAILED) {
            this.f269297l = C96205fa.PENDING;
            return C58833ax.m90834k(C83875ai.m133540e(new C96226fv(), C96226fv.m159529h("DataLayerInitFailed", R.string.bisto_error_connect_device)));
        }
        this.f269302q.mo83394aj(this.f269306u, (C124636bb) null, C124633az.OOBE_IN_PROGRESS);
        return C58833ax.m90834k(this.f269303r.mo77487a(C60922j.m93044g(C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(C60922j.m93044g(this.f269291f.mo90113c(this.f269292g, 1), new C96197et(this), this.f269290e)), new C96190em(this), this.f269290e), C96191en.f269259a, C60826bg.f164896a), new C96192eo(this), C60826bg.f164896a), this.f269304s));
    }
}
