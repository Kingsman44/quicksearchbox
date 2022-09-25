package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ij */
/* compiled from: PG */
public final class C108429ij {

    /* renamed from: c */
    private static final C59071e f301588c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.ij");

    /* renamed from: a */
    public final C91189au f301589a;

    /* renamed from: b */
    public final C86124t f301590b;

    /* renamed from: d */
    private final PackageManager f301591d;

    /* renamed from: e */
    private final C60888db f301592e;

    /* renamed from: f */
    private final C68214a f301593f;

    /* renamed from: g */
    private final C21370a f301594g;

    /* renamed from: h */
    private final C87571n f301595h;

    public C108429ij(PackageManager packageManager, C91189au auVar, C60888db dbVar, C68214a aVar, C21370a aVar2, C87571n nVar, C86124t tVar) {
        this.f301591d = packageManager;
        this.f301589a = auVar;
        this.f301592e = dbVar;
        this.f301593f = aVar;
        this.f301594g = aVar2;
        this.f301595h = nVar;
        this.f301590b = tVar;
    }

    /* renamed from: a */
    public final C108390gy mo96871a(int i, String str, String str2) {
        if (C108251bv.m179920e(i)) {
            return new C108389gx(i, str, str2, this.f301590b);
        }
        return new C108390gy(i, str, str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.hp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v122, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.il} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.hp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.il} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.il} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v171, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.il} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v172, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.il} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v173, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.il} */
    /* JADX WARNING: type inference failed for: r8v1, types: [com.google.android.apps.gsa.staticplugins.opa.chatui.ik, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        if (mo96873c(r0.getPackage()) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
        if ("ae-action".equals(r0.getData().getScheme()) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r1.f301591d.resolveActivity(r0, 0) != null) goto L_0x0105;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0351 A[SYNTHETIC, Splitter:B:168:0x0351] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo96872b(com.google.assistant.p3897e.p3921j.p3926e.C51986gl r19, com.google.android.apps.gsa.assistant.shared.l.e r20, p3186j$.util.Optional r21) {
        /*
            r18 = this;
            r1 = r18
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r0 = r19
            com.google.protobuf.cq r0 = r0.f136424b
            java.util.Iterator r4 = r0.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04ce
            java.lang.Object r0 = r4.next()
            r5 = r0
            com.google.assistant.e.j.e.gr r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51992gr) r5
            int r0 = r5.f136447a
            r0 = r0 & 32
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0134
            com.google.assistant.e.c.c.gh r0 = r5.f136453g
            if (r0 != 0) goto L_0x002f
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x002f:
            int r0 = r0.f133012b
            if (r0 != r7) goto L_0x0014
            com.google.assistant.e.c.c.gh r0 = r5.f136453g
            if (r0 != 0) goto L_0x0039
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0039:
            int r8 = r0.f133012b
            if (r8 != r7) goto L_0x0042
            java.lang.Object r0 = r0.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x0044
        L_0x0042:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0044:
            int r0 = r0.f132943a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00d0
            com.google.assistant.e.c.c.gh r0 = r5.f136453g
            if (r0 != 0) goto L_0x0050
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0050:
            int r8 = r0.f133012b
            if (r8 != r7) goto L_0x0059
            java.lang.Object r0 = r0.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x005b
        L_0x0059:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x005b:
            java.lang.String r0 = r0.f132949g
            android.content.Intent r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142325x(r0)
            java.lang.String r8 = r0.getDataString()
            java.lang.String r9 = "opa-android://send_feedback"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x006f
            goto L_0x0105
        L_0x006f:
            if (r8 == 0) goto L_0x0079
            java.lang.String r9 = "opa-android://launch_keyboard"
            boolean r9 = r8.startsWith(r9)
            if (r9 != 0) goto L_0x0105
        L_0x0079:
            com.google.android.apps.gsa.search.shared.h.n r9 = r1.f301595h
            boolean r8 = r9.mo81697i(r8)
            if (r8 != 0) goto L_0x0105
            android.content.ComponentName r8 = r0.getComponent()
            if (r8 == 0) goto L_0x0090
            android.content.ComponentName r8 = r0.getComponent()
            java.lang.String r8 = r8.getClassName()
            goto L_0x0092
        L_0x0090:
            java.lang.String r8 = ""
        L_0x0092:
            java.lang.String r9 = "com.google.android.apps.lens.lookalike.LookAlikeActivity"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00a4
            java.lang.String r8 = r0.getPackage()
            boolean r8 = r1.mo96873c(r8)
            if (r8 != 0) goto L_0x0105
        L_0x00a4:
            dagger.a r8 = r1.f301593f
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.libraries.lens.view.s.a r8 = (com.google.android.libraries.lens.view.p2162s.C27683a) r8
            boolean r8 = r8.mo33174a()
            if (r8 == 0) goto L_0x00c8
            android.net.Uri r8 = r0.getData()
            if (r8 == 0) goto L_0x00c8
            android.net.Uri r8 = r0.getData()
            java.lang.String r8 = r8.getScheme()
            java.lang.String r9 = "ae-action"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0105
        L_0x00c8:
            android.content.pm.PackageManager r8 = r1.f301591d
            android.content.pm.ResolveInfo r0 = r8.resolveActivity(r0, r6)
            if (r0 != 0) goto L_0x0105
        L_0x00d0:
            int r0 = r5.f136447a
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L_0x0105
            com.google.assistant.e.c.c.gh r0 = r5.f136453g
            if (r0 != 0) goto L_0x00dd
            com.google.assistant.e.c.c.gh r8 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            goto L_0x00de
        L_0x00dd:
            r8 = r0
        L_0x00de:
            int r9 = r8.f133012b
            if (r9 != r7) goto L_0x00e7
            java.lang.Object r8 = r8.f133013c
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            goto L_0x00e9
        L_0x00e7:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00e9:
            int r8 = r8.f132943a
            r8 = r8 & r7
            if (r8 == 0) goto L_0x0014
            if (r0 != 0) goto L_0x00f2
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x00f2:
            int r8 = r0.f133012b
            if (r8 != r7) goto L_0x00fb
            java.lang.Object r0 = r0.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x00fd
        L_0x00fb:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00fd:
            java.lang.String r0 = r0.f132944b
            boolean r0 = r1.mo96873c(r0)
            if (r0 == 0) goto L_0x0014
        L_0x0105:
            com.google.assistant.e.c.c.gh r0 = r5.f136453g
            if (r0 != 0) goto L_0x010c
            com.google.assistant.e.c.c.gh r8 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            goto L_0x010d
        L_0x010c:
            r8 = r0
        L_0x010d:
            int r9 = r8.f133012b
            if (r9 != r7) goto L_0x0116
            java.lang.Object r8 = r8.f133013c
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            goto L_0x0118
        L_0x0116:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0118:
            int r8 = r8.f132943a
            r8 = r8 & r7
            if (r8 == 0) goto L_0x0134
            if (r0 != 0) goto L_0x0121
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0121:
            int r8 = r0.f133012b
            if (r8 != r7) goto L_0x012a
            java.lang.Object r0 = r0.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x012c
        L_0x012a:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x012c:
            java.lang.String r0 = r0.f132944b
            boolean r0 = r1.mo96873c(r0)
            if (r0 == 0) goto L_0x0014
        L_0x0134:
            int r0 = r5.f136447a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r5.f136455i
            boolean r0 = r3.add(r0)
            if (r0 == 0) goto L_0x0014
        L_0x0142:
            int r0 = r5.f136447a
            r8 = r0 & 2
            if (r8 == 0) goto L_0x015e
            com.google.android.apps.gsa.staticplugins.opa.chatui.dz r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.dz
            int r8 = r5.f136450d
            java.lang.String r9 = r5.f136451e
            com.google.assistant.e.c.c.dc r10 = r5.f136452f
            if (r10 != 0) goto L_0x0154
            com.google.assistant.e.c.c.dc r10 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0154:
            java.lang.String r10 = r10.f132817c
            java.lang.String r11 = r5.f136449c
            r0.<init>(r8, r9, r10, r11)
        L_0x015b:
            r8 = r0
            goto L_0x01da
        L_0x015e:
            r8 = r0 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018a
            com.google.android.apps.gsa.staticplugins.opa.chatui.hp r8 = new com.google.android.apps.gsa.staticplugins.opa.chatui.hp
            int r10 = r5.f136450d
            java.lang.String r11 = r5.f136451e
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0175
            com.google.assistant.e.c.c.dc r0 = r5.f136452f
            if (r0 != 0) goto L_0x0172
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0172:
            java.lang.String r0 = r0.f132817c
            goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            r12 = r0
            com.google.protos.f.u.f r0 = r5.f136459m
            if (r0 != 0) goto L_0x017d
            com.google.protos.f.u.f r0 = com.google.protos.p4985f.p5042u.C65344f.f176708e
        L_0x017d:
            r13 = r0
            com.google.assistant.e.c.c.gh r0 = r5.f136453g
            if (r0 != 0) goto L_0x0184
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0184:
            r14 = r0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x01da
        L_0x018a:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x01a8
            int r0 = r5.f136450d
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108251bv.m179920e(r0)
            if (r0 == 0) goto L_0x01a0
            com.google.android.apps.gsa.staticplugins.opa.chatui.bq r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bq
            android.content.pm.PackageManager r8 = r1.f301591d
            com.google.android.apps.gsa.search.core.i.t r9 = r1.f301590b
            r0.<init>(r8, r5, r9)
            goto L_0x015b
        L_0x01a0:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bp r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bp
            android.content.pm.PackageManager r8 = r1.f301591d
            r0.<init>(r8, r5)
            goto L_0x015b
        L_0x01a8:
            com.google.assistant.e.j.e.ib r0 = r5.f136461o
            if (r0 != 0) goto L_0x01ae
            com.google.assistant.e.j.e.ib r0 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a
        L_0x01ae:
            com.google.protobuf.bt r8 = com.google.protos.p4985f.p5042u.C65358t.f177747d
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)
            r0.mo58887l(r8)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r8 = r8.f169971d
            boolean r0 = r0.mo58857o(r8)
            if (r0 == 0) goto L_0x01c9
            com.google.android.apps.gsa.staticplugins.opa.chatui.bp r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.bp
            android.content.pm.PackageManager r8 = r1.f301591d
            r0.<init>(r8, r5)
            goto L_0x015b
        L_0x01c9:
            int r0 = r5.f136450d
            java.lang.String r8 = r5.f136451e
            com.google.assistant.e.c.c.dc r9 = r5.f136452f
            if (r9 != 0) goto L_0x01d3
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01d3:
            java.lang.String r9 = r9.f132817c
            com.google.android.apps.gsa.staticplugins.opa.chatui.gy r0 = r1.mo96871a(r0, r8, r9)
            goto L_0x015b
        L_0x01da:
            com.google.assistant.e.j.e.ib r0 = r5.f136461o
            if (r0 != 0) goto L_0x01e0
            com.google.assistant.e.j.e.ib r0 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a
        L_0x01e0:
            com.google.protobuf.bt r9 = com.google.protos.p4985f.p5042u.C65342d.f176700f
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r0.mo58887l(r9)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r9 = r9.f169971d
            boolean r0 = r0.mo58857o(r9)
            if (r0 == 0) goto L_0x0217
            com.google.assistant.e.j.e.ib r0 = r5.f136461o
            if (r0 != 0) goto L_0x01f9
            com.google.assistant.e.j.e.ib r0 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a
        L_0x01f9:
            com.google.protobuf.bt r9 = com.google.protos.p4985f.p5042u.C65342d.f176700f
            com.google.protobuf.bt r9 = com.google.protobuf.C62942bv.checkIsLite(r9)
            r0.mo58887l(r9)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r10 = r9.f169971d
            java.lang.Object r0 = r0.mo58854l(r10)
            if (r0 != 0) goto L_0x020f
            java.lang.Object r0 = r9.f169969b
            goto L_0x0213
        L_0x020f:
            java.lang.Object r0 = r9.mo58889c(r0)
        L_0x0213:
            com.google.protos.f.u.d r0 = (com.google.protos.p4985f.p5042u.C65342d) r0
            r8.f301596A = r0
        L_0x0217:
            r9 = r20
            r8.f301604k = r9
            int r0 = r5.f136447a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = r5.f136451e
            boolean r11 = r5.f136458l
            com.google.assistant.e.j.e.gf r12 = r5.f136460n
            if (r12 != 0) goto L_0x022b
            com.google.assistant.e.j.e.gf r12 = com.google.assistant.p3897e.p3921j.p3926e.C51980gf.f136403g
        L_0x022b:
            com.google.android.libraries.logging.j r13 = r8.f301597d
            com.google.protobuf.bt r14 = com.google.assistant.p3745ab.C48310di.f124940j
            com.google.assistant.ab.di r15 = com.google.assistant.p3745ab.C48310di.f124939i
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.assistant.ab.de r15 = (com.google.assistant.p3745ab.C48306de) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r6 = r15.instance
            com.google.assistant.ab.di r6 = (com.google.assistant.p3745ab.C48310di) r6
            r6.f124946e = r7
            int r10 = r6.f124942a
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r6.f124942a = r10
            int r6 = r12.f136406b
            int r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49522af.m85575c(r6)
            if (r6 != 0) goto L_0x024f
            r6 = 2
        L_0x024f:
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.assistant.ab.di r10 = (com.google.assistant.p3745ab.C48310di) r10
            int r6 = com.google.assistant.p3838ao.p3839a.p3845e.C49522af.m85574b(r6)
            r10.f124945d = r6
            int r6 = r10.f124942a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r10.f124942a = r6
            java.lang.String r6 = r12.f136407c
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.assistant.ab.di r10 = (com.google.assistant.p3745ab.C48310di) r10
            r6.getClass()
            int r7 = r10.f124942a
            r7 = r7 | 256(0x100, float:3.59E-43)
            r10.f124942a = r7
            r10.f124944c = r6
            long r6 = r12.f136408d
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.assistant.ab.di r10 = (com.google.assistant.p3745ab.C48310di) r10
            r17 = r3
            int r3 = r10.f124942a
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r10.f124942a = r3
            r10.f124947f = r6
            int r3 = r12.f136410f
            com.google.protos.f.u.h r3 = com.google.protos.p4985f.p5042u.C65346h.m96672b(r3)
            if (r3 != 0) goto L_0x0293
            com.google.protos.f.u.h r3 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
        L_0x0293:
            com.google.protos.f.u.h r6 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x02ed
            com.google.assistant.ab.dg r3 = com.google.assistant.p3745ab.C48308dg.f124933d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.ab.df r3 = (com.google.assistant.p3745ab.C48307df) r3
            int r6 = r12.f136410f
            com.google.protos.f.u.h r6 = com.google.protos.p4985f.p5042u.C65346h.m96672b(r6)
            if (r6 != 0) goto L_0x02ad
            com.google.protos.f.u.h r6 = com.google.protos.p4985f.p5042u.C65346h.SUGGEST_EXPERIMENT_UNKNOWN
        L_0x02ad:
            java.lang.String r6 = r6.name()
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.ab.dg r7 = (com.google.assistant.p3745ab.C48308dg) r7
            r6.getClass()
            int r10 = r7.f124935a
            r16 = 1
            r10 = r10 | 1
            r7.f124935a = r10
            r7.f124936b = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.ab.dg r6 = (com.google.assistant.p3745ab.C48308dg) r6
            int r7 = r6.f124935a
            r10 = 2
            r7 = r7 | r10
            r6.f124935a = r7
            r6.f124937c = r11
            r15.copyOnWrite()
            com.google.protobuf.bv r6 = r15.instance
            com.google.assistant.ab.di r6 = (com.google.assistant.p3745ab.C48310di) r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.ab.dg r3 = (com.google.assistant.p3745ab.C48308dg) r3
            r3.getClass()
            r6.f124949h = r3
            int r3 = r6.f124942a
            r7 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r7
            r6.f124942a = r3
        L_0x02ed:
            java.lang.String r3 = r12.f136409e
            boolean r3 = r3.isEmpty()
            r6 = 262144(0x40000, float:3.67342E-40)
            if (r3 == 0) goto L_0x0319
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.ab.di r3 = (com.google.assistant.p3745ab.C48310di) r3
            int r7 = r3.f124942a
            r6 = r6 | r7
            r3.f124942a = r6
            r7 = 0
            r3.f124948g = r7
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.ab.di r3 = (com.google.assistant.p3745ab.C48310di) r3
            r0.getClass()
            int r6 = r3.f124942a
            r10 = 1
            r6 = r6 | r10
            r3.f124942a = r6
            r3.f124943b = r0
            goto L_0x033c
        L_0x0319:
            r7 = 0
            r10 = 1
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.assistant.ab.di r0 = (com.google.assistant.p3745ab.C48310di) r0
            int r3 = r0.f124942a
            r3 = r3 | r6
            r0.f124942a = r3
            r0.f124948g = r10
            java.lang.String r0 = r12.f136409e
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.assistant.ab.di r3 = (com.google.assistant.p3745ab.C48310di) r3
            r0.getClass()
            int r6 = r3.f124942a
            r6 = r6 | r10
            r3.f124942a = r6
            r3.f124943b = r0
        L_0x033c:
            com.google.protobuf.bv r0 = r15.build()
            com.google.assistant.ab.di r0 = (com.google.assistant.p3745ab.C48310di) r0
            com.google.common.o.aqp r3 = r13.f76974b
            r3.mo58885m(r14, r0)
            goto L_0x034b
        L_0x0348:
            r17 = r3
            r7 = 0
        L_0x034b:
            int r0 = r5.f136447a
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0379
            com.google.android.libraries.logging.j r0 = r8.f301597d     // Catch:{ ct -> 0x036b }
            com.google.assistant.e.j.ka r3 = r5.f136457k     // Catch:{ ct -> 0x036b }
            if (r3 != 0) goto L_0x0359
            com.google.assistant.e.j.ka r3 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x036b }
        L_0x0359:
            com.google.protobuf.z r3 = r3.f137061c     // Catch:{ ct -> 0x036b }
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x036b }
            com.google.protos.ai.b.j r10 = com.google.protos.p4816ai.p4818b.C63204j.f170749e     // Catch:{ ct -> 0x036b }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x036b }
            com.google.protos.ai.b.j r3 = (com.google.protos.p4816ai.p4818b.C63204j) r3     // Catch:{ ct -> 0x036b }
            r0.mo33792f(r3)     // Catch:{ ct -> 0x036b }
            goto L_0x0379
        L_0x036b:
            r0 = move-exception
            com.google.common.f.e r3 = f301588c
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r6 = "Failed to parse feature tree ref from suggestion proto"
            r10 = 24051(0x5df3, float:3.3703E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r10)).mo56386p(r6)
        L_0x0379:
            boolean r0 = r5.f136458l
            if (r0 == 0) goto L_0x0386
            r3 = 1
            r8.f301614u = r3
            com.google.android.libraries.logging.j r0 = r8.f301597d
            r3 = 3
            r0.mo33794h(r3)
        L_0x0386:
            com.google.assistant.e.c.c.dc r0 = r5.f136452f
            if (r0 != 0) goto L_0x038c
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x038c:
            int r0 = r0.f132815a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x039c
            com.google.assistant.e.c.c.dc r0 = r5.f136452f
            if (r0 != 0) goto L_0x0398
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0398:
            java.lang.String r0 = r0.f132822h
            r8.f301601h = r0
        L_0x039c:
            int r0 = r5.f136447a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x03aa
            com.google.assistant.e.j.e.gt r0 = r5.f136454h
            if (r0 != 0) goto L_0x03a8
            com.google.assistant.e.j.e.gt r0 = com.google.assistant.p3897e.p3921j.p3926e.C51994gt.f136465g
        L_0x03a8:
            r8.f301606m = r0
        L_0x03aa:
            com.google.assistant.e.j.e.gq r0 = r5.f136462p
            if (r0 != 0) goto L_0x03b0
            com.google.assistant.e.j.e.gq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
        L_0x03b0:
            int r0 = r0.f136435a
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x03c4
            com.google.assistant.e.j.e.gq r0 = r5.f136462p
            if (r0 != 0) goto L_0x03bc
            com.google.assistant.e.j.e.gq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
        L_0x03bc:
            int r0 = r0.f136436b
            j$.util.OptionalInt r0 = p3186j$.util.OptionalInt.m71640of(r0)
            r8.f301607n = r0
        L_0x03c4:
            com.google.assistant.e.j.e.gq r0 = r5.f136462p
            if (r0 != 0) goto L_0x03cb
            com.google.assistant.e.j.e.gq r3 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
            goto L_0x03cc
        L_0x03cb:
            r3 = r0
        L_0x03cc:
            int r3 = r3.f136435a
            r6 = 2
            r3 = r3 & r6
            if (r3 == 0) goto L_0x03de
            if (r0 != 0) goto L_0x03d6
            com.google.assistant.e.j.e.gq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
        L_0x03d6:
            int r0 = r0.f136437c
            j$.util.OptionalInt r0 = p3186j$.util.OptionalInt.m71640of(r0)
            r8.f301608o = r0
        L_0x03de:
            com.google.assistant.e.j.e.gq r0 = r5.f136462p
            if (r0 != 0) goto L_0x03e5
            com.google.assistant.e.j.e.gq r3 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
            goto L_0x03e6
        L_0x03e5:
            r3 = r0
        L_0x03e6:
            int r3 = r3.f136435a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x03f8
            if (r0 != 0) goto L_0x03f0
            com.google.assistant.e.j.e.gq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
        L_0x03f0:
            int r0 = r0.f136438d
            j$.util.OptionalInt r0 = p3186j$.util.OptionalInt.m71640of(r0)
            r8.f301609p = r0
        L_0x03f8:
            com.google.assistant.e.j.e.gq r0 = r5.f136462p
            if (r0 != 0) goto L_0x03ff
            com.google.assistant.e.j.e.gq r3 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
            goto L_0x0400
        L_0x03ff:
            r3 = r0
        L_0x0400:
            int r3 = r3.f136435a
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0412
            if (r0 != 0) goto L_0x040a
            com.google.assistant.e.j.e.gq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
        L_0x040a:
            int r0 = r0.f136441g
            j$.util.OptionalInt r0 = p3186j$.util.OptionalInt.m71640of(r0)
            r8.f301610q = r0
        L_0x0412:
            com.google.assistant.e.j.e.gq r0 = r5.f136462p
            if (r0 != 0) goto L_0x0419
            com.google.assistant.e.j.e.gq r3 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
            goto L_0x041a
        L_0x0419:
            r3 = r0
        L_0x041a:
            int r3 = r3.f136435a
            r3 = r3 & 64
            if (r3 == 0) goto L_0x0449
            if (r0 != 0) goto L_0x0427
            com.google.assistant.e.j.e.gq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k     // Catch:{ ct -> 0x0425 }
            goto L_0x0427
        L_0x0425:
            r0 = move-exception
            goto L_0x043c
        L_0x0427:
            com.google.protobuf.z r0 = r0.f136442h     // Catch:{ ct -> 0x0425 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0425 }
            com.google.at.h.b.a.r r6 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f     // Catch:{ ct -> 0x0425 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0425 }
            com.google.at.h.b.a.r r0 = (com.google.p4017at.p4060h.p4068b.p4069a.C54201r) r0     // Catch:{ ct -> 0x0425 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x0425 }
            r8.f301611r = r0     // Catch:{ ct -> 0x0425 }
            goto L_0x0449
        L_0x043c:
            com.google.common.f.e r3 = f301588c
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r6 = "Couldn't parse the rendered card."
            r10 = 24050(0x5df2, float:3.3701E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r10)).mo56386p(r6)
        L_0x0449:
            com.google.assistant.e.j.e.gq r0 = r5.f136462p
            if (r0 != 0) goto L_0x0450
            com.google.assistant.e.j.e.gq r3 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
            goto L_0x0451
        L_0x0450:
            r3 = r0
        L_0x0451:
            int r3 = r3.f136435a
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0461
            if (r0 != 0) goto L_0x045c
            com.google.assistant.e.j.e.gq r3 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
            goto L_0x045d
        L_0x045c:
            r3 = r0
        L_0x045d:
            boolean r3 = r3.f136443i
            r8.f301612s = r3
        L_0x0461:
            if (r0 != 0) goto L_0x0466
            com.google.assistant.e.j.e.gq r3 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
            goto L_0x0467
        L_0x0466:
            r3 = r0
        L_0x0467:
            int r3 = r3.f136435a
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0475
            if (r0 != 0) goto L_0x0471
            com.google.assistant.e.j.e.gq r0 = com.google.assistant.p3897e.p3921j.p3926e.C51991gq.f136433k
        L_0x0471:
            java.lang.String r0 = r0.f136444j
            r8.f301602i = r0
        L_0x0475:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ii r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ii
            r0.<init>(r8)
            r3 = r21
            r3.ifPresent(r0)
            int r0 = r5.f136447a
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x04c1
            com.google.protobuf.ba r0 = new com.google.protobuf.ba
            r0.<init>()
            com.google.protobuf.bt r6 = com.google.protos.p4985f.p5042u.C65340b.f176697b
            r0.mo58832e(r6)
            com.google.assistant.e.j.e.ib r5 = r5.f136461o     // Catch:{ ct -> 0x04b3 }
            if (r5 != 0) goto L_0x0495
            com.google.assistant.e.j.e.ib r5 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a     // Catch:{ ct -> 0x04b3 }
        L_0x0495:
            byte[] r5 = r5.toByteArray()     // Catch:{ ct -> 0x04b3 }
            com.google.assistant.e.j.e.ib r6 = com.google.assistant.p3897e.p3921j.p3926e.C52030ib.f136561a     // Catch:{ ct -> 0x04b3 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r5, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x04b3 }
            com.google.assistant.e.j.e.ib r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52030ib) r0     // Catch:{ ct -> 0x04b3 }
            com.google.protobuf.bt r5 = com.google.protos.p4985f.p5042u.C65340b.f176697b     // Catch:{ ct -> 0x04b3 }
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)     // Catch:{ ct -> 0x04b3 }
            r0.mo58887l(r5)     // Catch:{ ct -> 0x04b3 }
            com.google.protobuf.bf r0 = r0.f169962ag     // Catch:{ ct -> 0x04b3 }
            com.google.protobuf.bs r5 = r5.f169971d     // Catch:{ ct -> 0x04b3 }
            boolean r6 = r0.mo58857o(r5)     // Catch:{ ct -> 0x04b3 }
            goto L_0x04c2
        L_0x04b3:
            r0 = move-exception
            com.google.common.f.e r5 = f301588c
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "Fail to parse ClarificationData"
            r10 = 24052(0x5df4, float:3.3704E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r10)).mo56386p(r6)
        L_0x04c1:
            r6 = 0
        L_0x04c2:
            r8.f301618y = r6
            r1.mo96874d(r8)
            r2.add(r8)
            r3 = r17
            goto L_0x0014
        L_0x04ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij.mo96872b(com.google.assistant.e.j.e.gl, com.google.android.apps.gsa.assistant.shared.l.e, j$.util.Optional):java.util.List");
    }

    /* renamed from: c */
    public final boolean mo96873c(String str) {
        try {
            ApplicationInfo applicationInfo = this.f301591d.getApplicationInfo(str, 0);
            if (applicationInfo == null || !applicationInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: d */
    public final void mo96874d(C108430ik ikVar) {
        C21370a aVar = this.f301594g;
        C86124t tVar = this.f301590b;
        ikVar.f301599f = aVar;
        ikVar.f301600g = tVar;
        C108431il ilVar = (C108431il) ikVar;
        String b = ilVar.mo96697b();
        if (!TextUtils.isEmpty(b)) {
            C59417y f = C59417y.m92320f(new C108427ih(this, Uri.parse(b)), 3, this.f301592e);
            C91189au auVar = this.f301589a;
            ilVar.f301623c = f;
            ilVar.f301620B = auVar;
        }
    }
}
