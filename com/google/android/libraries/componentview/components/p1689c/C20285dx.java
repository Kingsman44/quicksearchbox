package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20028ay;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.C20068bz;
import com.google.android.libraries.componentview.components.base.p1687a.C19952bz;
import com.google.android.libraries.componentview.components.base.p1687a.C19954ca;
import com.google.android.libraries.componentview.components.base.p1687a.C19977cx;
import com.google.android.libraries.componentview.components.base.p1687a.C19981da;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.base.p1687a.C19994q;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.p1685b.C19893b;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19889a;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19892d;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20114ak;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20119ap;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20143bm;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20144bn;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20145bo;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20147bq;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20148br;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20602cb;
import com.google.android.libraries.componentview.services.application.C20603cc;
import com.google.android.libraries.componentview.services.application.C20604cd;
import com.google.android.libraries.componentview.services.application.C20606cf;
import com.google.android.libraries.componentview.services.application.C20616g;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.android.libraries.componentview.services.p1701a.C20542k;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p395al.p408c.p411b.p412a.p413a.C8449a;
import com.google.p395al.p408c.p411b.p412a.p413a.C8450b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4064b.C54129a;
import com.google.p4017at.p4060h.p4061a.p4062a.p4064b.C54130b;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56429h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.c.dx */
/* compiled from: PG */
public class C20285dx extends C20061bs {

    /* renamed from: A */
    private static final C19995r f56941A = m38149A(-16777216);

    /* renamed from: B */
    private static final C19995r f56942B = m38149A(-1979711488);

    /* renamed from: C */
    private final C20537f f56943C;

    /* renamed from: D */
    private final Executor f56944D;

    /* renamed from: E */
    private final C20606cf f56945E;

    /* renamed from: F */
    private C20148br f56946F;

    /* renamed from: G */
    private C60870cx f56947G;

    /* renamed from: H */
    private ImageView f56948H;

    /* renamed from: I */
    private String f56949I;

    /* renamed from: J */
    private String f56950J;

    /* renamed from: K */
    private String f56951K = "%s - detected";

    /* renamed from: L */
    private String f56952L = "Detect language";

    /* renamed from: M */
    private String f56953M = "Translating…";

    /* renamed from: N */
    private String f56954N = "Enter text";

    /* renamed from: O */
    private String f56955O = "Translation";

    /* renamed from: P */
    private String f56956P = "Open in Google Translate";

    /* renamed from: Q */
    private String f56957Q = BuildConfig.FLAVOR;

    /* renamed from: a */
    public C20145bo f56958a;

    /* renamed from: b */
    public C20205ay f56959b;

    /* renamed from: c */
    public C20068bz f56960c;

    /* renamed from: d */
    public C20068bz f56961d;

    /* renamed from: e */
    public C19893b f56962e;

    /* renamed from: f */
    public C19893b f56963f;

    /* renamed from: g */
    public C20028ay f56964g;

    /* renamed from: h */
    public String f56965h;

    /* renamed from: i */
    public String f56966i;

    /* renamed from: j */
    public String f56967j = "Translation failed.";

    /* renamed from: k */
    public String f56968k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C20145bo f56969l;

    /* renamed from: m */
    public C20145bo f56970m;

    /* renamed from: u */
    public C20145bo f56971u;

    /* renamed from: v */
    public ArrayList f56972v = new ArrayList();

    /* renamed from: w */
    public ArrayList f56973w = new ArrayList();

    /* renamed from: x */
    public boolean f56974x = true;

    public C20285dx(Context context, C56425d dVar, C20601ca caVar, C20537f fVar, Executor executor, C20606cf cfVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f56943C = fVar;
        this.f56944D = executor;
        this.f56945E = cfVar;
        C20144bn bnVar = (C20144bn) C20145bo.f56487d.createBuilder();
        bnVar.copyOnWrite();
        C20145bo boVar = (C20145bo) bnVar.instance;
        boVar.f56489a = 1 | boVar.f56489a;
        boVar.f56490b = "auto";
        String str = this.f56952L;
        bnVar.copyOnWrite();
        C20145bo boVar2 = (C20145bo) bnVar.instance;
        str.getClass();
        boVar2.f56489a |= 2;
        boVar2.f56491c = str;
        this.f56958a = (C20145bo) bnVar.build();
    }

    /* renamed from: A */
    private static C19995r m38149A(int i) {
        C19994q qVar = (C19994q) C19995r.f56032g.createBuilder();
        qVar.copyOnWrite();
        C19995r rVar = (C19995r) qVar.instance;
        rVar.f56034a |= 16;
        rVar.f56039f = i;
        return (C19995r) qVar.build();
    }

    /* renamed from: B */
    private final C19893b m38150B(LinearLayout linearLayout, C20145bo boVar, List list) {
        int i;
        View view;
        List i2 = mo25325i(list);
        if (boVar == null) {
            i = 0;
        } else {
            i = i2.indexOf(boVar.f56491c);
        }
        C19889a aVar = (C19889a) C19892d.f55637k.createBuilder();
        aVar.copyOnWrite();
        C19892d dVar = (C19892d) aVar.instance;
        dVar.f55640a |= 1;
        dVar.f55642c = i;
        aVar.copyOnWrite();
        C19892d dVar2 = (C19892d) aVar.instance;
        dVar2.f55643d = 2;
        dVar2.f55640a = 2 | dVar2.f55640a;
        aVar.copyOnWrite();
        C19892d dVar3 = (C19892d) aVar.instance;
        dVar3.f55640a |= 16;
        dVar3.f55646g = 15.0f;
        aVar.copyOnWrite();
        C19892d dVar4 = (C19892d) aVar.instance;
        dVar4.f55645f = 5;
        dVar4.f55640a |= 8;
        aVar.mo25165a(i2);
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.mo58885m(C19892d.f55638l, (C19892d) aVar.build());
        cVar.copyOnWrite();
        C56425d dVar5 = (C56425d) cVar.instance;
        dVar5.f150539a |= 1;
        dVar5.f150540b = "android-drop-down";
        C19893b bVar = (C19893b) this.f56943C.mo25450a(this, (C56425d) cVar.build());
        m38153E(bVar, linearLayout, new LinearLayout.LayoutParams(-1, -2, 0.0f));
        if (!(bVar == null || (view = bVar.f56305p) == null)) {
            C2043bi.m5556aj(view, 0, (int) (C20482m.m38433a(this.f56304o) * 10.0f), 0, (int) (C20482m.m38433a(this.f56304o) * 10.0f));
        }
        return bVar;
    }

    /* renamed from: C */
    private final void m38151C(C19893b bVar, String str) {
        bVar.mo25166A(new C20283dv(this, bVar, str));
    }

    /* renamed from: D */
    private final void m38152D(View view, int i) {
        C56425d dVar = this.f57588z;
        if ((dVar.f150539a & 4) != 0) {
            C56429h hVar = dVar.f150542d;
            if (hVar == null) {
                hVar = C56429h.f150547k;
            }
            if ((hVar.f150549a & 1) != 0) {
                C28295m.m52919e(view, new C28292j(i));
                try {
                    C56429h hVar2 = this.f57588z.f150542d;
                    if (hVar2 == null) {
                        hVar2 = C56429h.f150547k;
                    }
                    C60220t b = C28294l.m52912b(hVar2.f150557i);
                    C56429h hVar3 = this.f57588z.f150542d;
                    if (hVar3 == null) {
                        hVar3 = C56429h.f150547k;
                    }
                    C60321oe e = C28285c.m52878e(view, b, hVar3.f150556h);
                    if (e != null) {
                        this.f56308s.mo25490e(e);
                        return;
                    } else {
                        C20520h.m38497b(6, "TranslateWidgetComponent", (Throwable) null, "Cannot create ClientVisualElementsProto", new Object[0]);
                        return;
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
        C20520h.m38497b(6, "TranslateWidgetComponent", (Throwable) null, "Cannot log client VE, missing logInfo.", new Object[0]);
    }

    /* renamed from: E */
    private static final void m38153E(C20470a aVar, LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        View kH;
        if (aVar != null && (kH = aVar.mo25098kH()) != null) {
            if (layoutParams != null) {
                linearLayout.addView(kH, layoutParams);
            } else {
                linearLayout.addView(kH);
            }
        }
    }

    /* renamed from: o */
    private final C20068bz m38154o(C19981da daVar) {
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.mo58885m(C19981da.f55978w, daVar);
        cVar.copyOnWrite();
        C56425d dVar = (C56425d) cVar.instance;
        dVar.f150539a |= 1;
        dVar.f150540b = "android-text-view";
        return (C20068bz) this.f56943C.mo25450a(this, (C56425d) cVar.build());
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
        C20145bo boVar;
        C20205ay ayVar;
        View kH;
        C20143bm bmVar;
        C20143bm bmVar2;
        C20147bq bqVar;
        C20147bq bqVar2;
        C56425d dVar2 = dVar;
        C56429h hVar = dVar2.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        C60214n nVar = hVar.f150550b;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        C60218r rVar = nVar.f162921f;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
        mVar.copyOnWrite();
        C60214n nVar2 = (C60214n) mVar.instance;
        rVar.getClass();
        nVar2.f162921f = rVar;
        nVar2.f162916a |= 2048;
        mVar.copyOnWrite();
        C60214n nVar3 = (C60214n) mVar.instance;
        nVar3.f162916a |= 8;
        nVar3.f162918c = 39405;
        this.f56965h = C20542k.m38539a((C60214n) mVar.build());
        C60213m mVar2 = (C60213m) C60214n.f162914g.createBuilder();
        mVar2.copyOnWrite();
        C60214n nVar4 = (C60214n) mVar2.instance;
        rVar.getClass();
        nVar4.f162921f = rVar;
        nVar4.f162916a |= 2048;
        mVar2.copyOnWrite();
        C60214n nVar5 = (C60214n) mVar2.instance;
        nVar5.f162916a |= 8;
        nVar5.f162918c = 6771;
        this.f56966i = C20542k.m38539a((C60214n) mVar2.build());
        C60213m mVar3 = (C60213m) C60214n.f162914g.createBuilder();
        mVar3.copyOnWrite();
        C60214n nVar6 = (C60214n) mVar3.instance;
        rVar.getClass();
        nVar6.f162921f = rVar;
        nVar6.f162916a |= 2048;
        mVar3.copyOnWrite();
        C60214n nVar7 = (C60214n) mVar3.instance;
        nVar7.f162916a |= 8;
        nVar7.f162918c = 37180;
        this.f56949I = C20542k.m38539a((C60214n) mVar3.build());
        C60213m mVar4 = (C60213m) C60214n.f162914g.createBuilder();
        mVar4.copyOnWrite();
        C60214n nVar8 = (C60214n) mVar4.instance;
        rVar.getClass();
        nVar8.f162921f = rVar;
        nVar8.f162916a |= 2048;
        mVar4.copyOnWrite();
        C60214n nVar9 = (C60214n) mVar4.instance;
        nVar9.f162916a |= 8;
        nVar9.f162918c = 37181;
        this.f56950J = C20542k.m38539a((C60214n) mVar4.build());
        C62940bt r2 = C62942bv.checkIsLite(C20148br.f56497s);
        dVar2.mo58887l(r2);
        Object l = dVar2.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        C20148br brVar = (C20148br) obj;
        this.f56946F = brVar;
        int i = brVar.f56499a;
        if ((i & 16384) != 0) {
            this.f56951K = brVar.f56514p;
        }
        if ((i & 8192) != 0) {
            this.f56952L = brVar.f56513o;
        }
        if ((i & 2048) != 0) {
            this.f56953M = brVar.f56511m;
        }
        if ((i & 4096) != 0) {
            this.f56967j = brVar.f56512n;
        }
        if ((i & 512) != 0) {
            this.f56954N = brVar.f56509k;
        }
        if ((i & 1024) != 0) {
            this.f56955O = brVar.f56510l;
        }
        if ((i & 32768) != 0) {
            this.f56956P = brVar.f56515q;
        }
        C20144bn bnVar = (C20144bn) this.f56958a.toBuilder();
        String str = this.f56952L;
        bnVar.copyOnWrite();
        C20145bo boVar2 = (C20145bo) bnVar.instance;
        str.getClass();
        boVar2.f56489a |= 2;
        boVar2.f56491c = str;
        this.f56958a = (C20145bo) bnVar.build();
        C20148br brVar2 = this.f56946F;
        int i2 = brVar2.f56502d;
        int i3 = 3;
        if (i2 == 2) {
            boVar = (C20145bo) brVar2.f56503e;
        } else {
            boVar = i2 == 3 ? (C20145bo) brVar2.f56503e : C20145bo.f56487d;
        }
        this.f56970m = boVar;
        if (boVar == null || boVar.f56490b.isEmpty()) {
            this.f56970m = this.f56958a;
        }
        C20145bo boVar3 = this.f56946F.f56504f;
        if (boVar3 == null) {
            boVar3 = C20145bo.f56487d;
        }
        this.f56971u = boVar3;
        this.f56972v = new ArrayList(Collections.singletonList(this.f56958a));
        this.f56973w = new ArrayList();
        C20148br brVar3 = this.f56946F;
        int i4 = brVar3.f56500b;
        if (i4 != 0) {
            i3 = i4 != 8 ? i4 != 9 ? 0 : 2 : 1;
        }
        int i5 = i3 - 1;
        if (i3 != 0) {
            if (i5 == 0) {
                ArrayList arrayList = this.f56972v;
                if (i4 == 8) {
                    bmVar = (C20143bm) brVar3.f56501c;
                } else {
                    bmVar = C20143bm.f56484b;
                }
                arrayList.addAll(bmVar.f56486a);
                ArrayList arrayList2 = this.f56973w;
                C20148br brVar4 = this.f56946F;
                if (brVar4.f56500b == 8) {
                    bmVar2 = (C20143bm) brVar4.f56501c;
                } else {
                    bmVar2 = C20143bm.f56484b;
                }
                arrayList2.addAll(bmVar2.f56486a);
            } else if (i5 == 1) {
                ArrayList arrayList3 = this.f56972v;
                if (i4 == 9) {
                    bqVar = (C20147bq) brVar3.f56501c;
                } else {
                    bqVar = C20147bq.f56492c;
                }
                arrayList3.addAll(bqVar.f56494a);
                ArrayList arrayList4 = this.f56973w;
                C20148br brVar5 = this.f56946F;
                if (brVar5.f56500b == 9) {
                    bqVar2 = (C20147bq) brVar5.f56501c;
                } else {
                    bqVar2 = C20147bq.f56492c;
                }
                arrayList4.addAll(bqVar2.f56495b);
            } else if (i5 == 2) {
                C20145bo boVar4 = this.f56970m;
                if (boVar4 != null) {
                    this.f56972v.add(boVar4);
                }
                C20145bo boVar5 = this.f56971u;
                if (boVar5 != null) {
                    this.f56973w.add(boVar5);
                }
            }
            LinearLayout linearLayout = new LinearLayout(this.f56304o);
            linearLayout.setOrientation(1);
            C2043bi.m5556aj(linearLayout, (int) (C20482m.m38433a(this.f56304o) * 16.0f), (int) (C20482m.m38433a(this.f56304o) * 0.0f), (int) (C20482m.m38433a(this.f56304o) * 0.0f), (int) (C20482m.m38433a(this.f56304o) * 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(this.f56304o);
            linearLayout2.setOrientation(1);
            C19893b B = m38150B(linearLayout2, this.f56970m, this.f56972v);
            this.f56962e = B;
            if (B != null) {
                m38152D(B.f56305p, 37180);
            }
            linearLayout.addView(linearLayout2);
            LinearLayout linearLayout3 = new LinearLayout(this.f56304o);
            linearLayout3.setOrientation(1);
            String str2 = this.f56946F.f56505g;
            this.f56957Q = str2;
            C20114ak akVar = (C20114ak) C20119ap.f56375r.createBuilder();
            akVar.copyOnWrite();
            C20119ap apVar = (C20119ap) akVar.instance;
            str2.getClass();
            apVar.f56378a |= 1;
            apVar.f56379b = str2;
            akVar.copyOnWrite();
            C20119ap apVar2 = (C20119ap) akVar.instance;
            apVar2.f56378a |= 32;
            apVar2.f56384g = 20.0f;
            String str3 = this.f56954N;
            akVar.copyOnWrite();
            C20119ap apVar3 = (C20119ap) akVar.instance;
            str3.getClass();
            apVar3.f56378a |= 2048;
            apVar3.f56390m = str3;
            akVar.copyOnWrite();
            C20119ap apVar4 = (C20119ap) akVar.instance;
            apVar4.f56378a |= 16384;
            apVar4.f56393p = true;
            C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
            cVar.mo58885m(C20119ap.f56376s, (C20119ap) akVar.build());
            cVar.copyOnWrite();
            C56425d dVar3 = (C56425d) cVar.instance;
            dVar3.f150539a |= 1;
            dVar3.f150540b = "android-edit-text";
            C20205ay ayVar2 = (C20205ay) this.f56943C.mo25450a(this, (C56425d) cVar.build());
            m38153E(ayVar2, linearLayout3, (LinearLayout.LayoutParams) null);
            this.f56959b = ayVar2;
            if (ayVar2 != null) {
                m38152D(ayVar2.f56305p, 39405);
            }
            linearLayout.addView(linearLayout3);
            LinearLayout linearLayout4 = new LinearLayout(this.f56304o);
            linearLayout4.setBackgroundColor(-3355444);
            linearLayout4.setOrientation(1);
            linearLayout4.setMinimumHeight((int) C20482m.m38433a(this.f56304o));
            linearLayout.addView(linearLayout4);
            LinearLayout linearLayout5 = new LinearLayout(this.f56304o);
            linearLayout5.setOrientation(1);
            C2043bi.m5556aj(linearLayout5, (int) (C20482m.m38433a(this.f56304o) * 0.0f), (int) (C20482m.m38433a(this.f56304o) * 10.0f), (int) (C20482m.m38433a(this.f56304o) * 0.0f), (int) (C20482m.m38433a(this.f56304o) * 0.0f));
            String str4 = this.f56946F.f56506h;
            this.f56968k = str4;
            C19977cx cxVar = (C19977cx) C19981da.f55977v.createBuilder();
            cxVar.copyOnWrite();
            C19981da daVar = (C19981da) cxVar.instance;
            str4.getClass();
            daVar.f55980a |= 1;
            daVar.f55981b = str4;
            String str5 = this.f56955O;
            cxVar.copyOnWrite();
            C19981da daVar2 = (C19981da) cxVar.instance;
            str5.getClass();
            daVar2.f55980a |= C89885b.HTTP_VALUE;
            daVar2.f56000u = str5;
            cxVar.copyOnWrite();
            C19981da daVar3 = (C19981da) cxVar.instance;
            daVar3.f55980a = 8 | daVar3.f55980a;
            daVar3.f55984e = 20.0f;
            C19995r rVar2 = f56941A;
            cxVar.copyOnWrite();
            C19981da daVar4 = (C19981da) cxVar.instance;
            rVar2.getClass();
            daVar4.f55982c = rVar2;
            daVar4.f55980a |= 2;
            cxVar.copyOnWrite();
            C19981da daVar5 = (C19981da) cxVar.instance;
            daVar5.f55980a |= 8192;
            daVar5.f55995p = true;
            C20068bz o = m38154o((C19981da) cxVar.build());
            m38153E(o, linearLayout5, (LinearLayout.LayoutParams) null);
            this.f56960c = o;
            String str6 = this.f56946F.f56507i;
            C19977cx cxVar2 = (C19977cx) C19981da.f55977v.createBuilder();
            cxVar2.copyOnWrite();
            C19981da daVar6 = (C19981da) cxVar2.instance;
            str6.getClass();
            daVar6.f55980a |= 1;
            daVar6.f55981b = str6;
            C19995r rVar3 = f56942B;
            cxVar2.copyOnWrite();
            C19981da daVar7 = (C19981da) cxVar2.instance;
            rVar3.getClass();
            daVar7.f55982c = rVar3;
            daVar7.f55980a |= 2;
            cxVar2.copyOnWrite();
            C19981da daVar8 = (C19981da) cxVar2.instance;
            daVar8.f55980a |= 8192;
            daVar8.f55995p = true;
            C20068bz o2 = m38154o((C19981da) cxVar2.build());
            m38153E(o2, linearLayout5, (LinearLayout.LayoutParams) null);
            this.f56961d = o2;
            linearLayout.addView(linearLayout5);
            LinearLayout linearLayout6 = new LinearLayout(this.f56304o);
            linearLayout6.setOrientation(1);
            C19893b B2 = m38150B(linearLayout6, this.f56971u, this.f56973w);
            this.f56963f = B2;
            if (B2 != null) {
                m38152D(B2.f56305p, 37181);
            }
            linearLayout.addView(linearLayout6);
            LinearLayout linearLayout7 = new LinearLayout(this.f56304o);
            linearLayout7.setGravity(16);
            ImageView imageView = new ImageView(this.f56304o);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(R.drawable.quantum_ic_swap_vert_grey600_24);
            imageView.setFocusable(true);
            C2043bi.m5556aj(imageView, (int) (C20482m.m38433a(this.f56304o) * 16.0f), (int) (C20482m.m38433a(this.f56304o) * 16.0f), (int) (C20482m.m38433a(this.f56304o) * 16.0f), (int) (C20482m.m38433a(this.f56304o) * 16.0f));
            linearLayout7.addView(imageView);
            this.f56948H = imageView;
            m38152D(imageView, 6771);
            LinearLayout linearLayout8 = new LinearLayout(this.f56304o);
            linearLayout8.setOrientation(0);
            linearLayout8.addView(linearLayout, new LinearLayout.LayoutParams(-2, -2, 1.0f));
            linearLayout8.addView(linearLayout7, new LinearLayout.LayoutParams(-2, -1, 0.0f));
            ((LinearLayout) this.f56305p).addView(linearLayout8);
            if ((this.f56946F.f56499a & 256) != 0) {
                LinearLayout linearLayout9 = new LinearLayout(this.f56304o);
                linearLayout9.setBackgroundColor(-3355444);
                linearLayout9.setOrientation(1);
                linearLayout9.setMinimumHeight((int) C20482m.m38433a(this.f56304o));
                ((LinearLayout) this.f56305p).addView(linearLayout9);
                LinearLayout linearLayout10 = new LinearLayout(this.f56304o);
                linearLayout10.setOrientation(0);
                C19983f fVar = this.f56946F.f56508j;
                if (fVar == null) {
                    fVar = C19983f.f56002g;
                }
                String str7 = this.f56956P;
                C56424c cVar2 = (C56424c) C56425d.f150537g.createBuilder();
                C62940bt btVar = C19981da.f55978w;
                C19977cx cxVar3 = (C19977cx) C19981da.f55977v.createBuilder();
                cxVar3.copyOnWrite();
                C19981da daVar9 = (C19981da) cxVar3.instance;
                str7.getClass();
                daVar9.f55980a |= 1;
                daVar9.f55981b = str7;
                cxVar3.copyOnWrite();
                C19981da daVar10 = (C19981da) cxVar3.instance;
                rVar2.getClass();
                daVar10.f55982c = rVar2;
                daVar10.f55980a |= 2;
                cVar2.mo58885m(btVar, (C19981da) cxVar3.build());
                cVar2.copyOnWrite();
                C56425d dVar4 = (C56425d) cVar2.instance;
                dVar4.f150539a |= 1;
                dVar4.f150540b = "android-text-view";
                C56425d dVar5 = (C56425d) cVar2.build();
                C19952bz bzVar = (C19952bz) C19954ca.f55852e.createBuilder();
                bzVar.copyOnWrite();
                C19954ca caVar = (C19954ca) bzVar.instance;
                fVar.getClass();
                caVar.f55857c = fVar;
                caVar.f55855a |= 2;
                bzVar.copyOnWrite();
                C19954ca caVar2 = (C19954ca) bzVar.instance;
                dVar5.getClass();
                caVar2.f55856b = dVar5;
                caVar2.f55855a |= 1;
                C56424c cVar3 = (C56424c) C56425d.f150537g.createBuilder();
                cVar3.mo58885m(C19954ca.f55853f, (C19954ca) bzVar.build());
                cVar3.copyOnWrite();
                C56425d dVar6 = (C56425d) cVar3.instance;
                dVar6.f150539a |= 1;
                dVar6.f150540b = "android-link";
                C20028ay ayVar3 = (C20028ay) this.f56943C.mo25450a(this, (C56425d) cVar3.build());
                m38153E(ayVar3, linearLayout10, (LinearLayout.LayoutParams) null);
                if (!(ayVar3 == null || (kH = ayVar3.mo25098kH()) == null)) {
                    C2043bi.m5556aj(kH, (int) (C20482m.m38433a(this.f56304o) * 16.0f), (int) (C20482m.m38433a(this.f56304o) * 10.0f), (int) (C20482m.m38433a(this.f56304o) * 16.0f), (int) (C20482m.m38433a(this.f56304o) * 10.0f));
                }
                this.f56964g = ayVar3;
                ((LinearLayout) this.f56305p).addView(linearLayout10);
            }
            if (this.f56946F != null && (ayVar = this.f56959b) != null && this.f56960c != null && this.f56961d != null && this.f56962e != null && this.f56963f != null && this.f56948H != null) {
                ayVar.mo25291n(new C20281dt(this));
                m38151C(this.f56962e, this.f56949I);
                m38151C(this.f56963f, this.f56950J);
                this.f56948H.setOnClickListener(new C20282du(this));
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: i */
    public final List mo25325i(List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20145bo boVar = (C20145bo) it.next();
            if (boVar.f56490b.equals(this.f56958a.f56490b)) {
                C20145bo boVar2 = this.f56969l;
                if (boVar2 == null) {
                    str = this.f56958a.f56491c;
                } else {
                    str = String.format(this.f56951K, new Object[]{boVar2.f56491c});
                }
            } else {
                str = boVar.f56491c;
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: m */
    public final void mo25326m(C20145bo boVar) {
        this.f56969l = boVar;
        this.f56962e.mo25169D(mo25325i(this.f56972v));
    }

    /* renamed from: n */
    public final void mo25327n(int i, String str) {
        C60870cx cxVar = this.f56947G;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        if (TextUtils.isEmpty(this.f56959b.mo25290m())) {
            this.f56968k = BuildConfig.FLAVOR;
            this.f56960c.mo25242n(BuildConfig.FLAVOR);
            this.f56960c.mo25243o(-16777216);
            this.f56961d.mo25242n(BuildConfig.FLAVOR);
            mo25326m((C20145bo) null);
            return;
        }
        this.f56957Q = this.f56959b.mo25290m();
        C54129a aVar = (C54129a) C54130b.f142044c.createBuilder();
        C8449a aVar2 = (C8449a) C8450b.f29357d.createBuilder();
        String str2 = this.f56970m.f56490b;
        aVar2.copyOnWrite();
        str2.getClass();
        ((C8450b) aVar2.instance).f29359a = str2;
        String str3 = this.f56971u.f56490b;
        aVar2.copyOnWrite();
        str3.getClass();
        ((C8450b) aVar2.instance).f29360b = str3;
        String m = this.f56959b.mo25290m();
        aVar2.copyOnWrite();
        m.getClass();
        ((C8450b) aVar2.instance).f29361c = m;
        aVar.copyOnWrite();
        C54130b bVar = (C54130b) aVar.instance;
        C8450b bVar2 = (C8450b) aVar2.build();
        bVar2.getClass();
        bVar.f142047b = bVar2;
        bVar.f142046a |= 1;
        this.f56960c.mo25242n(this.f56953M);
        this.f56960c.mo25243o(-3355444);
        this.f56961d.mo25242n(BuildConfig.FLAVOR);
        C20606cf cfVar = this.f56945E;
        C20616g gVar = new C20616g(str, C58729pv.f156485a);
        C60870cx a = cfVar.f57810b.mo25516a();
        C60870cx b = cfVar.f57810b.mo25517b();
        C60870cx a2 = C60856cj.m92895d(a, b).mo57334a(new C20603cc(cfVar, a, b, gVar), cfVar.f57811c);
        String encodeToString = Base64.encodeToString(((C54130b) aVar.build()).toByteArray(), 11);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C20606cf.f57809a, encodeToString);
        gzVar.mo55433l(gVar.f57835c);
        C60870cx g = C60922j.m93044g(C60922j.m93045h(a2, new C20602cb(cfVar, gzVar.mo55427f(true)), cfVar.f57811c), new C20604cd(cfVar), cfVar.f57811c);
        this.f56947G = g;
        C60856cj.m92911t(g, new C20284dw(this, i), this.f56944D);
    }
}
