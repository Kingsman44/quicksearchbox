package com.google.android.libraries.search.assistant.invocation.assistdata.api;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class AssistStateResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C33519a();

    /* renamed from: a */
    public final Bundle f89682a;

    /* renamed from: b */
    public final AssistStructure f89683b;

    /* renamed from: c */
    public final AssistContent f89684c;

    public AssistStateResult(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent) {
        this.f89682a = bundle;
        this.f89683b = assistStructure;
        this.f89684c = assistContent;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssistStateResult)) {
            return false;
        }
        AssistStateResult assistStateResult = (AssistStateResult) obj;
        return C69664n.m101066l(this.f89682a, assistStateResult.f89682a) && C69664n.m101066l(this.f89683b, assistStateResult.f89683b) && C69664n.m101066l(this.f89684c, assistStateResult.f89684c);
    }

    public final int hashCode() {
        Bundle bundle = this.f89682a;
        int i = 0;
        int hashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        AssistStructure assistStructure = this.f89683b;
        int hashCode2 = (hashCode + (assistStructure == null ? 0 : assistStructure.hashCode())) * 31;
        AssistContent assistContent = this.f89684c;
        if (assistContent != null) {
            i = assistContent.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        Bundle bundle = this.f89682a;
        AssistStructure assistStructure = this.f89683b;
        AssistContent assistContent = this.f89684c;
        return "AssistStateResult(assistData=" + bundle + ", assistStructure=" + assistStructure + ", assistContent=" + assistContent + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeBundle(this.f89682a);
        parcel.writeParcelable(this.f89683b, i);
        parcel.writeParcelable(this.f89684c, i);
    }
}
