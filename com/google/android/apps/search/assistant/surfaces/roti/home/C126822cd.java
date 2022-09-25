package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119898q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cd */
/* compiled from: PG */
final class C126822cd implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126824cf f349258a;

    public C126822cd(C126824cf cfVar) {
        this.f349258a = cfVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126824cf.f349260a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37194)).mo56386p("Assistant state loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C119903v vVar;
        C119903v vVar2;
        C119899r rVar;
        C119904w wVar = (C119904w) obj;
        C59104x b = C126824cf.f349260a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
        ((C59052c) ((C59052c) b).mo56372aa(37195)).mo56389s("onAssistantStateUpdate: %s", wVar);
        C126824cf cfVar = this.f349258a;
        int i = wVar.f333911a;
        int b2 = C119900s.m198775b(i);
        int i2 = b2 - 1;
        if (b2 == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 == 1) {
                if (i == 2) {
                    vVar = (C119903v) wVar.f333912b;
                } else {
                    vVar = C119903v.f333904d;
                }
                int a = C119902u.m198776a(vVar.f333906a);
                int i3 = a - 1;
                if (a == 0) {
                    throw null;
                } else if (i3 == 0) {
                    if (wVar.f333911a == 2) {
                        vVar2 = (C119903v) wVar.f333912b;
                    } else {
                        vVar2 = C119903v.f333904d;
                    }
                    if (vVar2.f333906a == 1) {
                        rVar = (C119899r) vVar2.f333907b;
                    } else {
                        rVar = C119899r.f333900c;
                    }
                    int a2 = C119898q.m198773a(rVar.f333902a);
                    int i4 = a2 - 1;
                    if (a2 != 0) {
                        if (i4 != 0) {
                            if (i4 == 1 || i4 == 2) {
                                if (!((DrawSoundLevelsView) cfVar.f349263d.requireView().findViewById(R.id.assistant_roti_sound_levels)).isEnabled()) {
                                    cfVar.f349270k.f349082a.mo107751a(R.raw.open);
                                    C126833cm cmVar = cfVar.f349277r;
                                    cmVar.getClass();
                                    cmVar.f349290a.setVisibility(4);
                                    cmVar.f349291b.setImageDrawable(cmVar.f349294e);
                                    cmVar.f349292c.setBackgroundResource(R.drawable.assistant_roti_intent_api_recording_mic_background);
                                    cmVar.f349296g.setEnabled(true);
                                    C126833cm cmVar2 = cfVar.f349277r;
                                    cmVar2.getClass();
                                    cmVar2.mo107825a(new C47591co(cfVar.f349269j, "Clicked 'mic image' to stop listening", new C126819ca(cfVar)), cfVar.f349267h.getString(R.string.assistant_roti_intent_api_tap_to_stop_listening));
                                    return;
                                }
                                return;
                            } else if (i4 != 3) {
                                throw new AssertionError();
                            }
                        }
                        C126833cm cmVar3 = cfVar.f349277r;
                        cmVar3.getClass();
                        cmVar3.mo107826b();
                        return;
                    }
                    throw null;
                } else if (i3 == 1) {
                } else {
                    if (i3 == 2) {
                        if (cfVar.f349278s) {
                            cfVar.f349266g.mo19974a(C37176a.f96810H);
                        }
                        C126833cm cmVar4 = cfVar.f349277r;
                        cmVar4.getClass();
                        cmVar4.f349290a.setVisibility(0);
                        cmVar4.f349291b.setImageDrawable(cmVar4.f349293d);
                        cmVar4.f349292c.setBackgroundResource(R.drawable.assistant_roti_intent_api_initializing_mic_ring);
                        cmVar4.f349296g.setEnabled(false);
                    } else if (i3 == 3) {
                        C126833cm cmVar5 = cfVar.f349277r;
                        cmVar5.getClass();
                        cmVar5.mo107826b();
                    } else {
                        throw new AssertionError();
                    }
                }
            } else if (i2 == 2) {
                C126833cm cmVar6 = cfVar.f349277r;
                cmVar6.getClass();
                cmVar6.mo107826b();
            } else {
                throw new AssertionError();
            }
        } else if (cfVar.f349281v == 1) {
            C126833cm cmVar7 = cfVar.f349277r;
            cmVar7.getClass();
            cmVar7.mo107826b();
        }
    }
}
