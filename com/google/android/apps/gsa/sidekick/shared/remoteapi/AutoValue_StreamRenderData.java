package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import com.google.android.apps.p489g.p494d.C9277u;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7718hj;

/* compiled from: PG */
final class AutoValue_StreamRenderData extends StreamRenderData {

    /* renamed from: a */
    public final Integer f256270a;

    /* renamed from: b */
    public final Integer f256271b;

    /* renamed from: c */
    public final Integer f256272c;

    /* renamed from: d */
    public final Integer f256273d;

    /* renamed from: e */
    public final C7709ha f256274e;

    /* renamed from: f */
    public final C7709ha f256275f;

    /* renamed from: g */
    public final Integer f256276g;

    /* renamed from: h */
    public final C9277u f256277h;

    public AutoValue_StreamRenderData(Integer num, Integer num2, Integer num3, Integer num4, C7709ha haVar, C7709ha haVar2, Integer num5, C9277u uVar) {
        this.f256270a = num;
        this.f256271b = num2;
        this.f256272c = num3;
        this.f256273d = num4;
        this.f256274e = haVar;
        this.f256275f = haVar2;
        this.f256276g = num5;
        this.f256277h = uVar;
    }

    /* renamed from: a */
    public final C91914l mo86516a() {
        return new C91904b(this);
    }

    /* renamed from: b */
    public final C9277u mo86517b() {
        return this.f256277h;
    }

    /* renamed from: c */
    public final C7709ha mo86518c() {
        return this.f256275f;
    }

    /* renamed from: d */
    public final C7709ha mo86519d() {
        return this.f256274e;
    }

    /* renamed from: e */
    public final C7718hj mo86520e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r1 = r4.f256274e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r1 = r4.f256275f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0095, code lost:
        r1 = r4.f256276g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00aa, code lost:
        r1 = r4.f256277h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData
            r2 = 0
            if (r1 == 0) goto L_0x00c1
            com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData r5 = (com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData) r5
            java.lang.Integer r1 = r4.f256270a
            if (r1 != 0) goto L_0x0016
            java.lang.Integer r1 = r5.mo86523g()
            if (r1 != 0) goto L_0x00c1
            goto L_0x0020
        L_0x0016:
            java.lang.Integer r3 = r5.mo86523g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c1
        L_0x0020:
            java.lang.Integer r1 = r4.f256271b
            if (r1 != 0) goto L_0x002b
            java.lang.Integer r1 = r5.mo86528k()
            if (r1 != 0) goto L_0x00c1
            goto L_0x0035
        L_0x002b:
            java.lang.Integer r3 = r5.mo86528k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c1
        L_0x0035:
            java.lang.Integer r1 = r4.f256272c
            if (r1 != 0) goto L_0x0040
            java.lang.Integer r1 = r5.mo86526i()
            if (r1 != 0) goto L_0x00c1
            goto L_0x004a
        L_0x0040:
            java.lang.Integer r3 = r5.mo86526i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c1
        L_0x004a:
            java.lang.Integer r1 = r4.f256273d
            if (r1 != 0) goto L_0x0055
            java.lang.Integer r1 = r5.mo86524h()
            if (r1 != 0) goto L_0x00c1
            goto L_0x005f
        L_0x0055:
            java.lang.Integer r3 = r5.mo86524h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c1
        L_0x005f:
            com.google.ai.b.hj r1 = r5.mo86522f()
            if (r1 != 0) goto L_0x00c1
            com.google.ai.b.ha r1 = r4.f256274e
            if (r1 != 0) goto L_0x0070
            com.google.ai.b.ha r1 = r5.mo86519d()
            if (r1 != 0) goto L_0x00c1
            goto L_0x007a
        L_0x0070:
            com.google.ai.b.ha r3 = r5.mo86519d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c1
        L_0x007a:
            com.google.ai.b.hj r1 = r5.mo86520e()
            if (r1 != 0) goto L_0x00c1
            com.google.ai.b.ha r1 = r4.f256275f
            if (r1 != 0) goto L_0x008b
            com.google.ai.b.ha r1 = r5.mo86518c()
            if (r1 != 0) goto L_0x00c1
            goto L_0x0095
        L_0x008b:
            com.google.ai.b.ha r3 = r5.mo86518c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c1
        L_0x0095:
            java.lang.Integer r1 = r4.f256276g
            if (r1 != 0) goto L_0x00a0
            java.lang.Integer r1 = r5.mo86527j()
            if (r1 != 0) goto L_0x00c1
            goto L_0x00aa
        L_0x00a0:
            java.lang.Integer r3 = r5.mo86527j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c1
        L_0x00aa:
            com.google.android.apps.g.d.u r1 = r4.f256277h
            if (r1 != 0) goto L_0x00b5
            com.google.android.apps.g.d.u r5 = r5.mo86517b()
            if (r5 != 0) goto L_0x00c1
            goto L_0x00c0
        L_0x00b5:
            com.google.android.apps.g.d.u r5 = r5.mo86517b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            return r0
        L_0x00c1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.remoteapi.AutoValue_StreamRenderData.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C7718hj mo86522f() {
        return null;
    }

    /* renamed from: g */
    public final Integer mo86523g() {
        return this.f256270a;
    }

    /* renamed from: h */
    public final Integer mo86524h() {
        return this.f256273d;
    }

    /* renamed from: i */
    public final Integer mo86526i() {
        return this.f256272c;
    }

    /* renamed from: j */
    public final Integer mo86527j() {
        return this.f256276g;
    }

    /* renamed from: k */
    public final Integer mo86528k() {
        return this.f256271b;
    }

    public final String toString() {
        Integer num = this.f256270a;
        Integer num2 = this.f256271b;
        Integer num3 = this.f256272c;
        Integer num4 = this.f256273d;
        String valueOf = String.valueOf(this.f256274e);
        String valueOf2 = String.valueOf(this.f256275f);
        Integer num5 = this.f256276g;
        String valueOf3 = String.valueOf(this.f256277h);
        return "StreamRenderData{cardIndex=" + num + ", subIndex=" + num2 + ", groupIndex=" + num3 + ", clusterIndex=" + num4 + ", groupEntry=null, groupMetadata=" + valueOf + ", clusterEntry=null, clusterMetadata=" + valueOf2 + ", scrollDistance=" + num5 + ", moduleType=" + valueOf3 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Integer num = this.f256270a;
        int i5 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        Integer num2 = this.f256271b;
        int hashCode2 = (hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.f256272c;
        int hashCode3 = (hashCode2 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.f256273d;
        if (num4 == null) {
            i = 0;
        } else {
            i = num4.hashCode();
        }
        int i6 = (hashCode3 ^ i) * -721379959;
        C7709ha haVar = this.f256274e;
        if (haVar == null) {
            i2 = 0;
        } else {
            i2 = haVar.hashCode();
        }
        int i7 = (i6 ^ i2) * -721379959;
        C7709ha haVar2 = this.f256275f;
        if (haVar2 == null) {
            i3 = 0;
        } else {
            i3 = haVar2.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        Integer num5 = this.f256276g;
        if (num5 == null) {
            i4 = 0;
        } else {
            i4 = num5.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        C9277u uVar = this.f256277h;
        if (uVar != null) {
            i5 = uVar.hashCode();
        }
        return i9 ^ i5;
    }
}
