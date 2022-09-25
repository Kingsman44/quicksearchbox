package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128044m;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4535g.C59203do;
import p3186j$.util.OptionalDouble;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C127965b implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f352218a;

    public /* synthetic */ C127965b(C58490gz gzVar) {
        this.f352218a = gzVar;
    }

    public final void accept(Object obj, Object obj2) {
        OptionalDouble optionalDouble;
        C58490gz gzVar = this.f352218a;
        C128045n nVar = (C128045n) obj;
        C58485gu guVar = (C58485gu) obj2;
        if (guVar.size() < 2) {
            optionalDouble = OptionalDouble.empty();
        } else {
            float[] b = ((C128044m) guVar.get(0)).mo108321b();
            float[] b2 = ((C128044m) guVar.get(guVar.size() - 1)).mo108321b();
            int length = b.length;
            int length2 = b2.length;
            if (length == length2) {
                double d = C59203do.f157270a;
                for (int i = 0; i < b.length; i++) {
                    double abs = (double) Math.abs(b[i] - b2[i]);
                    Double.isNaN(abs);
                    d += abs;
                }
                optionalDouble = OptionalDouble.m71639of(d);
            } else {
                throw new IllegalArgumentException(String.format("Incorrect sensor event dimensions, first.length=%d, last.length=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(length2)}));
            }
        }
        optionalDouble.ifPresent(new C127950a(gzVar, nVar));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
