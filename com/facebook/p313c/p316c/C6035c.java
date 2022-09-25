package com.facebook.p313c.p316c;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.litho.C6234eh;
import com.facebook.litho.C6355gh;
import com.facebook.litho.C6365gr;
import java.util.List;

/* renamed from: com.facebook.c.c.c */
/* compiled from: PG */
public final class C6035c {
    /* renamed from: a */
    public static void m15517a(C6365gr grVar, List list, String str) {
        if (grVar instanceof C6355gh) {
            C6355gh ghVar = (C6355gh) grVar;
            ghVar.mo13373a();
            list.addAll(ghVar.f18799a);
        } else if (grVar != null) {
            list.add(grVar);
        } else {
            throw new IllegalStateException("[" + str + "] Adding null to transition list is not allowed.");
        }
    }

    /* renamed from: b */
    public static void m15518b(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + i, bounds.top + i2);
        if (drawable instanceof C6234eh) {
            ((C6234eh) drawable).mo13192a(i, i2);
        }
    }

    /* renamed from: c */
    public static void m15519c(Drawable drawable, int i, int i2) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
        if (drawable instanceof C6234eh) {
            C6234eh ehVar = (C6234eh) drawable;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15520d(com.facebook.litho.C6367gt r6, com.facebook.litho.C6365gr r7, com.facebook.litho.p322a.C6076i r8, com.facebook.litho.C6358gk r9) {
        /*
            boolean r0 = r7 instanceof com.facebook.litho.C6377hb
            r1 = 0
            if (r0 == 0) goto L_0x001b
            com.facebook.litho.hb r7 = (com.facebook.litho.C6377hb) r7
            java.util.ArrayList r7 = r7.f18872a
            int r0 = r7.size()
        L_0x000d:
            if (r1 >= r0) goto L_0x0095
            java.lang.Object r2 = r7.get(r1)
            com.facebook.litho.gr r2 = (com.facebook.litho.C6365gr) r2
            m15520d(r6, r2, r8, r9)
            int r1 = r1 + 1
            goto L_0x000d
        L_0x001b:
            boolean r0 = r7 instanceof com.facebook.litho.C6363gp
            if (r0 == 0) goto L_0x0078
            com.facebook.litho.gp r7 = (com.facebook.litho.C6363gp) r7
            com.facebook.litho.gg r0 = r7.f18816a
            com.facebook.litho.gi r0 = r0.f18797a
            int r2 = r0.f18806b
            int r2 = r2 + -1
            r3 = 1
            if (r2 == r3) goto L_0x004c
            r4 = 3
            if (r2 == r4) goto L_0x0057
            java.lang.String r2 = r7.f18818c
            java.lang.String r2 = r6.f18826c
            boolean r2 = com.facebook.litho.C6363gp.m17057e(r2)
            if (r2 == 0) goto L_0x0095
            java.lang.Object r0 = r0.f18805a
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String r6 = r6.f18825b
            int r2 = r0.length
            r4 = 0
        L_0x0041:
            if (r4 >= r2) goto L_0x005f
            r5 = r0[r4]
            if (r5 != r6) goto L_0x0049
            r1 = 1
            goto L_0x005f
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x004c:
            java.lang.String r1 = r7.f18818c
            java.lang.String r1 = r6.f18826c
            boolean r1 = com.facebook.litho.C6363gp.m17057e(r1)
            if (r1 != 0) goto L_0x0057
            goto L_0x0095
        L_0x0057:
            java.lang.String r6 = r6.f18825b
            java.lang.Object r0 = r0.f18805a
            boolean r1 = r6.equals(r0)
        L_0x005f:
            if (r1 == 0) goto L_0x0095
            com.facebook.litho.gg r6 = r7.f18816a
            com.facebook.litho.gj r6 = r6.f18798b
            java.lang.Object r6 = r6.f18807a
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0095
            r9.f18808a = r3
            boolean r6 = r7.mo13375a()
            if (r6 == 0) goto L_0x0095
            r9.f18809b = r7
            return
        L_0x0078:
            boolean r0 = r7 instanceof com.facebook.litho.C6355gh
            if (r0 == 0) goto L_0x0096
            com.facebook.litho.gh r7 = (com.facebook.litho.C6355gh) r7
            r7.mo13373a()
            java.util.ArrayList r7 = r7.f18799a
            int r0 = r7.size()
        L_0x0087:
            if (r1 >= r0) goto L_0x0095
            java.lang.Object r2 = r7.get(r1)
            com.facebook.litho.gr r2 = (com.facebook.litho.C6365gr) r2
            m15520d(r6, r2, r8, r9)
            int r1 = r1 + 1
            goto L_0x0087
        L_0x0095:
            return
        L_0x0096:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Unhandled transition type: "
            java.lang.String r7 = r8.concat(r7)
            r6.<init>(r7)
            goto L_0x00ab
        L_0x00aa:
            throw r6
        L_0x00ab:
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p313c.p316c.C6035c.m15520d(com.facebook.litho.gt, com.facebook.litho.gr, com.facebook.litho.a.i, com.facebook.litho.gk):void");
    }
}
