package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bf */
/* compiled from: PG */
public final class C61896bf {
    /* renamed from: a */
    public static Intent m94555a(Bundle bundle) {
        Intent intent = (Intent) bundle.getParcelable("action-intent");
        if (intent != null) {
            return new Intent(intent);
        }
        return null;
    }
}
