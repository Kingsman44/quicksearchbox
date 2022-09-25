package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.metadata.scte35.h */
/* compiled from: PG */
public final class C3621h {

    /* renamed from: a */
    public final long f11540a;

    /* renamed from: b */
    public final boolean f11541b;

    /* renamed from: c */
    public final boolean f11542c;

    /* renamed from: d */
    public final boolean f11543d;

    /* renamed from: e */
    public final long f11544e;

    /* renamed from: f */
    public final List f11545f;

    /* renamed from: g */
    public final boolean f11546g;

    /* renamed from: h */
    public final long f11547h;

    /* renamed from: i */
    public final int f11548i;

    /* renamed from: j */
    public final int f11549j;

    /* renamed from: k */
    public final int f11550k;

    public C3621h(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.f11540a = j;
        this.f11541b = z;
        this.f11542c = z2;
        this.f11543d = z3;
        this.f11545f = Collections.unmodifiableList(list);
        this.f11544e = j2;
        this.f11546g = z4;
        this.f11547h = j3;
        this.f11548i = i;
        this.f11549j = i2;
        this.f11550k = i3;
    }

    public C3621h(Parcel parcel) {
        this.f11540a = parcel.readLong();
        boolean z = false;
        this.f11541b = parcel.readByte() == 1;
        this.f11542c = parcel.readByte() == 1;
        this.f11543d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C3620g(parcel.readInt(), parcel.readLong()));
        }
        this.f11545f = Collections.unmodifiableList(arrayList);
        this.f11544e = parcel.readLong();
        this.f11546g = parcel.readByte() == 1 ? true : z;
        this.f11547h = parcel.readLong();
        this.f11548i = parcel.readInt();
        this.f11549j = parcel.readInt();
        this.f11550k = parcel.readInt();
    }
}
