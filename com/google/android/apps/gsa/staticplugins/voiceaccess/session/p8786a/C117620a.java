package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8787b.C117625a;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8787b.C117626b;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8790e.C117674e;
import com.google.android.libraries.accessibility.voiceaccess.api.C147344b;
import com.google.android.libraries.accessibility.voiceaccess.api.VoiceAccessServiceEventData;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147339e;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147341g;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147343i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.a.a */
/* compiled from: PG */
public final class C117620a extends C147344b {

    /* renamed from: a */
    private static final C59071e f326501a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.voiceaccess.session.a.a");

    /* renamed from: b */
    private final C117626b f326502b;

    public C117620a(C117626b bVar) {
        this.f326502b = bVar;
    }

    /* renamed from: a */
    public final void mo103409a(VoiceAccessServiceEventData voiceAccessServiceEventData) {
        C117625a aVar;
        if (voiceAccessServiceEventData == null) {
            ((C59052c) ((C59052c) f326501a.mo56226d()).mo56372aa(33585)).mo56386p("Received null event data from Voice Access.");
            int i = C90755l.f253831a;
            return;
        }
        C147339e eVar = voiceAccessServiceEventData.f397725a;
        if (eVar == null) {
            ((C59052c) ((C59052c) f326501a.mo56226d()).mo56372aa(33584)).mo56386p("Event data sent from Voice Access returned a null proto.");
            int i2 = C90755l.f253831a;
            return;
        }
        C117626b bVar = this.f326502b;
        if (bVar.f326513b != null) {
            C147341g a = C147341g.m240256a(eVar.f397736a);
            if (a == null) {
                a = C147341g.SPEECH_PROCESSING_COMPLETE;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                int a2 = C147343i.m240258a(eVar.f397737b);
                if (a2 != 0) {
                    if (a2 == 2 || a2 == 3) {
                        C117625a aVar2 = bVar.f326513b;
                        if (aVar2 != null) {
                            aVar2.mo103417a(true);
                        }
                    } else if (a2 == 4 && (aVar = bVar.f326513b) != null) {
                        aVar.mo103417a(false);
                    }
                }
            } else if (ordinal != 1) {
                C59104x d = C117626b.f326512a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "VoiceAccessEventRec");
                ((C59052c) ((C59052c) d).mo56372aa(33596)).mo56389s("Unknown data type: %s", a);
            } else {
                C117625a aVar3 = bVar.f326513b;
                if (aVar3 != null) {
                    ((C117674e) aVar3).mo103427d();
                }
            }
        } else {
            C59104x d2 = C117626b.f326512a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "VoiceAccessEventRec");
            ((C59052c) ((C59052c) d2).mo56372aa(33597)).mo56389s("An event was received, but the VoiceAccessEventHandler is null! Event proto:%s", eVar);
            int i3 = C90755l.f253831a;
        }
    }
}
