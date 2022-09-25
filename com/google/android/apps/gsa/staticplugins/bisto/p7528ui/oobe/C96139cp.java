package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.C4268a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89946n;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58831av;
import com.google.common.p4552o.C60097kq;
import com.google.common.p4552o.C60098kr;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cp */
/* compiled from: PG */
public final class C96139cp extends C96363kx {

    /* renamed from: b */
    public String f269133b;

    /* renamed from: c */
    public C96325jm f269134c;

    /* renamed from: d */
    public C96094ay f269135d;

    /* renamed from: e */
    public C22871g f269136e;

    /* renamed from: f */
    public C68214a f269137f;

    /* renamed from: g */
    public C86124t f269138g;

    /* renamed from: h */
    public FooterLayout f269139h;

    /* renamed from: i */
    public Drawable f269140i;

    /* renamed from: j */
    public boolean f269141j = false;

    /* renamed from: k */
    public boolean f269142k = false;

    /* renamed from: l */
    public ViewPager f269143l;

    /* renamed from: m */
    public C4268a f269144m;

    /* renamed from: n */
    public int f269145n;

    /* renamed from: o */
    public boolean f269146o = false;

    /* renamed from: p */
    public C60870cx f269147p;

    /* renamed from: q */
    public final C22870f f269148q = new C96137cn(this);

    /* renamed from: r */
    private OpaPageLayout f269149r;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: com.google.android.d.ce} */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01eb, code lost:
        r14 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b5  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m159443i() {
        /*
            r27 = this;
            r0 = r27
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f269149r
            r2 = 2131429271(0x7f0b0797, float:1.848021E38)
            android.view.View r1 = r1.findViewById(r2)
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            r0.f269143l = r1
            android.app.FragmentManager r1 = r27.getChildFragmentManager()
            com.google.android.apps.gsa.opaonboarding.bl r2 = r27.mo77318iT()
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.jm r3 = r0.f269134c
            java.lang.String r4 = r0.f269133b
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ay r5 = r0.f269135d
            dagger.a r6 = r0.f269137f
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.shared.bisto.k r6 = (com.google.android.apps.gsa.shared.bisto.C89656k) r6
            android.content.Context r7 = r27.getContext()
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ay r8 = r0.f269135d
            java.lang.String r8 = r8.f269039a
            r9 = 6
            r10 = 1
            r11 = 0
            if (r8 != 0) goto L_0x0034
        L_0x0032:
            r8 = 0
            goto L_0x0058
        L_0x0034:
            android.os.Bundle r8 = r27.getArguments()
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.Object r8 = com.google.common.base.C58831av.m90830c(r8, r12)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r12 = "vm"
            boolean r12 = r8.getBoolean(r12, r11)
            if (r12 != 0) goto L_0x004c
            goto L_0x0032
        L_0x004c:
            java.lang.String r12 = "hw"
            int r8 = r8.getInt(r12, r10)
            if (r8 == r9) goto L_0x0057
            r12 = 2
            if (r8 != r12) goto L_0x0032
        L_0x0057:
            r8 = 1
        L_0x0058:
            java.lang.String r12 = "vme"
            boolean r12 = r0.m159444j(r12)
            android.os.Bundle r13 = r27.getArguments()
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            java.lang.Object r13 = com.google.common.base.C58831av.m90830c(r13, r14)
            android.os.Bundle r13 = (android.os.Bundle) r13
            java.lang.String r14 = "ga"
            int r13 = r13.getInt(r14, r11)
            com.google.android.d.do r13 = com.google.android.p10712d.C142390do.m231074a(r13)
            java.lang.String r14 = "fnse"
            boolean r14 = r0.m159444j(r14)
            com.google.common.b.gp r15 = new com.google.common.b.gp
            r9 = 4
            r15.<init>(r9)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ba r3 = r3.f269538a
            if (r12 == 0) goto L_0x0144
            com.google.android.d.bc r12 = r3.f269047b
            com.google.android.d.bs r12 = r12.f386119e
            if (r12 != 0) goto L_0x008f
            com.google.android.d.bs r12 = com.google.android.p10712d.C142340bs.f386174C
        L_0x008f:
            com.google.android.d.bq r12 = r12.f386195r
            if (r12 != 0) goto L_0x0095
            com.google.android.d.bq r12 = com.google.android.p10712d.C142338bq.f386166g
        L_0x0095:
            int r12 = r12.f386168a
            r12 = r12 & r9
            if (r12 == 0) goto L_0x0144
            com.google.android.d.bc r12 = r3.f269047b
            com.google.android.d.bs r12 = r12.f386119e
            if (r12 != 0) goto L_0x00a2
            com.google.android.d.bs r12 = com.google.android.p10712d.C142340bs.f386174C
        L_0x00a2:
            com.google.android.d.bq r12 = r12.f386195r
            if (r12 != 0) goto L_0x00a8
            com.google.android.d.bq r12 = com.google.android.p10712d.C142338bq.f386166g
        L_0x00a8:
            com.google.android.d.cg r12 = r12.f386171d
            if (r12 != 0) goto L_0x00ae
            com.google.android.d.cg r12 = com.google.android.p10712d.C142355cg.f386263b
        L_0x00ae:
            com.google.protobuf.cq r12 = r12.f386265a
            java.lang.String r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203990f(r12)
            boolean r16 = com.google.common.base.C58837ba.m90859h(r12)
            if (r16 == 0) goto L_0x00c7
            android.content.Context r12 = r3.f269046a
            android.content.res.Resources r12 = r12.getResources()
            r11 = 2132093573(0x7f152a85, float:1.9827575E38)
            java.lang.String r12 = r12.getString(r11)
        L_0x00c7:
            r18 = r12
            com.google.android.d.bc r11 = r3.f269047b
            com.google.android.d.bs r11 = r11.f386119e
            if (r11 != 0) goto L_0x00d1
            com.google.android.d.bs r11 = com.google.android.p10712d.C142340bs.f386174C
        L_0x00d1:
            com.google.android.d.bq r11 = r11.f386195r
            if (r11 != 0) goto L_0x00d7
            com.google.android.d.bq r11 = com.google.android.p10712d.C142338bq.f386166g
        L_0x00d7:
            com.google.android.d.bg r11 = r11.f386170c
            if (r11 != 0) goto L_0x00dd
            com.google.android.d.bg r11 = com.google.android.p10712d.C142328bg.f386139f
        L_0x00dd:
            android.content.Context r12 = r3.f269046a
            boolean r12 = com.google.android.apps.gsa.staticplugins.bisto.util.C96498r.m159875b(r12)
            com.google.common.base.ax r11 = com.google.android.apps.gsa.staticplugins.bisto.util.C96506z.m159889a(r11, r12)
            boolean r12 = r11.mo56113h()
            if (r12 == 0) goto L_0x00f6
            java.lang.Object r11 = r11.mo56107c()
            java.lang.String r11 = (java.lang.String) r11
        L_0x00f3:
            r19 = r11
            goto L_0x0104
        L_0x00f6:
            android.content.Context r11 = r3.f269046a
            boolean r11 = com.google.android.apps.gsa.staticplugins.bisto.util.C96498r.m159875b(r11)
            if (r11 == 0) goto L_0x0101
            java.lang.String r11 = "https://www.gstatic.com/bisto/oobe/voice_match/voice_match_dark.html"
            goto L_0x00f3
        L_0x0101:
            java.lang.String r11 = "https://www.gstatic.com/bisto/oobe/voice_match/voice_match.html"
            goto L_0x00f3
        L_0x0104:
            com.google.android.d.bc r11 = r3.f269047b
            com.google.android.d.bs r11 = r11.f386119e
            if (r11 != 0) goto L_0x010c
            com.google.android.d.bs r11 = com.google.android.p10712d.C142340bs.f386174C
        L_0x010c:
            com.google.android.d.bq r11 = r11.f386195r
            if (r11 != 0) goto L_0x0112
            com.google.android.d.bq r11 = com.google.android.p10712d.C142338bq.f386166g
        L_0x0112:
            com.google.android.d.cg r11 = r11.f386172e
            if (r11 != 0) goto L_0x0118
            com.google.android.d.cg r11 = com.google.android.p10712d.C142355cg.f386263b
        L_0x0118:
            com.google.protobuf.cq r11 = r11.f386265a
            java.lang.String r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203990f(r11)
            boolean r12 = com.google.common.base.C58837ba.m90859h(r11)
            if (r12 == 0) goto L_0x0131
            android.content.Context r11 = r3.f269046a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2132093574(0x7f152a86, float:1.9827577E38)
            java.lang.String r11 = r11.getString(r12)
        L_0x0131:
            r21 = r11
            r17 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r11 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r17, r18, r19, r20, r21, r22, r23, r24)
            r15.mo55395g(r11)
        L_0x0144:
            com.google.android.d.do r11 = com.google.android.p10712d.C142390do.ASSISTANT_GESTURE_UNAVAILABLE
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L_0x01b3
            com.google.common.base.ax r11 = r3.mo89954e()
            boolean r11 = r11.mo56113h()
            if (r11 != 0) goto L_0x0158
            r8 = 0
            goto L_0x01ae
        L_0x0158:
            if (r8 == 0) goto L_0x017c
            com.google.android.d.bc r8 = r3.f269047b
            boolean r8 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b.m203981d(r4, r8)
            if (r8 == 0) goto L_0x016e
            android.content.res.Resources r8 = r7.getResources()
            r11 = 2132093368(0x7f1529b8, float:1.9827159E38)
            java.lang.String r8 = r8.getString(r11)
            goto L_0x0179
        L_0x016e:
            android.content.res.Resources r8 = r7.getResources()
            r11 = 2132093367(0x7f1529b7, float:1.9827157E38)
            java.lang.String r8 = r8.getString(r11)
        L_0x0179:
            r21 = r8
            goto L_0x017e
        L_0x017c:
            r21 = 0
        L_0x017e:
            r17 = 0
            com.google.common.base.ax r8 = r3.mo89954e()
            java.lang.Object r8 = r8.mo56107c()
            r18 = r8
            java.lang.String r18 = (java.lang.String) r18
            com.google.common.base.ax r8 = r3.mo89955f()
            java.lang.Object r8 = r8.mo56111f()
            r19 = r8
            java.lang.String r19 = (java.lang.String) r19
            com.google.common.base.ax r8 = r3.mo89956g()
            java.lang.Object r8 = r8.mo56111f()
            r20 = r8
            java.lang.String r20 = (java.lang.String) r20
            r22 = 0
            r23 = 0
            r24 = 0
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r8 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x01ae:
            if (r8 == 0) goto L_0x01b3
            r15.mo55395g(r8)
        L_0x01b3:
            if (r14 == 0) goto L_0x0234
            com.google.android.d.bc r8 = r3.f269047b
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r13 = r11.getLanguage()
            java.lang.String r11 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203991g(r11)
            com.google.protobuf.cq r8 = r8.f386122h
            java.util.Iterator r8 = r8.iterator()
            r14 = 0
        L_0x01ca:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x01fc
            java.lang.Object r17 = r8.next()
            r12 = r17
            com.google.android.d.ce r12 = (com.google.android.p10712d.C142353ce) r12
            java.lang.String r9 = r12.f386251b
            java.lang.String r9 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203992h(r9)
            boolean r19 = com.google.common.base.C58890d.m90990e(r11, r9)
            if (r19 == 0) goto L_0x01e5
            goto L_0x01eb
        L_0x01e5:
            boolean r19 = com.google.common.base.C58890d.m90990e(r13, r9)
            if (r19 == 0) goto L_0x01ed
        L_0x01eb:
            r14 = r12
            goto L_0x01fc
        L_0x01ed:
            r19 = r8
            java.lang.String r8 = "en_US"
            boolean r8 = r8.equals(r9)
            if (r10 != r8) goto L_0x01f8
            r14 = r12
        L_0x01f8:
            r8 = r19
            r9 = 4
            goto L_0x01ca
        L_0x01fc:
            if (r14 != 0) goto L_0x0201
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            goto L_0x0215
        L_0x0201:
            com.google.protobuf.cq r8 = r14.f386252c
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0210
            java.lang.Object r8 = com.google.common.p4522b.C58557jl.m90131l(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0211
        L_0x0210:
            r8 = 0
        L_0x0211:
            com.google.common.base.ax r8 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96097ba.m159386b(r8)
        L_0x0215:
            r19 = 0
            java.lang.Object r8 = r8.mo56111f()
            r20 = r8
            java.lang.String r20 = (java.lang.String) r20
            java.lang.String r21 = r3.mo89957h()
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r8 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r19, r20, r21, r22, r23, r24, r25, r26)
            r15.mo55395g(r8)
        L_0x0234:
            java.lang.String r8 = "00000006"
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0284
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2132092443(0x7f15261b, float:1.9825283E38)
            java.lang.String r19 = r8.getString(r9)
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2132092442(0x7f15261a, float:1.982528E38)
            java.lang.String r20 = r8.getString(r9)
            java.lang.String r21 = "https://www.gstatic.com/bisto/oobe/b10/sleep_mode/index.html"
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r8 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r19, r20, r21, r22, r23, r24, r25, r26)
            r15.mo55395g(r8)
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2132083216(0x7f150210, float:1.9806568E38)
            java.lang.String r19 = r8.getString(r9)
            android.content.res.Resources r8 = r7.getResources()
            r9 = 2132083215(0x7f15020f, float:1.9806566E38)
            java.lang.String r20 = r8.getString(r9)
            java.lang.String r21 = "https://www.gstatic.com/bisto/oobe/b10/fit/index.html"
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r8 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r19, r20, r21, r22, r23, r24, r25, r26)
            r15.mo55395g(r8)
        L_0x0284:
            boolean r6 = r6.mo83561p()
            if (r6 != 0) goto L_0x02aa
            r19 = 0
            android.content.res.Resources r6 = r7.getResources()
            r8 = 2132091237(0x7f152165, float:1.9822837E38)
            java.lang.String r20 = r6.getString(r8)
            java.lang.String r21 = "https://www.gstatic.com/bisto/oobe/educational/educational_lockscreen.html"
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r6 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r19, r20, r21, r22, r23, r24, r25, r26)
            r15.mo55395g(r6)
        L_0x02aa:
            com.google.android.d.bc r6 = r3.f269047b
            boolean r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b.m203981d(r4, r6)
            if (r4 != 0) goto L_0x03fb
            r3.mo89953c()
            com.google.common.base.ax r4 = r3.mo89953c()
            com.google.common.base.bk r4 = (com.google.common.base.C58847bk) r4
            java.lang.Object r6 = r4.f156646a
            com.google.android.d.az r6 = (com.google.android.p10712d.C142320az) r6
            int r8 = r6.f386101a
            r9 = 4
            r8 = r8 & r9
            if (r8 == 0) goto L_0x03f5
            android.content.pm.PackageManager r8 = r7.getPackageManager()
            int r11 = r6.f386101a
            r11 = r11 & r9
            if (r11 == 0) goto L_0x02df
            java.lang.String r6 = r6.f386103c
            android.content.Intent r6 = r8.getLaunchIntentForPackage(r6)
            if (r6 != 0) goto L_0x02d7
            goto L_0x02df
        L_0x02d7:
            java.lang.String r8 = "key_device_id"
            java.lang.String r5 = r5.f269039a
            r6.putExtra(r8, r5)
            goto L_0x02e0
        L_0x02df:
            r6 = 0
        L_0x02e0:
            android.content.res.Resources r5 = r7.getResources()
            r8 = 2132085834(0x7f150c4a, float:1.9811878E38)
            java.lang.String r5 = r5.getString(r8)
            if (r6 != 0) goto L_0x0336
            java.lang.Object r5 = r4.f156646a
            com.google.android.d.az r5 = (com.google.android.p10712d.C142320az) r5
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.VIEW"
            r6.<init>(r8)
            java.lang.String r8 = r7.getPackageName()
            java.lang.String r5 = r5.f386103c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "market://details?id="
            r9.<init>(r11)
            r9.append(r5)
            java.lang.String r5 = "&referrer="
            r9.append(r5)
            r9.append(r8)
            java.lang.String r5 = r9.toString()
            java.lang.String r9 = "com.android.vending"
            r6.setPackage(r9)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r6.setData(r5)
            java.lang.String r5 = "callerId"
            r6.putExtra(r5, r8)
            android.content.res.Resources r5 = r7.getResources()
            r8 = 2132085833(0x7f150c49, float:1.9811876E38)
            java.lang.String r5 = r5.getString(r8)
            r9 = 5
            r25 = r5
            r24 = r6
            goto L_0x033b
        L_0x0336:
            r25 = r5
            r24 = r6
            r9 = 6
        L_0x033b:
            java.lang.Object r4 = r4.f156646a
            com.google.android.d.az r4 = (com.google.android.p10712d.C142320az) r4
            int r5 = r4.f386101a
            r6 = r5 & 32
            if (r6 == 0) goto L_0x0352
            com.google.android.d.cg r4 = r4.f386104d
            if (r4 != 0) goto L_0x034b
            com.google.android.d.cg r4 = com.google.android.p10712d.C142355cg.f386263b
        L_0x034b:
            com.google.protobuf.cq r4 = r4.f386265a
            java.lang.String r12 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203990f(r4)
            goto L_0x0359
        L_0x0352:
            r5 = r5 & r10
            if (r5 == 0) goto L_0x0358
            java.lang.String r12 = r4.f386102b
            goto L_0x0359
        L_0x0358:
            r12 = 0
        L_0x0359:
            if (r12 != 0) goto L_0x0367
            android.content.res.Resources r4 = r7.getResources()
            r5 = 2132085836(0x7f150c4c, float:1.9811882E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0377
        L_0x0367:
            android.content.res.Resources r4 = r7.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r6 = 0
            r5[r6] = r12
            r6 = 2132085835(0x7f150c4b, float:1.981188E38)
            java.lang.String r4 = r4.getString(r6, r5)
        L_0x0377:
            r23 = r4
            com.google.android.d.bc r4 = r3.f269047b
            com.google.android.d.by r4 = r4.f386120f
            if (r4 != 0) goto L_0x0381
            com.google.android.d.by r4 = com.google.android.p10712d.C142346by.f386219m
        L_0x0381:
            com.google.android.d.bg r4 = r4.f386222b
            if (r4 != 0) goto L_0x0387
            com.google.android.d.bg r4 = com.google.android.p10712d.C142328bg.f386139f
        L_0x0387:
            com.google.protobuf.cq r4 = r4.f386142b
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x03ab
            com.google.android.d.bc r4 = r3.f269047b
            com.google.android.d.by r4 = r4.f386120f
            if (r4 != 0) goto L_0x0397
            com.google.android.d.by r4 = com.google.android.p10712d.C142346by.f386219m
        L_0x0397:
            com.google.android.d.bg r4 = r4.f386222b
            if (r4 != 0) goto L_0x039d
            com.google.android.d.bg r4 = com.google.android.p10712d.C142328bg.f386139f
        L_0x039d:
            com.google.protobuf.cq r4 = r4.f386142b
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x03ad
        L_0x03ab:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
        L_0x03ad:
            java.lang.String r5 = "data:text/html,%s"
            java.lang.String r6 = "<body style='background:transparent; margin:0; padding:0; background-image:url(%s); background-repeat:no-repeat; background-size:contain; background-position: center center;'></body>"
            boolean r8 = r4.mo56113h()
            if (r8 != 0) goto L_0x03ba
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            goto L_0x03da
        L_0x03ba:
            java.lang.Object[] r8 = new java.lang.Object[r10]     // Catch:{ RuntimeException -> 0x03d8 }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ RuntimeException -> 0x03d8 }
            java.lang.Object r4 = r4.mo56107c()     // Catch:{ RuntimeException -> 0x03d8 }
            r11 = 0
            r10[r11] = r4     // Catch:{ RuntimeException -> 0x03d8 }
            java.lang.String r4 = java.lang.String.format(r6, r10)     // Catch:{ RuntimeException -> 0x03d8 }
            java.lang.String r4 = android.net.Uri.encode(r4)     // Catch:{ RuntimeException -> 0x03d8 }
            r8[r11] = r4     // Catch:{ RuntimeException -> 0x03d8 }
            java.lang.String r4 = java.lang.String.format(r5, r8)     // Catch:{ RuntimeException -> 0x03d8 }
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)     // Catch:{ RuntimeException -> 0x03d8 }
            goto L_0x03da
        L_0x03d8:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
        L_0x03da:
            r19 = 0
            r20 = 0
            java.lang.Object r4 = r4.mo56111f()
            r21 = r4
            java.lang.String r21 = (java.lang.String) r21
            r22 = 0
            int r9 = r9 + -1
            java.lang.Integer r26 = java.lang.Integer.valueOf(r9)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r12 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r19, r20, r21, r22, r23, r24, r25, r26)
            r12.f228534a = r2
            goto L_0x03f6
        L_0x03f5:
            r12 = 0
        L_0x03f6:
            if (r12 == 0) goto L_0x03fb
            r15.mo55395g(r12)
        L_0x03fb:
            com.google.common.b.gp r2 = new com.google.common.b.gp
            r4 = 4
            r2.<init>(r4)
            com.google.android.d.bc r3 = r3.f269047b
            com.google.android.d.bs r3 = r3.f386119e
            if (r3 != 0) goto L_0x0409
            com.google.android.d.bs r3 = com.google.android.p10712d.C142340bs.f386174C
        L_0x0409:
            com.google.protobuf.cq r3 = r3.f386202y
            java.util.Iterator r3 = r3.iterator()
        L_0x040f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0465
            java.lang.Object r4 = r3.next()
            com.google.android.d.be r4 = (com.google.android.p10712d.C142326be) r4
            com.google.android.d.bg r5 = r4.f386138d
            if (r5 != 0) goto L_0x0421
            com.google.android.d.bg r5 = com.google.android.p10712d.C142328bg.f386139f
        L_0x0421:
            boolean r6 = com.google.android.apps.gsa.staticplugins.bisto.util.C96498r.m159875b(r7)
            com.google.common.base.ax r5 = com.google.android.apps.gsa.staticplugins.bisto.util.C96506z.m159889a(r5, r6)
            com.google.android.d.cg r6 = r4.f386136b
            if (r6 != 0) goto L_0x042f
            com.google.android.d.cg r6 = com.google.android.p10712d.C142355cg.f386263b
        L_0x042f:
            java.lang.String r17 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203989e(r6)
            com.google.android.d.cg r6 = r4.f386137c
            if (r6 != 0) goto L_0x0439
            com.google.android.d.cg r6 = com.google.android.p10712d.C142355cg.f386263b
        L_0x0439:
            java.lang.String r18 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203989e(r6)
            java.lang.Object r5 = r5.mo56111f()
            r19 = r5
            java.lang.String r19 = (java.lang.String) r19
            com.google.android.d.bg r4 = r4.f386138d
            if (r4 != 0) goto L_0x044b
            com.google.android.d.bg r4 = com.google.android.p10712d.C142328bg.f386139f
        L_0x044b:
            com.google.android.d.cg r4 = r4.f386143c
            if (r4 != 0) goto L_0x0451
            com.google.android.d.cg r4 = com.google.android.p10712d.C142355cg.f386263b
        L_0x0451:
            java.lang.String r20 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f.m203989e(r4)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cs r4 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96140cq.m159450o(r17, r18, r19, r20, r21, r22, r23, r24)
            r2.mo55395g(r4)
            goto L_0x040f
        L_0x0465:
            com.google.common.b.gu r2 = r2.mo55394f()
            r15.mo55396h(r2)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cq r2 = new com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cq
            com.google.common.b.gu r3 = r15.mo55394f()
            r2.<init>(r1, r3)
            r0.f269144m = r2
            androidx.viewpager.widget.ViewPager r1 = r0.f269143l
            r1.mo9146k(r2)
            androidx.viewpager.widget.ViewPager r1 = r0.f269143l
            r2 = 0
            r1.mo9147l(r2)
            androidx.viewpager.widget.ViewPager r1 = r0.f269143l
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.co r2 = new com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.co
            r2.<init>(r0)
            r1.mo9137f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96139cp.m159443i():void");
    }

    /* renamed from: j */
    private final boolean m159444j(String str) {
        return ((Bundle) C58831av.m90830c(getArguments(), new Bundle())).getBoolean(str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        mo89980g();
        return true;
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "Educational";
    }

    /* renamed from: g */
    public final void mo89980g() {
        boolean z = this.f269141j;
        boolean z2 = this.f269142k;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        C60097kq kqVar = (C60097kq) C60098kr.f162498d.createBuilder();
        kqVar.copyOnWrite();
        C60098kr krVar = (C60098kr) kqVar.instance;
        krVar.f162500a |= 1;
        krVar.f162501b = z;
        kqVar.copyOnWrite();
        C60098kr krVar2 = (C60098kr) kqVar.instance;
        krVar2.f162500a |= 2;
        krVar2.f162502c = z2;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60098kr krVar3 = (C60098kr) kqVar.build();
        krVar3.getClass();
        nmVar.f163170x = krVar3;
        nmVar.f163148b |= 64;
        ((C95299e) this.f269603D.mo27525b()).mo89234d(nkVar);
        mo77318iT().mo77312a();
    }

    /* renamed from: h */
    public final void mo89981h() {
        C60870cx cxVar = this.f269147p;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f269146o = false;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        this.f269149r = opaPageLayout;
        opaPageLayout.mo77370b(R.layout.educational);
        HeaderLayout headerLayout = (HeaderLayout) this.f269149r.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.finish_screen_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        this.f269141j = false;
        FooterLayout footerLayout = this.f269149r.f228726a;
        this.f269139h = footerLayout;
        footerLayout.mo77362c(1);
        this.f269140i = this.f269139h.mo77360a().getBackground();
        this.f269139h.mo77360a().setBackgroundColor(0);
        if (this.f269138g.mo79746e(C90122ft.f250870i)) {
            this.f269139h.mo77360a().setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
        } else {
            this.f269139h.mo77360a().setTextColor(getResources().getColor(R.color.opa_button_tint));
        }
        this.f269139h.mo77360a().setText(R.string.finish_screen_action_text);
        this.f269139h.mo77360a().setOnClickListener(new C89943l(new C96136cm(this)));
        m159443i();
        this.f269143l.setOnTouchListener(new C89946n(new C96135cl(this)));
        ((C95299e) this.f269603D.mo27525b()).mo89232b(true);
        return this.f269149r;
    }

    public final void onDestroy() {
        super.onDestroy();
        mo89981h();
    }

    public final void onResume() {
        super.onResume();
        m159443i();
        this.f269145n = 0;
        this.f269147p = this.f269136e.mo28208h("autoScroll", 8000, this.f269148q);
        this.f269146o = true;
        this.f269142k = false;
    }
}
