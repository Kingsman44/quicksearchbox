package androidx.work;

import androidx.work.impl.utils.p210b.C4595b;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f13988a;

    /* renamed from: b */
    public C4632m f13989b;

    /* renamed from: c */
    public Set f13990c;

    /* renamed from: d */
    public int f13991d;

    /* renamed from: e */
    public Executor f13992e;

    /* renamed from: f */
    public C4405bb f13993f;

    /* renamed from: g */
    public C4636q f13994g;

    /* renamed from: h */
    public C4595b f13995h;

    public WorkerParameters(UUID uuid, C4632m mVar, Collection collection, int i, Executor executor, C4595b bVar, C4405bb bbVar, C4636q qVar) {
        this.f13988a = uuid;
        this.f13989b = mVar;
        this.f13990c = new HashSet(collection);
        this.f13991d = i;
        this.f13992e = executor;
        this.f13995h = bVar;
        this.f13993f = bbVar;
        this.f13994g = qVar;
    }
}
