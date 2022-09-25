package com.google.android.libraries.mdi.download.p2243e;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.mdi.download.e.b */
/* compiled from: PG */
final class C29350b extends C29359i {

    /* renamed from: a */
    private final Uri f79560a;

    /* renamed from: b */
    private final String f79561b;

    /* renamed from: c */
    private final C28779n f79562c;

    /* renamed from: d */
    private final C58833ax f79563d;

    /* renamed from: e */
    private final int f79564e;

    /* renamed from: f */
    private final C58485gu f79565f;

    /* renamed from: g */
    private final int f79566g = 0;

    /* renamed from: h */
    private final String f79567h;

    /* renamed from: i */
    private final C58833ax f79568i;

    /* renamed from: j */
    private final boolean f79569j;

    public C29350b(Uri uri, String str, C28779n nVar, C58833ax axVar, int i, C58485gu guVar, int i2, String str2, C58833ax axVar2, boolean z) {
        this.f79560a = uri;
        this.f79561b = str;
        this.f79562c = nVar;
        this.f79563d = axVar;
        this.f79564e = i;
        this.f79565f = guVar;
        this.f79567h = str2;
        this.f79568i = axVar2;
        this.f79569j = z;
    }

    /* renamed from: a */
    public final int mo34669a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo34670b() {
        return this.f79564e;
    }

    /* renamed from: c */
    public final Uri mo34671c() {
        return this.f79560a;
    }

    /* renamed from: d */
    public final C28779n mo34672d() {
        return this.f79562c;
    }

    /* renamed from: e */
    public final C58833ax mo34673e() {
        return this.f79563d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29359i) {
            C29359i iVar = (C29359i) obj;
            return this.f79560a.equals(iVar.mo34671c()) && this.f79561b.equals(iVar.mo34679i()) && this.f79562c.equals(iVar.mo34672d()) && this.f79563d.equals(iVar.mo34673e()) && this.f79564e == iVar.mo34670b() && C58597ky.m90218i(this.f79565f, iVar.mo34676g()) && iVar.mo34669a() == 0 && this.f79567h.equals(iVar.mo34677h()) && this.f79568i.equals(iVar.mo34675f()) && this.f79569j == iVar.mo34680j();
        }
    }

    /* renamed from: f */
    public final C58833ax mo34675f() {
        return this.f79568i;
    }

    /* renamed from: g */
    public final C58485gu mo34676g() {
        return this.f79565f;
    }

    /* renamed from: h */
    public final String mo34677h() {
        return this.f79567h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f79560a.hashCode() ^ 1000003) * 1000003) ^ this.f79561b.hashCode()) * 1000003) ^ this.f79562c.hashCode()) * 1000003) ^ this.f79563d.hashCode()) * 1000003) ^ this.f79564e) * 1000003) ^ this.f79565f.hashCode()) * -721379959) ^ this.f79567h.hashCode()) * 1000003) ^ this.f79568i.hashCode()) * 1000003) ^ (true != this.f79569j ? 1237 : 1231);
    }

    /* renamed from: i */
    public final String mo34679i() {
        return this.f79561b;
    }

    /* renamed from: j */
    public final boolean mo34680j() {
        return this.f79569j;
    }

    public final String toString() {
        String obj = this.f79560a.toString();
        String str = this.f79561b;
        String obj2 = this.f79562c.toString();
        String valueOf = String.valueOf(this.f79563d);
        int i = this.f79564e;
        String obj3 = this.f79565f.toString();
        String str2 = this.f79567h;
        String valueOf2 = String.valueOf(this.f79568i);
        boolean z = this.f79569j;
        return "DownloadRequest{destinationFileUri=" + obj + ", urlToDownload=" + str + ", downloadConstraints=" + obj2 + ", listenerOptional=" + valueOf + ", trafficTag=" + i + ", extraHttpHeaders=" + obj3 + ", fileSizeBytes=0, notificationContentTitle=" + str2 + ", notificationContentTextOptional=" + valueOf2 + ", showDownloadedNotification=" + z + "}";
    }
}
