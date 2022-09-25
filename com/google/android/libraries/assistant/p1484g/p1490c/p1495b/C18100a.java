package com.google.android.libraries.assistant.p1484g.p1490c.p1495b;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1501e.C18147a;
import java.util.Arrays;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.g.c.b.a */
/* compiled from: PG */
public final class C18100a {

    /* renamed from: a */
    public final Bundle f51574a;

    /* renamed from: b */
    private final C18101b f51575b;

    private C18100a(C18101b bVar, Bundle bundle) {
        this.f51575b = bVar;
        this.f51574a = bundle;
    }

    /* renamed from: a */
    public static C18100a m35255a(C18101b bVar) {
        return new C18100a(bVar, bVar.mo23502a((Object) null));
    }

    /* renamed from: b */
    public static C18100a m35256b(C18101b bVar, Object obj) {
        return new C18100a(bVar, bVar.mo23502a(obj));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23589c(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L_0x0007
            com.google.assistant.f.a.a.a.a.e r1 = com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52803e.f138530e
            goto L_0x0084
        L_0x0007:
            java.lang.String r1 = "__error__"
            java.lang.String r1 = r8.getString(r1)
            if (r1 != 0) goto L_0x0013
            com.google.assistant.f.a.a.a.a.e r1 = com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52803e.f138528c
            goto L_0x0084
        L_0x0013:
            int r2 = r1.hashCode()     // Catch:{ IllegalArgumentException -> 0x0082 }
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r2) {
                case -1615384086: goto L_0x0051;
                case -1031784143: goto L_0x0047;
                case -829011630: goto L_0x003d;
                case 324845561: goto L_0x0033;
                case 1198740880: goto L_0x0029;
                case 1776037267: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x005b
        L_0x001f:
            java.lang.String r2 = "UNKNOWN_ERROR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005b
            r1 = 1
            goto L_0x005c
        L_0x0029:
            java.lang.String r2 = "NOT_HANDLED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005b
            r1 = 2
            goto L_0x005c
        L_0x0033:
            java.lang.String r2 = "NULL_RESPONSE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005b
            r1 = 5
            goto L_0x005c
        L_0x003d:
            java.lang.String r2 = "INVALID_PARAMETERS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005b
            r1 = 3
            goto L_0x005c
        L_0x0047:
            java.lang.String r2 = "CANCELLED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005b
            r1 = 4
            goto L_0x005c
        L_0x0051:
            java.lang.String r2 = "NO_ERROR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005b
            r1 = 0
            goto L_0x005c
        L_0x005b:
            r1 = -1
        L_0x005c:
            if (r1 == 0) goto L_0x0076
            if (r1 == r0) goto L_0x0074
            if (r1 == r6) goto L_0x0072
            if (r1 == r5) goto L_0x0070
            if (r1 == r4) goto L_0x0077
            if (r1 != r3) goto L_0x006a
            r3 = 6
            goto L_0x0077
        L_0x006a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0082 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0082 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x0082 }
        L_0x0070:
            r3 = 4
            goto L_0x0077
        L_0x0072:
            r3 = 3
            goto L_0x0077
        L_0x0074:
            r3 = 2
            goto L_0x0077
        L_0x0076:
            r3 = 1
        L_0x0077:
            java.lang.String r1 = "__error_details__"
            java.lang.String r1 = r8.getString(r1)
            com.google.assistant.f.a.a.a.a.e r1 = com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52803e.m86709c(r3, r1)
            goto L_0x0084
        L_0x0082:
            com.google.assistant.f.a.a.a.a.e r1 = com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52803e.f138529d
        L_0x0084:
            r2 = r1
            com.google.assistant.f.a.a.a.a.a r2 = (com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52799a) r2
            int r2 = r2.f138526b
            if (r2 != r0) goto L_0x0095
            com.google.android.libraries.assistant.g.c.b.b r0 = r7.f51575b
            r8.getClass()
            java.lang.Object r8 = r0.mo23503b(r8)
            return r8
        L_0x0095:
            com.google.assistant.f.a.a.a.a.f r8 = new com.google.assistant.f.a.a.a.a.f
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.mo23589c(android.os.Bundle):java.lang.Object");
    }

    /* renamed from: d */
    public final String mo23590d() {
        return this.f51575b.mo23504c();
    }

    /* renamed from: e */
    public final boolean mo23591e(C18102c cVar) {
        return this.f51575b.mo23505d(cVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18100a)) {
            return false;
        }
        C18100a aVar = (C18100a) obj;
        if (!Objects.equals(mo23590d(), aVar.mo23590d()) || !Arrays.equals(C18147a.m35345c(this.f51574a), C18147a.m35345c(aVar.f51574a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(mo23590d(), Integer.valueOf(Arrays.hashCode(C18147a.m35345c(this.f51574a))));
    }

    public final String toString() {
        return String.format("ActionRequest(%s, %s)", new Object[]{C18147a.m35344b(mo23590d()), C18147a.m35343a(this.f51574a)});
    }
}
