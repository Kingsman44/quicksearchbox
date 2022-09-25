package com.google.android.apps.search.googleapp.search.p10412h;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60537to;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.h.d */
/* compiled from: PG */
public final class C137473d {

    /* renamed from: a */
    private static final C58974d f373914a = C58974d.m91136j();

    /* renamed from: b */
    private final C89859i f373915b;

    /* renamed from: c */
    private final C139695b f373916c;

    /* renamed from: d */
    private final C38750am f373917d;

    /* renamed from: e */
    private final C139708c f373918e;

    public C137473d(C89859i iVar, C139695b bVar, C38750am amVar, C139708c cVar) {
        this.f373915b = iVar;
        this.f373916c = bVar;
        this.f373917d = amVar;
        this.f373918e = cVar;
    }

    /* renamed from: g */
    public static boolean m223355g(C137542d dVar) {
        int a = C137540b.m223424a(dVar.f374088b);
        return a != 0 && a == 8;
    }

    /* renamed from: a */
    public final void mo113760a(C137542d dVar, C89849ae aeVar, C59687cb cbVar) {
        aeVar.name();
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C137418g gVar = dVar.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        fVar.mo83701c("rId", gVar.f373783o);
        if (cbVar != null) {
            fVar.f246203c = cbVar;
        }
        this.f373915b.mo74236a(fVar.mo83699a());
    }

    /* renamed from: b */
    public final void mo113761b(C137542d dVar, C89849ae aeVar, C60537to toVar) {
        C89849ae aeVar2;
        if (this.f373918e.f379737d) {
            this.f373915b.mo83702b(C89849ae.TNG_VOICE_SEARCH_ASSISTANT_HANDOFF);
            this.f373918e.f379737d = false;
            return;
        }
        C89849ae aeVar3 = C89849ae.UNKNOWN_EVENT;
        switch (aeVar.ordinal()) {
            case 20:
                aeVar2 = C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_SUCCESS;
                break;
            case 21:
                aeVar2 = C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_CANCEL;
                break;
            case 22:
                aeVar2 = C89849ae.INTENT_API_OR_LEGACY_VOICE_ENDSTATE_FAILURE;
                break;
            default:
                aeVar2 = null;
                break;
        }
        if (aeVar2 != null) {
            mo113763d(dVar, aeVar2, toVar);
        }
    }

    /* renamed from: c */
    public final void mo113762c(C137542d dVar, boolean z) {
        if (!m223355g(dVar)) {
            int a = C137540b.m223424a(dVar.f374088b);
            if (a == 0 || a != 11) {
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                C137418g gVar = dVar.f374092f;
                if (gVar == null) {
                    gVar = C137418g.f373767r;
                }
                String str = gVar.f373783o;
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                str.getClass();
                ufVar.f164093a |= 4;
                ufVar.f164259n = str;
                long j = dVar.f374089c;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                ufVar2.f164250e |= 2048;
                ufVar2.f164097aD = j;
                if (z) {
                    C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                    int i = C89849ae.VBUS_TEXT_SEARCH_COMMIT.f245884YW;
                    ajVar.copyOnWrite();
                    C59687cb cbVar = (C59687cb) ajVar.instance;
                    cbVar.f160062a |= C89885b.S3REQUEST_VALUE;
                    cbVar.f160139t = i;
                    mo113760a(dVar, C89849ae.VBUS_SEARCH_RECOMMIT, (C59687cb) ajVar.build());
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    ufVar3.f164119aZ = 1;
                    ufVar3.f164251f |= C89885b.NOW_VALUE;
                } else {
                    mo113760a(dVar, C89849ae.VBUS_TEXT_SEARCH_COMMIT, (C59687cb) null);
                }
                this.f373917d.mo41606r(tzVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo113763d(C137542d dVar, C89849ae aeVar, C60537to toVar) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C137418g gVar = dVar.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        String str = gVar.f373783o;
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        str.getClass();
        cbVar.f160062a |= 4;
        cbVar.f160127h = str;
        int i = toVar.f164013af;
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        cbVar2.f160062a |= 1;
        cbVar2.f160124e = i;
        Optional a = this.f373916c.mo115169a();
        if (a.isPresent()) {
            String str2 = (String) a.get();
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            str2.getClass();
            cbVar3.f160115b |= 2;
            cbVar3.f160039D = str2;
        } else {
            C95883aa.m158983d(f373914a.mo56225c(), "App entry source is absent.", 40984, C38505d.f101864b, 144280204);
        }
        mo113760a(dVar, aeVar, (C59687cb) ajVar.build());
    }

    /* renamed from: e */
    public final void mo113764e(C137542d dVar, C60537to toVar) {
        if (m223355g(dVar)) {
            mo113761b(dVar, C89849ae.VBUS_ENDSTATE_FAILURE, toVar);
        } else {
            mo113763d(dVar, C89849ae.VBUS_ENDSTATE_FAILURE, toVar);
        }
    }

    /* renamed from: f */
    public final void mo113765f(C137542d dVar, C60537to toVar) {
        if (m223355g(dVar)) {
            mo113761b(dVar, C89849ae.VBUS_ENDSTATE_SUCCESS, toVar);
        } else {
            mo113763d(dVar, C89849ae.VBUS_ENDSTATE_SUCCESS, toVar);
        }
    }
}
