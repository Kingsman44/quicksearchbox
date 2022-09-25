package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ay */
/* compiled from: PG */
final class C10338ay extends C10344bd {

    /* renamed from: a */
    public Optional f35021a = Optional.empty();

    /* renamed from: b */
    private int f35022b;

    /* renamed from: c */
    private byte f35023c;

    /* renamed from: d */
    private int f35024d;

    /* renamed from: a */
    public final DataType$UpdateResult mo18447a() {
        int i;
        if (this.f35023c == 1 && (i = this.f35024d) != 0) {
            return new AutoValue_DataType_UpdateResult(this.f35022b, i, this.f35021a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f35023c == 0) {
            sb.append(" responseStatus");
        }
        if (this.f35024d == 0) {
            sb.append(" serverErrorCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo18448b(Optional optional) {
        if (optional != null) {
            this.f35021a = optional;
            return;
        }
        throw new NullPointerException("Null opaqueToken");
    }

    /* renamed from: c */
    public final void mo18449c(int i) {
        this.f35022b = i;
        this.f35023c = 1;
    }

    /* renamed from: d */
    public final void mo18450d(int i) {
        if (i != 0) {
            this.f35024d = i;
            return;
        }
        throw new NullPointerException("Null serverErrorCode");
    }
}
