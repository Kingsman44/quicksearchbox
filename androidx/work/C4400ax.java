package androidx.work;

import androidx.work.impl.p207b.C4470ae;
import java.util.Set;
import java.util.UUID;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.ax */
/* compiled from: PG */
public class C4400ax {

    /* renamed from: a */
    public final UUID f14045a;

    /* renamed from: b */
    public final C4470ae f14046b;

    /* renamed from: c */
    public final Set f14047c;

    public C4400ax(UUID uuid, C4470ae aeVar, Set set) {
        C69664n.m101061g(uuid, "id");
        C69664n.m101061g(aeVar, "workSpec");
        C69664n.m101061g(set, "tags");
        this.f14045a = uuid;
        this.f14046b = aeVar;
        this.f14047c = set;
    }

    /* renamed from: a */
    public final String mo9342a() {
        String uuid = this.f14045a.toString();
        C69664n.m101060f(uuid, "id.toString()");
        return uuid;
    }
}
