package com.google.android.libraries.search.assistant.performer.p2757g.p2758a;

import android.content.Context;
import android.os.Handler;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.h */
/* compiled from: PG */
public final /* synthetic */ class C36025h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36028k f94238a;

    public /* synthetic */ C36025h(C36028k kVar) {
        this.f94238a = kVar;
    }

    public final void run() {
        C36028k kVar = this.f94238a;
        try {
            Context context = kVar.f94244e.f94247b;
            MediaBrowserCompat mediaBrowserCompat = kVar.f94243d;
            mediaBrowserCompat.getClass();
            C0320v vVar = new C0320v(context, mediaBrowserCompat.mo798b());
            vVar.mo1040h(new C36027j(kVar, vVar), (Handler) null);
            kVar.f94242c.mo5437b(Optional.m71637of(vVar));
        } catch (IllegalArgumentException | IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C36029l.f94246a.mo56225c()).mo56382g(e)).mo56372aa(52145)).mo56386p("Argument to create MediaControllerCompat is not valid.");
            kVar.f94242c.mo5437b(Optional.empty());
        }
    }
}
