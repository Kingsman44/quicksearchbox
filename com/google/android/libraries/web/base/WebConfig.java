package com.google.android.libraries.web.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.keys.ParcelableCallbackKeyMultimap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class WebConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C43260k();

    /* renamed from: a */
    public final Set f112962a;

    /* renamed from: b */
    public final boolean f112963b;

    /* renamed from: c */
    public final boolean f112964c;

    /* renamed from: d */
    public final C43271v f112965d;

    /* renamed from: e */
    public final String f112966e;

    /* renamed from: f */
    public final String f112967f;

    /* renamed from: g */
    public final Integer f112968g;

    /* renamed from: h */
    public final String f112969h;

    /* renamed from: i */
    public final boolean f112970i;

    /* renamed from: j */
    public final boolean f112971j;

    /* renamed from: k */
    public final boolean f112972k;

    /* renamed from: l */
    public final boolean f112973l;

    /* renamed from: m */
    public final boolean f112974m;

    /* renamed from: n */
    public final boolean f112975n;

    /* renamed from: o */
    public final int f112976o;

    /* renamed from: p */
    public final List f112977p;

    /* renamed from: q */
    public final boolean f112978q;

    /* renamed from: r */
    public final Map f112979r;

    /* renamed from: s */
    public final ParcelableCallbackKeyMultimap f112980s;

    /* renamed from: t */
    public final Set f112981t;

    public WebConfig(Set set, boolean z, boolean z2, C43271v vVar, String str, String str2, Integer num, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, List list, boolean z9, Map map, ParcelableCallbackKeyMultimap parcelableCallbackKeyMultimap) {
        Map map2 = map;
        ParcelableCallbackKeyMultimap parcelableCallbackKeyMultimap2 = parcelableCallbackKeyMultimap;
        C69664n.m101061g(set, "postMessageConfigs");
        C69664n.m101061g(str, "userAgentSuffix");
        C69664n.m101061g(str2, "userAgentPrefix");
        C69664n.m101061g(map2, "features");
        C69664n.m101061g(parcelableCallbackKeyMultimap2, "callbackKeys");
        this.f112962a = set;
        this.f112963b = z;
        this.f112964c = z2;
        this.f112965d = vVar;
        this.f112966e = str;
        this.f112967f = str2;
        this.f112968g = num;
        this.f112969h = str3;
        this.f112970i = z3;
        this.f112971j = z4;
        this.f112972k = z5;
        this.f112973l = z6;
        this.f112974m = z7;
        this.f112975n = z8;
        this.f112976o = i;
        this.f112977p = list;
        this.f112978q = z9;
        this.f112979r = map2;
        this.f112980s = parcelableCallbackKeyMultimap2;
        this.f112981t = map.keySet();
    }

    /* renamed from: a */
    public final WebFeature mo46298a(Class cls) {
        C69664n.m101061g(cls, "featureType");
        WebFeature b = mo46299b(cls);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("Feature with type " + cls + " does not exist.");
    }

    /* renamed from: b */
    public final WebFeature mo46299b(Class cls) {
        Object obj;
        WebFeature webFeature = (WebFeature) this.f112979r.get(cls);
        if (webFeature != null) {
            return webFeature;
        }
        Iterator it = this.f112979r.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cls.isInstance(obj)) {
                break;
            }
        }
        return (WebFeature) obj;
    }

    /* renamed from: c */
    public final boolean mo46300c(Class cls) {
        return this.f112979r.containsKey(cls);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebConfig)) {
            return false;
        }
        WebConfig webConfig = (WebConfig) obj;
        return C69664n.m101066l(this.f112962a, webConfig.f112962a) && this.f112963b == webConfig.f112963b && this.f112964c == webConfig.f112964c && this.f112965d == webConfig.f112965d && C69664n.m101066l(this.f112966e, webConfig.f112966e) && C69664n.m101066l(this.f112967f, webConfig.f112967f) && C69664n.m101066l(this.f112968g, webConfig.f112968g) && C69664n.m101066l(this.f112969h, webConfig.f112969h) && this.f112970i == webConfig.f112970i && this.f112971j == webConfig.f112971j && this.f112972k == webConfig.f112972k && this.f112973l == webConfig.f112973l && this.f112974m == webConfig.f112974m && this.f112975n == webConfig.f112975n && this.f112976o == webConfig.f112976o && C69664n.m101066l(this.f112977p, webConfig.f112977p) && this.f112978q == webConfig.f112978q && C69664n.m101066l(this.f112979r, webConfig.f112979r) && C69664n.m101066l(this.f112980s, webConfig.f112980s);
    }

    public final int hashCode() {
        int hashCode = ((((this.f112962a.hashCode() * 31) + (this.f112963b ? 1 : 0)) * 31) + (this.f112964c ? 1 : 0)) * 31;
        C43271v vVar = this.f112965d;
        int i = 0;
        int hashCode2 = (((((hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31) + this.f112966e.hashCode()) * 31) + this.f112967f.hashCode()) * 31;
        Integer num = this.f112968g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f112969h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((((((((((((((hashCode3 + i) * 31) + (this.f112970i ? 1 : 0)) * 31) + (this.f112971j ? 1 : 0)) * 31) + (this.f112972k ? 1 : 0)) * 31) + (this.f112973l ? 1 : 0)) * 31) + (this.f112974m ? 1 : 0)) * 31) + (this.f112975n ? 1 : 0)) * 31) + this.f112976o) * 31) + this.f112977p.hashCode()) * 31) + (this.f112978q ? 1 : 0)) * 31) + this.f112979r.hashCode()) * 31) + this.f112980s.hashCode();
    }

    public final String toString() {
        Set set = this.f112962a;
        boolean z = this.f112963b;
        boolean z2 = this.f112964c;
        C43271v vVar = this.f112965d;
        String str = this.f112966e;
        String str2 = this.f112967f;
        Integer num = this.f112968g;
        String str3 = this.f112969h;
        boolean z3 = this.f112970i;
        boolean z4 = this.f112971j;
        boolean z5 = this.f112972k;
        boolean z6 = this.f112973l;
        boolean z7 = this.f112974m;
        boolean z8 = this.f112975n;
        int i = this.f112976o;
        List list = this.f112977p;
        boolean z9 = this.f112978q;
        Map map = this.f112979r;
        return "WebConfig(postMessageConfigs=" + set + ", retainsWebContent=" + z + ", handlesHttpErrors=" + z2 + ", webImplementationOverride=" + vVar + ", userAgentSuffix=" + str + ", userAgentPrefix=" + str2 + ", backgroundColor=" + num + ", webLayerPersistenceId=" + str3 + ", usesBackPressDispatcher=" + z3 + ", isWebLayerNetworkRetryEnabled=" + z4 + ", isWebLayerIntentProcessingEnabled=" + z5 + ", handlesWebViewRendererGone=" + z6 + ", allowsReplaceUrlFromWebView=" + z7 + ", supportsMultiPageInfra=" + z8 + ", coordinatorVeId=" + i + ", localWebDirectories=" + list + ", doesNotRestorePendingNavigation=" + z9 + ", features=" + map + ", callbackKeys=" + this.f112980s + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        Set<Parcelable> set = this.f112962a;
        parcel.writeInt(set.size());
        for (Parcelable writeParcelable : set) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.f112963b ? 1 : 0);
        parcel.writeInt(this.f112964c ? 1 : 0);
        C43271v vVar = this.f112965d;
        if (vVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(vVar.name());
        }
        parcel.writeString(this.f112966e);
        parcel.writeString(this.f112967f);
        Integer num = this.f112968g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f112969h);
        parcel.writeInt(this.f112970i ? 1 : 0);
        parcel.writeInt(this.f112971j ? 1 : 0);
        parcel.writeInt(this.f112972k ? 1 : 0);
        parcel.writeInt(this.f112973l ? 1 : 0);
        parcel.writeInt(this.f112974m ? 1 : 0);
        parcel.writeInt(this.f112975n ? 1 : 0);
        parcel.writeInt(this.f112976o);
        List<Parcelable> list = this.f112977p;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable2 : list) {
            parcel.writeParcelable(writeParcelable2, i);
        }
        parcel.writeInt(this.f112978q ? 1 : 0);
        Map map = this.f112979r;
        C69664n.m101061g(map, "<this>");
        C69664n.m101061g(parcel, "parcel");
        parcel.writeInt(map.size());
        for (WebFeature writeParcelable3 : map.values()) {
            parcel.writeParcelable(writeParcelable3, i);
        }
        parcel.writeParcelable(this.f112980s, i);
    }
}
