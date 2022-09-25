package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4526f.C59052c;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.p4152bb.p4153a.C55247lh;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.e */
/* compiled from: PG */
final class C87441e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object obj;
        String str;
        C55213ka kaVar = (C55213ka) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55213ka.f145356g.getParserForType());
        Integer num = (Integer) parcel.readValue(Integer.class.getClassLoader());
        C62940bt r2 = C62942bv.checkIsLite(C55235kw.f145427j);
        kaVar.mo58887l(r2);
        Object l = kaVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        C55235kw kwVar = (C55235kw) obj;
        if (kwVar.f145431c.size() > 0) {
            if (kwVar.f145431c.size() > 1) {
                ((C59052c) ((C59052c) AudioArgument.f236151i.mo56226d()).mo56372aa(9542)).mo56386p("EntityArgument proto of audio argument shouldn't have more than one value.");
            }
            str = ((C55247lh) kwVar.f145431c.get(0)).f145482d;
        } else {
            str = null;
        }
        return new AudioArgument(kaVar, str, num);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AudioArgument[i];
    }
}
