package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.vision.text.internal.client.WordBoxParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.vision.text.a */
/* compiled from: PG */
public final class C146321a implements C146323c {

    /* renamed from: a */
    private final WordBoxParcel f395224a;

    public C146321a(WordBoxParcel wordBoxParcel) {
        this.f395224a = wordBoxParcel;
    }

    /* renamed from: a */
    public final Rect mo122887a() {
        return C146325e.m238290a(this);
    }

    /* renamed from: b */
    public final String mo122888b() {
        return this.f395224a.f395252d;
    }

    /* renamed from: c */
    public final List mo122889c() {
        return new ArrayList();
    }

    /* renamed from: d */
    public final Point[] mo122890d() {
        return C146325e.m238291b(this.f395224a.f395250b);
    }
}
