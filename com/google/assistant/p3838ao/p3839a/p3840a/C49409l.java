package com.google.assistant.p3838ao.p3839a.p3840a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49597d;
import com.google.assistant.p3838ao.p3839a.p3849i.C49670a;
import com.google.common.p4522b.C58485gu;
import java.util.regex.Pattern;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C49409l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49597d f127665a;

    public /* synthetic */ C49409l(C49597d dVar) {
        this.f127665a = dVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C58485gu b = C49670a.f128206e.mo55277g(this.f127665a);
        int size = b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            int i2 = i + 1;
            if (((Pattern) b.get(i)).matcher(str).matches()) {
                z = true;
                break;
            }
            i = i2;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
