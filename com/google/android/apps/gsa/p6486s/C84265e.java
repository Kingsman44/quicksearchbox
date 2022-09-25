package com.google.android.apps.gsa.p6486s;

import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.s.e */
/* compiled from: PG */
public final class C84265e extends C84276p {

    /* renamed from: a */
    public C58833ax f229323a;

    /* renamed from: b */
    public C58833ax f229324b;

    /* renamed from: c */
    public C58833ax f229325c;

    /* renamed from: d */
    private C52176ia f229326d;

    /* renamed from: e */
    private boolean f229327e;

    /* renamed from: f */
    private boolean f229328f;

    /* renamed from: g */
    private byte f229329g;

    public C84265e() {
        C58836b bVar = C58836b.f156633a;
        this.f229323a = bVar;
        this.f229324b = bVar;
        this.f229325c = bVar;
    }

    /* renamed from: a */
    public final C84278r mo77765a() {
        C52176ia iaVar;
        if (this.f229329g == 3 && (iaVar = this.f229326d) != null) {
            return new C84266f(iaVar, this.f229327e, this.f229328f, this.f229323a, this.f229324b, this.f229325c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f229326d == null) {
            sb.append(" mediaData");
        }
        if ((this.f229329g & 1) == 0) {
            sb.append(" autoPlay");
        }
        if ((this.f229329g & 2) == 0) {
            sb.append(" autoPlayNext");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77766b(boolean z) {
        this.f229327e = z;
        this.f229329g = (byte) (this.f229329g | 1);
    }

    /* renamed from: c */
    public final void mo77767c(boolean z) {
        this.f229328f = z;
        this.f229329g = (byte) (this.f229329g | 2);
    }

    /* renamed from: d */
    public final void mo77768d(C52176ia iaVar) {
        if (iaVar != null) {
            this.f229326d = iaVar;
            return;
        }
        throw new NullPointerException("Null mediaData");
    }
}
