package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8072a;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88055nm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88056nn;
import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103413b;
import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103416e;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.C103649c;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.a.g */
/* compiled from: PG */
public final class C103408g extends C23056g implements C103413b {

    /* renamed from: a */
    private static final C58974d f288256a = C58974d.m91136j();

    /* renamed from: b */
    private final C103416e f288257b;

    /* renamed from: c */
    private final C103649c f288258c;

    /* renamed from: d */
    private final Map f288259d;

    public C103408g(C23052c cVar, C103416e eVar, C103649c cVar2, Map map) {
        super(cVar);
        this.f288257b = eVar;
        this.f288258c = cVar2;
        this.f288259d = map;
    }

    /* renamed from: e */
    public final void mo93782e(C88056nn nnVar) {
        C23129y yVar = (C23129y) this.f288259d.get(C88055nm.m142778a(nnVar.f238100a));
        if (yVar == null) {
            ((C58970a) ((C58970a) f288256a.mo56225c()).mo56372aa(21521)).mo56389s("Unexpected ui request type %s", C88055nm.m142778a(nnVar.f238100a));
            return;
        }
        if (((C103403b) this.f288257b).f288250a.mo28631l()) {
            ((C103403b) this.f288257b).f288250a.mo28627h();
        }
        ((C103403b) this.f288257b).f288250a.mo28623d(yVar, C23245b.m43556a(nnVar));
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        this.f288258c.mo93823b(new C103407f(this));
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f288258c.f288724b = C103649c.f288723a;
    }
}
