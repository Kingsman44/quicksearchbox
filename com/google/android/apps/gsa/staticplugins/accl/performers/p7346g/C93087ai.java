package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.search.shared.media.C87593q;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ai */
/* compiled from: PG */
public final /* synthetic */ class C93087ai implements C87593q {

    /* renamed from: a */
    public final /* synthetic */ C93094ap f259670a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f259671b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f259672c;

    public /* synthetic */ C93087ai(C93094ap apVar, SettableFuture settableFuture, C0320v vVar) {
        this.f259670a = apVar;
        this.f259671b = settableFuture;
        this.f259672c = vVar;
    }

    /* renamed from: a */
    public final void mo81721a(PlaybackStateCompat playbackStateCompat) {
        C93094ap apVar = this.f259670a;
        SettableFuture settableFuture = this.f259671b;
        C0320v vVar = this.f259672c;
        if (C93094ap.m153167q(playbackStateCompat)) {
            settableFuture.mo57356n(C93094ap.m153161d(apVar.mo87536h(C93094ap.m153162f(playbackStateCompat)), (C52163ho) null, (C52232kc) null, C93094ap.m153164l(vVar.mo1039g(), playbackStateCompat.f1000g)));
        }
    }
}
