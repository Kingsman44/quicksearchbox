package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
public final class CorrectionSpan extends CharacterStyle implements UpdateAppearance, Parcelable {
    public static final Parcelable.Creator CREATOR = new C91085r();

    /* renamed from: a */
    public final String f253765a;

    public CorrectionSpan(String str) {
        this.f253765a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorrectionSpan) {
            return this.f253765a.equals(((CorrectionSpan) obj).f253765a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f253765a.hashCode();
    }

    public final String toString() {
        String str = this.f253765a;
        return "CorrectionSpan[" + str + "]";
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f253765a);
    }
}
