package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.an.b.a */
/* compiled from: PG */
final class C25390a extends C25409g {

    /* renamed from: a */
    public Rect f69164a;

    /* renamed from: b */
    public C58833ax f69165b;

    /* renamed from: c */
    public C58833ax f69166c;

    /* renamed from: d */
    public C58833ax f69167d;

    /* renamed from: e */
    private Bitmap f69168e;

    /* renamed from: f */
    private int f69169f;

    /* renamed from: g */
    private byte f69170g;

    public C25390a() {
        C58836b bVar = C58836b.f156633a;
        this.f69165b = bVar;
        this.f69166c = bVar;
        this.f69167d = bVar;
    }

    /* renamed from: a */
    public final Bitmap mo30428a() {
        Bitmap bitmap = this.f69168e;
        if (bitmap != null) {
            return bitmap;
        }
        throw new IllegalStateException("Property \"bitmap\" has not been set");
    }

    /* renamed from: b */
    public final C25411i mo30429b() {
        Bitmap bitmap;
        Rect rect;
        if (this.f69170g == 1 && (bitmap = this.f69168e) != null && (rect = this.f69164a) != null) {
            return new C25404b(bitmap, rect, this.f69169f, this.f69165b, this.f69166c, this.f69167d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f69168e == null) {
            sb.append(" bitmap");
        }
        if (this.f69164a == null) {
            sb.append(" croppedRect");
        }
        if (this.f69170g == 0) {
            sb.append(" quality");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final void mo30430c(Bitmap bitmap) {
        if (bitmap != null) {
            this.f69168e = bitmap;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }

    /* renamed from: d */
    public final void mo30431d(int i) {
        this.f69169f = i;
        this.f69170g = 1;
    }
}
