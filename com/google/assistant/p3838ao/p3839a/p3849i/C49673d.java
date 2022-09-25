package com.google.assistant.p3838ao.p3839a.p3849i;

import java.util.Comparator;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.i.d */
/* compiled from: PG */
public final /* synthetic */ class C49673d implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Function f128232a;

    public /* synthetic */ C49673d(Function function) {
        this.f128232a = function;
    }

    public final int compare(Object obj, Object obj2) {
        Function function = this.f128232a;
        return ((String) function.apply(obj)).compareTo((String) function.apply(obj2));
    }
}
