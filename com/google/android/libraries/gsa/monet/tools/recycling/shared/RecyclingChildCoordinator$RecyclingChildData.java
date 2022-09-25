package com.google.android.libraries.gsa.monet.tools.recycling.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.shared.ChildData;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1925a.C23276b;
import com.google.protobuf.C62921ba;

/* compiled from: PG */
public class RecyclingChildCoordinator$RecyclingChildData extends ChildData {
    public static final Parcelable.Creator CREATOR = new C23309b();

    /* renamed from: c */
    public final C23129y f63803c;

    /* renamed from: d */
    private final C23276b f63804d;

    protected RecyclingChildCoordinator$RecyclingChildData(Parcel parcel) {
        super(parcel);
        ProtoParcelable protoParcelable = (ProtoParcelable) parcel.readParcelable(getClass().getClassLoader());
        C23276b bVar = protoParcelable != null ? (C23276b) C23245b.m43557b(protoParcelable, C23276b.f63746c.getParserForType(), C62921ba.f169869a, true) : null;
        bVar = bVar == null ? C23276b.f63746c : bVar;
        this.f63804d = bVar;
        this.f63803c = new C23129y(bVar.f63749b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecyclingChildCoordinator$RecyclingChildData)) {
            return false;
        }
        RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData = (RecyclingChildCoordinator$RecyclingChildData) obj;
        return this.f63675b.equals(recyclingChildCoordinator$RecyclingChildData.f63675b) && this.f63803c.equals(recyclingChildCoordinator$RecyclingChildData.f63803c);
    }

    public final int hashCode() {
        return (this.f63675b.hashCode() * 31) + this.f63803c.f63478c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C23276b bVar = this.f63804d;
        if (bVar != null) {
            parcel.writeParcelable(C23245b.m43556a(bVar), i);
        }
    }

    public RecyclingChildCoordinator$RecyclingChildData(String str, C23310c cVar, C23276b bVar) {
        super(str, cVar);
        this.f63804d = bVar;
        this.f63803c = new C23129y(bVar.f63749b);
    }
}
