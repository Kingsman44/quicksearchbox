package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.vision.text.b */
/* compiled from: PG */
public final class C146322b implements C146323c {

    /* renamed from: a */
    private final LineBoxParcel f395225a;

    /* renamed from: b */
    private List f395226b;

    public C146322b(LineBoxParcel lineBoxParcel) {
        this.f395225a = lineBoxParcel;
    }

    /* renamed from: a */
    public final Rect mo122887a() {
        return C146325e.m238290a(this);
    }

    /* renamed from: b */
    public final String mo122888b() {
        return this.f395225a.f395240e;
    }

    /* renamed from: c */
    public final List mo122889c() {
        int length = this.f395225a.f395236a.length;
        if (length == 0) {
            return new ArrayList(0);
        }
        if (this.f395226b == null) {
            this.f395226b = new ArrayList(length);
            for (WordBoxParcel aVar : this.f395225a.f395236a) {
                this.f395226b.add(new C146321a(aVar));
            }
        }
        return this.f395226b;
    }

    /* renamed from: d */
    public final Point[] mo122890d() {
        return C146325e.m238291b(this.f395225a.f395237b);
    }
}
