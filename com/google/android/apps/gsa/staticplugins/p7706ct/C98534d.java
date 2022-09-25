package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.grammar.pumpkin.C66528t;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.d */
/* compiled from: PG */
public final class C98534d extends C66528t {

    /* renamed from: a */
    private final bg f275140a;

    public C98534d(bg bgVar) {
        this.f275140a = bgVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        r2 = r8;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m163221c(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.contacts.bg r0 = r11.f275140a
            boolean r0 = r0.e(r12)
            if (r0 == 0) goto L_0x0009
            return r12
        L_0x0009:
            java.lang.String r0 = " "
            java.lang.String[] r12 = r12.split(r0)
            int r1 = r12.length
            java.lang.String r2 = ""
            r3 = 1
            if (r1 != r3) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            r6 = 0
            r7 = 0
        L_0x0022:
            if (r7 >= r1) goto L_0x0060
            r8 = r12[r7]
            int r9 = r4.length()
            if (r9 != 0) goto L_0x003c
            com.google.android.apps.gsa.contacts.bg r9 = r11.f275140a
            boolean r9 = r9.e(r8)
            if (r9 == 0) goto L_0x0038
            r4.append(r8)
            goto L_0x005d
        L_0x0038:
            r5.add(r8)
            goto L_0x005d
        L_0x003c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r4)
            r9.append(r0)
            r9.append(r8)
            com.google.android.apps.gsa.contacts.bg r10 = r11.f275140a
            java.lang.String r9 = r9.toString()
            boolean r9 = r10.e(r9)
            if (r9 == 0) goto L_0x005a
            r4.append(r0)
            r4.append(r8)
            goto L_0x005d
        L_0x005a:
            r5.add(r8)
        L_0x005d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0060:
            int r12 = r4.length()
            if (r12 != 0) goto L_0x0067
            return r2
        L_0x0067:
            int r12 = r5.size()
            if (r12 <= 0) goto L_0x00f9
            com.google.android.apps.gsa.contacts.bg r12 = r11.f275140a
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r1 = r4.toString()
            r0[r6] = r1
            java.util.ArrayList r0 = com.google.common.p4522b.C58597ky.m90212c(r0)
            r1 = 5
            java.lang.String r2 = "agsa_pumpkin_contact_nav_validator"
            java.util.List r12 = r12.i(r0, r1, r2)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x008f
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = r4.toString()
            return r12
        L_0x008f:
            java.util.Iterator r12 = r12.iterator()
        L_0x0093:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r12.next()
            com.google.android.apps.gsa.search.shared.contact.Person r0 = (com.google.android.apps.gsa.search.shared.contact.Person) r0
            com.google.android.apps.gsa.contacts.bg r1 = r11.f275140a
            long r2 = r0.f236371b
            com.google.android.apps.gsa.search.shared.contact.c r0 = com.google.android.apps.gsa.search.shared.contact.C87515c.POSTAL_ADDRESS
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            com.google.android.apps.gsa.search.shared.contact.Person r0 = r1.h(r2, r0)
            if (r0 == 0) goto L_0x0093
            java.util.List r1 = r0.f236376g
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0093
            int r1 = r5.size()
            r2 = 0
        L_0x00c0:
            if (r2 >= r1) goto L_0x0093
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r7 = r0.f236376g
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89842j(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x00d2:
            int r8 = r2 + 1
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00f7
            java.lang.Object r8 = r7.next()
            com.google.android.apps.gsa.search.shared.contact.Contact r8 = (com.google.android.apps.gsa.search.shared.contact.Contact) r8
            java.lang.String r8 = r8.f236355f
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 == 0) goto L_0x00d2
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = ":"
            r4.append(r12)
            r4.append(r3)
            java.lang.String r12 = r4.toString()
            return r12
        L_0x00f7:
            r2 = r8
            goto L_0x00c0
        L_0x00f9:
            java.lang.String r12 = r4.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7706ct.C98534d.m163221c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        C89949q.m146523g(1198);
        C90748e.m148224b();
        if (str.length() < 2) {
            C58976aa aaVar = C58975e.f156826a;
            return 0.0f;
        }
        String c = m163221c(str);
        C58976aa aaVar2 = C58975e.f156826a;
        if (c.isEmpty()) {
            return 0.0f;
        }
        return C98555y.m163249a(str);
    }

    /* renamed from: b */
    public final String mo59674b(String str) {
        return m163221c(str);
    }
}
