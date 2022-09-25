package com.google.android.libraries.logging;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60214n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p3186j$.util.DesugarCollections;

@Deprecated
/* renamed from: com.google.android.libraries.logging.m */
/* compiled from: PG */
public final class C28295m {

    /* renamed from: a */
    private static final Map f76980a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public static C28292j m52915a(View view) {
        if (view == null) {
            return null;
        }
        Map map = f76980a;
        if (!map.containsKey(view)) {
            m52918d(view);
        }
        return (C28292j) map.get(view);
    }

    /* renamed from: b */
    public static C28293k m52916b(View view) {
        List list;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            list = new ArrayList(viewGroup.getChildCount());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                list.add(m52916b(viewGroup.getChildAt(i)));
            }
        } else {
            list = Collections.emptyList();
        }
        return C28293k.m52907d(m52915a(view), list);
    }

    /* renamed from: c */
    public static Map m52917c() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : f76980a.entrySet()) {
            View view = (View) entry.getKey();
            C28292j jVar = (C28292j) entry.getValue();
            if (!(view == null || jVar == null)) {
                C28292j jVar2 = new C28292j(((C60214n) jVar.f76973a.instance).f162918c);
                jVar2.f76973a.mergeFrom((C60214n) jVar.f76973a.build());
                jVar2.f76974b.mergeFrom((aqs) jVar.f76974b.build());
                jVar2.f76975c.addAll(jVar.f76975c);
                jVar2.f76977e = jVar.f76977e;
                jVar2.f76976d = jVar.f76976d;
                weakHashMap.put(view, jVar2);
            }
        }
        return weakHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m52918d(android.view.View r13) {
        /*
            java.lang.Object r0 = r13.getTag()
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x00cd
            java.util.Map r1 = f76980a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "ve="
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x0017
            goto L_0x00c9
        L_0x0017:
            r3 = 3
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r3 = ";visibility:hidden"
            int r4 = r0.indexOf(r3)
            r5 = 1
            r6 = 0
            if (r4 < 0) goto L_0x002e
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r3, r4)
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            java.lang.String r4 = ";track:"
            int r4 = r0.indexOf(r4)
            r7 = -1
            if (r4 != r7) goto L_0x003c
            int r4 = r0.length()
        L_0x003c:
            java.lang.String r8 = r0.substring(r6, r4)     // Catch:{ NumberFormatException -> 0x00c9 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x00c9 }
            com.google.android.libraries.logging.j r9 = new com.google.android.libraries.logging.j
            r9.<init>(r8)
            r8 = 2
            if (r3 == 0) goto L_0x004f
            r9.mo33794h(r8)
        L_0x004f:
            int r4 = r4 + 7
            int r3 = r0.length()
            if (r4 < r3) goto L_0x0059
            goto L_0x00c8
        L_0x0059:
            java.lang.String r0 = r0.substring(r4)
            java.lang.String r3 = ","
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            r4 = 0
        L_0x0065:
            if (r4 >= r3) goto L_0x00c8
            r10 = r0[r4]
            int r11 = r10.hashCode()
            r12 = 3091764(0x2f2d34, float:4.332484E-39)
            if (r11 == r12) goto L_0x0091
            r12 = 3092207(0x2f2eef, float:4.333105E-39)
            if (r11 == r12) goto L_0x0087
            r12 = 94750088(0x5a5c588, float:1.5589087E-35)
            if (r11 == r12) goto L_0x007d
            goto L_0x009b
        L_0x007d:
            java.lang.String r11 = "click"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x009b
            r10 = 0
            goto L_0x009c
        L_0x0087:
            java.lang.String r11 = "drop"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x009b
            r10 = 2
            goto L_0x009c
        L_0x0091:
            java.lang.String r11 = "drag"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x009b
            r10 = 1
            goto L_0x009c
        L_0x009b:
            r10 = -1
        L_0x009c:
            if (r10 == 0) goto L_0x00bb
            if (r10 == r5) goto L_0x00af
            if (r10 == r8) goto L_0x00a3
            goto L_0x00c9
        L_0x00a3:
            java.util.Set r10 = r9.f76975c
            r11 = 37
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.add(r11)
            goto L_0x00c5
        L_0x00af:
            java.util.Set r10 = r9.f76975c
            r11 = 30
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.add(r11)
            goto L_0x00c5
        L_0x00bb:
            java.util.Set r10 = r9.f76975c
            r11 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.add(r11)
        L_0x00c5:
            int r4 = r4 + 1
            goto L_0x0065
        L_0x00c8:
            r2 = r9
        L_0x00c9:
            r1.put(r13, r2)
            return
        L_0x00cd:
            java.util.Map r0 = f76980a
            r0.put(r13, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.logging.C28295m.m52918d(android.view.View):void");
    }

    /* renamed from: e */
    public static void m52919e(View view, C28292j jVar) {
        f76980a.put(view, jVar);
    }
}
