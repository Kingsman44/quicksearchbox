package com.bumptech.glide.load.p299c.p302c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.p291h.C5630q;
import java.util.List;

/* renamed from: com.bumptech.glide.load.c.c.i */
/* compiled from: PG */
public final class C5891i implements C5962u {

    /* renamed from: a */
    public static final C5959r f17505a = C5959r.m15374a("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: b */
    private final Context f17506b;

    public C5891i(Context context) {
        this.f17506b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5679av mo12293a(Object obj, int i, int i2, C5960s sVar) {
        return mo12340c((Uri) obj, sVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* renamed from: c */
    public final C5679av mo12340c(Uri uri, C5960s sVar) {
        Context context;
        int i;
        Drawable drawable;
        String authority = uri.getAuthority();
        boolean z = false;
        if (authority.equals(this.f17506b.getPackageName())) {
            context = this.f17506b;
        } else {
            try {
                context = this.f17506b.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (authority.contains(this.f17506b.getPackageName())) {
                    context = this.f17506b;
                } else {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            i = context.getResources().getIdentifier(str2, str, authority2);
            if (i == 0) {
                i = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (i == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else if (pathSegments.size() == 1) {
            try {
                i = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        } else {
            throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
        }
        Resources.Theme theme = (Resources.Theme) sVar.mo12401b(f17505a);
        if (context.getPackageName().equals(authority) || theme == null) {
            z = true;
        }
        C5630q.m14604a(z, "Can't get a theme from another package");
        if (theme == null) {
            drawable = C5887e.m15219a(this.f17506b, context, i, (Resources.Theme) null);
        } else {
            Context context2 = this.f17506b;
            drawable = C5887e.m15219a(context2, context2, i, theme);
        }
        return C5890h.m15223f(drawable);
    }
}
