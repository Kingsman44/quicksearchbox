package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p4152bb.p4153a.C55018cv;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55419v;
import com.google.protobuf.C62958ce;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.j */
/* compiled from: PG */
final class C87446j implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        Parcel parcel2 = parcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Bitmap bitmap = (Bitmap) parcel2.readParcelable(Bitmap.class.getClassLoader());
        Integer num = (Integer) parcel2.readValue(Integer.class.getClassLoader());
        if (num == null) {
            i = 0;
        } else {
            i = C55419v.m87685a(num.intValue());
        }
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        C55136he heVar = (C55136he) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55136he.f145130j.getParserForType());
        int[] createIntArray = parcel.createIntArray();
        C62958ce ceVar = C55018cv.f144749e;
        ArrayList arrayList = new ArrayList(createIntArray.length);
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < createIntArray.length) {
                int i3 = createIntArray[i2];
                C55018cv a = C55018cv.m87558a(i3);
                if (a != null) {
                    arrayList.add(a);
                    i2++;
                    Parcel parcel3 = parcel;
                } else {
                    throw new NullPointerException(String.format("Unable to convert %d using %s", new Object[]{Integer.valueOf(i3), ceVar.getClass().getName()}));
                }
            } else {
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                if (parcel.readByte() == 0) {
                    z = false;
                }
                return new EntityArgument.Entity(readString, readString2, readString3, bitmap, i, readString4, readString5, readString6, heVar, unmodifiableList, z, parcel.readInt());
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EntityArgument.Entity[i];
    }
}
