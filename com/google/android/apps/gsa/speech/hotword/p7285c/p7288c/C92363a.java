package com.google.android.apps.gsa.speech.hotword.p7285c.p7288c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.c.a */
/* compiled from: PG */
final class C92363a extends C92366d {

    /* renamed from: a */
    public C58833ax f257521a;

    /* renamed from: b */
    public C58833ax f257522b;

    /* renamed from: c */
    public C58833ax f257523c;

    /* renamed from: d */
    public C58833ax f257524d;

    /* renamed from: e */
    private int f257525e;

    /* renamed from: f */
    private C92365c f257526f;

    /* renamed from: g */
    private byte f257527g;

    public C92363a() {
        C58836b bVar = C58836b.f156633a;
        this.f257521a = bVar;
        this.f257522b = bVar;
        this.f257523c = bVar;
        this.f257524d = bVar;
    }

    /* renamed from: a */
    public final C92367e mo87006a() {
        C92365c cVar;
        if (this.f257527g == 1 && (cVar = this.f257526f) != null) {
            return new C92364b(this.f257521a, this.f257522b, this.f257523c, this.f257524d, this.f257525e, cVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f257527g == 0) {
            sb.append(" canEnrollState");
        }
        if (this.f257526f == null) {
            sb.append(" errorCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo87007b(int i) {
        this.f257525e = i;
        this.f257527g = 1;
    }

    /* renamed from: c */
    public final void mo87008c(C92365c cVar) {
        if (cVar != null) {
            this.f257526f = cVar;
            return;
        }
        throw new NullPointerException("Null errorCode");
    }
}
