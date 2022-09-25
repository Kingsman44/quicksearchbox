package com.google.android.apps.gsa.search.shared.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
public final class UriRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87503a();

    /* renamed from: a */
    public final Uri f236331a;

    /* renamed from: b */
    public final C58495hd f236332b;

    /* renamed from: c */
    public final C58495hd f236333c;

    /* renamed from: d */
    public final byte[] f236334d;

    /* renamed from: e */
    private C58495hd f236335e = null;

    /* renamed from: b */
    static Map m142036b(Parcel parcel) {
        return parcel.readHashMap(UriRequest.class.getClassLoader());
    }

    /* renamed from: a */
    public final C58495hd mo81502a() {
        if (this.f236335e == null) {
            C58490gz gzVar = new C58490gz(4);
            gzVar.mo55433l(this.f236332b);
            C58800sl lA = this.f236333c.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                gzVar.mo55429h((String) entry.getKey(), Base64.encodeToString((byte[]) entry.getValue(), 11));
            }
            this.f236335e = gzVar.mo55427f(false);
        }
        return this.f236335e;
    }

    /* renamed from: c */
    public final boolean mo81503c() {
        return this.f236334d != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UriRequest) {
            UriRequest uriRequest = (UriRequest) obj;
            if (C58832aw.m90831a(this.f236331a, uriRequest.f236331a) && C58832aw.m90831a(this.f236332b, uriRequest.f236332b) && C58832aw.m90831a(this.f236333c.keySet(), uriRequest.f236333c.keySet()) && Arrays.equals(this.f236334d, uriRequest.f236334d)) {
                C58800sl lA = this.f236333c.entrySet().iterator();
                while (lA.hasNext()) {
                    Map.Entry entry = (Map.Entry) lA.next();
                    if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) uriRequest.f236333c.get(entry.getKey()))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C58800sl lA = this.f236333c.entrySet().iterator();
        int i = 1;
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            i += (i * 31) + ((String) entry.getKey()).hashCode() + Arrays.hashCode((byte[]) entry.getValue());
        }
        return i + (Arrays.hashCode(new Object[]{this.f236331a, this.f236332b, Integer.valueOf(Arrays.hashCode(this.f236334d))}) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f236331a.toString());
        sb.append(" Headers[");
        C58800sl lA = mo81502a().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append((String) entry.getValue());
            sb.append("; ");
        }
        sb.append("] PostContent: ");
        sb.append(Arrays.toString(this.f236334d));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236331a, i);
        parcel.writeMap(this.f236332b);
        parcel.writeMap(this.f236333c);
        if (mo81503c()) {
            byte[] bArr = this.f236334d;
            bArr.getClass();
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f236334d);
            return;
        }
        parcel.writeInt(0);
    }

    public UriRequest(Uri uri, Map map, Map map2, byte[] bArr) {
        uri.getClass();
        this.f236331a = uri;
        if (map == null) {
            this.f236332b = C58729pv.f156485a;
        } else {
            this.f236332b = C58495hd.m89898l(map);
        }
        this.f236333c = map2 == null ? C58729pv.f156485a : C58495hd.m89898l(map2);
        this.f236334d = bArr;
    }
}
