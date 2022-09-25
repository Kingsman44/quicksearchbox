package com.google.android.libraries.notifications.p2265b;

import android.content.Intent;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55568d;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.b.b */
/* compiled from: PG */
final class C29778b extends C29780d {

    /* renamed from: a */
    private final int f80692a;

    /* renamed from: b */
    private final String f80693b;

    /* renamed from: c */
    private final C29820k f80694c;

    /* renamed from: d */
    private final List f80695d;

    /* renamed from: e */
    private final C55564bq f80696e;

    /* renamed from: f */
    private final Intent f80697f;

    /* renamed from: g */
    private final C30004l f80698g;

    /* renamed from: h */
    private final C55568d f80699h;

    /* renamed from: i */
    private final boolean f80700i;

    /* renamed from: j */
    private final int f80701j;

    /* renamed from: k */
    private final int f80702k;

    public C29778b(int i, int i2, String str, C29820k kVar, List list, C55564bq bqVar, int i3, Intent intent, C30004l lVar, C55568d dVar, boolean z) {
        this.f80701j = i;
        this.f80692a = i2;
        this.f80693b = str;
        this.f80694c = kVar;
        this.f80695d = list;
        this.f80696e = bqVar;
        this.f80702k = i3;
        this.f80697f = intent;
        this.f80698g = lVar;
        this.f80699h = dVar;
        this.f80700i = z;
    }

    /* renamed from: a */
    public final int mo34960a() {
        return this.f80692a;
    }

    /* renamed from: b */
    public final Intent mo34961b() {
        return this.f80697f;
    }

    /* renamed from: c */
    public final C29820k mo34962c() {
        return this.f80694c;
    }

    /* renamed from: d */
    public final C30004l mo34963d() {
        return this.f80698g;
    }

    /* renamed from: e */
    public final C55568d mo34964e() {
        return this.f80699h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r1 = r4.f80694c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        r1 = r4.f80697f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r1 = r4.f80699h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r4.f80693b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.p2265b.C29780d
            r2 = 0
            if (r1 == 0) goto L_0x00a5
            com.google.android.libraries.notifications.b.d r5 = (com.google.android.libraries.notifications.p2265b.C29780d) r5
            int r1 = r4.f80701j
            int r3 = r5.mo34971j()
            if (r1 != r3) goto L_0x00a5
            int r1 = r4.f80692a
            int r3 = r5.mo34960a()
            if (r1 != r3) goto L_0x00a5
            java.lang.String r1 = r4.f80693b
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = r5.mo34967g()
            if (r1 != 0) goto L_0x00a5
            goto L_0x0030
        L_0x0026:
            java.lang.String r3 = r5.mo34967g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a5
        L_0x0030:
            com.google.android.libraries.notifications.data.k r1 = r4.f80694c
            if (r1 != 0) goto L_0x003b
            com.google.android.libraries.notifications.data.k r1 = r5.mo34962c()
            if (r1 != 0) goto L_0x00a5
            goto L_0x0045
        L_0x003b:
            com.google.android.libraries.notifications.data.k r3 = r5.mo34962c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a5
        L_0x0045:
            java.util.List r1 = r4.f80695d
            java.util.List r3 = r5.mo34968h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a5
            com.google.bf.b.a.a.bq r1 = r4.f80696e
            com.google.bf.b.a.a.bq r3 = r5.mo34966f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a5
            int r1 = r4.f80702k
            int r3 = r5.mo34972k()
            if (r1 != r3) goto L_0x00a5
            android.content.Intent r1 = r4.f80697f
            if (r1 != 0) goto L_0x0070
            android.content.Intent r1 = r5.mo34961b()
            if (r1 != 0) goto L_0x00a5
            goto L_0x007a
        L_0x0070:
            android.content.Intent r3 = r5.mo34961b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a5
        L_0x007a:
            com.google.android.libraries.notifications.g.l r1 = r4.f80698g
            com.google.android.libraries.notifications.g.l r3 = r5.mo34963d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a5
            com.google.bf.b.a.a.d r1 = r4.f80699h
            if (r1 != 0) goto L_0x0091
            com.google.bf.b.a.a.d r1 = r5.mo34964e()
            if (r1 != 0) goto L_0x00a5
            goto L_0x009c
        L_0x0091:
            com.google.bf.b.a.a.d r3 = r5.mo34964e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x009c
            goto L_0x00a5
        L_0x009c:
            boolean r1 = r4.f80700i
            boolean r5 = r5.mo34970i()
            if (r1 != r5) goto L_0x00a5
            return r0
        L_0x00a5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2265b.C29778b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C55564bq mo34966f() {
        return this.f80696e;
    }

    /* renamed from: g */
    public final String mo34967g() {
        return this.f80693b;
    }

    /* renamed from: h */
    public final List mo34968h() {
        return this.f80695d;
    }

    /* renamed from: i */
    public final boolean mo34970i() {
        return this.f80700i;
    }

    /* renamed from: j */
    public final int mo34971j() {
        return this.f80701j;
    }

    /* renamed from: k */
    public final int mo34972k() {
        return this.f80702k;
    }

    public final String toString() {
        int i = this.f80701j;
        String str = i != 1 ? i != 2 ? "API" : "INBOX" : "SYSTEM_TRAY";
        int i2 = this.f80692a;
        String str2 = this.f80693b;
        String valueOf = String.valueOf(this.f80694c);
        String obj = this.f80695d.toString();
        String obj2 = this.f80696e.toString();
        String num = Integer.toString(this.f80702k - 1);
        String valueOf2 = String.valueOf(this.f80697f);
        String obj3 = this.f80698g.toString();
        String valueOf3 = String.valueOf(this.f80699h);
        boolean z = this.f80700i;
        return "NotificationEvent{source=" + str + ", type=" + i2 + ", actionId=" + str2 + ", account=" + valueOf + ", threads=" + obj + ", threadStateUpdate=" + obj2 + ", removeReason=" + num + ", intent=" + valueOf2 + ", localThreadState=" + obj3 + ", action=" + valueOf3 + ", activityLaunched=" + z + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = (((this.f80701j ^ 1000003) * 1000003) ^ this.f80692a) * 1000003;
        String str = this.f80693b;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i4 ^ i) * 1000003;
        C29820k kVar = this.f80694c;
        if (kVar == null) {
            i2 = 0;
        } else {
            i2 = kVar.hashCode();
        }
        int hashCode = (((((((i6 ^ i2) * 1000003) ^ this.f80695d.hashCode()) * 1000003) ^ this.f80696e.hashCode()) * 1000003) ^ this.f80702k) * 1000003;
        Intent intent = this.f80697f;
        if (intent == null) {
            i3 = 0;
        } else {
            i3 = intent.hashCode();
        }
        int hashCode2 = (((hashCode ^ i3) * 1000003) ^ this.f80698g.hashCode()) * 1000003;
        C55568d dVar = this.f80699h;
        if (dVar != null) {
            i5 = dVar.hashCode();
        }
        return ((hashCode2 ^ i5) * 1000003) ^ (true != this.f80700i ? 1237 : 1231);
    }
}
