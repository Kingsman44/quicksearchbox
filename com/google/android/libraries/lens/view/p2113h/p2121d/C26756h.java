package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Size;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.h.d.h */
/* compiled from: PG */
public final class C26756h extends C26762n {

    /* renamed from: a */
    public Size f72896a;

    /* renamed from: b */
    public C58485gu f72897b;

    /* renamed from: c */
    public C26747ap f72898c;

    /* renamed from: d */
    private boolean f72899d;

    /* renamed from: e */
    private float f72900e;

    /* renamed from: f */
    private int f72901f;

    /* renamed from: g */
    private byte f72902g;

    /* renamed from: a */
    public final C26763o mo32091a() {
        Size size;
        C58485gu guVar;
        C26747ap apVar;
        if (this.f72902g == 7 && (size = this.f72896a) != null && (guVar = this.f72897b) != null && (apVar = this.f72898c) != null) {
            return new C26757i(size, this.f72899d, this.f72900e, this.f72901f, guVar, apVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f72896a == null) {
            sb.append(" cameraOutputSize");
        }
        if ((this.f72902g & 1) == 0) {
            sb.append(" facingFront");
        }
        if ((this.f72902g & 2) == 0) {
            sb.append(" maxZoom");
        }
        if ((this.f72902g & 4) == 0) {
            sb.append(" orientation");
        }
        if (this.f72897b == null) {
            sb.append(" supportedSizes");
        }
        if (this.f72898c == null) {
            sb.append(" cameraOutputTexture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo32092b(boolean z) {
        this.f72899d = z;
        this.f72902g = (byte) (this.f72902g | 1);
    }

    /* renamed from: c */
    public final void mo32093c(float f) {
        this.f72900e = f;
        this.f72902g = (byte) (this.f72902g | 2);
    }

    /* renamed from: d */
    public final void mo32094d(int i) {
        this.f72901f = i;
        this.f72902g = (byte) (this.f72902g | 4);
    }

    /* renamed from: e */
    public final void mo32095e(C58485gu guVar) {
        if (guVar != null) {
            this.f72897b = guVar;
            return;
        }
        throw new NullPointerException("Null supportedSizes");
    }
}
