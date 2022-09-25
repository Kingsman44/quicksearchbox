package com.google.android.libraries.elements.interfaces;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.elements.interfaces.b */
/* compiled from: PG */
final class C21257b extends C21311r {

    /* renamed from: a */
    public final View f59574a;

    /* renamed from: b */
    public final View f59575b;

    /* renamed from: c */
    public final C21295ck f59576c;

    /* renamed from: d */
    public final SenderStateOuterClass$SenderState f59577d;

    /* renamed from: e */
    public final C21248ar f59578e;

    /* renamed from: f */
    public final C21256az f59579f;

    /* renamed from: g */
    public final C21319z f59580g;

    public C21257b(View view, View view2, C21295ck ckVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, C21248ar arVar, C21256az azVar, C21319z zVar) {
        this.f59574a = view;
        this.f59575b = view2;
        this.f59576c = ckVar;
        this.f59577d = senderStateOuterClass$SenderState;
        this.f59578e = arVar;
        this.f59579f = azVar;
        this.f59580g = zVar;
    }

    /* renamed from: a */
    public final View mo26731a() {
        return this.f59575b;
    }

    /* renamed from: b */
    public final View mo26732b() {
        return this.f59574a;
    }

    /* renamed from: c */
    public final C21309p mo26733c() {
        return new C21230a(this);
    }

    /* renamed from: d */
    public final C21319z mo26734d() {
        return this.f59580g;
    }

    /* renamed from: e */
    public final C21248ar mo26735e() {
        return this.f59578e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = r4.f59577d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r1 = r4.f59578e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r1 = r4.f59579f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.elements.interfaces.C21311r
            r2 = 0
            if (r1 == 0) goto L_0x00a3
            com.google.android.libraries.elements.interfaces.r r5 = (com.google.android.libraries.elements.interfaces.C21311r) r5
            android.view.View r1 = r4.f59574a
            if (r1 != 0) goto L_0x0016
            android.view.View r1 = r5.mo26732b()
            if (r1 != 0) goto L_0x00a3
            goto L_0x0020
        L_0x0016:
            android.view.View r3 = r5.mo26732b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x0020:
            android.view.View r1 = r4.f59575b
            if (r1 != 0) goto L_0x002b
            android.view.View r1 = r5.mo26731a()
            if (r1 != 0) goto L_0x00a3
            goto L_0x0035
        L_0x002b:
            android.view.View r3 = r5.mo26731a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x0035:
            com.google.android.libraries.elements.interfaces.ck r1 = r4.f59576c
            if (r1 != 0) goto L_0x0040
            com.google.android.libraries.elements.interfaces.ck r1 = r5.mo26738g()
            if (r1 != 0) goto L_0x00a3
            goto L_0x004a
        L_0x0040:
            com.google.android.libraries.elements.interfaces.ck r3 = r5.mo26738g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x004a:
            java.lang.Object r1 = r5.mo26741i()
            if (r1 != 0) goto L_0x00a3
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r1 = r4.f59577d
            if (r1 != 0) goto L_0x005b
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r1 = r5.mo26739h()
            if (r1 != 0) goto L_0x00a3
            goto L_0x0065
        L_0x005b:
            com.google.protos.youtube.elements.SenderStateOuterClass$SenderState r3 = r5.mo26739h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x0065:
            com.google.android.libraries.elements.interfaces.ar r1 = r4.f59578e
            if (r1 != 0) goto L_0x0070
            com.google.android.libraries.elements.interfaces.ar r1 = r5.mo26735e()
            if (r1 != 0) goto L_0x00a3
            goto L_0x007a
        L_0x0070:
            com.google.android.libraries.elements.interfaces.ar r3 = r5.mo26735e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a3
        L_0x007a:
            java.lang.String r1 = r5.mo26742j()
            if (r1 != 0) goto L_0x00a3
            com.google.android.libraries.elements.interfaces.az r1 = r4.f59579f
            if (r1 != 0) goto L_0x008b
            com.google.android.libraries.elements.interfaces.az r1 = r5.mo26737f()
            if (r1 != 0) goto L_0x00a3
            goto L_0x0096
        L_0x008b:
            com.google.android.libraries.elements.interfaces.az r3 = r5.mo26737f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0096
            goto L_0x00a3
        L_0x0096:
            com.google.android.libraries.elements.interfaces.z r1 = r4.f59580g
            com.google.android.libraries.elements.interfaces.z r5 = r5.mo26734d()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00a3
            return r0
        L_0x00a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.interfaces.C21257b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C21256az mo26737f() {
        return this.f59579f;
    }

    /* renamed from: g */
    public final C21295ck mo26738g() {
        return this.f59576c;
    }

    /* renamed from: h */
    public final SenderStateOuterClass$SenderState mo26739h() {
        return this.f59577d;
    }

    /* renamed from: i */
    public final Object mo26741i() {
        return null;
    }

    /* renamed from: j */
    public final String mo26742j() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f59574a);
        String valueOf2 = String.valueOf(this.f59575b);
        String valueOf3 = String.valueOf(this.f59576c);
        String valueOf4 = String.valueOf(this.f59577d);
        String valueOf5 = String.valueOf(this.f59578e);
        String valueOf6 = String.valueOf(this.f59579f);
        String obj = this.f59580g.toString();
        return "CommandEventData{view=" + valueOf + ", anchorView=" + valueOf2 + ", touchLocation=" + valueOf3 + ", customData=null, senderState=" + valueOf4 + ", elementBuilder=" + valueOf5 + ", identifier=null, elementsConfig=" + valueOf6 + ", conversionContext=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        View view = this.f59574a;
        int i4 = 0;
        int hashCode = ((view == null ? 0 : view.hashCode()) ^ 1000003) * 1000003;
        View view2 = this.f59575b;
        int hashCode2 = (hashCode ^ (view2 == null ? 0 : view2.hashCode())) * 1000003;
        C21295ck ckVar = this.f59576c;
        if (ckVar == null) {
            i = 0;
        } else {
            i = ckVar.hashCode();
        }
        int i5 = (hashCode2 ^ i) * -721379959;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.f59577d;
        if (senderStateOuterClass$SenderState == null) {
            i2 = 0;
        } else {
            i2 = senderStateOuterClass$SenderState.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        C21248ar arVar = this.f59578e;
        if (arVar == null) {
            i3 = 0;
        } else {
            i3 = arVar.hashCode();
        }
        int i7 = (i6 ^ i3) * -721379959;
        C21256az azVar = this.f59579f;
        if (azVar != null) {
            i4 = azVar.hashCode();
        }
        return ((i7 ^ i4) * 1000003) ^ this.f59580g.hashCode();
    }
}
