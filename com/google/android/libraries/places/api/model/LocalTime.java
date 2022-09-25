package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public abstract class LocalTime implements Parcelable, Comparable {
    /* renamed from: a */
    public abstract int mo37480a();

    /* renamed from: b */
    public abstract int mo37481b();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        int i2;
        LocalTime localTime = (LocalTime) obj;
        C58838bb.m90866a(localTime, "compare must not be null.");
        if (this == localTime) {
            return 0;
        }
        if (mo37480a() == localTime.mo37480a()) {
            i2 = mo37481b();
            i = localTime.mo37481b();
        } else {
            i2 = mo37480a();
            i = localTime.mo37480a();
        }
        return i2 - i;
    }
}
