package com.google.android.apps.gsa.nga.shared.p6352l.p6353a;

import android.os.Bundle;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b */
/* compiled from: PG */
public final class C81354b extends C81374h {

    /* renamed from: a */
    public final Bundle f222670a;

    /* renamed from: b */
    public final int f222671b;

    /* renamed from: c */
    public final C58485gu f222672c;

    /* renamed from: d */
    public final int f222673d;

    /* renamed from: e */
    public final C58485gu f222674e;

    /* renamed from: f */
    public final boolean f222675f;

    /* renamed from: g */
    public final boolean f222676g;

    /* renamed from: h */
    public final int f222677h;

    /* renamed from: i */
    private final Optional f222678i;

    public C81354b(Bundle bundle, int i, C58485gu guVar, int i2, C58485gu guVar2, int i3, boolean z, Optional optional, boolean z2) {
        this.f222670a = bundle;
        this.f222671b = i;
        this.f222672c = guVar;
        this.f222673d = i2;
        this.f222674e = guVar2;
        this.f222677h = i3;
        this.f222675f = z;
        this.f222678i = optional;
        this.f222676g = z2;
    }

    /* renamed from: a */
    public final int mo75027a() {
        return this.f222673d;
    }

    /* renamed from: b */
    public final int mo75028b() {
        return this.f222671b;
    }

    /* renamed from: c */
    public final Bundle mo75029c() {
        return this.f222670a;
    }

    /* renamed from: d */
    public final C58485gu mo75030d() {
        return this.f222674e;
    }

    /* renamed from: e */
    public final C58485gu mo75031e() {
        return this.f222672c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81374h) {
            C81374h hVar = (C81374h) obj;
            return this.f222670a.equals(hVar.mo75029c()) && this.f222671b == hVar.mo75028b() && C58597ky.m90218i(this.f222672c, hVar.mo75031e()) && this.f222673d == hVar.mo75027a() && C58597ky.m90218i(this.f222674e, hVar.mo75030d()) && this.f222677h == hVar.mo75037i() && this.f222675f == hVar.mo75034g() && this.f222678i.equals(hVar.mo75033f()) && this.f222676g == hVar.mo75035h();
        }
    }

    /* renamed from: f */
    public final Optional mo75033f() {
        return this.f222678i;
    }

    /* renamed from: g */
    public final boolean mo75034g() {
        return this.f222675f;
    }

    /* renamed from: h */
    public final boolean mo75035h() {
        return this.f222676g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((this.f222670a.hashCode() ^ 1000003) * 1000003) ^ this.f222671b) * 1000003) ^ this.f222672c.hashCode()) * 1000003) ^ this.f222673d) * 1000003) ^ this.f222674e.hashCode()) * 1000003) ^ this.f222677h) * 1000003) ^ (true != this.f222675f ? 1237 : 1231)) * 1000003) ^ this.f222678i.hashCode()) * 1000003;
        if (true == this.f222676g) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final int mo75037i() {
        return this.f222677h;
    }

    public final String toString() {
        String obj = this.f222670a.toString();
        int i = this.f222671b;
        String obj2 = this.f222672c.toString();
        int i2 = this.f222673d;
        String obj3 = this.f222674e.toString();
        String num = Integer.toString(this.f222677h - 1);
        boolean z = this.f222675f;
        String valueOf = String.valueOf(this.f222678i);
        boolean z2 = this.f222676g;
        return "NotificationParams{flowBundle=" + obj + ", titleId=" + i + ", titleArgs=" + obj2 + ", descriptionId=" + i2 + ", descriptionArgs=" + obj3 + ", triggerSource=" + num + ", isCounterfactual=" + z + ", notificationIndex=" + valueOf + ", skipNotificationEligibilityCheckAndCount=" + z2 + "}";
    }
}
