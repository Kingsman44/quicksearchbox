package com.google.android.libraries.lens.sdk.intent;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class LensImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24944f();

    /* renamed from: a */
    public BinderBitmap f68056a;

    /* renamed from: b */
    public String f68057b;

    /* renamed from: c */
    public Uri f68058c;

    /* renamed from: d */
    public String f68059d;

    /* renamed from: e */
    public String f68060e;

    /* renamed from: f */
    private final Bundle f68061f;

    public LensImage(Bitmap bitmap) {
        this.f68056a = new BinderBitmap(bitmap.isMutable() ? bitmap.copy(bitmap.getConfig(), false) : bitmap);
        this.f68057b = null;
        Bundle bundle = new Bundle();
        this.f68061f = bundle;
        bundle.putParcelable("BinderBitmap", this.f68056a);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f68061f);
    }

    public LensImage(Uri uri, String str, String str2) {
        this.f68058c = uri;
        this.f68059d = str;
        this.f68060e = str2;
        Bundle bundle = new Bundle();
        this.f68061f = bundle;
        bundle.putParcelable("BitmapUri", uri);
        bundle.putString("PageDomain", str);
        bundle.putString("SrcUrl", str2);
        bundle.putString("TitleOrAltText", (String) null);
    }

    public LensImage(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f68061f = readBundle;
        if (readBundle != null) {
            this.f68056a = (BinderBitmap) readBundle.getParcelable("BinderBitmap");
            this.f68057b = readBundle.getString("FifeUrl");
            this.f68058c = (Uri) readBundle.getParcelable("BitmapUri");
            this.f68059d = readBundle.getString("PageDomain");
            this.f68060e = readBundle.getString("SrcUrl");
            readBundle.getString("TitleOrAltText");
        }
    }
}
