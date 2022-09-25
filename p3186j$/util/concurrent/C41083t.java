package p3186j$.util.concurrent;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;

/* renamed from: j$.util.concurrent.t */
public final /* synthetic */ class C41083t implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f107631a;

    /* renamed from: b */
    public final /* synthetic */ Object f107632b;

    /* renamed from: c */
    public final /* synthetic */ Object f107633c;

    public /* synthetic */ C41083t(int i, Object obj, Object obj2) {
        this.f107631a = i;
        this.f107632b = obj;
        this.f107633c = obj2;
    }

    public final void accept(Object obj) {
        ((Consumer) this.f107632b).accept(obj);
        ((Consumer) this.f107633c).accept(obj);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f107631a) {
            case 0:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f107632b).apply(((BiFunction) this.f107633c).apply(obj, obj2));
    }

    public /* synthetic */ C41083t(BiFunction biFunction, Function function) {
        this.f107631a = 2;
        this.f107633c = biFunction;
        this.f107632b = function;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e A[LOOP:0: B:3:0x000e->B:6:0x001c, LOOP_START, PHI: r5 
      PHI: (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v3 java.lang.Object) binds: [B:2:0x000a, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f107631a
            java.lang.Object r1 = r3.f107633c
            java.lang.Object r2 = r3.f107632b
            switch(r0) {
                case 0: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x001f
        L_0x000a:
            java.util.concurrent.ConcurrentMap r2 = (java.util.concurrent.ConcurrentMap) r2
            j$.util.function.BiFunction r1 = (p3186j$.util.function.BiFunction) r1
        L_0x000e:
            java.lang.Object r0 = r1.apply(r4, r5)
            boolean r5 = r2.replace(r4, r5, r0)
            if (r5 != 0) goto L_0x001e
            java.lang.Object r5 = r2.get(r4)
            if (r5 != 0) goto L_0x000e
        L_0x001e:
            return
        L_0x001f:
            j$.util.function.BiConsumer r2 = (p3186j$.util.function.BiConsumer) r2
            j$.util.function.BiConsumer r1 = (p3186j$.util.function.BiConsumer) r1
            r2.accept(r4, r5)
            r1.accept(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41083t.accept(java.lang.Object, java.lang.Object):void");
    }
}
