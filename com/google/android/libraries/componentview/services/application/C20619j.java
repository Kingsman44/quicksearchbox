package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.services.application.j */
/* compiled from: PG */
public final class C20619j implements C20586bm {

    /* renamed from: a */
    private final C20579bf f57843a;

    /* renamed from: b */
    private final Executor f57844b;

    /* renamed from: c */
    private final C68214a f57845c;

    /* renamed from: d */
    private final Context f57846d;

    public C20619j(C20579bf bfVar, Executor executor, C68214a aVar, Context context) {
        this.f57843a = bfVar;
        this.f57844b = executor;
        this.f57845c = aVar;
        this.f57846d = context;
    }

    /* renamed from: a */
    public final C60870cx mo25520a(String str, byte[] bArr, ImageView imageView) {
        SettableFuture settableFuture = new SettableFuture();
        mo25564c(bArr, imageView);
        settableFuture.mo57356n(new C19744c());
        return settableFuture;
    }

    /* renamed from: b */
    public final C60870cx mo25521b(String str, ImageView imageView) {
        int i = 0;
        if (str.startsWith("data:image/")) {
            return mo25520a(str, Base64.decode(str.substring(str.indexOf("base64,") + 7), 0), imageView);
        }
        SettableFuture settableFuture = new SettableFuture();
        if (str.startsWith("android.resource")) {
            String[] split = str.split("/");
            String str2 = split[split.length - 1];
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                Log.e("BasicImageLoader", "Invalid resource id: ".concat(String.valueOf(str2)));
            }
        }
        if (i != 0) {
            imageView.setImageBitmap(BitmapFactory.decodeResource(this.f57846d.getResources(), i));
            imageView.requestLayout();
            settableFuture.mo57356n(new C19744c());
            return settableFuture;
        }
        C60856cj.m92911t(this.f57843a.mo25518c(Uri.parse(str), (Map) null, true), new C20618i(this, str, settableFuture, imageView), this.f57844b);
        return settableFuture;
    }

    /* renamed from: c */
    public final void mo25564c(byte[] bArr, ImageView imageView) {
        float f = ((DisplayMetrics) this.f57845c.mo27525b()).density;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 160;
        options.inTargetDensity = (int) (f * 160.0f);
        options.inScaled = true;
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options));
        imageView.requestLayout();
    }
}
