package com.google.android.libraries.logging.p2185ve.synthetic.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.logging.p2185ve.synthetic.C28469m;
import com.google.common.p4552o.aqr;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.remote.ParcelableSyntheticTree */
/* compiled from: PG */
public final class ParcelableSyntheticTree implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C28472b();

    /* renamed from: a */
    private final boolean f77269a;

    /* renamed from: b */
    private final ProtoParsers.ParcelableProto f77270b;

    public ParcelableSyntheticTree(Parcel parcel) {
        this.f77269a = parcel.readInt() != 0;
        this.f77270b = (ProtoParsers.ParcelableProto) parcel.readParcelable(ProtoParsers.ParcelableProto.class.getClassLoader());
    }

    /* renamed from: a */
    public final C28439i mo33924a(C28463g gVar, C62921ba baVar) {
        C28439i iVar;
        C28479i iVar2 = (C28479i) this.f77270b.mo58938a(C28479i.f77281c, baVar);
        ArrayList arrayList = new ArrayList(iVar2.f77283a.size());
        for (int i = 0; i < iVar2.f77283a.size(); i++) {
            C28481u uVar = (C28481u) iVar2.f77283a.get(i);
            int d = iVar2.f77284b.mo58914d(i);
            if (d == -1) {
                C60214n nVar = uVar.f77290c;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                iVar = gVar.mo33917a(C28427h.m53115a(nVar.f162918c)).mo33808a();
            } else {
                C28439i iVar3 = (C28439i) arrayList.get(d);
                C60214n nVar2 = uVar.f77290c;
                if (nVar2 == null) {
                    nVar2 = C60214n.f162914g;
                }
                int i2 = nVar2.f162918c;
                gVar.mo33919c(iVar3);
                iVar = new C28313c(C28427h.m53115a(i2), new C28469m(iVar3), iVar3.f77219e, (C28306ab) null).mo33808a();
            }
            iVar.f77217c.mergeFrom(uVar);
            int b = aqr.m92462b(uVar.f77291d);
            int i3 = 1;
            if (!(b == 0 || b == 1)) {
                i3 = 2;
            }
            iVar.mo33892i(i3);
            arrayList.add(iVar);
        }
        C28439i iVar4 = (C28439i) arrayList.get(0);
        if (this.f77269a) {
            gVar.mo33920d(iVar4);
        }
        return iVar4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77269a ? 1 : 0);
        parcel.writeParcelable(this.f77270b, 0);
    }

    public ParcelableSyntheticTree(C28439i iVar) {
        this.f77269a = iVar.f77220f.mo33829m();
        C28478h hVar = (C28478h) C28479i.f77281c.createBuilder();
        new C28471a(hVar).mo33799b(iVar);
        this.f77270b = new ProtoParsers.InternalDontUse((byte[]) null, (C28479i) hVar.build());
    }
}
