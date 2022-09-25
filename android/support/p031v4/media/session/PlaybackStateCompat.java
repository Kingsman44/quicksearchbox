package android.support.p031v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* compiled from: PG */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0295al();

    /* renamed from: a */
    public final int f994a;

    /* renamed from: b */
    public final long f995b;

    /* renamed from: c */
    public final long f996c;

    /* renamed from: d */
    public final float f997d;

    /* renamed from: e */
    public final long f998e;

    /* renamed from: f */
    public final int f999f;

    /* renamed from: g */
    public final CharSequence f1000g;

    /* renamed from: h */
    public final long f1001h;

    /* renamed from: i */
    public List f1002i;

    /* renamed from: j */
    public final long f1003j;

    /* renamed from: k */
    public final Bundle f1004k;

    /* renamed from: l */
    public PlaybackState f1005l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* compiled from: PG */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0299ap();

        /* renamed from: a */
        public final String f1006a;

        /* renamed from: b */
        public final CharSequence f1007b;

        /* renamed from: c */
        public final int f1008c;

        /* renamed from: d */
        public final Bundle f1009d;

        /* renamed from: e */
        public PlaybackState.CustomAction f1010e;

        public CustomAction(Parcel parcel) {
            this.f1006a = parcel.readString();
            this.f1007b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1008c = parcel.readInt();
            this.f1009d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1006a = str;
            this.f1007b = charSequence;
            this.f1008c = i;
            this.f1009d = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f1007b + ", mIcon=" + this.f1008c + ", mExtras=" + this.f1009d;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1006a);
            TextUtils.writeToParcel(this.f1007b, parcel, i);
            parcel.writeInt(this.f1008c);
            parcel.writeBundle(this.f1009d);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        this.f994a = i;
        this.f995b = j;
        this.f996c = j2;
        this.f997d = f;
        this.f998e = j3;
        this.f999f = i2;
        this.f1000g = charSequence;
        this.f1001h = j4;
        this.f1002i = new ArrayList(list);
        this.f1003j = j5;
        this.f1004k = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m665a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List q = C0296am.m758q(playbackState);
        if (q != null) {
            ArrayList arrayList2 = new ArrayList(q.size());
            for (Object next : q) {
                if (next != null) {
                    PlaybackState.CustomAction customAction2 = (PlaybackState.CustomAction) next;
                    Bundle m = C0296am.m754m(customAction2);
                    MediaSessionCompat.m652b(m);
                    customAction = new CustomAction(C0296am.m757p(customAction2), C0296am.m756o(customAction2), C0296am.m743b(customAction2), m);
                    customAction.f1010e = customAction2;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle a = C0297an.m766a(playbackState);
        MediaSessionCompat.m652b(a);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0296am.m744c(playbackState), C0296am.m749h(playbackState), C0296am.m747f(playbackState), C0296am.m742a(playbackState), C0296am.m745d(playbackState), 0, C0296am.m755n(playbackState), C0296am.m748g(playbackState), arrayList, C0296am.m746e(playbackState), a);
        playbackStateCompat.f1005l = playbackState;
        return playbackStateCompat;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f994a + ", position=" + this.f995b + ", buffered position=" + this.f996c + ", speed=" + this.f997d + ", updated=" + this.f1001h + ", actions=" + this.f998e + ", error code=" + this.f999f + ", error message=" + this.f1000g + ", custom actions=" + this.f1002i + ", active item id=" + this.f1003j + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f994a);
        parcel.writeLong(this.f995b);
        parcel.writeFloat(this.f997d);
        parcel.writeLong(this.f1001h);
        parcel.writeLong(this.f996c);
        parcel.writeLong(this.f998e);
        TextUtils.writeToParcel(this.f1000g, parcel, i);
        parcel.writeTypedList(this.f1002i);
        parcel.writeLong(this.f1003j);
        parcel.writeBundle(this.f1004k);
        parcel.writeInt(this.f999f);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f994a = parcel.readInt();
        this.f995b = parcel.readLong();
        this.f997d = parcel.readFloat();
        this.f1001h = parcel.readLong();
        this.f996c = parcel.readLong();
        this.f998e = parcel.readLong();
        this.f1000g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1002i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1003j = parcel.readLong();
        this.f1004k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f999f = parcel.readInt();
    }
}
