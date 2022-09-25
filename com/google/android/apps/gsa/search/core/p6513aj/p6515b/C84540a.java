package com.google.android.apps.gsa.search.core.p6513aj.p6515b;

import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.aj.b.a */
/* compiled from: PG */
public final class C84540a implements Comparator {

    /* renamed from: a */
    public String f230070a;

    /* renamed from: b */
    public List f230071b;

    /* renamed from: c */
    private final Map f230072c;

    public C84540a(Map map) {
        this.f230072c = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo78256a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f230070a
            r1 = 45
            int r0 = r0.indexOf(r1)
            r2 = -1
            if (r0 != r2) goto L_0x0011
            java.lang.String r0 = r6.f230070a
            int r0 = r0.length()
        L_0x0011:
            java.lang.String r3 = r6.f230070a
            r4 = 0
            java.lang.String r0 = r3.substring(r4, r0)
            boolean r3 = r7.startsWith(r0)
            boolean r0 = r8.startsWith(r0)
            r5 = 1
            if (r3 != 0) goto L_0x0026
            if (r0 == 0) goto L_0x002b
            r0 = 1
        L_0x0026:
            if (r3 == 0) goto L_0x004f
            if (r0 != 0) goto L_0x002b
            goto L_0x004f
        L_0x002b:
            java.lang.String r0 = r6.f230070a
            int r0 = r0.lastIndexOf(r1)
            java.lang.String r1 = r6.f230070a
            int r0 = r0 + r5
            java.lang.String r0 = r1.substring(r0)
            boolean r7 = r7.endsWith(r0)
            boolean r8 = r8.endsWith(r0)
            if (r7 != 0) goto L_0x0045
            if (r8 == 0) goto L_0x004a
            r8 = 1
        L_0x0045:
            if (r7 == 0) goto L_0x004b
            if (r8 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return r4
        L_0x004b:
            if (r7 == 0) goto L_0x004e
            return r2
        L_0x004e:
            return r5
        L_0x004f:
            if (r3 == 0) goto L_0x0052
            return r2
        L_0x0052:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6513aj.p6515b.C84540a.mo78256a(java.lang.String, java.lang.String):int");
    }

    /* renamed from: b */
    public final List mo78257b(List list) {
        int size = list.size();
        ArrayList e = C58597ky.m90214e(size);
        for (int i = 0; i < size; i++) {
            C90580b bVar = (C90580b) this.f230072c.get(list.get(i));
            if (bVar != null) {
                e.add(bVar);
            }
        }
        return e;
    }

    /* renamed from: c */
    public final boolean mo78258c(String str) {
        return ((C90580b) this.f230072c.get(str)) != null;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        boolean d = mo78260d(str);
        boolean d2 = mo78260d(str2);
        if (d != d2) {
            return !d ? 1 : -1;
        }
        if (d && d2) {
            return mo78256a(str, str2);
        }
        boolean c = mo78258c(str);
        boolean c2 = mo78258c(str2);
        if (c != c2) {
            return !c ? 1 : -1;
        }
        if (!c || !c2) {
            return mo78256a(str, str2);
        }
        return mo78256a(str, str2);
    }

    /* renamed from: d */
    public final boolean mo78260d(String str) {
        C90580b bVar = (C90580b) this.f230072c.get(str);
        return (bVar == null || (bVar.f253239a & 8) == 0) ? false : true;
    }
}
