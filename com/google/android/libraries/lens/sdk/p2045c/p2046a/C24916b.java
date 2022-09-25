package com.google.android.libraries.lens.sdk.p2045c.p2046a;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.StrictMode;
import com.google.android.libraries.p11029ao.p11032c.C147805f;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.IOException;
import java.io.InputStream;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.sdk.c.a.b */
/* compiled from: PG */
public final class C24916b {

    /* renamed from: a */
    private static final C58974d f68032a = C58974d.m91135i("ImageUtils");

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Optional m46124a(C24915a aVar, Uri uri) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            InputStream c = C147806g.m240909c(aVar.f68031a, uri, C147805f.f398779a);
            Optional ofNullable = Optional.ofNullable(BitmapFactory.decodeStream(c));
            c.close();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return ofNullable;
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) f68032a.mo56225c()).mo56382g(e)).mo56372aa(48965)).mo56389s("Failed to load bitmap from %s", uri);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return Optional.empty();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
