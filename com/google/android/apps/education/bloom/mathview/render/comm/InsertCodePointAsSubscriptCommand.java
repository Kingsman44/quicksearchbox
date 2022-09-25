package com.google.android.apps.education.bloom.mathview.render.comm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3594e.C45779i;
import com.google.apps.p3589d.p3594e.C45791u;
import com.google.apps.p3589d.p3594e.C45795y;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class InsertCodePointAsSubscriptCommand extends KeyboardCommand {
    public static final Parcelable.Creator CREATOR = new C9059c();

    /* renamed from: a */
    private final int f31282a;

    public InsertCodePointAsSubscriptCommand(int i) {
        this.f31282a = i;
    }

    /* renamed from: a */
    public final int mo17344a(C45705v vVar, int i) {
        C69664n.m101061g(vVar, "editor");
        vVar.mo49801b(new C45685b(i, i));
        C45791u uVar = (C45791u) vVar;
        uVar.mo49800a(new C45779i(uVar, this.f31282a));
        return ((C45795y) vVar).f120412h.mo49743a();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InsertCodePointAsSubscriptCommand) && this.f31282a == ((InsertCodePointAsSubscriptCommand) obj).f31282a;
    }

    public final int hashCode() {
        return this.f31282a;
    }

    public final String toString() {
        int i = this.f31282a;
        return "InsertCodePointAsSubscriptCommand(codePoint=" + i + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeInt(this.f31282a);
    }
}
