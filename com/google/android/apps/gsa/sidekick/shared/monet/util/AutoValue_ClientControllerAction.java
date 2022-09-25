package com.google.android.apps.gsa.sidekick.shared.monet.util;

import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;

/* compiled from: PG */
final class AutoValue_ClientControllerAction extends ClientControllerAction {

    /* renamed from: a */
    private final C9141ad f256161a;

    /* renamed from: b */
    private final C7526an f256162b;

    /* renamed from: c */
    private final C8142xb f256163c;

    /* renamed from: d */
    private final C9277u f256164d;

    /* renamed from: e */
    private final C8178yk f256165e;

    public AutoValue_ClientControllerAction(C9141ad adVar, C7526an anVar, C8142xb xbVar, C9277u uVar, C8178yk ykVar) {
        this.f256161a = adVar;
        this.f256162b = anVar;
        this.f256163c = xbVar;
        this.f256164d = uVar;
        this.f256165e = ykVar;
    }

    /* renamed from: a */
    public final C9277u mo86344a() {
        return this.f256164d;
    }

    /* renamed from: b */
    public final C9141ad mo86345b() {
        return this.f256161a;
    }

    /* renamed from: c */
    public final C7526an mo86346c() {
        return this.f256162b;
    }

    /* renamed from: d */
    public final C8142xb mo86347d() {
        return this.f256163c;
    }

    /* renamed from: e */
    public final C8178yk mo86348e() {
        return this.f256165e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f256164d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f256165e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.sidekick.shared.monet.util.ClientControllerAction
            r2 = 0
            if (r1 == 0) goto L_0x006d
            com.google.android.apps.gsa.sidekick.shared.monet.util.ClientControllerAction r5 = (com.google.android.apps.gsa.sidekick.shared.monet.util.ClientControllerAction) r5
            com.google.android.apps.g.d.ad r1 = r4.f256161a
            if (r1 != 0) goto L_0x0016
            com.google.android.apps.g.d.ad r1 = r5.mo86345b()
            if (r1 != 0) goto L_0x006d
            goto L_0x0020
        L_0x0016:
            com.google.android.apps.g.d.ad r3 = r5.mo86345b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x0020:
            com.google.ai.b.an r1 = r4.f256162b
            if (r1 != 0) goto L_0x002b
            com.google.ai.b.an r1 = r5.mo86346c()
            if (r1 != 0) goto L_0x006d
            goto L_0x0035
        L_0x002b:
            com.google.ai.b.an r3 = r5.mo86346c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x0035:
            com.google.ai.b.xb r1 = r4.f256163c
            com.google.ai.b.xb r3 = r5.mo86347d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            com.google.android.apps.g.d.u r1 = r4.f256164d
            if (r1 != 0) goto L_0x004c
            com.google.android.apps.g.d.u r1 = r5.mo86344a()
            if (r1 != 0) goto L_0x006d
            goto L_0x0056
        L_0x004c:
            com.google.android.apps.g.d.u r3 = r5.mo86344a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
        L_0x0056:
            com.google.ai.b.yk r1 = r4.f256165e
            if (r1 != 0) goto L_0x0061
            com.google.ai.b.yk r5 = r5.mo86348e()
            if (r5 != 0) goto L_0x006d
            goto L_0x006c
        L_0x0061:
            com.google.ai.b.yk r5 = r5.mo86348e()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            return r0
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.monet.util.AutoValue_ClientControllerAction.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f256161a);
        String valueOf2 = String.valueOf(this.f256162b);
        String num = Integer.toString(this.f256163c.f28649u);
        String valueOf3 = String.valueOf(this.f256164d);
        String valueOf4 = String.valueOf(this.f256165e);
        return "ClientControllerAction{clientAction=" + valueOf + ", clickAction=" + valueOf2 + ", surfaceType=" + num + ", moduleType=" + valueOf3 + ", visualElementInfo=" + valueOf4 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        C9141ad adVar = this.f256161a;
        int i4 = 0;
        if (adVar == null) {
            i = 0;
        } else {
            i = adVar.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        C7526an anVar = this.f256162b;
        if (anVar == null) {
            i2 = 0;
        } else {
            i2 = anVar.hashCode();
        }
        int hashCode = (((i5 ^ i2) * 1000003) ^ this.f256163c.hashCode()) * 1000003;
        C9277u uVar = this.f256164d;
        if (uVar == null) {
            i3 = 0;
        } else {
            i3 = uVar.hashCode();
        }
        int i6 = (hashCode ^ i3) * 1000003;
        C8178yk ykVar = this.f256165e;
        if (ykVar != null) {
            i4 = ykVar.hashCode();
        }
        return i6 ^ i4;
    }
}
