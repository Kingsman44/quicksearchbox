package com.google.assistant.p3838ao.p3839a.p3849i;

import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.i.e */
/* compiled from: PG */
public final class C49674e {

    /* renamed from: a */
    public final Map f128233a = new HashMap();

    /* renamed from: b */
    public final Function f128234b;

    /* renamed from: c */
    private final C58485gu f128235c;

    public C49674e(List list, Function function) {
        this.f128235c = C58485gu.m89836F(new C49673d(function), list);
        this.f128234b = function;
    }

    /* renamed from: a */
    public final Object mo53324a(String str) {
        Object obj = this.f128233a.get(str);
        if (obj != null) {
            return obj;
        }
        Optional findFirst = Collection.EL.stream(this.f128235c).filter(new C49671b(this, str)).findFirst();
        findFirst.ifPresent(new C49672c(this, str));
        return findFirst.orElse(null);
    }
}
