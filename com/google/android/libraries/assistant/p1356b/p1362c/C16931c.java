package com.google.android.libraries.assistant.p1356b.p1362c;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.assistant.b.c.c */
/* compiled from: PG */
public final class C16931c {
    /* renamed from: a */
    public static Parcelable m33934a(Bundle bundle, String str, Class cls) {
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable == null || !cls.isInstance(parcelable)) {
            return null;
        }
        return (Parcelable) cls.cast(parcelable);
    }
}
