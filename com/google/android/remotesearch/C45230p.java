package com.google.android.remotesearch;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88354yo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.search.shared.service.p6935b.aab;
import com.google.android.apps.gsa.search.shared.service.p6935b.aad;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.Hypothesis;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;

/* renamed from: com.google.android.remotesearch.p */
/* compiled from: PG */
final class C45230p extends C88499t {

    /* renamed from: a */
    final /* synthetic */ RemoteSearchService f118025a;

    public C45230p(RemoteSearchService remoteSearchService) {
        this.f118025a = remoteSearchService;
    }

    /* renamed from: f */
    public final void mo17567f(ParcelableVoiceAction parcelableVoiceAction) {
        C59071e eVar = RemoteSearchService.f117989a;
        SearchError searchError = (SearchError) parcelableVoiceAction.f236008a;
        if (searchError != null) {
            try {
                C45216b bVar = this.f118025a.f118006r;
                if (bVar != null) {
                    bVar.mo49070f(searchError.f236024h);
                } else {
                    ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54321)).mo56386p("showError: RemoteCallback is null.");
                }
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54322)).mo56386p("RemoteException: ");
            }
        }
    }

    /* renamed from: fO */
    public final void mo49088fO(Intent intent) {
        C59071e eVar = RemoteSearchService.f117989a;
        this.f118025a.f117996h.mo65089a(intent);
    }

    /* renamed from: h */
    public final void mo17569h(Query query, List list, CardDecision cardDecision, int i) {
    }

    /* renamed from: i */
    public final void mo17570i(String str, String str2, String str3) {
        C59071e eVar = RemoteSearchService.f117989a;
        try {
            C45216b bVar = this.f118025a.f118006r;
            if (bVar != null) {
                Parcel gA = bVar.mo17260gA();
                gA.writeString(str);
                gA.writeString(str2);
                bVar.mo17263hf(1, gA);
                return;
            }
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54331)).mo56386p("updateRecognizedText: RemoteCallback is null.");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54332)).mo56386p("RemoteException: ");
        }
    }

    /* renamed from: iJ */
    public final void mo17571iJ(ServiceEventData serviceEventData) {
        if (this.f118025a.f118006r != null) {
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            try {
                if (a == C88244um.NOTIFY_COMPLETED_CONVERSATION) {
                    RemoteSearchService remoteSearchService = this.f118025a;
                    C45216b bVar = remoteSearchService.f118006r;
                    if (bVar != null) {
                        remoteSearchService.f117998j = 0;
                        bVar.mo17263hf(9, bVar.mo17260gA());
                    }
                } else if (a == C88244um.TTS_RESULT_EVENT) {
                    if (this.f118025a.f118006r != null) {
                        C62940bt btVar = C88354yo.f238943a;
                        C88246uo uoVar = serviceEventData.f236959a;
                        C62940bt r0 = C62942bv.checkIsLite(btVar);
                        uoVar.mo58887l(r0);
                        if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
                            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56225c()).mo56372aa(54313)).mo56386p("getAudioResultUris - Missing audio result data.");
                            return;
                        }
                        C88356yq yqVar = (C88356yq) serviceEventData.mo81918e(C88354yo.f238943a);
                        if ((yqVar.f238946a & 1) != 0) {
                            this.f118025a.f118006r.mo49071g(new Uri.Builder().path(yqVar.f238947b).build());
                        } else if (yqVar.f238948c.size() > 0) {
                            for (String query : yqVar.f238948c) {
                                this.f118025a.f118006r.mo49071g(new Uri.Builder().query(query).build());
                            }
                        } else {
                            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56225c()).mo56372aa(54309)).mo56386p("getAudioResultUris - Missing tts.");
                        }
                    }
                } else if (a == C88244um.UPDATE_VOICE_ACTION_UI && this.f118025a.f118006r != null && ((aad) serviceEventData.mo81918e(aab.f237058a)).f237064d) {
                    mo49090r();
                }
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54300)).mo56386p("RemoteException: ");
            }
        } else {
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54304)).mo56386p("handleGenericEvent: RemoteCallback is null.");
        }
    }

    /* renamed from: iL */
    public final void mo17573iL(String str, String str2) {
        C59071e eVar = RemoteSearchService.f117989a;
        try {
            C45216b bVar = this.f118025a.f118006r;
            if (bVar != null) {
                Parcel gA = bVar.mo17260gA();
                gA.writeString(str);
                bVar.mo17263hf(2, gA);
                return;
            }
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54315)).mo56386p("setFinalRecognizedText: RemoteCallback is null.");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54316)).mo56386p("RemoteException: ");
        }
    }

    /* renamed from: m */
    public final void mo49089m(byte[] bArr) {
        C59071e eVar = RemoteSearchService.f117989a;
        try {
            C45216b bVar = this.f118025a.f118006r;
            if (bVar != null) {
                Parcel gA = bVar.mo17260gA();
                gA.writeByteArray(bArr);
                bVar.mo17263hf(3, gA);
                return;
            }
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54318)).mo56386p("showClockworkResult: RemoteCallback is null.");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54319)).mo56386p("RemoteException: ");
        }
    }

    /* renamed from: r */
    public final void mo49090r() {
        C59071e eVar = RemoteSearchService.f117989a;
        VoiceAction voiceAction = this.f118025a.f118005q;
        if (voiceAction != null) {
            try {
                if (voiceAction.mo81084w()) {
                    C45216b bVar = this.f118025a.f118006r;
                    if (bVar != null) {
                        bVar.mo49069e(1);
                    } else {
                        ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54329)).mo56386p("updateActionUI: RemoteCallback is null.");
                    }
                    this.f118025a.f118005q = null;
                } else if (this.f118025a.f118005q.mo81053C()) {
                    C45216b bVar2 = this.f118025a.f118006r;
                    if (bVar2 != null) {
                        bVar2.mo49069e(2);
                    } else {
                        ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54328)).mo56386p("updateActionUI: RemoteCallback is null.");
                    }
                    this.f118025a.f118005q = null;
                } else if (this.f118025a.f118005q.mo81087y()) {
                    C45216b bVar3 = this.f118025a.f118006r;
                    if (bVar3 != null) {
                        bVar3.mo49069e(3);
                    } else {
                        ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54326)).mo56386p("updateActionUI: RemoteCallback is null.");
                    }
                    this.f118025a.f118005q = null;
                }
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54327)).mo56386p("RemoteException: ");
            }
        }
    }

    /* renamed from: s */
    public final void mo49091s(List list, String str, String str2) {
        C59071e eVar = RemoteSearchService.f117989a;
        String[] strArr = new String[list.size()];
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((Hypothesis) list.get(i)).f253055a;
            fArr[i] = ((Hypothesis) list.get(i)).f253056b;
        }
        try {
            C45216b bVar = this.f118025a.f118006r;
            if (bVar != null) {
                Parcel gA = bVar.mo17260gA();
                gA.writeStringArray(strArr);
                gA.writeFloatArray(fArr);
                bVar.mo17263hf(6, gA);
                return;
            }
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54306)).mo56386p("onTranscriptionUpdate: RemoteCallback is null.");
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54307)).mo56386p("RemoteException: ");
        }
    }
}
