package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.support.p031v4.media.MediaBrowserCompat;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ad */
/* compiled from: PG */
public final /* synthetic */ class C18804ad implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C18820at f52946a;

    public /* synthetic */ C18804ad(C18820at atVar) {
        this.f52946a = atVar;
    }

    public final void accept(Object obj) {
        C18820at atVar = this.f52946a;
        MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) obj;
        atVar.f52982k.ifPresent(C18910y.f53197a);
        if (!atVar.mo24169e(atVar.f52973b.getPackageName())) {
            mediaBrowserCompat.mo801e();
            ((C59052c) ((C59052c) C18820at.f52972a.mo56224b()).mo56372aa(47416)).mo56389s("#cleanUpMediaBrowserCompatConnections() %s disconnected.", atVar.f52973b);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
