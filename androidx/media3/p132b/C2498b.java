package androidx.media3.p132b;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.media3.b.b */
/* compiled from: PG */
public final class C2498b extends C2499c {

    /* renamed from: a */
    private final AssetManager f6860a;

    /* renamed from: b */
    private Uri f6861b;

    /* renamed from: c */
    private InputStream f6862c;

    /* renamed from: d */
    private long f6863d;

    /* renamed from: e */
    private boolean f6864e;

    public C2498b(Context context) {
        super(false);
        this.f6860a = context.getAssets();
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6863d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C2454a(e, SimpleSnackbar.LENGTH_SHORT);
            }
        }
        InputStream inputStream = this.f6862c;
        int i3 = C2612ak.f7249a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f6863d;
        if (j2 != -1) {
            this.f6863d = j2 - ((long) read);
        }
        mo5927g(read);
        return read;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        try {
            Uri uri = nVar.f6891a;
            this.f6861b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo5929i(nVar);
            InputStream open = this.f6860a.open(path, 1);
            this.f6862c = open;
            if (open.skip(nVar.f6896f) >= nVar.f6896f) {
                long j = nVar.f6897g;
                if (j != -1) {
                    this.f6863d = j;
                } else {
                    long available = (long) this.f6862c.available();
                    this.f6863d = available;
                    if (available == 2147483647L) {
                        this.f6863d = -1;
                    }
                }
                this.f6864e = true;
                mo5930j(nVar);
                return this.f6863d;
            }
            throw new C2454a((Throwable) null, 2008);
        } catch (C2454a e) {
            throw e;
        } catch (IOException e2) {
            throw new C2454a(e2, true != (e2 instanceof FileNotFoundException) ? SimpleSnackbar.LENGTH_SHORT : 2005);
        }
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6861b;
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f6861b = null;
        try {
            InputStream inputStream = this.f6862c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f6862c = null;
            if (this.f6864e) {
                this.f6864e = false;
                mo5928h();
            }
        } catch (IOException e) {
            throw new C2454a(e, SimpleSnackbar.LENGTH_SHORT);
        } catch (Throwable th) {
            this.f6862c = null;
            if (this.f6864e) {
                this.f6864e = false;
                mo5928h();
            }
            throw th;
        }
    }
}
