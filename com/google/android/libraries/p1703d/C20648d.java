package com.google.android.libraries.p1703d;

import android.app.PendingIntent;
import android.graphics.Bitmap;

/* renamed from: com.google.android.libraries.d.d */
/* compiled from: PG */
public final class C20648d extends C20658n {

    /* renamed from: a */
    public PendingIntent f57888a;

    /* renamed from: b */
    public boolean f57889b;

    /* renamed from: c */
    public byte f57890c;

    /* renamed from: d */
    private int f57891d;

    /* renamed from: e */
    private Bitmap f57892e;

    /* renamed from: f */
    private String f57893f;

    /* renamed from: a */
    public final C20659o mo25608a() {
        Bitmap bitmap;
        String str;
        PendingIntent pendingIntent;
        if (this.f57890c == 3 && (bitmap = this.f57892e) != null && (str = this.f57893f) != null && (pendingIntent = this.f57888a) != null) {
            return new C20649e(this.f57891d, bitmap, str, pendingIntent, this.f57889b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f57890c & 1) == 0) {
            sb.append(" id");
        }
        if (this.f57892e == null) {
            sb.append(" immutableIcon");
        }
        if (this.f57893f == null) {
            sb.append(" description");
        }
        if (this.f57888a == null) {
            sb.append(" pendingIntent");
        }
        if ((this.f57890c & 2) == 0) {
            sb.append(" showOnToolbar");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo25609b(String str) {
        if (str != null) {
            this.f57893f = str;
            return;
        }
        throw new NullPointerException("Null description");
    }

    /* renamed from: c */
    public final void mo25610c(int i) {
        this.f57891d = i;
        this.f57890c = (byte) (this.f57890c | 1);
    }

    /* renamed from: d */
    public final void mo25611d(Bitmap bitmap) {
        if (bitmap != null) {
            this.f57892e = bitmap;
            return;
        }
        throw new NullPointerException("Null immutableIcon");
    }
}
