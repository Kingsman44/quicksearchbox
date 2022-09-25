package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8120a;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.util.C91988g;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9164b;
import com.google.android.apps.p489g.p494d.C9174bj;
import com.google.android.apps.p489g.p494d.C9183bs;
import com.google.android.apps.p489g.p494d.C9188bx;
import com.google.android.apps.p489g.p494d.C9200ci;
import com.google.android.apps.p489g.p494d.C9201cj;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7818lb;
import com.google.p375ai.p378b.C7893nw;
import com.google.p375ai.p378b.C8000rv;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.a.d */
/* compiled from: PG */
public final class C104997d {

    /* renamed from: A */
    private final Context f292503A;

    /* renamed from: B */
    private final C9277u f292504B;

    /* renamed from: C */
    private final C7718hj f292505C;

    /* renamed from: D */
    private C9201cj f292506D;

    /* renamed from: a */
    public final C104996c f292507a;

    /* renamed from: b */
    public final C104996c f292508b;

    /* renamed from: c */
    public final C104996c f292509c;

    /* renamed from: d */
    public final C104996c f292510d;

    /* renamed from: e */
    public final C104996c f292511e;

    /* renamed from: f */
    public C7818lb f292512f;

    /* renamed from: g */
    public boolean f292513g;

    /* renamed from: h */
    public int f292514h;

    /* renamed from: i */
    public boolean f292515i;

    /* renamed from: j */
    public boolean f292516j;

    /* renamed from: k */
    public boolean f292517k;

    /* renamed from: l */
    public boolean f292518l;

    /* renamed from: m */
    public String f292519m;

    /* renamed from: n */
    public String f292520n;

    /* renamed from: o */
    public int f292521o;

    /* renamed from: p */
    public int f292522p;

    /* renamed from: q */
    public C9164b f292523q;

    /* renamed from: r */
    public int f292524r;

    /* renamed from: s */
    public C9164b f292525s;

    /* renamed from: t */
    public int f292526t;

    /* renamed from: u */
    public int f292527u;

    /* renamed from: v */
    public C9174bj f292528v;

    /* renamed from: w */
    public C8000rv f292529w;

    /* renamed from: x */
    public Integer f292530x;

    /* renamed from: y */
    public int f292531y = 1;

    /* renamed from: z */
    public int f292532z = 1;

    public C104997d(Context context, C9277u uVar, C7718hj hjVar) {
        this.f292503A = context;
        this.f292504B = uVar;
        this.f292505C = hjVar;
        this.f292507a = new C104996c();
        this.f292508b = new C104996c();
        this.f292509c = new C104996c();
        this.f292510d = new C104996c();
        this.f292511e = new C104996c();
    }

    /* renamed from: a */
    public final C9278v mo94440a() {
        C9183bs bsVar = (C9183bs) C9188bx.f31714x.createBuilder();
        List b = this.f292507a.mo94438b();
        bsVar.copyOnWrite();
        C9188bx bxVar = (C9188bx) bsVar.instance;
        C62971cq cqVar = bxVar.f31717b;
        if (!cqVar.mo58948c()) {
            bxVar.f31717b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) b, (List) bxVar.f31717b);
        List b2 = this.f292508b.mo94438b();
        bsVar.copyOnWrite();
        C9188bx bxVar2 = (C9188bx) bsVar.instance;
        C62971cq cqVar2 = bxVar2.f31718c;
        if (!cqVar2.mo58948c()) {
            bxVar2.f31718c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) b2, (List) bxVar2.f31718c);
        List b3 = this.f292509c.mo94438b();
        bsVar.copyOnWrite();
        C9188bx bxVar3 = (C9188bx) bsVar.instance;
        C62971cq cqVar3 = bxVar3.f31720e;
        if (!cqVar3.mo58948c()) {
            bxVar3.f31720e = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) b3, (List) bxVar3.f31720e);
        C7818lb lbVar = this.f292512f;
        if (lbVar != null) {
            bsVar.copyOnWrite();
            C9188bx bxVar4 = (C9188bx) bsVar.instance;
            bxVar4.f31728m = lbVar;
            bxVar4.f31716a |= 256;
        }
        int i = this.f292514h;
        if (i != 0) {
            bsVar.copyOnWrite();
            C9188bx bxVar5 = (C9188bx) bsVar.instance;
            bxVar5.f31716a |= 4;
            bxVar5.f31722g = i;
        }
        int i2 = this.f292521o;
        if (i2 > 0) {
            bsVar.copyOnWrite();
            C9188bx bxVar6 = (C9188bx) bsVar.instance;
            bxVar6.f31716a |= 2048;
            bxVar6.f31731p = i2;
        }
        C9201cj cjVar = this.f292506D;
        if (cjVar == null) {
            C9201cj cjVar2 = C9201cj.f31773u;
            bsVar.copyOnWrite();
            C9188bx bxVar7 = (C9188bx) bsVar.instance;
            cjVar2.getClass();
            bxVar7.f31721f = cjVar2;
            bxVar7.f31716a |= 2;
        } else {
            C9200ci ciVar = (C9200ci) cjVar.toBuilder();
            boolean z = this.f292517k;
            ciVar.copyOnWrite();
            C9201cj cjVar3 = (C9201cj) ciVar.instance;
            cjVar3.f31775a |= 1024;
            cjVar3.f31788n = z;
            boolean z2 = this.f292518l;
            ciVar.copyOnWrite();
            C9201cj cjVar4 = (C9201cj) ciVar.instance;
            cjVar4.f31775a |= 2048;
            cjVar4.f31789o = z2;
            ciVar.copyOnWrite();
            ((C9201cj) ciVar.instance).f31790p = C9201cj.emptyProtobufList();
            List b4 = this.f292510d.mo94438b();
            ciVar.copyOnWrite();
            C9201cj cjVar5 = (C9201cj) ciVar.instance;
            C62971cq cqVar4 = cjVar5.f31790p;
            if (!cqVar4.mo58948c()) {
                cjVar5.f31790p = C62942bv.mutableCopy(cqVar4);
            }
            C62947c.addAll((Iterable) b4, (List) cjVar5.f31790p);
            ciVar.copyOnWrite();
            ((C9201cj) ciVar.instance).f31791q = C9201cj.emptyProtobufList();
            List b5 = this.f292511e.mo94438b();
            ciVar.copyOnWrite();
            C9201cj cjVar6 = (C9201cj) ciVar.instance;
            C62971cq cqVar5 = cjVar6.f31791q;
            if (!cqVar5.mo58948c()) {
                cjVar6.f31791q = C62942bv.mutableCopy(cqVar5);
            }
            C62947c.addAll((Iterable) b5, (List) cjVar6.f31791q);
            boolean z3 = this.f292515i;
            ciVar.copyOnWrite();
            C9201cj cjVar7 = (C9201cj) ciVar.instance;
            cjVar7.f31775a |= 4096;
            cjVar7.f31792r = z3;
            String str = this.f292519m;
            if (str != null) {
                ciVar.copyOnWrite();
                C9201cj cjVar8 = (C9201cj) ciVar.instance;
                cjVar8.f31775a |= 16384;
                cjVar8.f31794t = str;
            }
            String str2 = this.f292520n;
            if (str2 != null) {
                ciVar.copyOnWrite();
                C9201cj cjVar9 = (C9201cj) ciVar.instance;
                cjVar9.f31775a |= 8192;
                cjVar9.f31793s = str2;
            }
            bsVar.copyOnWrite();
            C9188bx bxVar8 = (C9188bx) bsVar.instance;
            C9201cj cjVar10 = (C9201cj) ciVar.build();
            cjVar10.getClass();
            bxVar8.f31721f = cjVar10;
            bxVar8.f31716a |= 2;
        }
        C9164b bVar = this.f292525s;
        if (bVar != null) {
            bsVar.copyOnWrite();
            C9188bx bxVar9 = (C9188bx) bsVar.instance;
            bxVar9.f31723h = bVar;
            bxVar9.f31716a |= 8;
        }
        C9164b bVar2 = this.f292523q;
        if (bVar2 != null) {
            bsVar.copyOnWrite();
            C9188bx bxVar10 = (C9188bx) bsVar.instance;
            bxVar10.f31729n = bVar2;
            bxVar10.f31716a |= 512;
        }
        int i3 = this.f292531y;
        bsVar.copyOnWrite();
        C9188bx bxVar11 = (C9188bx) bsVar.instance;
        int i4 = i3 - 1;
        if (i3 != 0) {
            bxVar11.f31725j = i4;
            bxVar11.f31716a |= 32;
            boolean z4 = this.f292513g;
            bsVar.copyOnWrite();
            C9188bx bxVar12 = (C9188bx) bsVar.instance;
            bxVar12.f31716a |= 64;
            bxVar12.f31726k = z4;
            boolean z5 = this.f292516j;
            bsVar.copyOnWrite();
            C9188bx bxVar13 = (C9188bx) bsVar.instance;
            bxVar13.f31716a |= 128;
            bxVar13.f31727l = z5;
            bsVar.copyOnWrite();
            C9188bx bxVar14 = (C9188bx) bsVar.instance;
            bxVar14.f31716a |= 1024;
            bxVar14.f31730o = false;
            int i5 = this.f292524r;
            bsVar.copyOnWrite();
            C9188bx bxVar15 = (C9188bx) bsVar.instance;
            bxVar15.f31716a |= 4096;
            bxVar15.f31732q = i5;
            int i6 = this.f292526t;
            bsVar.copyOnWrite();
            C9188bx bxVar16 = (C9188bx) bsVar.instance;
            bxVar16.f31716a |= 16384;
            bxVar16.f31734s = i6;
            int i7 = this.f292527u;
            bsVar.copyOnWrite();
            C9188bx bxVar17 = (C9188bx) bsVar.instance;
            bxVar17.f31716a |= 32768;
            bxVar17.f31735t = i7;
            int i8 = this.f292532z;
            if (i8 != 1) {
                bsVar.copyOnWrite();
                C9188bx bxVar18 = (C9188bx) bsVar.instance;
                int i9 = i8 - 1;
                if (i8 != 0) {
                    bxVar18.f31733r = i9;
                    bxVar18.f31716a |= 8192;
                } else {
                    throw null;
                }
            }
            C9174bj bjVar = this.f292528v;
            if (bjVar != null) {
                bsVar.copyOnWrite();
                C9188bx bxVar19 = (C9188bx) bsVar.instance;
                bxVar19.f31736u = bjVar;
                bxVar19.f31716a |= 65536;
            }
            C8000rv rvVar = this.f292529w;
            if (rvVar != null) {
                bsVar.copyOnWrite();
                C9188bx bxVar20 = (C9188bx) bsVar.instance;
                bxVar20.f31737v = rvVar;
                bxVar20.f31716a |= C89885b.S3REQUEST_VALUE;
            }
            Integer num = this.f292530x;
            if (num != null) {
                int intValue = num.intValue();
                bsVar.copyOnWrite();
                C9188bx bxVar21 = (C9188bx) bsVar.instance;
                bxVar21.f31716a |= C89885b.HTTP_VALUE;
                bxVar21.f31738w = intValue;
            }
            C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
            int i10 = this.f292522p;
            if (i10 != 0) {
                qVar.copyOnWrite();
                C9278v vVar = (C9278v) qVar.instance;
                vVar.f32195b |= 16;
                vVar.f32179M = i10;
            }
            C7718hj hjVar = this.f292505C;
            if (hjVar != null) {
                qVar.copyOnWrite();
                C9278v vVar2 = (C9278v) qVar.instance;
                vVar2.f32174H = hjVar;
                vVar2.f32192a |= LinearLayoutManager.INVALID_OFFSET;
            }
            C9277u uVar = this.f292504B;
            qVar.copyOnWrite();
            C9278v vVar3 = (C9278v) qVar.instance;
            vVar3.f32196c = uVar.f32164ay;
            vVar3.f32192a = 1 | vVar3.f32192a;
            qVar.copyOnWrite();
            C9278v vVar4 = (C9278v) qVar.instance;
            vVar4.f32178L = 0;
            vVar4.f32195b |= 8;
            qVar.copyOnWrite();
            C9278v vVar5 = (C9278v) qVar.instance;
            C9188bx bxVar22 = (C9188bx) bsVar.build();
            bxVar22.getClass();
            vVar5.f32210q = bxVar22;
            vVar5.f32192a |= 16384;
            return (C9278v) qVar.build();
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo94441b(C7893nw nwVar) {
        C7681g gVar;
        if (nwVar != null && !nwVar.f27743k.isEmpty()) {
            C9200ci ciVar = (C9200ci) C9201cj.f31773u.createBuilder();
            String str = (!C91115n.m148875g() || nwVar.f27744l.isEmpty()) ? nwVar.f27743k : nwVar.f27744l;
            ciVar.copyOnWrite();
            C9201cj cjVar = (C9201cj) ciVar.instance;
            str.getClass();
            cjVar.f31775a |= 1;
            cjVar.f31776b = str;
            if ((nwVar.f27733a & 2048) != 0) {
                String str2 = (!C91115n.m148875g() || nwVar.f27746n.isEmpty()) ? nwVar.f27745m : nwVar.f27746n;
                ciVar.copyOnWrite();
                C9201cj cjVar2 = (C9201cj) ciVar.instance;
                str2.getClass();
                cjVar2.f31775a |= 2;
                cjVar2.f31777c = str2;
            }
            if ((nwVar.f27733a & 1) != 0) {
                int i = nwVar.f27734b;
                ciVar.copyOnWrite();
                C9201cj cjVar3 = (C9201cj) ciVar.instance;
                cjVar3.f31775a |= 8;
                cjVar3.f31781g = i;
            }
            if ((nwVar.f27733a & 2) != 0) {
                int i2 = nwVar.f27735c;
                ciVar.copyOnWrite();
                C9201cj cjVar4 = (C9201cj) ciVar.instance;
                cjVar4.f31775a |= 16;
                cjVar4.f31782h = i2;
            }
            if ((nwVar.f27733a & 4) != 0) {
                float b = C91115n.m148870b((float) nwVar.f27736d, this.f292503A);
                ciVar.copyOnWrite();
                C9201cj cjVar5 = (C9201cj) ciVar.instance;
                cjVar5.f31775a |= 8;
                cjVar5.f31781g = (int) b;
            }
            if ((nwVar.f27733a & 8) != 0) {
                float b2 = C91115n.m148870b((float) nwVar.f27737e, this.f292503A);
                ciVar.copyOnWrite();
                C9201cj cjVar6 = (C9201cj) ciVar.instance;
                cjVar6.f31775a |= 16;
                cjVar6.f31782h = (int) b2;
            }
            if ((nwVar.f27733a & 256) != 0) {
                float f = nwVar.f27742j;
                ciVar.copyOnWrite();
                C9201cj cjVar7 = (C9201cj) ciVar.instance;
                cjVar7.f31775a |= 32;
                cjVar7.f31783i = f;
            }
            if ((nwVar.f27733a & 16) != 0) {
                float b3 = C91115n.m148870b((float) nwVar.f27738f, this.f292503A);
                ciVar.copyOnWrite();
                C9201cj cjVar8 = (C9201cj) ciVar.instance;
                cjVar8.f31775a |= 64;
                cjVar8.f31784j = (int) b3;
            }
            if ((nwVar.f27733a & 32) != 0) {
                float b4 = C91115n.m148870b((float) nwVar.f27739g, this.f292503A);
                ciVar.copyOnWrite();
                C9201cj cjVar9 = (C9201cj) ciVar.instance;
                cjVar9.f31775a |= 128;
                cjVar9.f31785k = (int) b4;
            }
            if ((nwVar.f27733a & 64) != 0) {
                float b5 = C91115n.m148870b((float) nwVar.f27740h, this.f292503A);
                ciVar.copyOnWrite();
                C9201cj cjVar10 = (C9201cj) ciVar.instance;
                cjVar10.f31775a |= 256;
                cjVar10.f31786l = (int) b5;
            }
            if ((nwVar.f27733a & 128) != 0) {
                float b6 = C91115n.m148870b((float) nwVar.f27741i, this.f292503A);
                ciVar.copyOnWrite();
                C9201cj cjVar11 = (C9201cj) ciVar.instance;
                cjVar11.f31775a |= 512;
                cjVar11.f31787m = (int) b6;
            }
            if ((nwVar.f27733a & 32768) != 0) {
                C7526an anVar = nwVar.f27747o;
                if (anVar == null) {
                    anVar = C7526an.f26049l;
                }
                if ((anVar.f26051a & 512) != 0) {
                    C7526an anVar2 = nwVar.f27747o;
                    if (anVar2 == null) {
                        anVar2 = C7526an.f26049l;
                    }
                    gVar = C7681g.m22802a(anVar2.f26060j);
                    if (gVar == null) {
                        gVar = C7681g.INVALID;
                    }
                } else {
                    gVar = C7681g.CLICK_WIDGET;
                }
                C7526an anVar3 = nwVar.f27747o;
                if (anVar3 == null) {
                    anVar3 = C7526an.f26049l;
                }
                C9141ad c = C91988g.m150966c(anVar3, gVar, 0);
                if (c != null) {
                    ciVar.copyOnWrite();
                    C9201cj cjVar12 = (C9201cj) ciVar.instance;
                    cjVar12.f31779e = c;
                    cjVar12.f31775a |= 4;
                }
            }
            this.f292506D = (C9201cj) ciVar.build();
        }
    }
}
