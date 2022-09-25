package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.a */
/* compiled from: PG */
public final /* synthetic */ class C125182a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125255k f345330a;

    /* renamed from: b */
    public final /* synthetic */ C125258n f345331b;

    public /* synthetic */ C125182a(C125255k kVar, C125258n nVar) {
        this.f345330a = kVar;
        this.f345331b = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C125255k kVar = this.f345330a;
        C125258n nVar = this.f345331b;
        C46423aj ajVar = (C46423aj) kVar.f345541l.get(nVar);
        if (ajVar == null) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36432)).mo56389s("AiAi availability for '%s' not in cache yet. [SD]", nVar);
            return kVar.mo106879a(nVar);
        } else if (!ajVar.f121487d.isDone()) {
            ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36431)).mo56389s("AiAi availability check for '%s' is already running. Only rerun if that run fails. [SD]", nVar);
            return kVar.mo106880b(ajVar.mo50395b());
        } else {
            try {
                C125072b bVar = (C125072b) C60856cj.m92909r(ajVar.mo50395b());
                if (bVar.equals(C125072b.AIAI_AVAILABLE)) {
                    return C60856cj.m92900i(bVar);
                }
                ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36428)).mo56354G("Previous AiAi availability check for '%s' resulted in %s. Trying again. [SD]", nVar, C126290c.m206496a(bVar));
                return kVar.mo106879a(nVar);
            } catch (ExecutionException unused) {
                ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36430)).mo56389s("Previous AiAi availability check for '%s' failed or was cancelled. Trying again. [SD]", nVar);
                return kVar.mo106879a(nVar);
            }
        }
    }
}
