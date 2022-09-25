package com.google.android.apps.gsa.shared.p7004aw.p7005a;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115237bg;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115238bh;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115274cq;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.shared.aw.a.m */
/* compiled from: PG */
public final class C89309m {

    /* renamed from: a */
    public static final C59071e f242120a = C59071e.m91332i("com.google.android.apps.gsa.shared.aw.a.m");

    /* renamed from: b */
    public final Set f242121b;

    /* renamed from: c */
    public final C22871g f242122c;

    /* renamed from: d */
    public C58833ax f242123d = C58836b.f156633a;

    /* renamed from: e */
    public float f242124e = 1.0f;

    /* renamed from: f */
    final Map f242125f = new ConcurrentHashMap();

    /* renamed from: g */
    C58833ax f242126g = C58836b.f156633a;

    /* renamed from: h */
    public final C115238bh f242127h;

    /* renamed from: i */
    private final C21370a f242128i;

    /* renamed from: j */
    private final C115237bg f242129j;

    public C89309m(C115237bg bgVar, C115238bh bhVar, C22871g gVar, C21370a aVar) {
        this.f242129j = bgVar;
        this.f242127h = bhVar;
        this.f242122c = gVar;
        this.f242128i = aVar;
        this.f242121b = C58758qx.m90653k();
    }

    /* renamed from: a */
    public final C58833ax mo83235a(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        C89317u uVar = (C89317u) axVar.mo56107c();
        return C58833ax.m90834k(Long.valueOf(((long) (((float) (this.f242128i.mo26871c() - uVar.f242147b)) * this.f242124e)) + uVar.f242148c));
    }

    /* renamed from: b */
    public final synchronized void mo83236b() {
        this.f242122c.mo28212l("start", new C89298b(this));
    }

    /* renamed from: c */
    public final void mo83237c() {
        this.f242122c.mo28212l("reset", new C89304h(this));
    }

    /* renamed from: d */
    public final void mo83238d() {
        C60870cx cxVar;
        if (!mo83239e()) {
            this.f242126g = C58836b.f156633a;
            return;
        }
        C58833ax q = C115274cq.m191069q(this.f242127h.f319779a);
        if (!q.mo56113h()) {
            this.f242126g = C58836b.f156633a;
            return;
        }
        C58833ax a = mo83235a(q);
        if (!a.mo56113h()) {
            ((C59052c) ((C59052c) f242120a.mo56226d()).mo56372aa(11083)).mo56386p("Unable to get millis played in window.");
            this.f242126g = C58836b.f156633a;
            return;
        }
        C58833ax k = C58833ax.m90834k(Integer.valueOf(((C89317u) q.mo56107c()).f242149d));
        long longValue = ((Long) a.mo56107c()).longValue();
        int intValue = ((Integer) ((C58847bk) k).f156646a).intValue();
        C58485gu guVar = (C58485gu) this.f242125f.get(Integer.valueOf(intValue));
        if (guVar != null) {
            cxVar = C60856cj.m92900i(guVar);
        } else {
            cxVar = this.f242129j.f319778a.mo78883c(intValue);
        }
        C60870cx g = C60922j.m93044g(cxVar, new C89303g(this, intValue, longValue), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        new C90873ag(g, this.f242122c, "set-current-word", new C89299c(this)).mo85223a(new C89300d(this));
    }

    /* renamed from: e */
    public final boolean mo83239e() {
        return ((Boolean) C115274cq.m191069q(this.f242127h.f319779a).mo56106b(C89306j.f242118a).mo56109e(false)).booleanValue();
    }
}
