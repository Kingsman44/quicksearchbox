package com.google.android.apps.gsa.search.shared.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4500cm.p4518d.p4519a.C58179b;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.a */
/* compiled from: PG */
final class C87396a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        C55349pb pbVar = (C55349pb) ActionData.m141429c(parcel, C55349pb.f145830g.getParserForType());
        String readString = parcel.readString();
        TaggerResult taggerResult = (TaggerResult) parcel.readParcelable(TaggerResult.class.getClassLoader());
        C58179b bVar = (C58179b) ActionData.m141429c(parcel, C58179b.f155534j.getParserForType());
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        C55421x a = C55421x.m87686a(parcel.readInt());
        C58838bb.m90866a(a, "actionType");
        int readInt2 = parcel.readInt();
        if (pbVar == null && readString == null && taggerResult == null) {
            return ActionData.f235991b;
        }
        return new ActionData(readLong, false, pbVar, readString, taggerResult, bVar, readInt, readString2, false, a, readInt2, (C52091ex) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActionData[i];
    }
}
