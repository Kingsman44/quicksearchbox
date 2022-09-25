package com.google.android.apps.search.faceviewer.web;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10645j;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10646k;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import com.google.android.libraries.web.webview.p3485h.C44412a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58844bh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public final class WebXFaceViewerWebImplementation implements C10646k, C2376g {

    /* renamed from: a */
    public static final C59071e f362093a = C59071e.m91332i("com.google.android.apps.search.faceviewer.web.WebXFaceViewerWebImplementation");

    /* renamed from: b */
    public final boolean f362094b = C44412a.m78441b();

    /* renamed from: c */
    public C10645j f362095c;

    /* renamed from: d */
    public C43968o f362096d;

    /* renamed from: e */
    private final C43262m f362097e;

    /* renamed from: f */
    private final C43952c f362098f;

    /* renamed from: g */
    private final C47770dh f362099g;

    public WebXFaceViewerWebImplementation(C43262m mVar, C47770dh dhVar, C43960g gVar, C44412a aVar) {
        this.f362097e = mVar;
        this.f362098f = gVar.mo46957a(FaceViewerPostMessageConfig.f362092a);
        this.f362099g = dhVar;
    }

    /* renamed from: g */
    public final void mo18671g() {
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        ((PostMessageMixinImpl) this.f362098f).mo46952c(R.id.faceviewer_web_post_message_id, C58844bh.ALWAYS_TRUE, new C132694b(this), false, (JSONObject) null);
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: h */
    public final void mo18672h(String str) {
        if (this.f362094b) {
            C47538ax c = this.f362099g.mo51613c("WebXWebLayerInterface#webLayerLoadUrl");
            try {
                this.f362097e.mo46334c(str);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* renamed from: i */
    public final void mo18673i(String str) {
        if (this.f362094b) {
            try {
                C43968o oVar = this.f362096d;
                if (oVar == null) {
                    ((C59052c) ((C59052c) f362093a.mo56225c()).mo56372aa(39797)).mo56386p("Received Message before sender available. Dropping.");
                } else {
                    C46459k.m82829b(oVar.mo46960a(new JSONObject().put("cmd", str).toString()), "Error sending message to Web", new Object[0]);
                }
            } catch (JSONException e) {
                ((C59052c) ((C59052c) ((C59052c) f362093a.mo56225c()).mo56382g(e)).mo56372aa(39796)).mo56386p("Error creating message to web.");
            }
        }
    }

    /* renamed from: j */
    public final void mo18674j(C10645j jVar) {
        this.f362095c = jVar;
    }
}
