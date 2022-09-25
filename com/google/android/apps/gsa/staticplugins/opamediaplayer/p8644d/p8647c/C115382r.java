package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85349r;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85331i;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.r */
/* compiled from: PG */
public final class C115382r implements C115308dx {

    /* renamed from: a */
    public static final C59071e f320156a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.r");

    /* renamed from: b */
    public final C85350s f320157b;

    /* renamed from: c */
    public final C115315ed f320158c;

    /* renamed from: d */
    public final C22871g f320159d;

    /* renamed from: e */
    private final C85349r f320160e;

    public C115382r(C115315ed edVar, C85350s sVar, C85349r rVar, C22871g gVar) {
        this.f320157b = sVar;
        this.f320158c = edVar;
        this.f320160e = rVar;
        this.f320159d = gVar;
    }

    /* renamed from: a */
    public final void mo101893a(C52174hz hzVar) {
        C52583xc xcVar;
        C52568wo woVar = hzVar.f136897d;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        boolean z = true;
        if ((woVar.f137994a & 8) != 0) {
            C52568wo woVar2 = hzVar.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            if ((woVar2.f137994a & 1) != 0) {
                return;
            }
        }
        C85349r rVar = this.f320160e;
        C52568wo woVar3 = hzVar.f136897d;
        if (woVar3 == null) {
            woVar3 = C52568wo.f137992v;
        }
        if (woVar3.f137996c == 26) {
            xcVar = (C52583xc) woVar3.f137997d;
        } else {
            xcVar = C52583xc.f138063o;
        }
        if ((xcVar.f138065a & 64) == 0) {
            z = false;
        }
        C60870cx g = C60922j.m93044g(C85331i.m136801c(rVar, z), new C115379o(hzVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        new C90873ag(g, this.f320159d, "update-metadata", new C115377m(this, hzVar)).mo85223a(C115378n.f320151a);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo101894b(C52174hz hzVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo101895c(C52176ia iaVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo101896d(C84275o oVar) {
    }
}
