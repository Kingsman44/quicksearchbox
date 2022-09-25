package com.google.android.libraries.search.assistant.proactive.p2777i.p2778a;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36262a;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.proactive.i.a.b */
/* compiled from: PG */
public final class C36318b {
    /* renamed from: a */
    public static Uri m64802a(C36265d dVar) {
        return Uri.parse("assistant-app-shortcuts://android/buttonAction").buildUpon().appendQueryParameter("appActionsNotificationsInfo", Base64.encodeToString(dVar.toByteArray(), 10)).build();
    }

    /* renamed from: b */
    public static C58833ax m64803b(String str) {
        if (C58837ba.m90859h(str) || !str.startsWith("assistant-app-shortcuts://android")) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("appActionsNotificationsInfo");
        if (queryParameter == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(new Intent().putExtra("appActionsNotificationsInfo", queryParameter));
    }

    /* renamed from: c */
    public static Uri m64804c(String str, int i) {
        C36262a aVar = (C36262a) C36265d.f94713k.createBuilder();
        aVar.copyOnWrite();
        C36265d dVar = (C36265d) aVar.instance;
        str.getClass();
        dVar.f94715a |= 2;
        dVar.f94717c = str;
        aVar.copyOnWrite();
        C36265d dVar2 = (C36265d) aVar.instance;
        dVar2.f94718d = i - 1;
        dVar2.f94715a |= 4;
        return m64802a((C36265d) aVar.build());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        if (r5.isEmpty() == false) goto L_0x005e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m64805d(java.lang.String r4, int r5, com.google.assistant.p3861at.C49826ak r6, p3186j$.util.Optional r7, com.google.assistant.p3861at.C49845bc r8) {
        /*
            com.google.android.libraries.search.assistant.proactive.f.d r0 = com.google.android.libraries.search.assistant.proactive.p2774f.C36265d.f94713k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.assistant.proactive.f.a r0 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36262a) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.search.assistant.proactive.f.d r1 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r1
            r6.getClass()
            r1.f94716b = r6
            int r6 = r1.f94715a
            r2 = 1
            r6 = r6 | r2
            r1.f94715a = r6
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.libraries.search.assistant.proactive.f.d r6 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r6
            r4.getClass()
            int r1 = r6.f94715a
            r3 = 2
            r1 = r1 | r3
            r6.f94715a = r1
            r6.f94717c = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.libraries.search.assistant.proactive.f.d r4 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r4
            int r5 = r5 + -1
            r4.f94718d = r5
            int r5 = r4.f94715a
            r5 = r5 | 4
            r4.f94715a = r5
            int r4 = r8.f129540a
            java.lang.String r5 = ""
            if (r4 != r2) goto L_0x0048
            java.lang.Object r4 = r8.f129541b
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0049
        L_0x0048:
            r4 = r5
        L_0x0049:
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x005e
            int r4 = r8.f129540a
            if (r4 != r3) goto L_0x0058
            java.lang.Object r4 = r8.f129541b
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x0058:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0070
        L_0x005e:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.libraries.search.assistant.proactive.f.d r4 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r4
            r8.getClass()
            r4.f94723i = r8
            int r5 = r4.f94715a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r4.f94715a = r5
        L_0x0070:
            p3186j$.util.Objects.requireNonNull(r0)
            com.google.android.libraries.search.assistant.proactive.i.a.a r4 = new com.google.android.libraries.search.assistant.proactive.i.a.a
            r4.<init>(r0)
            r7.ifPresent(r4)
            com.google.protobuf.bv r4 = r0.build()
            com.google.android.libraries.search.assistant.proactive.f.d r4 = (com.google.android.libraries.search.assistant.proactive.p2774f.C36265d) r4
            android.net.Uri r4 = m64802a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36318b.m64805d(java.lang.String, int, com.google.assistant.at.ak, j$.util.Optional, com.google.assistant.at.bc):android.net.Uri");
    }
}
