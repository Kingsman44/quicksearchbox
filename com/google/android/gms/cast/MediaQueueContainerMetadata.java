package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.p4535g.C59203do;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143364av();

    /* renamed from: a */
    public int f388675a;

    /* renamed from: b */
    public String f388676b;

    /* renamed from: c */
    public List f388677c;

    /* renamed from: d */
    public List f388678d;

    /* renamed from: e */
    public double f388679e;

    public MediaQueueContainerMetadata() {
        mo118422a();
    }

    public MediaQueueContainerMetadata(int i, String str, List list, List list2, double d) {
        this.f388675a = i;
        this.f388676b = str;
        this.f388677c = list;
        this.f388678d = list2;
        this.f388679e = d;
    }

    public MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
        this.f388675a = mediaQueueContainerMetadata.f388675a;
        this.f388676b = mediaQueueContainerMetadata.f388676b;
        this.f388677c = mediaQueueContainerMetadata.f388677c;
        this.f388678d = mediaQueueContainerMetadata.f388678d;
        this.f388679e = mediaQueueContainerMetadata.f388679e;
    }

    /* renamed from: a */
    public final void mo118422a() {
        this.f388675a = 0;
        this.f388676b = null;
        this.f388677c = null;
        this.f388678d = null;
        this.f388679e = C59203do.f157270a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.f388675a == mediaQueueContainerMetadata.f388675a && TextUtils.equals(this.f388676b, mediaQueueContainerMetadata.f388676b) && C143912ba.m233950b(this.f388677c, mediaQueueContainerMetadata.f388677c) && C143912ba.m233950b(this.f388678d, mediaQueueContainerMetadata.f388678d) && this.f388679e == mediaQueueContainerMetadata.f388679e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f388675a), this.f388676b, this.f388677c, this.f388678d, Double.valueOf(this.f388679e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f388675a);
        C143947c.m234106y(parcel, 3, this.f388676b);
        List list2 = this.f388677c;
        List list3 = null;
        if (list2 == null) {
            list = null;
        } else {
            list = Collections.unmodifiableList(list2);
        }
        C143947c.m234080C(parcel, 4, list);
        List list4 = this.f388678d;
        if (list4 != null) {
            list3 = Collections.unmodifiableList(list4);
        }
        C143947c.m234080C(parcel, 5, list3);
        C143947c.m234086e(parcel, 6, this.f388679e);
        C143947c.m234083b(parcel, a);
    }
}
