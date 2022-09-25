package com.google.android.libraries.surveys.internal.p3325d.p3326a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43058g;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4281bu.p4282a.C56502am;
import com.google.p4281bu.p4282a.C56503an;
import com.google.p4281bu.p4282a.C56506aq;
import com.google.p4281bu.p4282a.C56508as;
import com.google.p4281bu.p4282a.C56510au;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56515az;
import com.google.p4281bu.p4282a.C56516b;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56519bc;
import com.google.p4281bu.p4282a.C56524bh;
import com.google.p4281bu.p4282a.C56539bw;
import com.google.p4281bu.p4282a.C56540bx;
import com.google.p4281bu.p4282a.C56557cn;
import com.google.p4281bu.p4282a.C56558co;
import com.google.p4281bu.p4282a.C56560cq;
import com.google.p4281bu.p4282a.C56561cr;
import com.google.p4281bu.p4282a.C56562cs;
import com.google.p4281bu.p4282a.C56563ct;
import com.google.p4281bu.p4282a.C56565cv;
import com.google.p4281bu.p4282a.C56570d;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64440aa;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64441ab;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64442ac;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64443ad;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64445af;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64446ag;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64447ah;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64448ai;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64449aj;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64450ak;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64452am;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64454ao;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64455ap;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64456aq;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64457ar;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64483bq;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64484br;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64485bs;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64486bt;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64491by;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64492bz;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64494ca;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64495cb;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64496cc;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64497cd;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64498ce;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64499cf;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64500cg;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64501ch;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64502ci;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64503cj;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64504ck;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64505cl;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64508co;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64509cp;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64511cr;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64545u;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64546v;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64547w;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64548x;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64549y;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64550z;
import java.util.List;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a;

/* renamed from: com.google.android.libraries.surveys.internal.d.a.d */
/* compiled from: PG */
final class C43041d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C56516b f112580a;

    /* renamed from: b */
    final /* synthetic */ C43060i f112581b;

    /* renamed from: c */
    final /* synthetic */ C43043f f112582c;

    public C43041d(C43043f fVar, C56516b bVar, C43060i iVar) {
        this.f112582c = fVar;
        this.f112580a = bVar;
        this.f112581b = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to record event.", th);
        this.f112582c.mo46065c();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str;
        C56519bc bcVar;
        C56502am amVar;
        C56517ba baVar;
        C56515az azVar;
        C56506aq aqVar;
        C56510au auVar;
        C56508as asVar;
        C56570d dVar = (C56570d) obj;
        this.f112582c.mo46065c();
        C43043f fVar = this.f112582c;
        C56516b bVar = this.f112580a;
        C43060i iVar = this.f112581b;
        int i = C43066o.f112626a;
        Context context = fVar.f112599a;
        if (TextUtils.isEmpty(fVar.f112601c)) {
            str = null;
        } else {
            str = fVar.f112601c;
        }
        if (C43054c.m75960c(C68351a.m98703c(C43054c.f112610b))) {
            C64508co coVar = (C64508co) C64509cp.f174959c.createBuilder();
            C56524bh bhVar = bVar.f150932a;
            if (bhVar != null) {
                C64545u uVar = (C64545u) C64455ap.f174839d.createBuilder();
                C62910ar arVar = bhVar.f150951c;
                if (arVar != null) {
                    uVar.copyOnWrite();
                    ((C64455ap) uVar.instance).f174843c = arVar;
                }
                int i2 = bhVar.f150949a;
                int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    if (i4 == 0) {
                        C64454ao aoVar = C64454ao.f174837a;
                        uVar.copyOnWrite();
                        C64455ap apVar = (C64455ap) uVar.instance;
                        aoVar.getClass();
                        apVar.f174842b = aoVar;
                        apVar.f174841a = 2;
                    } else if (i4 == 1) {
                        if (i2 == 3) {
                            bcVar = (C56519bc) bhVar.f150950b;
                        } else {
                            bcVar = C56519bc.f150939c;
                        }
                        C64449aj ajVar = (C64449aj) C64450ak.f174831c.createBuilder();
                        C56540bx bxVar = bcVar.f150941a;
                        if (bxVar != null) {
                            C64483bq bqVar = (C64483bq) C64486bt.f174906c.createBuilder();
                            String str2 = bxVar.f150986b;
                            bqVar.copyOnWrite();
                            str2.getClass();
                            ((C64486bt) bqVar.instance).f174909b = str2;
                            if (bxVar.f150985a != null) {
                                C64484br brVar = (C64484br) C64485bs.f174903b.createBuilder();
                                C56539bw bwVar = bxVar.f150985a;
                                if (bwVar == null) {
                                    bwVar = C56539bw.f150979c;
                                }
                                C62971cq cqVar = bwVar.f150982b;
                                brVar.copyOnWrite();
                                C64485bs bsVar = (C64485bs) brVar.instance;
                                C62971cq cqVar2 = bsVar.f174905a;
                                if (!cqVar2.mo58948c()) {
                                    bsVar.f174905a = C62942bv.mutableCopy(cqVar2);
                                }
                                C62947c.addAll((Iterable) cqVar, (List) bsVar.f174905a);
                                bqVar.copyOnWrite();
                                C64485bs bsVar2 = (C64485bs) brVar.build();
                                bsVar2.getClass();
                                ((C64486bt) bqVar.instance).f174908a = bsVar2;
                            }
                            ajVar.copyOnWrite();
                            C64486bt btVar = (C64486bt) bqVar.build();
                            btVar.getClass();
                            ((C64450ak) ajVar.instance).f174833a = btVar;
                        }
                        C56563ct ctVar = bcVar.f150942b;
                        if (ctVar != null) {
                            C64491by byVar = (C64491by) C64503cj.f174948b.createBuilder();
                            C56562cs csVar = ctVar.f151037a;
                            if (csVar != null) {
                                C64492bz bzVar = (C64492bz) C64502ci.f174945b.createBuilder();
                                C56561cr crVar = csVar.f151034a;
                                if (crVar != null) {
                                    C64494ca caVar = (C64494ca) C64501ch.f174941c.createBuilder();
                                    C56560cq cqVar3 = crVar.f151030a;
                                    if (cqVar3 != null) {
                                        C64499cf cfVar = (C64499cf) C64500cg.f174934f.createBuilder();
                                        String str3 = cqVar3.f151023a;
                                        cfVar.copyOnWrite();
                                        str3.getClass();
                                        ((C64500cg) cfVar.instance).f174936a = str3;
                                        String str4 = cqVar3.f151024b;
                                        cfVar.copyOnWrite();
                                        str4.getClass();
                                        ((C64500cg) cfVar.instance).f174937b = str4;
                                        String str5 = cqVar3.f151025c;
                                        cfVar.copyOnWrite();
                                        str5.getClass();
                                        ((C64500cg) cfVar.instance).f174938c = str5;
                                        String str6 = cqVar3.f151026d;
                                        cfVar.copyOnWrite();
                                        str6.getClass();
                                        ((C64500cg) cfVar.instance).f174939d = str6;
                                        String str7 = cqVar3.f151027e;
                                        cfVar.copyOnWrite();
                                        str7.getClass();
                                        ((C64500cg) cfVar.instance).f174940e = str7;
                                        C64500cg cgVar = (C64500cg) cfVar.build();
                                        caVar.copyOnWrite();
                                        cgVar.getClass();
                                        ((C64501ch) caVar.instance).f174943a = cgVar;
                                    }
                                    C56558co coVar2 = crVar.f151031b;
                                    if (coVar2 != null) {
                                        C64495cb cbVar = (C64495cb) C64498ce.f174931b.createBuilder();
                                        if (coVar2.f151020a.size() > 0) {
                                            for (C56557cn cnVar : coVar2.f151020a) {
                                                C64496cc ccVar = (C64496cc) C64497cd.f174927c.createBuilder();
                                                String str8 = cnVar.f151016a;
                                                ccVar.copyOnWrite();
                                                str8.getClass();
                                                ((C64497cd) ccVar.instance).f174929a = str8;
                                                String str9 = cnVar.f151017b;
                                                ccVar.copyOnWrite();
                                                str9.getClass();
                                                ((C64497cd) ccVar.instance).f174930b = str9;
                                                C64497cd cdVar = (C64497cd) ccVar.build();
                                                cbVar.copyOnWrite();
                                                C64498ce ceVar = (C64498ce) cbVar.instance;
                                                cdVar.getClass();
                                                C62971cq cqVar4 = ceVar.f174933a;
                                                if (!cqVar4.mo58948c()) {
                                                    ceVar.f174933a = C62942bv.mutableCopy(cqVar4);
                                                }
                                                ceVar.f174933a.add(cdVar);
                                            }
                                        }
                                        caVar.copyOnWrite();
                                        C64498ce ceVar2 = (C64498ce) cbVar.build();
                                        ceVar2.getClass();
                                        ((C64501ch) caVar.instance).f174944b = ceVar2;
                                    }
                                    bzVar.copyOnWrite();
                                    C64501ch chVar = (C64501ch) caVar.build();
                                    chVar.getClass();
                                    ((C64502ci) bzVar.instance).f174947a = chVar;
                                }
                                byVar.copyOnWrite();
                                C64502ci ciVar = (C64502ci) bzVar.build();
                                ciVar.getClass();
                                ((C64503cj) byVar.instance).f174950a = ciVar;
                            }
                            ajVar.copyOnWrite();
                            C64503cj cjVar = (C64503cj) byVar.build();
                            cjVar.getClass();
                            ((C64450ak) ajVar.instance).f174834b = cjVar;
                        }
                        uVar.copyOnWrite();
                        C64455ap apVar2 = (C64455ap) uVar.instance;
                        C64450ak akVar = (C64450ak) ajVar.build();
                        akVar.getClass();
                        apVar2.f174842b = akVar;
                        apVar2.f174841a = 3;
                    } else if (i4 == 2) {
                        C64546v vVar = (C64546v) C64547w.f175048b.createBuilder();
                        if (bhVar.f150949a == 4) {
                            amVar = (C56502am) bhVar.f150950b;
                        } else {
                            amVar = C56502am.f150910b;
                        }
                        boolean z = amVar.f150912a;
                        vVar.copyOnWrite();
                        ((C64547w) vVar.instance).f175050a = z;
                        uVar.copyOnWrite();
                        C64455ap apVar3 = (C64455ap) uVar.instance;
                        C64547w wVar = (C64547w) vVar.build();
                        wVar.getClass();
                        apVar3.f174842b = wVar;
                        apVar3.f174841a = 4;
                    } else if (i4 == 3) {
                        if (i2 == 5) {
                            baVar = (C56517ba) bhVar.f150950b;
                        } else {
                            baVar = C56517ba.f150934d;
                        }
                        C64548x xVar = (C64548x) C64448ai.f174826d.createBuilder();
                        int i5 = baVar.f150938c;
                        xVar.copyOnWrite();
                        ((C64448ai) xVar.instance).f174830c = i5;
                        int i6 = baVar.f150936a;
                        int a = C56503an.m88206a(i6);
                        int i7 = a - 1;
                        if (a != 0) {
                            if (i7 == 0) {
                                if (i6 == 2) {
                                    azVar = (C56515az) baVar.f150937b;
                                } else {
                                    azVar = C56515az.f150927b;
                                }
                                C64446ag agVar = (C64446ag) C64447ah.f174823b.createBuilder();
                                C56513ax axVar = azVar.f150929a;
                                if (axVar != null) {
                                    C64445af a2 = C43059h.m75970a(axVar);
                                    agVar.copyOnWrite();
                                    a2.getClass();
                                    ((C64447ah) agVar.instance).f174825a = a2;
                                }
                                xVar.copyOnWrite();
                                C64448ai aiVar = (C64448ai) xVar.instance;
                                C64447ah ahVar = (C64447ah) agVar.build();
                                ahVar.getClass();
                                aiVar.f174829b = ahVar;
                                aiVar.f174828a = 2;
                            } else if (i7 == 1) {
                                if (i6 == 3) {
                                    aqVar = (C56506aq) baVar.f150937b;
                                } else {
                                    aqVar = C56506aq.f150913b;
                                }
                                C64549y yVar = (C64549y) C64550z.f175051b.createBuilder();
                                if (aqVar.f150915a.size() > 0) {
                                    for (C56513ax a3 : aqVar.f150915a) {
                                        C64445af a4 = C43059h.m75970a(a3);
                                        yVar.copyOnWrite();
                                        C64550z zVar = (C64550z) yVar.instance;
                                        a4.getClass();
                                        C62971cq cqVar5 = zVar.f175053a;
                                        if (!cqVar5.mo58948c()) {
                                            zVar.f175053a = C62942bv.mutableCopy(cqVar5);
                                        }
                                        zVar.f175053a.add(a4);
                                    }
                                }
                                xVar.copyOnWrite();
                                C64448ai aiVar2 = (C64448ai) xVar.instance;
                                C64550z zVar2 = (C64550z) yVar.build();
                                zVar2.getClass();
                                aiVar2.f174829b = zVar2;
                                aiVar2.f174828a = 3;
                            } else if (i7 == 2) {
                                if (i6 == 4) {
                                    auVar = (C56510au) baVar.f150937b;
                                } else {
                                    auVar = C56510au.f150919b;
                                }
                                C64442ac acVar = (C64442ac) C64443ad.f174815b.createBuilder();
                                C56513ax axVar2 = auVar.f150921a;
                                if (axVar2 != null) {
                                    C64445af a5 = C43059h.m75970a(axVar2);
                                    acVar.copyOnWrite();
                                    a5.getClass();
                                    ((C64443ad) acVar.instance).f174817a = a5;
                                }
                                xVar.copyOnWrite();
                                C64448ai aiVar3 = (C64448ai) xVar.instance;
                                C64443ad adVar = (C64443ad) acVar.build();
                                adVar.getClass();
                                aiVar3.f174829b = adVar;
                                aiVar3.f174828a = 4;
                            } else if (i7 == 3) {
                                C64440aa aaVar = (C64440aa) C64441ab.f174812b.createBuilder();
                                if (baVar.f150936a == 5) {
                                    asVar = (C56508as) baVar.f150937b;
                                } else {
                                    asVar = C56508as.f150916b;
                                }
                                String str10 = asVar.f150918a;
                                aaVar.copyOnWrite();
                                str10.getClass();
                                ((C64441ab) aaVar.instance).f174814a = str10;
                                xVar.copyOnWrite();
                                C64448ai aiVar4 = (C64448ai) xVar.instance;
                                C64441ab abVar = (C64441ab) aaVar.build();
                                abVar.getClass();
                                aiVar4.f174829b = abVar;
                                aiVar4.f174828a = 5;
                            }
                            uVar.copyOnWrite();
                            C64455ap apVar4 = (C64455ap) uVar.instance;
                            C64448ai aiVar5 = (C64448ai) xVar.build();
                            aiVar5.getClass();
                            apVar4.f174842b = aiVar5;
                            apVar4.f174841a = 5;
                        } else {
                            throw null;
                        }
                    } else if (i4 == 4) {
                        C64452am amVar2 = C64452am.f174835a;
                        uVar.copyOnWrite();
                        C64455ap apVar5 = (C64455ap) uVar.instance;
                        amVar2.getClass();
                        apVar5.f174842b = amVar2;
                        apVar5.f174841a = 6;
                    }
                    coVar.copyOnWrite();
                    C64455ap apVar6 = (C64455ap) uVar.build();
                    apVar6.getClass();
                    ((C64509cp) coVar.instance).f174961a = apVar6;
                } else {
                    throw null;
                }
            }
            if (bVar.f150933b != null) {
                C64504ck ckVar = (C64504ck) C64505cl.f174951c.createBuilder();
                C56565cv cvVar = bVar.f150933b;
                if (cvVar == null) {
                    cvVar = C56565cv.f151038c;
                }
                String str11 = cvVar.f151040a;
                ckVar.copyOnWrite();
                str11.getClass();
                ((C64505cl) ckVar.instance).f174953a = str11;
                C56565cv cvVar2 = bVar.f150933b;
                if (cvVar2 == null) {
                    cvVar2 = C56565cv.f151038c;
                }
                C63088z zVar3 = cvVar2.f151041b;
                ckVar.copyOnWrite();
                zVar3.getClass();
                ((C64505cl) ckVar.instance).f174954b = zVar3;
                C64505cl clVar = (C64505cl) ckVar.build();
                coVar.copyOnWrite();
                clVar.getClass();
                ((C64509cp) coVar.instance).f174962b = clVar;
            }
            C43058g a6 = C43058g.m75965a();
            C64456aq aqVar2 = (C64456aq) C64457ar.f174844e.createBuilder();
            aqVar2.copyOnWrite();
            C64457ar arVar2 = (C64457ar) aqVar2.instance;
            C64509cp cpVar = (C64509cp) coVar.build();
            cpVar.getClass();
            arVar2.f174847b = cpVar;
            arVar2.f174846a = 3;
            C64511cr crVar2 = C64511cr.f174963a;
            aqVar2.copyOnWrite();
            C64457ar arVar3 = (C64457ar) aqVar2.instance;
            crVar2.getClass();
            arVar3.f174849d = crVar2;
            arVar3.f174848c = 5;
            a6.mo46077b((C64457ar) aqVar2.build(), C43060i.m75976b(iVar.f112619a), iVar.mo46080a(), context, str);
        }
    }
}
