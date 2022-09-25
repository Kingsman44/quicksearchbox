package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142810g();

    /* renamed from: a */
    final boolean f387423a;

    /* renamed from: b */
    final long f387424b;

    /* renamed from: c */
    final long f387425c;

    /* renamed from: d */
    final long f387426d;

    /* renamed from: e */
    final Bundle f387427e;

    /* renamed from: f */
    final String f387428f;

    /* renamed from: g */
    final String f387429g;

    CorpusStatus() {
        this(false, 0, 0, 0, (Bundle) null, (String) null, (String) null);
    }

    /* renamed from: a */
    public final Map mo117613a() {
        HashMap hashMap = new HashMap();
        for (String str : this.f387427e.keySet()) {
            int i = this.f387427e.getInt(str, -1);
            if (i != -1) {
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (!C143912ba.m233950b(Boolean.valueOf(this.f387423a), Boolean.valueOf(corpusStatus.f387423a)) || !C143912ba.m233950b(Long.valueOf(this.f387424b), Long.valueOf(corpusStatus.f387424b)) || !C143912ba.m233950b(Long.valueOf(this.f387425c), Long.valueOf(corpusStatus.f387425c)) || !C143912ba.m233950b(Long.valueOf(this.f387426d), Long.valueOf(corpusStatus.f387426d)) || !C143912ba.m233950b(mo117613a(), corpusStatus.mo117613a()) || !C143912ba.m233950b(this.f387429g, corpusStatus.f387429g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f387423a), Long.valueOf(this.f387424b), Long.valueOf(this.f387425c), Long.valueOf(this.f387426d), mo117613a(), this.f387429g});
    }

    public final String toString() {
        boolean z = this.f387423a;
        String str = this.f387429g;
        long j = this.f387424b;
        long j2 = this.f387425c;
        long j3 = this.f387426d;
        String obj = this.f387427e.toString();
        return "CorpusStatus{found=" + z + ", contentIncarnation=" + str + ", lastIndexedSeqno=" + j + ", lastCommittedSeqno=" + j2 + ", committedNumDocuments=" + j3 + ", counters=" + obj + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f387423a);
        C143947c.m234090i(parcel, 2, this.f387424b);
        C143947c.m234090i(parcel, 3, this.f387425c);
        C143947c.m234090i(parcel, 4, this.f387426d);
        C143947c.m234093l(parcel, 5, this.f387427e);
        C143947c.m234106y(parcel, 6, this.f387428f);
        C143947c.m234106y(parcel, 7, this.f387429g);
        C143947c.m234083b(parcel, a);
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.f387423a = z;
        this.f387424b = j;
        this.f387425c = j2;
        this.f387426d = j3;
        this.f387427e = bundle == null ? new Bundle() : bundle;
        this.f387428f = str;
        this.f387429g = str2;
    }
}
