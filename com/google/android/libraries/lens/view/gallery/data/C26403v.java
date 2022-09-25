package com.google.android.libraries.lens.view.gallery.data;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.v */
/* compiled from: PG */
public final class C26403v {

    /* renamed from: a */
    public static final C26403v f71834a = new C26403v("Screenshots", Integer.valueOf(R.string.lens_gallery_screenshots_folder));

    /* renamed from: b */
    public static final C26403v f71835b = new C26403v("Download", Integer.valueOf(R.string.lens_gallery_download_folder));

    /* renamed from: c */
    public static final C26403v f71836c = new C26403v(MediaUtilities.CAMERA_FOLDER, Integer.valueOf(R.string.lens_gallery_camera_folder));

    /* renamed from: d */
    public final String f71837d;

    /* renamed from: e */
    private final Integer f71838e;

    public C26403v(String str, Integer num) {
        if (str != null) {
            this.f71837d = str;
            this.f71838e = num;
            return;
        }
        throw new NullPointerException("Null bucketName");
    }

    /* renamed from: a */
    public static C26403v m48686a(String str) {
        C26403v vVar = f71834a;
        if (vVar.f71837d.equals(str)) {
            return vVar;
        }
        C26403v vVar2 = f71835b;
        if (vVar2.f71837d.equals(str)) {
            return vVar2;
        }
        C26403v vVar3 = f71836c;
        if (vVar3.f71837d.equals(str)) {
            return vVar3;
        }
        return new C26403v(str, (Integer) null);
    }

    /* renamed from: b */
    public final String mo31602b(Context context) {
        Integer num = this.f71838e;
        return num == null ? this.f71837d : context.getString(num.intValue());
    }

    /* renamed from: c */
    public final int mo31603c() {
        if (f71834a.f71837d.equals(this.f71837d)) {
            return 2;
        }
        if (f71835b.f71837d.equals(this.f71837d)) {
            return 4;
        }
        if (f71836c.f71837d.equals(this.f71837d)) {
            return 6;
        }
        if (this.f71837d.toLowerCase(Locale.ROOT).contains("whatsapp")) {
            return 5;
        }
        if (this.f71837d.equals("Instagram")) {
            return 8;
        }
        if (this.f71837d.equals("tiktok")) {
            return 9;
        }
        if (!this.f71837d.equals("Pins")) {
            return this.f71837d.equals("Snapchat") ? 11 : 1;
        }
        return 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26403v)) {
            return false;
        }
        return this.f71837d.equals(((C26403v) obj).f71837d);
    }

    public final int hashCode() {
        return this.f71837d.hashCode();
    }
}
