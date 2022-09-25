package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* compiled from: PG */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    public static final PorterDuff.Mode f5825a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f5826b;

    /* renamed from: c */
    public Object f5827c;

    /* renamed from: d */
    public byte[] f5828d;

    /* renamed from: e */
    public Parcelable f5829e;

    /* renamed from: f */
    public int f5830f;

    /* renamed from: g */
    public int f5831g;

    /* renamed from: h */
    public ColorStateList f5832h;

    /* renamed from: i */
    public PorterDuff.Mode f5833i;

    /* renamed from: j */
    public String f5834j;

    /* renamed from: k */
    public String f5835k;

    public IconCompat() {
        this.f5826b = -1;
        this.f5828d = null;
        this.f5829e = null;
        this.f5830f = 0;
        this.f5831g = 0;
        this.f5832h = null;
        this.f5833i = f5825a;
        this.f5834j = null;
    }

    public IconCompat(int i) {
        this.f5828d = null;
        this.f5829e = null;
        this.f5830f = 0;
        this.f5831g = 0;
        this.f5832h = null;
        this.f5833i = f5825a;
        this.f5834j = null;
        this.f5826b = i;
    }

    /* renamed from: c */
    static Resources m5202c(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    /* renamed from: g */
    public static IconCompat m5204g(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f5827c = bitmap;
        return iconCompat;
    }

    /* renamed from: m */
    public static Bitmap m5208m(Bitmap bitmap) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        float f4 = 0.010416667f * f;
        paint.setColor(0);
        paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
        canvas.drawCircle(f2, f2, f3, paint);
        paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
        canvas.drawCircle(f2, f2, f3, paint);
        paint.clearShadowLayer();
        paint.setColor(-16777216);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: a */
    public final int mo5073a() {
        int i = this.f5826b;
        if (i == -1) {
            return C1934g.m5239a(this.f5827c);
        }
        if (i == 2) {
            return this.f5830f;
        }
        new StringBuilder("called getResId() on ").append(this);
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    /* renamed from: b */
    public final int mo5074b() {
        int i = this.f5826b;
        return i == -1 ? C1934g.m5240b(this.f5827c) : i;
    }

    /* renamed from: d */
    public final Drawable mo5075d(Context context) {
        mo5078l(context);
        return C1932e.m5232a(C1932e.m5233b(this, context), context);
    }

    /* renamed from: k */
    public final String mo5077k() {
        int i = this.f5826b;
        if (i == -1) {
            return C1934g.m5242d(this.f5827c);
        }
        if (i == 2) {
            String str = this.f5835k;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f5827c).split(":", -1)[0] : this.f5835k;
        }
        new StringBuilder("called getResPackage() on ").append(this);
        throw new IllegalStateException("called getResPackage() on ".concat(toString()));
    }

    /* renamed from: l */
    public final void mo5078l(Context context) {
        Object obj;
        if (this.f5826b == 2 && (obj = this.f5827c) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String k = mo5077k();
                int identifier = m5202c(context, k).getIdentifier(str4, str3, str5);
                if (this.f5830f != identifier) {
                    Log.i("IconCompat", "Id has changed for " + k + " " + str);
                    this.f5830f = identifier;
                }
            }
        }
    }

    public final String toString() {
        String str;
        if (this.f5826b == -1) {
            return String.valueOf(this.f5827c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f5826b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f5826b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f5827c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f5827c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f5835k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo5073a())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f5830f);
                if (this.f5831g != 0) {
                    sb.append(" off=");
                    sb.append(this.f5831g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f5827c);
                break;
        }
        if (this.f5832h != null) {
            sb.append(" tint=");
            sb.append(this.f5832h);
        }
        if (this.f5833i != f5825a) {
            sb.append(" mode=");
            sb.append(this.f5833i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: i */
    public static IconCompat m5206i(Context context, int i) {
        context.getClass();
        return m5207j(context.getResources(), context.getPackageName(), i);
    }

    /* renamed from: e */
    public final Uri mo5076e() {
        int i = this.f5826b;
        if (i == -1) {
            return C1932e.m5234c(this.f5827c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f5827c);
        }
        new StringBuilder("called getUri() on ").append(this);
        throw new IllegalStateException("called getUri() on ".concat(toString()));
    }

    /* renamed from: f */
    public static IconCompat m5203f(Uri uri) {
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f5827c = uri2;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m5205h(Uri uri) {
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f5827c = uri2;
        return iconCompat;
    }

    /* renamed from: j */
    public static IconCompat m5207j(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f5830f = i;
            if (resources != null) {
                try {
                    iconCompat.f5827c = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f5827c = str;
            }
            iconCompat.f5835k = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
}
