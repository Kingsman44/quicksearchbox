package com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a;

import android.content.Context;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import androidx.slice.p194a.C4094a;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.a.m */
/* compiled from: PG */
public final class C32967m {
    /* renamed from: a */
    public static int m61033a(Slice slice, Context context) {
        if (slice == null) {
            return -1;
        }
        return new C4110i(context, slice).mo8613b();
    }

    /* renamed from: b */
    public static Optional m61034b(Slice slice, Context context) {
        Optional c = m61035c(slice, context);
        if (c.isPresent()) {
            return Optional.m71637of(true != ((Boolean) c.get()).booleanValue() ? "0" : "1");
        }
        int a = m61033a(slice, context);
        return a == -1 ? Optional.empty() : Optional.m71637of(String.valueOf(a));
    }

    /* renamed from: c */
    public static Optional m61035c(Slice slice, Context context) {
        List h = new C4110i(context, slice).mo8619h();
        if (h.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(Boolean.valueOf(((C4094a) h.get(0)).f13111f));
    }
}
