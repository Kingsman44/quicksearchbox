package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C7726hr;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;

/* compiled from: PG */
public class EntryTreeNodeParcelableStore implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C105763b();

    /* renamed from: a */
    public final ArrayList f295123a = new ArrayList();

    /* renamed from: b */
    public final LongSparseArray f295124b = new LongSparseArray();

    public EntryTreeNodeParcelableStore() {
    }

    /* renamed from: a */
    public final C7726hr mo95037a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f295123a.size()) {
            z = true;
        }
        C58838bb.m90888w(z, "Index was out of bounds. %s of %s", i, this.f295123a.size());
        C7726hr hrVar = (C7726hr) this.f295124b.get(((Long) this.f295123a.get(i)).longValue());
        hrVar.getClass();
        return hrVar;
    }

    /* renamed from: b */
    public final C7726hr mo95038b(long j) {
        return (C7726hr) this.f295124b.get(j);
    }

    /* renamed from: c */
    public final void mo95039c(C7726hr hrVar) {
        long a = C91994m.m150994a(C91994m.m150996c(hrVar));
        C58838bb.m90884s(!mo95043f(a), "Attempted to add an EntryTreeNode that was already tracked. ".concat(C91994m.m150998e(hrVar)));
        this.f295123a.add(Long.valueOf(a));
        this.f295124b.put(a, hrVar);
    }

    /* renamed from: d */
    public final void mo95040d() {
        this.f295123a.clear();
        this.f295124b.clear();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo95042e(C7726hr hrVar, long j) {
        C58838bb.m90884s(mo95043f(j), "Attempted to update an EntryTreeNode that was not already tracked. ".concat(C91994m.m150998e(hrVar)));
        this.f295124b.put(j, hrVar);
    }

    /* renamed from: f */
    public final boolean mo95043f(long j) {
        return this.f295124b.indexOfKey(j) >= 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = new ArrayList(this.f295123a);
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Long l = (Long) arrayList.get(i2);
            parcel.writeLong(l.longValue());
            ProtoLiteParcelable.m147141l((MessageLite) this.f295124b.get(l.longValue()), parcel);
        }
    }

    public EntryTreeNodeParcelableStore(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            long readLong = parcel.readLong();
            C7726hr hrVar = (C7726hr) ProtoLiteParcelable.m147136g(parcel, C7726hr.f27008i);
            this.f295123a.add(Long.valueOf(readLong));
            LongSparseArray longSparseArray = this.f295124b;
            hrVar.getClass();
            longSparseArray.put(readLong, hrVar);
        }
    }
}
