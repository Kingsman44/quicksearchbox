package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.util.Log;
import com.google.android.libraries.social.populous.core.C42255ah;
import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.s */
/* compiled from: PG */
public final class C42125s {

    /* renamed from: a */
    final String f110186a;

    /* renamed from: b */
    final PopulousChannel f110187b;

    /* renamed from: c */
    C42321ct f110188c;

    public C42125s(String str, PopulousChannel populousChannel) {
        C42320cs csVar;
        this.f110186a = str;
        this.f110187b = populousChannel;
        C42255ah ahVar = new C42255ah();
        int i = populousChannel.f110073b;
        if (i == 1) {
            csVar = C42320cs.IN_APP_EMAIL;
        } else if (i != 2) {
            if (Log.isLoggable("DeviceContactLoader", 3)) {
                int i2 = populousChannel.f110073b;
                Log.d("DeviceContactLoader", "Trying to lookup a field of type: " + i2 + " but only email and phone numbers are supported.");
            }
            throw new IllegalArgumentException("ContactMethodType can only be either email or phone.");
        } else {
            csVar = C42320cs.IN_APP_PHONE;
        }
        ahVar.mo45202c(csVar);
        ahVar.mo45201b(populousChannel.f110072a);
        this.f110188c = ahVar.mo45200a();
    }
}
