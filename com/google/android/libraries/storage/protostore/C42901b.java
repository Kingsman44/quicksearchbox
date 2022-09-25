package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.storage.protostore.b */
/* compiled from: PG */
public final class C42901b extends C42877ac {

    /* renamed from: a */
    public C43007j f112235a;

    /* renamed from: b */
    public C42985du f112236b;

    /* renamed from: c */
    private Uri f112237c;

    /* renamed from: d */
    private MessageLite f112238d;

    /* renamed from: e */
    private C58480gp f112239e;

    /* renamed from: f */
    private C58485gu f112240f;

    /* renamed from: g */
    private boolean f112241g;

    /* renamed from: h */
    private byte f112242h;

    public C42901b() {
    }

    public C42901b(C42878ad adVar) {
        C42931c cVar = (C42931c) adVar;
        this.f112237c = cVar.f112309a;
        this.f112238d = cVar.f112310b;
        this.f112235a = cVar.f112311c;
        this.f112240f = cVar.f112312d;
        this.f112236b = cVar.f112313e;
        this.f112241g = cVar.f112314f;
        this.f112242h = 3;
    }

    /* renamed from: a */
    public final C42878ad mo45964a() {
        Uri uri;
        MessageLite messageLite;
        C43007j jVar;
        C42985du duVar;
        C58480gp gpVar = this.f112239e;
        if (gpVar != null) {
            this.f112240f = gpVar.mo55394f();
        } else if (this.f112240f == null) {
            this.f112240f = C58485gu.m89845m();
        }
        if (this.f112242h == 3 && (uri = this.f112237c) != null && (messageLite = this.f112238d) != null && (jVar = this.f112235a) != null && (duVar = this.f112236b) != null) {
            return new C42931c(uri, messageLite, jVar, this.f112240f, duVar, this.f112241g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f112237c == null) {
            sb.append(" uri");
        }
        if (this.f112238d == null) {
            sb.append(" schema");
        }
        if (this.f112235a == null) {
            sb.append(" handler");
        }
        if (this.f112236b == null) {
            sb.append(" variantConfig");
        }
        if ((this.f112242h & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.f112242h & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final C58480gp mo45965b() {
        if (this.f112239e == null) {
            if (this.f112240f == null) {
                this.f112239e = C58485gu.m89837e();
            } else {
                C58480gp e = C58485gu.m89837e();
                this.f112239e = e;
                e.mo55396h(this.f112240f);
                this.f112240f = null;
            }
        }
        return this.f112239e;
    }

    /* renamed from: c */
    public final void mo45966c() {
        this.f112242h = (byte) (this.f112242h | 2);
    }

    /* renamed from: d */
    public final void mo45967d(MessageLite messageLite) {
        if (messageLite != null) {
            this.f112238d = messageLite;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    /* renamed from: e */
    public final void mo45968e(Uri uri) {
        if (uri != null) {
            this.f112237c = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* renamed from: f */
    public final void mo45969f(boolean z) {
        this.f112241g = z;
        this.f112242h = (byte) (this.f112242h | 1);
    }

    /* renamed from: g */
    public final void mo45970g(C42985du duVar) {
        if (duVar != null) {
            this.f112236b = duVar;
            return;
        }
        throw new NullPointerException("Null variantConfig");
    }
}
