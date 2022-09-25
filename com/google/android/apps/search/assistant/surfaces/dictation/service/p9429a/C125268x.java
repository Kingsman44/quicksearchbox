package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C71816z;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.x */
/* compiled from: PG */
final class C125268x implements RecognitionSupportCallback {

    /* renamed from: a */
    private final C71816z f345583a;

    public C125268x(C71816z zVar) {
        C69664n.m101061g(zVar, "completableDeferred");
        this.f345583a = zVar;
    }

    public final void onError(int i) {
        C125239cc ccVar;
        C59052c cVar = (C59052c) C125185ac.f345338a.mo56226d();
        cVar.mo56379ah(new C59094n(36446));
        cVar.mo56387q("RecognitionSupportCallback.onError: %d [SD]", i);
        C71816z zVar = this.f345583a;
        if (i == 11) {
            C125238cb cbVar = C125238cb.DISCONNECTED;
            C69498ao aoVar = C69498ao.f185920a;
            ccVar = new C125239cc(cbVar, aoVar, aoVar, aoVar);
        } else {
            C125238cb cbVar2 = C125238cb.UNKNOWN_ERROR;
            C69498ao aoVar2 = C69498ao.f185920a;
            ccVar = new C125239cc(cbVar2, aoVar2, aoVar2, aoVar2);
        }
        zVar.mo62909P(ccVar);
    }

    public final void onSupportResult(RecognitionSupport recognitionSupport) {
        C69664n.m101061g(recognitionSupport, "recognitionSupport");
        C59052c cVar = (C59052c) C125185ac.f345338a.mo56224b();
        cVar.mo56379ah(new C59094n(36447));
        cVar.mo56386p("RecognitionSupportCallback.onSupportResult [SD]");
        C71816z zVar = this.f345583a;
        C59052c cVar2 = (C59052c) C125185ac.f345338a.mo56224b();
        List installedOnDeviceLanguages = recognitionSupport.getInstalledOnDeviceLanguages();
        C69664n.m101060f(installedOnDeviceLanguages, "recognitionSupport.installedOnDeviceLanguages");
        String ag = C69540x.m100851ag(installedOnDeviceLanguages, ", ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
        cVar2.mo56379ah(new C59094n(36443));
        cVar2.mo56389s("AiAi installed languages: %s [SD]", ag);
        C59052c cVar3 = (C59052c) C125185ac.f345338a.mo56224b();
        List pendingOnDeviceLanguages = recognitionSupport.getPendingOnDeviceLanguages();
        C69664n.m101060f(pendingOnDeviceLanguages, "recognitionSupport.pendingOnDeviceLanguages");
        String ag2 = C69540x.m100851ag(pendingOnDeviceLanguages, ", ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
        cVar3.mo56379ah(new C59094n(36444));
        cVar3.mo56389s("AiAi pending languages: %s [SD]", ag2);
        C59052c cVar4 = (C59052c) C125185ac.f345338a.mo56224b();
        List supportedOnDeviceLanguages = recognitionSupport.getSupportedOnDeviceLanguages();
        C69664n.m101060f(supportedOnDeviceLanguages, "recognitionSupport.supportedOnDeviceLanguages");
        String ag3 = C69540x.m100851ag(supportedOnDeviceLanguages, ", ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62);
        cVar4.mo56379ah(new C59094n(36445));
        cVar4.mo56389s("AiAi supported languages: %s [SD]", ag3);
        C125238cb cbVar = C125238cb.AVAILABLE;
        List installedOnDeviceLanguages2 = recognitionSupport.getInstalledOnDeviceLanguages();
        C69664n.m101060f(installedOnDeviceLanguages2, "recognitionSupport.installedOnDeviceLanguages");
        Set ab = C69540x.m100846ab(installedOnDeviceLanguages2);
        List pendingOnDeviceLanguages2 = recognitionSupport.getPendingOnDeviceLanguages();
        C69664n.m101060f(pendingOnDeviceLanguages2, "recognitionSupport.pendingOnDeviceLanguages");
        Set ab2 = C69540x.m100846ab(pendingOnDeviceLanguages2);
        List supportedOnDeviceLanguages2 = recognitionSupport.getSupportedOnDeviceLanguages();
        C69664n.m101060f(supportedOnDeviceLanguages2, "recognitionSupport.supportedOnDeviceLanguages");
        zVar.mo62909P(new C125239cc(cbVar, ab, ab2, C69540x.m100846ab(supportedOnDeviceLanguages2)));
    }
}
