package androidx.core.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.C1932e;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.w */
/* compiled from: PG */
public final class C1836w extends C1789af {

    /* renamed from: a */
    private IconCompat f5665a;

    /* renamed from: b */
    private IconCompat f5666b;

    /* renamed from: c */
    private boolean f5667c;

    /* renamed from: d */
    private boolean f5668d;

    /* renamed from: g */
    private static IconCompat m5023g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return C1932e.m5236e((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.m5204g((Bitmap) parcelable);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo4986a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    /* renamed from: b */
    public final void mo4987b(C1830q qVar) {
        Bitmap bitmap;
        C1792ai aiVar = (C1792ai) qVar;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(aiVar.f5598b).setBigContentTitle(this.f5580f);
        if (this.f5665a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                C1835v.m5020a(bigContentTitle, C1932e.m5233b(this.f5665a, aiVar.f5597a));
            } else if (this.f5665a.mo5074b() == 1) {
                IconCompat iconCompat = this.f5665a;
                int i = iconCompat.f5826b;
                if (i == -1) {
                    Object obj = iconCompat.f5827c;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat.f5827c;
                } else if (i == 5) {
                    bitmap = IconCompat.m5208m((Bitmap) iconCompat.f5827c);
                } else {
                    new StringBuilder("called getBitmap() on ").append(iconCompat);
                    throw new IllegalStateException("called getBitmap() on ".concat(iconCompat.toString()));
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.f5667c) {
            IconCompat iconCompat2 = this.f5666b;
            if (iconCompat2 == null) {
                C1833t.m5017a(bigContentTitle, (Bitmap) null);
            } else {
                C1834u.m5019a(bigContentTitle, C1932e.m5233b(iconCompat2, aiVar.f5597a));
            }
        }
        if (this.f5582h) {
            C1833t.m5018b(bigContentTitle, this.f5581g);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            C1835v.m5022c(bigContentTitle, this.f5668d);
            C1835v.m5021b(bigContentTitle, (CharSequence) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo4991c(Bundle bundle) {
        IconCompat iconCompat;
        super.mo4991c(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f5666b = m5023g(bundle.getParcelable("android.largeIcon.big"));
            this.f5667c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        if (parcelable != null) {
            iconCompat = m5023g(parcelable);
        } else {
            iconCompat = m5023g(bundle.getParcelable("android.pictureIcon"));
        }
        this.f5665a = iconCompat;
        this.f5668d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    /* renamed from: d */
    public final void mo5011d(Bitmap bitmap) {
        this.f5666b = bitmap == null ? null : IconCompat.m5204g(bitmap);
        this.f5667c = true;
    }

    /* renamed from: e */
    public final void mo5012e(Bitmap bitmap) {
        this.f5665a = bitmap == null ? null : IconCompat.m5204g(bitmap);
    }
}
