package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.libraries.mdi.download.n */
/* compiled from: PG */
public final class C29674n extends C28808cw {

    /* renamed from: a */
    public C58833ax f80342a;

    /* renamed from: b */
    public C58833ax f80343b;

    /* renamed from: c */
    private String f80344c;

    /* renamed from: d */
    private long f80345d;

    /* renamed from: e */
    private String f80346e;

    /* renamed from: f */
    private C58485gu f80347f;

    /* renamed from: g */
    private C58495hd f80348g;

    /* renamed from: h */
    private byte f80349h;

    public C29674n() {
        C58836b bVar = C58836b.f156633a;
        this.f80342a = bVar;
        this.f80343b = bVar;
    }

    /* renamed from: a */
    public final C28809cx mo34470a() {
        String str;
        String str2;
        C58485gu guVar;
        C58495hd hdVar;
        if (this.f80349h == 1 && (str = this.f80344c) != null && (str2 = this.f80346e) != null && (guVar = this.f80347f) != null && (hdVar = this.f80348g) != null) {
            return new C29675o(str, this.f80345d, str2, this.f80342a, guVar, hdVar, this.f80343b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80344c == null) {
            sb.append(" groupName");
        }
        if (this.f80349h == 0) {
            sb.append(" buildId");
        }
        if (this.f80346e == null) {
            sb.append(" variantId");
        }
        if (this.f80347f == null) {
            sb.append(" updatedDataFileList");
        }
        if (this.f80348g == null) {
            sb.append(" inlineFileMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo34471b(long j) {
        this.f80345d = j;
        this.f80349h = 1;
    }

    /* renamed from: c */
    public final void mo34472c(String str) {
        if (str != null) {
            this.f80344c = str;
            return;
        }
        throw new NullPointerException("Null groupName");
    }

    /* renamed from: d */
    public final void mo34473d(C58495hd hdVar) {
        if (hdVar != null) {
            this.f80348g = hdVar;
            return;
        }
        throw new NullPointerException("Null inlineFileMap");
    }

    /* renamed from: e */
    public final void mo34474e(C58485gu guVar) {
        if (guVar != null) {
            this.f80347f = guVar;
            return;
        }
        throw new NullPointerException("Null updatedDataFileList");
    }

    /* renamed from: f */
    public final void mo34475f(String str) {
        if (str != null) {
            this.f80346e = str;
            return;
        }
        throw new NullPointerException("Null variantId");
    }
}
