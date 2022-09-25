package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74158ml;
import com.google.android.apps.gsa.binaries.satin.app.C74159mo;
import com.google.android.apps.gsa.binaries.satin.app.mn;
import com.google.android.apps.gsa.binaries.satin.app.mq;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.C90773bq;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opapayments.p8664a.p8665a.C115906a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4129b.p4130a.p4131a.p4132a.C54657aa;
import com.google.p4129b.p4130a.p4131a.p4132a.C54658ab;
import com.google.p4129b.p4130a.p4131a.p4132a.C54660ad;
import com.google.p4129b.p4130a.p4131a.p4132a.C54681ay;
import com.google.p4129b.p4130a.p4131a.p4132a.C54682az;
import com.google.p4129b.p4130a.p4131a.p4132a.C54691bh;
import com.google.p4129b.p4130a.p4131a.p4132a.C54692bi;
import com.google.p4129b.p4130a.p4131a.p4132a.C54693bj;
import com.google.p4129b.p4130a.p4131a.p4132a.C54695bl;
import com.google.p4129b.p4130a.p4131a.p4132a.C54704bu;
import com.google.p4129b.p4130a.p4131a.p4132a.C54705bv;
import com.google.p4129b.p4130a.p4131a.p4132a.C54707bx;
import com.google.p4129b.p4130a.p4131a.p4132a.C54710c;
import com.google.p4129b.p4130a.p4131a.p4132a.C54718d;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54652b;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54653c;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54655e;
import com.google.p4129b.p4130a.p4131a.p4132a.p4133a.C54656f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.d */
/* compiled from: PG */
public final class C115924d extends C83870ad implements C83904bj {

    /* renamed from: i */
    private static final C59071e f321437i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opapayments.a.d");

    /* renamed from: a */
    C60870cx f321438a;

    /* renamed from: b */
    C60870cx f321439b;

    /* renamed from: c */
    byte[] f321440c;

    /* renamed from: d */
    C115929i f321441d;

    /* renamed from: e */
    C54695bl f321442e;

    /* renamed from: f */
    String f321443f;

    /* renamed from: g */
    int f321444g = 1;

    /* renamed from: h */
    final int f321445h;

    /* renamed from: j */
    private final C84026u f321446j;

    /* renamed from: k */
    private final C115906a f321447k;

    /* renamed from: l */
    private final C115930j f321448l;

    /* renamed from: m */
    private final C115918af f321449m;

    /* renamed from: n */
    private final Context f321450n;

    /* renamed from: o */
    private C60870cx f321451o;

    /* renamed from: p */
    private int f321452p;

    public C115924d(Bundle bundle, C84026u uVar, C115906a aVar, C115918af afVar, Context context, C115930j jVar) {
        this.f321446j = uVar;
        this.f321447k = aVar;
        this.f321449m = afVar;
        this.f321450n = context;
        this.f321448l = jVar;
        this.f321445h = true != bundle.getBoolean("deviceFingerprintAuthAvailable") ? 3 : 4;
    }

    /* renamed from: e */
    private static C54718d m192168e() {
        C54710c cVar = (C54710c) C54718d.f143611b.createBuilder();
        cVar.mo54152a(4);
        cVar.mo54152a(3);
        return (C54718d) cVar.build();
    }

    /* renamed from: f */
    private static C54653c m192169f(Context context) {
        String str;
        try {
            str = C90773bq.m148321c(context);
        } catch (PackageManager.NameNotFoundException unused) {
            C59104x c = f321437i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PaymentsOobe");
            ((C59052c) ((C59052c) c).mo56372aa(30149)).mo56386p("Unknown app version.");
            str = BuildConfig.FLAVOR;
        }
        C54652b bVar = (C54652b) C54653c.f143482d.createBuilder();
        bVar.copyOnWrite();
        ((C54653c) bVar.instance).f143484a = 1;
        bVar.copyOnWrite();
        ((C54653c) bVar.instance).f143485b = "AGSA";
        bVar.copyOnWrite();
        str.getClass();
        ((C54653c) bVar.instance).f143486c = str;
        return (C54653c) bVar.build();
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return C83903bi.m133649e(0, (Intent) null);
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        int i = this.f321452p;
        int i2 = i - 2;
        if (i == 0) {
            throw null;
        } else if (i2 != 2) {
            return C83903bi.m133649e(-1, new Intent().putExtra("opaPaymentsVersionInfo", this.f321443f));
        } else {
            return C83903bi.m133649e(0, (Intent) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        int i = this.f321444g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            int i3 = 1;
            if (i2 == 1) {
                this.f321444g = 3;
                C58838bb.m90883r(C90877ak.m148480n(this.f321439b));
                this.f321440c = (byte[]) C90877ak.m148474h(this.f321439b);
                C54657aa aaVar = (C54657aa) C54658ab.f143490d.createBuilder();
                C54692bi biVar = (C54692bi) C54693bj.f143559f.createBuilder();
                int i4 = this.f321445h;
                biVar.copyOnWrite();
                ((C54693bj) biVar.instance).f143563c = i4 - 2;
                C63088z A = C63088z.m96139A(this.f321440c);
                biVar.copyOnWrite();
                ((C54693bj) biVar.instance).f143562b = A;
                C54653c f = m192169f(this.f321450n);
                biVar.copyOnWrite();
                f.getClass();
                ((C54693bj) biVar.instance).f143564d = f;
                C54718d e = m192168e();
                biVar.copyOnWrite();
                e.getClass();
                ((C54693bj) biVar.instance).f143565e = e;
                aaVar.copyOnWrite();
                C54693bj bjVar = (C54693bj) biVar.build();
                bjVar.getClass();
                ((C54658ab) aaVar.instance).f143494c = bjVar;
                C54681ay ayVar = (C54681ay) C54682az.f143534b.createBuilder();
                ayVar.copyOnWrite();
                ((C54682az) ayVar.instance).f143536a = 3;
                aaVar.copyOnWrite();
                C54658ab abVar = (C54658ab) aaVar.instance;
                C54682az azVar = (C54682az) ayVar.build();
                azVar.getClass();
                abVar.f143493b = azVar;
                abVar.f143492a = 2;
                C54658ab abVar2 = (C54658ab) aaVar.build();
                C115906a aVar = this.f321447k;
                C89356b b = aVar.f321384a.mo78026b("FetchOpaPaymentsInitialResponse", C118575h.GRAPH_OPA_PAYMENTS, C118575h.GRAPH_OPA_PAYMENTS);
                C74158ml mlVar = aVar.f321385b;
                mlVar.f206611b = b;
                abVar2.getClass();
                mlVar.f206612c = abVar2;
                C68225k.m98529a(mlVar.f206611b, C89356b.class);
                C68225k.m98529a(mlVar.f206612c, C54658ab.class);
                C60870cx gq = new mn(mlVar.f206610a, mlVar.f206611b, mlVar.f206612c).b.mo60297gq();
                this.f321451o = gq;
                return C58833ax.m90834k(this.f321446j.mo77487a(gq, C115923c.f321436a));
            } else if (i2 == 2) {
                this.f321444g = 4;
                C58838bb.m90883r(C90877ak.m148480n(this.f321451o));
                C54660ad adVar = (C54660ad) C90877ak.m148474h(this.f321451o);
                C54656f fVar = adVar.f143498b;
                if (fVar == null) {
                    fVar = C54656f.f143487b;
                }
                int a = C54655e.m87521a(fVar.f143489a);
                if (a != 0 && a == 3) {
                    return C58836b.f156633a;
                }
                C54695bl blVar = adVar.f143497a;
                if (blVar == null) {
                    blVar = C54695bl.f143566c;
                }
                this.f321442e = blVar;
                C115929i a2 = this.f321448l.mo102332a(adVar.f143499c);
                this.f321441d = a2;
                return C58833ax.m90834k(a2);
            } else if (i2 == 3) {
                this.f321444g = 5;
                C54704bu buVar = (C54704bu) C54705bv.f143590c.createBuilder();
                C54692bi biVar2 = (C54692bi) C54693bj.f143559f.createBuilder();
                C63088z zVar = this.f321442e.f143568a;
                biVar2.copyOnWrite();
                zVar.getClass();
                ((C54693bj) biVar2.instance).f143561a = zVar;
                C63088z A2 = C63088z.m96139A(this.f321440c);
                biVar2.copyOnWrite();
                ((C54693bj) biVar2.instance).f143562b = A2;
                C54653c f2 = m192169f(this.f321450n);
                biVar2.copyOnWrite();
                f2.getClass();
                ((C54693bj) biVar2.instance).f143564d = f2;
                C54718d e2 = m192168e();
                biVar2.copyOnWrite();
                e2.getClass();
                ((C54693bj) biVar2.instance).f143565e = e2;
                int i5 = this.f321445h;
                biVar2.copyOnWrite();
                ((C54693bj) biVar2.instance).f143563c = i5 - 2;
                buVar.copyOnWrite();
                C54693bj bjVar2 = (C54693bj) biVar2.build();
                bjVar2.getClass();
                ((C54705bv) buVar.instance).f143592a = bjVar2;
                C54691bh bhVar = this.f321441d.f321457a;
                buVar.copyOnWrite();
                C54705bv bvVar = (C54705bv) buVar.instance;
                bhVar.getClass();
                C62971cq cqVar = bvVar.f143593b;
                if (!cqVar.mo58948c()) {
                    bvVar.f143593b = C62942bv.mutableCopy(cqVar);
                }
                bvVar.f143593b.add(bhVar);
                C54705bv bvVar2 = (C54705bv) buVar.build();
                C115906a aVar2 = this.f321447k;
                C89356b a3 = aVar2.f321384a.mo78025a("FetchOpaPaymentsSubmitResponse", 588, 588);
                C74159mo moVar = aVar2.f321386c;
                moVar.f206614b = a3;
                bvVar2.getClass();
                moVar.f206615c = bvVar2;
                C68225k.m98529a(moVar.f206614b, C89356b.class);
                C68225k.m98529a(moVar.f206615c, C54705bv.class);
                C60870cx gq2 = new mq(moVar.f206613a, moVar.f206614b, moVar.f206615c).b.mo60297gq();
                this.f321438a = gq2;
                return C58833ax.m90834k(this.f321446j.mo77487a(gq2, C115923c.f321436a));
            } else if (i2 != 4) {
                throw new AssertionError("unknown state: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SUBMIT_RESPONSE" : "SUBMIT_REQUEST" : "INITIALIZE_RESPONSE" : "INITIALIZE_REQUEST" : "UNINITIALIZED"));
            } else {
                this.f321444g = 4;
                C58838bb.m90883r(C90877ak.m148480n(this.f321438a));
                C54707bx bxVar = (C54707bx) C90877ak.m148474h(this.f321438a);
                C54656f fVar2 = bxVar.f143597b;
                if (fVar2 == null) {
                    fVar2 = C54656f.f143487b;
                }
                int a4 = C54655e.m87521a(fVar2.f143489a);
                if (a4 == 0 || a4 != 3) {
                    C54656f fVar3 = bxVar.f143597b;
                    if (fVar3 == null) {
                        fVar3 = C54656f.f143487b;
                    }
                    int a5 = C54655e.m87521a(fVar3.f143489a);
                    if (a5 == 0 || a5 != 4) {
                        C54695bl blVar2 = bxVar.f143596a;
                        if (blVar2 == null) {
                            blVar2 = C54695bl.f143566c;
                        }
                        this.f321442e = blVar2;
                        C115929i a6 = this.f321448l.mo102332a(bxVar.f143598c);
                        this.f321441d = a6;
                        return C58833ax.m90834k(a6);
                    }
                }
                C54695bl blVar3 = bxVar.f143596a;
                if (blVar3 == null) {
                    blVar3 = C54695bl.f143566c;
                }
                this.f321443f = blVar3.f143569b;
                C54656f fVar4 = bxVar.f143597b;
                if (fVar4 == null) {
                    fVar4 = C54656f.f143487b;
                }
                int a7 = C54655e.m87521a(fVar4.f143489a);
                if (a7 != 0) {
                    i3 = a7;
                }
                this.f321452p = i3;
                return C58836b.f156633a;
            }
        } else {
            this.f321444g = 2;
            C115918af afVar = this.f321449m;
            C58976aa aaVar2 = C58975e.f156826a;
            C60870cx i6 = afVar.mo84765i(new C115917ae(afVar), "getClientToken");
            this.f321439b = i6;
            return C58833ax.m90834k(this.f321446j.mo77487a(i6, C115923c.f321436a));
        }
    }
}
