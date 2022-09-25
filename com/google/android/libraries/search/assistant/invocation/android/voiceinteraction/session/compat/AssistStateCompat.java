package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class AssistStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C33513b();

    /* renamed from: a */
    public final Bundle f89669a;

    /* renamed from: b */
    public final AssistStructure f89670b;

    /* renamed from: c */
    public final AssistContent f89671c;

    /* renamed from: d */
    public final int f89672d;

    /* renamed from: e */
    public final Integer f89673e;

    /* renamed from: f */
    public final String f89674f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssistStateCompat(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, Integer num, int i2) {
        this(bundle, assistStructure, assistContent, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : num, (String) null);
    }

    public AssistStateCompat(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, Integer num, String str) {
        this.f89669a = bundle;
        this.f89670b = assistStructure;
        this.f89671c = assistContent;
        this.f89672d = i;
        this.f89673e = num;
        this.f89674f = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssistStateCompat)) {
            return false;
        }
        AssistStateCompat assistStateCompat = (AssistStateCompat) obj;
        return C69664n.m101066l(this.f89669a, assistStateCompat.f89669a) && C69664n.m101066l(this.f89670b, assistStateCompat.f89670b) && C69664n.m101066l(this.f89671c, assistStateCompat.f89671c) && this.f89672d == assistStateCompat.f89672d && C69664n.m101066l(this.f89673e, assistStateCompat.f89673e) && C69664n.m101066l(this.f89674f, assistStateCompat.f89674f);
    }

    public final int hashCode() {
        Bundle bundle = this.f89669a;
        int i = 0;
        int hashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        AssistStructure assistStructure = this.f89670b;
        int hashCode2 = (hashCode + (assistStructure == null ? 0 : assistStructure.hashCode())) * 31;
        AssistContent assistContent = this.f89671c;
        int hashCode3 = (((hashCode2 + (assistContent == null ? 0 : assistContent.hashCode())) * 31) + this.f89672d) * 31;
        Integer num = this.f89673e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f89674f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        Bundle bundle = this.f89669a;
        AssistStructure assistStructure = this.f89670b;
        AssistContent assistContent = this.f89671c;
        int i = this.f89672d;
        Integer num = this.f89673e;
        String str = this.f89674f;
        return "AssistStateCompat(assistData=" + bundle + ", assistStructure=" + assistStructure + ", assistContent=" + assistContent + ", index=" + i + ", count=" + num + ", activityId=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C69664n.m101061g(parcel, "out");
        parcel.writeBundle(this.f89669a);
        parcel.writeParcelable(this.f89670b, i);
        parcel.writeParcelable(this.f89671c, i);
        parcel.writeInt(this.f89672d);
        Integer num = this.f89673e;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f89674f);
    }
}
