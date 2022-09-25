package p3186j$.util.function;

import p3186j$.util.function.Function;

/* renamed from: j$.util.function.j */
public final /* synthetic */ class C41098j implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f107662a;

    /* renamed from: b */
    public final /* synthetic */ Function f107663b;

    /* renamed from: c */
    public final /* synthetic */ Function f107664c;

    public /* synthetic */ C41098j(Function function, Function function2, int i) {
        this.f107662a = i;
        this.f107663b = function;
        this.f107664c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f107662a) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    public final Object apply(Object obj) {
        int i = this.f107662a;
        Function function = this.f107664c;
        Function function2 = this.f107663b;
        switch (i) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f107662a) {
            case 0:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }
}
