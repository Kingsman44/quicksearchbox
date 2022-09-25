package android.support.p031v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.p060c.C0977g;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* compiled from: PG */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0328w();

    /* renamed from: a */
    public static final C0977g f941a;

    /* renamed from: d */
    private static final String[] f942d = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: e */
    private static final String[] f943e = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: f */
    private static final String[] f944f = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    public final Bundle f945b;

    /* renamed from: c */
    public MediaMetadata f946c;

    /* renamed from: g */
    private MediaDescriptionCompat f947g;

    static {
        C0977g gVar = new C0977g();
        f941a = gVar;
        gVar.put("android.media.metadata.TITLE", 1);
        gVar.put("android.media.metadata.ARTIST", 1);
        gVar.put("android.media.metadata.DURATION", 0);
        gVar.put("android.media.metadata.ALBUM", 1);
        gVar.put("android.media.metadata.AUTHOR", 1);
        gVar.put("android.media.metadata.WRITER", 1);
        gVar.put("android.media.metadata.COMPOSER", 1);
        gVar.put("android.media.metadata.COMPILATION", 1);
        gVar.put("android.media.metadata.DATE", 1);
        gVar.put("android.media.metadata.YEAR", 0);
        gVar.put("android.media.metadata.GENRE", 1);
        gVar.put("android.media.metadata.TRACK_NUMBER", 0);
        gVar.put("android.media.metadata.NUM_TRACKS", 0);
        gVar.put("android.media.metadata.DISC_NUMBER", 0);
        gVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        gVar.put("android.media.metadata.ART", 2);
        gVar.put("android.media.metadata.ART_URI", 1);
        gVar.put("android.media.metadata.ALBUM_ART", 2);
        gVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        gVar.put("android.media.metadata.USER_RATING", 3);
        gVar.put("android.media.metadata.RATING", 3);
        gVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        gVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        gVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        gVar.put("android.media.metadata.DISPLAY_ICON", 2);
        gVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        gVar.put("android.media.metadata.MEDIA_ID", 1);
        gVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        gVar.put("android.media.metadata.MEDIA_URI", 1);
        gVar.put("android.media.metadata.ADVERTISEMENT", 0);
        gVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f945b = bundle2;
        MediaSessionCompat.m652b(bundle2);
    }

    /* renamed from: e */
    public static MediaMetadataCompat m601e(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f946c = mediaMetadata;
        return mediaMetadataCompat;
    }

    /* renamed from: a */
    public final long mo816a(String str) {
        return this.f945b.getLong(str, 0);
    }

    /* renamed from: b */
    public final Bitmap mo817b(String str) {
        try {
            return (Bitmap) this.f945b.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    /* renamed from: c */
    public final Bundle mo818c() {
        return new Bundle(this.f945b);
    }

    /* renamed from: d */
    public final MediaDescriptionCompat mo819d() {
        Bundle bundle;
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f947g;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String f = mo821f("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence = this.f945b.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = f942d;
                int length = strArr.length;
                if (i2 >= 7) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence charSequence2 = this.f945b.getCharSequence(strArr[i2]);
                if (!TextUtils.isEmpty(charSequence2)) {
                    charSequenceArr[i] = charSequence2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = charSequence;
            charSequenceArr[1] = this.f945b.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = this.f945b.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = f943e;
            int length2 = strArr2.length;
            bundle = null;
            if (i4 >= 3) {
                bitmap = null;
                break;
            }
            Bitmap b = mo817b(strArr2[i4]);
            if (b != null) {
                bitmap = b;
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = f944f;
            int length3 = strArr3.length;
            if (i5 >= 3) {
                uri = null;
                break;
            }
            String f2 = mo821f(strArr3[i5]);
            if (!TextUtils.isEmpty(f2)) {
                uri = Uri.parse(f2);
                break;
            }
            i5++;
        }
        String f3 = mo821f("android.media.metadata.MEDIA_URI");
        Uri parse = !TextUtils.isEmpty(f3) ? Uri.parse(f3) : null;
        CharSequence charSequence3 = charSequenceArr[0];
        CharSequence charSequence4 = charSequenceArr[1];
        CharSequence charSequence5 = charSequenceArr[2];
        Bundle bundle2 = new Bundle();
        if (this.f945b.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", mo816a("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f945b.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", mo816a("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (true != bundle2.isEmpty()) {
            bundle = bundle2;
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(f, charSequence3, charSequence4, charSequence5, bitmap, uri, bundle, parse);
        this.f947g = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final String mo821f(String str) {
        CharSequence charSequence = this.f945b.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f945b);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f945b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
