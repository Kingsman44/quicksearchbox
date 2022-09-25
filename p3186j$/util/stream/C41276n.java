package p3186j$.util.stream;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import p3186j$.util.List;

/* renamed from: j$.util.stream.n */
final class C41276n extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C41280o f107982a;

    C41276n(C41280o oVar) {
        this.f107982a = oVar;
    }

    public final Iterator iterator() {
        Boolean bool = Boolean.FALSE;
        C41280o oVar = this.f107982a;
        return List.CC.m71631b(new AbstractMap.SimpleImmutableEntry(bool, oVar.f107988b), new AbstractMap.SimpleImmutableEntry(Boolean.TRUE, oVar.f107987a)).iterator();
    }

    public final int size() {
        return 2;
    }
}
