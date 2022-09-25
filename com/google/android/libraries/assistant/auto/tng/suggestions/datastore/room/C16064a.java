package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.a */
/* compiled from: PG */
public final class C16064a extends C16168l {

    /* renamed from: a */
    public String f47528a;

    /* renamed from: b */
    public String f47529b;

    /* renamed from: c */
    public Long f47530c;

    /* renamed from: d */
    private String f47531d;

    /* renamed from: e */
    private String f47532e;

    /* renamed from: f */
    private C16169m f47533f;

    /* renamed from: g */
    private C16333ag f47534g;

    /* renamed from: a */
    public final C16170n mo22675a() {
        String str;
        String str2;
        C16169m mVar;
        C16333ag agVar;
        String str3 = this.f47528a;
        if (str3 != null && (str = this.f47531d) != null && (str2 = this.f47532e) != null && (mVar = this.f47533f) != null && (agVar = this.f47534g) != null) {
            return new C16101b(str3, str, this.f47529b, str2, mVar, this.f47530c, agVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f47528a == null) {
            sb.append(" id");
        }
        if (this.f47531d == null) {
            sb.append(" displayText");
        }
        if (this.f47532e == null) {
            sb.append(" locale");
        }
        if (this.f47533f == null) {
            sb.append(" source");
        }
        if (this.f47534g == null) {
            sb.append(" metadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo22676b(String str) {
        if (str != null) {
            this.f47531d = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    /* renamed from: c */
    public final void mo22677c(String str) {
        if (str != null) {
            this.f47528a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: d */
    public final void mo22678d(String str) {
        if (str != null) {
            this.f47532e = str;
            return;
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: e */
    public final void mo22679e(C16333ag agVar) {
        if (agVar != null) {
            this.f47534g = agVar;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    /* renamed from: f */
    public final void mo22680f(C16169m mVar) {
        if (mVar != null) {
            this.f47533f = mVar;
            return;
        }
        throw new NullPointerException("Null source");
    }
}
