package com.google.android.libraries.search.assistant.notification.data;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.g */
/* compiled from: PG */
final class C34886g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional optional;
        Parcel parcel2 = parcel;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Optional a = C34897r.m63754a(parcel);
        Optional ofNullable = Optional.ofNullable(parcel.readString());
        Optional a2 = C34897r.m63754a(parcel);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        String readString3 = parcel.readString();
        Optional a3 = C34894o.m63749a(parcel);
        Optional a4 = C34894o.m63749a(parcel);
        Optional a5 = C34893n.m63747a(parcel);
        ArrayList arrayList = new ArrayList();
        parcel2.readStringList(arrayList);
        C58485gu j = C58485gu.m89842j(arrayList);
        Optional a6 = C34893n.m63747a(parcel);
        Optional ofNullable2 = Optional.ofNullable(parcel.readString());
        Optional ofNullable3 = Optional.ofNullable(parcel.readString());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel2.readByteArray(bArr);
            optional = Optional.ofNullable(bArr);
        } else {
            optional = Optional.empty();
        }
        return new AutoValue_MessageNotification(readString, readString2, a, ofNullable, a2, z, readString3, a3, a4, a5, j, a6, ofNullable2, ofNullable3, optional, Optional.ofNullable(parcel.readString()), C34897r.m63754a(parcel), Optional.ofNullable(parcel.readString()), Optional.ofNullable((Bitmap) parcel2.readParcelable(Bitmap.class.getClassLoader())), C34892m.m63746a(parcel), Optional.ofNullable((MessageNotification.Actions) parcel2.readParcelable(MessageNotification.Actions.class.getClassLoader())), Optional.ofNullable((Icon) parcel2.readParcelable(Icon.class.getClassLoader())));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_MessageNotification[i];
    }
}
