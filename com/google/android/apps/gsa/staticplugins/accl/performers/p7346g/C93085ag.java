package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.search.shared.media.C87593q;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ag */
/* compiled from: PG */
public final /* synthetic */ class C93085ag implements C87593q {

    /* renamed from: a */
    public final /* synthetic */ C93094ap f259662a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f259663b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f259664c;

    public /* synthetic */ C93085ag(C93094ap apVar, SettableFuture settableFuture, C0320v vVar) {
        this.f259662a = apVar;
        this.f259663b = settableFuture;
        this.f259664c = vVar;
    }

    /* renamed from: a */
    public final void mo81721a(PlaybackStateCompat playbackStateCompat) {
        C93094ap apVar = this.f259662a;
        SettableFuture settableFuture = this.f259663b;
        C0320v vVar = this.f259664c;
        if (C93094ap.m153167q(playbackStateCompat)) {
            settableFuture.mo57356n(C93094ap.m153161d(apVar.mo87536h(C93094ap.m153162f(playbackStateCompat)), (C52163ho) null, (C52232kc) null, C93094ap.m153164l(vVar.mo1039g(), playbackStateCompat.f1000g)));
        } else if (playbackStateCompat.f994a == 3) {
            vVar.mo1037e().mo1017b();
        }
    }
}
