package com.google.android.apps.gsa.shared.p7043j.p7044a;

import android.os.Parcel;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.j.a.a */
/* compiled from: PG */
public abstract class C89786a {
    /* renamed from: a */
    public abstract ClassLoader mo70937a();

    /* renamed from: b */
    public final C58485gu mo83631b(Parcel parcel) {
        ArrayList readArrayList = parcel.readArrayList(mo70937a());
        if (readArrayList == null) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89842j(readArrayList);
    }
}
