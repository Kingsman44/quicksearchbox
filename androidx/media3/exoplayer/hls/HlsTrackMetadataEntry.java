package androidx.media3.exoplayer.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3186z();

    /* renamed from: a */
    public final String f9211a;

    /* renamed from: b */
    public final String f9212b;

    /* renamed from: c */
    public final List f9213c;

    /* compiled from: PG */
    public final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C3158aa();

        /* renamed from: a */
        public final int f9214a;

        /* renamed from: b */
        public final int f9215b;

        /* renamed from: c */
        public final String f9216c;

        /* renamed from: d */
        public final String f9217d;

        /* renamed from: e */
        public final String f9218e;

        /* renamed from: f */
        public final String f9219f;

        public VariantInfo(int i, int i2, String str, String str2, String str3, String str4) {
            this.f9214a = i;
            this.f9215b = i2;
            this.f9216c = str;
            this.f9217d = str2;
            this.f9218e = str3;
            this.f9219f = str4;
        }

        public VariantInfo(Parcel parcel) {
            this.f9214a = parcel.readInt();
            this.f9215b = parcel.readInt();
            this.f9216c = parcel.readString();
            this.f9217d = parcel.readString();
            this.f9218e = parcel.readString();
            this.f9219f = parcel.readString();
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                VariantInfo variantInfo = (VariantInfo) obj;
                return this.f9214a == variantInfo.f9214a && this.f9215b == variantInfo.f9215b && TextUtils.equals(this.f9216c, variantInfo.f9216c) && TextUtils.equals(this.f9217d, variantInfo.f9217d) && TextUtils.equals(this.f9218e, variantInfo.f9218e) && TextUtils.equals(this.f9219f, variantInfo.f9219f);
            }
        }

        public final int hashCode() {
            int i = ((this.f9214a * 31) + this.f9215b) * 31;
            String str = this.f9216c;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f9217d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f9218e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f9219f;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9214a);
            parcel.writeInt(this.f9215b);
            parcel.writeString(this.f9216c);
            parcel.writeString(this.f9217d);
            parcel.writeString(this.f9218e);
            parcel.writeString(this.f9219f);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f9211a = parcel.readString();
        this.f9212b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f9213c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6067b(C2592as asVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ byte[] mo6068c() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
            return TextUtils.equals(this.f9211a, hlsTrackMetadataEntry.f9211a) && TextUtils.equals(this.f9212b, hlsTrackMetadataEntry.f9212b) && this.f9213c.equals(hlsTrackMetadataEntry.f9213c);
        }
    }

    public final int hashCode() {
        String str = this.f9211a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9212b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f9213c.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f9211a;
        if (str2 != null) {
            str = " [" + str2 + ", " + this.f9212b + "]";
        } else {
            str = BuildConfig.FLAVOR;
        }
        return "HlsTrackMetadataEntry".concat(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9211a);
        parcel.writeString(this.f9212b);
        int size = this.f9213c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.f9213c.get(i2), 0);
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List list) {
        this.f9211a = str;
        this.f9212b = str2;
        this.f9213c = Collections.unmodifiableList(new ArrayList(list));
    }
}
