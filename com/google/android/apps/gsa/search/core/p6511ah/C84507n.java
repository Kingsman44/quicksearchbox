package com.google.android.apps.gsa.search.core.p6511ah;

import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.ah.n */
/* compiled from: PG */
public final class C84507n implements C86091a {

    /* renamed from: a */
    private static final C59071e f229986a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ah.n");

    /* renamed from: b */
    private static final String f229987b = Build.ID;

    /* renamed from: c */
    private final int f229988c;

    /* renamed from: d */
    private final SharedPreferences f229989d;

    /* renamed from: e */
    private final C68214a f229990e;

    public C84507n(int i, SharedPreferences sharedPreferences, C68214a aVar) {
        this.f229988c = i;
        this.f229989d = sharedPreferences;
        this.f229990e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        if (r4 != 2) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0110, code lost:
        if (r4 == 2) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0112, code lost:
        r8.f229989d.edit().putInt(com.google.android.apps.gsa.shared.search.C90507o.f253015e, r8.f229988c).putString(com.google.android.apps.gsa.shared.search.C90507o.f253016f, r1).apply();
        r1 = ((java.util.Set) r8.f229990e.mo27525b()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0139, code lost:
        if (r1.hasNext() == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013b, code lost:
        ((com.google.android.apps.gsa.search.core.p6511ah.C84506m) r1.next()).mo78211a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0145, code lost:
        r1 = com.google.android.apps.gsa.search.core.p6511ah.C84504k.m135127a(r3.f229982b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014b, code lost:
        if (r1 == 0) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014d, code lost:
        if (r1 != 2) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        r1 = (com.google.common.p4552o.C60548tz) com.google.common.p4552o.C60555uf.f164065cO.createBuilder();
        r1.copyOnWrite();
        r4 = (com.google.common.p4552o.C60555uf) r1.instance;
        r4.f164093a |= 2;
        r4.f164258m = 927;
        r3 = r3.f229983c;
        r1.copyOnWrite();
        r4 = (com.google.common.p4552o.C60555uf) r1.instance;
        r4.f164252g |= 16777216;
        r4.f164189bq = r3;
        r3 = r8.f229988c;
        r1.copyOnWrite();
        r4 = (com.google.common.p4552o.C60555uf) r1.instance;
        r4.f164252g |= 33554432;
        r4.f164190br = r3;
        com.google.android.apps.gsa.shared.logger.C89949q.m146525j((com.google.common.p4552o.C60555uf) r1.build(), (com.google.common.p4552o.C60321oe) null, (com.google.protos.p4816ai.p4818b.C63196b) null, (java.lang.String) null);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78212a() {
        /*
            r8 = this;
            java.lang.Class<com.google.android.apps.gsa.search.core.ah.n> r0 = com.google.android.apps.gsa.search.core.p6511ah.C84507n.class
            monitor-enter(r0)
            r1 = -1
            android.content.SharedPreferences r2 = r8.f229989d     // Catch:{ ClassCastException -> 0x0010 }
            java.lang.String r3 = "last_run_version"
            int r1 = r2.getInt(r3, r1)     // Catch:{ ClassCastException -> 0x0010 }
            goto L_0x0054
        L_0x000d:
            r1 = move-exception
            goto L_0x0196
        L_0x0010:
            r2 = move-exception
            android.content.SharedPreferences r3 = r8.f229989d     // Catch:{ all -> 0x000d }
            java.util.Map r3 = r3.getAll()     // Catch:{ all -> 0x000d }
            java.lang.String r4 = "last_run_version"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x000d }
            r3.getClass()
            com.google.common.f.e r4 = f229986a     // Catch:{ all -> 0x000d }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x000d }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x000d }
            com.google.common.f.x r2 = r4.mo56382g(r2)     // Catch:{ all -> 0x000d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x000d }
            r4 = 9379(0x24a3, float:1.3143E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r4)     // Catch:{ all -> 0x000d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x000d }
            java.lang.String r4 = "Unexpected type of %s startup preference, expected int, actual %s with value %s"
            java.lang.String r5 = "last_run_version"
            java.lang.Class r6 = r3.getClass()     // Catch:{ all -> 0x000d }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x000d }
            r2.mo56359L(r4, r5, r6, r3)     // Catch:{ all -> 0x000d }
            android.content.SharedPreferences r2 = r8.f229989d     // Catch:{ all -> 0x000d }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x000d }
            java.lang.String r3 = "last_run_version"
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)     // Catch:{ all -> 0x000d }
            r2.apply()     // Catch:{ all -> 0x000d }
        L_0x0054:
            r2 = 0
            android.content.SharedPreferences r3 = r8.f229989d     // Catch:{ ClassCastException -> 0x005e }
            java.lang.String r4 = "last_run_system_build"
            java.lang.String r3 = r3.getString(r4, r2)     // Catch:{ ClassCastException -> 0x005e }
            goto L_0x00a3
        L_0x005e:
            r3 = move-exception
            android.content.SharedPreferences r4 = r8.f229989d     // Catch:{ all -> 0x000d }
            java.util.Map r4 = r4.getAll()     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "last_run_system_build"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x000d }
            r4.getClass()
            com.google.common.f.e r5 = f229986a     // Catch:{ all -> 0x000d }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x000d }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x000d }
            com.google.common.f.x r3 = r5.mo56382g(r3)     // Catch:{ all -> 0x000d }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x000d }
            r5 = 9378(0x24a2, float:1.3141E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x000d }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "Unexpected type of %s startup preference, expected string, actual %s with value %s"
            java.lang.String r6 = "last_run_system_build"
            java.lang.Class r7 = r4.getClass()     // Catch:{ all -> 0x000d }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x000d }
            r3.mo56359L(r5, r6, r7, r4)     // Catch:{ all -> 0x000d }
            android.content.SharedPreferences r3 = r8.f229989d     // Catch:{ all -> 0x000d }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x000d }
            java.lang.String r4 = "last_run_version"
            android.content.SharedPreferences$Editor r3 = r3.remove(r4)     // Catch:{ all -> 0x000d }
            r3.apply()     // Catch:{ all -> 0x000d }
            r3 = r2
        L_0x00a3:
            com.google.android.apps.gsa.search.core.ah.l r4 = com.google.android.apps.gsa.search.core.p6511ah.C84505l.f229979f     // Catch:{ all -> 0x000d }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.search.core.ah.i r4 = (com.google.android.apps.gsa.search.core.p6511ah.C84502i) r4     // Catch:{ all -> 0x000d }
            r4.copyOnWrite()     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.search.core.ah.l r5 = (com.google.android.apps.gsa.search.core.p6511ah.C84505l) r5     // Catch:{ all -> 0x000d }
            int r6 = r5.f229981a     // Catch:{ all -> 0x000d }
            r7 = 2
            r6 = r6 | r7
            r5.f229981a = r6     // Catch:{ all -> 0x000d }
            r5.f229983c = r1     // Catch:{ all -> 0x000d }
            if (r3 == 0) goto L_0x00cb
            r4.copyOnWrite()     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.search.core.ah.l r5 = (com.google.android.apps.gsa.search.core.p6511ah.C84505l) r5     // Catch:{ all -> 0x000d }
            int r6 = r5.f229981a     // Catch:{ all -> 0x000d }
            r6 = r6 | 8
            r5.f229981a = r6     // Catch:{ all -> 0x000d }
            r5.f229985e = r3     // Catch:{ all -> 0x000d }
        L_0x00cb:
            int r5 = r8.f229988c     // Catch:{ all -> 0x000d }
            r6 = 1
            if (r1 == r5) goto L_0x00de
            r4.copyOnWrite()     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.search.core.ah.l r1 = (com.google.android.apps.gsa.search.core.p6511ah.C84505l) r1     // Catch:{ all -> 0x000d }
            r1.f229982b = r6     // Catch:{ all -> 0x000d }
            int r5 = r1.f229981a     // Catch:{ all -> 0x000d }
            r5 = r5 | r6
            r1.f229981a = r5     // Catch:{ all -> 0x000d }
        L_0x00de:
            java.lang.String r1 = f229987b     // Catch:{ all -> 0x000d }
            boolean r3 = android.text.TextUtils.equals(r3, r1)     // Catch:{ all -> 0x000d }
            if (r3 != 0) goto L_0x00f5
            r4.copyOnWrite()     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r3 = r4.instance     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.search.core.ah.l r3 = (com.google.android.apps.gsa.search.core.p6511ah.C84505l) r3     // Catch:{ all -> 0x000d }
            r3.f229984d = r6     // Catch:{ all -> 0x000d }
            int r5 = r3.f229981a     // Catch:{ all -> 0x000d }
            r5 = r5 | 4
            r3.f229981a = r5     // Catch:{ all -> 0x000d }
        L_0x00f5:
            com.google.protobuf.bv r3 = r4.build()     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.search.core.ah.l r3 = (com.google.android.apps.gsa.search.core.p6511ah.C84505l) r3     // Catch:{ all -> 0x000d }
            int r4 = r3.f229982b     // Catch:{ all -> 0x000d }
            int r4 = com.google.android.apps.gsa.search.core.p6511ah.C84504k.m135127a(r4)     // Catch:{ all -> 0x000d }
            if (r4 != 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            if (r4 == r7) goto L_0x0112
        L_0x0106:
            int r4 = r3.f229984d     // Catch:{ all -> 0x000d }
            int r4 = com.google.android.apps.gsa.search.core.p6511ah.C84504k.m135127a(r4)     // Catch:{ all -> 0x000d }
            if (r4 != 0) goto L_0x0110
            goto L_0x0194
        L_0x0110:
            if (r4 != r7) goto L_0x0194
        L_0x0112:
            android.content.SharedPreferences r4 = r8.f229989d     // Catch:{ all -> 0x000d }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "last_run_version"
            int r6 = r8.f229988c     // Catch:{ all -> 0x000d }
            android.content.SharedPreferences$Editor r4 = r4.putInt(r5, r6)     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "last_run_system_build"
            android.content.SharedPreferences$Editor r1 = r4.putString(r5, r1)     // Catch:{ all -> 0x000d }
            r1.apply()     // Catch:{ all -> 0x000d }
            dagger.a r1 = r8.f229990e     // Catch:{ all -> 0x000d }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x000d }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x000d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x000d }
        L_0x0135:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x000d }
            if (r4 == 0) goto L_0x0145
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.search.core.ah.m r4 = (com.google.android.apps.gsa.search.core.p6511ah.C84506m) r4     // Catch:{ all -> 0x000d }
            r4.mo78211a(r3)     // Catch:{ all -> 0x000d }
            goto L_0x0135
        L_0x0145:
            int r1 = r3.f229982b     // Catch:{ all -> 0x000d }
            int r1 = com.google.android.apps.gsa.search.core.p6511ah.C84504k.m135127a(r1)     // Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x0194
            if (r1 != r7) goto L_0x0194
            com.google.common.o.uf r1 = com.google.common.p4552o.C60555uf.f164065cO     // Catch:{ all -> 0x000d }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x000d }
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1     // Catch:{ all -> 0x000d }
            r1.copyOnWrite()     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ all -> 0x000d }
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4     // Catch:{ all -> 0x000d }
            int r5 = r4.f164093a     // Catch:{ all -> 0x000d }
            r5 = r5 | r7
            r4.f164093a = r5     // Catch:{ all -> 0x000d }
            r5 = 927(0x39f, float:1.299E-42)
            r4.f164258m = r5     // Catch:{ all -> 0x000d }
            int r3 = r3.f229983c     // Catch:{ all -> 0x000d }
            r1.copyOnWrite()     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ all -> 0x000d }
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4     // Catch:{ all -> 0x000d }
            int r5 = r4.f164252g     // Catch:{ all -> 0x000d }
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r5 = r5 | r6
            r4.f164252g = r5     // Catch:{ all -> 0x000d }
            r4.f164189bq = r3     // Catch:{ all -> 0x000d }
            int r3 = r8.f229988c     // Catch:{ all -> 0x000d }
            r1.copyOnWrite()     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ all -> 0x000d }
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4     // Catch:{ all -> 0x000d }
            int r5 = r4.f164252g     // Catch:{ all -> 0x000d }
            r6 = 33554432(0x2000000, float:9.403955E-38)
            r5 = r5 | r6
            r4.f164252g = r5     // Catch:{ all -> 0x000d }
            r4.f164190br = r3     // Catch:{ all -> 0x000d }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x000d }
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1     // Catch:{ all -> 0x000d }
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r2, r2, r2)     // Catch:{ all -> 0x000d }
        L_0x0194:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return
        L_0x0196:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            goto L_0x0199
        L_0x0198:
            throw r1
        L_0x0199:
            goto L_0x0198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6511ah.C84507n.mo78212a():void");
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (z || z2) {
            mo78212a();
        }
    }
}
