package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class Disambiguation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87517e();

    /* renamed from: h */
    private static final C59071e f236361h = C59071e.m91332i("com.google.android.apps.gsa.search.shared.contact.Disambiguation");

    /* renamed from: a */
    public String f236362a;

    /* renamed from: b */
    public List f236363b;

    /* renamed from: c */
    public Parcelable f236364c;

    /* renamed from: d */
    public Parcelable f236365d;

    /* renamed from: e */
    public boolean f236366e;

    /* renamed from: f */
    public boolean f236367f;

    /* renamed from: g */
    public C87518f f236368g;

    protected Disambiguation(Parcel parcel, ClassLoader classLoader) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        boolean z = false;
        if (readParcelableArray != null) {
            this.f236363b = new ArrayList();
            for (Parcelable add : readParcelableArray) {
                this.f236363b.add(add);
            }
        } else {
            C59104x d = f236361h.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.Disambiguation");
            ((C59052c) ((C59052c) d).mo56372aa(9591)).mo56386p("Candidates list is null");
        }
        this.f236364c = parcel.readParcelable(classLoader);
        this.f236366e = parcel.readByte() != 0;
        this.f236367f = parcel.readByte() != 0 ? true : z;
        this.f236362a = parcel.readString();
    }

    /* renamed from: a */
    public final String mo81532a() {
        StringBuilder sb = new StringBuilder();
        String str = this.f236362a;
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        boolean z = true;
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                z = true;
            } else if (z) {
                c = Character.toTitleCase(c);
                z = false;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo81533b() {
        if (this.f236364c == null && this.f236363b.size() == 1) {
            this.f236367f = true;
            mo81537e((Parcelable) this.f236363b.get(0));
        }
    }

    /* renamed from: c */
    public final void mo81534c() {
        C87518f fVar = this.f236368g;
        if (fVar != null) {
            fVar.mo81345a(this);
        }
    }

    /* renamed from: d */
    public final void mo81535d(Parcelable parcelable, boolean z) {
        mo81537e(parcelable);
        if (z) {
            this.f236367f = false;
            this.f236366e = true;
        }
        mo81534c();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo81538f() {
        if (mo81546o()) {
            mo81533b();
            this.f236366e = true;
            mo81534c();
        }
    }

    /* renamed from: g */
    public final boolean mo81539g() {
        return this.f236365d != null;
    }

    /* renamed from: h */
    public boolean mo81540h() {
        return this.f236364c != null && this.f236363b.size() > 1;
    }

    /* renamed from: i */
    public final boolean mo81541i() {
        return this.f236363b.isEmpty();
    }

    /* renamed from: j */
    public boolean mo81542j(Disambiguation disambiguation) {
        Parcelable parcelable = this.f236364c;
        boolean z = true;
        if (parcelable != null && parcelable.equals(disambiguation.f236364c)) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        } else if (!C58832aw.m90831a(this.f236363b, disambiguation.f236363b)) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else {
            if (!(this.f236364c == null && disambiguation.f236364c == null)) {
                z = false;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            return z;
        }
    }

    /* renamed from: l */
    public boolean mo81543l() {
        return mo81544m();
    }

    /* renamed from: m */
    public final boolean mo81544m() {
        return this.f236364c != null;
    }

    /* renamed from: n */
    public boolean mo81545n() {
        return this.f236364c == null && !this.f236363b.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo81546o() {
        if (!mo81540h()) {
            return false;
        }
        this.f236365d = this.f236364c;
        this.f236364c = null;
        return true;
    }

    public String toString() {
        String str = this.f236362a;
        String valueOf = String.valueOf(this.f236363b);
        String valueOf2 = String.valueOf(this.f236364c);
        boolean z = this.f236366e;
        return "Disambiguation : " + str + " : Candidates = " + valueOf + " : Result = " + valueOf2 + " : Interactive = " + z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        List list = this.f236363b;
        parcel.writeParcelableArray((Parcelable[]) list.toArray(new Parcelable[list.size()]), 0);
        parcel.writeParcelable(this.f236364c, 0);
        parcel.writeByte(this.f236366e ? (byte) 1 : 0);
        parcel.writeByte(this.f236367f ? (byte) 1 : 0);
        parcel.writeString(this.f236362a);
    }

    /* renamed from: k */
    public static boolean m142057k(Disambiguation disambiguation, Disambiguation disambiguation2) {
        if (disambiguation != null && disambiguation2 != null) {
            return disambiguation.mo81542j(disambiguation2);
        }
        boolean z = false;
        if ((disambiguation == null) == (disambiguation2 == null)) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo81537e(Parcelable parcelable) {
        parcelable.getClass();
        if (!this.f236363b.contains(parcelable)) {
            this.f236363b = C58597ky.m90212c(parcelable);
        }
        this.f236364c = parcelable;
        this.f236365d = null;
    }

    public Disambiguation(Disambiguation disambiguation) {
        this.f236362a = disambiguation.f236362a;
        this.f236363b = disambiguation.f236363b;
        this.f236364c = disambiguation.f236364c;
        this.f236366e = disambiguation.f236366e;
        this.f236367f = disambiguation.f236367f;
    }

    public Disambiguation(String str, List list, boolean z, boolean z2) {
        this.f236362a = str;
        list.getClass();
        this.f236363b = list;
        this.f236366e = z;
        this.f236367f = false;
        if (z2) {
            mo81533b();
        }
    }
}
