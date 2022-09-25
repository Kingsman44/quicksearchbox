package com.google.android.gms.cast.framework.media.widget;

import java.util.Arrays;

/* renamed from: com.google.android.gms.cast.framework.media.widget.b */
/* compiled from: PG */
public final class C143538b {

    /* renamed from: a */
    public int f389236a;

    /* renamed from: b */
    public int f389237b;

    /* renamed from: c */
    public int f389238c;

    /* renamed from: d */
    public int f389239d;

    /* renamed from: e */
    public int f389240e;

    /* renamed from: f */
    public boolean f389241f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143538b)) {
            return false;
        }
        C143538b bVar = (C143538b) obj;
        int i = bVar.f389236a;
        if (this.f389237b != bVar.f389237b) {
            return false;
        }
        int i2 = bVar.f389238c;
        int i3 = bVar.f389239d;
        int i4 = bVar.f389240e;
        boolean z = bVar.f389241f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.f389237b), 0, 0, 0, false});
    }
}
