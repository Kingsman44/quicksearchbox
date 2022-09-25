package com.google.android.apps.search.assistant.verticals.p10036c;

import android.content.LocusId;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataRemovalRequest;
import android.view.contentcapture.DataShareRequest;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.c.e */
/* compiled from: PG */
public final /* synthetic */ class C131939e implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C131943i f360248a;

    public /* synthetic */ C131939e(C131943i iVar) {
        this.f360248a = iVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C131943i iVar = this.f360248a;
        C131941g gVar = iVar.f360255d;
        DataRemovalRequest build = new DataRemovalRequest.Builder().addLocusId(new LocusId("assistant_launcher_deeplinks"), 0).build();
        ContentCaptureManager contentCaptureManager = ((C131942h) gVar).f360251a;
        if (contentCaptureManager != null) {
            contentCaptureManager.removeData(build);
        }
        C131941g gVar2 = iVar.f360255d;
        Executor executor = iVar.f360254c;
        C131940f fVar = new C131940f(iVar, cVar);
        ContentCaptureManager contentCaptureManager2 = ((C131942h) gVar2).f360251a;
        if (contentCaptureManager2 == null) {
            return "DeeplinkSynclet.writeToAiAi";
        }
        contentCaptureManager2.shareData(new DataShareRequest(new LocusId("assistant_launcher_deeplinks"), "application/x-binary"), executor, fVar);
        return "DeeplinkSynclet.writeToAiAi";
    }
}
