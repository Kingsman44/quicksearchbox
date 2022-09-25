package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143377d();

    /* renamed from: a */
    public String f388592a;

    /* renamed from: b */
    String f388593b;

    /* renamed from: c */
    List f388594c;

    /* renamed from: d */
    String f388595d;

    /* renamed from: e */
    Uri f388596e;

    /* renamed from: f */
    String f388597f;

    /* renamed from: g */
    public String f388598g;

    private ApplicationMetadata() {
        this.f388594c = new ArrayList();
    }

    public ApplicationMetadata(String str, String str2, List list, String str3, Uri uri, String str4, String str5) {
        this.f388592a = str;
        this.f388593b = str2;
        this.f388594c = list;
        this.f388595d = str3;
        this.f388596e = uri;
        this.f388597f = str4;
        this.f388598g = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return C143596v.m233278k(this.f388592a, applicationMetadata.f388592a) && C143596v.m233278k(this.f388593b, applicationMetadata.f388593b) && C143596v.m233278k(this.f388594c, applicationMetadata.f388594c) && C143596v.m233278k(this.f388595d, applicationMetadata.f388595d) && C143596v.m233278k(this.f388596e, applicationMetadata.f388596e) && C143596v.m233278k(this.f388597f, applicationMetadata.f388597f) && C143596v.m233278k(this.f388598g, applicationMetadata.f388598g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388592a, this.f388593b, this.f388594c, this.f388595d, this.f388596e, this.f388597f});
    }

    public final String toString() {
        String str = this.f388592a;
        String str2 = this.f388593b;
        List list = this.f388594c;
        int size = list == null ? 0 : list.size();
        String str3 = this.f388595d;
        String valueOf = String.valueOf(this.f388596e);
        String str4 = this.f388597f;
        String str5 = this.f388598g;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + size + ", senderAppIdentifier: " + str3 + ", senderAppLaunchUrl: " + valueOf + ", iconUrl: " + str4 + ", type: " + str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f388592a);
        C143947c.m234106y(parcel, 3, this.f388593b);
        C143947c.m234080C(parcel, 4, (List) null);
        C143947c.m234078A(parcel, 5, Collections.unmodifiableList(this.f388594c));
        C143947c.m234106y(parcel, 6, this.f388595d);
        C143947c.m234105x(parcel, 7, this.f388596e, i);
        C143947c.m234106y(parcel, 8, this.f388597f);
        C143947c.m234106y(parcel, 9, this.f388598g);
        C143947c.m234083b(parcel, a);
    }
}
