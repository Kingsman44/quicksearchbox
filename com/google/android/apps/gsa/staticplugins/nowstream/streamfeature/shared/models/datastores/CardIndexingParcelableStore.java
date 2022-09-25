package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public class CardIndexingParcelableStore implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C105762a();

    /* renamed from: a */
    public static final C59071e f295119a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.CardIndexingParcelableStore");

    /* renamed from: b */
    public final Map f295120b;

    /* renamed from: c */
    public final List f295121c;

    /* renamed from: d */
    public int f295122d;

    public CardIndexingParcelableStore() {
        this.f295120b = new ConcurrentHashMap();
        this.f295121c = new CopyOnWriteArrayList();
        this.f295122d = 0;
    }

    /* renamed from: a */
    public final int mo95032a() {
        return this.f295121c.size();
    }

    /* renamed from: b */
    public final C105765d mo95033b(long j) {
        return (C105765d) this.f295120b.get(Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo95034c(long j, C105765d dVar) {
        this.f295120b.put(Long.valueOf(j), dVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f295122d);
        parcel.writeInt(this.f295120b.size());
        for (Map.Entry entry : this.f295120b.entrySet()) {
            parcel.writeLong(((Long) entry.getKey()).longValue());
            ProtoLiteParcelable.m147140k((MessageLite) entry.getValue(), parcel);
        }
        parcel.writeInt(this.f295121c.size());
        for (Long longValue : this.f295121c) {
            parcel.writeLong(longValue.longValue());
        }
    }

    public CardIndexingParcelableStore(Parcel parcel) {
        this.f295120b = new ConcurrentHashMap();
        this.f295121c = new CopyOnWriteArrayList();
        this.f295122d = 0;
        this.f295122d = parcel.readInt();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            Map map = this.f295120b;
            Long valueOf = Long.valueOf(parcel.readLong());
            C105765d dVar = (C105765d) ProtoLiteParcelable.m147135f(parcel, C105765d.f295126d);
            dVar.getClass();
            map.put(valueOf, dVar);
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f295121c.add(Long.valueOf(parcel.readLong()));
        }
    }
}
