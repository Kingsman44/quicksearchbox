package p3186j$.lang;

import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-EL  reason: invalid class name */
public final /* synthetic */ class Iterable$EL {
    public static /* synthetic */ void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof C40948a) {
            ((C40948a) iterable).forEach(consumer);
        } else if (iterable instanceof Collection) {
            Collection.CC.m71619a((java.util.Collection) iterable, consumer);
        } else {
            Iterable$CC.$default$forEach(iterable, consumer);
        }
    }
}
