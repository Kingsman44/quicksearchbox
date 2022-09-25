package com.google.android.libraries.search.silk.web.download;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3220i.C41723a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4304i.C56712b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.download.e */
/* compiled from: PG */
public final /* synthetic */ class C40765e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkDownloadMessageHandler f106876a;

    /* renamed from: b */
    public final /* synthetic */ C41723a f106877b;

    public /* synthetic */ C40765e(SilkDownloadMessageHandler silkDownloadMessageHandler, C41723a aVar) {
        this.f106876a = silkDownloadMessageHandler;
        this.f106877b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkDownloadMessageHandler silkDownloadMessageHandler = this.f106876a;
        C41723a aVar = this.f106877b;
        C40769f fVar = silkDownloadMessageHandler.f106871d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40767g(aVar), oVar, jSONObject, "Download", "startImageDownload", C56712b.f151372b.getParserForType());
    }
}
