package com.google.apps.tiktok.p3648i.p3649a;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.C1879e;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import java.io.File;

/* renamed from: com.google.apps.tiktok.i.a.b */
/* compiled from: PG */
public final class C47151b {

    /* renamed from: a */
    private final Context f122772a;

    /* renamed from: b */
    private Context f122773b;

    public C47151b(Context context) {
        this.f122772a = context;
    }

    /* renamed from: e */
    private final synchronized Context m83858e() {
        if (this.f122773b == null) {
            Context a = C1879e.m5131a(this.f122772a);
            if (a == null) {
                a = this.f122772a;
            }
            this.f122773b = a;
        }
        return this.f122773b;
    }

    /* renamed from: a */
    public final C58528ij mo51049a() {
        return C58528ij.m90013M(mo51051c(1, 2), mo51051c(1, 1), mo51051c(2, 2), mo51051c(2, 1));
    }

    /* renamed from: b */
    public final File mo51050b(C47153d dVar) {
        return mo51051c(dVar.mo51045b(), dVar.mo51044a());
    }

    /* renamed from: c */
    public final File mo51051c(int i, int i2) {
        Context context = this.f122772a;
        if (i2 == 1) {
            context = m83858e();
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
            return context.getFilesDir();
        } else {
            if (i3 == 1) {
                return context.getCacheDir();
            }
            if (i3 == 2) {
                return new File(context.getDatabasePath("nonexistent_db").getParent());
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public final Uri mo51052d(C47153d dVar, String str) {
        String str2;
        int b = dVar.mo51045b();
        String str3 = dVar.mo51044a() == 1 ? "directboot-" : BuildConfig.FLAVOR;
        int i = b - 1;
        if (b != 0) {
            if (i == 0) {
                str2 = str3.concat("files");
            } else if (i == 1) {
                str2 = str3.concat("cache");
            } else if (i != 2) {
                throw new IllegalArgumentException();
            } else {
                throw new IllegalStateException("The databases directory may not be used with Mobstore.");
            }
            String g = C58837ba.m90858g(str);
            if (g.startsWith("/")) {
                g = g.substring(1);
            }
            return new Uri.Builder().scheme("android").authority(this.f122772a.getPackageName()).path("/" + str2 + "/" + g).build();
        }
        throw null;
    }
}
