package dagger.p5295b.p5296a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58526ih;
import dagger.p5295b.C68266b;
import dagger.p5295b.C68282c;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: dagger.b.a.ag */
/* compiled from: PG */
final class C68237ag implements C58817ah {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C58526ih ihVar = new C58526ih();
        for (C68282c a : (List) obj) {
            try {
                Collection collection = (Collection) a.mo60292a();
                if (collection == null) {
                    ihVar.mo55373c(C68282c.m98621b(new NullPointerException("Cannot contribute a null collection into a producer set binding when it's injected as Set<Produced<T>>.")));
                } else {
                    for (Object next : collection) {
                        if (next == null) {
                            ihVar.mo55373c(C68282c.m98621b(new NullPointerException("Cannot contribute a null element into a producer set binding when it's injected as Set<Produced<T>>.")));
                        } else {
                            ihVar.mo55373c(new C68266b(next));
                        }
                    }
                }
            } catch (ExecutionException e) {
                ihVar.mo55373c(C68282c.m98621b(e.getCause()));
            }
        }
        return ihVar.mo55486f();
    }
}
