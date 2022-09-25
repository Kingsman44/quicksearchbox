package com.google.android.libraries.phenotype.client.stable;

import android.util.Log;
import com.google.common.base.C58817ah;
import java.io.IOException;

/* renamed from: com.google.android.libraries.phenotype.client.stable.c */
/* compiled from: PG */
public final /* synthetic */ class C31735c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C31735c f85314a = new C31735c();

    private /* synthetic */ C31735c() {
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
    }
}
