package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import android.os.Parcel;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.sidekick.shared.util.WrappedExecutedUserAction;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import com.google.android.sidekick.shared.remoteapi.TrainingQuestion;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.remoteapi.d */
/* compiled from: PG */
public abstract class C91906d extends C8849b implements C91907e {
    public C91906d() {
        super("com.google.android.apps.gsa.sidekick.shared.remoteapi.INowService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(LoggingRequest.CREATOR);
                enforceNoDataAvail(parcel);
                mo85977f(createTypedArrayList);
                return true;
            case 2:
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo85974c((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), i3);
                return true;
            case 3:
                enforceNoDataAvail(parcel);
                mo85982k((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), (ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR));
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                TrainingQuestion a = mo85972a((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR));
                parcel2.writeNoException();
                C8850c.m23498g(parcel2, a);
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                mo85984m((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), (ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), (ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR));
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo85983l((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), (ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), (ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR));
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                mo85985n((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR));
                return true;
            case 8:
                mo85976e();
                return true;
            case 9:
                boolean p = mo85987p();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, p);
                return true;
            case 10:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(WrappedExecutedUserAction.CREATOR);
                enforceNoDataAvail(parcel);
                mo85979h(createTypedArrayList2);
                return true;
            case 11:
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo85981j(readInt);
                return true;
            case 12:
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo85980i((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), readInt2, readInt3);
                return true;
            case 13:
                boolean i4 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo85978g((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR), i4);
                return true;
            case 14:
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo85975d(readInt4, readInt5);
                return true;
            case 15:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                String b = mo85973b(readString);
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 16:
                enforceNoDataAvail(parcel);
                mo85986o((ProtoLiteParcelable) C8850c.m23492a(parcel, ProtoLiteParcelable.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
