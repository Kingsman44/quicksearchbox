package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.cast.framework.media.internal.b */
/* compiled from: PG */
public final class C143509b {

    /* renamed from: a */
    public C143511d f389139a;

    /* renamed from: b */
    public Bitmap f389140b;

    /* renamed from: c */
    public boolean f389141c;

    /* renamed from: d */
    public C143508a f389142d;

    /* renamed from: e */
    private final Context f389143e;

    /* renamed from: f */
    private final ImageHints f389144f;

    /* renamed from: g */
    private Uri f389145g;

    public C143509b(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    /* renamed from: a */
    public final void mo118808a() {
        C143511d dVar = this.f389139a;
        if (dVar != null) {
            dVar.cancel(true);
            this.f389139a = null;
        }
        this.f389145g = null;
        this.f389140b = null;
        this.f389141c = false;
    }

    /* renamed from: b */
    public final void mo118809b(Uri uri) {
        int i;
        if (uri == null) {
            mo118808a();
        } else if (!uri.equals(this.f389145g)) {
            mo118808a();
            this.f389145g = uri;
            ImageHints imageHints = this.f389144f;
            int i2 = imageHints.f389038b;
            if (i2 == 0 || (i = imageHints.f389039c) == 0) {
                this.f389139a = new C143511d(this.f389143e, 0, 0, this);
            } else {
                this.f389139a = new C143511d(this.f389143e, i2, i, this);
            }
            C143511d dVar = this.f389139a;
            C143919bh.m233958a(dVar);
            Uri uri2 = this.f389145g;
            C143919bh.m233958a(uri2);
            dVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{uri2});
        }
    }

    public C143509b(Context context, ImageHints imageHints) {
        this.f389143e = context;
        this.f389144f = imageHints;
        mo118808a();
    }
}
