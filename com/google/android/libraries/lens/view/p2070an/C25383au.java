package com.google.android.libraries.lens.view.p2070an;

import android.content.Context;
import android.graphics.RectF;
import com.google.android.libraries.lens.common.p1999b.C24103a;
import com.google.android.libraries.lens.ondevice.p2037n.C24770ac;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24207aj;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.p2014e.C24228t;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.p2054ae.C25024w;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25396af;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25397ag;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2081au.C25564n;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.session.C27761ax;
import com.google.android.libraries.lens.view.session.ondevice.C27910aa;
import com.google.android.libraries.lens.view.session.ondevice.C28017z;
import com.google.android.libraries.lens.view.session.ondevice.p2169d.C27953i;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62444bu;
import com.google.lens.p4707j.C62445bv;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56219a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56300d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56317o;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56321s;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56326x;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56328z;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.an.au */
/* compiled from: PG */
public final class C25383au implements C25369ag {

    /* renamed from: a */
    public static final C58974d f69112a = C58974d.m91135i("MainLensQueryManager");

    /* renamed from: A */
    private C58833ax f69113A = C58836b.f156633a;

    /* renamed from: B */
    private C24201ad f69114B;

    /* renamed from: b */
    public final Executor f69115b;

    /* renamed from: c */
    private final C58881cr f69116c;

    /* renamed from: d */
    private final C58881cr f69117d;

    /* renamed from: e */
    private final Context f69118e;

    /* renamed from: f */
    private final C58485gu f69119f;

    /* renamed from: g */
    private final C58485gu f69120g;

    /* renamed from: h */
    private final C25543z f69121h;

    /* renamed from: i */
    private final C25050av f69122i;

    /* renamed from: j */
    private final C27761ax f69123j;

    /* renamed from: k */
    private final LensConnectivityManager f69124k;

    /* renamed from: l */
    private final C37215b f69125l;

    /* renamed from: m */
    private final C27953i f69126m;

    /* renamed from: n */
    private final boolean f69127n;

    /* renamed from: o */
    private final boolean f69128o;

    /* renamed from: p */
    private final boolean f69129p;

    /* renamed from: q */
    private final boolean f69130q;

    /* renamed from: r */
    private final boolean f69131r;

    /* renamed from: s */
    private final boolean f69132s;

    /* renamed from: t */
    private final C24770ac f69133t;

    /* renamed from: u */
    private boolean f69134u;

    /* renamed from: v */
    private boolean f69135v;

    /* renamed from: w */
    private C56280cg f69136w = C28130s.m52411b(C56306df.AUTO_FILTER);

    /* renamed from: x */
    private boolean f69137x;

    /* renamed from: y */
    private boolean f69138y;

    /* renamed from: z */
    private final C27232l f69139z;

    public C25383au(Context context, C25397ag agVar, C27232l lVar, C27910aa aaVar, C58833ax axVar, C58833ax axVar2, C25024w wVar, C25050av avVar, C27761ax axVar3, C25543z zVar, LensConnectivityManager lensConnectivityManager, C37215b bVar, Executor executor, C27953i iVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C24770ac acVar) {
        this.f69118e = context;
        this.f69139z = lVar;
        C58833ax axVar4 = axVar;
        this.f69119f = (C58485gu) axVar.mo56109e(C58485gu.m89845m());
        C58833ax axVar5 = axVar2;
        this.f69120g = (C58485gu) axVar2.mo56109e(C58485gu.m89845m());
        this.f69121h = zVar;
        this.f69122i = avVar;
        this.f69123j = axVar3;
        this.f69125l = bVar;
        this.f69124k = lensConnectivityManager;
        this.f69115b = executor;
        this.f69126m = iVar;
        this.f69127n = z;
        this.f69128o = z3;
        this.f69129p = z4;
        this.f69130q = z5;
        this.f69131r = z6;
        this.f69132s = z2;
        this.f69133t = acVar;
        C25397ag agVar2 = agVar;
        C25024w wVar2 = wVar;
        this.f69116c = C58886cw.m90973a(new C25375am(agVar, wVar));
        Objects.requireNonNull(aaVar);
        C27910aa aaVar2 = aaVar;
        this.f69117d = C58886cw.m90973a(new C25376an(aaVar));
    }

    /* renamed from: h */
    private final C58833ax m46744h() {
        C60870cx cxVar;
        if (!this.f69130q && !this.f69131r) {
            return C58836b.f156633a;
        }
        C27953i iVar = this.f69126m;
        C56280cg cgVar = this.f69136w;
        if (!this.f69135v || !iVar.mo33429b(cgVar)) {
            cxVar = C60856cj.m92899h(new IllegalStateException("Hybrid candidate requirements not fulfilled"));
        } else {
            cxVar = iVar.f76108a.mo33437j();
        }
        return C58833ax.m90834k(C27953i.m52034a(cxVar));
    }

    /* renamed from: i */
    private final C60870cx m46745i(C24201ad adVar, boolean z, C24209al alVar) {
        C25367ae aeVar = (C25367ae) Collection.EL.stream(this.f69119f).filter(new C25380ar()).findFirst().orElse(null);
        if (aeVar != null) {
            ((C58970a) ((C58970a) f69112a.mo56224b()).mo56372aa(49865)).mo56354G("Query[%s] executing with handler %s", adVar.mo29680c(), aeVar.getClass().getSimpleName());
            return aeVar.mo30414a(adVar, alVar);
        }
        C56280cg cgVar = this.f69136w;
        boolean z2 = false;
        if (this.f69132s && this.f69139z.mo32705k().mo56113h() && ((RectF[]) this.f69139z.mo32705k().mo56107c()).length != 0 && C28130s.m52412c(cgVar, C56306df.AUTO_FILTER)) {
            C58838bb.m90869d(this.f69139z.mo32705k().mo56113h(), "External Gleam Boxes must be present");
            C25762k a = C25372aj.m46734a(alVar, this.f69115b, "MainLensQueryManager.queryForExternalGleams[" + String.valueOf(adVar.mo29680c()) + "]");
            RectF[] rectFArr = (RectF[]) this.f69139z.mo32705k().mo56107c();
            C56328z zVar = (C56328z) C56220aa.f149748b.createBuilder();
            for (int i = 0; i < rectFArr.length; i++) {
                RectF rectF = rectFArr[i];
                C56219a aVar = (C56219a) C56327y.f150136i.createBuilder();
                C56321s sVar = (C56321s) C56324v.f150122c.createBuilder();
                C56323u uVar = C56323u.GLEAM;
                sVar.copyOnWrite();
                C56324v vVar = (C56324v) sVar.instance;
                vVar.f150125b = uVar.f150121l;
                vVar.f150124a |= 1;
                aVar.copyOnWrite();
                C56327y yVar = (C56327y) aVar.instance;
                C56324v vVar2 = (C56324v) sVar.build();
                vVar2.getClass();
                yVar.f150144g = vVar2;
                yVar.f150138a |= 32;
                C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
                C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
                float centerX = rectF.centerX();
                bqVar.copyOnWrite();
                C62441br brVar = (C62441br) bqVar.instance;
                brVar.f168610a |= 1;
                brVar.f168611b = centerX;
                float centerY = rectF.centerY();
                bqVar.copyOnWrite();
                C62441br brVar2 = (C62441br) bqVar.instance;
                brVar2.f168610a |= 2;
                brVar2.f168612c = centerY;
                float width = rectF.width();
                bqVar.copyOnWrite();
                C62441br brVar3 = (C62441br) bqVar.instance;
                brVar3.f168610a |= 4;
                brVar3.f168613d = width;
                float height = rectF.height();
                bqVar.copyOnWrite();
                C62441br brVar4 = (C62441br) bqVar.instance;
                brVar4.f168610a |= 8;
                brVar4.f168614e = height;
                bqVar.copyOnWrite();
                C62441br brVar5 = (C62441br) bqVar.instance;
                brVar5.f168616g = 1;
                brVar5.f168610a |= 32;
                buVar.copyOnWrite();
                C62445bv bvVar = (C62445bv) buVar.instance;
                C62441br brVar6 = (C62441br) bqVar.build();
                brVar6.getClass();
                bvVar.f168621b = brVar6;
                bvVar.f168620a |= 1;
                aVar.copyOnWrite();
                C56327y yVar2 = (C56327y) aVar.instance;
                C62445bv bvVar2 = (C62445bv) buVar.build();
                bvVar2.getClass();
                yVar2.f150140c = bvVar2;
                yVar2.f150139b = 7;
                C56300d dVar = (C56300d) C56320r.f150092n.createBuilder();
                dVar.copyOnWrite();
                C56320r rVar = (C56320r) dVar.instance;
                rVar.f150095b = 5;
                rVar.f150094a |= 1;
                C56317o oVar = (C56317o) C56318p.f150087c.createBuilder();
                String a2 = C24103a.m44778a("external_gleam", Integer.toString(i));
                oVar.copyOnWrite();
                C56318p pVar = (C56318p) oVar.instance;
                pVar.f150089a |= 4;
                pVar.f150090b = a2;
                C56318p pVar2 = (C56318p) oVar.build();
                dVar.copyOnWrite();
                C56320r rVar2 = (C56320r) dVar.instance;
                pVar2.getClass();
                rVar2.f150101h = pVar2;
                rVar2.f150094a |= 128;
                C56326x xVar = C56326x.CARD;
                dVar.copyOnWrite();
                C56320r rVar3 = (C56320r) dVar.instance;
                rVar3.f150103j = xVar.f150135h;
                rVar3.f150094a |= 256;
                aVar.mo54332a(dVar);
                zVar.copyOnWrite();
                C56220aa aaVar = (C56220aa) zVar.instance;
                C56327y yVar3 = (C56327y) aVar.build();
                yVar3.getClass();
                aaVar.mo54334a();
                aaVar.f149750a.add(yVar3);
            }
            C24228t p = C24229u.m45204p();
            p.mo29724d((C56220aa) zVar.build());
            p.mo29727g(true);
            C24229u a3 = p.mo29721a();
            C25432d dVar2 = new C25432d(adVar, a, a3);
            C24207aj c = C24208ak.m45056e(adVar).mo29698c();
            c.mo29694b(a3);
            a.mo30913c(c.mo29693a(), false);
            a.f70025a.mo5436a(new C25377ao(((C25396af) this.f69116c.mo6453a()).mo30436d(adVar, dVar2.f69306b)), C60826bg.f164896a);
            return a.f70026b;
        } else if (m46747k(this.f69136w)) {
            C58974d dVar3 = f69112a;
            ((C58970a) ((C58970a) dVar3.mo56224b()).mo56372aa(49864)).mo56389s("Query[%s] executing for hints", adVar.mo29680c());
            if (this.f69137x && this.f69138y) {
                z2 = true;
            }
            C58838bb.m90883r(z2);
            if (z) {
                ((C58970a) ((C58970a) dVar3.mo56224b()).mo56372aa(49870)).mo56389s("Query[%s] fulfilling hints from server", adVar.mo29680c());
                return ((C25396af) this.f69116c.mo6453a()).mo30436d(adVar, alVar);
            } else if (this.f69124k.mo30907k()) {
                ((C58970a) ((C58970a) dVar3.mo56224b()).mo56372aa(49869)).mo56389s("Query[%s] fulfilling hints from hybrid", adVar.mo29680c());
                C25762k a4 = C25372aj.m46734a(alVar, this.f69115b, "MainLensQueryManager.Hybrid[" + String.valueOf(adVar.mo29680c()) + "]");
                C25435g gVar = new C25435g(adVar, a4);
                a4.f70025a.mo5436a(new C25374al(((C28017z) this.f69117d.mo6453a()).mo33466d(adVar, gVar.f69314b), ((C25396af) this.f69116c.mo6453a()).mo30436d(adVar, gVar.f69315c)), C60826bg.f164896a);
                return a4.f70026b;
            } else {
                ((C58970a) ((C58970a) dVar3.mo56224b()).mo56372aa(49868)).mo56389s("Query[%s] fulfilling hints from on-device", adVar.mo29680c());
                return ((C28017z) this.f69117d.mo6453a()).mo33466d(adVar, alVar);
            }
        } else if (this.f69137x) {
            ((C58970a) ((C58970a) f69112a.mo56224b()).mo56372aa(49863)).mo56389s("Query[%s] executing via on-device", adVar.mo29680c());
            return ((C28017z) this.f69117d.mo6453a()).mo33466d(adVar, alVar);
        } else {
            C58838bb.m90884s(this.f69138y, "no handler available for query");
            ((C58970a) ((C58970a) f69112a.mo56224b()).mo56372aa(49862)).mo56389s("Query[%s] executing via server", adVar.mo29680c());
            return ((C25396af) this.f69116c.mo6453a()).mo30436d(adVar, alVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0167  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m46746j(boolean r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.f69134u
            if (r1 != 0) goto L_0x0015
            com.google.common.f.a.d r1 = f69112a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "updateQueryEngines called while not started"
            r3 = 49872(0xc2d0, float:6.9886E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0015:
            boolean r1 = r0.f69135v
            com.google.bp.f.b.a.cg r2 = r0.f69136w
            com.google.common.base.ax r3 = r0.f69113A
            boolean r4 = r0.f69128o
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x002b
            com.google.bp.f.b.a.df r4 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            boolean r4 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r2, r4)
            if (r4 == 0) goto L_0x002b
        L_0x0029:
            r1 = 1
            goto L_0x0083
        L_0x002b:
            if (r1 != 0) goto L_0x0044
            com.google.bp.f.b.a.df r1 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            boolean r1 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r2, r1)
            if (r1 == 0) goto L_0x0044
            com.google.common.f.a.d r1 = f69112a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "shouldRunOnDeviceEngine offline and in translate filter"
            r3 = 49874(0xc2d2, float:6.9888E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0029
        L_0x0044:
            boolean r1 = r0.f69129p
            if (r1 == 0) goto L_0x005f
            com.google.bp.f.b.a.df r1 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TEXT
            boolean r1 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r2, r1)
            if (r1 == 0) goto L_0x005f
            com.google.common.f.a.d r1 = f69112a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "shouldRunOnDeviceEngine on-device text enabled and in text filter"
            r3 = 49873(0xc2d1, float:6.9887E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0029
        L_0x005f:
            com.google.bp.f.b.a.cg r1 = r0.f69136w
            boolean r1 = r0.m46747k(r1)
            if (r1 != 0) goto L_0x0029
            boolean r1 = r0.f69130q
            if (r1 == 0) goto L_0x0082
            com.google.android.libraries.lens.view.an.ak r1 = com.google.android.libraries.lens.view.p2070an.C25373ak.f69097a
            com.google.common.base.ax r1 = r3.mo56106b(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r1 = r1.mo56109e(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0082
            goto L_0x0029
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r1 == 0) goto L_0x0090
            com.google.bp.f.b.a.cg r2 = r0.f69136w
            boolean r2 = r0.m46747k(r2)
            if (r2 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r2 = 0
            goto L_0x0091
        L_0x0090:
            r2 = 1
        L_0x0091:
            boolean r3 = r0.f69137x
            if (r3 == 0) goto L_0x009d
            if (r1 == 0) goto L_0x009d
            boolean r3 = r0.f69138y
            if (r3 == r2) goto L_0x009d
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            com.google.common.f.a.d r4 = f69112a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            r7 = 49871(0xc2cf, float:6.9884E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r7)
            r7 = r4
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7
            com.google.bp.f.b.a.cg r4 = r0.f69136w
            com.google.protobuf.cq r8 = r4.f149994a
            int r8 = r8.size()
            if (r8 == 0) goto L_0x010d
            if (r8 == r6) goto L_0x00bf
            java.lang.String r4 = "INVALID (multiple)"
            goto L_0x010f
        L_0x00bf:
            com.google.protobuf.cq r4 = r4.f149994a
            java.lang.Object r4 = r4.get(r5)
            com.google.bp.f.b.a.ce r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce) r4
            int r8 = r4.f149991d
            com.google.bp.f.b.a.df r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.m87964a(r8)
            if (r8 != 0) goto L_0x00d1
            com.google.bp.f.b.a.df r8 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.UNKNOWN_FILTER_TYPE
        L_0x00d1:
            com.google.bp.f.b.a.df r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            if (r8 != r9) goto L_0x00fe
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r9 = r4.f149989b
            r10 = 3
            if (r9 != r10) goto L_0x00e2
            java.lang.Object r9 = r4.f149990c
            com.google.bp.f.b.a.cd r9 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd) r9
            goto L_0x00e4
        L_0x00e2:
            com.google.bp.f.b.a.cd r9 = com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd.f149981d
        L_0x00e4:
            java.lang.String r9 = r9.f149985c
            r8[r5] = r9
            int r5 = r4.f149989b
            if (r5 != r10) goto L_0x00f1
            java.lang.Object r4 = r4.f149990c
            com.google.bp.f.b.a.cd r4 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd) r4
            goto L_0x00f3
        L_0x00f1:
            com.google.bp.f.b.a.cd r4 = com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd.f149981d
        L_0x00f3:
            java.lang.String r4 = r4.f149984b
            r8[r6] = r4
            java.lang.String r4 = "TRANSLATE (%s -> %s)"
            java.lang.String r4 = java.lang.String.format(r4, r8)
            goto L_0x010f
        L_0x00fe:
            int r4 = r4.f149991d
            com.google.bp.f.b.a.df r4 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.m87964a(r4)
            if (r4 != 0) goto L_0x0108
            com.google.bp.f.b.a.df r4 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.UNKNOWN_FILTER_TYPE
        L_0x0108:
            java.lang.String r4 = r4.name()
            goto L_0x010f
        L_0x010d:
            java.lang.String r4 = "INVALID (empty)"
        L_0x010f:
            r9 = r4
            java.lang.String r8 = "updateQueryEngines filter=%s (changed=%b) connected=%b (changed=%b) onDevice=(%b->%b, restart=%b) server=(%b->%b)"
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r19)
            boolean r4 = r0.f69135v
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r20)
            boolean r4 = r0.f69137x
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r0.f69138y
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r2)
            r7.mo56365R(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r4 = r0.f69137x
            if (r4 == 0) goto L_0x0154
            if (r1 == 0) goto L_0x0143
            if (r3 == 0) goto L_0x0154
        L_0x0143:
            com.google.android.libraries.lens.ondevice.n.ac r4 = r0.f69133t
            boolean r4 = r4.f67685c
            if (r4 != 0) goto L_0x0154
            com.google.common.base.cr r4 = r0.f69117d
            java.lang.Object r4 = r4.mo6453a()
            com.google.android.libraries.lens.view.session.ondevice.z r4 = (com.google.android.libraries.lens.view.session.ondevice.C28017z) r4
            r4.mo33470h()
        L_0x0154:
            boolean r4 = r0.f69138y
            if (r4 == 0) goto L_0x0165
            if (r2 != 0) goto L_0x0165
            com.google.common.base.cr r4 = r0.f69116c
            java.lang.Object r4 = r4.mo6453a()
            com.google.android.libraries.lens.view.an.b.af r4 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25396af) r4
            r4.mo29856b()
        L_0x0165:
            if (r1 == 0) goto L_0x01d3
            boolean r4 = r0.f69137x
            if (r4 == 0) goto L_0x01a2
            if (r3 == 0) goto L_0x016e
            goto L_0x01a2
        L_0x016e:
            if (r19 == 0) goto L_0x0190
            com.google.common.base.cr r3 = r0.f69117d
            java.lang.Object r3 = r3.mo6453a()
            com.google.android.libraries.lens.view.session.ondevice.z r3 = (com.google.android.libraries.lens.view.session.ondevice.C28017z) r3
            com.google.bp.f.b.a.cg r4 = r0.f69136w
            com.google.android.libraries.lens.view.session.ondevice.x r5 = r3.f76247j
            if (r5 == 0) goto L_0x018d
            com.google.common.f.a.d r3 = com.google.android.libraries.lens.view.session.ondevice.C28017z.f76238a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Ignoring filter selection update, engine query in progress"
            r5 = 49984(0xc340, float:7.0043E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0190
        L_0x018d:
            r3.mo33473k(r4)
        L_0x0190:
            if (r20 == 0) goto L_0x01d3
            boolean r3 = r0.f69130q
            if (r3 == 0) goto L_0x01d3
            com.google.common.base.cr r3 = r0.f69117d
            java.lang.Object r3 = r3.mo6453a()
            com.google.android.libraries.lens.view.session.ondevice.z r3 = (com.google.android.libraries.lens.view.session.ondevice.C28017z) r3
            r3.mo33468f()
            goto L_0x01d3
        L_0x01a2:
            com.google.common.base.cr r3 = r0.f69117d
            java.lang.Object r3 = r3.mo6453a()
            com.google.android.libraries.lens.view.session.ondevice.z r3 = (com.google.android.libraries.lens.view.session.ondevice.C28017z) r3
            com.google.bp.f.b.a.cg r4 = r0.f69136w
            com.google.android.libraries.lens.view.p2070an.C25387ay.m46760a()
            r3.f76248k = r4
            com.google.android.libraries.lens.view.session.ondevice.a.bi r5 = r3.f76242e
            com.google.android.libraries.lens.view.session.ondevice.w r6 = new com.google.android.libraries.lens.view.session.ondevice.w
            r6.<init>(r3)
            r5.mo33358i(r6)
            r3.mo33468f()
            com.google.android.libraries.lens.view.session.ondevice.a.bi r5 = r3.f76242e
            r5.mo33355e(r4)
            r3.mo33471i()
            com.google.bp.f.b.a.df r5 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.TRANSLATE
            boolean r4 = com.google.android.libraries.lens.view.utils.C28130s.m52412c(r4, r5)
            if (r4 == 0) goto L_0x01d3
            com.google.android.libraries.lens.view.session.ondevice.ak r3 = r3.f76241d
            r3.mo33374c()
        L_0x01d3:
            boolean r3 = r0.f69138y
            if (r3 != 0) goto L_0x01e4
            if (r2 == 0) goto L_0x01e4
            com.google.common.base.cr r3 = r0.f69116c
            java.lang.Object r3 = r3.mo6453a()
            com.google.android.libraries.lens.view.an.b.af r3 = (com.google.android.libraries.lens.view.p2070an.p2072b.C25396af) r3
            r3.mo29855a()
        L_0x01e4:
            r0.f69137x = r1
            r0.f69138y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2070an.C25383au.m46746j(boolean, boolean):void");
    }

    /* renamed from: k */
    private final boolean m46747k(C56280cg cgVar) {
        return this.f69121h.mo30591a() && this.f69127n && C28130s.m52412c(cgVar, C56306df.AUTO_FILTER);
    }

    /* renamed from: a */
    public final C25564n mo30417a() {
        if (!this.f69134u) {
            ((C58970a) ((C58970a) f69112a.mo56226d()).mo56372aa(49861)).mo56386p("getResultSource called when not started, value is meaningless!");
        }
        if (!this.f69137x) {
            return C25564n.ONLINE;
        }
        C28017z zVar = (C28017z) this.f69117d.mo6453a();
        C56280cg cgVar = zVar.f76248k;
        if (cgVar == null || !C28130s.m52412c(cgVar, C56306df.TRANSLATE) || !zVar.f76241d.mo33379h()) {
            return C25564n.ON_DEVICE;
        }
        return C25564n.HYBRID;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.google.android.libraries.lens.view.an.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo30418b(com.google.android.libraries.lens.p2014e.C24201ad r20, boolean r21, com.google.android.libraries.lens.p2014e.C24209al r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f69134u
            java.lang.String r4 = "executing query while not started"
            com.google.common.base.C58838bb.m90884s(r3, r4)
            com.google.android.libraries.lens.e.ae r3 = r20.mo29679b()
            com.google.bp.f.b.a.cg r3 = r3.mo29686c()
            com.google.bp.f.b.a.cg r4 = r0.f69136w
            boolean r3 = r3.equals(r4)
            r4 = 1
            r3 = r3 ^ r4
            com.google.android.libraries.lens.e.ae r5 = r20.mo29679b()
            com.google.bp.f.b.a.cg r5 = r5.mo29686c()
            r0.f69136w = r5
            com.google.common.base.ax r5 = r20.mo29682e()
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x0037
            com.google.common.base.ax r5 = r19.m46744h()
            r0.f69113A = r5
        L_0x0037:
            com.google.common.f.a.d r5 = f69112a
            com.google.common.f.x r6 = r5.mo56224b()
            com.google.android.libraries.lens.e.af r7 = r20.mo29680c()
            r8 = 49866(0xc2ca, float:6.9877E-41)
            java.lang.String r9 = "Query[%s] configuring engines"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r8)).mo56389s(r9, r7)
            r6 = 0
            r0.m46746j(r3, r6)
            com.google.android.libraries.lens.e.s r3 = r20.mo29678a()
            com.google.common.base.ax r7 = r20.mo29682e()
            java.lang.Object r7 = r7.mo56111f()
            com.google.android.libraries.lens.e.y r7 = (com.google.android.libraries.lens.p2014e.C24233y) r7
            com.google.android.libraries.lens.e.ah r8 = r20.mo29681d()
            com.google.protobuf.z r8 = r8.mo29692b()
            com.google.android.libraries.lens.e.ad r9 = r0.f69114B
            if (r9 == 0) goto L_0x0070
            boolean r9 = r9.mo29683g(r1)
            if (r9 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r9 = 0
            goto L_0x0071
        L_0x0070:
            r9 = 1
        L_0x0071:
            com.google.common.base.ax r10 = r0.f69113A
            if (r7 == 0) goto L_0x00e0
            boolean r11 = r0.f69137x
            if (r11 == 0) goto L_0x00e0
            com.google.common.base.cr r11 = r0.f69117d
            java.lang.Object r11 = r11.mo6453a()
            com.google.android.libraries.lens.view.session.ondevice.z r11 = (com.google.android.libraries.lens.view.session.ondevice.C28017z) r11
            com.google.common.b.gp r12 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.android.libraries.lens.view.session.ondevice.ak r13 = r11.f76241d
            com.google.common.base.ax r13 = r13.f76056o
            boolean r14 = r13.mo56113h()
            java.lang.String r15 = "translate_"
            if (r14 == 0) goto L_0x00b2
            com.google.android.libraries.lens.view.session.ondevice.ak r14 = r11.f76241d
            java.lang.Object r16 = r13.mo56107c()
            r4 = r16
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r14.mo33378g(r4)
            if (r4 != 0) goto L_0x00b2
            java.lang.Object r4 = r13.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r15.concat(r4)
            r12.mo55395g(r4)
        L_0x00b2:
            com.google.android.libraries.lens.view.session.ondevice.ak r4 = r11.f76241d
            com.google.common.base.ax r4 = r4.f76054m
            boolean r13 = r4.mo56113h()
            if (r13 == 0) goto L_0x00db
            com.google.android.libraries.lens.view.session.ondevice.ak r11 = r11.f76241d
            java.lang.Object r13 = r4.mo56107c()
            java.lang.String r13 = (java.lang.String) r13
            boolean r11 = r11.mo33378g(r13)
            if (r11 != 0) goto L_0x00db
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r15.concat(r4)
            r12.mo55395g(r4)
        L_0x00db:
            com.google.common.b.gu r4 = r12.mo55394f()
            goto L_0x00e4
        L_0x00e0:
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x00e4:
            r12 = 32768(0x8000, float:4.5918E-41)
            r14 = 2
            if (r9 == 0) goto L_0x01fc
            com.google.common.o.abm r9 = com.google.common.p4552o.abm.f158210e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.common.o.abi r9 = (com.google.common.p4552o.abi) r9
            int r15 = r3.mo29719m()
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.common.o.abm r13 = (com.google.common.p4552o.abm) r13
            int r11 = r15 + -1
            if (r15 == 0) goto L_0x01fa
            r13.f158214c = r11
            int r11 = r13.f158212a
            r11 = r11 | 4
            r13.f158212a = r11
            com.google.android.libraries.lens.view.h.d.ab r11 = r3.mo29711f()
            com.google.common.base.ax r11 = r11.mo32048b()
            boolean r11 = r11.mo56113h()
            if (r11 == 0) goto L_0x013e
            com.google.android.libraries.lens.view.h.d.ab r11 = r3.mo29711f()
            com.google.common.base.ax r11 = r11.mo32048b()
            java.lang.Object r11 = r11.mo56107c()
            java.lang.Long r11 = (java.lang.Long) r11
            long r17 = r11.longValue()
            com.google.protobuf.ar r11 = com.google.protobuf.p4750c.C62948a.m95461l(r17)
            r9.copyOnWrite()
            com.google.protobuf.bv r13 = r9.instance
            com.google.common.o.abm r13 = (com.google.common.p4552o.abm) r13
            r11.getClass()
            r13.f158213b = r11
            int r11 = r13.f158212a
            r11 = r11 | r14
            r13.f158212a = r11
        L_0x013e:
            com.google.common.o.acb r11 = com.google.common.p4552o.acb.f158263r
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.abd r11 = (com.google.common.p4552o.abd) r11
            com.google.protobuf.bv r9 = r9.build()
            com.google.common.o.abm r9 = (com.google.common.p4552o.abm) r9
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.common.o.acb r13 = (com.google.common.p4552o.acb) r13
            r9.getClass()
            r13.f158270f = r9
            int r9 = r13.f158265a
            r9 = r9 | 16
            r13.f158265a = r9
            com.google.common.o.aae r9 = r3.mo29716j()
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.common.o.acb r13 = (com.google.common.p4552o.acb) r13
            r9.getClass()
            r13.f158271g = r9
            int r9 = r13.f158265a
            r9 = r9 | 32
            r13.f158265a = r9
            com.google.protobuf.bv r9 = r11.build()
            com.google.common.o.acb r9 = (com.google.common.p4552o.acb) r9
            com.google.android.libraries.lens.view.session.ax r11 = r0.f69123j
            com.google.common.o.aar r11 = r11.mo33231b()
            android.content.Context r13 = r0.f69118e
            com.google.common.o.aac r13 = com.google.android.libraries.lens.view.utils.C28137z.m52436b(r13, r6)
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.common.o.aas r15 = (com.google.common.p4552o.aas) r15
            com.google.common.o.aas r17 = com.google.common.p4552o.aas.f158145p
            r13.getClass()
            r15.f158156j = r13
            int r13 = r15.f158147a
            r13 = r13 | r12
            r15.f158147a = r13
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.common.o.aas r13 = (com.google.common.p4552o.aas) r13
            r9.getClass()
            r13.f158149c = r9
            int r9 = r13.f158147a
            r9 = r9 | 4
            r13.f158147a = r9
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.common.o.aas r9 = (com.google.common.p4552o.aas) r9
            r8.getClass()
            int r13 = r9.f158147a
            r15 = 4194304(0x400000, float:5.877472E-39)
            r13 = r13 | r15
            r9.f158147a = r13
            r9.f158161o = r8
            com.google.android.libraries.lens.view.af.av r9 = r0.f69122i
            com.google.common.o.uf r13 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.common.o.tz r13 = (com.google.common.p4552o.C60548tz) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r15 = r13.instance
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15
            int r6 = r15.f164093a
            r6 = r6 | r14
            r15.f164093a = r6
            r6 = 1088(0x440, float:1.525E-42)
            r15.f164258m = r6
            r13.copyOnWrite()
            com.google.protobuf.bv r6 = r13.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            com.google.protobuf.bv r11 = r11.build()
            com.google.common.o.aas r11 = (com.google.common.p4552o.aas) r11
            r11.getClass()
            r6.f164197by = r11
            int r11 = r6.f164253h
            r11 = r11 | 8
            r6.f164253h = r11
            com.google.protobuf.bv r6 = r13.build()
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            r9.mo30241a(r6)
            goto L_0x01fc
        L_0x01fa:
            r6 = 0
            throw r6
        L_0x01fc:
            if (r7 == 0) goto L_0x02e1
            com.google.android.libraries.lens.view.af.av r6 = r0.f69122i
            com.google.android.libraries.lens.view.session.ax r9 = r0.f69123j
            com.google.android.libraries.lens.e.r r3 = r3.mo29709e()
            com.google.common.o.aar r9 = r9.mo33231b()
            com.google.common.o.acp r3 = com.google.android.libraries.lens.view.session.C27761ax.m51629f(r3, r7)
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.common.o.aas r11 = (com.google.common.p4552o.aas) r11
            com.google.common.o.aas r13 = com.google.common.p4552o.aas.f158145p
            r3.getClass()
            r11.f158150d = r3
            int r3 = r11.f158147a
            r3 = r3 | 8
            r11.f158147a = r3
            com.google.common.o.acb r3 = com.google.common.p4552o.acb.f158263r
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.abd r3 = (com.google.common.p4552o.abd) r3
            com.google.common.o.abx r11 = com.google.common.p4552o.abx.f158238d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.common.o.abv r11 = (com.google.common.p4552o.abv) r11
            boolean r13 = r4.isEmpty()
            r15 = 1
            if (r15 == r13) goto L_0x023b
            r13 = 3
            goto L_0x023c
        L_0x023b:
            r13 = 2
        L_0x023c:
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.common.o.abx r12 = (com.google.common.p4552o.abx) r12
            int r13 = r13 + -1
            r12.f158241b = r13
            int r13 = r12.f158240a
            r13 = r13 | r15
            r12.f158240a = r13
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.common.o.abx r12 = (com.google.common.p4552o.abx) r12
            com.google.protobuf.cq r13 = r12.f158242c
            boolean r15 = r13.mo58948c()
            if (r15 != 0) goto L_0x0261
            com.google.protobuf.cq r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r13)
            r12.f158242c = r13
        L_0x0261:
            com.google.protobuf.cq r12 = r12.f158242c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r12)
            com.google.protobuf.bv r4 = r11.build()
            com.google.common.o.abx r4 = (com.google.common.p4552o.abx) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.common.o.acb r11 = (com.google.common.p4552o.acb) r11
            r4.getClass()
            r11.f158273i = r4
            int r4 = r11.f158265a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r11.f158265a = r4
            r9.copyOnWrite()
            com.google.protobuf.bv r4 = r9.instance
            com.google.common.o.aas r4 = (com.google.common.p4552o.aas) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.acb r3 = (com.google.common.p4552o.acb) r3
            r3.getClass()
            r4.f158149c = r3
            int r3 = r4.f158147a
            r3 = r3 | 4
            r4.f158147a = r3
            if (r8 == 0) goto L_0x02a8
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.common.o.aas r3 = (com.google.common.p4552o.aas) r3
            int r4 = r3.f158147a
            r11 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 | r11
            r3.f158147a = r4
            r3.f158161o = r8
        L_0x02a8:
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r11 = r4.f164093a
            r11 = r11 | r14
            r4.f164093a = r11
            r11 = 1090(0x442, float:1.527E-42)
            r4.f164258m = r11
            com.google.protobuf.bv r4 = r9.build()
            com.google.common.o.aas r4 = (com.google.common.p4552o.aas) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            r4.getClass()
            r9.f164197by = r4
            int r4 = r9.f164253h
            r4 = r4 | 8
            r9.f164253h = r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            r6.mo30241a(r3)
        L_0x02e1:
            com.google.common.o.i.bf r3 = com.google.common.p4552o.p4563i.C59897bf.f161859f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.i.be r3 = (com.google.common.p4552o.p4563i.C59896be) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.i.bf r4 = (com.google.common.p4552o.p4563i.C59897bf) r4
            r8.getClass()
            int r6 = r4.f161861a
            r9 = 1
            r6 = r6 | r9
            r4.f161861a = r6
            r4.f161862b = r8
            if (r7 != 0) goto L_0x0302
            if (r2 == 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            r6 = 0
            goto L_0x0303
        L_0x0302:
            r6 = 1
        L_0x0303:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.i.bf r4 = (com.google.common.p4552o.p4563i.C59897bf) r4
            int r7 = r4.f161861a
            r7 = r7 | 4
            r4.f161861a = r7
            r4.f161864d = r6
            boolean r4 = r10.mo56113h()
            if (r4 == 0) goto L_0x040c
            java.lang.Object r4 = r10.mo56107c()
            com.google.android.libraries.lens.view.session.ondevice.d.h r4 = (com.google.android.libraries.lens.view.session.ondevice.p2169d.C27952h) r4
            com.google.common.base.ax r6 = r4.mo33414a()
            boolean r6 = r6.mo56113h()
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.common.o.i.bf r7 = (com.google.common.p4552o.p4563i.C59897bf) r7
            int r8 = r7.f161861a
            r8 = r8 | r14
            r7.f161861a = r8
            r7.f161863c = r6
            com.google.common.base.ax r6 = r4.mo33414a()
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x040c
            com.google.common.base.ax r6 = r4.mo33414a()
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x040c
            com.google.common.base.ax r4 = r4.mo33414a()
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.libraries.lens.view.session.ondevice.a.h r4 = (com.google.android.libraries.lens.view.session.ondevice.p2164a.C27891h) r4
            com.google.protos.ai.d.d.a.j r6 = com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63237j.f170851f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protos.ai.d.d.a.i r6 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63236i) r6
            com.google.lens.g.d r7 = r4.mo33347d()
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.protos.ai.d.d.a.j r8 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63237j) r8
            int r7 = r7.f168273v
            r8.f170854b = r7
            int r7 = r8.f170853a
            r9 = 1
            r7 = r7 | r9
            r8.f170853a = r7
            com.google.android.libraries.lens.ondevice.n.f r7 = r4.mo33345b()
            int r7 = r7.f67750b
            int r15 = com.google.lens.p4701g.C62277b.m94763a(r7)
            if (r15 != 0) goto L_0x037c
            r15 = 1
        L_0x037c:
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.protos.ai.d.d.a.j r7 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63237j) r7
            int r15 = r15 + -1
            r7.f170855c = r15
            int r8 = r7.f170853a
            r8 = r8 | r14
            r7.f170853a = r8
            com.google.protos.ai.d.d.a.h r7 = com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63235h.f170846d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.ai.d.d.a.g r7 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63234g) r7
            com.google.lens.g.d r8 = r4.mo33347d()
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.protos.ai.d.d.a.h r9 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63235h) r9
            int r8 = r8.f168273v
            r9.f170849b = r8
            int r8 = r9.f170848a
            r10 = 1
            r8 = r8 | r10
            r9.f170848a = r8
            com.google.android.libraries.lens.ondevice.n.f r8 = r4.mo33345b()
            int r8 = r8.f67750b
            int r8 = com.google.lens.p4701g.C62277b.m94763a(r8)
            if (r8 != 0) goto L_0x03b6
            r8 = 1
        L_0x03b6:
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.protos.ai.d.d.a.h r9 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63235h) r9
            int r8 = r8 + -1
            r9.f170850c = r8
            int r8 = r9.f170848a
            r8 = r8 | r14
            r9.f170848a = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.protos.ai.d.d.a.j r8 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63237j) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.protos.ai.d.d.a.h r7 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63235h) r7
            r7.getClass()
            r8.f170856d = r7
            int r7 = r8.f170853a
            r7 = r7 | 4
            r8.f170853a = r7
            com.google.protos.ai.d.d.a.m r4 = r4.mo33348e()
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.protos.ai.d.d.a.j r7 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63237j) r7
            r4.getClass()
            r7.f170857e = r4
            int r4 = r7.f170853a
            r4 = r4 | 8
            r7.f170853a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.i.bf r4 = (com.google.common.p4552o.p4563i.C59897bf) r4
            com.google.protobuf.bv r6 = r6.build()
            com.google.protos.ai.d.d.a.j r6 = (com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63237j) r6
            r6.getClass()
            r4.f161865e = r6
            int r6 = r4.f161861a
            r6 = r6 | 8
            r4.f161861a = r6
        L_0x040c:
            com.google.android.libraries.search.b.b r4 = r0.f69125l
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98554cK
            com.google.android.libraries.search.b.i.a r6 = r6.mo40779c()
            com.google.protobuf.bt r7 = com.google.common.p4552o.p4563i.C59898bg.f161867w
            com.google.common.o.i.bg r8 = com.google.common.p4552o.p4563i.C59898bg.f161866v
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.common.o.i.af r8 = (com.google.common.p4552o.p4563i.C59870af) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.common.o.i.bg r9 = (com.google.common.p4552o.p4563i.C59898bg) r9
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.i.bf r3 = (com.google.common.p4552o.p4563i.C59897bf) r3
            r3.getClass()
            r9.f161885q = r3
            int r3 = r9.f161869a
            r10 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r10
            r9.f161869a = r3
            com.google.protobuf.bv r3 = r8.build()
            com.google.common.o.i.bg r3 = (com.google.common.p4552o.p4563i.C59898bg) r3
            r8 = r6
            com.google.android.libraries.search.b.i.b r8 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r8
            r8.mo40792p(r7, r3)
            r4.mo19974a(r6)
            r0.f69114B = r1
            com.google.common.base.ax r3 = r20.mo29682e()
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x046f
            com.google.common.b.gu r3 = r0.f69120g
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.libraries.lens.view.an.ap r4 = new com.google.android.libraries.lens.view.an.ap
            r4.<init>(r1)
            j$.util.stream.Stream r3 = r3.filter(r4)
            j$.util.Optional r3 = r3.findFirst()
            r4 = 0
            java.lang.Object r3 = r3.orElse(r4)
            r13 = r3
            com.google.android.libraries.lens.view.an.h r13 = (com.google.android.libraries.lens.view.p2070an.C25436h) r13
            goto L_0x0471
        L_0x046f:
            r4 = 0
            r13 = r4
        L_0x0471:
            if (r13 != 0) goto L_0x0478
            com.google.common.util.concurrent.cx r1 = r19.m46745i(r20, r21, r22)
            return r1
        L_0x0478:
            com.google.android.libraries.lens.e.af r3 = com.google.android.libraries.lens.p2014e.C24203af.m45046b()
            com.google.android.libraries.lens.e.ae r4 = r20.mo29679b()
            com.google.android.libraries.lens.e.ah r6 = r20.mo29681d()
            com.google.android.libraries.lens.e.s r7 = r20.mo29678a()
            com.google.android.libraries.lens.e.ad r3 = com.google.android.libraries.lens.p2014e.C24201ad.m45035f(r3, r4, r6, r7)
            com.google.common.f.x r4 = r5.mo56224b()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            r5 = 49867(0xc2cb, float:6.9879E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            com.google.android.libraries.lens.e.af r5 = r20.mo29680c()
            com.google.android.libraries.lens.e.af r6 = r3.mo29680c()
            java.lang.String r7 = "Query[%s] interaction handler spawned image query %s"
            r4.mo56354G(r7, r5, r6)
            java.util.concurrent.Executor r4 = r0.f69115b
            com.google.android.libraries.lens.e.af r5 = r20.mo29680c()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "MainLensQueryManager["
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = "]"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = r22
            com.google.android.libraries.lens.view.d.k r4 = com.google.android.libraries.lens.view.p2070an.C25372aj.m46734a(r6, r4, r5)
            com.google.android.libraries.lens.view.an.at r5 = new com.google.android.libraries.lens.view.an.at
            r5.<init>(r0, r1, r4, r13)
            com.google.common.util.concurrent.cx r1 = r0.m46745i(r3, r2, r5)
            com.google.android.libraries.lens.view.an.aq r2 = new com.google.android.libraries.lens.view.an.aq
            r2.<init>(r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            androidx.d.a.c r3 = r4.f70025a
            r3.mo5436a(r2, r1)
            com.google.common.util.concurrent.cx r1 = r4.f70026b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2070an.C25383au.mo30418b(com.google.android.libraries.lens.e.ad, boolean, com.google.android.libraries.lens.e.al):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("MainLensQueryManager");
        eVar.mo33148e("running", Boolean.toString(this.f69134u));
        eVar.mo33148e("onDeviceEnabled", Boolean.toString(this.f69137x));
        eVar.mo33148e("serverEnabled", Boolean.toString(this.f69138y));
        if (this.f69137x) {
            eVar.mo33146c((C27654a) this.f69117d.mo6453a());
        }
        if (this.f69138y) {
            eVar.mo33146c((C27654a) this.f69116c.mo6453a());
        }
    }

    /* renamed from: d */
    public final void mo30419d() {
        boolean k = this.f69124k.mo30907k();
        if (k != this.f69135v) {
            this.f69135v = k;
            this.f69113A = m46744h();
            m46746j(false, true);
        }
    }

    /* renamed from: e */
    public final void mo30420e(C56280cg cgVar) {
        if (!cgVar.equals(this.f69136w)) {
            this.f69136w = cgVar;
            this.f69113A = m46744h();
            m46746j(true, false);
        }
    }

    /* renamed from: f */
    public final void mo30421f(C56280cg cgVar) {
        this.f69134u = true;
        this.f69135v = this.f69124k.mo30907k();
        this.f69136w = cgVar;
        this.f69113A = m46744h();
        m46746j(false, false);
    }

    /* renamed from: g */
    public final void mo30422g() {
        this.f69134u = false;
        if (this.f69137x) {
            ((C28017z) this.f69117d.mo6453a()).mo33470h();
            this.f69137x = false;
        }
        if (this.f69138y) {
            ((C25396af) this.f69116c.mo6453a()).mo29856b();
            this.f69138y = false;
        }
        this.f69114B = null;
    }
}
