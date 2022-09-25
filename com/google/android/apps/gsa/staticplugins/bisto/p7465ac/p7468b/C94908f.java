package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.assistant.p3739a.p3740a.C48064ay;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48067ba;
import com.google.assistant.p3739a.p3740a.C48068bb;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.f */
/* compiled from: PG */
public final /* synthetic */ class C94908f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94914l f265472a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f265473b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f265474c;

    /* renamed from: d */
    public final /* synthetic */ boolean f265475d;

    public /* synthetic */ C94908f(C94914l lVar, C60870cx cxVar, C60870cx cxVar2, boolean z) {
        this.f265472a = lVar;
        this.f265473b = cxVar;
        this.f265474c = cxVar2;
        this.f265475d = z;
    }

    public final void run() {
        C94914l lVar = this.f265472a;
        C60870cx cxVar = this.f265473b;
        C60870cx cxVar2 = this.f265474c;
        boolean z = this.f265475d;
        if (C90877ak.m148480n(cxVar) && C90877ak.m148480n(cxVar2)) {
            C124548d dVar = (C124548d) C90877ak.m148474h(cxVar);
            if (dVar.mo106497ak()) {
                C58833ax axVar = (C58833ax) C90877ak.m148474h(cxVar2);
                boolean z2 = axVar.mo56113h() && dVar.mo106496aj((String) axVar.mo56107c());
                String c = lVar.f265487e.mo83457c();
                C59104x b = C94914l.f265483a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoGacsDataHandler");
                ((C59052c) ((C59052c) b).mo56372aa(17564)).mo56360M("hotword locale information %s %b %b %s", c, Boolean.valueOf(z), Boolean.valueOf(z2), axVar);
                if (c != null && z2) {
                    C48067ba baVar = (C48067ba) C48068bb.f124406d.createBuilder();
                    baVar.copyOnWrite();
                    ((C48068bb) baVar.instance).f124409b = c;
                    if (z) {
                        baVar.copyOnWrite();
                        C48068bb bbVar = (C48068bb) baVar.instance;
                        bbVar.f124408a |= 1;
                        bbVar.f124410c = true;
                    }
                    C48064ay ayVar = (C48064ay) C48065az.f124397c.createBuilder();
                    ayVar.copyOnWrite();
                    C48065az azVar = (C48065az) ayVar.instance;
                    C48068bb bbVar2 = (C48068bb) baVar.build();
                    bbVar2.getClass();
                    azVar.f124400b = bbVar2;
                    azVar.f124399a = 7;
                    lVar.mo88808j((C48065az) ayVar.build());
                }
            }
        }
    }
}
