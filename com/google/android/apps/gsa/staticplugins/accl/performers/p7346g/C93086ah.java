package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.search.shared.media.C87593q;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ah */
/* compiled from: PG */
public final /* synthetic */ class C93086ah implements C87593q {

    /* renamed from: a */
    public final /* synthetic */ C93094ap f259665a;

    /* renamed from: b */
    public final /* synthetic */ String f259666b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f259667c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f259668d;

    /* renamed from: e */
    public final /* synthetic */ boolean f259669e;

    public /* synthetic */ C93086ah(C93094ap apVar, String str, C0320v vVar, SettableFuture settableFuture, boolean z) {
        this.f259665a = apVar;
        this.f259666b = str;
        this.f259667c = vVar;
        this.f259668d = settableFuture;
        this.f259669e = z;
    }

    /* renamed from: a */
    public final void mo81721a(PlaybackStateCompat playbackStateCompat) {
        C93094ap apVar = this.f259665a;
        String str = this.f259666b;
        C0320v vVar = this.f259667c;
        SettableFuture settableFuture = this.f259668d;
        boolean z = this.f259669e;
        if (C93094ap.m153167q(playbackStateCompat)) {
            settableFuture.mo57356n(C93094ap.m153161d(apVar.mo87536h(C93094ap.m153162f(playbackStateCompat)), str.equals("media.PLAY_MEDIA") ? apVar.mo87534e(apVar.f259695e, vVar.mo1039g()) : null, (C52232kc) null, C93094ap.m153164l(vVar.mo1039g(), playbackStateCompat.f1000g)));
        } else if (playbackStateCompat.f994a == 3) {
            settableFuture.mo57356n(C93094ap.m153161d(apVar.mo87535g(), str.equals("media.PLAY_MEDIA") ? apVar.mo87534e(apVar.f259695e, vVar.mo1039g()) : null, apVar.mo87537j(vVar), (CharSequence) null));
            apVar.mo87539n();
            if (z) {
                apVar.mo87540o(vVar);
            }
        }
    }
}
