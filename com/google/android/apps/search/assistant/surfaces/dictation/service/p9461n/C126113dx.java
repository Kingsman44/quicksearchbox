package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.binaries.satin.app.aoj;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125932u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C125995c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126027d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.assistant.p3931f.p3939c.C52829f;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.dx */
/* compiled from: PG */
public final class C126113dx {

    /* renamed from: a */
    private final C125937z f347541a;

    /* renamed from: b */
    private final aoj f347542b;

    public C126113dx(C125937z zVar, aoj aoj) {
        this.f347541a = zVar;
        this.f347542b = aoj;
    }

    /* renamed from: a */
    public final C126035k mo107356a(C126087cy cyVar, C52829f fVar) {
        int i;
        int i2;
        C126087cy cyVar2 = cyVar;
        C125931t a = this.f347542b.mo66633a(this.f347541a.mo107203b());
        Locale g = a.mo107188g();
        if (g != null) {
            String f = a.mo107187f();
            if (f != null) {
                boolean q = a.mo107198q(a.f347137d);
                boolean z = false;
                boolean z2 = a.mo107198q(a.f347139f) && a.f347134a.f347148c.a.size() > 1;
                C125995c cVar = new C125995c();
                cVar.f347249f = 1;
                cVar.mo107234b(false);
                cVar.mo107233a(false);
                cVar.mo107236d(false);
                cVar.mo107235c(false);
                if (a.mo107189h()) {
                    i = 2;
                } else if (a.mo107190i()) {
                    i = 3;
                } else if (a.mo107197p()) {
                    i = 4;
                } else {
                    i = C125932u.m205973e(a.f347134a.f347148c.d) ? 5 : 1;
                }
                cVar.f347249f = i;
                C126084cv cvVar = cyVar2.f347493d;
                if (cvVar.f347486c || cvVar.f347485b || cvVar.f347484a) {
                    z = true;
                }
                cVar.mo107234b(z);
                cVar.mo107233a(cyVar2.f347493d.f347487d);
                cVar.mo107236d(a.mo107194m());
                cVar.mo107235c(a.mo107193l());
                if (cVar.f347248e != 15 || (i2 = cVar.f347249f) == 0) {
                    StringBuilder sb = new StringBuilder();
                    if (cVar.f347249f == 0) {
                        sb.append(" fieldType");
                    }
                    if ((cVar.f347248e & 1) == 0) {
                        sb.append(" hasText");
                    }
                    if ((cVar.f347248e & 2) == 0) {
                        sb.append(" acceptsUndo");
                    }
                    if ((cVar.f347248e & 4) == 0) {
                        sb.append(" supportsSendAction");
                    }
                    if ((cVar.f347248e & 8) == 0) {
                        sb.append(" supportsSearchAction");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                C126027d dVar = new C126027d(i2, cVar.f347244a, cVar.f347245b, cVar.f347246c, cVar.f347247d);
                if (fVar == null) {
                    throw new NullPointerException("Null appActionsContext");
                } else if (cyVar2 != null) {
                    return new C126029e(f, dVar, fVar, cyVar, g, q, z2);
                } else {
                    throw new NullPointerException("Null keyboardUiState");
                }
            } else {
                throw new NullPointerException("Null packageName");
            }
        } else {
            throw new NullPointerException("Null locale");
        }
    }
}
