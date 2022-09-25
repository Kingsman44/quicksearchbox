package com.google.android.apps.search.lens;

import android.app.Activity;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.common.p4552o.C60700zp;

/* renamed from: com.google.android.apps.search.lens.l */
/* compiled from: PG */
public final class C139936l {
    /* renamed from: a */
    public static C27232l m227574a(Activity activity) {
        if (activity instanceof C139924b) {
            return ((C139924b) activity).f380368k;
        }
        throw new IllegalStateException("Attempt to inject LensViewConfig in unsupported Activity");
    }

    /* renamed from: b */
    public static C60700zp m227575b(Activity activity) {
        if (activity instanceof C139924b) {
            return ((C139924b) activity).f380370m;
        }
        throw new IllegalStateException("Attempt to inject IntegrationMode in unsupported Activity");
    }
}
