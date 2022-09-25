package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.common.base.C58827ar;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class SessionContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42333de();

    /* renamed from: a */
    public final C58485gu f110807a;

    /* renamed from: b */
    public final C58485gu f110808b;

    /* renamed from: c */
    public final C58485gu f110809c;

    /* renamed from: d */
    public final C58485gu f110810d;

    /* renamed from: e */
    public final C58833ax f110811e;

    /* renamed from: f */
    public final C58833ax f110812f;

    /* renamed from: g */
    public final String f110813g;

    /* renamed from: h */
    public final C58485gu f110814h;

    /* renamed from: i */
    public final C58485gu f110815i;

    /* renamed from: j */
    public Long f110816j = null;

    public SessionContext(List list, List list2, List list3, List list4, C58833ax axVar, C58833ax axVar2, String str, List list5, List list6, Long l) {
        C58485gu guVar;
        C58485gu guVar2;
        this.f110807a = C58485gu.m89842j(list);
        this.f110808b = C58485gu.m89842j(list2);
        this.f110809c = C58485gu.m89842j(list3);
        this.f110810d = C58485gu.m89842j(list4);
        this.f110811e = axVar;
        this.f110812f = axVar2;
        this.f110813g = str;
        if (list5 == null) {
            guVar = C58485gu.m89845m();
        } else {
            guVar = C58485gu.m89842j(list5);
        }
        this.f110814h = guVar;
        if (list6 == null) {
            guVar2 = C58485gu.m89845m();
        } else {
            guVar2 = C58485gu.m89842j(list6);
        }
        this.f110815i = guVar2;
        this.f110816j = l;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof SessionContext)) {
            SessionContext sessionContext = (SessionContext) obj;
            return C58832aw.m90831a(this.f110807a, sessionContext.f110807a) && C58832aw.m90831a(this.f110808b, sessionContext.f110808b) && C58832aw.m90831a(this.f110809c, sessionContext.f110809c) && C58832aw.m90831a(this.f110810d, sessionContext.f110810d) && C58832aw.m90831a(this.f110811e, sessionContext.f110811e) && C58832aw.m90831a(this.f110812f, sessionContext.f110812f) && C58832aw.m90831a(this.f110813g, sessionContext.f110813g) && C58832aw.m90831a(this.f110814h, sessionContext.f110814h) && C58832aw.m90831a(this.f110815i, sessionContext.f110815i) && C58832aw.m90831a(this.f110816j, sessionContext.f110816j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110807a, this.f110808b, this.f110809c, this.f110810d, this.f110811e, this.f110812f, this.f110813g, this.f110814h, this.f110815i, this.f110816j});
    }

    public final String toString() {
        C58827ar arVar = new C58827ar(",");
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("selectedFields", arVar.mo56097d(this.f110807a));
        b.mo56102b("boostedFields", arVar.mo56097d(this.f110808b));
        b.mo56102b("sharedWithFields", arVar.mo56097d(this.f110809c));
        b.mo56102b("ownerFields", arVar.mo56097d(this.f110810d));
        b.mo56102b("entryPoint", this.f110811e);
        b.mo56102b("typeLimits", this.f110812f.mo56111f());
        b.mo56102b("inAppContextId", this.f110813g);
        b.mo56102b("customResultProviderIdsToPrepend", this.f110814h);
        b.mo56102b("customResultProviderIdsToAppend", this.f110815i);
        b.mo56102b("submitSessionId", this.f110816j);
        return b.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeParcelableList(this.f110807a, 0);
        parcel.writeParcelableList(this.f110808b, 0);
        parcel.writeParcelableList(this.f110809c, 0);
        parcel.writeParcelableList(this.f110810d, 0);
        C42162a.m74083g(parcel, this.f110811e);
        parcel.writeTypedObject((Parcelable) this.f110812f.mo56111f(), 0);
        parcel.writeString(this.f110813g);
        parcel.writeStringList(this.f110814h);
        parcel.writeStringList(this.f110815i);
        if (this.f110816j != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Long l = this.f110816j;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
    }
}
