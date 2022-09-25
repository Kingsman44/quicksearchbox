package p5462h.p5463a.p5464a;

import java.util.Map;
import p5462h.p5463a.C69527k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.a.a */
/* compiled from: PG */
public abstract class C69467a extends C69527k {
    /* renamed from: b */
    public abstract boolean mo61056b(Map.Entry entry);

    /* renamed from: c */
    public /* bridge */ boolean mo61057c(Map.Entry entry) {
        throw null;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C69664n.m101061g(entry, "element");
        return mo61056b(entry);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo61057c((Map.Entry) obj);
    }
}
