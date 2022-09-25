package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24231w;

/* renamed from: com.google.android.libraries.lens.view.session.d */
/* compiled from: PG */
final class C27784d extends C27770bf {

    /* renamed from: a */
    private final RectF f75794a;

    /* renamed from: b */
    private final C24231w f75795b;

    /* renamed from: c */
    private final boolean f75796c;

    public C27784d(RectF rectF, C24231w wVar, boolean z) {
        this.f75794a = rectF;
        this.f75795b = wVar;
        this.f75796c = z;
    }

    /* renamed from: a */
    public final float mo33254a() {
        return 0.0f;
    }

    /* renamed from: b */
    public final RectF mo33255b() {
        return this.f75794a;
    }

    /* renamed from: c */
    public final C24231w mo33256c() {
        return this.f75795b;
    }

    /* renamed from: d */
    public final boolean mo33257d() {
        return this.f75796c;
    }

    /* renamed from: e */
    public final int mo33258e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27770bf) {
            C27770bf bfVar = (C27770bf) obj;
            return this.f75794a.equals(bfVar.mo33255b()) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(bfVar.mo33254a()) && this.f75795b.equals(bfVar.mo33256c()) && this.f75796c == bfVar.mo33257d() && bfVar.mo33258e() == 1;
        }
    }

    public final int hashCode() {
        return ((((((((this.f75794a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(0.0f)) * 1000003) ^ this.f75795b.hashCode()) * 1000003) ^ (true != this.f75796c ? 1237 : 1231)) * 1000003) ^ 1;
    }

    public final String toString() {
        String obj = this.f75794a.toString();
        String obj2 = this.f75795b.toString();
        boolean z = this.f75796c;
        String num = Integer.toString(0);
        return "BoxSelection{box=" + obj + ", angleDegrees=0.0, interactionOrigin=" + obj2 + ", isFrozenImageSelection=" + z + ", autoTextSelectionMode=" + num + "}";
    }
}
