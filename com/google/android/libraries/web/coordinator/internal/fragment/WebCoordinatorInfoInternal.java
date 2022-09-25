package com.google.android.libraries.web.coordinator.internal.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.base.WebConfig;
import com.google.android.libraries.web.base.WebFragmentId;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.common.p4522b.C58528ij;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class WebCoordinatorInfoInternal implements Parcelable, C43269t {
    public static final Parcelable.Creator CREATOR = new C43745d();

    /* renamed from: a */
    public final WebConfig f114084a;

    /* renamed from: b */
    public final boolean f114085b;

    /* renamed from: c */
    public final Set f114086c;

    /* renamed from: d */
    public final Map f114087d;

    /* renamed from: e */
    private final long f114088e;

    /* renamed from: f */
    private final Profile f114089f;

    /* renamed from: g */
    private final C43271v f114090g;

    /* renamed from: h */
    private final C69613f f114091h = new C69747m(new C43746e(this));

    public WebCoordinatorInfoInternal(long j, WebConfig webConfig, Profile profile, boolean z) {
        boolean z2;
        C69664n.m101061g(webConfig, "config");
        C69664n.m101061g(profile, "profile");
        this.f114088e = j;
        this.f114084a = webConfig;
        this.f114089f = profile;
        this.f114085b = z;
        this.f114090g = profile.f114484b;
        WebFragmentId.m76222b(C44082a.f114755a, j);
        Map map = webConfig.f112979r;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Profile profile2 = this.f114089f;
            WebFeatureConfig a = ((WebFeature) entry.getValue()).mo41576a();
            if (!a.f114757a || !profile2.f114485c) {
                C43271v vVar = profile2.f114484b;
                C69664n.m101061g(vVar, "webImplementation");
                if (vVar == C43271v.WEB_VIEW) {
                    z2 = a.f114759c;
                } else {
                    z2 = a.f114760d;
                }
                if (!z2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        this.f114087d = linkedHashMap;
        this.f114086c = linkedHashMap.keySet();
    }

    /* renamed from: a */
    public final long mo46383a() {
        return this.f114088e;
    }

    /* renamed from: b */
    public final WebConfig mo46384b() {
        return this.f114084a;
    }

    /* renamed from: c */
    public final C43271v mo46385c() {
        return this.f114090g;
    }

    /* renamed from: d */
    public final Profile mo46386d() {
        return this.f114089f;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Set mo46387e(Class cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C58528ij a = this.f114084a.f112980s.mo47067a(cls);
        C69664n.m101060f(a, "callbackKeys.getKeys(callbackClass)");
        linkedHashSet.addAll(a);
        for (Map.Entry value : this.f114087d.entrySet()) {
            linkedHashSet.addAll(((WebFeature) value.getValue()).mo41576a().mo47049a(cls));
        }
        return C69540x.m100846ab(linkedHashSet);
    }

    /* renamed from: f */
    public final Set mo46388f() {
        return (Set) this.f114091h.mo5768a();
    }

    /* renamed from: g */
    public final boolean mo46389g() {
        return this.f114085b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeLong(this.f114088e);
        parcel.writeParcelable(this.f114084a, i);
        parcel.writeParcelable(this.f114089f, i);
        parcel.writeInt(this.f114085b ? 1 : 0);
    }
}
