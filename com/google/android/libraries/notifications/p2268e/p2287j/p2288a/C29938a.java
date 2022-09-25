package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.text.TextUtils;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29958i;
import com.google.common.base.C58833ax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.j.a.a */
/* compiled from: PG */
public final class C29938a implements C29958i {

    /* renamed from: a */
    private final C58833ax f81073a;

    /* renamed from: b */
    private final C29835a f81074b;

    public C29938a(C58833ax axVar, C29835a aVar) {
        this.f81073a = axVar;
        this.f81074b = aVar;
    }

    /* renamed from: b */
    private static String m55461b(C29820k kVar) {
        if (kVar == null) {
            return null;
        }
        return String.valueOf(kVar.mo35004d());
    }

    /* renamed from: c */
    private static String m55462c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C29827r) it.next()).mo35063j());
        }
        return TextUtils.join(", ", arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35229a(com.google.android.libraries.notifications.p2265b.C29780d r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.mo34967g()
            com.google.android.libraries.notifications.data.k r1 = r12.mo34962c()
            java.util.List r2 = r12.mo34968h()
            boolean r3 = r12.mo34970i()
            android.content.Intent r12 = r12.mo34961b()
            if (r12 != 0) goto L_0x0017
            goto L_0x0022
        L_0x0017:
            java.lang.String r4 = "com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA"
            boolean r5 = r12.hasExtra(r4)
            if (r5 == 0) goto L_0x0022
            r12.getBundleExtra(r4)
        L_0x0022:
            java.lang.String r12 = "com.google.android.libraries.notifications.NOTIFICATION_CLICKED"
            boolean r12 = r12.equals(r0)
            java.lang.String r4 = "EventCallbackHelper"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r12 == 0) goto L_0x0070
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r0 = m55461b(r1)
            r12[r7] = r0
            java.lang.String r0 = m55462c(r2)
            r12[r6] = r0
            java.lang.String r0 = "Notification clicked for account ID [%s], on threads [%s]"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55793e(r4, r0, r12)
            com.google.android.libraries.notifications.e.b.a.a r12 = r11.f81074b
            com.google.bf.a.b.bz r0 = com.google.p4160bf.p4161a.p4163b.C55489bz.CLICKED
            com.google.android.libraries.notifications.e.b.a r12 = r12.mo35159a(r0)
            r12.mo35157v()
            r12.mo35145j(r1)
            r12.mo35140e(r2)
            r12.mo35136a()
            if (r3 == 0) goto L_0x0064
            com.google.common.base.ax r12 = r11.f81073a
            com.google.common.base.bk r12 = (com.google.common.base.C58847bk) r12
            java.lang.Object r12 = r12.f156646a
            com.google.android.libraries.notifications.h.g r12 = (com.google.android.libraries.notifications.p2293h.C30014g) r12
            r12.mo35337d(r1, r2)
            return
        L_0x0064:
            com.google.common.base.ax r12 = r11.f81073a
            com.google.common.base.bk r12 = (com.google.common.base.C58847bk) r12
            java.lang.Object r12 = r12.f156646a
            com.google.android.libraries.notifications.h.g r12 = (com.google.android.libraries.notifications.p2293h.C30014g) r12
            r12.mo35336c(r1, r2)
            return
        L_0x0070:
            java.lang.String r12 = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x00ab
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r0 = m55461b(r1)
            r12[r7] = r0
            java.lang.String r0 = m55462c(r2)
            r12[r6] = r0
            java.lang.String r0 = "Notification removed for account ID [%s], on threads [%s]"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55793e(r4, r0, r12)
            com.google.android.libraries.notifications.e.b.a.a r12 = r11.f81074b
            com.google.bf.a.b.bz r0 = com.google.p4160bf.p4161a.p4163b.C55489bz.DISMISSED
            com.google.android.libraries.notifications.e.b.a r12 = r12.mo35159a(r0)
            r12.mo35157v()
            r12.mo35145j(r1)
            r12.mo35140e(r2)
            r12.mo35136a()
            com.google.common.base.ax r12 = r11.f81073a
            com.google.common.base.bk r12 = (com.google.common.base.C58847bk) r12
            java.lang.Object r12 = r12.f156646a
            com.google.android.libraries.notifications.h.g r12 = (com.google.android.libraries.notifications.p2293h.C30014g) r12
            r12.mo35340g(r2)
            return
        L_0x00ab:
            java.lang.String r12 = "com.google.android.libraries.notifications.NOTIFICATION_EXPIRED"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L_0x00e3
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r0 = m55461b(r1)
            r12[r7] = r0
            java.lang.String r0 = m55462c(r2)
            r12[r6] = r0
            java.lang.String r0 = "Notification expired for account ID [%s], on threads [%s]"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55793e(r4, r0, r12)
            com.google.android.libraries.notifications.e.b.a.a r12 = r11.f81074b
            com.google.bf.a.b.bz r0 = com.google.p4160bf.p4161a.p4163b.C55489bz.EXPIRED
            com.google.android.libraries.notifications.e.b.a r12 = r12.mo35159a(r0)
            r12.mo35145j(r1)
            r12.mo35140e(r2)
            r12.mo35136a()
            com.google.common.base.ax r12 = r11.f81073a
            com.google.common.base.bk r12 = (com.google.common.base.C58847bk) r12
            java.lang.Object r12 = r12.f156646a
            com.google.android.libraries.notifications.h.g r12 = (com.google.android.libraries.notifications.p2293h.C30014g) r12
            r12.mo35338e(r2)
            return
        L_0x00e3:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x0181
            int r12 = r2.size()
            if (r12 != r6) goto L_0x00f1
            r12 = 1
            goto L_0x00f2
        L_0x00f1:
            r12 = 0
        L_0x00f2:
            com.google.common.base.C58838bb.m90868c(r12)
            java.lang.Object r12 = r2.get(r7)
            com.google.android.libraries.notifications.data.r r12 = (com.google.android.libraries.notifications.data.C29827r) r12
            java.util.List r12 = r12.mo35066m()
            java.util.Iterator r12 = r12.iterator()
        L_0x0103:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x011e
            java.lang.Object r8 = r12.next()
            com.google.android.libraries.notifications.data.o r8 = (com.google.android.libraries.notifications.data.C29824o) r8
            java.lang.String r9 = r8.mo35026f()
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0103
            com.google.bf.b.a.a.d r12 = r8.mo35133m()
            goto L_0x011f
        L_0x011e:
            r12 = 0
        L_0x011f:
            java.lang.Object r0 = r2.get(r7)
            com.google.android.libraries.notifications.data.r r0 = (com.google.android.libraries.notifications.data.C29827r) r0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r8 = r12.f146614b
            java.lang.String r9 = ""
            r10 = 4
            if (r8 != r10) goto L_0x0134
            java.lang.Object r8 = r12.f146615c
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0135
        L_0x0134:
            r8 = r9
        L_0x0135:
            r2[r7] = r8
            java.lang.String r7 = m55461b(r1)
            r2[r6] = r7
            java.lang.String r6 = r0.mo35063j()
            r2[r5] = r6
            java.lang.String r5 = "Notification action [%s] clicked for account ID [%s], on thread [%s]"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55793e(r4, r5, r2)
            com.google.android.libraries.notifications.e.b.a.a r2 = r11.f81074b
            com.google.bf.a.b.bz r4 = com.google.p4160bf.p4161a.p4163b.C55489bz.ACTION_CLICK
            com.google.android.libraries.notifications.e.b.a r2 = r2.mo35159a(r4)
            r2.mo35157v()
            int r4 = r12.f146614b
            if (r4 != r10) goto L_0x015c
            java.lang.Object r4 = r12.f146615c
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
        L_0x015c:
            r2.mo35137b(r9)
            r2.mo35145j(r1)
            r2.mo35139d(r0)
            r2.mo35136a()
            if (r3 == 0) goto L_0x0176
            com.google.common.base.ax r2 = r11.f81073a
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            com.google.android.libraries.notifications.h.g r2 = (com.google.android.libraries.notifications.p2293h.C30014g) r2
            r2.mo35335b(r1, r0, r12)
            return
        L_0x0176:
            com.google.common.base.ax r2 = r11.f81073a
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            com.google.android.libraries.notifications.h.g r2 = (com.google.android.libraries.notifications.p2293h.C30014g) r2
            r2.mo35334a(r1, r0, r12)
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29938a.mo35229a(com.google.android.libraries.notifications.b.d):void");
    }
}
