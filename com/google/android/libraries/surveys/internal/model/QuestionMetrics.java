package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* compiled from: PG */
public class QuestionMetrics implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C43069b();

    /* renamed from: a */
    private long f112636a;

    /* renamed from: b */
    private long f112637b;

    public QuestionMetrics() {
        this.f112636a = -1;
        this.f112637b = -1;
    }

    public QuestionMetrics(Parcel parcel) {
        this.f112636a = parcel.readLong();
        this.f112637b = parcel.readLong();
    }

    /* renamed from: b */
    public final void mo46090b() {
        if (!mo46091c()) {
            this.f112636a = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: c */
    public final boolean mo46091c() {
        return this.f112636a >= 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f112636a);
        parcel.writeLong(this.f112637b);
    }

    /* renamed from: a */
    public final void mo46089a() {
        if (!mo46091c()) {
            Log.e("SurveyQuestionMetrics", "Question was marked as answered but was never marked as shown.");
        } else if (this.f112637b >= 0) {
            int i = C43066o.f112626a;
        } else {
            this.f112637b = SystemClock.elapsedRealtime();
        }
    }
}
