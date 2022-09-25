package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new C3619f();

    /* renamed from: a */
    public final List f11529a;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C3621h(parcel));
        }
        this.f11529a = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f11529a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C3621h hVar = (C3621h) this.f11529a.get(i2);
            parcel.writeLong(hVar.f11540a);
            parcel.writeByte(hVar.f11541b ? (byte) 1 : 0);
            parcel.writeByte(hVar.f11542c ? (byte) 1 : 0);
            parcel.writeByte(hVar.f11543d ? (byte) 1 : 0);
            int size2 = hVar.f11545f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C3620g gVar = (C3620g) hVar.f11545f.get(i3);
                parcel.writeInt(gVar.f11538a);
                parcel.writeLong(gVar.f11539b);
            }
            parcel.writeLong(hVar.f11544e);
            parcel.writeByte(hVar.f11546g ? (byte) 1 : 0);
            parcel.writeLong(hVar.f11547h);
            parcel.writeInt(hVar.f11548i);
            parcel.writeInt(hVar.f11549j);
            parcel.writeInt(hVar.f11550k);
        }
    }

    public SpliceScheduleCommand(List list) {
        this.f11529a = Collections.unmodifiableList(list);
    }
}
