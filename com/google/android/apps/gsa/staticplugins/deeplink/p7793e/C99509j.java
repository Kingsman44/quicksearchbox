package com.google.android.apps.gsa.staticplugins.deeplink.p7793e;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84667e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.acc;
import com.google.common.p4552o.acf;
import com.google.lens.p4707j.C62433bj;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.e.j */
/* compiled from: PG */
public final class C99509j extends C86734a implements C84667e {

    /* renamed from: a */
    private static final C59071e f278449a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.e.j");

    /* renamed from: b */
    private static final C58528ij f278450b = C58528ij.m90013M(Integer.valueOf(C62433bj.SUGGESTION_CHIP_TRANSLATE.f168594ao), Integer.valueOf(C62433bj.LENS_IN_TRANSLATE_ONEBOX.f168594ao), Integer.valueOf(C62433bj.LENS_ON_ANDROID_OVERVIEW_TRANSLATE.f168594ao), Integer.valueOf(C62433bj.LENS_ON_ANDROID_SCREENSHOT_TRANSLATE.f168594ao));

    /* renamed from: c */
    private static final C58528ij f278451c = new C58759qy(Integer.valueOf(C62433bj.SUGGESTION_CHIP_SHOPPING.f168594ao));

    /* renamed from: f */
    private final Context f278452f;

    /* renamed from: g */
    private final C68214a f278453g;

    /* renamed from: h */
    private final C139921f f278454h;

    /* renamed from: i */
    private final C86124t f278455i;

    public C99509j(Context context, C68214a aVar, C139921f fVar, C86124t tVar) {
        super(C118575h.WORKER_DEEPLINK, "lensdeeplink");
        this.f278452f = context;
        this.f278453g = aVar;
        this.f278454h = fVar;
        this.f278455i = tVar;
    }

    /* renamed from: c */
    private static void m165050c(String str, int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1243;
        aar aar = (aar) aas.f158145p.createBuilder();
        acc acc = (acc) acf.f158284h.createBuilder();
        acc.copyOnWrite();
        acf acf = (acf) acc.instance;
        acf.f158286a |= 2;
        acf.f158288c = i - 2;
        acc.copyOnWrite();
        acf acf2 = (acf) acc.instance;
        str.getClass();
        acf2.f158286a |= 1;
        acf2.f158287b = str;
        aar.copyOnWrite();
        aas aas = (aas) aar.instance;
        acf acf3 = (acf) acc.build();
        acf3.getClass();
        aas.f158151e = acf3;
        aas.f158147a |= 256;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        aas aas2 = (aas) aar.build();
        aas2.getClass();
        ufVar2.f164197by = aas2;
        ufVar2.f164253h |= 8;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0334 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0335  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78405a(com.google.android.libraries.search.p2998g.p2999a.C38375p r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.f101606b
            android.net.Uri r0 = android.net.Uri.parse(r0)
            boolean r1 = com.google.android.libraries.lens.p1993a.C24065a.m44687c(r0)
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x013a
            com.google.android.apps.gsa.search.core.i.t r1 = r11.f278455i
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C89968ag.f246511k
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x013a
            com.google.common.base.ax r12 = com.google.android.libraries.lens.p1993a.C24065a.m44686b(r0)
            boolean r0 = r12.mo56113h()
            if (r0 != 0) goto L_0x0033
            com.google.common.f.e r12 = f278449a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = "Failed to parse LensDeeplinkRequest from Uri"
            r1 = 19283(0x4b53, float:2.7021E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x032e
        L_0x0033:
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.libraries.n.a.d r12 = (com.google.android.libraries.p2259n.p2260a.C29765d) r12
            int r0 = r12.f80665a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x012c
            int r0 = r12.f80670f
            com.google.android.libraries.n.a.b r0 = com.google.android.libraries.p2259n.p2260a.C29763b.m54880a(r0)
            if (r0 != 0) goto L_0x0049
            com.google.android.libraries.n.a.b r0 = com.google.android.libraries.p2259n.p2260a.C29763b.ENTRY_POINT_ID_UNKNOWN
        L_0x0049:
            com.google.common.b.hd r1 = com.google.android.libraries.lens.p1993a.C24065a.f65747a
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x006c
            com.google.common.f.e r12 = f278449a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = "Entry Point Id is not mapped to Caller Package."
            r1 = 19281(0x4b51, float:2.7018E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x032e
        L_0x006c:
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            dagger.a r1 = r11.f278453g
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.libraries.lens.view.s.a r1 = (com.google.android.libraries.lens.view.p2162s.C27683a) r1
            int r1 = r1.mo33176c(r0)
            m165050c(r0, r1)
            if (r1 == r3) goto L_0x0098
            com.google.common.f.e r12 = f278449a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24072c.m44702a(r1)
            r1 = 19280(0x4b50, float:2.7017E-41)
            java.lang.String r2 = "Lens availability check failed with %s."
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56389s(r2, r0)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x032e
        L_0x0098:
            com.google.android.libraries.lens.view.ab.c r1 = new com.google.android.libraries.lens.view.ab.c
            r1.<init>()
            r1.f68093a = r2
            r1.f68102j = r0
            android.content.Context r0 = r11.f278452f
            int r0 = com.google.android.libraries.lens.view.utils.C28122k.m52403c(r0)
            int r0 = com.google.android.libraries.lens.view.p2051ab.C24971d.m46221a(r0)
            r1.f68115w = r0
            int r0 = r12.f80670f
            com.google.android.libraries.n.a.b r0 = com.google.android.libraries.p2259n.p2260a.C29763b.m54880a(r0)
            if (r0 != 0) goto L_0x00b7
            com.google.android.libraries.n.a.b r0 = com.google.android.libraries.p2259n.p2260a.C29763b.ENTRY_POINT_ID_UNKNOWN
        L_0x00b7:
            com.google.common.base.ax r0 = com.google.android.libraries.lens.p1993a.C24065a.m44685a(r0)
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x00cd
            java.lang.Object r0 = r0.mo56107c()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.f68105m = r0
        L_0x00cd:
            int r0 = r12.f80665a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00da
            com.google.protobuf.z r0 = r12.f80666b
            byte[] r0 = r0.mo59174N()
            r1.f68095c = r0
        L_0x00da:
            int r0 = r12.f80665a
            r2 = r0 & 2
            if (r2 == 0) goto L_0x00e4
            java.lang.String r2 = r12.f80667c
            r1.f68098f = r2
        L_0x00e4:
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = r12.f80668d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.f68096d = r0
        L_0x00f0:
            int r0 = r12.f80665a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00fe
            com.google.lens.j.cu r0 = r12.f80669e
            if (r0 != 0) goto L_0x00fc
            com.google.lens.j.cu r0 = com.google.lens.p4707j.C62471cu.f168676c
        L_0x00fc:
            r1.f68094b = r0
        L_0x00fe:
            int r0 = r12.f80665a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x010e
            int r0 = r12.f80671g
            long r2 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.f68118z = r0
            goto L_0x0118
        L_0x010e:
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.f68118z = r0
        L_0x0118:
            int r0 = r12.f80665a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0122
            boolean r12 = r12.f80672h
            r1.f68092C = r12
        L_0x0122:
            android.os.Bundle r12 = r1.mo30192a()
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x032e
        L_0x012c:
            com.google.common.f.e r12 = f278449a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = "No Entry Point Id was supplied in LensDeeplinkRequest."
            r1 = 19282(0x4b52, float:2.702E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            goto L_0x013c
        L_0x013a:
            if (r0 != 0) goto L_0x0140
        L_0x013c:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x032e
        L_0x0140:
            java.lang.String r1 = r0.getHost()
            if (r1 == 0) goto L_0x032c
            java.lang.String r4 = "lens"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0150
            goto L_0x032c
        L_0x0150:
            java.lang.String r1 = "callerpackagename"
            java.lang.String r1 = r0.getQueryParameter(r1)
            if (r1 == 0) goto L_0x015c
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x032e
        L_0x015c:
            java.lang.String r12 = r12.f101607c
            boolean r1 = com.google.common.base.C58837ba.m90859h(r12)
            if (r1 == 0) goto L_0x0175
            com.google.common.f.e r12 = f278449a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r0 = "Caller package must be set."
            r1 = 19287(0x4b57, float:2.7027E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r0)
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x032e
        L_0x0175:
            dagger.a r1 = r11.f278453g
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.libraries.lens.view.s.a r1 = (com.google.android.libraries.lens.view.p2162s.C27683a) r1
            int r1 = r1.mo33176c(r12)
            m165050c(r12, r1)
            if (r1 == r3) goto L_0x018a
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x032e
        L_0x018a:
            com.google.android.libraries.lens.view.ab.c r1 = new com.google.android.libraries.lens.view.ab.c
            r1.<init>()
            android.content.Context r4 = r11.f278452f
            int r4 = com.google.android.libraries.lens.view.utils.C28122k.m52403c(r4)
            r1.f68093a = r2
            r1.f68102j = r12
            int r12 = com.google.android.libraries.lens.view.p2051ab.C24971d.m46221a(r4)
            r1.f68115w = r12
            java.lang.String r12 = "LensBitmapUriKey"
            java.lang.String r12 = r0.getQueryParameter(r12)
            if (r12 == 0) goto L_0x01ad
            android.net.Uri r12 = android.net.Uri.parse(r12)
            r1.f68096d = r12
        L_0x01ad:
            java.lang.String r12 = "AccountNameUriKey"
            java.lang.String r4 = r0.getQueryParameter(r12)
            if (r4 == 0) goto L_0x01bb
            java.lang.String r12 = r0.getQueryParameter(r12)
            r1.f68103k = r12
        L_0x01bb:
            java.lang.String r12 = "IncognitoUriKey"
            java.lang.String r4 = r0.getQueryParameter(r12)
            if (r4 == 0) goto L_0x01cd
            java.lang.String r12 = r0.getQueryParameter(r12)
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            r1.f68116x = r12
        L_0x01cd:
            java.lang.String r12 = "ImageSrc"
            java.lang.String r4 = r0.getQueryParameter(r12)
            if (r4 == 0) goto L_0x01db
            java.lang.String r12 = r0.getQueryParameter(r12)
            r1.f68099g = r12
        L_0x01db:
            java.lang.String r12 = "PageDomain"
            java.lang.String r4 = r0.getQueryParameter(r12)
            if (r4 == 0) goto L_0x01e9
            java.lang.String r12 = r0.getQueryParameter(r12)
            r1.f68100h = r12
        L_0x01e9:
            java.lang.String r12 = "Gid"
            java.lang.String r4 = r0.getQueryParameter(r12)
            if (r4 == 0) goto L_0x01f7
            java.lang.String r12 = r0.getQueryParameter(r12)
            r1.f68091B = r12
        L_0x01f7:
            java.lang.String r12 = "ActivityLaunchTimestampNanos"
            java.lang.String r12 = r0.getQueryParameter(r12)
            if (r12 == 0) goto L_0x020c
            long r4 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x020a }
            java.lang.Long r12 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x020a }
            r1.f68118z = r12     // Catch:{ NumberFormatException -> 0x020a }
            goto L_0x0216
        L_0x020a:
            goto L_0x0216
        L_0x020c:
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            r1.f68118z = r12
        L_0x0216:
            java.lang.String r12 = "lens_intent_type"
            java.lang.String r12 = r0.getQueryParameter(r12)
            if (r12 == 0) goto L_0x0301
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0300 }
            r1.f68105m = r12     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.common.b.ij r4 = f278450b     // Catch:{ NumberFormatException -> 0x0300 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0300 }
            boolean r4 = r4.contains(r5)     // Catch:{ NumberFormatException -> 0x0300 }
            r6 = 5
            if (r4 == 0) goto L_0x0298
            com.google.lens.j.cu r4 = com.google.lens.p4707j.C62471cu.f168676c     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.ce r4 = (com.google.lens.p4707j.C62455ce) r4     // Catch:{ NumberFormatException -> 0x0300 }
            java.lang.String r5 = "lens_translate_source_lang"
            java.lang.String r5 = r0.getQueryParameter(r5)     // Catch:{ NumberFormatException -> 0x0300 }
            java.lang.String r7 = "lens_translate_target_lang"
            java.lang.String r7 = r0.getQueryParameter(r7)     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.ct r8 = com.google.lens.p4707j.C62470ct.f168670e     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cs r8 = (com.google.lens.p4707j.C62469cs) r8     // Catch:{ NumberFormatException -> 0x0300 }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ NumberFormatException -> 0x0300 }
            if (r9 != 0) goto L_0x0264
            r8.copyOnWrite()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.ct r9 = (com.google.lens.p4707j.C62470ct) r9     // Catch:{ NumberFormatException -> 0x0300 }
            r5.getClass()     // Catch:{ NumberFormatException -> 0x0300 }
            int r10 = r9.f168672a     // Catch:{ NumberFormatException -> 0x0300 }
            r10 = r10 | r3
            r9.f168672a = r10     // Catch:{ NumberFormatException -> 0x0300 }
            r9.f168674c = r5     // Catch:{ NumberFormatException -> 0x0300 }
        L_0x0264:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ NumberFormatException -> 0x0300 }
            if (r5 != 0) goto L_0x027b
            r8.copyOnWrite()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r5 = r8.instance     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.ct r5 = (com.google.lens.p4707j.C62470ct) r5     // Catch:{ NumberFormatException -> 0x0300 }
            r7.getClass()     // Catch:{ NumberFormatException -> 0x0300 }
            int r9 = r5.f168672a     // Catch:{ NumberFormatException -> 0x0300 }
            r2 = r2 | r9
            r5.f168672a = r2     // Catch:{ NumberFormatException -> 0x0300 }
            r5.f168673b = r7     // Catch:{ NumberFormatException -> 0x0300 }
        L_0x027b:
            com.google.protobuf.bv r2 = r8.build()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.ct r2 = (com.google.lens.p4707j.C62470ct) r2     // Catch:{ NumberFormatException -> 0x0300 }
            r4.copyOnWrite()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cu r5 = (com.google.lens.p4707j.C62471cu) r5     // Catch:{ NumberFormatException -> 0x0300 }
            r2.getClass()     // Catch:{ NumberFormatException -> 0x0300 }
            r5.f168679b = r2     // Catch:{ NumberFormatException -> 0x0300 }
            r5.f168678a = r3     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r2 = r4.build()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2     // Catch:{ NumberFormatException -> 0x0300 }
            r1.f68094b = r2     // Catch:{ NumberFormatException -> 0x0300 }
            goto L_0x02d0
        L_0x0298:
            com.google.common.b.ij r2 = f278451c     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.common.b.qy r2 = (com.google.common.p4522b.C58759qy) r2     // Catch:{ NumberFormatException -> 0x0300 }
            java.lang.Object r2 = r2.f156534a     // Catch:{ NumberFormatException -> 0x0300 }
            boolean r2 = r2.equals(r5)     // Catch:{ NumberFormatException -> 0x0300 }
            if (r2 == 0) goto L_0x02d0
            com.google.lens.j.cu r2 = com.google.lens.p4707j.C62471cu.f168676c     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.ce r2 = (com.google.lens.p4707j.C62455ce) r2     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cp r3 = com.google.lens.p4707j.C62466cp.f168663a     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.co r3 = (com.google.lens.p4707j.C62465co) r3     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cp r3 = (com.google.lens.p4707j.C62466cp) r3     // Catch:{ NumberFormatException -> 0x0300 }
            r2.copyOnWrite()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cu r4 = (com.google.lens.p4707j.C62471cu) r4     // Catch:{ NumberFormatException -> 0x0300 }
            r3.getClass()     // Catch:{ NumberFormatException -> 0x0300 }
            r4.f168679b = r3     // Catch:{ NumberFormatException -> 0x0300 }
            r4.f168678a = r6     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2     // Catch:{ NumberFormatException -> 0x0300 }
            r1.f68094b = r2     // Catch:{ NumberFormatException -> 0x0300 }
        L_0x02d0:
            com.google.lens.j.bj r2 = com.google.lens.p4707j.C62433bj.LENS_IN_TRANSLATE_ONEBOX     // Catch:{ NumberFormatException -> 0x0300 }
            int r2 = r2.f168594ao     // Catch:{ NumberFormatException -> 0x0300 }
            if (r12 != r2) goto L_0x02d9
            r2 = 0
            r1.f68114v = r2     // Catch:{ NumberFormatException -> 0x0300 }
        L_0x02d9:
            com.google.lens.j.bj r2 = com.google.lens.p4707j.C62433bj.LENS_CHROME_CONTEXT_MENU_SHOPPING     // Catch:{ NumberFormatException -> 0x0300 }
            int r2 = r2.f168594ao     // Catch:{ NumberFormatException -> 0x0300 }
            if (r12 != r2) goto L_0x0301
            com.google.lens.j.cu r12 = com.google.lens.p4707j.C62471cu.f168676c     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.ce r12 = (com.google.lens.p4707j.C62455ce) r12     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cp r2 = com.google.lens.p4707j.C62466cp.f168663a     // Catch:{ NumberFormatException -> 0x0300 }
            r12.copyOnWrite()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r3 = r12.instance     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cu r3 = (com.google.lens.p4707j.C62471cu) r3     // Catch:{ NumberFormatException -> 0x0300 }
            r2.getClass()     // Catch:{ NumberFormatException -> 0x0300 }
            r3.f168679b = r2     // Catch:{ NumberFormatException -> 0x0300 }
            r3.f168678a = r6     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.protobuf.bv r12 = r12.build()     // Catch:{ NumberFormatException -> 0x0300 }
            com.google.lens.j.cu r12 = (com.google.lens.p4707j.C62471cu) r12     // Catch:{ NumberFormatException -> 0x0300 }
            r1.f68094b = r12     // Catch:{ NumberFormatException -> 0x0300 }
            goto L_0x0301
        L_0x0300:
        L_0x0301:
            java.lang.String r12 = "PrSid"
            java.lang.String r12 = r0.getQueryParameter(r12)
            if (r12 == 0) goto L_0x030b
            r1.f68107o = r12
        L_0x030b:
            java.lang.String r12 = "PrQid"
            java.lang.String r12 = r0.getQueryParameter(r12)
            if (r12 == 0) goto L_0x0323
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0323 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0323 }
            int r0 = r12.intValue()     // Catch:{ NumberFormatException -> 0x0323 }
            if (r0 == 0) goto L_0x0323
            r1.f68106n = r12     // Catch:{ NumberFormatException -> 0x0323 }
        L_0x0323:
            android.os.Bundle r12 = r1.mo30192a()
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x032e
        L_0x032c:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
        L_0x032e:
            boolean r0 = r12.mo56113h()
            if (r0 != 0) goto L_0x0335
            return
        L_0x0335:
            com.google.android.apps.search.lens.a.f r0 = r11.f278454h
            java.lang.Object r12 = r12.mo56107c()
            android.os.Bundle r12 = (android.os.Bundle) r12
            r0.mo115338b(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.deeplink.p7793e.C99509j.mo78405a(com.google.android.libraries.search.g.a.p):void");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
