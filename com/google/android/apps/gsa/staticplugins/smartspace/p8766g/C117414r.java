package com.google.android.apps.gsa.staticplugins.smartspace.p8766g;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.C87354a;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.smartspace.p8764e.C117383a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.g.r */
/* compiled from: PG */
public abstract class C117414r implements C117405i {

    /* renamed from: a */
    final Context f325920a;

    /* renamed from: b */
    final C86124t f325921b;

    /* renamed from: c */
    final C21370a f325922c;

    /* renamed from: d */
    final C68214a f325923d;

    /* renamed from: e */
    private final C91189au f325924e;

    public C117414r(C91189au auVar, Context context, C86124t tVar, C21370a aVar, C68214a aVar2) {
        this.f325924e = auVar;
        this.f325920a = context;
        this.f325921b = tVar;
        this.f325922c = aVar;
        this.f325923d = aVar2;
    }

    /* renamed from: i */
    private final Intent m195115i(String str, String str2) {
        if (C58837ba.m90859h(str)) {
            return null;
        }
        C58976aa aaVar = C58975e.f156826a;
        Intent x = C87566i.m142325x(str);
        if (!C58837ba.m90859h(str2)) {
            x.setPackage(str2);
        }
        PackageManager packageManager = this.f325920a.getPackageManager();
        if (C83793i.m133414m(x)) {
            return C87354a.m141349b(str);
        }
        if (packageManager.resolveActivity(x, 65536) != null) {
            return x;
        }
        return null;
    }

    /* renamed from: a */
    public abstract long mo103291a(C57017i iVar);

    /* renamed from: c */
    public final C60870cx mo103283c(Object obj) {
        C58838bb.m90869d(obj instanceof C57017i, "Programming error in canHandleInput().");
        C57017i iVar = (C57017i) obj;
        Optional g = mo103294g(iVar);
        if (g.isEmpty()) {
            Optional d = mo103292d(iVar);
            if (d.isEmpty()) {
                return C60856cj.m92900i(new C117383a());
            }
            Optional f = mo103293f(iVar);
            if (f.isEmpty()) {
                return C60856cj.m92900i(new C117383a((C50818do) d.get()));
            }
            return C60856cj.m92900i(new C117383a((C50818do) d.get(), (Bitmap) f.get()));
        }
        SettableFuture settableFuture = new SettableFuture();
        C91189au auVar = this.f325924e;
        auVar.mo85428r(auVar.mo85418e((Uri) g.get(), 7), "SmartspacePushMessageIH.ImageCallback", new C117413q(this, iVar, settableFuture));
        return settableFuture;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015f, code lost:
        if (r2 == null) goto L_0x0161;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo103292d(com.google.p4283bv.p4345d.p4350b.p4353c.C57017i r11) {
        /*
            r10 = this;
            j$.util.Optional r0 = r10.mo103295h(r11)
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x0265
            java.lang.Object r1 = r0.get()
            com.google.assistant.c.do r1 = (com.google.assistant.p3886c.C50818do) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.c.cn r1 = (com.google.assistant.p3886c.C50790cn) r1
            java.lang.Object r0 = r0.get()
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r0 = r0.f132304a
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = r11.f152209d
            int r0 = r0.hashCode()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            int r3 = r2.f132304a
            r3 = r3 | 4
            r2.f132304a = r3
            r2.f132307d = r0
        L_0x0037:
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r2 = r0.f132304a
            r3 = 1
            r2 = r2 | r3
            r0.f132304a = r2
            r2 = 0
            r0.f132305b = r2
            com.google.assistant.c.cp r0 = com.google.assistant.p3886c.C50792cp.PRIMARY
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            int r0 = r0.f132174e
            r2.f132306c = r0
            int r0 = r2.f132304a
            r0 = r0 | 2
            r2.f132304a = r0
            com.google.assistant.c.b.n r0 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.b.m r0 = (com.google.assistant.p3886c.p3888b.C50728m) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.c.b.n r2 = (com.google.assistant.p3886c.p3888b.C50729n) r2
            int r4 = r2.f132009a
            r4 = r4 | r3
            r2.f132009a = r4
            java.lang.String r4 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON"
            r2.f132010b = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.c.b.n r0 = (com.google.assistant.p3886c.p3888b.C50729n) r0
            r0.getClass()
            r2.f132314k = r0
            int r0 = r2.f132304a
            r0 = r0 | 512(0x200, float:7.175E-43)
            r2.f132304a = r0
            com.google.assistant.c.cr r0 = r10.mo103282b()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            int r0 = r0.f132222T
            r2.f132315l = r0
            int r0 = r2.f132304a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r2.f132304a = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f325921b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89985ax.f246715aw
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x00ac
            com.google.assistant.c.b.p r0 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            goto L_0x00ae
        L_0x00ac:
            com.google.assistant.c.b.p r0 = com.google.assistant.p3886c.p3888b.C50731p.BROADCAST
        L_0x00ae:
            com.google.ai.b.ax r2 = r11.f152212g
            if (r2 != 0) goto L_0x00b4
            com.google.ai.b.ax r2 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x00b4:
            int r4 = r2.f26088c
            r5 = 7
            if (r4 != r5) goto L_0x00be
            java.lang.Object r2 = r2.f26089d
            com.google.ai.b.de r2 = (com.google.p375ai.p378b.C7605de) r2
            goto L_0x00c0
        L_0x00be:
            com.google.ai.b.de r2 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x00c0:
            int r2 = r2.f26271a
            r2 = r2 & r3
            r4 = 0
            r6 = 3
            if (r2 == 0) goto L_0x0112
            com.google.ai.b.ax r2 = r11.f152212g
            if (r2 != 0) goto L_0x00ce
            com.google.ai.b.ax r7 = com.google.p375ai.p378b.C7536ax.f26084o
            goto L_0x00cf
        L_0x00ce:
            r7 = r2
        L_0x00cf:
            int r8 = r7.f26088c
            if (r8 != r5) goto L_0x00d8
            java.lang.Object r7 = r7.f26089d
            com.google.ai.b.de r7 = (com.google.p375ai.p378b.C7605de) r7
            goto L_0x00da
        L_0x00d8:
            com.google.ai.b.de r7 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x00da:
            boolean r7 = r7.f26284n
            if (r7 == 0) goto L_0x0112
            if (r2 != 0) goto L_0x00e2
            com.google.ai.b.ax r2 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x00e2:
            int r7 = r2.f26088c
            if (r7 != r5) goto L_0x00eb
            java.lang.Object r2 = r2.f26089d
            com.google.ai.b.de r2 = (com.google.p375ai.p378b.C7605de) r2
            goto L_0x00ed
        L_0x00eb:
            com.google.ai.b.de r2 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x00ed:
            java.lang.String r2 = r2.f26272b
            dagger.a r7 = r10.f325923d
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.shared.h.k r7 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r7
            android.content.Context r8 = r10.f325920a
            com.google.android.apps.gsa.search.shared.h.h r9 = new com.google.android.apps.gsa.search.shared.h.h
            r9.<init>()
            r9.f236497A = r3
            r9.f236507K = r3
            r9.f236568n = r2
            r9.f236560f = r6
            android.os.Bundle r2 = r9.mo81685a()
            r6 = 268468224(0x10008000, float:2.5342157E-29)
            android.content.Intent r2 = r7.mo81687a(r8, r2, r6)
            goto L_0x0162
        L_0x0112:
            com.google.ai.b.ax r2 = r11.f152212g
            if (r2 != 0) goto L_0x0119
            com.google.ai.b.ax r7 = com.google.p375ai.p378b.C7536ax.f26084o
            goto L_0x011a
        L_0x0119:
            r7 = r2
        L_0x011a:
            int r7 = r7.f26088c
            if (r7 != r6) goto L_0x0161
            if (r2 != 0) goto L_0x0122
            com.google.ai.b.ax r2 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x0122:
            int r7 = r2.f26088c
            if (r7 != r6) goto L_0x012b
            java.lang.Object r2 = r2.f26089d
            com.google.ai.b.cd r2 = (com.google.p375ai.p378b.C7577cd) r2
            goto L_0x012d
        L_0x012b:
            com.google.ai.b.cd r2 = com.google.p375ai.p378b.C7577cd.f26179i
        L_0x012d:
            java.lang.String r2 = r2.f26183c
            com.google.ai.b.ax r7 = r11.f152212g
            if (r7 != 0) goto L_0x0135
            com.google.ai.b.ax r7 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x0135:
            int r8 = r7.f26088c
            if (r8 != r6) goto L_0x013e
            java.lang.Object r7 = r7.f26089d
            com.google.ai.b.cd r7 = (com.google.p375ai.p378b.C7577cd) r7
            goto L_0x0140
        L_0x013e:
            com.google.ai.b.cd r7 = com.google.p375ai.p378b.C7577cd.f26179i
        L_0x0140:
            java.lang.String r7 = r7.f26184d
            android.content.Intent r2 = r10.m195115i(r2, r7)
            if (r2 != 0) goto L_0x0162
            com.google.ai.b.ax r2 = r11.f152212g
            if (r2 != 0) goto L_0x014e
            com.google.ai.b.ax r2 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x014e:
            int r7 = r2.f26088c
            if (r7 != r6) goto L_0x0157
            java.lang.Object r2 = r2.f26089d
            com.google.ai.b.cd r2 = (com.google.p375ai.p378b.C7577cd) r2
            goto L_0x0159
        L_0x0157:
            com.google.ai.b.cd r2 = com.google.p375ai.p378b.C7577cd.f26179i
        L_0x0159:
            java.lang.String r2 = r2.f26185e
            android.content.Intent r2 = r10.m195115i(r2, r4)
            if (r2 != 0) goto L_0x0162
        L_0x0161:
            r2 = r4
        L_0x0162:
            com.google.ai.b.ax r6 = r11.f152212g
            if (r6 != 0) goto L_0x0169
            com.google.ai.b.ax r7 = com.google.p375ai.p378b.C7536ax.f26084o
            goto L_0x016a
        L_0x0169:
            r7 = r6
        L_0x016a:
            int r7 = r7.f26088c
            if (r7 != r5) goto L_0x0195
            if (r6 != 0) goto L_0x0173
            com.google.ai.b.ax r7 = com.google.p375ai.p378b.C7536ax.f26084o
            goto L_0x0174
        L_0x0173:
            r7 = r6
        L_0x0174:
            int r8 = r7.f26088c
            if (r8 != r5) goto L_0x017d
            java.lang.Object r7 = r7.f26089d
            com.google.ai.b.de r7 = (com.google.p375ai.p378b.C7605de) r7
            goto L_0x017f
        L_0x017d:
            com.google.ai.b.de r7 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x017f:
            boolean r7 = r7.f26284n
            if (r7 == 0) goto L_0x0184
            goto L_0x0195
        L_0x0184:
            if (r6 != 0) goto L_0x0188
            com.google.ai.b.ax r6 = com.google.p375ai.p378b.C7536ax.f26084o
        L_0x0188:
            int r4 = r6.f26088c
            if (r4 != r5) goto L_0x0191
            java.lang.Object r4 = r6.f26089d
            com.google.ai.b.de r4 = (com.google.p375ai.p378b.C7605de) r4
            goto L_0x0193
        L_0x0191:
            com.google.ai.b.de r4 = com.google.p375ai.p378b.C7605de.f26269s
        L_0x0193:
            java.lang.String r4 = r4.f26272b
        L_0x0195:
            r5 = r4
            com.google.assistant.c.cr r7 = r10.mo103282b()
            r6 = 0
            r9 = 1
            r4 = r2
            r8 = r0
            android.content.Intent r2 = com.google.android.apps.gsa.smartspace.C92122r.m151186d(r4, r5, r6, r7, r8, r9)
            com.google.assistant.c.b.r r4 = com.google.assistant.p3886c.p3888b.C50733r.f132021d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.b.q r4 = (com.google.assistant.p3886c.p3888b.C50732q) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.c.b.r r5 = (com.google.assistant.p3886c.p3888b.C50733r) r5
            int r0 = r0.f132020d
            r5.f132024b = r0
            int r0 = r5.f132023a
            r0 = r0 | r3
            r5.f132023a = r0
            java.lang.String r0 = r2.toUri(r3)
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.assistant.c.b.r r2 = (com.google.assistant.p3886c.p3888b.C50733r) r2
            r0.getClass()
            int r5 = r2.f132023a
            r5 = r5 | 2
            r2.f132023a = r5
            r2.f132025c = r0
            com.google.protobuf.bv r0 = r4.build()
            com.google.assistant.c.b.r r0 = (com.google.assistant.p3886c.p3888b.C50733r) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.c.do r2 = (com.google.assistant.p3886c.C50818do) r2
            r0.getClass()
            r2.f132316m = r0
            int r0 = r2.f132304a
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.f132304a = r0
            long r4 = r11.f152213h
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r2 = r0.f132304a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r0.f132304a = r2
            r0.f132318o = r4
            com.google.android.libraries.f.a r0 = r10.f325922c
            long r4 = r0.mo26870b()
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r2 = r0.f132304a
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r0.f132304a = r2
            r0.f132317n = r4
            com.google.assistant.c.ct r0 = com.google.assistant.p3886c.C50796ct.f132223c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.cs r0 = (com.google.assistant.p3886c.C50795cs) r0
            long r4 = r10.mo103291a(r11)
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.google.assistant.c.ct r11 = (com.google.assistant.p3886c.C50796ct) r11
            int r2 = r11.f132225a
            r2 = r2 | r3
            r11.f132225a = r2
            r11.f132226b = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.assistant.c.do r11 = (com.google.assistant.p3886c.C50818do) r11
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.c.ct r0 = (com.google.assistant.p3886c.C50796ct) r0
            r0.getClass()
            r11.f132320q = r0
            int r0 = r11.f132304a
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r2
            r11.f132304a = r0
            com.google.android.apps.gsa.search.core.i.t r11 = r10.f325921b
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247657lL
            boolean r11 = r11.mo79746e(r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            int r2 = r0.f132304a
            r3 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r3
            r0.f132304a = r2
            r0.f132321r = r11
            com.google.protobuf.bv r11 = r1.build()
            com.google.assistant.c.do r11 = (com.google.assistant.p3886c.C50818do) r11
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            return r11
        L_0x0265:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.p8766g.C117414r.mo103292d(com.google.bv.d.b.c.i):j$.util.Optional");
    }

    /* renamed from: e */
    public boolean mo103285e(Object obj) {
        return (obj instanceof C57017i) && (((C57017i) obj).f152206a & 512) != 0;
    }

    /* renamed from: f */
    public abstract Optional mo103293f(C57017i iVar);

    /* renamed from: g */
    public abstract Optional mo103294g(C57017i iVar);

    /* renamed from: h */
    public abstract Optional mo103295h(C57017i iVar);
}
