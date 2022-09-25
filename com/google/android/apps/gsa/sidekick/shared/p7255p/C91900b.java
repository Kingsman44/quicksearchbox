package com.google.android.apps.gsa.sidekick.shared.p7255p;

import android.database.Observable;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.p.b */
/* compiled from: PG */
final class C91900b extends Observable {
    public final boolean equals(Object obj) {
        if (obj instanceof C91900b) {
            return this.mObservers.equals(((C91900b) obj).mObservers);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.mObservers});
    }
}
