package com.google.android.libraries.lens.view.flags;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public final class ConfigFlagsImpl implements Parcelable, C26244b, C26243ad {
    public static final Parcelable.Creator CREATOR = new C26255m();

    /* renamed from: a */
    private final C58495hd f71294a;

    /* renamed from: b */
    private final C58495hd f71295b;

    /* renamed from: c */
    private final C58495hd f71296c;

    /* renamed from: d */
    private final C58495hd f71297d;

    /* renamed from: e */
    private final C58495hd f71298e;

    /* renamed from: f */
    private final C58485gu f71299f;

    /* renamed from: g */
    private final C58485gu f71300g;

    /* renamed from: h */
    private final String f71301h;

    /* renamed from: i */
    private final boolean f71302i;

    /* renamed from: j */
    private final boolean f71303j;

    /* renamed from: k */
    private final long f71304k;

    public ConfigFlagsImpl(Map map, Map map2, Map map3, Map map4, Map map5, List list, List list2, String str, boolean z, boolean z2, long j) {
        this.f71294a = C58495hd.m89898l(map);
        this.f71295b = C58495hd.m89898l(map2);
        this.f71296c = C58495hd.m89898l(map3);
        this.f71297d = C58495hd.m89898l(map4);
        this.f71298e = C58495hd.m89898l(map5);
        this.f71299f = C58485gu.m89842j(list);
        this.f71301h = str;
        this.f71302i = z;
        this.f71303j = z2;
        this.f71304k = j;
        this.f71300g = C58485gu.m89842j(list2);
    }

    /* renamed from: i */
    public static Bundle m48447i(Parcel parcel) {
        return parcel.readBundle(ConfigFlagsImpl.class.getClassLoader());
    }

    /* renamed from: j */
    public static C58495hd m48448j(Bundle bundle, C26256n nVar) {
        C58490gz gzVar = new C58490gz(4);
        for (String a : bundle.keySet()) {
            gzVar.mo55430i(nVar.mo31466a(bundle, a));
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: l */
    private static Bundle m48449l(Map map, C26257o oVar) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            oVar.mo31467a(bundle, entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* renamed from: m */
    private final void m48450m() {
        if (!this.f71303j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final double mo31455a(C26239a aVar) {
        m48450m();
        if (this.f71295b.containsKey(Integer.valueOf(aVar.f71357Z))) {
            Double d = (Double) this.f71295b.get(Integer.valueOf(aVar.f71357Z));
            d.getClass();
            return d.doubleValue();
        }
        C90075e eVar = aVar.f71360ac;
        eVar.getClass();
        return eVar.f249779b;
    }

    /* renamed from: b */
    public final long mo31456b(C26239a aVar) {
        m48450m();
        if (this.f71296c.containsKey(Integer.valueOf(aVar.f71357Z))) {
            Long l = (Long) this.f71296c.get(Integer.valueOf(aVar.f71357Z));
            l.getClass();
            return l.longValue();
        }
        C90102f fVar = aVar.f71358aa;
        fVar.getClass();
        return fVar.f250557b;
    }

    /* renamed from: c */
    public final C58485gu mo31457c() {
        return this.f71299f;
    }

    /* renamed from: d */
    public final C58485gu mo31458d() {
        return this.f71300g;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo31460e() {
        return this.f71301h;
    }

    /* renamed from: f */
    public final String mo31461f(C26239a aVar) {
        m48450m();
        if (this.f71297d.containsKey(Integer.valueOf(aVar.f71357Z))) {
            String str = (String) this.f71297d.get(Integer.valueOf(aVar.f71357Z));
            str.getClass();
            return str;
        }
        C90129h hVar = aVar.f71361ad;
        hVar.getClass();
        return hVar.f251803b;
    }

    /* renamed from: g */
    public final boolean mo31462g(C26239a aVar) {
        m48450m();
        if (this.f71294a.containsKey(Integer.valueOf(aVar.f71357Z))) {
            Boolean bool = (Boolean) this.f71294a.get(Integer.valueOf(aVar.f71357Z));
            bool.getClass();
            return bool.booleanValue();
        }
        C90048d dVar = aVar.f71359ab;
        dVar.getClass();
        return dVar.f248758b;
    }

    /* renamed from: h */
    public final long mo31463h() {
        return this.f71304k;
    }

    /* renamed from: k */
    public final boolean mo31464k(C26242ac acVar) {
        if (!this.f71302i) {
            throw new UnsupportedOperationException();
        } else if (!this.f71294a.containsKey(Integer.valueOf(acVar.f71380d.f248757a))) {
            return acVar.f71380d.f248758b;
        } else {
            Boolean bool = (Boolean) this.f71294a.get(Integer.valueOf(acVar.f71380d.f248757a));
            bool.getClass();
            return bool.booleanValue();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(m48449l(this.f71294a, C26253k.f71389a));
        parcel.writeBundle(m48449l(this.f71295b, C26254l.f71390a));
        parcel.writeBundle(m48449l(this.f71296c, C26246d.f71382a));
        parcel.writeBundle(m48449l(this.f71297d, C26247e.f71383a));
        parcel.writeBundle(m48449l(this.f71298e, C26248f.f71384a));
        parcel.writeList(this.f71299f);
        parcel.writeList(this.f71300g);
        parcel.writeString(this.f71301h);
        parcel.writeInt(this.f71302i ? 1 : 0);
        parcel.writeInt(this.f71303j ? 1 : 0);
        parcel.writeLong(this.f71304k);
    }
}
