package androidx.slice;

import android.app.slice.SliceManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import androidx.p060c.C0977g;
import androidx.slice.widget.C4134al;
import java.util.Set;

/* renamed from: androidx.slice.t */
/* compiled from: PG */
public final class C4121t extends C4120s {

    /* renamed from: b */
    public final SliceManager f13164b;

    /* renamed from: c */
    private final C0977g f13165c = new C0977g();

    /* renamed from: d */
    private final C0977g f13166d = new C0977g();

    /* renamed from: e */
    private final Set f13167e;

    public C4121t(Context context) {
        super(context);
        this.f13164b = (SliceManager) context.getSystemService(SliceManager.class);
        this.f13167e = C4107f.m11768b(C4134al.f13281c);
    }

    /* renamed from: a */
    public final Slice mo8626a(Uri uri) {
        String authority = uri.getAuthority();
        String str = (String) this.f13166d.get(authority);
        boolean z = false;
        if (str == null) {
            ProviderInfo resolveContentProvider = this.f13162a.getPackageManager().resolveContentProvider(authority, 0);
            if (resolveContentProvider != null) {
                str = resolveContentProvider.packageName;
                this.f13166d.put(authority, str);
            }
            return C4107f.m11767a(this.f13164b.bindSlice(uri, this.f13167e), this.f13162a);
        }
        Boolean bool = (Boolean) this.f13165c.get(str);
        if (bool == null) {
            try {
                if ((this.f13162a.getPackageManager().getApplicationInfo(str, 0).flags & 1073741824) != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                this.f13165c.put(str, bool);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (bool.booleanValue()) {
            return null;
        }
        return C4107f.m11767a(this.f13164b.bindSlice(uri, this.f13167e), this.f13162a);
    }

    /* renamed from: b */
    public final void mo8627b(Uri uri) {
        try {
            this.f13164b.pinSlice(uri, this.f13167e);
        } catch (RuntimeException e) {
            ContentProviderClient acquireContentProviderClient = this.f13162a.getContentResolver().acquireContentProviderClient(uri);
            if (acquireContentProviderClient == null) {
                new StringBuilder("No provider found for ").append(uri);
                throw new IllegalArgumentException("No provider found for ".concat(String.valueOf(uri)));
            } else {
                acquireContentProviderClient.release();
                throw e;
            }
        }
    }

    /* renamed from: d */
    public final void mo8629d(Uri uri) {
        try {
            this.f13164b.unpinSlice(uri);
        } catch (IllegalStateException unused) {
        }
    }
}
