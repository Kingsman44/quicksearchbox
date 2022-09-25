package com.google.android.libraries.surveys;

import android.content.Context;
import com.google.android.libraries.surveys.internal.p3321a.C43033a;
import com.google.android.libraries.surveys.internal.p3322b.C43035b;
import com.google.android.libraries.surveys.internal.p3323c.p3324a.C43036a;
import com.google.android.libraries.surveys.internal.p3325d.p3326a.C43044g;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.libraries.surveys.l */
/* compiled from: PG */
public final class C43171l extends C43024a {
    @Deprecated
    /* renamed from: c */
    public static C43171l m76145c(Context context, CronetEngine cronetEngine) {
        C43044g gVar = new C43044g(cronetEngine);
        context.getClass();
        C43035b bVar = C43035b.f112558a;
        if (C43054c.f112610b == null) {
            synchronized (C43054c.f112609a) {
                if (C43054c.f112610b == null) {
                    C43054c.f112610b = context;
                }
            }
        }
        int i = C43066o.f112626a;
        C43033a aVar = C43033a.f112554a;
        aVar.f112556c = gVar;
        aVar.f112555b = new C43036a(context);
        return new C43171l();
    }
}
