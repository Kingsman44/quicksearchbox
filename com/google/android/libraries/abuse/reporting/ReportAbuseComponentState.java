package com.google.android.libraries.abuse.reporting;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.p335a.p336a.C6581c;
import com.google.p335a.p336a.C6582d;
import com.google.p335a.p336a.C6586h;
import com.google.p335a.p336a.C6588j;
import com.google.p335a.p336a.C6591m;
import com.google.p335a.p336a.C6592n;
import com.google.p335a.p336a.C6594p;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
class ReportAbuseComponentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C146719ah();

    /* renamed from: a */
    public C6586h f396186a;

    /* renamed from: b */
    public ArrayList f396187b;

    /* renamed from: c */
    public ArrayList f396188c;

    /* renamed from: d */
    public boolean f396189d;

    /* renamed from: e */
    public ArrayList f396190e;

    /* renamed from: f */
    public C6594p f396191f;

    /* renamed from: g */
    private Map f396192g;

    /* renamed from: h */
    private Set f396193h;

    /* renamed from: i */
    private HashMap f396194i;

    /* renamed from: j */
    private HashMap f396195j;

    /* renamed from: k */
    private boolean f396196k;

    public ReportAbuseComponentState(Parcel parcel) {
        this.f396186a = (C6586h) C62942bv.parseFrom((C62942bv) C6586h.f19580e, parcel.createByteArray());
        this.f396193h = new HashSet(r2);
        for (String add : parcel.createStringArray()) {
            this.f396193h.add(add);
        }
        Bundle readBundle = parcel.readBundle();
        this.f396194i = new HashMap();
        for (String str : readBundle.keySet()) {
            this.f396194i.put(str, (C6582d) C62942bv.parseFrom((C62942bv) C6582d.f19571g, readBundle.getByteArray(str)));
        }
        Bundle readBundle2 = parcel.readBundle();
        this.f396195j = new HashMap();
        for (String str2 : readBundle2.keySet()) {
            this.f396195j.put(str2, (C6588j) C62942bv.parseFrom((C62942bv) C6588j.f19586g, readBundle2.getByteArray(str2)));
        }
        int[] createIntArray = parcel.createIntArray();
        String[] createStringArray = parcel.createStringArray();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < createIntArray.length; i++) {
            hashMap.put(Integer.valueOf(createIntArray[i]), createStringArray[i]);
        }
        this.f396192g = Collections.unmodifiableMap(hashMap);
        ReportAbuseCardConfigParcel[] reportAbuseCardConfigParcelArr = (ReportAbuseCardConfigParcel[]) parcel.createTypedArray(ReportAbuseCardConfigParcel.CREATOR);
        this.f396187b = new ArrayList();
        for (ReportAbuseCardConfigParcel add2 : reportAbuseCardConfigParcelArr) {
            this.f396187b.add(add2);
        }
        int readInt = parcel.readInt();
        this.f396188c = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f396188c.add(m239042f(parcel));
        }
        this.f396189d = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        this.f396196k = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        this.f396190e = m239042f(parcel);
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray.length == 0) {
            this.f396191f = null;
        } else {
            this.f396191f = (C6594p) C62942bv.parseFrom((C62942bv) C6594p.f19600j, createByteArray);
        }
    }

    /* renamed from: f */
    private static final ArrayList m239042f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((C6594p) C62942bv.parseFrom((C62942bv) C6594p.f19600j, parcel.createByteArray()));
        }
        return arrayList;
    }

    /* renamed from: g */
    private static final void m239043g(C62942bv bvVar, Parcel parcel) {
        if (bvVar == null) {
            parcel.writeByteArray(new byte[0]);
        } else {
            parcel.writeByteArray(bvVar.toByteArray());
        }
    }

    /* renamed from: h */
    private static final void m239044h(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m239043g((C62942bv) it.next(), parcel);
        }
    }

    /* renamed from: a */
    public final C6582d mo123525a(String str) {
        return (C6582d) this.f396194i.get(str);
    }

    /* renamed from: b */
    public final C6588j mo123526b(String str) {
        return (C6588j) this.f396195j.get(str);
    }

    /* renamed from: c */
    public final ReportAbuseCardConfigParcel mo123527c() {
        int size = this.f396187b.size() - 1;
        if (size < 0) {
            return null;
        }
        return (ReportAbuseCardConfigParcel) this.f396187b.get(size);
    }

    /* renamed from: d */
    public final String mo123528d(Integer num) {
        return (String) this.f396192g.get(num);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final ArrayList mo123530e() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f396191f.f19605d.iterator();
        while (true) {
            char c = 4;
            if (it.hasNext()) {
                C6582d a = mo123525a((String) it.next());
                Iterator it2 = a.f19576d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!this.f396193h.contains((String) it2.next())) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                }
                switch (a.f19575c) {
                    case 0:
                        c = 1;
                        break;
                    case 1:
                        c = 2;
                        break;
                    case 2:
                        c = 3;
                        break;
                    case 3:
                        break;
                    case 4:
                        c = 5;
                        break;
                    case 5:
                        c = 6;
                        break;
                    case 6:
                        c = 7;
                        break;
                    case 7:
                        c = 8;
                        break;
                    case 8:
                        c = 9;
                        break;
                    case 9:
                        c = 10;
                        break;
                    case 10:
                        c = 11;
                        break;
                    case 11:
                        c = 12;
                        break;
                    case 12:
                        c = 13;
                        break;
                    case 13:
                        c = 14;
                        break;
                    case 14:
                        c = 15;
                        break;
                    case 15:
                        c = 16;
                        break;
                    case 16:
                        c = 17;
                        break;
                    case 17:
                        c = 18;
                        break;
                    case 18:
                        c = 19;
                        break;
                    case 19:
                        c = 20;
                        break;
                    case 20:
                        c = 21;
                        break;
                    case 21:
                        c = 22;
                        break;
                    default:
                        c = 0;
                        break;
                }
                if (z && (a.f19578f || c != 0)) {
                    arrayList.add(a);
                }
            } else {
                if (arrayList.isEmpty()) {
                    C6594p pVar = this.f396191f;
                    if ((pVar.f19602a & 4) != 0 && !pVar.f19606e) {
                        arrayList.add(mo123525a("undo"));
                        arrayList.add(mo123525a("no_action"));
                    }
                }
                return arrayList;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m239043g(this.f396186a, parcel);
        parcel.writeStringArray((String[]) this.f396193h.toArray(new String[0]));
        Bundle bundle = new Bundle();
        for (String str : this.f396194i.keySet()) {
            bundle.putByteArray(str, ((C6582d) this.f396194i.get(str)).toByteArray());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (String str2 : this.f396195j.keySet()) {
            bundle2.putByteArray(str2, ((C6588j) this.f396195j.get(str2)).toByteArray());
        }
        parcel.writeBundle(bundle2);
        int[] iArr = new int[this.f396192g.size()];
        String[] strArr = new String[this.f396192g.size()];
        int i2 = 0;
        for (Integer num : this.f396192g.keySet()) {
            iArr[i2] = num.intValue();
            strArr[i2] = (String) this.f396192g.get(num);
            i2++;
        }
        parcel.writeIntArray(iArr);
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray((ReportAbuseCardConfigParcel[]) this.f396187b.toArray(new ReportAbuseCardConfigParcel[0]), i);
        parcel.writeInt(this.f396188c.size());
        ArrayList arrayList = this.f396188c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            m239044h((ArrayList) arrayList.get(i3), parcel);
        }
        parcel.writeValue(Boolean.valueOf(this.f396189d));
        parcel.writeValue(Boolean.valueOf(this.f396196k));
        m239044h(this.f396190e, parcel);
        m239043g(this.f396191f, parcel);
    }

    public ReportAbuseComponentState(C6586h hVar, Set set) {
        this.f396189d = false;
        this.f396191f = null;
        this.f396188c = new ArrayList();
        this.f396187b = new ArrayList();
        this.f396193h = set;
        this.f396186a = hVar;
        this.f396196k = false;
        this.f396194i = new HashMap();
        this.f396195j = new HashMap();
        this.f396190e = new ArrayList();
        C6586h hVar2 = this.f396186a;
        HashMap hashMap = new HashMap();
        Iterator it = hVar2.f19585d.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            C6592n nVar = (C6592n) it.next();
            int a = C6591m.m17997a(nVar.f19598b);
            if (a != 0) {
                i = a;
            }
            hashMap.put(Integer.valueOf(i - 1), nVar.f19599c);
        }
        this.f396192g = Collections.unmodifiableMap(hashMap);
        for (C6582d dVar : this.f396186a.f19583b) {
            this.f396194i.put(dVar.f19574b, dVar);
        }
        Map map = this.f396192g;
        HashMap hashMap2 = this.f396194i;
        C6581c cVar = (C6581c) C6582d.f19571g.createBuilder();
        cVar.copyOnWrite();
        C6582d dVar2 = (C6582d) cVar.instance;
        dVar2.f19573a |= 2;
        dVar2.f19575c = 2;
        cVar.copyOnWrite();
        C6582d dVar3 = (C6582d) cVar.instance;
        dVar3.f19573a |= 1;
        dVar3.f19574b = "no_action";
        String str = (String) map.get(18);
        cVar.copyOnWrite();
        C6582d dVar4 = (C6582d) cVar.instance;
        str.getClass();
        dVar4.f19573a |= 4;
        dVar4.f19577e = str;
        C6581c cVar2 = (C6581c) C6582d.f19571g.createBuilder();
        cVar2.copyOnWrite();
        C6582d dVar5 = (C6582d) cVar2.instance;
        dVar5.f19573a |= 2;
        dVar5.f19575c = 2;
        cVar2.copyOnWrite();
        C6582d dVar6 = (C6582d) cVar2.instance;
        dVar6.f19573a |= 1;
        dVar6.f19574b = "undo";
        String str2 = (String) map.get(15);
        cVar2.copyOnWrite();
        C6582d dVar7 = (C6582d) cVar2.instance;
        str2.getClass();
        dVar7.f19573a |= 4;
        dVar7.f19577e = str2;
        C6581c cVar3 = (C6581c) C6582d.f19571g.createBuilder();
        cVar3.copyOnWrite();
        C6582d dVar8 = (C6582d) cVar3.instance;
        dVar8.f19573a |= 2;
        dVar8.f19575c = 2;
        cVar3.copyOnWrite();
        C6582d dVar9 = (C6582d) cVar3.instance;
        dVar9.f19573a = 1 | dVar9.f19573a;
        dVar9.f19574b = "finish_reporting";
        String str3 = (String) map.get(16);
        cVar3.copyOnWrite();
        C6582d dVar10 = (C6582d) cVar3.instance;
        str3.getClass();
        dVar10.f19573a |= 4;
        dVar10.f19577e = str3;
        hashMap2.put("no_action", (C6582d) cVar.build());
        hashMap2.put("undo", (C6582d) cVar2.build());
        hashMap2.put("finish_reporting", (C6582d) cVar3.build());
        for (C6588j jVar : this.f396186a.f19584c) {
            this.f396195j.put(jVar.f19589b, jVar);
        }
    }
}
