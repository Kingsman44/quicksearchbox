package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115200c;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115201d;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115457aa;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.ae */
/* compiled from: PG */
public final class C115195ae extends C23056g {

    /* renamed from: a */
    private static final C59071e f319696a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.ae");

    /* renamed from: b */
    private final C115457aa f319697b;

    /* renamed from: c */
    private final Map f319698c;

    /* renamed from: d */
    private C58833ax f319699d = C58836b.f156633a;

    public C115195ae(C23052c cVar, C115457aa aaVar, C84274n nVar, Map map) {
        super(cVar);
        this.f319697b = aaVar;
        this.f319698c = map;
        cVar.mo28433w(C84274n.class, nVar);
    }

    /* renamed from: e */
    private final void m190974e(C52176ia iaVar) {
        C52567wn wnVar = C52567wn.NEWS;
        if (iaVar.f136914b.size() > 0) {
            C52174hz hzVar = (C52174hz) iaVar.f136914b.get(0);
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if ((woVar.f137994a & 512) != 0) {
                C52568wo woVar2 = hzVar.f136897d;
                if (woVar2 == null) {
                    woVar2 = C52568wo.f137992v;
                }
                wnVar = C52567wn.m86649b(woVar2.f138003j);
                if (wnVar == null) {
                    wnVar = C52567wn.UNKNOWN;
                }
            }
        }
        if (!this.f319698c.containsKey(wnVar)) {
            ((C59052c) ((C59052c) f319696a.mo56225c()).mo56372aa(29738)).mo56389s("Could not find RootControllerDelegate for type: %s", wnVar);
        } else {
            this.f319699d = C58833ax.m90834k(((C115201d) this.f319698c.get(wnVar)).mo101843a(this.f63405W, this.f319697b, iaVar));
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        m190974e((C52176ia) ((C23251a) this.f319697b.mo102040d()).f63720e);
        if (this.f319699d.mo56113h()) {
            ((C115200c) this.f319699d.mo56107c()).mo101890d();
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C58833ax j = C58833ax.m90833j((C52176ia) C23245b.m43557b(protoParcelable, C52176ia.f136911k.getParserForType(), C62921ba.m95368a(), true));
        if (!j.mo56113h()) {
            ((C59052c) ((C59052c) f319696a.mo56225c()).mo56372aa(29740)).mo56386p("No media data found");
        }
        C52176ia iaVar = (C52176ia) j.mo56109e(C52176ia.f136911k);
        ((C23251a) this.f319697b.mo102040d()).mo28730f(iaVar, false);
        m190974e(iaVar);
        if (this.f319699d.mo56113h()) {
            ((C115200c) this.f319699d.mo56107c()).mo101887a();
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        if (this.f319699d.mo56113h()) {
            ((C115200c) this.f319699d.mo56107c()).mo101889c();
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        if (this.f319699d.mo56113h()) {
            ((C115200c) this.f319699d.mo56107c()).mo101888b();
        }
    }
}
