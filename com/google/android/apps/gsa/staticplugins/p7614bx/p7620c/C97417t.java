package com.google.android.apps.gsa.staticplugins.p7614bx.p7620c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90263e;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97427h;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97430k;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.play.core.p3525a.C45025a;
import com.google.android.play.core.p3525a.C45032e;
import com.google.android.play.core.p3525a.C45038k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import p5451f.p5452a.p5453a.p5454a.C69393ao;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69455t;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.c.t */
/* compiled from: PG */
public final class C97417t extends C23056g implements C97427h {

    /* renamed from: a */
    private static final C59071e f272051a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bx.c.t");

    /* renamed from: b */
    private final C97430k f272052b;

    /* renamed from: c */
    private final Context f272053c;

    /* renamed from: d */
    private final C58833ax f272054d;

    /* renamed from: e */
    private final C91097g f272055e;

    /* renamed from: f */
    private final C85536a f272056f;

    /* renamed from: g */
    private final C45032e f272057g;

    /* renamed from: h */
    private boolean f272058h;

    public C97417t(C23052c cVar, C97430k kVar, Context context, C58833ax axVar, C91097g gVar, C85536a aVar, C45032e eVar) {
        super(cVar);
        this.f272052b = kVar;
        this.f272053c = context;
        this.f272054d = axVar;
        this.f272055e = gVar;
        this.f272056f = aVar;
        this.f272057g = eVar;
    }

    /* renamed from: j */
    private final boolean m161220j(C69455t tVar) {
        int i = tVar.f185863a;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            C90772bp.m148303k(this.f272053c, Uri.parse((String) tVar.f185864b));
            return true;
        } catch (FileNotFoundException e) {
            C59104x c = f272051a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MenuPromoController");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21020)).mo56386p("Cannot find string for uri.");
            return false;
        }
    }

    /* renamed from: k */
    private final boolean m161221k(C58833ax axVar) {
        C69393ao aoVar;
        if (axVar.mo56113h() && ((C69396ar) axVar.mo56107c()).f185680a == 4) {
            C69421bp bpVar = ((C69396ar) axVar.mo56107c()).f185682c;
            if (bpVar == null) {
                bpVar = C69421bp.f185742q;
            }
            if ((bpVar.f185744a & 1) != 0) {
                C69396ar arVar = (C69396ar) axVar.mo56107c();
                if (arVar.f185680a == 4) {
                    aoVar = (C69393ao) arVar.f185681b;
                } else {
                    aoVar = C69393ao.f185657i;
                }
                C69455t tVar = aoVar.f185660b;
                if (tVar == null) {
                    tVar = C69455t.f185861c;
                }
                if (m161220j(tVar)) {
                    C69455t tVar2 = aoVar.f185661c;
                    if (tVar2 == null) {
                        tVar2 = C69455t.f185861c;
                    }
                    if (m161220j(tVar2)) {
                        C69455t tVar3 = aoVar.f185662d;
                        if (tVar3 == null) {
                            tVar3 = C69455t.f185861c;
                        }
                        if (m161220j(tVar3)) {
                            C69455t tVar4 = aoVar.f185663e;
                            if (tVar4 == null) {
                                tVar4 = C69455t.f185861c;
                            }
                            if (m161220j(tVar4) && ((aoVar.f185659a & 32) != 0 || aoVar.f185666h)) {
                                C146006ab a = this.f272057g.mo48866a();
                                if (aoVar.f185666h && a.mo122490i() && ((C45025a) a.mo122488g()).mo48862a(C45038k.m80183c()) == null) {
                                    return false;
                                }
                                if (!aoVar.f185666h) {
                                    try {
                                        Intent.parseUri(aoVar.f185665g, 1);
                                    } catch (URISyntaxException unused) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo90711e() {
        C69393ao aoVar;
        C69396ar arVar = (C69396ar) ((C23251a) this.f272052b.mo90691b()).f63720e;
        if (arVar.f185680a == 4) {
            aoVar = (C69393ao) arVar.f185681b;
        } else {
            aoVar = C69393ao.f185657i;
        }
        if (!aoVar.f185666h) {
            try {
                this.f272055e.mo65089a(Intent.parseUri(aoVar.f185665g, 1));
            } catch (URISyntaxException e) {
                C59104x c = f272051a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MenuPromoController");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21019)).mo56386p("Failed to parse Intent.");
            }
        }
        C85536a aVar = this.f272056f;
        C69421bp bpVar = arVar.f185682c;
        if (bpVar == null) {
            bpVar = C69421bp.f185742q;
        }
        aVar.mo79051c(bpVar.f185745b);
        ((C90263e) this.f272054d.mo56107c()).mo83975c(C58836b.f156633a);
    }

    /* renamed from: f */
    public final void mo90712f() {
        if (this.f272058h) {
            C85536a aVar = this.f272056f;
            C69421bp bpVar = ((C69396ar) ((C23251a) this.f272052b.mo90691b()).f63720e).f185682c;
            if (bpVar == null) {
                bpVar = C69421bp.f185742q;
            }
            aVar.mo79055g(bpVar.f185745b);
            this.f272058h = false;
        }
    }

    /* renamed from: h */
    public final void mo90713h() {
        C85536a aVar = this.f272056f;
        C69421bp bpVar = ((C69396ar) ((C23251a) this.f272052b.mo90691b()).f63720e).f185682c;
        if (bpVar == null) {
            bpVar = C69421bp.f185742q;
        }
        aVar.mo79059k(bpVar.f185745b, 3);
        ((C90263e) this.f272054d.mo56107c()).mo83975c(C58836b.f156633a);
    }

    /* renamed from: i */
    public final void mo90714i(C58833ax axVar) {
        ((C23251a) this.f272052b.mo90691b()).mo28730f(m161221k(axVar) ? (C69396ar) axVar.mo56107c() : C69396ar.f185678d, false);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        this.f272058h = false;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        this.f272058h = true;
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        if (!this.f272054d.mo56113h()) {
            mo90714i(C58836b.f156633a);
            return;
        }
        mo90714i(((C90263e) this.f272054d.mo56107c()).f252131a);
        ((C90263e) this.f272054d.mo56107c()).mo83974b(new C97416s(this));
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        if (this.f272054d.mo56113h()) {
            ((C90263e) this.f272054d.mo56107c()).mo83973a();
        }
    }
}
