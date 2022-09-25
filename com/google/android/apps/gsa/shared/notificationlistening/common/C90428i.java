package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.app.Notification;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.i */
/* compiled from: PG */
final class C90428i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C90429j jVar = new C90429j(new C21375e());
        C90421b.m147093d(parcel, jVar);
        jVar.f252620q = parcel.readString();
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        jVar.f252621r = arrayList;
        jVar.f252622s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        jVar.f252626w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        jVar.f252615D = ((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel)).toString();
        jVar.f252623t = parcel.readString();
        jVar.f252624u = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        jVar.f252625v = parcel.readString();
        jVar.f252613B = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        jVar.f252614C = (Notification) parcel.readParcelable(Notification.class.getClassLoader());
        boolean z = true;
        jVar.f252628y = parcel.readByte() != 0;
        jVar.f252612A = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        jVar.f252616E = z;
        jVar.f252617F = parcel.readString();
        jVar.f252618G = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            jVar.f252619H = bArr;
        }
        return new MessageNotification(jVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageNotification[i];
    }
}
