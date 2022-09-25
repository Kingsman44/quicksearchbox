package com.google.android.apps.gsa.search.shared.actions.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55204js;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55359pl;
import com.google.p4152bb.p4153a.C55360pm;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.k */
/* compiled from: PG */
public final class C87489k {

    /* renamed from: a */
    private static final C59071e f236315a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.util.k");

    /* renamed from: a */
    public static MatchingProviderInfo m142013a() {
        C55360pm pmVar = (C55360pm) C55361pn.f145866g.createBuilder();
        pmVar.mo58885m(C55359pl.f145864b, C55359pl.f145863a);
        C55361pn pnVar = (C55361pn) pmVar.build();
        return new MatchingProviderInfo(C58597ky.m90212c(pnVar), pnVar, false);
    }

    /* renamed from: b */
    public static MatchingProviderInfo m142014b() {
        return new MatchingProviderInfo(new ArrayList(), (C55361pn) null, false);
    }

    /* renamed from: c */
    public static MatchingProviderInfo m142015c(Context context, Intent... intentArr) {
        return m142016d(context, false, false, BuildConfig.FLAVOR, (C55240la) null, intentArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r8 == null) goto L_0x006b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo m142016d(android.content.Context r7, boolean r8, boolean r9, java.lang.String r10, com.google.p4152bb.p4153a.C55240la r11, android.content.Intent... r12) {
        /*
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 0
            r1 = r12[r0]
            if (r1 != 0) goto L_0x000c
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r7 = m142014b()
            return r7
        L_0x000c:
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            r2 = 0
        L_0x0011:
            java.lang.String r3 = "MatchingProviderInfoFac"
            if (r2 > 0) goto L_0x009a
            r4 = r12[r2]
            if (r4 != 0) goto L_0x001b
            goto L_0x0096
        L_0x001b:
            android.content.ComponentName r5 = r4.getComponent()
            if (r5 == 0) goto L_0x0026
            java.util.List r5 = r1.queryIntentActivities(r4, r0)
            goto L_0x002d
        L_0x0026:
            r5 = 65664(0x10080, float:9.2015E-41)
            java.util.List r5 = r1.queryIntentActivities(r4, r5)
        L_0x002d:
            int r6 = r5.size()
            if (r6 == 0) goto L_0x0096
            java.util.List r7 = m142018f(r5, r8, r4, r11, r7)
            int r8 = r7.size()
            r11 = 1
            if (r8 != r11) goto L_0x0045
            java.lang.Object r8 = r7.get(r0)
            com.google.bb.a.pn r8 = (com.google.p4152bb.p4153a.C55361pn) r8
            goto L_0x0078
        L_0x0045:
            android.content.ComponentName r8 = r4.getComponent()
            if (r8 == 0) goto L_0x0050
            android.content.pm.ResolveInfo r8 = r1.resolveActivity(r4, r0)
            goto L_0x0056
        L_0x0050:
            r8 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r8 = r1.resolveActivity(r4, r8)
        L_0x0056:
            r12 = 0
            if (r8 != 0) goto L_0x006d
            com.google.common.f.e r8 = f236315a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r1, r3)
            java.lang.String r1 = "resolveForPreferredProvider(): No system provider resolved for intent"
            r2 = 9563(0x255b, float:1.34E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56386p(r1)
        L_0x006b:
            r8 = r12
            goto L_0x0078
        L_0x006d:
            android.content.pm.ActivityInfo r8 = r8.activityInfo
            java.lang.String r8 = r8.packageName
            com.google.bb.a.pn r8 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142025b(r7, r8)
            if (r8 != 0) goto L_0x0078
            goto L_0x006b
        L_0x0078:
            if (r9 == 0) goto L_0x0090
            if (r8 != 0) goto L_0x0090
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L_0x0090
            com.google.bb.a.pn r8 = com.google.android.apps.gsa.search.shared.actions.util.C87494p.m142025b(r7, r10)
            if (r8 == 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            java.lang.Object r8 = r7.get(r0)
            com.google.bb.a.pn r8 = (com.google.p4152bb.p4153a.C55361pn) r8
        L_0x008f:
            r0 = 1
        L_0x0090:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r9 = new com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo
            r9.<init>(r7, r8, r0)
            return r9
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x009a:
            com.google.common.f.e r7 = f236315a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r3)
            java.lang.String r8 = "fromIntents(): No matching provider"
            r9 = 9552(0x2550, float:1.3385E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r7 = m142014b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.util.C87489k.m142016d(android.content.Context, boolean, boolean, java.lang.String, com.google.bb.a.la, android.content.Intent[]):com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo");
    }

    /* renamed from: e */
    public static MatchingProviderInfo m142017e(Context context, Intent intent, C55240la laVar) {
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices.isEmpty()) {
            C59104x d = f236315a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MatchingProviderInfoFac");
            ((C59052c) ((C59052c) d).mo56372aa(9559)).mo56386p("fromServiceIntent(): no matching services.");
            return m142014b();
        }
        C58976aa aaVar = C58975e.f156826a;
        List f = m142018f(queryIntentServices, false, intent, laVar, context);
        return new MatchingProviderInfo(f, f.size() == 1 ? (C55361pn) f.get(0) : null, false);
    }

    /* renamed from: f */
    private static List m142018f(List list, boolean z, Intent intent, C55240la laVar, Context context) {
        C55208jw jwVar;
        Bundle bundle;
        Object obj;
        Object obj2;
        ArrayList d = C58597ky.m90213d(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            if (z) {
                String str = resolveInfo.activityInfo.permission;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                            C58976aa aaVar = C58975e.f156826a;
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
            }
            List m = C58485gu.m89845m();
            if (laVar != null) {
                C62940bt r3 = C62942bv.checkIsLite(C55208jw.f145316z);
                laVar.mo58887l(r3);
                Object l = laVar.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj2 = r3.f169969b;
                } else {
                    obj2 = r3.mo58889c(l);
                }
                jwVar = (C55208jw) obj2;
            } else {
                jwVar = null;
            }
            if (jwVar != null) {
                C62940bt r2 = C62942bv.checkIsLite(C55204js.f145298d);
                jwVar.mo58887l(r2);
                Object l2 = jwVar.f169962ag.mo58854l(r2.f169971d);
                if (l2 == null) {
                    obj = r2.f169969b;
                } else {
                    obj = r2.mo58889c(l2);
                }
                m = (List) obj;
            }
            if (!m.isEmpty()) {
                if (resolveInfo.activityInfo.metaData == null) {
                    bundle = new Bundle();
                } else {
                    bundle = resolveInfo.activityInfo.metaData;
                }
                Iterator it2 = m.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C55204js jsVar = (C55204js) it2.next();
                    String str2 = jsVar.f145300a;
                    String str3 = jsVar.f145301b;
                    C58976aa aaVar2 = C58975e.f156826a;
                    if ((TextUtils.isEmpty(str3) && !bundle.containsKey(str2)) || (!TextUtils.isEmpty(str3) && !str3.equalsIgnoreCase(bundle.getString(str2)))) {
                        break;
                    }
                }
            }
            d.add(C87494p.m142024a(resolveInfo, intent, context.getPackageManager(), laVar));
        }
        return d;
    }
}
