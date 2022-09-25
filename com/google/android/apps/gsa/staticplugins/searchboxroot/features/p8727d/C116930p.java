package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.C88615s;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88552c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.p */
/* compiled from: PG */
public final class C116930p implements C88552c, C89199d {

    /* renamed from: a */
    private final C86124t f324650a;

    /* renamed from: b */
    private final C84474e f324651b;

    /* renamed from: c */
    private final C86338r f324652c;

    /* renamed from: d */
    private int f324653d;

    public C116930p(C86124t tVar, C84474e eVar, C86338r rVar) {
        this.f324650a = tVar;
        this.f324651b = eVar;
        this.f324652c = rVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r0.equals("web.shop") != false) goto L_0x00a8;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo82214c(com.google.android.apps.gsa.searchbox.p6944c.C88616t r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.shared.search.Query r0 = r7.f239556a
            java.lang.String r0 = r0.mo84352bk()
            int r1 = r7.f239557b
            r2 = 3
            r3 = 7
            r4 = 1
            if (r1 == r4) goto L_0x000f
            if (r1 != r3) goto L_0x0017
        L_0x000f:
            int r0 = r0.length()
            int r1 = r6.f324653d
            if (r0 <= r1) goto L_0x0018
        L_0x0017:
            return r2
        L_0x0018:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f324650a
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250848o
            java.lang.String r0 = r0.mo79758x(r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x002d
            com.google.common.b.gz r1 = r7.f239562g
            java.lang.String r5 = "sugexp"
            r1.mo55429h(r5, r0)
        L_0x002d:
            com.google.android.apps.gsa.shared.search.Query r0 = r7.f239556a
            boolean r0 = r0.mo84405cl()
            r1 = 0
            if (r0 == 0) goto L_0x004e
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f324650a
            com.google.android.apps.gsa.shared.m.h r5 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250226d
            java.lang.String r0 = r0.mo79758x(r5)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004e
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f324650a
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250226d
            java.lang.String r0 = r0.mo79758x(r2)
            goto L_0x00c8
        L_0x004e:
            java.lang.String r0 = r7.f239558c
            int r5 = r0.hashCode()
            switch(r5) {
                case -764028567: goto L_0x009d;
                case -763880587: goto L_0x0093;
                case -763740848: goto L_0x008a;
                case 101486: goto L_0x0080;
                case 107868: goto L_0x0076;
                case 1222272944: goto L_0x006c;
                case 1222284848: goto L_0x0062;
                case 1222292087: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x00a7
        L_0x0058:
            java.lang.String r2 = "web.vid"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a7
            r2 = 2
            goto L_0x00a8
        L_0x0062:
            java.lang.String r2 = "web.nws"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x006c:
            java.lang.String r2 = "web.bks"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a7
            r2 = 4
            goto L_0x00a8
        L_0x0076:
            java.lang.String r2 = "map"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a7
            r2 = 5
            goto L_0x00a8
        L_0x0080:
            java.lang.String r2 = "flt"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a7
            r2 = 7
            goto L_0x00a8
        L_0x008a:
            java.lang.String r3 = "web.shop"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x0093:
            java.lang.String r2 = "web.nrby"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a7
            r2 = 6
            goto L_0x00a8
        L_0x009d:
            java.lang.String r2 = "web.isch"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a7
            r2 = 0
            goto L_0x00a8
        L_0x00a7:
            r2 = -1
        L_0x00a8:
            switch(r2) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00b4;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00ae;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            java.lang.String r0 = ""
            goto L_0x00c8
        L_0x00ae:
            java.lang.String r0 = "fl"
            goto L_0x00c8
        L_0x00b1:
            java.lang.String r0 = "m"
            goto L_0x00c8
        L_0x00b4:
            java.lang.String r0 = "bo"
            goto L_0x00c8
        L_0x00b7:
            java.lang.String r0 = "sh"
            goto L_0x00c8
        L_0x00ba:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f324650a
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250192bP
            java.lang.String r0 = r0.mo79758x(r2)
            goto L_0x00c8
        L_0x00c3:
            java.lang.String r0 = "n"
            goto L_0x00c8
        L_0x00c6:
            java.lang.String r0 = "i"
        L_0x00c8:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00d7
            com.google.common.b.gz r2 = r7.f239562g
            java.lang.String r3 = "ds"
            r2.mo55429h(r3, r0)
        L_0x00d7:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f324650a
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250817ai
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x0112
            com.google.android.apps.gsa.search.core.ag.a.e r0 = r6.f324651b
            boolean r0 = r0.mo78070O()
            if (r0 != 0) goto L_0x00ea
            goto L_0x0112
        L_0x00ea:
            com.google.android.apps.gsa.search.core.preferences.r r0 = r6.f324652c
            java.lang.String r2 = "onboarding_num_searches_performed"
            int r0 = r0.getInt(r2, r1)
            com.google.android.apps.gsa.shared.search.Query r1 = r7.f239556a
            java.lang.String r1 = r1.f252770i
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0112
            long r0 = (long) r0
            com.google.android.apps.gsa.search.core.i.t r2 = r6.f324650a
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250816ah
            long r2 = r2.mo79743a(r3)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0112
            com.google.common.b.gz r7 = r7.f239562g
            java.lang.String r0 = "nolsbt"
            java.lang.String r1 = "1"
            r7.mo55429h(r0, r1)
        L_0x0112:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116930p.mo82214c(com.google.android.apps.gsa.searchbox.c.t):int");
    }

    /* renamed from: hD */
    public final /* synthetic */ void mo82217hD(Object obj) {
        C88615s sVar = (C88615s) obj;
        this.f324653d = 100;
    }
}
