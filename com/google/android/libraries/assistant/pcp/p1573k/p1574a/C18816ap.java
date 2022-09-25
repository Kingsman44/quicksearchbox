package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.support.p031v4.media.MediaBrowserCompat;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C18816ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18819as f52962a;

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserCompat f52963b;

    public /* synthetic */ C18816ap(C18819as asVar, MediaBrowserCompat mediaBrowserCompat) {
        this.f52962a = asVar;
        this.f52963b = mediaBrowserCompat;
    }

    public final void run() {
        C18819as asVar = this.f52962a;
        MediaBrowserCompat mediaBrowserCompat = this.f52963b;
        boolean booleanValue = ((Boolean) asVar.f52969e.f52982k.map(C18812al.f52957a).orElse(false)).booleanValue();
        boolean z = !asVar.f52969e.f52983l.isPresent();
        if (!booleanValue && !z) {
            ((C59052c) ((C59052c) C18820at.f52972a.mo56224b()).mo56372aa(47399)).mo56352E("#getMediaRootAndSubscribe() No playable media items timeout, reconnecting %s, connection number #%d", asVar.f52969e.f52973b, asVar.f52968d);
            asVar.f52969e.f52982k.ifPresent(C18813am.f52958a);
            asVar.mo24164d(mediaBrowserCompat, 0, false);
        }
    }
}
