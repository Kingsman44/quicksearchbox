package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.assistant.p3897e.p3921j.C52560wg;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a */
/* compiled from: PG */
final class C13102a extends C13151g {

    /* renamed from: a */
    private boolean f40636a;

    /* renamed from: b */
    private boolean f40637b;

    /* renamed from: c */
    private boolean f40638c;

    /* renamed from: d */
    private C52560wg f40639d;

    /* renamed from: e */
    private byte f40640e;

    public C13102a() {
    }

    public C13102a(C13152h hVar) {
        C13145b bVar = (C13145b) hVar;
        this.f40636a = bVar.f40742a;
        this.f40637b = bVar.f40743b;
        this.f40638c = bVar.f40744c;
        this.f40639d = bVar.f40745d;
        this.f40640e = 7;
    }

    /* renamed from: a */
    public final C13152h mo20900a() {
        C52560wg wgVar;
        if (this.f40640e == 7 && (wgVar = this.f40639d) != null) {
            return new C13145b(this.f40636a, this.f40637b, this.f40638c, wgVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f40640e & 1) == 0) {
            sb.append(" isFirstItem");
        }
        if ((this.f40640e & 2) == 0) {
            sb.append(" isLastItem");
        }
        if ((this.f40640e & 4) == 0) {
            sb.append(" isFallbackItem");
        }
        if (this.f40639d == null) {
            sb.append(" mediaItem");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20901b(boolean z) {
        this.f40638c = z;
        this.f40640e = (byte) (this.f40640e | 4);
    }

    /* renamed from: c */
    public final void mo20902c(boolean z) {
        this.f40636a = z;
        this.f40640e = (byte) (this.f40640e | 1);
    }

    /* renamed from: d */
    public final void mo20903d(boolean z) {
        this.f40637b = z;
        this.f40640e = (byte) (this.f40640e | 2);
    }

    /* renamed from: e */
    public final void mo20904e(C52560wg wgVar) {
        if (wgVar != null) {
            this.f40639d = wgVar;
            return;
        }
        throw new NullPointerException("Null mediaItem");
    }
}
