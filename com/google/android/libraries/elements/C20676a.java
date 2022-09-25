package com.google.android.libraries.elements;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.C21263bf;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.elements.a */
/* compiled from: PG */
public final /* synthetic */ class C20676a {
    /* renamed from: a */
    public static boolean m38860a(Context context, C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return false;
        }
        C21263bf bfVar = C21263bf.DISABLE;
        int ordinal = ((C21263bf) axVar.mo56107c()).ordinal();
        if (ordinal == 1) {
            C21366j.m40408a(context);
            return true;
        } else if (ordinal == 2 || ordinal == 3) {
            return true;
        } else {
            return false;
        }
    }
}
