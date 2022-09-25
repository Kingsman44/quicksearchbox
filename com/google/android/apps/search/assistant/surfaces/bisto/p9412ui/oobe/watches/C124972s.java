package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.s */
/* compiled from: PG */
public final /* synthetic */ class C124972s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124977x f344820a;

    /* renamed from: b */
    public final /* synthetic */ String f344821b;

    public /* synthetic */ C124972s(C124977x xVar, String str) {
        this.f344820a = xVar;
        this.f344821b = str;
    }

    public final C60870cx apply(Object obj) {
        C124977x xVar = this.f344820a;
        String str = this.f344821b;
        C124979z zVar = (C124979z) obj;
        if (zVar.f344852d) {
            C63138d dVar = zVar.f344851c;
            if (dVar == null) {
                dVar = C63138d.f170494j;
            }
            if (dVar.f170504i) {
                C60870cx f = xVar.f344841e.mo106600f(str, C124633az.OOBE_IN_PROGRESS);
                C124965l lVar = new C124965l(zVar);
                return C60922j.m93044g(f, C47810es.m84963c(lVar), C60826bg.f164896a);
            }
        }
        return C60856cj.m92900i(zVar);
    }
}
