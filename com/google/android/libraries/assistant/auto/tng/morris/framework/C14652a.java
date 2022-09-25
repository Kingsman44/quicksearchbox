package com.google.android.libraries.assistant.auto.tng.morris.framework;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a */
/* compiled from: PG */
public final class C14652a extends C14988j {

    /* renamed from: a */
    private final C14496lj f44258a;

    /* renamed from: b */
    private final int f44259b;

    /* renamed from: c */
    private final int f44260c;

    /* renamed from: d */
    private final int f44261d;

    public C14652a(C14496lj ljVar, int i, int i2, int i3) {
        if (ljVar != null) {
            this.f44258a = ljVar;
            this.f44259b = i;
            this.f44260c = i2;
            this.f44261d = i3;
            return;
        }
        throw new NullPointerException("Null task");
    }

    /* renamed from: a */
    public final int mo21616a() {
        return this.f44259b;
    }

    /* renamed from: b */
    public final C14496lj mo21617b() {
        return this.f44258a;
    }

    /* renamed from: c */
    public final int mo21618c() {
        return this.f44261d;
    }

    /* renamed from: d */
    public final int mo21619d() {
        return this.f44260c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14988j) {
            C14988j jVar = (C14988j) obj;
            return this.f44258a.equals(jVar.mo21617b()) && this.f44259b == jVar.mo21616a() && this.f44260c == jVar.mo21619d() && this.f44261d == jVar.mo21618c();
        }
    }

    public final int hashCode() {
        return ((((((this.f44258a.hashCode() ^ 1000003) * 1000003) ^ this.f44259b) * 1000003) ^ this.f44260c) * 1000003) ^ this.f44261d;
    }

    public final String toString() {
        String num = Integer.toString(this.f44258a.getNumber());
        int i = this.f44259b;
        int i2 = this.f44260c;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? "MODAL" : "ONGOING" : "IMMERSIVE" : "INCOMING";
        String str2 = this.f44261d != 1 ? "LONG" : "SHORT";
        return "TaskMetadata{task=" + num + ", priority=" + i + ", type=" + str + ", length=" + str2 + "}";
    }
}
