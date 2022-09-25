package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.ab.c;
import com.google.android.apps.gsa.nga.engine.grammar.C76123a;
import com.google.android.apps.gsa.nga.engine.grammar.C76134l;
import com.google.android.apps.gsa.nga.engine.grammar.C76138p;
import com.google.android.apps.gsa.nga.engine.grammar.C76142t;
import com.google.android.apps.gsa.nga.shared.p6311ah.C80631b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.e */
/* compiled from: PG */
public final class C79052e {

    /* renamed from: a */
    public final C58974d f217384a = C58974d.m91136j();

    /* renamed from: b */
    public final c f217385b;

    /* renamed from: c */
    public final C22871g f217386c;

    /* renamed from: d */
    public final C91142g f217387d;

    /* renamed from: e */
    public final C80631b f217388e;

    /* renamed from: f */
    public final C60950i f217389f;

    /* renamed from: g */
    public final C76142t f217390g;

    public C79052e(c cVar, C76142t tVar, C91142g gVar, C22871g gVar2, C80631b bVar, C60950i iVar) {
        this.f217385b = cVar;
        this.f217390g = tVar;
        this.f217387d = gVar;
        this.f217386c = gVar2;
        this.f217388e = bVar;
        this.f217389f = iVar;
    }

    /* renamed from: a */
    public final C58485gu mo73796a(C76123a aVar, C76134l lVar, C83320io ioVar) {
        C76138p a = aVar.mo72068a(lVar, ioVar);
        if (!a.f211098a.isEmpty()) {
            ((C58970a) ((C58970a) this.f217384a.mo56225c()).mo56372aa(5487)).mo56389s("Failed to convert intents to interpretations: %s", a.f211098a);
        }
        return C58485gu.m89842j(a.f211099b);
    }
}
