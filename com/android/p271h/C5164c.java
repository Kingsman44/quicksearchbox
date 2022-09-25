package com.android.p271h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import com.android.p261d.p262a.C5041e;
import com.android.p261d.p263b.C5044c;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.android.h.c */
/* compiled from: PG */
public final class C5164c extends C5152a {

    /* renamed from: e */
    private final Context f16415e;

    /* renamed from: f */
    private final Uri f16416f;

    public C5164c(Context context, Uri uri) {
        this.f16415e = context;
        this.f16416f = uri;
    }

    /* renamed from: d */
    private final InputStream m14100d() {
        return new BufferedInputStream(this.f16415e.getContentResolver().openInputStream(this.f16416f));
    }

    /* renamed from: a */
    public final Bitmap mo10223a(BitmapFactory.Options options) {
        try {
            InputStream d = m14100d();
            Bitmap decodeStream = BitmapFactory.decodeStream(d, (Rect) null, options);
            C5041e.m13845d(d);
            return decodeStream;
        } catch (FileNotFoundException | OutOfMemoryError e) {
            Log.e("BitmapRegionTileSource", "Failed to load URI ".concat(String.valueOf(String.valueOf(this.f16416f))), e);
            return null;
        }
    }

    /* renamed from: b */
    public final C5167f mo10224b() {
        try {
            InputStream d = m14100d();
            C5168g d2 = C5168g.m14111d(d);
            C5041e.m13845d(d);
            if (d2 != null) {
                return d2;
            }
            InputStream d3 = m14100d();
            C5166e d4 = C5166e.m14104d(d3);
            C5041e.m13845d(d3);
            return d4;
        } catch (FileNotFoundException e) {
            Log.e("BitmapRegionTileSource", "Failed to load URI ".concat(String.valueOf(String.valueOf(this.f16416f))), e);
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo10225c(C5044c cVar) {
        InputStream inputStream = null;
        try {
            inputStream = m14100d();
            cVar.mo9996h(inputStream);
            C5041e.m13845d(inputStream);
            return true;
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(this.f16416f);
            Log.d("BitmapRegionTileSource", "Failed to load URI " + valueOf, e);
            return false;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(this.f16416f);
            Log.d("BitmapRegionTileSource", "Failed to load URI " + valueOf2, e2);
            return false;
        } catch (NullPointerException e3) {
            String valueOf3 = String.valueOf(this.f16416f);
            Log.d("BitmapRegionTileSource", "Failed to read EXIF for URI " + valueOf3, e3);
            return false;
        } finally {
            C5041e.m13845d(inputStream);
        }
    }
}
