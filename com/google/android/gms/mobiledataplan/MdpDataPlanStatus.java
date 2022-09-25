package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class MdpDataPlanStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145541p();

    /* renamed from: t */
    private static final Map f393448t;

    /* renamed from: u */
    private static final Map f393449u = new HashMap();

    /* renamed from: a */
    public String f393450a;

    /* renamed from: b */
    public String f393451b;

    /* renamed from: c */
    public String f393452c;

    /* renamed from: d */
    public long f393453d;

    /* renamed from: e */
    public long f393454e;

    /* renamed from: f */
    public MdpFlexTimeWindow[] f393455f;

    /* renamed from: g */
    public int f393456g;

    /* renamed from: h */
    public String f393457h;

    /* renamed from: i */
    public String f393458i;

    /* renamed from: j */
    public String f393459j;

    /* renamed from: k */
    public String f393460k;

    /* renamed from: l */
    public int f393461l;

    /* renamed from: m */
    public List f393462m;

    /* renamed from: n */
    public long f393463n;

    /* renamed from: o */
    public long f393464o;

    /* renamed from: p */
    public long f393465p;

    /* renamed from: q */
    public String f393466q;

    /* renamed from: r */
    public String f393467r;

    /* renamed from: s */
    public boolean f393468s = true;

    static {
        HashMap hashMap = new HashMap();
        f393448t = hashMap;
        hashMap.put(0, "UNSPECIFIED");
        hashMap.put(1, "THROTTLED");
        hashMap.put(2, "BLOCKED");
        hashMap.put(3, "PAY_AS_YOU_GO");
        for (Map.Entry entry : hashMap.entrySet()) {
            f393449u.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }

    private MdpDataPlanStatus() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpDataPlanStatus mdpDataPlanStatus = (MdpDataPlanStatus) obj;
            return C143912ba.m233950b(this.f393450a, mdpDataPlanStatus.f393450a) && C143912ba.m233950b(this.f393451b, mdpDataPlanStatus.f393451b) && C143912ba.m233950b(this.f393452c, mdpDataPlanStatus.f393452c) && C143912ba.m233950b(Long.valueOf(this.f393453d), Long.valueOf(mdpDataPlanStatus.f393453d)) && C143912ba.m233950b(Long.valueOf(this.f393454e), Long.valueOf(mdpDataPlanStatus.f393454e)) && Arrays.equals(this.f393455f, mdpDataPlanStatus.f393455f) && C143912ba.m233950b(Integer.valueOf(this.f393456g), Integer.valueOf(mdpDataPlanStatus.f393456g)) && C143912ba.m233950b(Long.valueOf(this.f393463n), Long.valueOf(mdpDataPlanStatus.f393463n)) && C143912ba.m233950b(Long.valueOf(this.f393464o), Long.valueOf(mdpDataPlanStatus.f393464o)) && C143912ba.m233950b(Long.valueOf(this.f393465p), Long.valueOf(mdpDataPlanStatus.f393465p)) && C143912ba.m233950b(this.f393466q, mdpDataPlanStatus.f393466q) && C143912ba.m233950b(this.f393457h, mdpDataPlanStatus.f393457h) && C143912ba.m233950b(this.f393467r, mdpDataPlanStatus.f393467r) && C143912ba.m233950b(this.f393458i, mdpDataPlanStatus.f393458i) && C143912ba.m233950b(Boolean.valueOf(this.f393468s), Boolean.valueOf(mdpDataPlanStatus.f393468s)) && C143912ba.m233950b(this.f393459j, mdpDataPlanStatus.f393459j) && C143912ba.m233950b(this.f393460k, mdpDataPlanStatus.f393460k) && C143912ba.m233950b(Integer.valueOf(this.f393461l), Integer.valueOf(mdpDataPlanStatus.f393461l)) && C143912ba.m233950b(this.f393462m, mdpDataPlanStatus.f393462m);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f393450a, this.f393451b, this.f393452c, Long.valueOf(this.f393453d), Long.valueOf(this.f393454e), this.f393457h, this.f393458i, this.f393459j, this.f393460k, Integer.valueOf(this.f393461l), this.f393462m})), Integer.valueOf(Arrays.hashCode(this.f393455f))})), Integer.valueOf(this.f393456g), Long.valueOf(this.f393463n), Long.valueOf(this.f393464o), Long.valueOf(this.f393465p), this.f393466q, this.f393467r, Boolean.valueOf(this.f393468s)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("PlanName", this.f393450a, arrayList);
        C143910az.m233947b("ExpirationTime", this.f393451b, arrayList);
        C143910az.m233947b("TrafficCategory", this.f393452c, arrayList);
        C143910az.m233947b("QuotaBytes", Long.valueOf(this.f393453d), arrayList);
        C143910az.m233947b("QuotaMinutes", Long.valueOf(this.f393454e), arrayList);
        C143910az.m233947b("FlexTimeWindows", Arrays.toString(this.f393455f), arrayList);
        int i = this.f393456g;
        String str = (String) f393448t.get(Integer.valueOf(i));
        if (str != null) {
            C143910az.m233947b("OverUsagePolicy", str, arrayList);
            C143910az.m233947b("RemainingBytes", Long.valueOf(this.f393464o), arrayList);
            C143910az.m233947b("RemainingMinutes", Long.valueOf(this.f393465p), arrayList);
            C143910az.m233947b("ShortDescription", this.f393459j, arrayList);
            C143910az.m233947b("DisplayRefreshPeriod", this.f393460k, arrayList);
            C143910az.m233947b("PlanType", Integer.valueOf(this.f393461l), arrayList);
            C143910az.m233947b("Pmtcs", this.f393462m, arrayList);
            C143910az.m233947b("SnapshotTime", Long.valueOf(this.f393463n), arrayList);
            C143910az.m233947b("Description", this.f393466q, arrayList);
            C143910az.m233947b("PlanId", this.f393457h, arrayList);
            C143910az.m233947b("Balance", this.f393467r, arrayList);
            C143910az.m233947b("ModuleName", this.f393458i, arrayList);
            C143910az.m233947b("IsActive", Boolean.valueOf(this.f393468s), arrayList);
            return C143910az.m233946a(arrayList, this);
        }
        throw new IllegalArgumentException("Illegal overusage policy string: " + i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393450a);
        C143947c.m234106y(parcel, 2, this.f393451b);
        C143947c.m234106y(parcel, 3, this.f393452c);
        C143947c.m234090i(parcel, 4, this.f393453d);
        C143947c.m234090i(parcel, 5, this.f393454e);
        C143947c.m234079B(parcel, 6, this.f393455f, i);
        C143947c.m234089h(parcel, 7, this.f393456g);
        C143947c.m234106y(parcel, 8, this.f393457h);
        C143947c.m234106y(parcel, 9, this.f393458i);
        C143947c.m234106y(parcel, 10, this.f393459j);
        C143947c.m234106y(parcel, 11, this.f393460k);
        C143947c.m234089h(parcel, 12, this.f393461l);
        C143947c.m234100s(parcel, 13, this.f393462m);
        C143947c.m234090i(parcel, 20, this.f393463n);
        C143947c.m234090i(parcel, 21, this.f393464o);
        C143947c.m234090i(parcel, 22, this.f393465p);
        C143947c.m234106y(parcel, 23, this.f393466q);
        C143947c.m234106y(parcel, 24, this.f393467r);
        C143947c.m234084c(parcel, 25, this.f393468s);
        C143947c.m234083b(parcel, a);
    }

    public MdpDataPlanStatus(String str, String str2, String str3, long j, long j2, MdpFlexTimeWindow[] mdpFlexTimeWindowArr, int i, String str4, String str5, String str6, String str7, int i2, List list, long j3, long j4, long j5, String str8, String str9, boolean z) {
        int i3 = i;
        this.f393450a = str;
        this.f393457h = str4;
        this.f393458i = str5;
        this.f393451b = str2;
        this.f393452c = str3;
        this.f393453d = j;
        this.f393454e = j2;
        this.f393455f = mdpFlexTimeWindowArr;
        if (f393448t.keySet().contains(Integer.valueOf(i))) {
            this.f393456g = i3;
            this.f393463n = j3;
            this.f393464o = j4;
            this.f393465p = j5;
            this.f393466q = str8;
            this.f393467r = str9;
            this.f393459j = str6;
            this.f393468s = z;
            this.f393460k = str7;
            this.f393461l = i2;
            this.f393462m = list;
            return;
        }
        throw new IllegalArgumentException("Illegal overusage policy: " + i);
    }
}
