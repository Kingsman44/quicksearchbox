package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.libraries.gcoreclient.p1753c.C21451a;
import com.google.android.libraries.gcoreclient.p1753c.C21479b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21454b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21461i;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21465m;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21466n;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55032di;
import com.google.p4152bb.p4153a.C55035dl;
import com.google.p4152bb.p4153a.C55136he;
import dagger.C68214a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.f */
/* compiled from: PG */
public final class C84579f {

    /* renamed from: a */
    private static final C59071e f230175a = C59071e.m91332i("com.google.android.apps.gsa.search.core.ak.a.f");

    /* renamed from: b */
    private static final Pattern f230176b = Pattern.compile("\\p{Punct}");

    /* renamed from: c */
    private C84425ag f230177c;

    /* renamed from: d */
    private final C68214a f230178d;

    /* renamed from: e */
    private final C68214a f230179e;

    public C84579f(C84425ag agVar, C68214a aVar, C68214a aVar2) {
        this.f230177c = agVar;
        this.f230178d = aVar;
        this.f230179e = aVar2;
    }

    public C84579f(C58833ax axVar, C68214a aVar, C68214a aVar2) {
        this((C84425ag) axVar.mo56111f(), aVar, aVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r3 = r3.f144797e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m135316b(com.google.p4152bb.p4153a.C55035dl r3, java.lang.String r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r2 = 0
            if (r0 != 0) goto L_0x008f
            int r0 = r3.f144793a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x008a
            int r3 = r3.f144797e
            int r0 = com.google.p4152bb.p4153a.C55034dk.m87563a(r3)
            if (r0 != 0) goto L_0x001e
            goto L_0x008a
        L_0x001e:
            if (r0 == r1) goto L_0x008a
            int r3 = com.google.p4152bb.p4153a.C55034dk.m87563a(r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0089
        L_0x0027:
            r0 = 2
            if (r3 != r0) goto L_0x0089
            java.lang.String r3 = r4.toLowerCase()
            java.lang.String r4 = r5.toLowerCase()
            boolean r5 = r3.contains(r4)
            if (r5 != 0) goto L_0x0039
            return r2
        L_0x0039:
            int r5 = r3.indexOf(r4)
            java.lang.String r0 = r3.substring(r2, r5)
            java.lang.String r0 = r0.trim()
            int r4 = r4.length()
            int r5 = r5 + r4
            java.lang.String r3 = r3.substring(r5)
            java.lang.String r3 = r3.trim()
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0071
            java.util.regex.Pattern r4 = f230176b
            int r5 = r0.length()
            int r5 = r5 + -1
            java.lang.String r5 = r0.substring(r5)
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = 0
            goto L_0x0088
        L_0x0071:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0088
            java.util.regex.Pattern r4 = f230176b
            java.lang.String r3 = r3.substring(r2, r1)
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x0088
            goto L_0x006f
        L_0x0088:
            return r1
        L_0x0089:
            return r2
        L_0x008a:
            boolean r3 = r5.equalsIgnoreCase(r4)
            return r3
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84579f.m135316b(com.google.bb.a.dl, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final C84578e mo78340a(C55035dl dlVar) {
        if (this.f230177c == null || dlVar == null || dlVar.f144796d.size() == 0) {
            ((C59052c) ((C59052c) f230175a.mo56226d()).mo56372aa(9464)).mo56386p("getFirstIcingMatch: Icing connection or query constraint is null.");
            return null;
        }
        C21466n nVar = (C21466n) this.f230178d.mo27525b();
        C142826w wVar = new C142826w();
        String str = dlVar.f144795c;
        if (!TextUtils.isEmpty(str)) {
            boolean z = false;
            boolean z2 = false;
            for (C55032di diVar : dlVar.f144796d) {
                if (!diVar.f144782d.isEmpty()) {
                    C21461i iVar = (C21461i) this.f230179e.mo27525b();
                    wVar.mo117756b(C21461i.m40576a(str, diVar.f144782d).f59908a);
                    z2 = true;
                }
            }
            if (!z2) {
                C143919bh.m233971n(str, "Package name can't be null.");
                if (!wVar.f387608a.containsKey(str) || ((Set) wVar.f387608a.get(str)).isEmpty()) {
                    z = true;
                }
                C143919bh.m233967j(z, "Corpus specific filter already exists.");
                wVar.f387608a.put(str, Collections.emptySet());
            }
        }
        C21479b g = this.f230177c.mo78000g(dlVar.f144794b, 20, C21465m.m40577a(wVar));
        if (g != null) {
            C21451a b = g.mo26953b();
            while (b.hasNext()) {
                C21454b bVar = (C21454b) b.next();
                Iterator it = dlVar.f144796d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C55032di diVar2 = (C55032di) it.next();
                        boolean isEmpty = diVar2.f144782d.isEmpty();
                        String h = bVar.f59905a.mo117712h("text1");
                        String h2 = bVar.f59905a.mo117712h("text2");
                        String e = bVar.f59905a.mo117709e();
                        if ((!(!isEmpty) || diVar2.f144782d.equals(e)) && m135316b(dlVar, h, diVar2.f144780b) && m135316b(dlVar, h2, diVar2.f144781c)) {
                            int i = diVar2.f144779a;
                            int i2 = (i & 16) != 0 ? diVar2.f144784f : -1;
                            String str2 = (i & 128) != 0 ? diVar2.f144786h : h2;
                            String h3 = bVar.f59905a.mo117712h("icon");
                            String h4 = bVar.f59905a.mo117712h("intent_data");
                            String h5 = bVar.f59905a.mo117712h("intent_extra_data");
                            String str3 = diVar2.f144785g;
                            int i3 = diVar2.f144783e;
                            C55136he heVar = diVar2.f144787i;
                            if (heVar == null) {
                                heVar = C55136he.f145130j;
                            }
                            return new C84578e(h, str2, h3, h4, h5, str, str3, i3, i2, heVar);
                        }
                    }
                }
            }
        }
        return null;
    }
}
