package com.google.android.libraries.lens.view.session;

import android.util.Size;
import com.google.common.base.C58833ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;

/* renamed from: com.google.android.libraries.lens.view.session.b */
/* compiled from: PG */
final class C27764b extends C27793m {

    /* renamed from: a */
    public final C56220aa f75772a;

    /* renamed from: b */
    public final C58833ax f75773b;

    /* renamed from: c */
    public final C58833ax f75774c;

    /* renamed from: d */
    public final C58833ax f75775d;

    /* renamed from: e */
    public final C58833ax f75776e;

    /* renamed from: f */
    public final Size f75777f;

    /* renamed from: g */
    public final long f75778g;

    public C27764b(C56220aa aaVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, Size size, long j) {
        this.f75772a = aaVar;
        this.f75773b = axVar;
        this.f75774c = axVar2;
        this.f75775d = axVar3;
        this.f75776e = axVar4;
        this.f75777f = size;
        this.f75778g = j;
    }

    /* renamed from: a */
    public final long mo33235a() {
        return this.f75778g;
    }

    /* renamed from: b */
    public final Size mo33236b() {
        return this.f75777f;
    }

    /* renamed from: c */
    public final C27792l mo33237c() {
        return new C27732a(this);
    }

    /* renamed from: d */
    public final C58833ax mo33238d() {
        return this.f75776e;
    }

    /* renamed from: e */
    public final C58833ax mo33239e() {
        return this.f75775d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27793m) {
            C27793m mVar = (C27793m) obj;
            return this.f75772a.equals(mVar.mo33243h()) && this.f75773b.equals(mVar.mo33241f()) && this.f75774c.equals(mVar.mo33242g()) && this.f75775d.equals(mVar.mo33239e()) && this.f75776e.equals(mVar.mo33238d()) && this.f75777f.equals(mVar.mo33236b()) && this.f75778g == mVar.mo33235a();
        }
    }

    /* renamed from: f */
    public final C58833ax mo33241f() {
        return this.f75773b;
    }

    /* renamed from: g */
    public final C58833ax mo33242g() {
        return this.f75774c;
    }

    /* renamed from: h */
    public final C56220aa mo33243h() {
        return this.f75772a;
    }

    public final int hashCode() {
        int hashCode = this.f75772a.hashCode();
        int hashCode2 = this.f75773b.hashCode();
        int hashCode3 = this.f75774c.hashCode();
        int hashCode4 = this.f75775d.hashCode();
        int hashCode5 = this.f75776e.hashCode();
        int hashCode6 = this.f75777f.hashCode();
        long j = this.f75778g;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String obj = this.f75772a.toString();
        String valueOf = String.valueOf(this.f75773b);
        String valueOf2 = String.valueOf(this.f75774c);
        String valueOf3 = String.valueOf(this.f75775d);
        String valueOf4 = String.valueOf(this.f75776e);
        String obj2 = this.f75777f.toString();
        long j = this.f75778g;
        return "DetectionResultsResponse{detectionResults=" + obj + ", deepGleamDataList=" + valueOf + ", hasEarlyGleamsOptional=" + valueOf2 + ", channelResponseIndex=" + valueOf3 + ", channelComplete=" + valueOf4 + ", imageSize=" + obj2 + ", imageTimestampUs=" + j + "}";
    }
}
