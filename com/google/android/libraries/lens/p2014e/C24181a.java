package com.google.android.libraries.lens.p2014e;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.aae;

/* renamed from: com.google.android.libraries.lens.e.a */
/* compiled from: PG */
public final class C24181a extends C24225q {

    /* renamed from: a */
    public Bitmap f66090a;

    /* renamed from: b */
    public C58833ax f66091b;

    /* renamed from: c */
    public RectF f66092c;

    /* renamed from: d */
    public C26733ab f66093d;

    /* renamed from: e */
    public aae f66094e;

    /* renamed from: f */
    public C58833ax f66095f;

    /* renamed from: g */
    public C58833ax f66096g;

    /* renamed from: h */
    public int f66097h;

    /* renamed from: i */
    public int f66098i;

    /* renamed from: j */
    private C24226r f66099j;

    /* renamed from: k */
    private long f66100k;

    /* renamed from: l */
    private int f66101l;

    /* renamed from: m */
    private byte f66102m;

    /* renamed from: n */
    private int f66103n;

    public C24181a() {
        C58836b bVar = C58836b.f156633a;
        this.f66091b = bVar;
        this.f66095f = bVar;
        this.f66096g = bVar;
    }

    /* renamed from: a */
    public final C24227s mo29648a() {
        if (this.f66102m == 3 && this.f66090a != null && this.f66092c != null && this.f66097h != 0 && this.f66099j != null && this.f66103n != 0 && this.f66098i != 0 && this.f66093d != null && this.f66094e != null) {
            return new C24210b(this.f66090a, this.f66091b, this.f66092c, this.f66097h, this.f66099j, this.f66103n, this.f66098i, this.f66100k, this.f66101l, this.f66093d, this.f66094e, this.f66095f, this.f66096g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f66090a == null) {
            sb.append(" bitmap");
        }
        if (this.f66092c == null) {
            sb.append(" userVisibleRegion");
        }
        if (this.f66097h == 0) {
            sb.append(" screenshotType");
        }
        if (this.f66099j == null) {
            sb.append(" source");
        }
        if (this.f66103n == 0) {
            sb.append(" imageCategory");
        }
        if (this.f66098i == 0) {
            sb.append(" imageFormat");
        }
        if ((this.f66102m & 1) == 0) {
            sb.append(" timestampUs");
        }
        if ((this.f66102m & 2) == 0) {
            sb.append(" deviceOrientation");
        }
        if (this.f66093d == null) {
            sb.append(" captureMetadata");
        }
        if (this.f66094e == null) {
            sb.append(" frameSelectionMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29649b(Bitmap bitmap) {
        if (bitmap != null) {
            this.f66090a = bitmap;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }

    /* renamed from: c */
    public final void mo29650c(C26733ab abVar) {
        if (abVar != null) {
            this.f66093d = abVar;
            return;
        }
        throw new NullPointerException("Null captureMetadata");
    }

    /* renamed from: d */
    public final void mo29651d(int i) {
        this.f66101l = i;
        this.f66102m = (byte) (this.f66102m | 2);
    }

    /* renamed from: e */
    public final void mo29652e(C24226r rVar) {
        if (rVar != null) {
            this.f66099j = rVar;
            return;
        }
        throw new NullPointerException("Null source");
    }

    /* renamed from: f */
    public final void mo29653f(long j) {
        this.f66100k = j;
        this.f66102m = (byte) (this.f66102m | 1);
    }

    /* renamed from: g */
    public final void mo29654g(int i) {
        if (i != 0) {
            this.f66103n = i;
            return;
        }
        throw new NullPointerException("Null imageCategory");
    }
}
