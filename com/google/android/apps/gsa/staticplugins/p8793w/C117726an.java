package com.google.android.apps.gsa.staticplugins.p8793w;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.projection.C84190d;
import com.google.android.apps.gsa.search.core.carassistant.C85736n;
import com.google.android.apps.gsa.search.core.carassistant.C85737o;
import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.an */
/* compiled from: PG */
public final class C117726an implements C85737o {

    /* renamed from: a */
    private static final C59071e f326774a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.an");

    /* renamed from: b */
    private final ContentResolver f326775b;

    /* renamed from: c */
    private final Query f326776c;

    /* renamed from: d */
    private final CarAssistantSessionManager.Config f326777d;

    /* renamed from: e */
    private final C86124t f326778e;

    /* renamed from: f */
    private final C84190d f326779f;

    public C117726an(ContentResolver contentResolver, Query query, C84190d dVar, CarAssistantSessionManager.Config config, C86124t tVar) {
        this.f326775b = contentResolver;
        this.f326776c = query;
        this.f326779f = dVar;
        this.f326777d = config;
        this.f326778e = tVar;
    }

    /* renamed from: a */
    public final Query mo79386a(C85736n nVar) {
        Query query;
        Query query2;
        Query aI = ((Query) C58831av.m90830c(nVar.mo79354f(), this.f326776c)).mo84275aL((String) C58831av.m90830c(nVar.mo79359j(), this.f326777d.mo79285l())).mo84272aI(this.f326777d.mo79279g());
        long max = Math.max(0, nVar.mo79350c());
        Uri e = nVar.mo79352e();
        if (e != null) {
            Uri uri = aI.f252787z;
            if (uri != null) {
                C58976aa aaVar = C58975e.f156826a;
                try {
                    ParcelFileDescriptor openFileDescriptor = this.f326775b.openFileDescriptor(uri, C33259r.f88929b);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                } catch (IOException | SecurityException e2) {
                    C59104x c = f326774a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "QueryFactory");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(18560)).mo56386p("#closeAudioProvider");
                }
            }
            query = aI.mo84443dX(e, nVar.mo79349b(), nVar.mo79361l(), max, this.f326777d.mo79288o(), nVar.mo79355g());
        } else {
            query = aI.mo84444dY(max, this.f326777d.mo79288o(), nVar.mo79355g());
        }
        if (this.f326779f.mo77657a()) {
            query2 = query.mo84244G(true);
        } else {
            query2 = query.mo84244G(false);
        }
        String i = nVar.mo79358i();
        if (i != null) {
            Query aE = query2.mo84244G(true).mo84268aE(i, true);
            if (nVar.mo79360k()) {
                query2 = aE.mo84494v();
            } else {
                query2 = aE.mo84288aY();
            }
        }
        if (this.f326777d.mo79274c() != 0) {
            query2 = query2.mo84271aH(this.f326777d.mo79274c());
        }
        if (this.f326778e.mo79746e(C90086ek.f250467dg) && this.f326777d.mo79273b() != 0) {
            query2 = query2.mo84279aP(this.f326777d.mo79273b());
        }
        Query aw = query2.mo84311aw("android.opa.extra.AUDIO_SESSION_ID", this.f326777d.mo79272a());
        String h = nVar.mo79356h();
        return (!this.f326778e.mo79746e(C90086ek.f250322au) || h == null) ? aw : aw.mo84278aO("android.opa.extra.FOREGROUND_APP_TRIGGERED_ON", h);
    }
}
