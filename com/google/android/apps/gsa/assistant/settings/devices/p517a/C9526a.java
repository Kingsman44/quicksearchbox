package com.google.android.apps.gsa.assistant.settings.devices.p517a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.a.a */
/* compiled from: PG */
final class C9526a extends C9528c {

    /* renamed from: a */
    public int f33029a;

    /* renamed from: b */
    public byte f33030b;

    /* renamed from: c */
    private int f33031c;

    /* renamed from: d */
    private C89849ae f33032d;

    /* renamed from: a */
    public final C9529d mo17845a() {
        C89849ae aeVar;
        if (this.f33030b == 3 && (aeVar = this.f33032d) != null) {
            return new C9527b(this.f33029a, this.f33031c, aeVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f33030b & 1) == 0) {
            sb.append(" minGhaVersion");
        }
        if ((this.f33030b & 2) == 0) {
            sb.append(" veId");
        }
        if (this.f33032d == null) {
            sb.append(" flowEvent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo17846b(C89849ae aeVar) {
        if (aeVar != null) {
            this.f33032d = aeVar;
            return;
        }
        throw new NullPointerException("Null flowEvent");
    }

    /* renamed from: c */
    public final void mo17847c(int i) {
        this.f33031c = i;
        this.f33030b = (byte) (this.f33030b | 2);
    }
}
