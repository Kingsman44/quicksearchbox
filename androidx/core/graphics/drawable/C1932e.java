package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.drawable.e */
/* compiled from: PG */
public final class C1932e {
    /* renamed from: a */
    static Drawable m5232a(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* renamed from: b */
    public static Icon m5233b(IconCompat iconCompat, Context context) {
        Icon icon;
        switch (iconCompat.f5826b) {
            case -1:
                return (Icon) iconCompat.f5827c;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) iconCompat.f5827c);
                break;
            case 2:
                icon = Icon.createWithResource(iconCompat.mo5077k(), iconCompat.f5830f);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) iconCompat.f5827c, iconCompat.f5830f, iconCompat.f5831g);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) iconCompat.f5827c);
                break;
            case 5:
                icon = C1933f.m5238b((Bitmap) iconCompat.f5827c);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    icon = C1935h.m5243a(iconCompat.mo5076e());
                    break;
                } else if (context != null) {
                    Uri e = iconCompat.mo5076e();
                    String scheme = e.getScheme();
                    InputStream inputStream = null;
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStream = context.getContentResolver().openInputStream(e);
                        } catch (Exception e2) {
                            new StringBuilder("Unable to load image from URI: ").append(e);
                            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(e)), e2);
                        }
                    } else {
                        try {
                            inputStream = new FileInputStream(new File((String) iconCompat.f5827c));
                        } catch (FileNotFoundException e3) {
                            new StringBuilder("Unable to load image from path: ").append(e);
                            Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(e)), e3);
                        }
                    }
                    if (inputStream != null) {
                        icon = C1933f.m5238b(BitmapFactory.decodeStream(inputStream));
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot load adaptive icon from uri: ");
                        Uri e4 = iconCompat.mo5076e();
                        sb.append(e4);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(e4)));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                    Uri e5 = iconCompat.mo5076e();
                    sb2.append(e5);
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(e5)));
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = iconCompat.f5832h;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f5833i;
        if (mode != IconCompat.f5825a) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    /* renamed from: c */
    static Uri m5234c(Object obj) {
        return C1934g.m5241c(obj);
    }

    /* renamed from: d */
    public static IconCompat m5235d(Context context, Icon icon) {
        int b = C1934g.m5240b(icon);
        if (b == 2) {
            String d = C1934g.m5242d(icon);
            try {
                return IconCompat.m5207j(IconCompat.m5202c(context, d), d, C1934g.m5239a(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else if (b == 4) {
            return IconCompat.m5205h(m5234c(icon));
        } else {
            if (b == 6) {
                return IconCompat.m5203f(m5234c(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f5827c = icon;
            return iconCompat;
        }
    }

    /* renamed from: e */
    public static IconCompat m5236e(Object obj) {
        obj.getClass();
        int b = C1934g.m5240b(obj);
        if (b == 2) {
            return IconCompat.m5207j((Resources) null, C1934g.m5242d(obj), C1934g.m5239a(obj));
        }
        if (b == 4) {
            return IconCompat.m5205h(m5234c(obj));
        }
        if (b == 6) {
            return IconCompat.m5203f(m5234c(obj));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f5827c = obj;
        return iconCompat;
    }
}
