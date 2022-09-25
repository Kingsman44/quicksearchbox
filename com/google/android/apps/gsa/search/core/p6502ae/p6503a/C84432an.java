package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6502ae.C84417a;
import com.google.android.apps.gsa.search.core.p6502ae.C84462c;
import com.google.android.apps.gsa.search.core.p6502ae.C84463d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.an */
/* compiled from: PG */
final class C84432an {

    /* renamed from: a */
    private static final C59071e f229746a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ae.a.an");

    /* renamed from: b */
    private final Context f229747b;

    /* renamed from: c */
    private final C86130z f229748c;

    /* renamed from: d */
    private final C84462c f229749d;

    /* renamed from: e */
    private final Set f229750e;

    /* renamed from: f */
    private final SharedPreferences f229751f;

    /* renamed from: g */
    private final Map f229752g;

    public C84432an(Context context, C86130z zVar, C84462c cVar, SharedPreferences sharedPreferences, C86124t tVar) {
        Set a = C84417a.m134730a(tVar);
        C58495hd r = tVar.mo79752r(C90085ej.f250224bz);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : r.entrySet()) {
            try {
                hashMap.put((String) entry.getKey(), Long.valueOf((String) entry.getValue()));
            } catch (NumberFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) f229746a.mo56226d()).mo56382g(e)).mo56372aa(9320)).mo56354G("App %s has invalid blacklist version code %s set", entry.getKey(), entry.getValue());
            }
        }
        this.f229747b = context;
        this.f229748c = zVar;
        this.f229749d = cVar;
        this.f229750e = a;
        this.f229752g = hashMap;
        this.f229751f = sharedPreferences;
    }

    /* renamed from: c */
    private final ApplicationInfo m134764c(String str) {
        try {
            return this.f229747b.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f229746a.mo56226d()).mo56382g(e)).mo56372aa(9309)).mo56389s("Could not get application info for package %s", str);
            return null;
        }
    }

    /* renamed from: d */
    private static C84430al m134765d(GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource, String str, ApplicationInfo applicationInfo, String str2, String str3, Set set) {
        GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource2 = getGlobalSearchSourcesCall$GlobalSearchSource;
        ApplicationInfo applicationInfo2 = applicationInfo;
        return new C84430al(str, applicationInfo2, applicationInfo2.packageName, getGlobalSearchSourcesCall$GlobalSearchSource2.f394451c, getGlobalSearchSourcesCall$GlobalSearchSource2.f394452d, getGlobalSearchSourcesCall$GlobalSearchSource2.f394453e, getGlobalSearchSourcesCall$GlobalSearchSource2.f394454f, getGlobalSearchSourcesCall$GlobalSearchSource2.f394455g, getGlobalSearchSourcesCall$GlobalSearchSource2.f394456h, str2, str3, getGlobalSearchSourcesCall$GlobalSearchSource2.f394458j, set);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Collection mo78014a(GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource) {
        GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource2;
        ArrayList d = C58597ky.m90213d(this.f229750e.size());
        String packageName = this.f229747b.getPackageName();
        if (this.f229748c.mo79769i(packageName)) {
            ((C59052c) ((C59052c) f229746a.mo56224b()).mo56372aa(9312)).mo56389s("ignoring icing source %s", packageName);
            return d;
        }
        ApplicationInfo c = m134764c(packageName);
        if (c == null) {
            ((C59052c) ((C59052c) f229746a.mo56226d()).mo56372aa(9311)).mo56389s("could not find application info for package %s", packageName);
            return d;
        }
        if (getGlobalSearchSourcesCall$GlobalSearchSource == null) {
            getGlobalSearchSourcesCall$GlobalSearchSource2 = new GetGlobalSearchSourcesCall$GlobalSearchSource();
            getGlobalSearchSourcesCall$GlobalSearchSource2.f394449a = packageName;
            getGlobalSearchSourcesCall$GlobalSearchSource2.f394458j = true;
        } else {
            getGlobalSearchSourcesCall$GlobalSearchSource2 = getGlobalSearchSourcesCall$GlobalSearchSource;
        }
        Iterator it = this.f229750e.iterator();
        while (it.hasNext()) {
            C84417a aVar = (C84417a) it.next();
            C84462c cVar = this.f229749d;
            String a = C84462c.m134798a(cVar.f229863a, aVar.f229701d);
            C84462c cVar2 = this.f229749d;
            C58838bb.m90868c(cVar2.f229864b.containsKey(aVar));
            GlobalSearchApplicationInfo globalSearchApplicationInfo = aVar.f229702e;
            String str = aVar.f229701d;
            HashSet hashSet = new HashSet();
            String str2 = getGlobalSearchSourcesCall$GlobalSearchSource2.f394449a;
            int i = globalSearchApplicationInfo.f387463c;
            int i2 = globalSearchApplicationInfo.f387464d;
            int i3 = globalSearchApplicationInfo.f387465e;
            String str3 = globalSearchApplicationInfo.f387466f;
            String str4 = globalSearchApplicationInfo.f387467g;
            String str5 = globalSearchApplicationInfo.f387468h;
            Iterator it2 = it;
            C84430al alVar = r6;
            C84430al alVar2 = new C84430al(a, c, str2, i, i2, i3, str3, str4, str5, (String) cVar2.f229864b.get(aVar), str, getGlobalSearchSourcesCall$GlobalSearchSource2.f394458j, hashSet);
            alVar.f229744l = C84463d.m134802c(this.f229751f, alVar);
            d.add(alVar);
            it = it2;
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection mo78015b(com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource[] r15) {
        /*
            r14 = this;
            if (r15 == 0) goto L_0x0129
            int r0 = r15.length
            if (r0 != 0) goto L_0x0007
            goto L_0x0129
        L_0x0007:
            java.util.Set r1 = r14.f229750e
            int r1 = r1.size()
            int r1 = r1 + r0
            r2 = -1
            int r1 = r1 + r2
            java.util.ArrayList r1 = com.google.common.p4522b.C58597ky.m90213d(r1)
            r3 = 0
            r4 = 0
        L_0x0016:
            if (r4 >= r0) goto L_0x0128
            r5 = r15[r4]
            if (r5 != 0) goto L_0x002b
            com.google.common.f.e r5 = f229746a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "GlobalSearchSource array contained null value"
            r7 = 9319(0x2467, float:1.3059E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0124
        L_0x002b:
            java.lang.String r8 = r5.f394449a
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 == 0) goto L_0x0042
            com.google.common.f.e r6 = f229746a
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "no packagename set in global search app info: %s"
            r8 = 9318(0x2466, float:1.3057E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56389s(r7, r5)
            goto L_0x0124
        L_0x0042:
            com.google.android.apps.gsa.search.core.i.z r6 = r14.f229748c
            boolean r6 = r6.mo79769i(r8)
            if (r6 == 0) goto L_0x0059
            com.google.common.f.e r5 = f229746a
            com.google.common.f.x r5 = r5.mo56224b()
            java.lang.String r6 = "ignoring icing source %s"
            r7 = 9317(0x2465, float:1.3056E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r6, r8)
            goto L_0x0124
        L_0x0059:
            android.content.pm.ApplicationInfo r7 = r14.m134764c(r8)
            if (r7 != 0) goto L_0x006e
            com.google.common.f.e r5 = f229746a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "could not find application info for package %s"
            r7 = 9316(0x2464, float:1.3054E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56389s(r6, r8)
            goto L_0x0124
        L_0x006e:
            java.util.Map r6 = r14.f229752g
            boolean r6 = r6.containsKey(r8)
            if (r6 != 0) goto L_0x0077
            goto L_0x0098
        L_0x0077:
            java.util.Map r6 = r14.f229752g
            java.lang.Object r6 = r6.get(r8)
            java.lang.Long r6 = (java.lang.Long) r6
            long r9 = r6.longValue()
            android.content.Context r6 = r14.f229747b     // Catch:{ NameNotFoundException -> 0x0097 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0097 }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r8, r3)     // Catch:{ NameNotFoundException -> 0x0097 }
            long r11 = r6.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x0097 }
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 < 0) goto L_0x0098
            goto L_0x0124
        L_0x0097:
        L_0x0098:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[] r6 = r5.f394457i
            if (r6 != 0) goto L_0x00a2
            goto L_0x00b8
        L_0x00a2:
            int r9 = r6.length
            r11 = 0
        L_0x00a4:
            if (r11 >= r9) goto L_0x00b8
            r12 = r6[r11]
            java.lang.String r13 = r12.f394445a
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x00b5
            java.lang.String r12 = r12.f394445a
            r10.add(r12)
        L_0x00b5:
            int r11 = r11 + 1
            goto L_0x00a4
        L_0x00b8:
            android.content.Context r6 = r14.f229747b
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x00cc
            java.util.Collection r5 = r14.mo78014a(r5)
            r1.addAll(r5)
            goto L_0x0124
        L_0x00cc:
            java.lang.String r6 = "com.google.android.gms"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x011b
            java.lang.String r9 = r5.f394450b
            if (r9 == 0) goto L_0x0124
            java.lang.String r6 = "com.google.android.gms/"
            java.lang.String r6 = r6.concat(r9)
            int r8 = r9.hashCode()
            r10 = -645665530(0xffffffffd983ed06, float:-4.641729E15)
            r11 = 1
            if (r8 == r10) goto L_0x00f8
            r10 = 3000946(0x2dca72, float:4.205221E-39)
            if (r8 == r10) goto L_0x00ee
            goto L_0x0102
        L_0x00ee:
            java.lang.String r8 = "apps"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0102
            r8 = 0
            goto L_0x0103
        L_0x00f8:
            java.lang.String r8 = "contacts_contact_id"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0102
            r8 = 1
            goto L_0x0103
        L_0x0102:
            r8 = -1
        L_0x0103:
            if (r8 == 0) goto L_0x010c
            if (r8 == r11) goto L_0x0109
            r8 = r9
            goto L_0x010e
        L_0x0109:
            java.lang.String r8 = "contacts"
            goto L_0x010e
        L_0x010c:
            java.lang.String r8 = "applications"
        L_0x010e:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            com.google.android.apps.gsa.search.core.ae.a.al r5 = m134765d(r5, r6, r7, r8, r9, r10)
            r1.add(r5)
            goto L_0x0124
        L_0x011b:
            r9 = 0
            r6 = r8
            com.google.android.apps.gsa.search.core.ae.a.al r5 = m134765d(r5, r6, r7, r8, r9, r10)
            r1.add(r5)
        L_0x0124:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0128:
            return r1
        L_0x0129:
            java.util.List r15 = java.util.Collections.emptyList()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84432an.mo78015b(com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource[]):java.util.Collection");
    }
}
