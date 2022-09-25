package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.p10712d.C142500hq;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.ca */
/* compiled from: PG */
public final class C95795ca {

    /* renamed from: a */
    private static final C58495hd f268237a;

    /* renamed from: b */
    private static final C58495hd f268238b = C58495hd.m89900n(C142500hq.MAESTRO, "com.google.android.apps.wearables.maestro.companion");

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C142500hq.TRANSLATE, "com.google.android.apps.translate");
        gzVar.mo55429h(C142500hq.HOTLINE, "com.google.android.apps.hotline");
        gzVar.mo55429h(C142500hq.DUO, "com.google.android.apps.tachyon");
        gzVar.mo55429h(C142500hq.AIAI, "com.google.android.as");
        f268237a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static ComponentName m158752a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers;
        String str = intent.getPackage();
        if (!(str == null || (queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0)) == null || queryBroadcastReceivers.isEmpty())) {
            for (ResolveInfo next : queryBroadcastReceivers) {
                String str2 = next.activityInfo.name;
                if (str.equals(next.activityInfo.packageName)) {
                    return new ComponentName(str, str2);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    static Intent m158753b(Context context, C142500hq hqVar, C89656k kVar, String str) {
        ComponentName a;
        Intent c = m158754c("com.google.android.apps.gsa.shared.bisto.action.SDK_REQUEST", hqVar, kVar, str);
        if (c == null || (a = m158752a(context, c)) == null) {
            return null;
        }
        c.setComponent(a);
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m158754c(java.lang.String r2, com.google.android.p10712d.C142500hq r3, com.google.android.apps.gsa.shared.bisto.C89656k r4, java.lang.String r5) {
        /*
            com.google.android.d.hq r0 = com.google.android.p10712d.C142500hq.HOTLINE
            r1 = 0
            if (r3 == r0) goto L_0x0009
            com.google.android.d.hq r0 = com.google.android.p10712d.C142500hq.DUO
            if (r3 != r0) goto L_0x0011
        L_0x0009:
            r0 = 12
            boolean r4 = r4.mo83555j(r0)
            if (r4 == 0) goto L_0x0039
        L_0x0011:
            com.google.common.b.hd r4 = f268237a
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x002c
            com.google.common.b.hd r4 = f268238b
            java.lang.Object r3 = r4.get(r3)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = com.google.common.base.C58832aw.m90831a(r4, r5)
            if (r3 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            return r1
        L_0x002c:
            if (r4 != 0) goto L_0x002f
            return r1
        L_0x002f:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            android.content.Intent r2 = r3.setPackage(r4)
            return r2
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95795ca.m158754c(java.lang.String, com.google.android.d.hq, com.google.android.apps.gsa.shared.bisto.k, java.lang.String):android.content.Intent");
    }

    /* renamed from: d */
    static ArrayList m158755d(Context context, C89656k kVar, String str) {
        ArrayList arrayList = new ArrayList();
        C58800sl lA = f268237a.keySet().iterator();
        while (lA.hasNext()) {
            Intent b = m158753b(context, (C142500hq) lA.next(), kVar, str);
            if (b != null) {
                arrayList.add(b);
            }
        }
        if (!C58837ba.m90859h(str)) {
            C58800sl lA2 = f268238b.keySet().iterator();
            while (lA2.hasNext()) {
                Intent b2 = m158753b(context, (C142500hq) lA2.next(), kVar, str);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }
}
