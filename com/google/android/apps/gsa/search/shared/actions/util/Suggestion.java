package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58832aw;
import com.google.p4152bb.p4153a.C55367pt;
import java.util.Arrays;

/* compiled from: PG */
public class Suggestion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87497s();

    /* renamed from: a */
    public String f236275a;

    /* renamed from: b */
    public C55367pt f236276b;

    public Suggestion(String str, C55367pt ptVar) {
        this.f236275a = str;
        this.f236276b = ptVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Suggestion suggestion = (Suggestion) obj;
            return C58832aw.m90831a(this.f236275a, suggestion.f236275a) && C58832aw.m90831a(Integer.valueOf(this.f236276b.f145897f), Integer.valueOf(suggestion.f236276b.f145897f)) && C58832aw.m90831a(this.f236276b.f145894c, suggestion.f236276b.f145894c) && C58832aw.m90831a(this.f236276b.f145895d, suggestion.f236276b.f145895d) && C58832aw.m90831a(this.f236276b.f145896e, suggestion.f236276b.f145896e);
        }
    }

    public final int hashCode() {
        C55367pt ptVar = this.f236276b;
        return Arrays.hashCode(new Object[]{this.f236275a, Integer.valueOf(ptVar.f145897f), ptVar.f145894c, ptVar.f145895d, ptVar.f145896e});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236275a);
        C55367pt ptVar = this.f236276b;
        parcel.writeByteArray(ptVar != null ? ptVar.toByteArray() : null);
    }
}
