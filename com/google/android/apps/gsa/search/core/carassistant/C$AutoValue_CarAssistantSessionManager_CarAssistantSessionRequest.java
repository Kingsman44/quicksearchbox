package com.google.android.apps.gsa.search.core.carassistant;

import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.$AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest extends CarAssistantSessionManager.CarAssistantSessionRequest {

    /* renamed from: a */
    public final Query f231654a;

    /* renamed from: b */
    public final HotwordDetectedEventData f231655b;

    /* renamed from: c */
    public final String f231656c;

    /* renamed from: d */
    public final String f231657d;

    /* renamed from: e */
    public final String f231658e;

    /* renamed from: f */
    public final String f231659f;

    /* renamed from: g */
    public final long f231660g;

    /* renamed from: h */
    public final boolean f231661h;

    /* renamed from: i */
    public final boolean f231662i;

    /* renamed from: j */
    public final boolean f231663j;

    /* renamed from: k */
    public final boolean f231664k;

    /* renamed from: l */
    public final C58485gu f231665l;

    /* renamed from: m */
    public final C58485gu f231666m;

    /* renamed from: n */
    public final C63088z f231667n;

    /* renamed from: o */
    public final int f231668o;

    public C$AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest(int i, Query query, HotwordDetectedEventData hotwordDetectedEventData, String str, String str2, String str3, String str4, long j, boolean z, boolean z2, boolean z3, boolean z4, C58485gu guVar, C58485gu guVar2, C63088z zVar) {
        String str5 = str4;
        C58485gu guVar3 = guVar;
        C58485gu guVar4 = guVar2;
        C63088z zVar2 = zVar;
        this.f231668o = i;
        this.f231654a = query;
        this.f231655b = hotwordDetectedEventData;
        this.f231656c = str;
        this.f231657d = str2;
        this.f231658e = str3;
        if (str5 != null) {
            this.f231659f = str5;
            this.f231660g = j;
            this.f231661h = z;
            this.f231662i = z2;
            this.f231663j = z3;
            this.f231664k = z4;
            if (guVar3 != null) {
                this.f231665l = guVar3;
                if (guVar4 != null) {
                    this.f231666m = guVar4;
                    if (zVar2 != null) {
                        this.f231667n = zVar2;
                        return;
                    }
                    throw new NullPointerException("Null clientInputData");
                }
                throw new NullPointerException("Null legacyNotifications");
            }
            throw new NullPointerException("Null notifications");
        }
        throw new NullPointerException("Null mediaFacetAppPackageName");
    }

    /* renamed from: a */
    public final long mo79254a() {
        return this.f231660g;
    }

    /* renamed from: b */
    public final Query mo79255b() {
        return this.f231654a;
    }

    /* renamed from: c */
    public final HotwordDetectedEventData mo79256c() {
        return this.f231655b;
    }

    /* renamed from: d */
    public final C58485gu mo79257d() {
        return this.f231666m;
    }

    /* renamed from: e */
    public final C58485gu mo79258e() {
        return this.f231665l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r7.f231655b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r1 = r7.f231656c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = r7.f231657d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r1 = r7.f231658e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f231654a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest
            r2 = 0
            if (r1 == 0) goto L_0x00d8
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$CarAssistantSessionRequest r8 = (com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.CarAssistantSessionRequest) r8
            int r1 = r7.f231668o
            int r3 = r8.mo79270o()
            if (r1 != r3) goto L_0x00d8
            com.google.android.apps.gsa.shared.search.Query r1 = r7.f231654a
            if (r1 != 0) goto L_0x001e
            com.google.android.apps.gsa.shared.search.Query r1 = r8.mo79255b()
            if (r1 != 0) goto L_0x00d8
            goto L_0x0028
        L_0x001e:
            com.google.android.apps.gsa.shared.search.Query r3 = r8.mo79255b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d8
        L_0x0028:
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r1 = r7.f231655b
            if (r1 != 0) goto L_0x0033
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r1 = r8.mo79256c()
            if (r1 != 0) goto L_0x00d8
            goto L_0x003d
        L_0x0033:
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r3 = r8.mo79256c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d8
        L_0x003d:
            java.lang.String r1 = r7.f231656c
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = r8.mo79265j()
            if (r1 != 0) goto L_0x00d8
            goto L_0x0052
        L_0x0048:
            java.lang.String r3 = r8.mo79265j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d8
        L_0x0052:
            java.lang.String r1 = r7.f231657d
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = r8.mo79264i()
            if (r1 != 0) goto L_0x00d8
            goto L_0x0067
        L_0x005d:
            java.lang.String r3 = r8.mo79264i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d8
        L_0x0067:
            java.lang.String r1 = r7.f231658e
            if (r1 != 0) goto L_0x0072
            java.lang.String r1 = r8.mo79262h()
            if (r1 != 0) goto L_0x00d8
            goto L_0x007d
        L_0x0072:
            java.lang.String r3 = r8.mo79262h()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x007d
            goto L_0x00d8
        L_0x007d:
            java.lang.String r1 = r7.f231659f
            java.lang.String r3 = r8.mo79261g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d8
            long r3 = r7.f231660g
            long r5 = r8.mo79254a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00d8
            boolean r1 = r7.f231661h
            boolean r3 = r8.mo79268m()
            if (r1 != r3) goto L_0x00d8
            boolean r1 = r7.f231662i
            boolean r3 = r8.mo79267l()
            if (r1 != r3) goto L_0x00d8
            boolean r1 = r7.f231663j
            boolean r3 = r8.mo79266k()
            if (r1 != r3) goto L_0x00d8
            boolean r1 = r7.f231664k
            boolean r3 = r8.mo79269n()
            if (r1 != r3) goto L_0x00d8
            com.google.common.b.gu r1 = r7.f231665l
            com.google.common.b.gu r3 = r8.mo79258e()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x00d8
            com.google.common.b.gu r1 = r7.f231666m
            com.google.common.b.gu r3 = r8.mo79257d()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x00d8
            com.google.protobuf.z r1 = r7.f231667n
            com.google.protobuf.z r8 = r8.mo79260f()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x00d8
            return r0
        L_0x00d8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.carassistant.C$AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C63088z mo79260f() {
        return this.f231667n;
    }

    /* renamed from: g */
    public final String mo79261g() {
        return this.f231659f;
    }

    /* renamed from: h */
    public final String mo79262h() {
        return this.f231658e;
    }

    /* renamed from: i */
    public final String mo79264i() {
        return this.f231657d;
    }

    /* renamed from: j */
    public final String mo79265j() {
        return this.f231656c;
    }

    /* renamed from: k */
    public final boolean mo79266k() {
        return this.f231663j;
    }

    /* renamed from: l */
    public final boolean mo79267l() {
        return this.f231662i;
    }

    /* renamed from: m */
    public final boolean mo79268m() {
        return this.f231661h;
    }

    /* renamed from: n */
    public final boolean mo79269n() {
        return this.f231664k;
    }

    /* renamed from: o */
    public final int mo79270o() {
        return this.f231668o;
    }

    public final String toString() {
        int i = this.f231668o;
        String valueOf = String.valueOf(this.f231654a);
        String valueOf2 = String.valueOf(this.f231655b);
        String str = this.f231656c;
        String str2 = this.f231657d;
        String str3 = this.f231658e;
        String str4 = this.f231659f;
        long j = this.f231660g;
        boolean z = this.f231661h;
        boolean z2 = this.f231662i;
        boolean z3 = this.f231663j;
        boolean z4 = this.f231664k;
        String obj = this.f231665l.toString();
        String obj2 = this.f231666m.toString();
        return "CarAssistantSessionRequest{type=" + C85733k.m137750a(i) + ", query=" + valueOf + ", hotwordDetectedEventData=" + valueOf2 + ", suggestionId=" + str + ", recipientName=" + str2 + ", phoneNumber=" + str3 + ", mediaFacetAppPackageName=" + str4 + ", sessionStartTime=" + j + ", isInitialFusionRequest=" + z + ", isEmbeddedDebugQuery=" + z2 + ", dropOngoingQueries=" + z3 + ", isSubsequentRequestInUiSession=" + z4 + ", notifications=" + obj + ", legacyNotifications=" + obj2 + ", clientInputData=" + this.f231667n.toString() + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = (this.f231668o ^ 1000003) * 1000003;
        Query query = this.f231654a;
        int i5 = 0;
        int hashCode = (i4 ^ (query == null ? 0 : query.hashCode())) * 1000003;
        HotwordDetectedEventData hotwordDetectedEventData = this.f231655b;
        if (hotwordDetectedEventData == null) {
            i = 0;
        } else {
            i = hotwordDetectedEventData.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        String str = this.f231656c;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str2 = this.f231657d;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str3 = this.f231658e;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        int hashCode2 = this.f231659f.hashCode();
        long j = this.f231660g;
        int i9 = (((((i8 ^ i5) * 1000003) ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i10 = 1237;
        int i11 = (((((i9 ^ (true != this.f231661h ? 1237 : 1231)) * 1000003) ^ (true != this.f231662i ? 1237 : 1231)) * 1000003) ^ (true != this.f231663j ? 1237 : 1231)) * 1000003;
        if (true == this.f231664k) {
            i10 = 1231;
        }
        return ((((((i11 ^ i10) * 1000003) ^ this.f231665l.hashCode()) * 1000003) ^ this.f231666m.hashCode()) * 1000003) ^ this.f231667n.hashCode();
    }
}
