package com.google.android.libraries.social.populous.android;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.AutocompleteSession;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.C42586u;
import com.google.android.libraries.social.populous.logging.LogEntity;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.social.populous.android.c */
/* compiled from: PG */
final class C42164c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        ClientConfigInternal clientConfigInternal = (ClientConfigInternal) parcel2.readParcelable(ClientConfigInternal.class.getClassLoader());
        String readString = parcel.readString();
        SessionContext sessionContext = (SessionContext) parcel2.readParcelable(SessionContext.class.getClassLoader());
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        boolean z = true;
        boolean z2 = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        Integer num = (Integer) parcel2.readValue(Integer.class.getClassLoader());
        Long l = (Long) parcel2.readValue(Long.class.getClassLoader());
        Bundle readBundle = parcel2.readBundle(C42586u.class.getClassLoader());
        String str = AndroidLibAutocompleteSession.f110424u;
        C42586u uVar = new C42586u();
        for (String str2 : readBundle.keySet()) {
            uVar.put(str2, (LogEntity) readBundle.getParcelable(str2));
            Parcel parcel3 = parcel;
            readBundle = readBundle;
        }
        uVar.f111755a = num;
        AutocompleteSession f = C42181t.m74106f(clientConfigInternal, readString, sessionContext, (C60870cx) null, uVar);
        AndroidLibAutocompleteSession androidLibAutocompleteSession = (AndroidLibAutocompleteSession) f;
        androidLibAutocompleteSession.f110348i.putAll((HashMap) parcel.readSerializable());
        androidLibAutocompleteSession.f110353n = readLong;
        androidLibAutocompleteSession.f110354o = readLong2;
        androidLibAutocompleteSession.f110355p = readLong3;
        androidLibAutocompleteSession.f110356q = z2;
        androidLibAutocompleteSession.f110357r = z;
        androidLibAutocompleteSession.f110358s = num;
        androidLibAutocompleteSession.f110352m = l;
        return f;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AndroidLibAutocompleteSession[i];
    }
}
