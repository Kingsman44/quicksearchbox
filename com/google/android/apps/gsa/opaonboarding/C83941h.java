package com.google.android.apps.gsa.opaonboarding;

import android.os.Bundle;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.opaonboarding.h */
/* compiled from: PG */
final class C83941h extends C83880an {

    /* renamed from: b */
    private final String f228618b;

    /* renamed from: c */
    private final Bundle f228619c;

    /* renamed from: d */
    private final C83818a f228620d;

    /* renamed from: e */
    private final C58833ax f228621e;

    /* renamed from: f */
    private final C58833ax f228622f;

    /* renamed from: g */
    private final C58833ax f228623g;

    /* renamed from: h */
    private final C59567w f228624h;

    /* renamed from: i */
    private final boolean f228625i;

    /* renamed from: j */
    private final String f228626j;

    /* renamed from: k */
    private final int f228627k;

    /* renamed from: l */
    private final int f228628l;

    /* renamed from: m */
    private final int f228629m;

    public C83941h(String str, Bundle bundle, C83818a aVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C59567w wVar, boolean z, String str2, int i, int i2, int i3) {
        this.f228618b = str;
        this.f228619c = bundle;
        this.f228620d = aVar;
        this.f228621e = axVar;
        this.f228622f = axVar2;
        this.f228623g = axVar3;
        this.f228624h = wVar;
        this.f228625i = z;
        this.f228626j = str2;
        this.f228627k = i;
        this.f228628l = i2;
        this.f228629m = i3;
    }

    /* renamed from: a */
    public final int mo77227a() {
        return this.f228628l;
    }

    /* renamed from: b */
    public final int mo77228b() {
        return this.f228629m;
    }

    /* renamed from: c */
    public final int mo77229c() {
        return this.f228627k;
    }

    /* renamed from: d */
    public final Bundle mo77230d() {
        return this.f228619c;
    }

    /* renamed from: e */
    public final C83818a mo77231e() {
        return this.f228620d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83880an) {
            C83880an anVar = (C83880an) obj;
            return this.f228618b.equals(anVar.mo77237k()) && this.f228619c.equals(anVar.mo77230d()) && this.f228620d.equals(anVar.mo77231e()) && this.f228621e.equals(anVar.mo77233g()) && this.f228622f.equals(anVar.mo77234h()) && this.f228623g.equals(anVar.mo77232f()) && this.f228624h.equals(anVar.mo77235i()) && this.f228625i == anVar.mo77238l() && this.f228626j.equals(anVar.mo77236j()) && this.f228627k == anVar.mo77229c() && this.f228628l == anVar.mo77227a() && this.f228629m == anVar.mo77228b() && !anVar.mo77239m();
        }
    }

    /* renamed from: f */
    public final C58833ax mo77232f() {
        return this.f228623g;
    }

    /* renamed from: g */
    public final C58833ax mo77233g() {
        return this.f228621e;
    }

    /* renamed from: h */
    public final C58833ax mo77234h() {
        return this.f228622f;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.f228618b.hashCode() ^ 1000003) * 1000003) ^ this.f228619c.hashCode()) * 1000003) ^ this.f228620d.hashCode()) * 1000003) ^ this.f228621e.hashCode()) * 1000003) ^ this.f228622f.hashCode()) * 1000003) ^ this.f228623g.hashCode()) * 1000003) ^ this.f228624h.hashCode()) * 1000003) ^ (true != this.f228625i ? 1237 : 1231)) * 1000003) ^ this.f228626j.hashCode()) * 1000003) ^ this.f228627k) * 1000003) ^ this.f228628l) * 1000003) ^ this.f228629m) * 1000003) ^ 1237;
    }

    /* renamed from: i */
    public final C59567w mo77235i() {
        return this.f228624h;
    }

    /* renamed from: j */
    public final String mo77236j() {
        return this.f228626j;
    }

    /* renamed from: k */
    public final String mo77237k() {
        return this.f228618b;
    }

    /* renamed from: l */
    public final boolean mo77238l() {
        return this.f228625i;
    }

    /* renamed from: m */
    public final boolean mo77239m() {
        return false;
    }

    public final String toString() {
        String str = this.f228618b;
        String obj = this.f228619c.toString();
        String obj2 = this.f228620d.toString();
        String valueOf = String.valueOf(this.f228621e);
        String valueOf2 = String.valueOf(this.f228622f);
        String valueOf3 = String.valueOf(this.f228623g);
        String obj3 = this.f228624h.toString();
        boolean z = this.f228625i;
        String str2 = this.f228626j;
        int i = this.f228627k;
        int i2 = this.f228628l;
        int i3 = this.f228629m;
        return "NamedSequenceIntent{sequenceName=" + str + ", sequenceArguments=" + obj + ", accountConfig=" + obj2 + ", unicornConfig=" + valueOf + ", unicornEnrollmentConfig=" + valueOf2 + ", confirmCancelDialogContent=" + valueOf3 + ", assistantOnboarding=" + obj3 + ", hideCaptionBar=" + z + ", gsaPackageName=" + str2 + ", sequenceTheme=" + i + ", materialNextMode=" + i2 + ", sequenceOrientationMode=" + i3 + ", useNoOrientationConfigChange=false}";
    }
}
