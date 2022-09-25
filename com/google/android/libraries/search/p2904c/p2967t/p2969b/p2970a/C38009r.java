package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;

/* renamed from: com.google.android.libraries.search.c.t.b.a.r */
/* compiled from: PG */
public final class C38009r {
    /* renamed from: a */
    public static final C37512ds m67092a(C37519dz dzVar, C37512ds dsVar) {
        C37519dz dzVar2 = C37519dz.UNKNOWN_OPENING_FAILURE;
        int ordinal = dzVar.ordinal();
        if (ordinal == 5) {
            return C37512ds.FAILED_CLOSING_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING;
        }
        if (ordinal == 38) {
            return C37512ds.FAILED_CLOSING_NO_CONNECTION_TO_AUDIO_ADAPTER_FOUND;
        }
        if (ordinal != 39) {
            return dsVar;
        }
        return C37512ds.FAILED_CLOSING_NO_AUDIO_ADAPTER_FOUND;
    }
}
