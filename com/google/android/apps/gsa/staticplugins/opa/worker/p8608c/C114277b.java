package com.google.android.apps.gsa.staticplugins.opa.worker.p8608c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84924b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.C91143w;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8377b.C109403d;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p4008y.p4009a.C53543ac;
import com.google.assistant.p4008y.p4009a.C53544ad;
import com.google.assistant.p4008y.p4009a.C53545ae;
import com.google.assistant.p4008y.p4009a.C53548ah;
import com.google.assistant.p4008y.p4009a.C53549ai;
import com.google.assistant.p4008y.p4009a.C53550aj;
import com.google.assistant.p4008y.p4009a.C53556ap;
import com.google.assistant.p4008y.p4009a.C53594c;
import com.google.assistant.p4008y.p4009a.C53595d;
import com.google.assistant.p4008y.p4009a.C53599h;
import com.google.assistant.p4008y.p4009a.C53600i;
import com.google.assistant.p4008y.p4009a.C53603l;
import com.google.assistant.p4008y.p4009a.C53604m;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.assistant.p4008y.p4009a.C53607p;
import com.google.assistant.p4008y.p4009a.C53608q;
import com.google.assistant.p4008y.p4009a.C53612u;
import com.google.assistant.p4008y.p4015e.C53670f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import com.google.protobuf.C62910ar;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.c.b */
/* compiled from: PG */
public final class C114277b extends C86734a implements C84924b {

    /* renamed from: f */
    private static final C59071e f316891f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.c.b");

    /* renamed from: a */
    public final C113869cx f316892a;

    /* renamed from: b */
    public final C68214a f316893b;

    /* renamed from: c */
    public final C68214a f316894c;

    /* renamed from: g */
    private final C86124t f316895g;

    /* renamed from: h */
    private final C108013bm f316896h;

    /* renamed from: i */
    private final C68214a f316897i;

    /* renamed from: j */
    private final Context f316898j;

    /* renamed from: k */
    private final String f316899k;

    /* renamed from: l */
    private final C85757cq f316900l;

    /* renamed from: m */
    private final C113880k f316901m;

    /* renamed from: n */
    private final C58881cr f316902n;

    /* renamed from: o */
    private final C58833ax f316903o;

    public C114277b(C86124t tVar, C108013bm bmVar, C113869cx cxVar, C68214a aVar, C68214a aVar2, Context context, String str, C68214a aVar3, C58881cr crVar, C58833ax axVar, C85757cq cqVar, C113880k kVar) {
        super(C118575h.WORKER_OPA_ONBOARDING, "opaonboarding");
        this.f316895g = tVar;
        this.f316896h = bmVar;
        this.f316897i = aVar3;
        this.f316893b = aVar;
        this.f316892a = cxVar;
        this.f316894c = aVar2;
        this.f316898j = context;
        this.f316899k = str;
        this.f316902n = crVar;
        this.f316903o = axVar;
        this.f316900l = cqVar;
        this.f316901m = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo78592a() {
        if (!this.f316895g.mo79746e(C90037cp.f248401I)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (!((bm) this.f316893b.mo27525b()).u()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C58836b.f156633a);
        }
        int i = true != ((Boolean) this.f316902n.mo6453a()).booleanValue() ? 2 : 3;
        boolean z = this.f316903o.mo56113h() && ((C74713bn) this.f316903o.mo56107c()).mo71078c();
        C53545ae aeVar = (C53545ae) C53548ah.f140519n.createBuilder();
        C53549ai aiVar = (C53549ai) C53550aj.f140536b.createBuilder();
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f316895g.mo79758x(C90037cp.f248597do).split(",")));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            if (!str.isEmpty()) {
                try {
                    arrayList2.add(C53556ap.m86864a(str));
                } catch (IllegalArgumentException e) {
                    C59104x c = f316891f.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "OpaOnboardingWorker");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(28905)).mo56389s("Unsupported Chalkboard context specified in the AgsaOpaGrowth__supported_chalkboard_contexts flag: %s", str);
                }
            }
        }
        aiVar.mo53996a(arrayList2);
        aeVar.copyOnWrite();
        C53548ah ahVar = (C53548ah) aeVar.instance;
        C53550aj ajVar = (C53550aj) aiVar.build();
        ajVar.getClass();
        ahVar.f140527g = ajVar;
        ahVar.f140521a |= 32;
        C52431rm rmVar = C52431rm.OPA_AGSA;
        aeVar.copyOnWrite();
        C53548ah ahVar2 = (C53548ah) aeVar.instance;
        ahVar2.f140522b = rmVar.f137633ah;
        ahVar2.f140521a |= 1;
        aeVar.copyOnWrite();
        C53548ah ahVar3 = (C53548ah) aeVar.instance;
        ahVar3.f140523c = i - 1;
        ahVar3.f140521a |= 2;
        aeVar.copyOnWrite();
        C53548ah ahVar4 = (C53548ah) aeVar.instance;
        ahVar4.f140521a |= 1024;
        ahVar4.f140531k = z;
        String b = ((bm) this.f316893b.mo27525b()).b();
        aeVar.copyOnWrite();
        C53548ah ahVar5 = (C53548ah) aeVar.instance;
        b.getClass();
        ahVar5.f140521a |= 4;
        ahVar5.f140524d = b;
        String id = TimeZone.getDefault().getID();
        aeVar.copyOnWrite();
        C53548ah ahVar6 = (C53548ah) aeVar.instance;
        id.getClass();
        ahVar6.f140521a |= 16;
        ahVar6.f140526f = id;
        String country = Locale.getDefault().getCountry();
        aeVar.copyOnWrite();
        C53548ah ahVar7 = (C53548ah) aeVar.instance;
        country.getClass();
        ahVar7.f140521a |= 8;
        ahVar7.f140525e = country;
        aeVar.mo53995a(this.f316900l.mo6453a());
        boolean g = this.f316901m.mo100741g();
        aeVar.copyOnWrite();
        C53548ah ahVar8 = (C53548ah) aeVar.instance;
        ahVar8.f140521a |= 128;
        ahVar8.f140529i = !g;
        String x = this.f316895g.mo79758x(C90037cp.f248613i);
        if (!TextUtils.isEmpty(x)) {
            aeVar.copyOnWrite();
            C53548ah ahVar9 = (C53548ah) aeVar.instance;
            x.getClass();
            ahVar9.f140521a |= 8192;
            ahVar9.f140533m = x;
        }
        C53603l lVar = (C53603l) C53604m.f140690f.createBuilder();
        C53612u uVar = C53612u.f140716a;
        lVar.copyOnWrite();
        C53604m mVar = (C53604m) lVar.instance;
        uVar.getClass();
        mVar.f140693b = uVar;
        mVar.f140692a |= 1;
        if (this.f316895g.mo79746e(C90037cp.f248400H)) {
            C53594c cVar = (C53594c) C53595d.f140670d.createBuilder();
            String str2 = this.f316899k;
            cVar.copyOnWrite();
            C53595d dVar = (C53595d) cVar.instance;
            str2.getClass();
            dVar.f140672a |= 2;
            dVar.f140673b = str2;
            C58135f a = C91143w.m148923a(this.f316898j);
            cVar.copyOnWrite();
            C53595d dVar2 = (C53595d) cVar.instance;
            a.getClass();
            dVar2.f140674c = a;
            dVar2.f140672a |= 4;
            C53595d dVar3 = (C53595d) cVar.build();
            C53599h hVar = (C53599h) C53600i.f140681c.createBuilder();
            hVar.copyOnWrite();
            C53600i iVar = (C53600i) hVar.instance;
            dVar3.getClass();
            iVar.f140684b = dVar3;
            iVar.f140683a |= 2;
            lVar.copyOnWrite();
            C53604m mVar2 = (C53604m) lVar.instance;
            C53600i iVar2 = (C53600i) hVar.build();
            iVar2.getClass();
            mVar2.f140694c = iVar2;
            mVar2.f140692a |= 2;
        }
        if (this.f316895g.mo79746e(C90037cp.f248466au)) {
            C53607p pVar = (C53607p) C53608q.f140706d.createBuilder();
            String x2 = this.f316895g.mo79758x(C90037cp.f248489bQ);
            pVar.copyOnWrite();
            C53608q qVar = (C53608q) pVar.instance;
            x2.getClass();
            qVar.f140708a |= 2;
            qVar.f140710c = x2;
            C53608q qVar2 = (C53608q) pVar.build();
            lVar.copyOnWrite();
            C53604m mVar3 = (C53604m) lVar.instance;
            qVar2.getClass();
            mVar3.f140695d = qVar2;
            mVar3.f140692a |= 4;
            C53543ac acVar = (C53543ac) C53544ad.f140512d.createBuilder();
            String str3 = this.f316899k;
            acVar.copyOnWrite();
            C53544ad adVar = (C53544ad) acVar.instance;
            str3.getClass();
            adVar.f140514a = 1 | adVar.f140514a;
            adVar.f140515b = str3;
            C58135f a2 = C91143w.m148923a(this.f316898j);
            acVar.copyOnWrite();
            C53544ad adVar2 = (C53544ad) acVar.instance;
            a2.getClass();
            adVar2.f140516c = a2;
            adVar2.f140514a = 2 | adVar2.f140514a;
            C53544ad adVar3 = (C53544ad) acVar.build();
            aeVar.copyOnWrite();
            C53548ah ahVar10 = (C53548ah) aeVar.instance;
            adVar3.getClass();
            ahVar10.f140532l = adVar3;
            ahVar10.f140521a |= 4096;
        }
        C53548ah ahVar11 = (C53548ah) aeVar.build();
        lVar.copyOnWrite();
        C53604m mVar4 = (C53604m) lVar.instance;
        ahVar11.getClass();
        mVar4.f140696e = ahVar11;
        mVar4.f140692a |= 8;
        return C60856cj.m92900i(C58833ax.m90834k((C53604m) lVar.build()));
    }

    /* renamed from: b */
    public final C60870cx mo78593b() {
        if (!this.f316895g.mo79746e(C90053de.f248939F)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (!((bm) this.f316893b.mo27525b()).u()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C58836b.f156633a);
        } else if (!this.f316892a.mo100733f(this.f316895g, e.bu)) {
            return C60856cj.m92900i(C58836b.f156633a);
        } else {
            return C60922j.m93044g(this.f316896h.mo96368y(), new C114276a(this), C60826bg.f164896a);
        }
    }

    /* renamed from: c */
    public final C60870cx mo78594c(C53606o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        return ((C109403d) this.f316897i.mo27525b()).mo97814a(oVar);
    }

    /* renamed from: d */
    public final C60870cx mo78595d(C53670f fVar) {
        long j;
        C58976aa aaVar = C58975e.f156826a;
        C108013bm bmVar = this.f316896h;
        if ((fVar.f140875a & 2) != 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C62910ar arVar = fVar.f140877c;
            if (arVar == null) {
                arVar = C62910ar.f169858c;
            }
            j = timeUnit.toMinutes(arVar.f169860a);
        } else {
            j = 0;
        }
        return bmVar.f300493i.mo96378g(9, 14, bmVar.mo96362s(), fVar.toByteArray(), j);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
