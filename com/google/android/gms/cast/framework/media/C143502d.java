package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.media.d */
/* compiled from: PG */
public abstract class C143502d extends C8849b implements C143503e {
    public C143502d() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            MediaMetadata mediaMetadata = (MediaMetadata) C8850c.m23492a(parcel, MediaMetadata.CREATOR);
            parcel.readInt();
            enforceNoDataAvail(parcel);
            WebImage g = mo118801g();
            parcel2.writeNoException();
            C8850c.m23498g(parcel2, g);
        } else if (i == 2) {
            C144165j f = mo118800f();
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, f);
        } else if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(mo118799e());
        } else if (i != 4) {
            return false;
        } else {
            MediaMetadata mediaMetadata2 = (MediaMetadata) C8850c.m23492a(parcel, MediaMetadata.CREATOR);
            ImageHints imageHints = (ImageHints) C8850c.m23492a(parcel, ImageHints.CREATOR);
            enforceNoDataAvail(parcel);
            WebImage h = mo118802h();
            parcel2.writeNoException();
            C8850c.m23498g(parcel2, h);
        }
        return true;
    }
}
