package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b;

import android.icu.text.MeasureFormat;
import android.icu.util.ULocale;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.b.d */
/* compiled from: PG */
public final /* synthetic */ class C39917d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C39917d f104941a = new C39917d();

    private /* synthetic */ C39917d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        MeasureFormat.FormatWidth formatWidth;
        C39922i iVar = (C39922i) obj;
        Duration duration = C39924k.f104950a;
        ULocale a = iVar.mo42071a();
        int i = C39921h.f104948d[iVar.mo42072b().ordinal()];
        if (i == 1) {
            formatWidth = MeasureFormat.FormatWidth.NARROW;
        } else if (i == 2) {
            formatWidth = MeasureFormat.FormatWidth.SHORT;
        } else if (i == 3 || i == 4) {
            formatWidth = MeasureFormat.FormatWidth.WIDE;
        } else {
            throw new AssertionError("Exhaustive switch");
        }
        return MeasureFormat.getInstance(a, formatWidth);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
