package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14533mt;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.m */
/* compiled from: PG */
public final /* synthetic */ class C109599m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109578ae f305226a;

    public /* synthetic */ C109599m(C109578ae aeVar) {
        this.f305226a = aeVar;
    }

    public final void run() {
        C109578ae aeVar = this.f305226a;
        aeVar.mo97899l(C14533mt.CANCEL_ACTIVITY_STOP);
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = aeVar.f305180p;
        if (aaVar2 != null) {
            C87682aj ajVar = aeVar.f305179o;
            ajVar.getClass();
            aaVar2.mo81941m(ajVar, C88244um.CONVERSATION_SURFACE_EVENT, C88244um.CONVERSATION_PARAMS_RECEIVED, C88244um.MORRIS_HOTWORD, C88244um.NO_SPEECH_DETECTED, C88244um.NOTIFICATIONS_FROM_ALTERNATIVE_SOURCE_REQUESTED, C88244um.NOTIFY_ASSISTANT_CONVERSATION_ONGOING, C88244um.NOTIFY_COMPLETED_ASSISTANT_CONVERSATION, C88244um.NOTIFY_COMPLETED_CONVERSATION, C88244um.NOTIFY_STARTED_ASSISTANT_CONVERSATION, C88244um.NOTIFY_STARTED_CONVERSATION, C88244um.OPA_CONVERSATION_CANCELLED, C88244um.SET_FINAL_RECOGNIZED_TEXT, C88244um.SHOW_RECOGNITION_STATE, C88244um.SHOW_VOICE_ACTIONS, C88244um.START_ACTIVITY, C88244um.TTS_PLAYBACK_DONE, C88244um.TTS_PLAYBACK_STARTED, C88244um.UPDATE_CONVERSATION_STATE, C88244um.UPDATE_RECOGNIZED_TEXT);
            if (aeVar.f305174j.mo79746e(C90025cd.f248159q)) {
                C87673aa aaVar3 = aeVar.f305180p;
                aaVar3.getClass();
                C87682aj ajVar2 = aeVar.f305179o;
                ajVar2.getClass();
                aaVar3.mo81941m(ajVar2, C88244um.MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_DONE, C88244um.MULTI_MEDIA_MESSAGE_NOTIFICATION_PLAYBACK_STARTED);
            }
            if (aeVar.f305174j.mo79746e(C90051dc.f248818aZ)) {
                C87673aa aaVar4 = aeVar.f305180p;
                aaVar4.getClass();
                C87682aj ajVar3 = aeVar.f305179o;
                ajVar3.getClass();
                aaVar4.mo81941m(ajVar3, C88244um.ASSISTANT_REQUEST_ID);
            }
            C87673aa aaVar5 = aeVar.f305180p;
            aaVar5.getClass();
            aaVar5.mo81933e();
            aeVar.f305180p = null;
            aeVar.f305179o = null;
            aeVar.f305175k.mo21410a(C37182a.f97882cH.mo40805c(C62722b.CANCELLED));
        }
    }
}
