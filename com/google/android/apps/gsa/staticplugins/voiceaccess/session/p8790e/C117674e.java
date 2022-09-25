package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8790e;

import android.content.Context;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.binaries.satin.app.azd;
import com.google.android.apps.gsa.binaries.satin.app.azf;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7298l.C92474g;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a.C117622c;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a.C117623d;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a.C117624e;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8787b.C117625a;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8787b.C117626b;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d.C117634ae;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d.C117644c;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8791f.C117675a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.e.e */
/* compiled from: PG */
public final class C117674e implements C117625a, C117675a, C117622c {

    /* renamed from: a */
    public final C84516aa f326619a;

    /* renamed from: b */
    public final C87673aa f326620b;

    /* renamed from: c */
    public final C117623d f326621c;

    /* renamed from: d */
    public final C117626b f326622d;

    /* renamed from: e */
    public final C117634ae f326623e;

    /* renamed from: f */
    private final C22871g f326624f;

    /* renamed from: g */
    private final C89356b f326625g;

    /* renamed from: h */
    private final C68214a f326626h;

    /* renamed from: i */
    private final azd f326627i;

    public C117674e(C90476a aVar, Context context, C84516aa aaVar, C22871g gVar, C84466a aVar2, C117623d dVar, C117626b bVar, C117634ae aeVar, azd azd, C68214a aVar3) {
        C22871g gVar2 = gVar;
        this.f326624f = gVar2;
        this.f326627i = azd;
        C84466a aVar4 = aVar2;
        this.f326625g = aVar2.mo78025a("voice_access", 394, 369);
        this.f326619a = aaVar;
        this.f326622d = bVar;
        this.f326623e = aeVar;
        this.f326621c = dVar;
        this.f326626h = aVar3;
        C88486g gVar3 = new C88486g();
        gVar3.f239201c = amo.VOICE_ACCESS;
        gVar3.f239204f = "voice_access";
        this.f326620b = new C87673aa(context, (C87682aj) null, (C90757ba) null, new ClientConfig(gVar3), gVar2, aVar);
    }

    /* renamed from: a */
    public final void mo103417a(boolean z) {
        C117634ae aeVar = this.f326623e;
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = aeVar.f326535f;
        if (cxVar != null && !cxVar.isCancelled()) {
            cxVar.mo4106b(new C117671b(this, z), C60826bg.f164896a);
        }
    }

    /* renamed from: b */
    public final C117644c mo103425b() {
        C92473f c = ((C92474g) this.f326626h.mo27525b()).mo87220c(true);
        azd azd = this.f326627i;
        azd.f204810c = this.f326625g;
        C117623d dVar = this.f326621c;
        dVar.getClass();
        azd.f204811d = dVar;
        C117634ae aeVar = this.f326623e;
        aeVar.getClass();
        azd.f204812e = aeVar;
        azd.f204813f = c;
        C68225k.m98529a(azd.f204810c, C89356b.class);
        C68225k.m98529a(azd.f204811d, C117624e.class);
        C68225k.m98529a(azd.f204812e, C117634ae.class);
        C68225k.m98529a(azd.f204813f, C92473f.class);
        return new azf(azd.f204808a, azd.f204809b, azd.f204810c, azd.f204811d, azd.f204812e, azd.f204813f);
    }

    /* renamed from: c */
    public final void mo103426c(C22869e eVar) {
        if (C22872h.m42744d(C0826b.class)) {
            eVar.run();
        } else {
            this.f326624f.mo28207g("Disconnect Search Client from Voice Access session", new C117673d(eVar));
        }
    }

    /* renamed from: d */
    public final void mo103427d() {
        C117634ae aeVar = this.f326623e;
        C58976aa aaVar = C58975e.f156826a;
        if (aeVar.f326534e == null) {
            this.f326623e.f326534e = mo103425b().f.mo60297gq();
            mo103426c(new C117672c(this));
        }
    }
}
