package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.ComponentName;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.libraries.storage.p3304a.p3305a.C42731r;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.c */
/* compiled from: PG */
final class C61917c {
    /* renamed from: a */
    public static Pair m94581a(C61880aq aqVar) {
        String str = null;
        if (aqVar.f167330c == null) {
            return null;
        }
        ComponentName component = C61896bf.m94555a(aqVar.f167332e).getComponent();
        if (component != null) {
            str = component.getPackageName();
        }
        return new Pair(aqVar.f167330c.f5557b.toString(), str);
    }

    /* renamed from: b */
    public static String m94582b(ParcelFileDescriptor parcelFileDescriptor) {
        return ((Uri) C42731r.m75493a(parcelFileDescriptor).first).toString();
    }
}
