package com.google.android.apps.search.faceviewer.web;

import com.google.android.libraries.p579ar.faceviewer.p587b.C10645j;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.common.p4526f.C59052c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.faceviewer.web.b */
/* compiled from: PG */
public final /* synthetic */ class C132694b implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ WebXFaceViewerWebImplementation f362100a;

    public /* synthetic */ C132694b(WebXFaceViewerWebImplementation webXFaceViewerWebImplementation) {
        this.f362100a = webXFaceViewerWebImplementation;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        WebXFaceViewerWebImplementation webXFaceViewerWebImplementation = this.f362100a;
        C10645j jVar = webXFaceViewerWebImplementation.f362095c;
        webXFaceViewerWebImplementation.f362096d = oVar;
        if (jVar == null) {
            ((C59052c) ((C59052c) WebXFaceViewerWebImplementation.f362093a.mo56225c()).mo56372aa(39795)).mo56386p("Received Message without Handler.");
            return;
        }
        try {
            jVar.mo18663a(jSONObject.getString("cmd"));
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) WebXFaceViewerWebImplementation.f362093a.mo56225c()).mo56382g(e)).mo56372aa(39794)).mo56386p("Error parsing message from web.");
        }
    }
}
