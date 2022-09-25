package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91405d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104457t;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104473i;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104530z;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7665fk;
import com.google.p375ai.p378b.C8178yk;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cy */
/* compiled from: PG */
public final class C104611cy extends C23056g implements C104457t {

    /* renamed from: a */
    public static final C59071e f291232a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.cy");

    /* renamed from: b */
    public final C104606ct f291233b;

    /* renamed from: c */
    public final C91405d f291234c;

    /* renamed from: d */
    public final C104473i f291235d;

    public C104611cy(C23052c cVar, C104473i iVar, C91405d dVar, C104606ct ctVar) {
        super(cVar);
        this.f291235d = iVar;
        this.f291234c = dVar;
        this.f291233b = ctVar;
    }

    /* renamed from: e */
    public final void mo94274e() {
        if (((C58833ax) this.f291235d.mo94213c().f63720e).mo56113h()) {
            C91405d dVar = this.f291234c;
            C8178yk ykVar = ((C7664fj) ((C58833ax) this.f291235d.mo94213c().f63720e).mo56107c()).f26605c;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            dVar.mo85749i(ykVar);
        }
        if (((C58833ax) ((C23251a) this.f291235d.mo94212b()).f63720e).mo56113h()) {
            C8178yk ykVar2 = ((C7665fk) ((C58833ax) ((C23251a) this.f291235d.mo94212b()).f63720e).mo56107c()).f26616d;
            if (ykVar2 == null) {
                ykVar2 = C8178yk.f28736g;
            }
            this.f291234c.mo85748h(ykVar2);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C104530z zVar = (C104530z) C23245b.m43557b(protoParcelable, C104530z.f290737d.getParserForType(), C62921ba.m95368a(), true);
        zVar.getClass();
        this.f291235d.mo94214d().mo28730f(Boolean.valueOf(zVar.f290741c), false);
        C23251a aVar = (C23251a) this.f291235d.mo94212b();
        C7665fk fkVar = zVar.f290740b;
        if (fkVar == null) {
            fkVar = C7665fk.f26611e;
        }
        aVar.mo28730f(C58833ax.m90834k(fkVar), false);
    }
}
