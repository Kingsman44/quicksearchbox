package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class RelationshipStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87513ab();

    /* renamed from: a */
    public boolean f236408a;

    /* renamed from: b */
    public boolean f236409b;

    /* renamed from: c */
    public Relationship f236410c;

    public RelationshipStatus() {
        this.f236408a = false;
        this.f236409b = false;
    }

    protected RelationshipStatus(Parcel parcel) {
        this.f236410c = (Relationship) parcel.readParcelable(Relationship.class.getClassLoader());
        boolean z = false;
        this.f236408a = parcel.readInt() == 1;
        this.f236409b = parcel.readInt() == 1 ? true : z;
    }

    /* renamed from: a */
    public final void mo81599a() {
        if (this.f236408a) {
            this.f236409b = true;
        }
    }

    /* renamed from: b */
    public final boolean mo81600b() {
        return this.f236410c != null;
    }

    /* renamed from: c */
    public final boolean mo81601c() {
        return this.f236410c != null && this.f236408a && !this.f236409b;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f236410c);
        boolean z = this.f236408a;
        boolean z2 = this.f236409b;
        return "[ Relationship = " + valueOf + " : ShouldProcessRelationship = " + z + " : IsRelationshipOperationComplete = " + z2 + " ]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236410c, i);
        parcel.writeInt(this.f236408a ? 1 : 0);
        parcel.writeInt(this.f236409b ? 1 : 0);
    }

    public RelationshipStatus(RelationshipStatus relationshipStatus) {
        this.f236410c = relationshipStatus.f236410c;
        this.f236408a = relationshipStatus.f236408a;
        this.f236409b = relationshipStatus.f236409b;
    }
}
