package com.google.android.libraries.social.peoplekit.common.p3283e;

import android.util.Log;
import com.google.android.gms.phenotype.C145720ad;

/* renamed from: com.google.android.libraries.social.peoplekit.common.e.c */
/* compiled from: PG */
final class C42133c implements C145720ad {
    /* renamed from: a */
    public final void mo44743a(boolean z) {
        if (!Log.isLoggable("PhenotypeUtil", 3)) {
            return;
        }
        if (z) {
            Log.d("PhenotypeUtil", "Phenotype written to SharedPrefs");
        } else {
            Log.d("PhenotypeUtil", "Phenotype failed to write to SharedPrefs");
        }
    }
}
