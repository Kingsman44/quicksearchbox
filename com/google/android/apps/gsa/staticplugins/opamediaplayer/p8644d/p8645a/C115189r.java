package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8645a;

import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115200c;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115457aa;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23058i;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23160l;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a.r */
/* compiled from: PG */
public final class C115189r implements C115200c {

    /* renamed from: a */
    public static final C59071e f319672a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a.r");

    /* renamed from: b */
    public final C115457aa f319673b;

    /* renamed from: c */
    public final C52176ia f319674c;

    /* renamed from: d */
    public final C84274n f319675d;

    /* renamed from: e */
    public final C22871g f319676e;

    /* renamed from: f */
    private final C23052c f319677f;

    /* renamed from: g */
    private final C23058i f319678g;

    /* renamed from: h */
    private final C86124t f319679h;

    public C115189r(C23052c cVar, C115457aa aaVar, C52176ia iaVar, C84274n nVar, C23058i iVar, C22871g gVar, C86124t tVar) {
        this.f319677f = cVar;
        this.f319673b = aaVar;
        this.f319674c = iaVar;
        this.f319678g = iVar;
        this.f319676e = gVar;
        this.f319679h = tVar;
        this.f319675d = nVar;
    }

    /* renamed from: a */
    public final void mo101887a() {
        C58976aa aaVar = C58975e.f156826a;
        C52176ia iaVar = this.f319674c;
        if (this.f319679h.mo79746e(C90014bt.f247493iG)) {
            ((C23160l) this.f319673b.mo102042f()).mo28606e(new C23129y("media_player"), C23245b.m43556a(iaVar));
            return;
        }
        ((C23186f) this.f319673b.mo102038b()).mo28624e("appbar", C23245b.m43556a(iaVar));
        ((C23160l) this.f319673b.mo102043g()).mo28606e(new C23129y("playlist"), C23245b.m43556a(iaVar));
        ((C23186f) this.f319673b.mo102039c()).mo28624e("playback_panel", C23245b.m43556a(iaVar));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo101888b() {
    }

    /* renamed from: c */
    public final void mo101889c() {
        new C90873ag(this.f319675d.mo77785a(), this.f319676e, "media-data-callback", new C115181j(this)).mo85223a(C115182k.f319665a);
        ((C23251a) this.f319673b.mo102041e()).mo28730f(Boolean.valueOf(this.f319679h.mo79746e(C90014bt.f247493iG)), false);
        if (this.f319679h.mo79746e(C90014bt.f247493iG)) {
            this.f319678g.mo28500a(this.f319677f, new C115183l(this));
            ((C23160l) this.f319673b.mo102042f()).f63521d = C115184m.f319667a;
            return;
        }
        this.f319678g.mo28500a(this.f319677f, new C115185n(this));
        ((C23160l) this.f319673b.mo102043g()).f63521d = C115186o.f319669a;
    }

    /* renamed from: d */
    public final void mo101890d() {
        C58976aa aaVar = C58975e.f156826a;
    }
}
