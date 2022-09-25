package androidx.media3.p132b.p133a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.b.a.t */
/* compiled from: PG */
public final class C2475t {

    /* renamed from: a */
    public final Map f6808a = new HashMap();

    /* renamed from: b */
    public final List f6809b = new ArrayList();

    /* renamed from: b */
    public final void mo5908b(long j) {
        mo5907a("exo_len", Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo5907a(String str, Object obj) {
        Map map = this.f6808a;
        obj.getClass();
        map.put(str, obj);
        this.f6809b.remove(str);
    }
}
