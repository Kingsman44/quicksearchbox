package p3186j$.util.stream;

import java.util.Set;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.i */
public final /* synthetic */ class C41256i implements Supplier, Function {

    /* renamed from: a */
    public final /* synthetic */ Collector f107917a;

    public /* synthetic */ C41256i(Collector collector) {
        this.f107917a = collector;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C41280o oVar = (C41280o) obj;
        Set set = Collectors.f107719a;
        Collector collector = this.f107917a;
        return new C41280o(collector.finisher().apply(oVar.f107987a), collector.finisher().apply(oVar.f107988b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object get() {
        Set set = Collectors.f107719a;
        Collector collector = this.f107917a;
        return new C41280o(collector.supplier().get(), collector.supplier().get());
    }
}
