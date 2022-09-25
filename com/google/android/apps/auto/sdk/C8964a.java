package com.google.android.apps.auto.sdk;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.auto.sdk.a */
/* compiled from: PG */
public final class C8964a {

    /* renamed from: a */
    public final List f31056a;

    public C8964a(C8975g gVar) {
        List list;
        if (gVar == null) {
            try {
                list = Collections.emptyList();
            } catch (RemoteException e) {
                throw new IllegalStateException("Error querying capabilities", e);
            }
        } else {
            Parcel gT = gVar.mo17261gT(1, gVar.mo17260gA());
            ArrayList<String> createStringArrayList = gT.createStringArrayList();
            gT.recycle();
            list = createStringArrayList;
        }
        this.f31056a = list;
    }
}
