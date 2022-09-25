package com.google.android.libraries.elements.p1714d.p1719e;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21271bn;
import com.google.android.libraries.elements.interfaces.C21295ck;
import com.google.android.libraries.elements.interfaces.C21302i;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21344e;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1705a.p1706a.C20680d;
import com.google.common.base.C58833ax;
import com.google.p370af.C7492e;
import com.google.protos.youtube.elements.C66042ad;
import com.google.protos.youtube.elements.C66043ae;
import com.google.protos.youtube.elements.C66044af;
import com.google.protos.youtube.elements.C66045ag;
import com.google.protos.youtube.elements.C66046ah;
import com.google.protos.youtube.elements.C66047ai;
import com.google.protos.youtube.elements.C66048aj;
import com.google.protos.youtube.elements.C66049ak;
import com.google.protos.youtube.elements.C66050al;
import com.google.protos.youtube.elements.C66051am;
import com.google.protos.youtube.elements.C66052an;
import com.google.protos.youtube.elements.C66053ao;
import com.google.protos.youtube.elements.C66054ap;
import com.google.protos.youtube.elements.C66055aq;
import com.google.protos.youtube.elements.C66205ds;
import com.google.protos.youtube.elements.C66206dt;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.C66223ej;
import com.google.protos.youtube.elements.C66224ek;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68096r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.WeakHashMap;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: com.google.android.libraries.elements.d.e.ag */
/* compiled from: PG */
public final class C21001ag implements C21271bn {

    /* renamed from: a */
    public static final WeakHashMap f58876a = new WeakHashMap();

    /* renamed from: b */
    public final C21313t f58877b;

    /* renamed from: c */
    private final C21359t f58878c;

    /* renamed from: d */
    private final boolean f58879d;

    public C21001ag(C21313t tVar, C21359t tVar2, C58833ax axVar) {
        this.f58877b = tVar;
        this.f58878c = tVar2;
        this.f58879d = ((Boolean) axVar.mo56109e(false)).booleanValue();
    }

    /* renamed from: f */
    public static C21311r m39467f(View view, View view2, C21295ck ckVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, C21248ar arVar, C21310q qVar, C21319z zVar) {
        C21309p k = C21311r.m40252k();
        if (view != null) {
            ((C21230a) k).f59560a = view;
        }
        if (view2 != null) {
            ((C21230a) k).f59561b = view2;
        }
        if (ckVar != null) {
            ((C21230a) k).f59562c = ckVar;
        }
        k.mo26700c(zVar);
        ((C21230a) k).f59565f = zVar.mo26806h();
        if (qVar != null) {
            k = qVar.mo25826a(k);
        }
        if (senderStateOuterClass$SenderState != null) {
            SenderStateOuterClass$SenderState b = k.mo26699b();
            if (b == null) {
                k.mo26702e(senderStateOuterClass$SenderState);
            } else {
                C66216ec ecVar = (C66216ec) b.toBuilder();
                ecVar.mergeFrom(senderStateOuterClass$SenderState);
                k.mo26702e((SenderStateOuterClass$SenderState) ecVar.build());
            }
        }
        k.mo26701d(arVar);
        return k.mo26698a();
    }

    /* renamed from: g */
    public static C66043ae m39468g(View view, C21295ck ckVar, float f, float f2) {
        int left = view.getLeft();
        int top = view.getTop();
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        C21302i iVar = (C21302i) ckVar;
        float f3 = iVar.f59674a;
        float f4 = iVar.f59675b;
        C66042ad adVar = (C66042ad) C66043ae.f179603e.createBuilder();
        C66205ds dsVar = (C66205ds) C66206dt.f180035d.createBuilder();
        float e = m39466e(displayMetrics, f3);
        dsVar.copyOnWrite();
        C66206dt dtVar = (C66206dt) dsVar.instance;
        dtVar.f180037a |= 1;
        dtVar.f180038b = e;
        float e2 = m39466e(displayMetrics, f4);
        dsVar.copyOnWrite();
        C66206dt dtVar2 = (C66206dt) dsVar.instance;
        dtVar2.f180037a |= 2;
        dtVar2.f180039c = e2;
        adVar.copyOnWrite();
        C66043ae aeVar = (C66043ae) adVar.instance;
        C66206dt dtVar3 = (C66206dt) dsVar.build();
        dtVar3.getClass();
        aeVar.f179606b = dtVar3;
        aeVar.f179605a |= 1;
        C66205ds dsVar2 = (C66205ds) C66206dt.f180035d.createBuilder();
        float e3 = m39466e(displayMetrics, ((float) left) + f3);
        dsVar2.copyOnWrite();
        C66206dt dtVar4 = (C66206dt) dsVar2.instance;
        dtVar4.f180037a |= 1;
        dtVar4.f180038b = e3;
        float e4 = m39466e(displayMetrics, ((float) top) + f4);
        dsVar2.copyOnWrite();
        C66206dt dtVar5 = (C66206dt) dsVar2.instance;
        dtVar5.f180037a |= 2;
        dtVar5.f180039c = e4;
        adVar.copyOnWrite();
        C66043ae aeVar2 = (C66043ae) adVar.instance;
        C66206dt dtVar6 = (C66206dt) dsVar2.build();
        dtVar6.getClass();
        aeVar2.f179607c = dtVar6;
        aeVar2.f179605a |= 2;
        C66205ds dsVar3 = (C66205ds) C66206dt.f180035d.createBuilder();
        float e5 = m39466e(displayMetrics, f + f3);
        dsVar3.copyOnWrite();
        C66206dt dtVar7 = (C66206dt) dsVar3.instance;
        dtVar7.f180037a |= 1;
        dtVar7.f180038b = e5;
        float e6 = m39466e(displayMetrics, f2 + f4);
        dsVar3.copyOnWrite();
        C66206dt dtVar8 = (C66206dt) dsVar3.instance;
        dtVar8.f180037a |= 2;
        dtVar8.f180039c = e6;
        adVar.copyOnWrite();
        C66043ae aeVar3 = (C66043ae) adVar.instance;
        C66206dt dtVar9 = (C66206dt) dsVar3.build();
        dtVar9.getClass();
        aeVar3.f179608d = dtVar9;
        aeVar3.f179605a |= 4;
        return (C66043ae) adVar.build();
    }

    /* renamed from: h */
    public static C66045ag m39469h(View view) {
        float f;
        float f2;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        float width2 = (float) rect.width();
        float height2 = (float) rect.height();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f = (float) view2.getWidth();
            f2 = (float) view2.getHeight();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        C66054ap apVar = (C66054ap) C66055aq.f179639c.createBuilder();
        C66223ej ejVar = (C66223ej) C66224ek.f180081d.createBuilder();
        float e = m39466e(displayMetrics, width);
        ejVar.copyOnWrite();
        C66224ek ekVar = (C66224ek) ejVar.instance;
        ekVar.f180083a |= 1;
        ekVar.f180084b = e;
        float e2 = m39466e(displayMetrics, height);
        ejVar.copyOnWrite();
        C66224ek ekVar2 = (C66224ek) ejVar.instance;
        ekVar2.f180083a |= 2;
        ekVar2.f180085c = e2;
        apVar.copyOnWrite();
        C66055aq aqVar = (C66055aq) apVar.instance;
        C66224ek ekVar3 = (C66224ek) ejVar.build();
        ekVar3.getClass();
        aqVar.f179642b = ekVar3;
        aqVar.f179641a |= 1;
        C66055aq aqVar2 = (C66055aq) apVar.build();
        C66054ap apVar2 = (C66054ap) C66055aq.f179639c.createBuilder();
        C66223ej ejVar2 = (C66223ej) C66224ek.f180081d.createBuilder();
        float e3 = m39466e(displayMetrics, f);
        ejVar2.copyOnWrite();
        C66224ek ekVar4 = (C66224ek) ejVar2.instance;
        ekVar4.f180083a |= 1;
        ekVar4.f180084b = e3;
        float e4 = m39466e(displayMetrics, f2);
        ejVar2.copyOnWrite();
        C66224ek ekVar5 = (C66224ek) ejVar2.instance;
        ekVar5.f180083a |= 2;
        ekVar5.f180085c = e4;
        apVar2.copyOnWrite();
        C66055aq aqVar3 = (C66055aq) apVar2.instance;
        C66224ek ekVar6 = (C66224ek) ejVar2.build();
        ekVar6.getClass();
        aqVar3.f179642b = ekVar6;
        aqVar3.f179641a |= 1;
        C66055aq aqVar4 = (C66055aq) apVar2.build();
        C66054ap apVar3 = (C66054ap) C66055aq.f179639c.createBuilder();
        C66223ej ejVar3 = (C66223ej) C66224ek.f180081d.createBuilder();
        float e5 = m39466e(displayMetrics, width2);
        ejVar3.copyOnWrite();
        C66224ek ekVar7 = (C66224ek) ejVar3.instance;
        ekVar7.f180083a |= 1;
        ekVar7.f180084b = e5;
        float e6 = m39466e(displayMetrics, height2);
        ejVar3.copyOnWrite();
        C66224ek ekVar8 = (C66224ek) ejVar3.instance;
        ekVar8.f180083a |= 2;
        ekVar8.f180085c = e6;
        apVar3.copyOnWrite();
        C66055aq aqVar5 = (C66055aq) apVar3.instance;
        C66224ek ekVar9 = (C66224ek) ejVar3.build();
        ekVar9.getClass();
        aqVar5.f179642b = ekVar9;
        aqVar5.f179641a |= 1;
        C66055aq aqVar6 = (C66055aq) apVar3.build();
        C66044af afVar = (C66044af) C66045ag.f179609e.createBuilder();
        afVar.copyOnWrite();
        C66045ag agVar = (C66045ag) afVar.instance;
        aqVar2.getClass();
        agVar.f179613b = aqVar2;
        agVar.f179612a |= 1;
        afVar.copyOnWrite();
        C66045ag agVar2 = (C66045ag) afVar.instance;
        aqVar4.getClass();
        agVar2.f179614c = aqVar4;
        agVar2.f179612a |= 2;
        afVar.copyOnWrite();
        C66045ag agVar3 = (C66045ag) afVar.instance;
        aqVar6.getClass();
        agVar3.f179615d = aqVar6;
        agVar3.f179612a |= 4;
        return (C66045ag) afVar.build();
    }

    /* renamed from: i */
    static SenderStateOuterClass$SenderState m39470i(C66043ae aeVar, C66043ae aeVar2, C66206dt dtVar, C66045ag agVar) {
        C66046ah ahVar = (C66046ah) C66047ai.f179616e.createBuilder();
        ahVar.copyOnWrite();
        C66047ai aiVar = (C66047ai) ahVar.instance;
        aeVar.getClass();
        aiVar.f179620b = aeVar;
        aiVar.f179619a |= 1;
        ahVar.copyOnWrite();
        C66047ai aiVar2 = (C66047ai) ahVar.instance;
        aeVar2.getClass();
        aiVar2.f179621c = aeVar2;
        aiVar2.f179619a |= 2;
        ahVar.copyOnWrite();
        C66047ai aiVar3 = (C66047ai) ahVar.instance;
        dtVar.getClass();
        aiVar3.f179622d = dtVar;
        aiVar3.f179619a |= 4;
        C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        ecVar.mo58885m(C66047ai.f179617f, (C66047ai) ahVar.build());
        ecVar.mo58885m(C66045ag.f179610f, agVar);
        return (SenderStateOuterClass$SenderState) ecVar.build();
    }

    /* renamed from: j */
    static SenderStateOuterClass$SenderState m39471j(C66043ae aeVar, C66043ae aeVar2, C66206dt dtVar, C66045ag agVar) {
        C66048aj ajVar = (C66048aj) C66049ak.f179623e.createBuilder();
        ajVar.copyOnWrite();
        C66049ak akVar = (C66049ak) ajVar.instance;
        aeVar.getClass();
        akVar.f179627b = aeVar;
        akVar.f179626a |= 1;
        ajVar.copyOnWrite();
        C66049ak akVar2 = (C66049ak) ajVar.instance;
        aeVar2.getClass();
        akVar2.f179628c = aeVar2;
        akVar2.f179626a |= 2;
        ajVar.copyOnWrite();
        C66049ak akVar3 = (C66049ak) ajVar.instance;
        dtVar.getClass();
        akVar3.f179629d = dtVar;
        akVar3.f179626a |= 4;
        C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        ecVar.mo58885m(C66049ak.f179624f, (C66049ak) ajVar.build());
        ecVar.mo58885m(C66045ag.f179610f, agVar);
        return (SenderStateOuterClass$SenderState) ecVar.build();
    }

    /* renamed from: k */
    public static SenderStateOuterClass$SenderState m39472k(C21295ck ckVar) {
        C66052an anVar = (C66052an) C66053ao.f179634c.createBuilder();
        C66050al alVar = (C66050al) C66051am.f179630c.createBuilder();
        C66205ds dsVar = (C66205ds) C66206dt.f180035d.createBuilder();
        C21302i iVar = (C21302i) ckVar;
        float f = iVar.f59674a;
        dsVar.copyOnWrite();
        C66206dt dtVar = (C66206dt) dsVar.instance;
        dtVar.f180037a |= 1;
        dtVar.f180038b = f;
        float f2 = iVar.f59675b;
        dsVar.copyOnWrite();
        C66206dt dtVar2 = (C66206dt) dsVar.instance;
        dtVar2.f180037a |= 2;
        dtVar2.f180039c = f2;
        alVar.copyOnWrite();
        C66051am amVar = (C66051am) alVar.instance;
        C66206dt dtVar3 = (C66206dt) dsVar.build();
        dtVar3.getClass();
        amVar.f179633b = dtVar3;
        amVar.f179632a |= 1;
        anVar.copyOnWrite();
        C66053ao aoVar = (C66053ao) anVar.instance;
        C66051am amVar2 = (C66051am) alVar.build();
        amVar2.getClass();
        aoVar.f179638b = amVar2;
        aoVar.f179637a |= 1;
        C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
        ecVar.mo58885m(C66053ao.f179635d, (C66053ao) anVar.build());
        return (SenderStateOuterClass$SenderState) ecVar.build();
    }

    /* renamed from: a */
    public final int mo26066a() {
        return 168774585;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C68096r rVar = (C68096r) obj;
        C21359t tVar = this.f58878c;
        C68044ag agVar = new C68044ag();
        int a = rVar.mo16913a(4);
        C68044ag agVar2 = null;
        if (a != 0) {
            int i = a + rVar.f24703a;
            agVar.mo16917e(i + rVar.f24704b.getInt(i), rVar.f24704b);
        } else {
            agVar = null;
        }
        C21357r g = tVar.mo26863g(agVar, zVar);
        if (g != null) {
            arVar.mo25943q(new C21062x(this, g, arVar, qVar, zVar));
            arVar.mo25928E().mo13447u(true);
        }
        C21359t tVar2 = this.f58878c;
        C68044ag agVar3 = new C68044ag();
        int a2 = rVar.mo16913a(36);
        if (a2 != 0) {
            int i2 = a2 + rVar.f24703a;
            agVar3.mo16917e(i2 + rVar.f24704b.getInt(i2), rVar.f24704b);
        } else {
            agVar3 = null;
        }
        C21357r g2 = tVar2.mo26863g(agVar3, zVar);
        if (g2 != null) {
            arVar.mo25936j(new C21063y(this, g2, arVar, qVar, zVar));
            arVar.mo25928E().mo13447u(true);
        }
        C21359t tVar3 = this.f58878c;
        C68044ag agVar4 = new C68044ag();
        int a3 = rVar.mo16913a(10);
        if (a3 != 0) {
            int i3 = a3 + rVar.f24703a;
            agVar4.mo16917e(i3 + rVar.f24704b.getInt(i3), rVar.f24704b);
        } else {
            agVar4 = null;
        }
        C21357r g3 = tVar3.mo26863g(agVar4, zVar);
        if (g3 != null) {
            arVar.mo25941o(new C21064z(this, g3, arVar, qVar, zVar));
            arVar.mo25928E().mo13447u(true);
        }
        C21359t tVar4 = this.f58878c;
        C68044ag agVar5 = new C68044ag();
        int a4 = rVar.mo16913a(12);
        if (a4 != 0) {
            int i4 = a4 + rVar.f24703a;
            agVar5.mo16917e(i4 + rVar.f24704b.getInt(i4), rVar.f24704b);
        } else {
            agVar5 = null;
        }
        C21357r g4 = tVar4.mo26863g(agVar5, zVar);
        if (g4 != null) {
            arVar.mo25938l(new C20995aa(this, g4, arVar, qVar, zVar));
            arVar.mo25928E().mo13447u(true);
        }
        C21359t tVar5 = this.f58878c;
        C68044ag agVar6 = new C68044ag();
        int a5 = rVar.mo16913a(14);
        if (a5 != 0) {
            int i5 = a5 + rVar.f24703a;
            agVar6.mo16917e(i5 + rVar.f24704b.getInt(i5), rVar.f24704b);
        } else {
            agVar6 = null;
        }
        C21357r g5 = tVar5.mo26863g(agVar6, zVar);
        if (g5 != null) {
            arVar.mo25937k(new C20996ab(this, g5, arVar, qVar, zVar));
            arVar.mo25928E().mo13447u(true);
        }
        C21359t tVar6 = this.f58878c;
        C68044ag agVar7 = new C68044ag();
        int a6 = rVar.mo16913a(16);
        if (a6 != 0) {
            int i6 = a6 + rVar.f24703a;
            agVar7.mo16917e(i6 + rVar.f24704b.getInt(i6), rVar.f24704b);
        } else {
            agVar7 = null;
        }
        C21357r g6 = tVar6.mo26863g(agVar7, zVar);
        if (g6 != null) {
            arVar.mo25942p(new C20997ac(this, g6, arVar, qVar, zVar));
            arVar.mo25928E().mo13447u(true);
        }
        C21359t tVar7 = this.f58878c;
        C68044ag agVar8 = new C68044ag();
        int a7 = rVar.mo16913a(28);
        if (a7 != 0) {
            int i7 = a7 + rVar.f24703a;
            agVar8.mo16917e(i7 + rVar.f24704b.getInt(i7), rVar.f24704b);
        } else {
            agVar8 = null;
        }
        C21357r g7 = tVar7.mo26863g(agVar8, zVar);
        if (g7 != null) {
            arVar.mo25939m(new C20998ad(this, rVar, g7, arVar, qVar, zVar));
        }
        C21359t tVar8 = this.f58878c;
        C68044ag agVar9 = new C68044ag();
        int a8 = rVar.mo16913a(26);
        if (a8 != 0) {
            int i8 = a8 + rVar.f24703a;
            agVar9.mo16917e(i8 + rVar.f24704b.getInt(i8), rVar.f24704b);
        } else {
            agVar9 = null;
        }
        C21357r g8 = tVar8.mo26863g(agVar9, zVar);
        if (g8 != null) {
            arVar.mo25948v(new C20999ae(this, g8, arVar, qVar, zVar));
        }
        C21359t tVar9 = this.f58878c;
        C68044ag agVar10 = new C68044ag();
        int a9 = rVar.mo16913a(30);
        if (a9 != 0) {
            int i9 = a9 + rVar.f24703a;
            agVar10.mo16917e(i9 + rVar.f24704b.getInt(i9), rVar.f24704b);
        } else {
            agVar10 = null;
        }
        C21357r g9 = tVar9.mo26863g(agVar10, zVar);
        if (g9 != null) {
            arVar.mo25940n(new C21000af(this, g9, arVar, qVar, zVar));
        }
        if (rVar.mo60245g() != null) {
            C21344e.m40355c(new C20680d(rVar.mo60245g()), new C21057s(arVar));
        }
        C21359t tVar10 = this.f58878c;
        C68044ag agVar11 = new C68044ag();
        int a10 = rVar.mo16913a(8);
        if (a10 != 0) {
            int i10 = a10 + rVar.f24703a;
            agVar11.mo16917e(i10 + rVar.f24704b.getInt(i10), rVar.f24704b);
        } else {
            agVar11 = null;
        }
        C21357r g10 = tVar10.mo26863g(agVar11, zVar);
        if (g10 != null) {
            arVar.mo25945s(new C21058t(this, g10, arVar, qVar, zVar));
        }
        C21359t tVar11 = this.f58878c;
        C68044ag agVar12 = new C68044ag();
        int a11 = rVar.mo16913a(6);
        if (a11 != 0) {
            int i11 = a11 + rVar.f24703a;
            agVar12.mo16917e(i11 + rVar.f24704b.getInt(i11), rVar.f24704b);
        } else {
            agVar12 = null;
        }
        C21357r g11 = tVar11.mo26863g(agVar12, zVar);
        if (g11 != null) {
            arVar.mo25947u(new C21059u(this, g11, arVar, qVar, zVar));
        }
        C21359t tVar12 = this.f58878c;
        C68044ag agVar13 = new C68044ag();
        int a12 = rVar.mo16913a(48);
        if (a12 != 0) {
            int i12 = a12 + rVar.f24703a;
            agVar13.mo16917e(i12 + rVar.f24704b.getInt(i12), rVar.f24704b);
        } else {
            agVar13 = null;
        }
        C21357r g12 = tVar12.mo26863g(agVar13, zVar);
        if (g12 != null) {
            arVar.mo25946t(new C21060v(this, g12, arVar, qVar, zVar));
        }
        C21359t tVar13 = this.f58878c;
        C68044ag agVar14 = new C68044ag();
        int a13 = rVar.mo16913a(34);
        if (a13 != 0) {
            int i13 = a13 + rVar.f24703a;
            agVar14.mo16917e(i13 + rVar.f24704b.getInt(i13), rVar.f24704b);
            agVar2 = agVar14;
        }
        C21357r g13 = tVar13.mo26863g(agVar2, zVar);
        if (g13 != null) {
            arVar.mo25944r(new C21061w(this, g13, arVar, qVar, zVar));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ C7492e mo26067d(ByteBuffer byteBuffer) {
        C68096r rVar = new C68096r();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        rVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return rVar;
    }

    /* renamed from: l */
    public final void mo26102l(C69803b bVar, C21319z zVar) {
        C69826b l;
        if (this.f58879d && (l = zVar.mo26811l()) != null) {
            l.mo61462b(bVar);
        }
    }

    /* renamed from: e */
    public static float m39466e(DisplayMetrics displayMetrics, float f) {
        displayMetrics.getClass();
        return (f / displayMetrics.density) + 0.5f;
    }
}
