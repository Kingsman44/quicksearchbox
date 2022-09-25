package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.protos.p4850an.p4853b.C63367k;
import com.google.protos.p4850an.p4853b.C63380x;
import com.google.protos.p4850an.p4853b.C63382z;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.j */
/* compiled from: PG */
public final /* synthetic */ class C76598j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76598j f211845a = new C76598j();

    private /* synthetic */ C76598j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        TimeUnit timeUnit;
        C63367k kVar = (C63367k) obj;
        C63380x xVar = kVar.f171255b;
        if (xVar == null) {
            xVar = C63380x.f171276d;
        }
        int a = C63382z.m96232a(xVar.f171280c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        switch (i) {
            case 1:
                timeUnit = TimeUnit.NANOSECONDS;
                break;
            case 2:
                timeUnit = TimeUnit.MICROSECONDS;
                break;
            case 3:
                timeUnit = TimeUnit.MILLISECONDS;
                break;
            case 4:
                timeUnit = TimeUnit.SECONDS;
                break;
            case 5:
                timeUnit = TimeUnit.MINUTES;
                break;
            case 6:
                timeUnit = TimeUnit.HOURS;
                break;
            case 7:
                timeUnit = TimeUnit.DAYS;
                break;
            default:
                throw new IllegalArgumentException("unsupported type ".concat(Integer.toString(i)));
        }
        C63380x xVar2 = kVar.f171255b;
        if (xVar2 == null) {
            xVar2 = C63380x.f171276d;
        }
        return Long.valueOf(timeUnit.toMillis((long) xVar2.f171279b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
