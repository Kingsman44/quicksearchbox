package p5488io.grpc;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.grpc.ep */
/* compiled from: PG */
public final class C70711ep {

    /* renamed from: a */
    public final C70716eu f188452a;

    /* renamed from: b */
    public final Map f188453b;

    public C70711ep(C70716eu euVar, Map map) {
        this.f188452a = euVar;
        this.f188453b = Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: a */
    public final Collection mo62431a() {
        return this.f188453b.values();
    }
}
