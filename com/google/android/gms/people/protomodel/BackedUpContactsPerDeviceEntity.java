package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new C145688a();

    /* renamed from: a */
    public final String f393930a;

    /* renamed from: b */
    public final Long f393931b;

    /* renamed from: c */
    public final String f393932c;

    /* renamed from: d */
    public final Long f393933d;

    /* renamed from: e */
    public final Long f393934e;

    /* renamed from: f */
    public final DeviceVersionEntity f393935f;

    /* renamed from: g */
    private final List f393936g;

    /* renamed from: h */
    private List f393937h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.f393930a = str;
        this.f393931b = l;
        this.f393936g = list;
        this.f393932c = str2;
        this.f393933d = l2;
        this.f393934e = l3;
        this.f393935f = deviceVersionEntity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final DeviceVersion mo121733b() {
        return this.f393935f;
    }

    /* renamed from: c */
    public final Long mo121734c() {
        return this.f393931b;
    }

    /* renamed from: d */
    public final Long mo121735d() {
        return this.f393934e;
    }

    /* renamed from: e */
    public final Long mo121736e() {
        return this.f393933d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return C143912ba.m233950b(mo121738h(), backedUpContactsPerDevice.mo121738h()) && C143912ba.m233950b(mo121734c(), backedUpContactsPerDevice.mo121734c()) && C143912ba.m233950b(mo121739i(), backedUpContactsPerDevice.mo121739i()) && C143912ba.m233950b(mo121737g(), backedUpContactsPerDevice.mo121737g()) && C143912ba.m233950b(mo121736e(), backedUpContactsPerDevice.mo121736e()) && C143912ba.m233950b(mo121735d(), backedUpContactsPerDevice.mo121735d()) && C143912ba.m233950b(mo121733b(), backedUpContactsPerDevice.mo121733b());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: g */
    public final String mo121737g() {
        return this.f393932c;
    }

    /* renamed from: h */
    public final String mo121738h() {
        return this.f393930a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121738h(), mo121734c(), mo121739i(), mo121737g(), mo121736e(), mo121735d(), mo121733b()});
    }

    /* renamed from: i */
    public final List mo121739i() {
        List list;
        if (this.f393937h == null && (list = this.f393936g) != null) {
            this.f393937h = new ArrayList(list.size());
            for (SourceStats add : this.f393936g) {
                this.f393937h.add(add);
            }
        }
        return this.f393937h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f393930a);
        C143947c.m234080C(parcel, 3, mo121739i());
        C143947c.m234106y(parcel, 4, this.f393932c);
        C143947c.m234104w(parcel, 5, this.f393933d);
        C143947c.m234104w(parcel, 6, this.f393934e);
        C143947c.m234104w(parcel, 7, this.f393931b);
        C143947c.m234105x(parcel, 8, this.f393935f, i);
        C143947c.m234083b(parcel, a);
    }
}
