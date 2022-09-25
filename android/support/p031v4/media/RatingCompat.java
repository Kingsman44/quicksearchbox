package android.support.p031v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.media.RatingCompat */
/* compiled from: PG */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0330y();

    /* renamed from: a */
    public final int f948a;

    /* renamed from: b */
    public Object f949b;

    /* renamed from: c */
    private final float f950c;

    public RatingCompat(int i, float f) {
        this.f948a = i;
        this.f950c = f;
    }

    /* renamed from: c */
    public static RatingCompat m607c(boolean z) {
        return new RatingCompat(1, true != z ? 0.0f : 1.0f);
    }

    /* renamed from: d */
    public static RatingCompat m608d(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: e */
    public static RatingCompat m609e(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    /* renamed from: f */
    public static RatingCompat m610f(boolean z) {
        return new RatingCompat(2, true != z ? 0.0f : 1.0f);
    }

    /* renamed from: g */
    public static RatingCompat m611g(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final float mo823a() {
        if (this.f948a != 6 || !mo828j()) {
            return -1.0f;
        }
        return this.f950c;
    }

    /* renamed from: b */
    public final float mo824b() {
        int i = this.f948a;
        if ((i == 3 || i == 4 || i == 5) && mo828j()) {
            return this.f950c;
        }
        return -1.0f;
    }

    public final int describeContents() {
        return this.f948a;
    }

    /* renamed from: i */
    public final boolean mo827i() {
        return this.f948a == 1 && this.f950c == 1.0f;
    }

    /* renamed from: j */
    public final boolean mo828j() {
        return this.f950c >= 0.0f;
    }

    /* renamed from: k */
    public final boolean mo829k() {
        return this.f948a == 2 && this.f950c == 1.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f948a);
        sb.append(" rating=");
        float f = this.f950c;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f948a);
        parcel.writeFloat(this.f950c);
    }

    /* renamed from: h */
    public final Object mo826h() {
        if (this.f949b == null) {
            if (mo828j()) {
                int i = this.f948a;
                switch (i) {
                    case 1:
                        this.f949b = C0331z.m1023d(mo827i());
                        break;
                    case 2:
                        this.f949b = C0331z.m1026g(mo829k());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f949b = C0331z.m1025f(i, mo824b());
                        break;
                    case 6:
                        this.f949b = C0331z.m1024e(mo823a());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f949b = C0331z.m1027h(this.f948a);
            }
        }
        return this.f949b;
    }
}
