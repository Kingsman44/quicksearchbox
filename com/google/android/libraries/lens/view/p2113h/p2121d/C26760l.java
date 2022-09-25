package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Range;
import android.util.Size;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.h.d.l */
/* compiled from: PG */
public final class C26760l extends C26740ai {

    /* renamed from: a */
    public C58833ax f72927a;

    /* renamed from: b */
    public C58833ax f72928b;

    /* renamed from: c */
    public Range f72929c;

    /* renamed from: d */
    public Size f72930d;

    /* renamed from: e */
    private boolean f72931e;

    /* renamed from: f */
    private float f72932f;

    /* renamed from: g */
    private boolean f72933g;

    /* renamed from: h */
    private byte f72934h;

    public C26760l() {
        C58836b bVar = C58836b.f156633a;
        this.f72927a = bVar;
        this.f72928b = bVar;
    }

    /* renamed from: a */
    public final C26741aj mo32065a() {
        Range range;
        Size size;
        if (this.f72934h == 7 && (range = this.f72929c) != null && (size = this.f72930d) != null) {
            return new C26761m(this.f72931e, this.f72932f, this.f72927a, this.f72928b, this.f72933g, range, size);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f72934h & 1) == 0) {
            sb.append(" flashOn");
        }
        if ((this.f72934h & 2) == 0) {
            sb.append(" zoom");
        }
        if ((this.f72934h & 4) == 0) {
            sb.append(" syncFocusAndExposureRegion");
        }
        if (this.f72929c == null) {
            sb.append(" fpsDesiredRange");
        }
        if (this.f72930d == null) {
            sb.append(" previewSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo32066b(boolean z) {
        this.f72931e = z;
        this.f72934h = (byte) (this.f72934h | 1);
    }

    /* renamed from: c */
    public final void mo32067c(boolean z) {
        this.f72933g = z;
        this.f72934h = (byte) (this.f72934h | 4);
    }

    /* renamed from: d */
    public final void mo32068d(float f) {
        this.f72932f = f;
        this.f72934h = (byte) (this.f72934h | 2);
    }
}
