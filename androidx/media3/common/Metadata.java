package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import com.evernote.android.state.BuildConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2595av();

    /* renamed from: a */
    public final Entry[] f7056a;

    /* renamed from: b */
    public final long f7057b;

    /* compiled from: PG */
    public interface Entry extends Parcelable {
        /* renamed from: a */
        C2680x mo6066a();

        /* renamed from: b */
        void mo6067b(C2592as asVar);

        /* renamed from: c */
        byte[] mo6068c();
    }

    public Metadata(long j, Entry... entryArr) {
        this.f7057b = j;
        this.f7056a = entryArr;
    }

    public Metadata(Parcel parcel) {
        this.f7056a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f7056a;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.f7057b = parcel.readLong();
                return;
            }
        }
    }

    /* renamed from: a */
    public final Metadata mo6059a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new Metadata(this.f7057b, (Entry[]) C2612ak.m6964an(this.f7056a, entryArr));
    }

    /* renamed from: b */
    public final Metadata mo6060b(Metadata metadata) {
        return metadata == null ? this : mo6059a(metadata.f7056a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            return Arrays.equals(this.f7056a, metadata.f7056a) && this.f7057b == metadata.f7057b;
        }
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f7056a);
        long j = this.f7057b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.f7056a);
        long j = this.f7057b;
        if (j == -9223372036854775807L) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7056a.length);
        for (Entry writeParcelable : this.f7056a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f7057b);
    }

    public Metadata(List list) {
        this(-9223372036854775807L, (Entry[]) list.toArray(new Entry[0]));
    }
}
