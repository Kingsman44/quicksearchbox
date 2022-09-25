package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9536b.C127131b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.common.base.C58852bp;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.b */
/* compiled from: PG */
public final /* synthetic */ class C127129b implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C127172f f350039a;

    /* renamed from: b */
    public final /* synthetic */ C129566ah f350040b;

    public /* synthetic */ C127129b(C127172f fVar, C129566ah ahVar) {
        this.f350039a = fVar;
        this.f350040b = ahVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        C34822b bVar;
        C127172f fVar = this.f350039a;
        C129566ah ahVar = this.f350040b;
        C126988i iVar = (C126988i) obj;
        if (!iVar.equals(C126988i.f349669h)) {
            C59052c cVar = (C59052c) ((C59052c) C127172f.f350111f.mo56226d()).mo56372aa(37397);
            C126985f a = C126985f.m207727a(iVar.f349676f);
            if (a == null) {
                a = C126985f.ERROR_UNKNOWN;
            }
            String name = a.name();
            if (iVar.f349672b == 2) {
                bVar = (C34822b) iVar.f349673c;
            } else {
                bVar = C34822b.f92358d;
            }
            C34834b bVar2 = bVar.f92362c;
            if (bVar2 == null) {
                bVar2 = C34834b.f92401c;
            }
            cVar.mo56354G("Triggering error navigation, error: %s %s", name, C34819a.m63579b(bVar2).mo39522e());
            C127131b.m207924a(iVar, ahVar, fVar.f350112g, fVar.f350113h);
        }
    }
}
