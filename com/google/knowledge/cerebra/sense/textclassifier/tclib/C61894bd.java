package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.Bundle;
import java.util.Locale;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bd */
/* compiled from: PG */
public final class C61894bd {

    /* renamed from: a */
    public final Bundle f167363a;

    /* renamed from: b */
    private final String f167364b = "entity";

    /* renamed from: c */
    private final float f167365c;

    public C61894bd(Float f, Bundle bundle) {
        this.f167365c = f.floatValue();
        this.f167363a = bundle;
    }

    public final String toString() {
        return String.format(Locale.US, "Entity {type=%s, score=%s, start=%s, end=%s, extras=%s}", new Object[]{this.f167364b, Float.valueOf(this.f167365c), 0, 0, this.f167363a});
    }
}
