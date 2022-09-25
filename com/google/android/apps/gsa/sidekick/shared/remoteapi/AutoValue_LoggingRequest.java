package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C8142xb;
import p3186j$.util.Optional;

/* compiled from: PG */
final class AutoValue_LoggingRequest extends LoggingRequest {

    /* renamed from: a */
    public final C7708h f256248a;

    /* renamed from: b */
    public final Long f256249b;

    /* renamed from: c */
    public final Long f256250c;

    /* renamed from: d */
    public final Integer f256251d;

    /* renamed from: e */
    public final C7718hj f256252e;

    /* renamed from: f */
    public final C7526an f256253f;

    /* renamed from: g */
    public final StreamRenderData f256254g;

    /* renamed from: h */
    public final C8142xb f256255h;

    /* renamed from: i */
    public final boolean f256256i;

    /* renamed from: j */
    public final boolean f256257j;

    /* renamed from: k */
    public final C7918ou f256258k;

    /* renamed from: l */
    public final boolean f256259l;

    /* renamed from: m */
    public final boolean f256260m;

    /* renamed from: n */
    public final Optional f256261n;

    /* renamed from: o */
    public final int f256262o;

    /* renamed from: p */
    public final int f256263p;

    /* renamed from: q */
    public final int f256264q;

    /* renamed from: r */
    public final int f256265r;

    /* renamed from: s */
    public final int f256266s;

    /* renamed from: t */
    public final int f256267t;

    /* renamed from: u */
    public final int f256268u;

    /* renamed from: v */
    public final int f256269v;

    public AutoValue_LoggingRequest(C7708h hVar, Long l, Long l2, Integer num, C7718hj hjVar, C7526an anVar, StreamRenderData streamRenderData, C8142xb xbVar, boolean z, boolean z2, C7918ou ouVar, boolean z3, boolean z4, Optional optional, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f256248a = hVar;
        this.f256249b = l;
        this.f256250c = l2;
        this.f256251d = num;
        this.f256252e = hjVar;
        this.f256253f = anVar;
        this.f256254g = streamRenderData;
        this.f256255h = xbVar;
        this.f256256i = z;
        this.f256257j = z2;
        this.f256258k = ouVar;
        this.f256259l = z3;
        this.f256260m = z4;
        this.f256261n = optional;
        this.f256262o = i;
        this.f256263p = i2;
        this.f256264q = i3;
        this.f256265r = i4;
        this.f256266s = i5;
        this.f256267t = i6;
        this.f256268u = i7;
        this.f256269v = i8;
    }

    /* renamed from: a */
    public final int mo86490a() {
        return this.f256263p;
    }

    /* renamed from: b */
    public final int mo86491b() {
        return this.f256264q;
    }

    /* renamed from: c */
    public final int mo86492c() {
        return this.f256262o;
    }

    /* renamed from: d */
    public final int mo86493d() {
        return this.f256265r;
    }

    /* renamed from: e */
    public final int mo86494e() {
        return this.f256267t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c3, code lost:
        r1 = r4.f256258k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest
            r2 = 0
            if (r1 == 0) goto L_0x0136
            com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest r5 = (com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest) r5
            com.google.ai.b.h r1 = r4.f256248a
            if (r1 != 0) goto L_0x0016
            com.google.ai.b.h r1 = r5.mo86502k()
            if (r1 != 0) goto L_0x0136
            goto L_0x0020
        L_0x0016:
            com.google.ai.b.h r3 = r5.mo86502k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x0020:
            java.lang.Long r1 = r4.f256249b
            if (r1 != 0) goto L_0x002b
            java.lang.Long r1 = r5.mo86510s()
            if (r1 != 0) goto L_0x0136
            goto L_0x0035
        L_0x002b:
            java.lang.Long r3 = r5.mo86510s()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x0035:
            java.lang.Long r1 = r4.f256250c
            if (r1 != 0) goto L_0x0040
            java.lang.Long r1 = r5.mo86509r()
            if (r1 != 0) goto L_0x0136
            goto L_0x004a
        L_0x0040:
            java.lang.Long r3 = r5.mo86509r()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x004a:
            java.lang.Integer r1 = r4.f256251d
            if (r1 != 0) goto L_0x0055
            java.lang.Integer r1 = r5.mo86508q()
            if (r1 != 0) goto L_0x0136
            goto L_0x005f
        L_0x0055:
            java.lang.Integer r3 = r5.mo86508q()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x005f:
            com.google.ai.b.hj r1 = r4.f256252e
            if (r1 != 0) goto L_0x006a
            com.google.ai.b.hj r1 = r5.mo86504m()
            if (r1 != 0) goto L_0x0136
            goto L_0x0074
        L_0x006a:
            com.google.ai.b.hj r3 = r5.mo86504m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x0074:
            com.google.ai.b.an r1 = r4.f256253f
            if (r1 != 0) goto L_0x007f
            com.google.ai.b.an r1 = r5.mo86503l()
            if (r1 != 0) goto L_0x0136
            goto L_0x0089
        L_0x007f:
            com.google.ai.b.an r3 = r5.mo86503l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x0089:
            com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData r1 = r4.f256254g
            if (r1 != 0) goto L_0x0094
            com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData r1 = r5.mo86501j()
            if (r1 != 0) goto L_0x0136
            goto L_0x009e
        L_0x0094:
            com.google.android.apps.gsa.sidekick.shared.remoteapi.StreamRenderData r3 = r5.mo86501j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x009e:
            com.google.ai.b.xb r1 = r4.f256255h
            if (r1 != 0) goto L_0x00a9
            com.google.ai.b.xb r1 = r5.mo86506o()
            if (r1 != 0) goto L_0x0136
            goto L_0x00b3
        L_0x00a9:
            com.google.ai.b.xb r3 = r5.mo86506o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
        L_0x00b3:
            boolean r1 = r4.f256256i
            boolean r3 = r5.mo86513u()
            if (r1 != r3) goto L_0x0136
            boolean r1 = r4.f256257j
            boolean r3 = r5.mo86514v()
            if (r1 != r3) goto L_0x0136
            com.google.ai.b.ou r1 = r4.f256258k
            if (r1 != 0) goto L_0x00ce
            com.google.ai.b.ou r1 = r5.mo86505n()
            if (r1 != 0) goto L_0x0136
            goto L_0x00d9
        L_0x00ce:
            com.google.ai.b.ou r3 = r5.mo86505n()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00d9
            goto L_0x0136
        L_0x00d9:
            boolean r1 = r4.f256259l
            boolean r3 = r5.mo86511t()
            if (r1 != r3) goto L_0x0136
            boolean r1 = r4.f256260m
            boolean r3 = r5.mo86515w()
            if (r1 != r3) goto L_0x0136
            j$.util.Optional r1 = r4.f256261n
            j$.util.Optional r3 = r5.mo86507p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0136
            int r1 = r4.f256262o
            int r3 = r5.mo86492c()
            if (r1 != r3) goto L_0x0136
            int r1 = r4.f256263p
            int r3 = r5.mo86490a()
            if (r1 != r3) goto L_0x0136
            int r1 = r4.f256264q
            int r3 = r5.mo86491b()
            if (r1 != r3) goto L_0x0136
            int r1 = r4.f256265r
            int r3 = r5.mo86493d()
            if (r1 != r3) goto L_0x0136
            int r1 = r4.f256266s
            int r3 = r5.mo86498h()
            if (r1 != r3) goto L_0x0136
            int r1 = r4.f256267t
            int r3 = r5.mo86494e()
            if (r1 != r3) goto L_0x0136
            int r1 = r4.f256268u
            int r3 = r5.mo86496f()
            if (r1 != r3) goto L_0x0136
            int r1 = r4.f256269v
            int r5 = r5.mo86497g()
            if (r1 != r5) goto L_0x0136
            return r0
        L_0x0136:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.remoteapi.AutoValue_LoggingRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo86496f() {
        return this.f256268u;
    }

    /* renamed from: g */
    public final int mo86497g() {
        return this.f256269v;
    }

    /* renamed from: h */
    public final int mo86498h() {
        return this.f256266s;
    }

    /* renamed from: i */
    public final C91909g mo86500i() {
        return new C91903a(this);
    }

    /* renamed from: j */
    public final StreamRenderData mo86501j() {
        return this.f256254g;
    }

    /* renamed from: k */
    public final C7708h mo86502k() {
        return this.f256248a;
    }

    /* renamed from: l */
    public final C7526an mo86503l() {
        return this.f256253f;
    }

    /* renamed from: m */
    public final C7718hj mo86504m() {
        return this.f256252e;
    }

    /* renamed from: n */
    public final C7918ou mo86505n() {
        return this.f256258k;
    }

    /* renamed from: o */
    public final C8142xb mo86506o() {
        return this.f256255h;
    }

    /* renamed from: p */
    public final Optional mo86507p() {
        return this.f256261n;
    }

    /* renamed from: q */
    public final Integer mo86508q() {
        return this.f256251d;
    }

    /* renamed from: r */
    public final Long mo86509r() {
        return this.f256250c;
    }

    /* renamed from: s */
    public final Long mo86510s() {
        return this.f256249b;
    }

    /* renamed from: t */
    public final boolean mo86511t() {
        return this.f256259l;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f256248a);
        Long l = this.f256249b;
        Long l2 = this.f256250c;
        Integer num = this.f256251d;
        String valueOf2 = String.valueOf(this.f256252e);
        String valueOf3 = String.valueOf(this.f256253f);
        String valueOf4 = String.valueOf(this.f256254g);
        String valueOf5 = String.valueOf(this.f256255h);
        boolean z = this.f256256i;
        boolean z2 = this.f256257j;
        String valueOf6 = String.valueOf(this.f256258k);
        boolean z3 = this.f256259l;
        boolean z4 = this.f256260m;
        String valueOf7 = String.valueOf(this.f256261n);
        int i = this.f256262o;
        int i2 = this.f256263p;
        int i3 = this.f256264q;
        int i4 = this.f256265r;
        int i5 = this.f256266s;
        int i6 = this.f256267t;
        int i7 = this.f256268u;
        return "LoggingRequest{action=" + valueOf + ", timestampSeconds=" + l + ", executionTimeMs=" + l2 + ", timezoneOffsetSeconds=" + num + ", entry=" + valueOf2 + ", clickAction=" + valueOf3 + ", streamRenderData=" + valueOf4 + ", surfaceType=" + valueOf5 + ", removeFeedbackQuestionFromEntry=" + z + ", removeVoiceOfGoogleQuestionFromEntry=" + z2 + ", question=" + valueOf6 + ", isPortrait=" + z3 + ", tagCardAsViewed=" + z4 + ", adDismissReason=" + valueOf7 + ", cardTopPixels=" + i + ", cardHeightPixels=" + i2 + ", cardLeftPixels=" + i3 + ", cardWidthPixels=" + i4 + ", viewportTopPixels=" + i5 + ", viewportBottomPixels=" + i6 + ", viewportLeftPixels=" + i7 + ", viewportRightPixels=" + this.f256269v + "}";
    }

    /* renamed from: u */
    public final boolean mo86513u() {
        return this.f256256i;
    }

    /* renamed from: v */
    public final boolean mo86514v() {
        return this.f256257j;
    }

    /* renamed from: w */
    public final boolean mo86515w() {
        return this.f256260m;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        C7708h hVar = this.f256248a;
        int i4 = 0;
        int hashCode = ((hVar == null ? 0 : hVar.hashCode()) ^ 1000003) * 1000003;
        Long l = this.f256249b;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.f256250c;
        int hashCode3 = (hashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Integer num = this.f256251d;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C7718hj hjVar = this.f256252e;
        int hashCode5 = (hashCode4 ^ (hjVar == null ? 0 : hjVar.hashCode())) * 1000003;
        C7526an anVar = this.f256253f;
        if (anVar == null) {
            i = 0;
        } else {
            i = anVar.hashCode();
        }
        int i5 = (hashCode5 ^ i) * 1000003;
        StreamRenderData streamRenderData = this.f256254g;
        if (streamRenderData == null) {
            i2 = 0;
        } else {
            i2 = streamRenderData.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        C8142xb xbVar = this.f256255h;
        if (xbVar == null) {
            i3 = 0;
        } else {
            i3 = xbVar.hashCode();
        }
        int i7 = 1237;
        int i8 = (((((i6 ^ i3) * 1000003) ^ (true != this.f256256i ? 1237 : 1231)) * 1000003) ^ (true != this.f256257j ? 1237 : 1231)) * 1000003;
        C7918ou ouVar = this.f256258k;
        if (ouVar != null) {
            i4 = ouVar.hashCode();
        }
        int i9 = (((i8 ^ i4) * 1000003) ^ (true != this.f256259l ? 1237 : 1231)) * 1000003;
        if (true == this.f256260m) {
            i7 = 1231;
        }
        return ((((((((((((((((((i9 ^ i7) * 1000003) ^ this.f256261n.hashCode()) * 1000003) ^ this.f256262o) * 1000003) ^ this.f256263p) * 1000003) ^ this.f256264q) * 1000003) ^ this.f256265r) * 1000003) ^ this.f256266s) * 1000003) ^ this.f256267t) * 1000003) ^ this.f256268u) * 1000003) ^ this.f256269v;
    }
}
