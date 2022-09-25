package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16354ba;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.e */
/* compiled from: PG */
public final class C16161e extends C16089ao {

    /* renamed from: a */
    public String f47659a;

    /* renamed from: b */
    private C16090ap f47660b;

    /* renamed from: c */
    private int f47661c;

    /* renamed from: d */
    private float f47662d;

    /* renamed from: e */
    private float f47663e;

    /* renamed from: f */
    private int f47664f;

    /* renamed from: g */
    private int f47665g;

    /* renamed from: h */
    private long f47666h;

    /* renamed from: i */
    private C16354ba f47667i;

    /* renamed from: j */
    private byte f47668j;

    /* renamed from: a */
    public final C16091aq mo22716a() {
        String str;
        C16090ap apVar;
        C16354ba baVar;
        if (this.f47668j == 63 && (str = this.f47659a) != null && (apVar = this.f47660b) != null && (baVar = this.f47667i) != null) {
            return new C16162f(str, apVar, this.f47661c, this.f47662d, this.f47663e, this.f47664f, this.f47665g, this.f47666h, baVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f47659a == null) {
            sb.append(" id");
        }
        if (this.f47660b == null) {
            sb.append(" displayType");
        }
        if ((this.f47668j & 1) == 0) {
            sb.append(" numSuggestions");
        }
        if ((this.f47668j & 2) == 0) {
            sb.append(" length");
        }
        if ((this.f47668j & 4) == 0) {
            sb.append(" width");
        }
        if ((this.f47668j & 8) == 0) {
            sb.append(" fontSize");
        }
        if ((this.f47668j & 16) == 0) {
            sb.append(" maxDisplayTextLength");
        }
        if ((this.f47668j & 32) == 0) {
            sb.append(" generationTimestamp");
        }
        if (this.f47667i == null) {
            sb.append(" displayMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo22717b(C16354ba baVar) {
        if (baVar != null) {
            this.f47667i = baVar;
            return;
        }
        throw new NullPointerException("Null displayMetadata");
    }

    /* renamed from: c */
    public final void mo22718c(C16090ap apVar) {
        if (apVar != null) {
            this.f47660b = apVar;
            return;
        }
        throw new NullPointerException("Null displayType");
    }

    /* renamed from: d */
    public final void mo22719d(int i) {
        this.f47664f = i;
        this.f47668j = (byte) (this.f47668j | 8);
    }

    /* renamed from: e */
    public final void mo22720e(long j) {
        this.f47666h = j;
        this.f47668j = (byte) (this.f47668j | 32);
    }

    /* renamed from: f */
    public final void mo22721f(float f) {
        this.f47662d = f;
        this.f47668j = (byte) (this.f47668j | 2);
    }

    /* renamed from: g */
    public final void mo22722g(int i) {
        this.f47665g = i;
        this.f47668j = (byte) (this.f47668j | 16);
    }

    /* renamed from: h */
    public final void mo22723h(int i) {
        this.f47661c = i;
        this.f47668j = (byte) (this.f47668j | 1);
    }

    /* renamed from: i */
    public final void mo22724i(float f) {
        this.f47663e = f;
        this.f47668j = (byte) (this.f47668j | 4);
    }
}
