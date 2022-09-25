package androidx.media3.p132b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.media3.b.af */
/* compiled from: PG */
public final class C2487af {

    /* renamed from: a */
    private final Map f6833a = new HashMap();

    /* renamed from: b */
    private Map f6834b;

    /* renamed from: a */
    public final synchronized Map mo5922a() {
        if (this.f6834b == null) {
            this.f6834b = Collections.unmodifiableMap(new HashMap(this.f6833a));
        }
        return this.f6834b;
    }
}
