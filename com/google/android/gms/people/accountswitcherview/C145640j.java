package com.google.android.gms.people.accountswitcherview;

import android.util.Log;
import com.google.android.gms.people.internal.C145670g;

/* renamed from: com.google.android.gms.people.accountswitcherview.j */
/* compiled from: PG */
public final class C145640j {
    /* renamed from: a */
    public static boolean m236740a(C145670g gVar) {
        if (gVar == null) {
            return false;
        }
        boolean f = gVar.mo119346f();
        if (!f) {
            Log.w("Utils", "Owner is freezable and isDataValid returned false -- invalid Owner!");
        }
        return f;
    }
}
