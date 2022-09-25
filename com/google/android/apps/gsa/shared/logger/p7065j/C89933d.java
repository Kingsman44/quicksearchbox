package com.google.android.apps.gsa.shared.logger.p7065j;

import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55996d;
import com.google.p4184bj.p4193c.p4200e.C55998f;

/* renamed from: com.google.android.apps.gsa.shared.logger.j.d */
/* compiled from: PG */
public final class C89933d {

    /* renamed from: a */
    public final long f246403a;

    /* renamed from: b */
    public final boolean f246404b;

    /* renamed from: c */
    public final boolean f246405c;

    /* renamed from: d */
    public final String f246406d;

    /* renamed from: e */
    public final int f246407e;

    /* renamed from: f */
    public final long f246408f;

    /* renamed from: g */
    public final String f246409g;

    /* renamed from: h */
    public final C55421x f246410h;

    /* renamed from: i */
    public final boolean f246411i;

    /* renamed from: j */
    public final C55998f f246412j;

    /* renamed from: k */
    public final boolean f246413k;

    /* renamed from: l */
    public final int f246414l;

    /* renamed from: m */
    public final C55996d f246415m;

    /* renamed from: n */
    public final boolean f246416n;

    /* renamed from: o */
    public final int f246417o;

    /* renamed from: p */
    public final boolean f246418p;

    /* renamed from: q */
    public boolean f246419q;

    /* renamed from: r */
    public boolean f246420r;

    /* renamed from: s */
    public boolean f246421s;

    public C89933d(String str, boolean z, long j, boolean z2, String str2, int i, long j2, C55421x xVar, boolean z3, C55998f fVar, boolean z4, int i2, C55996d dVar, boolean z5, int i3, boolean z6) {
        this.f246409g = str;
        this.f246403a = j;
        this.f246404b = z2;
        this.f246406d = str2;
        this.f246407e = i;
        this.f246408f = j2;
        this.f246405c = z;
        this.f246410h = xVar;
        this.f246411i = z3;
        this.f246412j = fVar;
        this.f246413k = z4;
        this.f246414l = i2;
        this.f246415m = dVar;
        this.f246416n = z5;
        this.f246417o = i3;
        this.f246418p = z6;
    }

    public final String toString() {
        long j = this.f246403a;
        boolean z = this.f246404b;
        boolean z2 = this.f246405c;
        int i = this.f246417o;
        String str = this.f246406d;
        int i2 = this.f246407e;
        long j2 = this.f246408f;
        String str2 = this.f246409g;
        String valueOf = String.valueOf(this.f246410h);
        boolean z3 = this.f246411i;
        String valueOf2 = String.valueOf(this.f246412j);
        String valueOf3 = String.valueOf(this.f246415m);
        boolean z4 = this.f246419q;
        boolean z5 = this.f246420r;
        boolean z6 = this.f246421s;
        return "ActionCardVeImpressionData{requestId='" + j + "', mIsNetworkAction=" + z + ", mIsFollowOn=" + z2 + ", mSpeechieMode=" + i + ", mQueryString='" + str + "', mPromptedField=" + i2 + ", mCountdownMs=" + j2 + ", mEventId='" + str2 + "', mActionType=" + valueOf + ", mIsModularAction=" + z3 + ", mActionState=" + valueOf2 + ", mActionArguments=" + valueOf3 + ", mHasClientEntity=" + z4 + ", mHasCompanionEntity=" + z5 + ", mHasServerEntity=" + z6 + ", mIsTriggeredFromWebClick=" + this.f246413k + "}";
    }
}
