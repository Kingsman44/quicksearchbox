package com.google.android.libraries.mdi.download.p2230c;

import android.net.Uri;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.mdi.download.c.f */
/* compiled from: PG */
public final class C28771f extends C28780o {

    /* renamed from: a */
    public C58833ax f78214a = C58836b.f156633a;

    /* renamed from: b */
    private Uri f78215b;

    /* renamed from: c */
    private String f78216c;

    /* renamed from: d */
    private C28779n f78217d;

    /* renamed from: e */
    private int f78218e;

    /* renamed from: f */
    private C58485gu f78219f;

    /* renamed from: g */
    private byte f78220g;

    /* renamed from: a */
    public final C28781p mo34388a() {
        Uri uri;
        String str;
        C28779n nVar;
        C58485gu guVar;
        if (this.f78220g == 1 && (uri = this.f78215b) != null && (str = this.f78216c) != null && (nVar = this.f78217d) != null && (guVar = this.f78219f) != null) {
            return new C28772g(uri, str, nVar, this.f78218e, guVar, this.f78214a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f78215b == null) {
            sb.append(" fileUri");
        }
        if (this.f78216c == null) {
            sb.append(" urlToDownload");
        }
        if (this.f78217d == null) {
            sb.append(" downloadConstraints");
        }
        if (this.f78220g == 0) {
            sb.append(" trafficTag");
        }
        if (this.f78219f == null) {
            sb.append(" extraHttpHeaders");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58833ax mo34389b() {
        return this.f78214a;
    }

    /* renamed from: c */
    public final String mo34390c() {
        String str = this.f78216c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"urlToDownload\" has not been set");
    }

    /* renamed from: d */
    public final void mo34391d(C28779n nVar) {
        if (nVar != null) {
            this.f78217d = nVar;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    /* renamed from: e */
    public final void mo34392e(C58485gu guVar) {
        if (guVar != null) {
            this.f78219f = guVar;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }

    /* renamed from: f */
    public final void mo34393f(Uri uri) {
        if (uri != null) {
            this.f78215b = uri;
            return;
        }
        throw new NullPointerException("Null fileUri");
    }

    /* renamed from: g */
    public final void mo34394g(int i) {
        this.f78218e = i;
        this.f78220g = 1;
    }

    /* renamed from: h */
    public final void mo34395h(String str) {
        if (str != null) {
            this.f78216c = str;
            return;
        }
        throw new NullPointerException("Null urlToDownload");
    }
}
