package com.google.android.gms.flags;

import android.os.IInterface;
import com.google.android.gms.p10793f.C144165j;

/* renamed from: com.google.android.gms.flags.c */
/* compiled from: PG */
public interface C144214c extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(C144165j jVar);
}
