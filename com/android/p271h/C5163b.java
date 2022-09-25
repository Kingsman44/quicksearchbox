package com.android.p271h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.android.p261d.p262a.C5041e;
import com.android.p261d.p263b.C5044c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.android.h.b */
/* compiled from: PG */
public final class C5163b extends C5152a {

    /* renamed from: e */
    private final Resources f16413e;

    /* renamed from: f */
    private final int f16414f;

    public C5163b(Resources resources, int i) {
        this.f16413e = resources;
        this.f16414f = i;
    }

    /* renamed from: d */
    private final InputStream m14096d() {
        return new BufferedInputStream(this.f16413e.openRawResource(this.f16414f));
    }

    /* renamed from: a */
    public final Bitmap mo10223a(BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(this.f16413e, this.f16414f, options);
    }

    /* renamed from: b */
    public final C5167f mo10224b() {
        InputStream d = m14096d();
        C5168g d2 = C5168g.m14111d(d);
        C5041e.m13845d(d);
        if (d2 != null) {
            return d2;
        }
        InputStream d3 = m14096d();
        C5166e d4 = C5166e.m14104d(d3);
        C5041e.m13845d(d3);
        return d4;
    }

    /* renamed from: c */
    public final boolean mo10225c(C5044c cVar) {
        try {
            InputStream d = m14096d();
            cVar.mo9996h(d);
            C5041e.m13845d(d);
            return true;
        } catch (IOException e) {
            Log.e("BitmapRegionTileSource", "Error reading resource", e);
            return false;
        }
    }
}
