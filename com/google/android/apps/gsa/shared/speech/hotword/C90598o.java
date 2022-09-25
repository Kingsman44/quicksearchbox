package com.google.android.apps.gsa.shared.speech.hotword;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5224k.p5225a.C67229g;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.o */
/* compiled from: PG */
final class C90598o implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C90599p F = HotwordResult.m147742F();
        F.mo84733v(parcel.readInt());
        F.mo84718g((C66626cx) C58833ax.m90833j(C66626cx.m97268a(parcel.readInt())).mo56109e(C66626cx.PHONE));
        boolean z = true;
        F.mo84735x(parcel.readByte() != 0);
        F.mo84736y(parcel.readByte() != 0);
        F.mo84731t(parcel.readFloat());
        C90578a aVar = (C90578a) F;
        aVar.f253211a = parcel.readString();
        F.mo84734w(parcel.readFloat());
        F.mo84722k(parcel.readFloat());
        F.mo84715d(parcel.readFloat());
        aVar.f253212b = C58833ax.m90833j(parcel.createByteArray());
        F.mo84717f(parcel.readInt());
        aVar.f253213c = C58833ax.m90833j(parcel.createBooleanArray());
        F.mo84728q(parcel.readInt());
        F.mo84727p(parcel.readInt());
        F.mo84713b((C67229g) C58833ax.m90833j(C67229g.m97439a(parcel.readInt())).mo56109e(C67229g.UNKNOWN));
        F.mo84719h(parcel.readByte() != 0);
        F.mo84732u(parcel.readByte() != 0);
        aVar.f253214d = (SpeakerIdModel) parcel.readParcelable(SpeakerIdModel.class.getClassLoader());
        F.mo84726o(parcel.readByte() != 0);
        aVar.f253215e = parcel.readString();
        F.mo84723l(parcel.readInt());
        if (parcel.readByte() == 0) {
            z = false;
        }
        F.mo84730s(z);
        F.mo84725n(parcel.readLong());
        F.mo84720i(parcel.readLong());
        aVar.f253216f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        F.mo84721j(parcel.readInt());
        Integer num = (Integer) parcel.readSerializable();
        if (num != null) {
            F.mo84716e(num.intValue());
        }
        Integer num2 = (Integer) parcel.readSerializable();
        if (num2 != null) {
            F.mo84729r(num2.intValue());
        }
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            try {
                ((C90578a) F).f253217g = C58833ax.m90834k((C37672hs) C62942bv.parseFrom((C62942bv) C37672hs.f100056c, createByteArray, C62921ba.m95368a()));
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) HotwordResult.f253205E.mo56225c()).mo56382g(e)).mo56372aa(11135)).mo56386p("Failed parsing InvocationToken.");
            }
        }
        byte[] createByteArray2 = parcel.createByteArray();
        if (createByteArray2 != null) {
            try {
                ((C90578a) F).f253218h = C58833ax.m90834k(C62942bv.parseFrom((C62942bv) cf.c, createByteArray2, C62921ba.m95368a()));
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) HotwordResult.f253205E.mo56225c()).mo56382g(e2)).mo56372aa(11134)).mo56386p("Failed parsing RohanToken.");
            }
        }
        return F.mo84712a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordResult[i];
    }
}
