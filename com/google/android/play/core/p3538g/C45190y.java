package com.google.android.play.core.p3538g;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.g.y */
/* compiled from: PG */
final class C45190y implements C45187v {

    /* renamed from: a */
    public final C45186u f117941a;

    /* renamed from: b */
    private final C45135au f117942b;

    /* renamed from: c */
    private final C45181p f117943c;

    /* renamed from: d */
    private final C45138ax f117944d;

    /* renamed from: e */
    private final Handler f117945e = new Handler(Looper.getMainLooper());

    public C45190y(C45135au auVar, C45186u uVar, C45181p pVar, C45138ax axVar) {
        this.f117942b = auVar;
        this.f117941a = uVar;
        this.f117943c = pVar;
        this.f117944d = axVar;
    }

    /* renamed from: j */
    public static List m80460j(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C146006ab mo48994a(List list) {
        C45135au auVar = this.f117942b;
        if (auVar.f117832c == null) {
            return C45135au.m80336b();
        }
        C45135au.f117829a.mo48886d("deferredInstall(%s)", list);
        C146010af afVar = new C146010af();
        auVar.f117832c.mo48909c(new C45126al(auVar, afVar, list, afVar), afVar);
        return afVar.f394698a;
    }

    /* renamed from: b */
    public final C146006ab mo48995b(List list) {
        C45135au auVar = this.f117942b;
        List j = m80460j(list);
        if (auVar.f117832c == null) {
            return C45135au.m80336b();
        }
        C45135au.f117829a.mo48886d("deferredLanguageInstall(%s)", j);
        C146010af afVar = new C146010af();
        auVar.f117832c.mo48909c(new C45127am(auVar, afVar, j, afVar), afVar);
        return afVar.f394698a;
    }

    /* renamed from: c */
    public final C146006ab mo48996c(List list) {
        C45135au auVar = this.f117942b;
        List j = m80460j(list);
        if (auVar.f117832c == null) {
            return C45135au.m80336b();
        }
        C45135au.f117829a.mo48886d("deferredLanguageUninstall(%s)", j);
        C146010af afVar = new C146010af();
        auVar.f117832c.mo48909c(new C45128an(auVar, afVar, j, afVar), afVar);
        return afVar.f394698a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:6|7|4)|21|(2:9|10)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.C146006ab mo48997d(java.util.List r8) {
        /*
            r7 = this;
            com.google.android.play.core.g.ax r0 = r7.f117944d
            java.lang.Class<com.google.android.play.core.g.ax> r1 = com.google.android.play.core.p3538g.C45138ax.class
            monitor-enter(r1)
            java.util.Set r2 = r0.mo48975b()     // Catch:{ all -> 0x0063 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0063 }
            r3.<init>(r2)     // Catch:{ all -> 0x0063 }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x0063 }
            r4 = 0
            r5 = 0
        L_0x0014:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0063 }
            if (r6 == 0) goto L_0x0026
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0063 }
            boolean r6 = r3.add(r6)     // Catch:{ all -> 0x0063 }
            r5 = r5 | r6
            goto L_0x0014
        L_0x0026:
            if (r5 == 0) goto L_0x0039
            android.content.SharedPreferences r0 = r0.mo48974a()     // Catch:{ Exception -> 0x0039 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r2 = "modules_to_uninstall_if_emulated"
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r2, r3)     // Catch:{ Exception -> 0x0039 }
            r0.apply()     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            com.google.android.play.core.g.au r0 = r7.f117942b
            com.google.android.play.core.e.k r1 = r0.f117832c
            if (r1 != 0) goto L_0x0045
            com.google.android.gms.tasks.ab r8 = com.google.android.play.core.p3538g.C45135au.m80336b()
            goto L_0x0062
        L_0x0045:
            com.google.android.play.core.c.a r1 = com.google.android.play.core.p3538g.C45135au.f117829a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            java.lang.String r3 = "deferredUninstall(%s)"
            r1.mo48886d(r3, r2)
            com.google.android.gms.tasks.af r1 = new com.google.android.gms.tasks.af
            r1.<init>()
            com.google.android.play.core.e.k r2 = r0.f117832c
            com.google.android.play.core.g.ak r3 = new com.google.android.play.core.g.ak
            r3.<init>(r0, r1, r8, r1)
            r2.mo48909c(r3, r1)
            com.google.android.gms.tasks.aj r8 = r1.f394698a
        L_0x0062:
            return r8
        L_0x0063:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0066:
            throw r8
        L_0x0067:
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3538g.C45190y.mo48997d(java.util.List):com.google.android.gms.tasks.ab");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(4:20|(2:22|40)(2:23|41)|38|18)|39|(2:25|26)|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r2.containsAll(r4) != false) goto L_0x003d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00ad */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c1  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.C146006ab mo48998e(com.google.android.play.core.p3538g.C45122ah r12) {
        /*
            r11 = this;
            com.google.android.play.core.common.a r5 = new com.google.android.play.core.common.a
            r5.<init>()
            r0 = 1
            r5.mo48891a(r0)
            java.util.List r1 = r12.f117808b
            r1.isEmpty()
            java.util.List r1 = r12.f117808b
            com.google.android.play.core.g.p r2 = r11.f117943c
            java.util.Set r2 = r2.mo49014d()
            r3 = 0
            if (r2 != 0) goto L_0x001a
            goto L_0x003d
        L_0x001a:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0023:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0037
            java.lang.Object r6 = r1.next()
            java.util.Locale r6 = (java.util.Locale) r6
            java.lang.String r6 = r6.getLanguage()
            r4.add(r6)
            goto L_0x0023
        L_0x0037:
            boolean r1 = r2.containsAll(r4)
            if (r1 == 0) goto L_0x006d
        L_0x003d:
            java.util.List r1 = r12.f117807a
            com.google.android.play.core.g.p r2 = r11.f117943c
            java.util.Set r2 = r2.mo49013c()
            boolean r1 = r2.containsAll(r1)
            if (r1 == 0) goto L_0x006d
            java.util.List r1 = r12.f117807a
            com.google.android.play.core.g.ax r2 = r11.f117944d
            java.util.Set r2 = r2.mo48975b()
            boolean r1 = java.util.Collections.disjoint(r1, r2)
            if (r1 != 0) goto L_0x005a
            goto L_0x006d
        L_0x005a:
            android.os.Handler r0 = r11.f117945e
            com.google.android.play.core.g.x r1 = new com.google.android.play.core.g.x
            r1.<init>(r11, r12)
            r0.post(r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.tasks.ab r12 = com.google.android.gms.tasks.C146021aq.m237850d(r12)
            return r12
        L_0x006d:
            com.google.android.play.core.g.ax r1 = r11.f117944d
            java.util.List r2 = r12.f117807a
            java.lang.Class<com.google.android.play.core.g.ax> r4 = com.google.android.play.core.p3538g.C45138ax.class
            monitor-enter(r4)
            java.util.Set r6 = r1.mo48975b()     // Catch:{ all -> 0x00e6 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x00e6 }
            r7.<init>()     // Catch:{ all -> 0x00e6 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00e6 }
            r8 = 0
        L_0x0082:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x00e6 }
            if (r9 == 0) goto L_0x009a
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x00e6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00e6 }
            boolean r10 = r2.contains(r9)     // Catch:{ all -> 0x00e6 }
            if (r10 == 0) goto L_0x0096
            r8 = 1
            goto L_0x0082
        L_0x0096:
            r7.add(r9)     // Catch:{ all -> 0x00e6 }
            goto L_0x0082
        L_0x009a:
            if (r8 == 0) goto L_0x00ad
            android.content.SharedPreferences r1 = r1.mo48974a()     // Catch:{ Exception -> 0x00ad }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r2 = "modules_to_uninstall_if_emulated"
            android.content.SharedPreferences$Editor r1 = r1.putStringSet(r2, r7)     // Catch:{ Exception -> 0x00ad }
            r1.apply()     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            monitor-exit(r4)     // Catch:{ all -> 0x00e6 }
            com.google.android.play.core.g.au r1 = r11.f117942b
            java.util.List r4 = r12.f117807a
            java.util.List r12 = r12.f117808b
            java.util.List r12 = m80460j(r12)
            com.google.android.play.core.e.k r2 = r1.f117832c
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.tasks.ab r12 = com.google.android.play.core.p3538g.C45135au.m80336b()
            goto L_0x00e5
        L_0x00c1:
            com.google.android.play.core.c.a r2 = com.google.android.play.core.p3538g.C45135au.f117829a
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r4
            r6[r0] = r12
            java.lang.String r0 = "startInstall(%s,%s)"
            r2.mo48886d(r0, r6)
            com.google.android.gms.tasks.af r7 = new com.google.android.gms.tasks.af
            r7.<init>()
            com.google.android.play.core.e.k r8 = r1.f117832c
            com.google.android.play.core.g.aj r9 = new com.google.android.play.core.g.aj
            r0 = r9
            r2 = r7
            r3 = r4
            r4 = r12
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.mo48909c(r9, r7)
            com.google.android.gms.tasks.aj r12 = r7.f394698a
        L_0x00e5:
            return r12
        L_0x00e6:
            r12 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e6 }
            goto L_0x00ea
        L_0x00e9:
            throw r12
        L_0x00ea:
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3538g.C45190y.mo48998e(com.google.android.play.core.g.ah):com.google.android.gms.tasks.ab");
    }

    /* renamed from: f */
    public final Set mo48999f() {
        Set d = this.f117943c.mo49014d();
        return d == null ? Collections.emptySet() : d;
    }

    /* renamed from: g */
    public final Set mo49000g() {
        return this.f117943c.mo49013c();
    }

    /* renamed from: h */
    public final synchronized void mo49001h(C45140az azVar) {
        this.f117941a.mo48879b(azVar);
    }

    /* renamed from: i */
    public final synchronized void mo49002i(C45140az azVar) {
        this.f117941a.mo48880c(azVar);
    }
}
