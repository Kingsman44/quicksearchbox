package com.google.android.libraries.mdi.download;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.mdi.download.x */
/* compiled from: PG */
public final class C29686x extends C29660ic {

    /* renamed from: a */
    public final Uri f80392a;

    /* renamed from: b */
    public final String f80393b;

    /* renamed from: c */
    public final C28779n f80394c;

    /* renamed from: d */
    public final C58833ax f80395d;

    /* renamed from: e */
    public final int f80396e;

    /* renamed from: f */
    public final C58485gu f80397f;

    /* renamed from: g */
    public final String f80398g;

    /* renamed from: h */
    public final C58833ax f80399h;

    /* renamed from: i */
    public final boolean f80400i;

    public C29686x(Uri uri, String str, C28779n nVar, C58833ax axVar, int i, C58485gu guVar, String str2, C58833ax axVar2, boolean z) {
        this.f80392a = uri;
        this.f80393b = str;
        this.f80394c = nVar;
        this.f80395d = axVar;
        this.f80396e = i;
        this.f80397f = guVar;
        this.f80398g = str2;
        this.f80399h = axVar2;
        this.f80400i = z;
    }

    /* renamed from: a */
    public final int mo34806a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo34807b() {
        return this.f80396e;
    }

    /* renamed from: c */
    public final Uri mo34808c() {
        return this.f80392a;
    }

    /* renamed from: d */
    public final C28779n mo34809d() {
        return this.f80394c;
    }

    /* renamed from: e */
    public final C58833ax mo34810e() {
        return this.f80395d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29660ic) {
            C29660ic icVar = (C29660ic) obj;
            return this.f80392a.equals(icVar.mo34808c()) && this.f80393b.equals(icVar.mo34814i()) && this.f80394c.equals(icVar.mo34809d()) && this.f80395d.equals(icVar.mo34810e()) && this.f80396e == icVar.mo34807b() && C58597ky.m90218i(this.f80397f, icVar.mo34812g()) && icVar.mo34806a() == 0 && this.f80398g.equals(icVar.mo34813h()) && this.f80399h.equals(icVar.mo34811f()) && this.f80400i == icVar.mo34815j();
        }
    }

    /* renamed from: f */
    public final C58833ax mo34811f() {
        return this.f80399h;
    }

    /* renamed from: g */
    public final C58485gu mo34812g() {
        return this.f80397f;
    }

    /* renamed from: h */
    public final String mo34813h() {
        return this.f80398g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f80392a.hashCode() ^ 1000003) * 1000003) ^ this.f80393b.hashCode()) * 1000003) ^ this.f80394c.hashCode()) * 1000003) ^ this.f80395d.hashCode()) * 1000003) ^ this.f80396e) * 1000003) ^ this.f80397f.hashCode()) * -721379959) ^ this.f80398g.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.f80400i ? 1237 : 1231);
    }

    /* renamed from: i */
    public final String mo34814i() {
        return this.f80393b;
    }

    /* renamed from: j */
    public final boolean mo34815j() {
        return this.f80400i;
    }

    public final String toString() {
        String obj = this.f80392a.toString();
        String str = this.f80393b;
        String obj2 = this.f80394c.toString();
        String valueOf = String.valueOf(this.f80395d);
        int i = this.f80396e;
        String obj3 = this.f80397f.toString();
        String str2 = this.f80398g;
        boolean z = this.f80400i;
        return "SingleFileDownloadRequest{destinationFileUri=" + obj + ", urlToDownload=" + str + ", downloadConstraints=" + obj2 + ", listenerOptional=" + valueOf + ", trafficTag=" + i + ", extraHttpHeaders=" + obj3 + ", fileSizeBytes=0, notificationContentTitle=" + str2 + ", notificationContentTextOptional=Optional.absent(), showDownloadedNotification=" + z + "}";
    }
}
