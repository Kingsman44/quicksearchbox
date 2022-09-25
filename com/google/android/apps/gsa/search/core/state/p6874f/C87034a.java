package com.google.android.apps.gsa.search.core.state.p6874f;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.search.core.state.f.a */
/* compiled from: PG */
public final class C87034a extends C87036c {

    /* renamed from: a */
    public C89062r f235087a;

    /* renamed from: b */
    private Query f235088b;

    /* renamed from: c */
    private amo f235089c;

    /* renamed from: d */
    private boolean f235090d;

    /* renamed from: e */
    private int f235091e;

    /* renamed from: f */
    private boolean f235092f;

    /* renamed from: g */
    private byte f235093g;

    /* renamed from: a */
    public final C87037d mo80647a() {
        Query query;
        amo amo;
        if (this.f235093g == 7 && (query = this.f235088b) != null && (amo = this.f235089c) != null) {
            return new C87035b(query, amo, this.f235090d, this.f235091e, this.f235092f, this.f235087a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f235088b == null) {
            sb.append(" query");
        }
        if (this.f235089c == null) {
            sb.append(" clientId");
        }
        if ((this.f235093g & 1) == 0) {
            sb.append(" navigatingInForeground");
        }
        if ((this.f235093g & 2) == 0) {
            sb.append(" eventType");
        }
        if ((this.f235093g & 4) == 0) {
            sb.append(" logNetwork");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo80648b(amo amo) {
        if (amo != null) {
            this.f235089c = amo;
            return;
        }
        throw new NullPointerException("Null clientId");
    }

    /* renamed from: c */
    public final void mo80649c(int i) {
        this.f235091e = i;
        this.f235093g = (byte) (this.f235093g | 2);
    }

    /* renamed from: d */
    public final void mo80650d(boolean z) {
        this.f235092f = z;
        this.f235093g = (byte) (this.f235093g | 4);
    }

    /* renamed from: e */
    public final void mo80651e(boolean z) {
        this.f235090d = z;
        this.f235093g = (byte) (this.f235093g | 1);
    }

    /* renamed from: f */
    public final void mo80652f(Query query) {
        if (query != null) {
            this.f235088b = query;
            return;
        }
        throw new NullPointerException("Null query");
    }
}
