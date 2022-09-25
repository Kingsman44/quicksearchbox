package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.assistant.p3897e.p3921j.C52560wg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.b */
/* compiled from: PG */
final class C13145b extends C13152h {

    /* renamed from: a */
    public final boolean f40742a;

    /* renamed from: b */
    public final boolean f40743b;

    /* renamed from: c */
    public final boolean f40744c;

    /* renamed from: d */
    public final C52560wg f40745d;

    public C13145b(boolean z, boolean z2, boolean z3, C52560wg wgVar) {
        this.f40742a = z;
        this.f40743b = z2;
        this.f40744c = z3;
        this.f40745d = wgVar;
    }

    /* renamed from: a */
    public final C13151g mo20928a() {
        return new C13102a(this);
    }

    /* renamed from: b */
    public final C52560wg mo20929b() {
        return this.f40745d;
    }

    /* renamed from: c */
    public final boolean mo20930c() {
        return this.f40744c;
    }

    /* renamed from: d */
    public final boolean mo20931d() {
        return this.f40742a;
    }

    /* renamed from: e */
    public final boolean mo20932e() {
        return this.f40743b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13152h) {
            C13152h hVar = (C13152h) obj;
            return this.f40742a == hVar.mo20931d() && this.f40743b == hVar.mo20932e() && this.f40744c == hVar.mo20930c() && this.f40745d.equals(hVar.mo20929b());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f40742a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f40743b ? 1237 : 1231)) * 1000003;
        if (true == this.f40744c) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.f40745d.hashCode();
    }

    public final String toString() {
        boolean z = this.f40742a;
        boolean z2 = this.f40743b;
        boolean z3 = this.f40744c;
        String obj = this.f40745d.toString();
        return "MediaItemHolder{isFirstItem=" + z + ", isLastItem=" + z2 + ", isFallbackItem=" + z3 + ", mediaItem=" + obj + "}";
    }
}
