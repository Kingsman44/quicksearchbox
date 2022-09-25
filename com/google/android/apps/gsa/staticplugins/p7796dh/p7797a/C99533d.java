package com.google.android.apps.gsa.staticplugins.p7796dh.p7797a;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7106w.C90296a;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7780de.p7782b.C99403at;
import com.google.android.apps.gsa.staticplugins.p7780de.p7782b.C99409f;
import com.google.android.apps.gsa.staticplugins.p7796dh.p7798b.C99535a;
import com.google.android.apps.gsa.staticplugins.p7796dh.p7798b.C99538d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import java.io.FileNotFoundException;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69428bw;
import p5451f.p5452a.p5453a.p5454a.C69429bx;
import p5451f.p5452a.p5453a.p5454a.C69455t;

/* renamed from: com.google.android.apps.gsa.staticplugins.dh.a.d */
/* compiled from: PG */
public final class C99533d extends C23056g implements C90296a, C99535a {

    /* renamed from: d */
    private static final C59071e f278496d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dh.a.d");

    /* renamed from: a */
    public final C99538d f278497a;

    /* renamed from: b */
    public final C85536a f278498b;

    /* renamed from: c */
    public final C89409b f278499c;

    /* renamed from: e */
    private final Context f278500e;

    /* renamed from: f */
    private final C22871g f278501f;

    /* renamed from: g */
    private C99409f f278502g;

    public C99533d(C23052c cVar, C99538d dVar, Context context, C22871g gVar, C85536a aVar, C89409b bVar) {
        super(cVar);
        this.f278497a = dVar;
        this.f278500e = context;
        this.f278501f = gVar;
        this.f278498b = aVar;
        this.f278499c = bVar;
    }

    /* renamed from: a */
    public final void mo83991a(C99409f fVar) {
        this.f278502g = fVar;
    }

    /* renamed from: e */
    public final void mo91486e() {
        ((C23251a) this.f278497a.mo91482b()).mo28730f(false, false);
        C99409f fVar = this.f278502g;
        if (fVar != null) {
            C99403at atVar = fVar.f278198a;
            if (!atVar.f63405W.mo28420E() && ((C23186f) atVar.f278110e.mo91437c()).mo28631l()) {
                ((C23186f) atVar.f278110e.mo91437c()).mo28627h();
            }
            atVar.mo91423k();
        }
        this.f278498b.mo79059k(((Integer) this.f278497a.mo91485e().f63720e).intValue(), 2);
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C69429bx bxVar;
        C69396ar arVar = (C69396ar) C23245b.m43557b(protoParcelable, C69396ar.f185678d.getParserForType(), C62921ba.m95368a(), true);
        if (arVar != null) {
            if (arVar.f185680a == 9) {
                bxVar = (C69429bx) arVar.f185681b;
            } else {
                bxVar = C69429bx.f185773e;
            }
            if (!bxVar.equals(C69429bx.f185773e)) {
                C69428bw a = C69428bw.m100754a(bxVar.f185775a);
                if (a == null) {
                    a = C69428bw.UNKNOWN_TOOLTIP_TYPE;
                }
                if (a != C69428bw.UNKNOWN_TOOLTIP_TYPE) {
                    C69455t tVar = bxVar.f185776b;
                    if (tVar == null) {
                        tVar = C69455t.f185861c;
                    }
                    int i = tVar.f185863a;
                    if (i != 1) {
                        if (i == 2) {
                            try {
                                C90772bp.m148303k(this.f278500e, Uri.parse((String) tVar.f185864b));
                            } catch (FileNotFoundException e) {
                                C59104x c = f278496d.mo56225c();
                                c.mo56378ag(C58975e.f156826a, "SearchPlateTooltCntr");
                                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(32636)).mo56386p("Cannot find string for uri.");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C23251a e2 = this.f278497a.mo91485e();
                    C69421bp bpVar = arVar.f185682c;
                    if (bpVar == null) {
                        bpVar = C69421bp.f185742q;
                    }
                    e2.mo28730f(Integer.valueOf(bpVar.f185745b), false);
                    C23251a aVar = (C23251a) this.f278497a.mo91483c();
                    C69455t tVar2 = bxVar.f185776b;
                    if (tVar2 == null) {
                        tVar2 = C69455t.f185861c;
                    }
                    aVar.mo28730f(tVar2, false);
                    C23251a aVar2 = (C23251a) this.f278497a.mo91484d();
                    int i2 = bxVar.f185778d;
                    if (i2 == 0) {
                        i2 = 5000;
                    }
                    aVar2.mo28730f(Integer.valueOf(i2), false);
                    C69421bp bpVar2 = arVar.f185682c;
                    if (bpVar2 == null) {
                        bpVar2 = C69421bp.f185742q;
                    }
                    boolean z = bpVar2.f185749f;
                    int intValue = ((Integer) this.f278497a.mo91485e().f63720e).intValue();
                    new C90873ag(this.f278498b.mo79049a(intValue), this.f278501f, "Trigger search plate tooltip", new C99531b(this, intValue, z)).mo85223a(new C99532c());
                }
            }
        }
    }
}
