package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ai */
/* compiled from: PG */
public final class C115621ai {

    /* renamed from: a */
    static final int[] f320745a = {R.color.quantum_lightblue900, R.color.quantum_lightgreen800, R.color.quantum_purple700, R.color.quantum_orange800, R.color.omp_quantum_red900, R.color.quantum_pink600, R.color.quantum_brown600, R.color.quantum_cyan800, R.color.quantum_pink800, R.color.quantum_bluegrey600};

    /* renamed from: a */
    public static int m191764a(Resources resources, String str) {
        return resources.getColor(f320745a[Math.abs(str.hashCode()) % 10]);
    }
}
