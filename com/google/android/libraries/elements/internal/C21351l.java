package com.google.android.libraries.elements.internal;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.android.libraries.elements.internal.l */
/* compiled from: PG */
public final class C21351l implements C21296cl {

    /* renamed from: a */
    private final C21259bb f59717a;

    public C21351l(C21259bb bbVar) {
        this.f59717a = bbVar;
    }

    /* renamed from: a */
    public final Typeface mo25819a(Context context, String str) {
        return mo25820b(context, str, 0, false);
    }

    /* renamed from: b */
    public final Typeface mo25820b(Context context, String str, int i, boolean z) {
        if (!str.startsWith("fonts/")) {
            return null;
        }
        try {
            return Typeface.createFromAsset(context.getAssets(), str);
        } catch (RuntimeException e) {
            this.f59717a.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, "Failed to load font ".concat(str), C21319z.f59680u, e);
            return null;
        }
    }
}
