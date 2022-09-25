package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19903ad;
import com.google.android.libraries.componentview.components.base.p1687a.C19904ae;
import com.google.android.libraries.componentview.components.base.p1687a.C19909aj;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19953c;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.base.p1687a.C19994q;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.p1685b.C19893b;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19889a;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19892d;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20114ak;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20119ap;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20178x;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.p1699f.C20524l;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60321oe;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.c.z */
/* compiled from: PG */
public class C20324z extends C20061bs {

    /* renamed from: a */
    public C20183ac f57112a;

    /* renamed from: b */
    public C20205ay f57113b;

    /* renamed from: c */
    public C20205ay f57114c;

    /* renamed from: d */
    public C19893b f57115d;

    /* renamed from: e */
    public boolean f57116e;

    /* renamed from: f */
    public boolean f57117f;

    /* renamed from: g */
    public boolean f57118g;

    /* renamed from: h */
    public boolean f57119h;

    /* renamed from: i */
    private final Context f57120i;

    /* renamed from: j */
    private final C20601ca f57121j;

    /* renamed from: k */
    private final C20537f f57122k;

    /* renamed from: l */
    private final C20524l f57123l;

    /* renamed from: m */
    private C19893b f57124m;

    public C20324z(Context context, C56425d dVar, C20601ca caVar, C20537f fVar, C20524l lVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f57120i = context;
        this.f57121j = caVar;
        this.f57122k = fVar;
        this.f57123l = lVar;
    }

    /* renamed from: A */
    private final LinearLayout m38233A(boolean z) {
        LinearLayout linearLayout = new LinearLayout(this.f57120i);
        float f = 0.0f;
        int a = (int) (C20482m.m38433a(this.f57120i) * 0.0f);
        int a2 = (int) (C20482m.m38433a(this.f57120i) * 0.0f);
        int a3 = (int) (C20482m.m38433a(this.f57120i) * 0.0f);
        Context context = this.f57120i;
        if (true == z) {
            f = 10.0f;
        }
        linearLayout.setPadding(a, a2, a3, (int) (C20482m.m38433a(context) * f));
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    /* renamed from: B */
    private final C19904ae m38234B() {
        C19903ad adVar = (C19903ad) C19904ae.f55685f.createBuilder();
        float a = C20482m.m38433a(this.f57120i);
        adVar.copyOnWrite();
        C19904ae aeVar = (C19904ae) adVar.instance;
        aeVar.f55687a |= 1;
        aeVar.f55688b = (float) ((int) (a + a));
        float a2 = C20482m.m38433a(this.f57120i);
        adVar.copyOnWrite();
        C19904ae aeVar2 = (C19904ae) adVar.instance;
        aeVar2.f55687a |= 4;
        aeVar2.f55690d = (float) ((int) (a2 + a2));
        float a3 = C20482m.m38433a(this.f57120i);
        adVar.copyOnWrite();
        C19904ae aeVar3 = (C19904ae) adVar.instance;
        aeVar3.f55687a |= 2;
        aeVar3.f55689c = (float) ((int) (a3 + a3));
        float a4 = C20482m.m38433a(this.f57120i);
        adVar.copyOnWrite();
        C19904ae aeVar4 = (C19904ae) adVar.instance;
        aeVar4.f55687a |= 8;
        aeVar4.f55691e = (float) ((int) (a4 + a4));
        return (C19904ae) adVar.build();
    }

    /* renamed from: C */
    private final C19892d m38235C(List list) {
        C19909aj ajVar = (C19909aj) C19916aq.f55703s.createBuilder();
        C19994q qVar = (C19994q) C19995r.f56032g.createBuilder();
        qVar.copyOnWrite();
        C19995r rVar = (C19995r) qVar.instance;
        rVar.f56034a |= 1;
        rVar.f56035b = 0.0f;
        qVar.copyOnWrite();
        C19995r rVar2 = (C19995r) qVar.instance;
        rVar2.f56034a |= 2;
        rVar2.f56036c = 0.0f;
        qVar.copyOnWrite();
        C19995r rVar3 = (C19995r) qVar.instance;
        rVar3.f56034a |= 4;
        rVar3.f56037d = 0.0f;
        qVar.copyOnWrite();
        C19995r rVar4 = (C19995r) qVar.instance;
        rVar4.f56034a |= 8;
        rVar4.f56038e = 0.05f;
        C19995r rVar5 = (C19995r) qVar.build();
        ajVar.copyOnWrite();
        C19916aq aqVar = (C19916aq) ajVar.instance;
        rVar5.getClass();
        aqVar.f55710f = rVar5;
        aqVar.f55705a |= 1;
        C19904ae B = m38234B();
        ajVar.copyOnWrite();
        C19916aq aqVar2 = (C19916aq) ajVar.instance;
        B.getClass();
        aqVar2.f55712h = B;
        aqVar2.f55705a |= 32;
        ajVar.copyOnWrite();
        C19916aq aqVar3 = (C19916aq) ajVar.instance;
        aqVar3.f55706b = 2;
        aqVar3.f55707c = Float.valueOf(2.0f);
        C19889a aVar = (C19889a) C19892d.f55637k.createBuilder();
        aVar.mo25165a((Iterable) C58833ax.m90833j(list).mo56109e(Collections.emptyList()));
        aVar.copyOnWrite();
        C19892d dVar = (C19892d) aVar.instance;
        dVar.f55640a |= 32;
        dVar.f55647h = true;
        aVar.copyOnWrite();
        C19892d dVar2 = (C19892d) aVar.instance;
        dVar2.f55640a |= 16;
        dVar2.f55646g = 16.0f;
        aVar.copyOnWrite();
        C19892d dVar3 = (C19892d) aVar.instance;
        dVar3.f55645f = 2;
        dVar3.f55640a |= 8;
        C19916aq aqVar4 = (C19916aq) ajVar.build();
        aVar.copyOnWrite();
        C19892d dVar4 = (C19892d) aVar.instance;
        aqVar4.getClass();
        dVar4.f55649j = aqVar4;
        dVar4.f55640a |= 128;
        return (C19892d) aVar.build();
    }

    /* renamed from: D */
    private final C20119ap m38236D(String str) {
        C19909aj ajVar = (C19909aj) C19916aq.f55703s.createBuilder();
        C19904ae B = m38234B();
        ajVar.copyOnWrite();
        C19916aq aqVar = (C19916aq) ajVar.instance;
        B.getClass();
        aqVar.f55712h = B;
        aqVar.f55705a |= 32;
        ajVar.copyOnWrite();
        C19916aq aqVar2 = (C19916aq) ajVar.instance;
        aqVar2.f55706b = 2;
        aqVar2.f55707c = Float.valueOf(2.0f);
        C19916aq aqVar3 = (C19916aq) ajVar.build();
        C20114ak akVar = (C20114ak) C20119ap.f56375r.createBuilder();
        akVar.copyOnWrite();
        C20119ap apVar = (C20119ap) akVar.instance;
        str.getClass();
        apVar.f56378a |= 1;
        apVar.f56379b = str;
        akVar.copyOnWrite();
        C20119ap apVar2 = (C20119ap) akVar.instance;
        apVar2.f56378a |= 128;
        apVar2.f56386i = true;
        akVar.copyOnWrite();
        C20119ap apVar3 = (C20119ap) akVar.instance;
        apVar3.f56387j = 2;
        apVar3.f56378a |= 256;
        akVar.copyOnWrite();
        C20119ap apVar4 = (C20119ap) akVar.instance;
        apVar4.f56383f = 2;
        apVar4.f56378a |= 16;
        akVar.copyOnWrite();
        C20119ap apVar5 = (C20119ap) akVar.instance;
        apVar5.f56378a |= 32;
        apVar5.f56384g = 16.0f;
        akVar.copyOnWrite();
        C20119ap apVar6 = (C20119ap) akVar.instance;
        apVar6.f56381d = 3;
        apVar6.f56378a |= 4;
        akVar.copyOnWrite();
        C20119ap apVar7 = (C20119ap) akVar.instance;
        apVar7.f56391n = 2;
        apVar7.f56378a |= 4096;
        akVar.copyOnWrite();
        C20119ap apVar8 = (C20119ap) akVar.instance;
        aqVar3.getClass();
        apVar8.f56394q = aqVar3;
        apVar8.f56378a |= 32768;
        return (C20119ap) akVar.build();
    }

    /* renamed from: o */
    private final LinearLayout.LayoutParams m38237o(boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.3f);
        layoutParams.setMargins((int) (C20482m.m38433a(this.f57120i) * 0.0f), (int) (C20482m.m38433a(this.f57120i) * 0.0f), (int) (C20482m.m38433a(this.f57120i) * (true != z ? 0.0f : 10.0f)), (int) (C20482m.m38433a(this.f57120i) * 0.0f));
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        int i;
        C20205ay ayVar;
        C62940bt r0 = C62942bv.checkIsLite(C20178x.f56610h);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20183ac acVar = new C20183ac((C20178x) obj);
        this.f57112a = acVar;
        if (!acVar.f56640b) {
            C20520h.m38497b(5, "CurrencyWidgetComponent", new RuntimeException(), "Invalid CurrencyWidgetModel", new Object[0]);
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f56305p;
        LinearLayout A = m38233A(true);
        C20537f fVar = this.f57122k;
        BigDecimal bigDecimal = new BigDecimal(Double.toString(this.f57112a.mo25261a()));
        int i2 = 2;
        if (this.f57112a.mo25264d() == 0) {
            i = 2;
        } else {
            i = this.f57112a.mo25264d();
        }
        C20470a a = fVar.mo25450a(this, C20205ay.m38023i(m38236D(bigDecimal.setScale(i, 4).stripTrailingZeros().toPlainString())));
        if (a == null) {
            C20520h.m38497b(5, "CurrencyWidgetComponent", (Throwable) null, "baseEditTextComponent is null", new Object[0]);
            A = new LinearLayout(this.f57120i);
        } else {
            C20205ay ayVar2 = (C20205ay) a;
            this.f57113b = ayVar2;
            A.addView(ayVar2.f56305p, m38237o(true));
            C20470a a2 = this.f57122k.mo25450a(this, C19893b.m37753m(m38235C(C20183ac.m37980n(this.f57112a.f56642d))));
            if (a2 == null) {
                C20520h.m38497b(5, "CurrencyWidgetComponent", (Throwable) null, "baseDropDownComponent is null", new Object[0]);
                A = new LinearLayout(this.f57120i);
            } else {
                C19893b bVar = (C19893b) a2;
                this.f57124m = bVar;
                A.addView(bVar.f56305p, m38237o(false));
                View kH = this.f57124m.mo25098kH();
                if (kH != null) {
                    C28292j jVar = new C28292j(1131);
                    jVar.mo33795i(5);
                    C28295m.m52919e(kH, jVar);
                    C56429h H = mo25419H();
                    if (H == null || (H.f150549a & 1) == 0) {
                        C20520h.m38497b(6, "CurrencyWidgetComponent", (Throwable) null, "Cannot log client VE, null logInfo/clickTrackingCgi", new Object[0]);
                    } else {
                        try {
                            C56429h hVar = this.f57588z.f150542d;
                            if (hVar == null) {
                                hVar = C56429h.f150547k;
                            }
                            C60321oe e = C28285c.m52878e(kH, C28294l.m52912b(hVar.f150557i), H.f150556h);
                            if (e == null) {
                                C20520h.m38497b(6, "CurrencyWidgetComponent", (Throwable) null, "Cannot create ClientVisualElementsProto", new Object[0]);
                            } else {
                                this.f57121j.mo25490e(e);
                            }
                        } catch (IOException e2) {
                            C20520h.m38497b(6, "CurrencyWidgetComponent", (Throwable) null, "RemoteException while decoding base64Ei: ", e2);
                        }
                    }
                }
            }
        }
        linearLayout.addView(A);
        LinearLayout linearLayout2 = (LinearLayout) this.f56305p;
        LinearLayout A2 = m38233A(false);
        C20537f fVar2 = this.f57122k;
        BigDecimal bigDecimal2 = new BigDecimal(Double.toString(this.f57112a.mo25263c()));
        if (this.f57112a.mo25265e() != 0) {
            i2 = this.f57112a.mo25265e();
        }
        C20470a a3 = fVar2.mo25450a(this, C20205ay.m38023i(m38236D(bigDecimal2.setScale(i2, 4).stripTrailingZeros().toPlainString())));
        if (a3 == null) {
            C20520h.m38497b(5, "CurrencyWidgetComponent", (Throwable) null, "targetEditTextComponent is null", new Object[0]);
            A2 = new LinearLayout(this.f57120i);
        } else {
            C20205ay ayVar3 = (C20205ay) a3;
            this.f57114c = ayVar3;
            A2.addView(ayVar3.f56305p, m38237o(true));
            C20470a a4 = this.f57122k.mo25450a(this, C19893b.m37753m(m38235C(C20183ac.m37980n(this.f57112a.f56643e))));
            if (a4 == null) {
                C20520h.m38497b(5, "CurrencyWidgetComponent", (Throwable) null, "targetDropDownComponent is null", new Object[0]);
                A2 = new LinearLayout(this.f57120i);
            } else {
                C19893b bVar2 = (C19893b) a4;
                this.f57115d = bVar2;
                A2.addView(bVar2.f56305p, m38237o(false));
            }
        }
        linearLayout2.addView(A2);
        if (this.f57124m != null && this.f57115d != null && (ayVar = this.f57113b) != null && this.f57114c != null) {
            ayVar.mo25291n(new C20320v(this));
            this.f57114c.mo25291n(new C20321w(this));
            this.f57124m.mo25166A(new C20322x(this));
            this.f57115d.mo25166A(new C20323y(this));
        }
    }

    /* renamed from: i */
    public final void mo25369i() {
        Uri parse = Uri.parse(((C20178x) this.f57112a.f56639a.instance).f56617f);
        String queryParameter = parse.getQueryParameter("q");
        if (queryParameter == null || !queryParameter.contains("baseValue") || !queryParameter.contains("baseCurrency") || !queryParameter.contains("targetCurrency")) {
            C20520h.m38497b(5, "CurrencyWidgetComponent", new IllegalArgumentException(), "Incorrect Query Template", new Object[0]);
            mo25370m(true);
            C19893b bVar = this.f57124m;
            C20183ac acVar = this.f57112a;
            bVar.mo25168C(acVar.mo25268h(acVar.mo25269i()));
            C19893b bVar2 = this.f57115d;
            C20183ac acVar2 = this.f57112a;
            bVar2.mo25168C(acVar2.mo25268h(acVar2.mo25270j()));
            return;
        }
        int i = this.f57124m.mo25170i();
        int i2 = this.f57115d.mo25170i();
        String replaceFirst = queryParameter.replaceFirst("\\{baseValue\\}", this.f57113b.mo25290m()).replaceFirst("\\{baseCurrency\\}", this.f57112a.mo25267g(i)).replaceFirst("\\{targetCurrency\\}", this.f57112a.mo25271k(i2));
        C19953c cVar = (C19953c) C19983f.f56002g.createBuilder();
        String uri = C20482m.m38438f(parse, "q", replaceFirst).toString();
        cVar.copyOnWrite();
        C19983f fVar = (C19983f) cVar.instance;
        uri.getClass();
        fVar.f56004a |= 1;
        fVar.f56005b = uri;
        cVar.copyOnWrite();
        C19983f fVar2 = (C19983f) cVar.instance;
        fVar2.f56007d = 1;
        fVar2.f56004a |= 8;
        this.f57123l.mo25440b((C19983f) cVar.build(), (C56429h) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20178x.f56610h, this.f57112a.mo25266f());
        return (C56425d) cVar.build();
    }

    /* renamed from: m */
    public final void mo25370m(boolean z) {
        this.f57116e = z;
        this.f57117f = z;
        this.f57118g = z;
        this.f57119h = z;
    }

    /* renamed from: n */
    public final void mo25371n() {
        String str;
        int i;
        try {
            double parseDouble = Double.parseDouble(this.f57113b.mo25290m());
            double b = this.f57112a.mo25262b() * parseDouble;
            BigDecimal bigDecimal = new BigDecimal(Double.toString(b));
            if (this.f57112a.mo25265e() == 0) {
                i = 2;
            } else {
                i = this.f57112a.mo25265e();
            }
            str = bigDecimal.setScale(i, 4).stripTrailingZeros().toPlainString();
            this.f57112a.mo25272l(parseDouble);
            this.f57112a.mo25273m(b);
        } catch (NumberFormatException unused) {
            str = BuildConfig.FLAVOR;
        }
        this.f57117f = true;
        this.f57114c.mo25289A(str);
        this.f57117f = false;
    }
}
