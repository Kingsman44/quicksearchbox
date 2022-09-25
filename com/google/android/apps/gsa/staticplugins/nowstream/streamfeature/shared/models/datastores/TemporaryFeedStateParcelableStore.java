package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91835c;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91836d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91837e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class TemporaryFeedStateParcelableStore implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C105766e();

    /* renamed from: a */
    public final LongSparseArray f295125a = new LongSparseArray();

    public TemporaryFeedStateParcelableStore() {
    }

    /* renamed from: a */
    public final void mo95045a(long j, String str, C91835c cVar) {
        Map map = (Map) this.f295125a.get(j);
        if (map == null) {
            map = new HashMap();
            this.f295125a.append(j, map);
        }
        map.put(str, cVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f295125a.size());
        for (int i2 = 0; i2 < this.f295125a.size(); i2++) {
            Map map = (Map) this.f295125a.valueAt(i2);
            parcel.writeInt(map.size());
            for (String str : map.keySet()) {
                C91836d dVar = (C91836d) C91837e.f256113e.createBuilder();
                long keyAt = this.f295125a.keyAt(i2);
                dVar.copyOnWrite();
                C91837e eVar = (C91837e) dVar.instance;
                eVar.f256115a |= 1;
                eVar.f256116b = keyAt;
                dVar.copyOnWrite();
                C91837e eVar2 = (C91837e) dVar.instance;
                str.getClass();
                eVar2.f256115a |= 2;
                eVar2.f256117c = str;
                C91835c cVar = (C91835c) map.get(str);
                dVar.copyOnWrite();
                C91837e eVar3 = (C91837e) dVar.instance;
                cVar.getClass();
                eVar3.f256118d = cVar;
                eVar3.f256115a |= 4;
                ProtoLiteParcelable.m147140k(dVar.build(), parcel);
            }
        }
    }

    public TemporaryFeedStateParcelableStore(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                C91837e eVar = (C91837e) ProtoLiteParcelable.m147135f(parcel, C91837e.f256113e);
                if (eVar != null) {
                    long j = eVar.f256116b;
                    String str = eVar.f256117c;
                    C91835c cVar = eVar.f256118d;
                    mo95045a(j, str, cVar == null ? C91835c.f256110a : cVar);
                }
            }
        }
    }
}
