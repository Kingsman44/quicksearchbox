package com.google.android.libraries.searchbox.shared.suggestion;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aoi;
import com.google.common.p4552o.aoj;
import com.google.common.p4552o.p4567m.C60254a;
import com.google.common.p4552o.p4567m.C60255b;
import com.google.common.p4552o.p4567m.C60257d;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class Suggestion implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C41668ah();

    /* renamed from: a */
    private static final C59071e f108904a = C59071e.m91332i("com.google.android.libraries.searchbox.shared.suggestion.Suggestion");

    /* renamed from: h */
    public static final C58485gu f108905h = C58485gu.m89845m();

    /* renamed from: A */
    public C54228aq f108906A;

    /* renamed from: B */
    public C41679e f108907B;

    /* renamed from: i */
    public final CharSequence f108908i;

    /* renamed from: j */
    public final int f108909j;

    /* renamed from: k */
    public final int f108910k;

    /* renamed from: l */
    public final Bundle f108911l;

    /* renamed from: m */
    public int f108912m;

    /* renamed from: n */
    public final String f108913n;

    /* renamed from: o */
    public volatile int f108914o;

    /* renamed from: p */
    public volatile Integer f108915p;

    /* renamed from: q */
    public volatile int f108916q;

    /* renamed from: r */
    public volatile int f108917r;

    /* renamed from: s */
    public volatile String f108918s;

    /* renamed from: t */
    public volatile String f108919t;

    /* renamed from: u */
    public volatile int f108920u;

    /* renamed from: v */
    public volatile C58485gu f108921v;

    /* renamed from: w */
    public volatile int f108922w;

    /* renamed from: x */
    public volatile C58495hd f108923x;

    /* renamed from: y */
    public final aoi f108924y;

    /* renamed from: z */
    public C58485gu f108925z;

    static {
        new Suggestion(BuildConfig.FLAVOR, 0, 0, (List) null, BuildConfig.FLAVOR, 0, 0, (C54228aq) null);
    }

    public Suggestion(Parcel parcel) {
        this.f108914o = 0;
        this.f108918s = BuildConfig.FLAVOR;
        this.f108919t = BuildConfig.FLAVOR;
        this.f108921v = C58485gu.m89845m();
        this.f108923x = C58729pv.f156485a;
        this.f108908i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f108909j = parcel.readInt();
        this.f108910k = parcel.readInt();
        this.f108925z = C58485gu.m89842j(parcel.readArrayList(Integer.class.getClassLoader()));
        this.f108911l = parcel.readBundle();
        this.f108913n = parcel.readString();
        this.f108916q = parcel.readInt();
        this.f108915p = Integer.valueOf(parcel.readInt());
        this.f108917r = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            try {
                this.f108906A = (C54228aq) C62942bv.parseFrom((C62942bv) C54228aq.f142328w, createByteArray);
            } catch (C62974ct e) {
                throw new AssertionError(e);
            }
        }
        try {
            this.f108907B = (C41679e) C62942bv.parseFrom((C62942bv) C41679e.f109005p, parcel.createByteArray());
            this.f108914o = parcel.readInt();
            this.f108918s = parcel.readString();
            this.f108919t = parcel.readString();
            this.f108920u = parcel.readInt();
            int readInt = parcel.readInt();
            C58480gp f = C58485gu.m89838f(readInt);
            int i = 0;
            while (i < readInt) {
                C60254a aVar = (C60254a) C60255b.f163024g.createBuilder();
                int a = C60257d.m92557a(parcel.readInt());
                aVar.copyOnWrite();
                C60255b bVar = (C60255b) aVar.instance;
                int i2 = a - 1;
                if (a != 0) {
                    bVar.f163027b = i2;
                    bVar.f163026a = 1 | bVar.f163026a;
                    String readString = parcel.readString();
                    aVar.copyOnWrite();
                    C60255b bVar2 = (C60255b) aVar.instance;
                    readString.getClass();
                    bVar2.f163026a |= 2;
                    bVar2.f163028c = readString;
                    f.mo55395g((C60255b) aVar.build());
                    i++;
                } else {
                    throw null;
                }
            }
            this.f108921v = f.mo55394f();
            this.f108922w = parcel.readInt();
            int readInt2 = parcel.readInt();
            C58490gz j = C58495hd.m89896j(readInt2);
            for (int i3 = 0; i3 < readInt2; i3++) {
                j.mo55429h(parcel.readString(), parcel.readString());
            }
            this.f108923x = j.mo55427f(true);
            aoi aoi = (aoi) aoj.f159492a.createBuilder();
            try {
                aoi = (aoi) aoj.f159492a.createBuilder((aoj) C62942bv.parseFrom((C62942bv) aoj.f159492a, parcel.createByteArray()));
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) f108904a.mo56226d()).mo56382g(e2)).mo56372aa(53915)).mo56386p("Failed to parse sliceInfoBuilder in Suggestion parcel.");
            } finally {
                this.f108924y = aoi;
            }
            this.f108912m = mo44201a();
        } catch (C62974ct e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: a */
    private final int mo44201a() {
        return Arrays.hashCode(new Object[]{C41670aj.m73072e(this), this.f108908i.toString(), C41670aj.m73079l(this), C41670aj.m73077j(this), C41670aj.m73073f(this), C41670aj.m73074g(this), C41670aj.m73075h(this), Integer.valueOf(this.f108910k), this.f108925z, this.f108911l.getString("query"), this.f108913n});
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Suggestion) && compareTo((Suggestion) obj) == 0;
    }

    public final int hashCode() {
        return this.f108912m;
    }

    /* renamed from: k */
    public final int mo44257k() {
        return this.f108917r;
    }

    /* renamed from: l */
    public final int mo44258l() {
        return this.f108909j;
    }

    /* renamed from: m */
    public final int mo44259m() {
        return this.f108910k;
    }

    /* renamed from: n */
    public final C41679e mo44260n() {
        return this.f108907B;
    }

    /* renamed from: o */
    public final C54228aq mo44261o() {
        return this.f108906A;
    }

    /* renamed from: p */
    public final CharSequence mo44262p() {
        return this.f108908i;
    }

    /* renamed from: q */
    public final Integer mo44263q() {
        return this.f108915p;
    }

    /* renamed from: r */
    public final List mo44264r() {
        return this.f108925z;
    }

    /* renamed from: s */
    public final boolean mo44265s() {
        return this.f108906A != null;
    }

    /* renamed from: t */
    public final int compareTo(Suggestion suggestion) {
        int i = 1;
        if ((this.f108916q == -1) ^ (suggestion.f108916q == -1)) {
            ((C59052c) ((C59052c) f108904a.mo56226d()).mo56372aa(53914)).mo56386p("It is not allowed for one suggestion to have priority but the other does not.");
        }
        if (this == suggestion) {
            return 0;
        }
        if (suggestion == null) {
            return -1;
        }
        int b = m73053b(m73053b(m73053b(m73053b(m73053b(m73053b(m73053b(m73053b(0, this.f108908i.toString(), suggestion.f108908i.toString(), 0), C41670aj.m73079l(this), C41670aj.m73079l(suggestion), 0), C41675ao.m73090J(this), C41675ao.m73090J(suggestion), 0), C41675ao.m73094N(this), C41675ao.m73094N(suggestion), 0), C41675ao.m73091K(this), C41675ao.m73091K(suggestion), 0), C41675ao.m73092L(this), C41675ao.m73092L(suggestion), 0), C41675ao.m73093M(this), C41675ao.m73093M(suggestion), 0), Integer.valueOf(this.f108910k), Integer.valueOf(suggestion.f108910k), -1);
        C58485gu guVar = this.f108925z;
        C58485gu guVar2 = suggestion.f108925z;
        if (b == 0) {
            Iterator it = guVar.iterator();
            Iterator it2 = guVar2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int compareTo = ((Comparable) it.next()).compareTo(it2.next());
                    if (compareTo != 0) {
                        i = compareTo;
                        break;
                    }
                } else {
                    i = it2.hasNext() ? -1 : 0;
                }
            }
        } else {
            i = b;
        }
        return m73053b(m73053b(m73053b(m73053b(m73053b(i, C41675ao.m73089I(this), C41675ao.m73089I(suggestion), 0), this.f108911l.getString("query"), suggestion.f108911l.getString("query"), 0), Integer.valueOf(this.f108916q), Integer.valueOf(suggestion.f108916q), -1), this.f108915p, suggestion.f108915p, -1), this.f108913n, suggestion.f108913n, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suggestion(text=");
        sb.append(this.f108908i);
        sb.append(", type=");
        sb.append(this.f108910k);
        sb.append(", subtypes=");
        sb.append(Arrays.toString(this.f108925z.toArray(C58471gg.f156097c)));
        sb.append(", source=");
        sb.append(this.f108909j);
        sb.append(", suggestionGroup=");
        sb.append(this.f108915p);
        sb.append(", suggestionPriority=");
        sb.append(this.f108916q);
        sb.append(", score=");
        sb.append(this.f108917r);
        sb.append(", suggestResult=");
        sb.append(this.f108906A);
        sb.append(", suggestionParameter=");
        sb.append(this.f108907B);
        sb.append(", parameters={");
        boolean z = true;
        for (String str : this.f108911l.keySet()) {
            if (this.f108911l.get(str) != null) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append("=");
                sb.append(this.f108911l.get(str));
                z = false;
            }
        }
        sb.append("})");
        return sb.toString();
    }

    /* renamed from: u */
    public final Spanned mo44268u() {
        CharSequence charSequence = this.f108908i;
        if (charSequence instanceof Spanned) {
            return (Spanned) charSequence;
        }
        return SpannedString.valueOf(charSequence);
    }

    /* renamed from: v */
    public final String mo44269v() {
        return this.f108908i.toString();
    }

    /* renamed from: w */
    public final boolean mo44270w() {
        return this.f108914o == 1 || this.f108914o == 2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.f108908i, parcel, 0);
        parcel.writeInt(this.f108909j);
        parcel.writeInt(this.f108910k);
        parcel.writeList(this.f108925z);
        parcel.writeBundle(this.f108911l);
        parcel.writeString(this.f108913n);
        parcel.writeInt(this.f108916q);
        parcel.writeInt(this.f108915p.intValue());
        parcel.writeInt(this.f108917r);
        C54228aq aqVar = this.f108906A;
        parcel.writeByteArray(aqVar != null ? aqVar.toByteArray() : null);
        parcel.writeByteArray(this.f108907B.toByteArray());
        parcel.writeInt(this.f108914o);
        parcel.writeString(this.f108918s);
        parcel.writeString(this.f108919t);
        parcel.writeInt(this.f108920u);
        parcel.writeInt(((C58724pq) this.f108921v).f156474d);
        C58485gu guVar = this.f108921v;
        int i2 = ((C58724pq) guVar).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            C60255b bVar = (C60255b) guVar.get(i3);
            int a = C60257d.m92557a(bVar.f163027b);
            if (a == 0) {
                a = 1;
            }
            parcel.writeInt(a - 1);
            parcel.writeString(bVar.f163028c);
        }
        parcel.writeInt(this.f108922w);
        parcel.writeInt(this.f108923x.size());
        C58800sl lA = this.f108923x.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeByteArray(((aoj) this.f108924y.build()).toByteArray());
    }

    /* renamed from: b */
    private static int m73053b(int i, Comparable comparable, Comparable comparable2, int i2) {
        if (i != 0) {
            return i;
        }
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null && comparable2 == null) {
            return m73053b(0, (Comparable) null, (Comparable) null, 0);
        }
        if (i2 != 0) {
            if (comparable != null) {
                return comparable.compareTo(comparable2);
            }
            return -1;
        } else if (comparable == null) {
            return -1;
        } else {
            if (comparable2 == null) {
                return 1;
            }
            return comparable.compareTo(comparable2);
        }
    }

    public Suggestion(CharSequence charSequence, int i, int i2, List list, Bundle bundle, String str, int i3, Integer num, int i4, C54228aq aqVar, C41679e eVar) {
        this.f108914o = 0;
        this.f108918s = BuildConfig.FLAVOR;
        this.f108919t = BuildConfig.FLAVOR;
        this.f108921v = C58485gu.m89845m();
        this.f108923x = C58729pv.f156485a;
        this.f108908i = charSequence;
        this.f108909j = i;
        this.f108910k = i2;
        this.f108925z = list == null ? C58485gu.m89845m() : C58485gu.m89842j(list);
        this.f108911l = bundle == null ? Bundle.EMPTY : bundle;
        this.f108913n = str;
        this.f108916q = i3;
        this.f108915p = num;
        this.f108917r = i4;
        this.f108924y = (aoi) aoj.f159492a.createBuilder();
        this.f108906A = aqVar;
        this.f108907B = eVar;
        this.f108912m = mo44201a();
    }

    public Suggestion(CharSequence charSequence, int i, int i2, List list, String str, Integer num, int i3, C54228aq aqVar) {
        this(charSequence, i, i2, list, (Bundle) null, str, -1, num, i3, aqVar, C41679e.f109005p);
    }

    public Suggestion(CharSequence charSequence, int i, List list, Bundle bundle) {
        this(charSequence, 0, i, list, bundle, BuildConfig.FLAVOR, C41669ai.f108954c.intValue(), -1, 0, (C54228aq) null, C41679e.f109005p);
    }
}
