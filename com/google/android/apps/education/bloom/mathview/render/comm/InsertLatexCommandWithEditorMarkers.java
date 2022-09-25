package com.google.android.apps.education.bloom.mathview.render.comm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3594e.C45791u;
import com.google.apps.p3589d.p3594e.C45795y;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class InsertLatexCommandWithEditorMarkers extends KeyboardCommand {
    public static final Parcelable.Creator CREATOR = new C9061e();

    /* renamed from: a */
    private final String f31284a;

    public InsertLatexCommandWithEditorMarkers(String str) {
        C69664n.m101061g(str, "latex");
        this.f31284a = str;
    }

    /* renamed from: a */
    public final int mo17344a(C45705v vVar, int i) {
        C69664n.m101061g(vVar, "editor");
        vVar.mo49801b(new C45685b(i, i));
        ((C45791u) vVar).mo49910l(this.f31284a);
        return ((C45795y) vVar).f120412h.mo49743a();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InsertLatexCommandWithEditorMarkers) && C69664n.m101066l(this.f31284a, ((InsertLatexCommandWithEditorMarkers) obj).f31284a);
    }

    public final int hashCode() {
        return this.f31284a.hashCode();
    }

    public final String toString() {
        String str = this.f31284a;
        return "InsertLatexCommandWithEditorMarkers(latex=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeString(this.f31284a);
    }
}
