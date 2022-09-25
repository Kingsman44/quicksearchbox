package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119898q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33181f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33171a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33172b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33173c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33174d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33175e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.g */
/* compiled from: PG */
public final /* synthetic */ class C129131g implements C46852f {

    /* renamed from: a */
    public final /* synthetic */ C129132h f354739a;

    public /* synthetic */ C129131g(C129132h hVar) {
        this.f354739a = hVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        Fragment c;
        C33176f fVar;
        C119903v vVar;
        C119903v vVar2;
        C119903v vVar3;
        C119903v vVar4;
        C119899r rVar;
        C129132h hVar = this.f354739a;
        C119904w wVar = (C119904w) obj;
        int i = wVar.f333911a;
        if ((i == 1 || i == 2) && (c = hVar.f354741b.getChildFragmentManager().f634a.mo671c("FluidActionsFragment")) != null) {
            try {
                C33181f fVar2 = (C33181f) ((C47231d) c).mo17754z();
                C58976aa aaVar = C58975e.f156826a;
                C33171a aVar = (C33171a) C33176f.f88734c.createBuilder();
                int i2 = wVar.f333911a;
                if (i2 == 1) {
                    C62912at atVar = C62912at.f169862a;
                    aVar.copyOnWrite();
                    C33176f fVar3 = (C33176f) aVar.instance;
                    atVar.getClass();
                    fVar3.f88737b = atVar;
                    fVar3.f88736a = 1;
                    fVar = (C33176f) aVar.build();
                } else {
                    if (i2 == 2) {
                        vVar = (C119903v) wVar.f333912b;
                    } else {
                        vVar = C119903v.f333904d;
                    }
                    if (vVar.f333906a == 1) {
                        if (wVar.f333911a == 2) {
                            vVar4 = (C119903v) wVar.f333912b;
                        } else {
                            vVar4 = C119903v.f333904d;
                        }
                        if (vVar4.f333906a == 1) {
                            rVar = (C119899r) vVar4.f333907b;
                        } else {
                            rVar = C119899r.f333900c;
                        }
                        int a = C119898q.m198773a(rVar.f333902a);
                        int i3 = a - 1;
                        if (a == 0) {
                            throw null;
                        } else if (i3 == 0) {
                            C33174d dVar = (C33174d) C33175e.f88730c.createBuilder();
                            C33172b bVar = (C33172b) C33173c.f88726c.createBuilder();
                            C62912at atVar2 = C62912at.f169862a;
                            bVar.copyOnWrite();
                            C33173c cVar = (C33173c) bVar.instance;
                            atVar2.getClass();
                            cVar.f88729b = atVar2;
                            cVar.f88728a = 1;
                            dVar.copyOnWrite();
                            C33175e eVar = (C33175e) dVar.instance;
                            C33173c cVar2 = (C33173c) bVar.build();
                            cVar2.getClass();
                            eVar.f88733b = cVar2;
                            eVar.f88732a = 1;
                            aVar.copyOnWrite();
                            C33176f fVar4 = (C33176f) aVar.instance;
                            C33175e eVar2 = (C33175e) dVar.build();
                            eVar2.getClass();
                            fVar4.f88737b = eVar2;
                            fVar4.f88736a = 2;
                            fVar = (C33176f) aVar.build();
                        } else if (i3 == 1) {
                            C33174d dVar2 = (C33174d) C33175e.f88730c.createBuilder();
                            C33172b bVar2 = (C33172b) C33173c.f88726c.createBuilder();
                            C62912at atVar3 = C62912at.f169862a;
                            bVar2.copyOnWrite();
                            C33173c cVar3 = (C33173c) bVar2.instance;
                            atVar3.getClass();
                            cVar3.f88729b = atVar3;
                            cVar3.f88728a = 2;
                            dVar2.copyOnWrite();
                            C33175e eVar3 = (C33175e) dVar2.instance;
                            C33173c cVar4 = (C33173c) bVar2.build();
                            cVar4.getClass();
                            eVar3.f88733b = cVar4;
                            eVar3.f88732a = 1;
                            aVar.copyOnWrite();
                            C33176f fVar5 = (C33176f) aVar.instance;
                            C33175e eVar4 = (C33175e) dVar2.build();
                            eVar4.getClass();
                            fVar5.f88737b = eVar4;
                            fVar5.f88736a = 2;
                            fVar = (C33176f) aVar.build();
                        } else if (i3 != 2) {
                            fVar = (C33176f) aVar.build();
                        } else {
                            C33174d dVar3 = (C33174d) C33175e.f88730c.createBuilder();
                            C33172b bVar3 = (C33172b) C33173c.f88726c.createBuilder();
                            C62912at atVar4 = C62912at.f169862a;
                            bVar3.copyOnWrite();
                            C33173c cVar5 = (C33173c) bVar3.instance;
                            atVar4.getClass();
                            cVar5.f88729b = atVar4;
                            cVar5.f88728a = 3;
                            dVar3.copyOnWrite();
                            C33175e eVar5 = (C33175e) dVar3.instance;
                            C33173c cVar6 = (C33173c) bVar3.build();
                            cVar6.getClass();
                            eVar5.f88733b = cVar6;
                            eVar5.f88732a = 1;
                            aVar.copyOnWrite();
                            C33176f fVar6 = (C33176f) aVar.instance;
                            C33175e eVar6 = (C33175e) dVar3.build();
                            eVar6.getClass();
                            fVar6.f88737b = eVar6;
                            fVar6.f88736a = 2;
                            fVar = (C33176f) aVar.build();
                        }
                    } else {
                        int i4 = wVar.f333911a;
                        if (i4 == 2) {
                            vVar2 = (C119903v) wVar.f333912b;
                        } else {
                            vVar2 = C119903v.f333904d;
                        }
                        if (vVar2.f333906a == 4) {
                            C33174d dVar4 = (C33174d) C33175e.f88730c.createBuilder();
                            C62912at atVar5 = C62912at.f169862a;
                            dVar4.copyOnWrite();
                            C33175e eVar7 = (C33175e) dVar4.instance;
                            atVar5.getClass();
                            eVar7.f88733b = atVar5;
                            eVar7.f88732a = 4;
                            aVar.copyOnWrite();
                            C33176f fVar7 = (C33176f) aVar.instance;
                            C33175e eVar8 = (C33175e) dVar4.build();
                            eVar8.getClass();
                            fVar7.f88737b = eVar8;
                            fVar7.f88736a = 2;
                            fVar = (C33176f) aVar.build();
                        } else {
                            if (i4 == 2) {
                                vVar3 = (C119903v) wVar.f333912b;
                            } else {
                                vVar3 = C119903v.f333904d;
                            }
                            if (vVar3.f333906a == 2) {
                                C33174d dVar5 = (C33174d) C33175e.f88730c.createBuilder();
                                C62912at atVar6 = C62912at.f169862a;
                                dVar5.copyOnWrite();
                                C33175e eVar9 = (C33175e) dVar5.instance;
                                atVar6.getClass();
                                eVar9.f88733b = atVar6;
                                eVar9.f88732a = 2;
                                aVar.copyOnWrite();
                                C33176f fVar8 = (C33176f) aVar.instance;
                                C33175e eVar10 = (C33175e) dVar5.build();
                                eVar10.getClass();
                                fVar8.f88737b = eVar10;
                                fVar8.f88736a = 2;
                                fVar = (C33176f) aVar.build();
                            } else {
                                fVar = (C33176f) aVar.build();
                            }
                        }
                    }
                }
                fVar2.mo38575b(fVar);
            } catch (IllegalStateException e) {
                C59104x c2 = C129132h.f354740a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "FluidActionsContentFragment");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(38203)).mo56386p("Failed to update AssistantState due to FluidActions fragment not initialized");
            }
        }
    }
}
