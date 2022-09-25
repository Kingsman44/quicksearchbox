package com.google.android.libraries.mdi.download.p2243e;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2230c.C28779n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.mdi.download.e.a */
/* compiled from: PG */
public final class C29344a extends C29358h {

    /* renamed from: a */
    public Uri f79535a;

    /* renamed from: b */
    public String f79536b;

    /* renamed from: c */
    public C28779n f79537c;

    /* renamed from: d */
    public C58833ax f79538d;

    /* renamed from: e */
    public C58485gu f79539e;

    /* renamed from: f */
    public String f79540f;

    /* renamed from: g */
    public C58833ax f79541g;

    /* renamed from: h */
    private int f79542h;

    /* renamed from: i */
    private int f79543i;

    /* renamed from: j */
    private boolean f79544j;

    /* renamed from: k */
    private byte f79545k;

    public C29344a() {
        C58836b bVar = C58836b.f156633a;
        this.f79538d = bVar;
        this.f79541g = bVar;
    }

    /* renamed from: a */
    public final C29359i mo34655a() {
        Uri uri;
        String str;
        C28779n nVar;
        C58485gu guVar;
        String str2;
        if (this.f79545k == 7 && (uri = this.f79535a) != null && (str = this.f79536b) != null && (nVar = this.f79537c) != null && (guVar = this.f79539e) != null && (str2 = this.f79540f) != null) {
            return new C29350b(uri, str, nVar, this.f79538d, this.f79542h, guVar, 0, str2, this.f79541g, this.f79544j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f79535a == null) {
            sb.append(" destinationFileUri");
        }
        if (this.f79536b == null) {
            sb.append(" urlToDownload");
        }
        if (this.f79537c == null) {
            sb.append(" downloadConstraints");
        }
        if ((this.f79545k & 1) == 0) {
            sb.append(" trafficTag");
        }
        if (this.f79539e == null) {
            sb.append(" extraHttpHeaders");
        }
        if ((this.f79545k & 2) == 0) {
            sb.append(" fileSizeBytes");
        }
        if (this.f79540f == null) {
            sb.append(" notificationContentTitle");
        }
        if ((this.f79545k & 4) == 0) {
            sb.append(" showDownloadedNotification");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58833ax mo34656b() {
        String str = this.f79540f;
        return str == null ? C58836b.f156633a : C58833ax.m90834k(str);
    }

    /* renamed from: c */
    public final String mo34657c() {
        String str = this.f79536b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"urlToDownload\" has not been set");
    }

    /* renamed from: d */
    public final void mo34658d(Uri uri) {
        if (uri != null) {
            this.f79535a = uri;
            return;
        }
        throw new NullPointerException("Null destinationFileUri");
    }

    /* renamed from: e */
    public final void mo34659e(C28779n nVar) {
        if (nVar != null) {
            this.f79537c = nVar;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    /* renamed from: f */
    public final void mo34660f(int i) {
        this.f79543i = 0;
        this.f79545k = (byte) (this.f79545k | 2);
    }

    /* renamed from: g */
    public final void mo34661g(String str) {
        if (str != null) {
            this.f79540f = str;
            return;
        }
        throw new NullPointerException("Null notificationContentTitle");
    }

    /* renamed from: h */
    public final void mo34662h(boolean z) {
        this.f79544j = z;
        this.f79545k = (byte) (this.f79545k | 4);
    }

    /* renamed from: i */
    public final void mo34663i(int i) {
        this.f79542h = i;
        this.f79545k = (byte) (this.f79545k | 1);
    }

    /* renamed from: j */
    public final void mo34664j(String str) {
        if (str != null) {
            this.f79536b = str;
            return;
        }
        throw new NullPointerException("Null urlToDownload");
    }
}
