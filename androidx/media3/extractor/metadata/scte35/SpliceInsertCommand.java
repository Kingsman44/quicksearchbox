package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new C3616c();

    /* renamed from: a */
    public final long f11516a;

    /* renamed from: b */
    public final boolean f11517b;

    /* renamed from: c */
    public final boolean f11518c;

    /* renamed from: d */
    public final boolean f11519d;

    /* renamed from: e */
    public final boolean f11520e;

    /* renamed from: f */
    public final long f11521f;

    /* renamed from: g */
    public final long f11522g;

    /* renamed from: h */
    public final List f11523h;

    /* renamed from: i */
    public final boolean f11524i;

    /* renamed from: j */
    public final long f11525j;

    /* renamed from: k */
    public final int f11526k;

    /* renamed from: l */
    public final int f11527l;

    /* renamed from: m */
    public final int f11528m;

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f11516a = j;
        this.f11517b = z;
        this.f11518c = z2;
        this.f11519d = z3;
        this.f11520e = z4;
        this.f11521f = j2;
        this.f11522g = j3;
        this.f11523h = Collections.unmodifiableList(list);
        this.f11524i = z5;
        this.f11525j = j4;
        this.f11526k = i;
        this.f11527l = i2;
        this.f11528m = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11516a);
        parcel.writeByte(this.f11517b ? (byte) 1 : 0);
        parcel.writeByte(this.f11518c ? (byte) 1 : 0);
        parcel.writeByte(this.f11519d ? (byte) 1 : 0);
        parcel.writeByte(this.f11520e ? (byte) 1 : 0);
        parcel.writeLong(this.f11521f);
        parcel.writeLong(this.f11522g);
        int size = this.f11523h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C3617d dVar = (C3617d) this.f11523h.get(i2);
            parcel.writeInt(dVar.f11535a);
            parcel.writeLong(dVar.f11536b);
            parcel.writeLong(dVar.f11537c);
        }
        parcel.writeByte(this.f11524i ? (byte) 1 : 0);
        parcel.writeLong(this.f11525j);
        parcel.writeInt(this.f11526k);
        parcel.writeInt(this.f11527l);
        parcel.writeInt(this.f11528m);
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f11516a = parcel.readLong();
        boolean z = false;
        this.f11517b = parcel.readByte() == 1;
        this.f11518c = parcel.readByte() == 1;
        this.f11519d = parcel.readByte() == 1;
        this.f11520e = parcel.readByte() == 1;
        this.f11521f = parcel.readLong();
        this.f11522g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C3617d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f11523h = Collections.unmodifiableList(arrayList);
        this.f11524i = parcel.readByte() == 1 ? true : z;
        this.f11525j = parcel.readLong();
        this.f11526k = parcel.readInt();
        this.f11527l = parcel.readInt();
        this.f11528m = parcel.readInt();
    }
}
