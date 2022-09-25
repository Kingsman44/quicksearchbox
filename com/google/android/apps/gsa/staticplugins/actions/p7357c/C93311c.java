package com.google.android.apps.gsa.staticplugins.actions.p7357c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.gsa.search.shared.actions.C87425m;
import com.google.android.apps.gsa.search.shared.actions.modular.C87426a;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.C87494p;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.common.p4522b.C58336bg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58724pq;
import com.google.p4152bb.p4153a.C55122gr;
import com.google.p4152bb.p4153a.C55210jy;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55359pl;
import com.google.p4152bb.p4153a.C55360pm;
import com.google.p4152bb.p4153a.C55361pn;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.c.c */
/* compiled from: PG */
public class C93311c {

    /* renamed from: a */
    protected final Context f260211a;

    /* renamed from: b */
    protected final PackageManager f260212b;

    /* renamed from: c */
    protected final C87425m f260213c;

    /* renamed from: d */
    protected final C87449m f260214d;

    /* renamed from: e */
    protected final boolean f260215e;

    public C93311c(Context context, PackageManager packageManager, C87449m mVar, boolean z, boolean z2) {
        this.f260211a = context;
        this.f260212b = packageManager;
        this.f260213c = new C87425m(packageManager, context, z2);
        this.f260214d = mVar;
        this.f260215e = z;
    }

    /* renamed from: c */
    protected static MatchingProviderInfo m153447c(C55240la laVar) {
        C55361pn e = m153448e(laVar);
        return new MatchingProviderInfo(C58597ky.m90212c(e), e, false);
    }

    /* renamed from: e */
    protected static C55361pn m153448e(C55240la laVar) {
        C55360pm pmVar = (C55360pm) C55361pn.f145866g.createBuilder();
        pmVar.mo58885m(C55359pl.f145864b, C55359pl.f145863a);
        int i = laVar.f145452b;
        pmVar.copyOnWrite();
        C55361pn pnVar = (C55361pn) pmVar.instance;
        pnVar.f145868a |= 2;
        pnVar.f145870c = i;
        return (C55361pn) pmVar.build();
    }

    /* renamed from: g */
    protected static boolean m153449g(MatchingProviderInfo matchingProviderInfo, String str, boolean z) {
        C55361pn b = C87494p.m142025b(matchingProviderInfo.f236270h.f236312a, str);
        if (b == null) {
            return false;
        }
        if (z) {
            matchingProviderInfo.mo81439i(b, true);
        } else {
            matchingProviderInfo.mo81439i(b, false);
        }
        return true;
    }

    /* renamed from: a */
    public final Pair mo87628a(List list, C87448l lVar, String str) {
        C58485gu F = C58485gu.m89836F(new C58336bg(new C93310b(), C58701ou.f156429a), list);
        HashMap hashMap = new HashMap();
        int i = ((C58724pq) F).f156474d;
        C55361pn pnVar = null;
        C55240la laVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C55240la laVar2 = (C55240la) F.get(i3);
            if (!hashMap.isEmpty() && laVar2.f145456f > i2) {
                break;
            }
            MatchingProviderInfo d = mo87630d(lVar, laVar2);
            if (!d.mo81435e()) {
                if (laVar == null) {
                    if (str == null) {
                        if (d.f236270h.mo81484i()) {
                            pnVar = d.mo81433d();
                        }
                        laVar = laVar2;
                    } else {
                        C55361pn b = C87494p.m142025b(d.f236270h.f236312a, str);
                        if (b != null) {
                            laVar = laVar2;
                            pnVar = b;
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    i2 = laVar2.f145456f;
                    if (!d.mo81436f()) {
                        if (d.f236270h.mo81484i()) {
                            C55361pn d2 = d.mo81433d();
                            d2.getClass();
                            C55122gr a = C55122gr.m87596a(d2.f145873f);
                            if (a == null) {
                                a = C55122gr.UNKNOWN_DEVICE;
                            }
                            if (a == C55122gr.COMPANION) {
                            }
                        }
                    }
                    return new Pair(laVar, d);
                }
                if (str == null && pnVar != null && (!d.f236270h.mo81484i() || !TextUtils.equals(C87494p.m142026c(pnVar), C87494p.m142026c(d.mo81433d())))) {
                    pnVar = null;
                }
                for (C55361pn pnVar2 : d.f236270h.f236312a) {
                    String c = C87494p.m142026c(pnVar2);
                    if (!hashMap.containsKey(c) && c != null) {
                        hashMap.put(c, pnVar2);
                    }
                }
            }
        }
        return new Pair(laVar, new MatchingProviderInfo(C58597ky.m90211b(hashMap.values()), pnVar, false));
    }

    /* renamed from: b */
    public final ModularActionMatchingProviderInfo mo87629b(C87426a aVar, C55305nl nlVar, boolean z) {
        String f;
        String str = null;
        if (nlVar.f145692b.size() == 0) {
            aVar.mo81210Q().mo81395a("No execute execution info", nlVar, (Throwable) null);
        }
        String aa = aVar.mo81221aa();
        boolean z2 = false;
        if (aa != null) {
            str = aa;
        } else {
            ModularActionMatchingProviderInfo a = aVar.mo81220a();
            if (a != null && a.f236270h.mo81484i()) {
                str = C87494p.m142026c(a.mo81433d());
                z2 = a.mo81437g();
            }
        }
        Pair a2 = mo87628a(nlVar.f145692b, aVar, str);
        if (str == null && (f = mo87631f(aVar, (MatchingProviderInfo) a2.second, z)) != null) {
            z2 = ((MatchingProviderInfo) a2.second).mo81437g();
            if (!((MatchingProviderInfo) a2.second).mo81436f()) {
                a2 = mo87628a(nlVar.f145692b, aVar, f);
            }
        }
        C55240la laVar = (C55240la) a2.first;
        MatchingProviderInfo matchingProviderInfo = (MatchingProviderInfo) a2.second;
        if (z2) {
            matchingProviderInfo.mo81439i(matchingProviderInfo.mo81433d(), true);
        }
        C93309a aVar2 = new C93309a(aVar, matchingProviderInfo, aVar);
        if (str == null && matchingProviderInfo.f236270h.mo81484i()) {
            str = C87494p.m142026c(matchingProviderInfo.mo81433d());
        }
        C55240la laVar2 = (C55240la) mo87628a(nlVar.f145693c, aVar2, str).first;
        C55244le leVar = nlVar.f145696f;
        if (leVar == null) {
            leVar = C55244le.f145466h;
        }
        C55240la laVar3 = (C55240la) mo87628a(leVar.f145470c, aVar2, str).first;
        C55244le leVar2 = nlVar.f145694d;
        if (leVar2 == null) {
            leVar2 = C55244le.f145466h;
        }
        C55240la laVar4 = (C55240la) mo87628a(leVar2.f145470c, aVar2, str).first;
        C55244le leVar3 = nlVar.f145697g;
        if (leVar3 == null) {
            leVar3 = C55244le.f145466h;
        }
        C55240la laVar5 = (C55240la) mo87628a(leVar3.f145470c, aVar2, str).first;
        C55244le leVar4 = nlVar.f145695e;
        if (leVar4 == null) {
            leVar4 = C55244le.f145466h;
        }
        return new ModularActionMatchingProviderInfo(matchingProviderInfo, laVar, laVar2, laVar3, laVar4, laVar5, (C55240la) mo87628a(leVar4.f145470c, aVar2, str).first);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo mo87630d(com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l r11, com.google.p4152bb.p4153a.C55240la r12) {
        /*
            r10 = this;
            com.google.protobuf.cq r0 = r12.f145459i
            boolean r0 = r11.mo81228ah(r0)
            if (r0 != 0) goto L_0x000d
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r11
        L_0x000d:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55156hy.f145198h
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r1 = r12.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00a6
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "android.media.browse.MediaBrowserService"
            r0.<init>(r4)
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55156hy.f145198h
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r12.mo58887l(r4)
            com.google.protobuf.bf r5 = r12.f169962ag
            com.google.protobuf.bs r6 = r4.f169971d
            java.lang.Object r5 = r5.mo58854l(r6)
            if (r5 != 0) goto L_0x0040
            java.lang.Object r4 = r4.f169969b
            goto L_0x0044
        L_0x0040:
            java.lang.Object r4 = r4.mo58889c(r5)
        L_0x0044:
            com.google.bb.a.hy r4 = (com.google.p4152bb.p4153a.C55156hy) r4
            int r5 = r4.f145200a
            r5 = r5 & r3
            if (r5 == 0) goto L_0x0071
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r5 = r10.f260214d     // Catch:{ IllegalArgumentException -> 0x0062 }
            com.google.bb.a.he r6 = r4.f145203d     // Catch:{ IllegalArgumentException -> 0x0062 }
            if (r6 != 0) goto L_0x0053
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j     // Catch:{ IllegalArgumentException -> 0x0062 }
        L_0x0053:
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r5 = r5.mo81378a(r6, r11, r3)     // Catch:{ IllegalArgumentException -> 0x0062 }
            boolean r6 = r5.mo81247f()     // Catch:{ IllegalArgumentException -> 0x0062 }
            if (r6 == 0) goto L_0x0071
            java.lang.String r1 = r5.mo81245d()     // Catch:{ IllegalArgumentException -> 0x0062 }
            goto L_0x0073
        L_0x0062:
            r5 = move-exception
            com.google.android.apps.gsa.search.shared.actions.modular.f r11 = r11.mo81210Q()
            com.google.bb.a.he r6 = r4.f145203d
            if (r6 != 0) goto L_0x006d
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x006d:
            r11.mo81400d(r3, r6, r5)
            goto L_0x0073
        L_0x0071:
            java.lang.String r1 = ""
        L_0x0073:
            if (r1 != 0) goto L_0x007a
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            goto L_0x00a5
        L_0x007a:
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x009f
            r0.setPackage(r1)
            android.content.pm.PackageManager r11 = r10.f260212b     // Catch:{ NameNotFoundException -> 0x009a }
            android.content.pm.PackageInfo r11 = r11.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x009a }
            int r1 = r4.f145200a     // Catch:{ NameNotFoundException -> 0x009a }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x009f
            int r11 = r11.versionCode     // Catch:{ NameNotFoundException -> 0x009a }
            int r1 = r4.f145204e     // Catch:{ NameNotFoundException -> 0x009a }
            if (r11 >= r1) goto L_0x009f
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()     // Catch:{ NameNotFoundException -> 0x009a }
            goto L_0x00a5
        L_0x009a:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            goto L_0x00a5
        L_0x009f:
            android.content.Context r11 = r10.f260211a
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142017e(r11, r0, r12)
        L_0x00a5:
            return r11
        L_0x00a6:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145313A
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r4 = r12.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r4.mo58857o(r0)
            if (r0 == 0) goto L_0x00d6
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145313A
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r4 = r12.f169962ag
            com.google.protobuf.bs r5 = r0.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x00cf
            java.lang.Object r0 = r0.f169969b
            goto L_0x00d3
        L_0x00cf:
            java.lang.Object r0 = r0.mo58889c(r4)
        L_0x00d3:
            com.google.bb.a.jw r0 = (com.google.p4152bb.p4153a.C55208jw) r0
            goto L_0x0105
        L_0x00d6:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r4 = r12.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r4.mo58857o(r0)
            if (r0 == 0) goto L_0x01cf
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r12.mo58887l(r0)
            com.google.protobuf.bf r4 = r12.f169962ag
            com.google.protobuf.bs r5 = r0.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x00ff
            java.lang.Object r0 = r0.f169969b
            goto L_0x0103
        L_0x00ff:
            java.lang.Object r0 = r0.mo58889c(r4)
        L_0x0103:
            com.google.bb.a.jw r0 = (com.google.p4152bb.p4153a.C55208jw) r0
        L_0x0105:
            boolean r4 = r0.f145335r
            if (r4 != 0) goto L_0x01ca
            boolean r4 = r0.f145331n
            if (r4 == 0) goto L_0x0117
            boolean r4 = r10.f260215e
            if (r4 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r11
        L_0x0117:
            com.google.android.apps.gsa.search.shared.actions.m r4 = r10.f260213c
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r5 = r10.f260214d
            android.content.Intent r4 = r4.mo81206a(r0, r11, r5)
            if (r4 == 0) goto L_0x01c5
            boolean r5 = r0.f145332o
            if (r5 == 0) goto L_0x012c
            android.content.Context r5 = r10.f260211a
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r12 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142017e(r5, r4, r12)
            goto L_0x0140
        L_0x012c:
            android.content.Context r5 = r10.f260211a
            boolean r6 = r0.f145340w
            android.content.Intent[] r9 = new android.content.Intent[r3]
            r9[r2] = r4
            r7 = 0
            java.lang.String r8 = ""
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r12
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r12 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142016d(r4, r5, r6, r7, r8, r9)
        L_0x0140:
            com.google.protobuf.cq r4 = r0.f145323f
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x01c4
            com.google.protobuf.cq r0 = r0.f145323f
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0153:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0182
            java.lang.Object r5 = r0.next()
            com.google.bb.a.he r5 = (com.google.p4152bb.p4153a.C55136he) r5
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.m r6 = r10.f260214d     // Catch:{ IllegalArgumentException -> 0x0175 }
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r6 = r6.mo81378a(r5, r11, r3)     // Catch:{ IllegalArgumentException -> 0x0175 }
            boolean r7 = r6.mo81247f()     // Catch:{ IllegalArgumentException -> 0x0175 }
            if (r7 == 0) goto L_0x0153
            java.lang.String r6 = r6.mo81245d()     // Catch:{ IllegalArgumentException -> 0x0175 }
            if (r6 == 0) goto L_0x0153
            r4.add(r6)     // Catch:{ IllegalArgumentException -> 0x0175 }
            goto L_0x0153
        L_0x0175:
            r12 = move-exception
            com.google.android.apps.gsa.search.shared.actions.modular.f r11 = r11.mo81210Q()
            r11.mo81400d(r3, r5, r12)
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r12 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            goto L_0x01be
        L_0x0182:
            com.google.bb.a.pn r11 = r12.mo81433d()
            com.google.android.apps.gsa.search.shared.actions.util.i r0 = r12.f236270h
            java.util.List r0 = r0.f236312a
            int r3 = r0.size()
            java.util.ArrayList r3 = com.google.common.p4522b.C58597ky.m90213d(r3)
            java.util.Iterator r5 = r0.iterator()
        L_0x0196:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01b4
            java.lang.Object r6 = r5.next()
            com.google.bb.a.pn r6 = (com.google.p4152bb.p4153a.C55361pn) r6
            java.lang.String r7 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142026c(r6)
            boolean r7 = r4.contains(r7)
            if (r7 != 0) goto L_0x01b0
            r3.add(r6)
            goto L_0x0196
        L_0x01b0:
            if (r6 != r11) goto L_0x0196
            r11 = r1
            goto L_0x0196
        L_0x01b4:
            int r0 = r0.size()
            int r1 = r3.size()
            if (r0 != r1) goto L_0x01bf
        L_0x01be:
            return r12
        L_0x01bf:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r12 = new com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo
            r12.<init>(r3, r11, r2)
        L_0x01c4:
            return r12
        L_0x01c5:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r11
        L_0x01ca:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = m153447c(r12)
            return r11
        L_0x01cf:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r11 = com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142014b()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7357c.C93311c.mo87630d(com.google.android.apps.gsa.search.shared.actions.modular.arguments.l, com.google.bb.a.la):com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo87631f(C87426a aVar, MatchingProviderInfo matchingProviderInfo, boolean z) {
        if (matchingProviderInfo.f236270h.mo81484i()) {
            return null;
        }
        C55210jy jyVar = aVar.mo81219Z().f145706p;
        if (jyVar == null) {
            jyVar = C55210jy.f145342e;
        }
        for (String str : jyVar.f145346c) {
            if (m153449g(matchingProviderInfo, str, true)) {
                return str;
            }
        }
        if (!z || matchingProviderInfo.f236270h.f236312a.isEmpty()) {
            return null;
        }
        C55361pn pnVar = (C55361pn) matchingProviderInfo.f236270h.f236312a.get(0);
        matchingProviderInfo.mo81439i(pnVar, true);
        return C87494p.m142026c(pnVar);
    }
}
