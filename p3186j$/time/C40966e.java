package p3186j$.time;

import p3186j$.time.temporal.C41023n;
import p3186j$.time.temporal.TemporalAccessor;
import p3186j$.util.function.Function;

/* renamed from: j$.time.e */
public final /* synthetic */ class C40966e implements C41023n, Function {

    /* renamed from: a */
    public final /* synthetic */ int f107286a;

    public /* synthetic */ C40966e(int i) {
        this.f107286a = i;
    }

    /* renamed from: a */
    public final Object mo43245a(TemporalAccessor temporalAccessor) {
        switch (this.f107286a) {
            case 0:
                return LocalDate.m71156o(temporalAccessor);
            case 1:
                return LocalTime.from(temporalAccessor);
            default:
                return OffsetDateTime.m71245m(temporalAccessor);
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return obj;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
