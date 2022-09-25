package com.google.android.gms.contextmanager;

import android.util.Log;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.p10717f.p10720c.C142627a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.contextmanager.j */
/* compiled from: PG */
public final class C144085j {
    /* renamed from: a */
    public static final TimeFilterImpl m234286a(ArrayList arrayList) {
        return new TimeFilterImpl(arrayList, (int[]) null);
    }

    /* renamed from: b */
    public static final void m234287b(long j, ArrayList arrayList) {
        if (j < 0) {
            if (Log.isLoggable("ctxmgr", 5)) {
                Log.w("ctxmgr", C142627a.m231236a("TimeFilter.Builder", "startTimeMillis must be >= 0.  Clamping to 0.", new Object[0]));
            }
            j = 0;
        }
        arrayList.add(new TimeFilterImpl.Interval(j, Long.MAX_VALUE));
    }
}
