package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.a */
/* compiled from: PG */
public final class C24438a extends C24448c {

    /* renamed from: a */
    public Locale f66911a;

    /* renamed from: b */
    public String f66912b;

    /* renamed from: c */
    public C58833ax f66913c = C58836b.f156633a;

    /* renamed from: d */
    private int f66914d;

    /* renamed from: e */
    private int f66915e;

    /* renamed from: f */
    private byte f66916f;

    /* renamed from: a */
    public final C24449d mo29891a() {
        String str;
        if (this.f66916f == 3 && (str = this.f66912b) != null) {
            return new C24447b(this.f66911a, str, this.f66914d, this.f66915e, this.f66913c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f66912b == null) {
            sb.append(" modelName");
        }
        if ((this.f66916f & 1) == 0) {
            sb.append(" eventType");
        }
        if ((this.f66916f & 2) == 0) {
            sb.append(" errorType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29892b(int i) {
        this.f66915e = i;
        this.f66916f = (byte) (this.f66916f | 2);
    }

    /* renamed from: c */
    public final void mo29893c(int i) {
        this.f66914d = i;
        this.f66916f = (byte) (this.f66916f | 1);
    }
}
