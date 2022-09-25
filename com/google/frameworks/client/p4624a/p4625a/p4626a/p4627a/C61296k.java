package com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59033h;
import com.google.common.p4526f.p4528b.p4529a.C58982a;
import java.util.Collection;
import java.util.logging.Level;

/* renamed from: com.google.frameworks.client.a.a.a.a.k */
/* compiled from: PG */
public final class C61296k extends C58982a {

    /* renamed from: a */
    private final Collection f165786a;

    public C61296k(String str, Collection collection) {
        super(str);
        this.f165786a = collection;
    }

    /* renamed from: a */
    public final void mo36921a(C59031f fVar) {
        C58801sm G = ((C58485gu) this.f165786a).listIterator(0);
        while (G.hasNext()) {
            C59033h hVar = (C59033h) G.next();
            if (fVar.mo56301W() || hVar.mo36922b(fVar.mo56309l())) {
                hVar.mo36921a(fVar);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        C58801sm G = ((C58485gu) this.f165786a).listIterator(0);
        while (G.hasNext()) {
            if (((C59033h) G.next()).mo36922b(level)) {
                return true;
            }
        }
        return false;
    }
}
