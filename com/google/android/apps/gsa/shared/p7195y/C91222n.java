package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.drawable.Drawable;
import android.util.Size;

/* renamed from: com.google.android.apps.gsa.shared.y.n */
/* compiled from: PG */
public final class C91222n extends C91193ay {

    /* renamed from: a */
    public String f254620a;

    /* renamed from: b */
    public Size f254621b;

    /* renamed from: c */
    public Integer f254622c;

    /* renamed from: d */
    public Drawable f254623d;

    /* renamed from: e */
    public Integer f254624e;

    /* renamed from: f */
    public C91210bo f254625f;

    /* renamed from: g */
    public byte f254626g;

    /* renamed from: h */
    public int f254627h;

    /* renamed from: a */
    public final C91196ba mo85443a() {
        C91210bo boVar;
        if (this.f254626g == 1 && (boVar = this.f254625f) != null && this.f254627h != 0) {
            return new C91223o(this.f254620a, this.f254621b, this.f254622c, this.f254623d, this.f254624e, boVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f254626g == 0) {
            sb.append(" cacheOnly");
        }
        if (this.f254625f == null) {
            sb.append(" transform");
        }
        if (this.f254627h == 0) {
            sb.append(" transition");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo85444b(C91210bo boVar) {
        if (boVar != null) {
            this.f254625f = boVar;
            return;
        }
        throw new NullPointerException("Null transform");
    }
}
