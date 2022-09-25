package com.google.android.apps.gsa.staticplugins.save.p8694a;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.C54649b;
import com.google.C6578a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.p6519al.p6568ax.p6569a.C84758b;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85167c;
import com.google.android.apps.gsa.search.core.p6884y.C87290c;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.staticplugins.save.p8694a.p8696b.C116396f;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116421a;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116433d;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116434e;
import com.google.android.apps.gsa.staticplugins.save.p8697b.C116435f;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116426e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1880l.C22875c;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.android.libraries.gsa.p1880l.C22880h;
import com.google.android.libraries.gsa.p1880l.C22884l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4570p.C60357am;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57563ag;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57571ao;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57572ap;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57576at;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57582az;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57590bg;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57602bs;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57626cp;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57635cy;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57636cz;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57647h;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57662w;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62963cj;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.al */
/* compiled from: PG */
public final class C116381al extends C23056g implements C116421a {

    /* renamed from: a */
    public static final C59071e f322713a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.save.a.al");

    /* renamed from: b */
    public final C23149a f322714b;

    /* renamed from: c */
    public final C116434e f322715c;

    /* renamed from: d */
    public final Context f322716d;

    /* renamed from: e */
    public final C85142a f322717e;

    /* renamed from: f */
    public final C116360a f322718f;

    /* renamed from: g */
    public final C116420z f322719g;

    /* renamed from: h */
    public C22876d f322720h;

    /* renamed from: i */
    public C116424c f322721i;

    /* renamed from: j */
    public C116424c f322722j;

    /* renamed from: k */
    public final C84758b f322723k;

    /* renamed from: l */
    public final C116396f f322724l;

    /* renamed from: m */
    private final C86054o f322725m;

    /* renamed from: n */
    private final C68214a f322726n;

    /* renamed from: o */
    private final C84624a f322727o;

    /* renamed from: p */
    private final C22871g f322728p;

    /* renamed from: q */
    private final C87290c f322729q;

    public C116381al(C23052c cVar, C23149a aVar, C116434e eVar, Context context, C86054o oVar, C68214a aVar2, C84624a aVar3, C85142a aVar4, C84758b bVar, C22871g gVar, C116360a aVar5, C116420z zVar, C87290c cVar2, C116396f fVar) {
        super(cVar);
        this.f322714b = aVar;
        this.f322715c = eVar;
        this.f322716d = context;
        this.f322725m = oVar;
        this.f322726n = aVar2;
        this.f322727o = aVar3;
        this.f322717e = aVar4;
        this.f322723k = bVar;
        this.f322728p = gVar;
        this.f322718f = aVar5;
        this.f322719g = zVar;
        this.f322729q = cVar2;
        this.f322724l = fVar;
        aVar.mo28592a(new C116373ad(this));
    }

    /* renamed from: e */
    public static int m193027e(C57665z zVar) {
        int number = zVar.getNumber();
        if (number == 1) {
            return 3;
        }
        if (number == 2) {
            return 0;
        }
        if (number != 5) {
            return number != 11 ? -1 : 2;
        }
        return 1;
    }

    /* renamed from: f */
    public static List m193028f(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C116424c cVar = (C116424c) it.next();
            C57563ag a = C57563ag.m88496a(cVar.f322821e);
            if (a == null) {
                a = C57563ag.UNRECOGNIZED;
            }
            if ((a != C57563ag.CUSTOM) == z) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List mo102666h(C22875c cVar) {
        ArrayList arrayList = new ArrayList();
        for (C116424c cVar2 : ((C116426e) ((C23251a) this.f322715c.mo102657b()).f63720e).f322832a) {
            Iterator it = new C62963cj(cVar2.f322822f, C116424c.f322814g).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m193027e((C57665z) it.next()) == cVar.f62943e) {
                        arrayList.add(cVar2);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void mo102667i(String str) {
        try {
            this.f322717e.mo78735d(C54649b.m87519a(str));
        } catch (C6578a e) {
            ((C59052c) ((C59052c) ((C59052c) f322713a.mo56225c()).mo56382g(e)).mo56372aa(31789)).mo56386p("Provided URL is invalid.");
            mo102675q(e, 720907);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if ((r9.f62946a & 1) != 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r1.f153860b != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        if ((r9.f62946a & 8192) != 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        if ((r1 & 256) != 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a4, code lost:
        if ((r1 & 8) != 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        if (r1 != false) goto L_0x00ac;
     */
    /* renamed from: iD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28439iD(com.google.android.libraries.gsa.monet.shared.ProtoParcelable r9) {
        /*
            r8 = this;
            com.google.android.apps.gsa.search.core.y.c r0 = r8.f322729q
            r1 = 0
            r2 = 0
            r0.mo80938d(r2, r1)
            com.google.android.libraries.gsa.l.d r0 = com.google.android.libraries.gsa.p1880l.C22876d.f62944x
            com.google.protobuf.eb r0 = r0.getParserForType()
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()
            r3 = 1
            com.google.protobuf.bv r9 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r9, r0, r1, r3)
            com.google.android.libraries.gsa.l.d r9 = (com.google.android.libraries.gsa.p1880l.C22876d) r9
            r0 = 2132092059(0x7f15249b, float:1.9824504E38)
            if (r9 == 0) goto L_0x01dc
            int r1 = r9.f62946a
            r4 = 262144(0x40000, float:3.67342E-40)
            r5 = r1 & r4
            r6 = 3
            r7 = 2
            if (r5 == 0) goto L_0x003e
            com.google.android.libraries.gsa.l.h r1 = r9.f62963r
            if (r1 != 0) goto L_0x002d
            com.google.android.libraries.gsa.l.h r1 = com.google.android.libraries.gsa.p1880l.C22880h.f62974h
        L_0x002d:
            int r1 = r1.f62976a
            r5 = r1 & 1
            if (r5 == 0) goto L_0x01dc
            r1 = r1 & 8
            if (r1 == 0) goto L_0x01dc
            int r1 = r9.f62946a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x01dc
            goto L_0x00ac
        L_0x003e:
            r1 = r1 & 16
            if (r1 == 0) goto L_0x01dc
            com.google.android.libraries.gsa.l.c r1 = com.google.android.libraries.gsa.p1880l.C22875c.IMAGE
            int r1 = r9.f62951f
            com.google.android.libraries.gsa.l.c r1 = com.google.android.libraries.gsa.p1880l.C22875c.m42745a(r1)
            if (r1 != 0) goto L_0x004e
            com.google.android.libraries.gsa.l.c r1 = com.google.android.libraries.gsa.p1880l.C22875c.IMAGE
        L_0x004e:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x009c
            if (r1 == r3) goto L_0x0086
            if (r1 == r7) goto L_0x007e
            if (r1 == r6) goto L_0x005c
            goto L_0x01dc
        L_0x005c:
            int r1 = r9.f62946a
            r5 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x00a7
            r5 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r5
            if (r1 == 0) goto L_0x00a7
            com.google.bv.f.a.a.bg r1 = r9.f62959n
            if (r1 != 0) goto L_0x006e
            com.google.bv.f.a.a.bg r1 = com.google.p4283bv.p4369f.p4370a.p4371a.C57590bg.f153857c
        L_0x006e:
            com.google.aj.a.a.a.v r1 = r1.f153859a
            if (r1 == 0) goto L_0x0073
            goto L_0x0084
        L_0x0073:
            com.google.bv.f.a.a.bg r1 = r9.f62959n
            if (r1 != 0) goto L_0x0079
            com.google.bv.f.a.a.bg r1 = com.google.p4283bv.p4369f.p4370a.p4371a.C57590bg.f153857c
        L_0x0079:
            com.google.aj.a.a.a.ab r1 = r1.f153860b
            if (r1 == 0) goto L_0x00a7
            goto L_0x0084
        L_0x007e:
            int r1 = r9.f62946a
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x00a7
        L_0x0084:
            r1 = 1
            goto L_0x00a8
        L_0x0086:
            int r1 = r9.f62946a
            r5 = r1 & 2
            if (r5 == 0) goto L_0x00a7
            int r5 = r9.f62954i
            int r5 = com.google.common.p4552o.p4570p.C60357am.m92571a(r5)
            if (r5 != 0) goto L_0x0095
            goto L_0x0084
        L_0x0095:
            if (r5 != r7) goto L_0x0084
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x00a7
            goto L_0x0084
        L_0x009c:
            int r1 = r9.f62946a
            r5 = r1 & 1
            if (r5 == 0) goto L_0x00a7
            r1 = r1 & 8
            if (r1 == 0) goto L_0x00a7
            goto L_0x0084
        L_0x00a7:
            r1 = 0
        L_0x00a8:
            if (r1 != 0) goto L_0x00ac
            goto L_0x01dc
        L_0x00ac:
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = r8.f322725m
            java.lang.String r1 = r1.mo79659F()
            if (r1 != 0) goto L_0x00d4
            com.google.common.f.e r9 = f322713a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r0 = "User is not signed in."
            r1 = 31791(0x7c2f, float:4.4549E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56386p(r0)
            r9 = 720909(0xb000d, float:1.010209E-39)
            r8.mo102674p(r9)
            android.content.Context r9 = r8.f322716d
            r0 = 2132092066(0x7f1524a2, float:1.9824518E38)
            java.lang.String r9 = r9.getString(r0)
            r8.mo102679u(r9, r3)
            return
        L_0x00d4:
            com.google.android.apps.gsa.staticplugins.save.b.e r1 = r8.f322715c
            com.google.android.libraries.gsa.monet.tools.model.shared.b r1 = r1.mo102659d()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r1 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r1
            boolean r5 = r9.f62967v
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1.mo28730f(r5, r2)
            int r1 = r9.f62946a
            r2 = r1 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x011e
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x011e
            com.google.android.apps.gsa.staticplugins.save.b.a.c r1 = com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c.f322815o
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.save.b.a.b r1 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116423b) r1
            java.lang.String r2 = r9.f62956k
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.gsa.staticplugins.save.b.a.c r5 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c) r5
            r2.getClass()
            r5.f322817a = r3
            r5.f322818b = r2
            java.lang.String r2 = r9.f62957l
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.gsa.staticplugins.save.b.a.c r5 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c) r5
            r2.getClass()
            r5.f322820d = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.save.b.a.c r1 = (com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c) r1
            r8.mo102676r(r1)
        L_0x011e:
            r8.f322720h = r9
            int r9 = r9.f62946a
            r9 = r9 & r4
            if (r9 == 0) goto L_0x0133
            com.google.android.libraries.gsa.l.d r9 = r8.f322720h
            boolean r9 = r9.f62947b
            if (r9 == 0) goto L_0x012f
            r8.mo102680v()
            return
        L_0x012f:
            r8.mo102671m()
            return
        L_0x0133:
            com.google.android.libraries.gsa.l.c r9 = com.google.android.libraries.gsa.p1880l.C22875c.IMAGE
            com.google.android.libraries.gsa.l.d r9 = r8.f322720h
            int r9 = r9.f62951f
            com.google.android.libraries.gsa.l.c r9 = com.google.android.libraries.gsa.p1880l.C22875c.m42745a(r9)
            if (r9 != 0) goto L_0x0141
            com.google.android.libraries.gsa.l.c r9 = com.google.android.libraries.gsa.p1880l.C22875c.IMAGE
        L_0x0141:
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x01ce
            if (r9 == r3) goto L_0x0152
            if (r9 == r7) goto L_0x014e
            if (r9 == r6) goto L_0x01ce
            return
        L_0x014e:
            r8.mo102680v()
            return
        L_0x0152:
            com.google.android.libraries.gsa.l.d r9 = r8.f322720h
            java.lang.String r9 = r9.f62948c
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x0179
            com.google.common.f.e r9 = f322713a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r1 = "No URL provided in Save args."
            r2 = 31795(0x7c33, float:4.4554E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r1)
            r9 = 720923(0xb001b, float:1.010228E-39)
            r8.mo102674p(r9)
            android.content.Context r9 = r8.f322716d
            java.lang.String r9 = r9.getString(r0)
            r8.mo102679u(r9, r3)
            return
        L_0x0179:
            com.google.C54649b.m87519a(r9)     // Catch:{ a -> 0x01b0 }
            com.google.android.libraries.gsa.l.d r9 = r8.f322720h
            java.lang.String r9 = r9.f62948c
            com.google.common.f.e r0 = f322713a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 31792(0x7c30, float:4.455E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.libraries.gsa.l.d r1 = r8.f322720h
            java.lang.String r1 = r1.f62948c
            java.lang.String r2 = "querySavedPageCache: url = %s"
            r0.mo56389s(r2, r1)
            com.google.android.libraries.gsa.k.g r0 = r8.f322728p
            com.google.android.apps.gsa.search.core.al.cn.a r1 = r8.f322717e
            android.net.Uri r9 = android.net.Uri.parse(r9)
            com.google.common.util.concurrent.cx r9 = r1.mo78732a(r9)
            com.google.android.apps.gsa.staticplugins.save.a.ai r1 = new com.google.android.apps.gsa.staticplugins.save.a.ai
            r1.<init>(r8)
            java.lang.String r2 = "isSaved callback"
            r0.mo28211k(r9, r2, r1)
            return
        L_0x01b0:
            r9 = move-exception
            com.google.common.f.e r1 = f322713a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Provided URL is invalid."
            r4 = 31794(0x7c32, float:4.4553E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r9)).mo56372aa(r4)).mo56386p(r2)
            r1 = 720907(0xb000b, float:1.010206E-39)
            r8.mo102675q(r9, r1)
            android.content.Context r9 = r8.f322716d
            java.lang.String r9 = r9.getString(r0)
            r8.mo102679u(r9, r3)
            return
        L_0x01ce:
            com.google.android.libraries.gsa.l.d r9 = r8.f322720h
            boolean r9 = r9.f62947b
            if (r9 == 0) goto L_0x01d8
            r8.mo102680v()
            return
        L_0x01d8:
            r8.mo102671m()
            return
        L_0x01dc:
            com.google.common.f.e r9 = f322713a
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r1 = "Some activity arguments are missing, or the item type is invalid."
            r2 = 31790(0x7c2e, float:4.4547E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r2)).mo56386p(r1)
            r9 = 720906(0xb000a, float:1.010204E-39)
            r8.mo102674p(r9)
            android.content.Context r9 = r8.f322716d
            java.lang.String r9 = r9.getString(r0)
            r8.mo102679u(r9, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.save.p8694a.C116381al.mo28439iD(com.google.android.libraries.gsa.monet.shared.ProtoParcelable):void");
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f322717e.mo78736e(this.f322720h);
    }

    /* renamed from: j */
    public final void mo102668j() {
        ((C23251a) this.f322715c.mo102662g()).mo28730f(C58833ax.m90834k(C116435f.CLOSED), false);
    }

    /* renamed from: k */
    public final void mo102669k(boolean z) {
        int a = C60357am.m92571a(this.f322720h.f62954i);
        if (a != 0 && a == 2) {
            this.f322727o.mo78395p(this.f322720h.f62953h, BitmapFactory.decodeResource(this.f322716d.getResources(), z ? R.drawable.quantum_ic_bookmark_grey600_48 : R.drawable.quantum_ic_bookmark_border_grey600_48), this.f322716d.getString(true != z ? R.string.save_action : R.string.save_unsave_action));
        }
    }

    /* renamed from: n */
    public final void mo102672n(C22884l lVar) {
        this.f322717e.mo78738g(lVar);
        Intent intent = new Intent();
        intent.putExtra(C116433d.f322845a, lVar.toByteArray());
        this.f322729q.mo80938d(1, intent);
    }

    /* renamed from: o */
    public final void mo102673o(String str) {
        try {
            this.f322717e.mo78739h(C54649b.m87519a(str));
        } catch (C6578a e) {
            ((C59052c) ((C59052c) ((C59052c) f322713a.mo56225c()).mo56382g(e)).mo56372aa(31793)).mo56386p("Provided URL is invalid.");
            mo102675q(e, 720907);
        }
    }

    /* renamed from: p */
    public final void mo102674p(int i) {
        this.f322729q.mo80938d(2, (Intent) null);
        ((C89911f) this.f322726n.mo27525b()).mo83756b(new C90452a(211, i)).mo83721a();
    }

    /* renamed from: q */
    public final void mo102675q(Throwable th, int i) {
        this.f322729q.mo80938d(2, (Intent) null);
        ((C89911f) this.f322726n.mo27525b()).mo83756b(new C90452a(th, 211, i)).mo83721a();
    }

    /* renamed from: r */
    public final void mo102676r(C116424c cVar) {
        C116360a aVar = this.f322718f;
        C57576at atVar = (C57576at) C57578av.f153822h.createBuilder();
        C57566aj b = C116371ab.m193011b(cVar);
        atVar.copyOnWrite();
        b.getClass();
        ((C57578av) atVar.instance).f153824a = b;
        String str = cVar.f322820d;
        atVar.copyOnWrite();
        str.getClass();
        ((C57578av) atVar.instance).f153828e = str;
        int b2 = C57602bs.m88505b(cVar.f322826k);
        if (b2 == 0) {
            b2 = 1;
        }
        atVar.copyOnWrite();
        ((C57578av) atVar.instance).f153825b = C57602bs.m88504a(b2);
        C57582az azVar = cVar.f322827l;
        if (azVar == null) {
            azVar = C57582az.f153835d;
        }
        atVar.copyOnWrite();
        azVar.getClass();
        ((C57578av) atVar.instance).f153826c = azVar;
        C57626cp cpVar = cVar.f322828m;
        if (cpVar == null) {
            cpVar = C57626cp.f153922b;
        }
        atVar.copyOnWrite();
        cpVar.getClass();
        ((C57578av) atVar.instance).f153830g = cpVar;
        if (!cVar.f322829n.isEmpty()) {
            C57635cy cyVar = (C57635cy) C57636cz.f153933b.createBuilder();
            String str2 = cVar.f322829n;
            cyVar.copyOnWrite();
            str2.getClass();
            ((C57636cz) cyVar.instance).f153935a = str2;
            C57636cz czVar = (C57636cz) cyVar.build();
            atVar.copyOnWrite();
            czVar.getClass();
            ((C57578av) atVar.instance).f153827d = czVar;
        }
        aVar.mo102651a((C57578av) atVar.build());
    }

    /* renamed from: s */
    public final void mo102677s(C116426e eVar) {
        ((C23251a) this.f322715c.mo102660e()).mo28730f(C58833ax.m90834k(eVar), false);
    }

    /* renamed from: t */
    public final void mo102678t() {
        ((C23251a) this.f322715c.mo102662g()).mo28730f(C58833ax.m90834k(C116435f.LIST_SELECTOR_VISIBLE), false);
    }

    /* renamed from: u */
    public final void mo102679u(String str, boolean z) {
        ((C23251a) this.f322715c.mo102661f()).mo28730f(str, false);
        ((C23251a) this.f322715c.mo102662g()).mo28730f(C58833ax.m90834k(z ? C116435f.ERROR_SNACKBAR_VISIBLE : C116435f.SNACKBAR_VISIBLE), false);
    }

    /* renamed from: v */
    public final void mo102680v() {
        if (((C58833ax) ((C23251a) this.f322715c.mo102660e()).f63720e).mo56113h()) {
            mo102681w();
            return;
        }
        C22871g gVar = this.f322728p;
        C116420z zVar = this.f322719g;
        C85167c cVar = zVar.f322810a;
        C57571ao aoVar = (C57571ao) C57572ap.f153806b.createBuilder();
        aoVar.mo54519a(3);
        aoVar.mo54519a(4);
        gVar.mo28211k(this.f322728p.mo28209i(zVar.f322811b.mo28209i(cVar.mo78749d((C57572ap) aoVar.build(), zVar.mo102690i()), "transform getAllListsFromNetwork result", C116408n.f322794a), "fetch lists", new C116374ae(this)), "Fetch lists callback", new C116377ah(this));
    }

    /* renamed from: w */
    public final void mo102681w() {
        if (this.f322720h.f62955j) {
            mo102678t();
            return;
        }
        C22871g gVar = this.f322728p;
        gVar.mo28209i(gVar.mo28209i(this.f322718f.f322685a.mo102652a(), "maybe get active list", new C116375af(this)), "start save flow after fetch lists completes", new C116376ag(this));
    }

    /* renamed from: m */
    public final void mo102671m() {
        C60870cx cxVar;
        C22876d dVar = this.f322720h;
        if ((dVar.f62946a & C89885b.HTTP_VALUE) != 0) {
            C22880h hVar = dVar.f62963r;
            if (hVar == null) {
                hVar = C22880h.f62974h;
            }
            if ((hVar.f62976a & 4) == 0 || !hVar.f62979d) {
                C116420z zVar = this.f322719g;
                C57566aj ajVar = hVar.f62978c;
                if (ajVar == null) {
                    ajVar = C57566aj.f153791e;
                }
                cxVar = zVar.f322811b.mo28210j(zVar.f322810a.mo78757l(ajVar, hVar.f62977b, zVar.mo102690i(), C57647h.m88511b(hVar.f62980e)), "transformToUnsaveResponse", C116411q.f322797a);
            } else {
                C116420z zVar2 = this.f322719g;
                cxVar = zVar2.f322811b.mo28210j(zVar2.f322810a.mo78756k(hVar.f62977b, hVar.f62981f, zVar2.mo102690i(), C57647h.m88511b(hVar.f62980e)), "transformToUnsaveResponse", C116409o.f322795a);
            }
        } else {
            C22875c cVar = C22875c.IMAGE;
            C22875c a = C22875c.m42745a(this.f322720h.f62951f);
            if (a == null) {
                a = C22875c.IMAGE;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                C116420z zVar3 = this.f322719g;
                C65930h hVar2 = this.f322720h.f62950e;
                if (hVar2 == null) {
                    hVar2 = C65930h.f179300i;
                }
                C57662w wVar = (C57662w) C57663x.f153984d.createBuilder();
                C57665z zVar4 = C57665z.IMAGE;
                wVar.copyOnWrite();
                ((C57663x) wVar.instance).f153988c = zVar4.getNumber();
                String j = C116420z.m193090j(hVar2.f179303b);
                wVar.copyOnWrite();
                C57663x xVar = (C57663x) wVar.instance;
                j.getClass();
                xVar.f153986a = 6;
                xVar.f153987b = j;
                cxVar = zVar3.mo102684b((C57663x) wVar.build());
            } else if (ordinal == 1) {
                C116420z zVar5 = this.f322719g;
                String str = this.f322720h.f62948c;
                C57662w wVar2 = (C57662w) C57663x.f153984d.createBuilder();
                C57665z zVar6 = C57665z.WEB_PAGE;
                wVar2.copyOnWrite();
                ((C57663x) wVar2.instance).f153988c = zVar6.getNumber();
                wVar2.copyOnWrite();
                C57663x xVar2 = (C57663x) wVar2.instance;
                str.getClass();
                xVar2.f153986a = 4;
                xVar2.f153987b = str;
                cxVar = zVar5.mo102684b((C57663x) wVar2.build());
            } else if (ordinal == 3) {
                C116420z zVar7 = this.f322719g;
                C57590bg bgVar = this.f322720h.f62959n;
                if (bgVar == null) {
                    bgVar = C57590bg.f153857c;
                }
                cxVar = zVar7.mo102684b(C116420z.m193089h(bgVar));
            } else {
                throw new AssertionError("Unknown item type when unsaving");
            }
        }
        this.f322728p.mo28211k(cxVar, "Unsave webpage callback", new C116380ak(this));
    }

    /* renamed from: l */
    public final void mo102670l(C116424c cVar, boolean z) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C22876d dVar = this.f322720h;
        int i = dVar.f62946a;
        int i2 = 262144 & i;
        if (i2 == 0 && (i & 16) == 0) {
            throw new IllegalArgumentException("Unknown item type while saving. The item type needs to be provided when saving non-JSON items.");
        }
        if (i2 != 0) {
            C22880h hVar = dVar.f62963r;
            if (hVar == null) {
                hVar = C22880h.f62974h;
            }
            C116424c cVar2 = this.f322722j;
            if (cVar2 != null) {
                C116420z zVar = this.f322719g;
                String str = hVar.f62977b;
                C58836b bVar = C58836b.f156633a;
                int b = C57647h.m88511b(hVar.f62980e);
                if (z) {
                    cxVar2 = zVar.f322811b.mo28210j(zVar.mo102683a(cVar.f322820d), "Add item after list creation", new C116402h(zVar, str, bVar, b));
                } else {
                    cxVar2 = zVar.mo102692l(C116371ab.m193011b(cVar), str, bVar, b);
                }
                cxVar = zVar.f322811b.mo28210j(cxVar2, "Remove item from old list", new C116403i(zVar, cVar2));
            } else {
                C116420z zVar2 = this.f322719g;
                String str2 = hVar.f62977b;
                C58836b bVar2 = C58836b.f156633a;
                int b2 = C57647h.m88511b(hVar.f62980e);
                if (z) {
                    cxVar = zVar2.f322811b.mo28210j(zVar2.mo102683a(cVar.f322820d), "Add item after list creation", new C116398d(zVar2, str2, bVar2, b2));
                } else {
                    cxVar = zVar2.mo102692l(C116371ab.m193011b(cVar), str2, bVar2, b2);
                }
            }
        } else {
            C22875c a = C22875c.m42745a(dVar.f62951f);
            if (a == null) {
                a = C22875c.IMAGE;
            }
            C116424c cVar3 = this.f322722j;
            int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C58833ax j = C58833ax.m90833j(C58837ba.m90856e(this.f322720h.f62949d));
                    if (cVar3 != null) {
                        C116420z zVar3 = this.f322719g;
                        String str3 = this.f322720h.f62948c;
                        C60870cx f = zVar3.mo102688f(str3, j, cVar, z);
                        C57662w wVar = (C57662w) C57663x.f153984d.createBuilder();
                        C57665z zVar4 = C57665z.WEB_PAGE;
                        wVar.copyOnWrite();
                        ((C57663x) wVar.instance).f153988c = zVar4.getNumber();
                        wVar.copyOnWrite();
                        C57663x xVar = (C57663x) wVar.instance;
                        str3.getClass();
                        xVar.f153986a = 4;
                        xVar.f153987b = str3;
                        cxVar = zVar3.f322811b.mo28210j(f, "Remove item from old list", new C116407m(zVar3, cVar3, (C57663x) wVar.build()));
                    } else {
                        cxVar = this.f322719g.mo102688f(this.f322720h.f62948c, j, cVar, z);
                    }
                } else if (ordinal == 2) {
                    C116420z zVar5 = this.f322719g;
                    cxVar = zVar5.f322811b.mo28210j(zVar5.f322810a.mo78752g(Uri.parse(this.f322720h.f62958m)), "Upload image file future", new C116401g(zVar5, cVar, z));
                } else if (ordinal != 3) {
                    throw new IllegalArgumentException("Unknown item type when saving");
                } else if (cVar3 != null) {
                    C116420z zVar6 = this.f322719g;
                    C57590bg bgVar = this.f322720h.f62959n;
                    if (bgVar == null) {
                        bgVar = C57590bg.f153857c;
                    }
                    cxVar = zVar6.f322811b.mo28210j(zVar6.mo102689g(bgVar, this.f322720h.f62960o, cVar, z), "Remove item from old list", new C116415u(zVar6, cVar3, bgVar));
                } else {
                    C116420z zVar7 = this.f322719g;
                    C57590bg bgVar2 = this.f322720h.f62959n;
                    if (bgVar2 == null) {
                        bgVar2 = C57590bg.f153857c;
                    }
                    cxVar = zVar7.mo102689g(bgVar2, this.f322720h.f62960o, cVar, z);
                }
            } else if (cVar3 != null) {
                C116420z zVar8 = this.f322719g;
                C65930h hVar2 = this.f322720h.f62950e;
                if (hVar2 == null) {
                    hVar2 = C65930h.f179300i;
                }
                String str4 = this.f322720h.f62952g;
                C60870cx k = zVar8.mo102691k(hVar2, cVar, z);
                C57662w wVar2 = (C57662w) C57663x.f153984d.createBuilder();
                C57665z zVar9 = C57665z.IMAGE;
                wVar2.copyOnWrite();
                ((C57663x) wVar2.instance).f153988c = zVar9.getNumber();
                String j2 = C116420z.m193090j(hVar2.f179303b);
                wVar2.copyOnWrite();
                C57663x xVar2 = (C57663x) wVar2.instance;
                j2.getClass();
                xVar2.f153986a = 6;
                xVar2.f153987b = j2;
                cxVar = zVar8.f322811b.mo28210j(k, "Remove item from old list", new C116399e(zVar8, cVar3, (C57663x) wVar2.build()));
            } else {
                C116420z zVar10 = this.f322719g;
                C65930h hVar3 = this.f322720h.f62950e;
                if (hVar3 == null) {
                    hVar3 = C65930h.f179300i;
                }
                String str5 = this.f322720h.f62952g;
                cxVar = zVar10.mo102691k(hVar3, cVar, z);
            }
        }
        ((C23251a) this.f322715c.mo102658c()).mo28730f(C58836b.f156633a, false);
        this.f322728p.mo28211k(cxVar, "Save callback", new C116379aj(this));
    }
}
