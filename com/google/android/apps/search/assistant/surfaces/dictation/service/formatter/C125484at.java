package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9483u.C126358a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4523c.C58917a;
import com.google.common.p4523c.C58930e;
import com.google.common.p4523c.C58931f;
import com.google.common.p4523c.C58934i;
import com.google.common.p4523c.C58937l;
import com.google.common.p4575r.C60755l;
import com.google.protos.p4946az.C64364l;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.at */
/* compiled from: PG */
public final /* synthetic */ class C125484at implements Function {

    /* renamed from: a */
    public final /* synthetic */ C64364l f346043a;

    public /* synthetic */ C125484at(C64364l lVar) {
        this.f346043a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C126358a aVar = (C126358a) obj;
        String str = this.f346043a.f173970b;
        C58937l lVar = aVar.f348050a;
        int i = aVar.f348052c;
        C60755l b = lVar.f156780a.mo56201b(str);
        C58931f fVar = lVar.f156781b;
        int i2 = 0;
        C58838bb.m90871f(i >= 0, "Invalid limit: ", i);
        int min = Math.min(i, 2147483646) + 1;
        int i3 = -1;
        while (true) {
            C58485gu guVar = ((C58917a) fVar).f156757a;
            if (i2 >= ((C58724pq) guVar).f156474d) {
                break;
            }
            int a = ((C58934i) guVar.get(i2)).mo56202a(b, min);
            if (a < min) {
                i3 = i2;
            }
            if (a < min) {
                min = a;
            }
            if (a == 0) {
                break;
            }
            i2++;
        }
        C58930e eVar = new C58930e(i3, min);
        int i4 = eVar.f156774a;
        Object obj2 = i4 >= 0 ? lVar.f156782c.get(i4) : null;
        int i5 = eVar.f156775b;
        CharSequence charSequence = (CharSequence) obj2;
        if (charSequence != null) {
            float length = ((float) i5) / ((float) str.length());
            if (i5 <= aVar.f348052c && ((double) length) <= aVar.f348051b) {
                return Optional.m71637of(charSequence.toString());
            }
        }
        return Optional.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
