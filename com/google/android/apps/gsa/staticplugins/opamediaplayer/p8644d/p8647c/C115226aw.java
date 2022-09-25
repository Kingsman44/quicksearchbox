package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115440j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115443m;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.aw */
/* compiled from: PG */
public final class C115226aw extends C23056g implements C115440j {

    /* renamed from: a */
    public static final C59071e f319758a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.aw");

    /* renamed from: b */
    public final C115443m f319759b;

    /* renamed from: c */
    public final C22871g f319760c;

    /* renamed from: d */
    public final C85349r f319761d;

    /* renamed from: e */
    public final C115315ed f319762e;

    /* renamed from: f */
    private final C23149a f319763f;

    /* renamed from: g */
    private final C85350s f319764g;

    public C115226aw(C23052c cVar, C115443m mVar, C23149a aVar, C22871g gVar, C85350s sVar, C85349r rVar, C115315ed edVar) {
        super(cVar);
        this.f319763f = aVar;
        this.f319759b = mVar;
        this.f319760c = gVar;
        this.f319764g = sVar;
        this.f319761d = rVar;
        this.f319762e = edVar;
    }

    /* renamed from: e */
    public final void mo101901e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f319763f.mo28600c();
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C52583xc xcVar;
        new C90873ag(this.f319761d.mo78864a(), this.f319760c, "getSpeakrSettings", new C115222as(this)).mo85223a(C115223at.f319756a);
        C85350s sVar = this.f319764g;
        C52568wo woVar = this.f319762e.mo101954a().mo101947a().f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        if (woVar.f137996c == 26) {
            xcVar = (C52583xc) woVar.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        C52582xb a = C52582xb.m86658a(xcVar.f138076l);
        if (a == null) {
            a = C52582xb.UNKNOWN_TRIGGER_TYPE;
        }
        new C90873ag(sVar.mo78879n(a), this.f319760c, "getSupportedLanguages", new C115220aq(this)).mo85223a(new C115221ar(this));
    }
}
