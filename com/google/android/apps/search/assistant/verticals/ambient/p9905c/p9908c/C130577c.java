package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c;

import android.content.LocusId;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.c.c */
/* compiled from: PG */
public final /* synthetic */ class C130577c implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C130582h f357644a;

    /* renamed from: b */
    public final /* synthetic */ ContentCaptureManager f357645b;

    /* renamed from: c */
    public final /* synthetic */ String f357646c;

    /* renamed from: d */
    public final /* synthetic */ MessageLite f357647d;

    /* renamed from: e */
    public final /* synthetic */ Consumer f357648e;

    public /* synthetic */ C130577c(C130582h hVar, ContentCaptureManager contentCaptureManager, String str, MessageLite messageLite, Consumer consumer) {
        this.f357644a = hVar;
        this.f357645b = contentCaptureManager;
        this.f357646c = str;
        this.f357647d = messageLite;
        this.f357648e = consumer;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C130582h hVar = this.f357644a;
        ContentCaptureManager contentCaptureManager = this.f357645b;
        String str = this.f357646c;
        contentCaptureManager.shareData(new DataShareRequest(new LocusId(str), "application/x-binary"), hVar.f357665b, new C130581g(hVar, this.f357647d, str, this.f357648e, cVar));
        return "Smartspace-AiAi async card data share";
    }
}
