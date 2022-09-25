package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.apps.gsa.p6486s.C84262b;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.as */
/* compiled from: PG */
public final /* synthetic */ class C115132as implements C115156ba {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f319541a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f319542b;

    public /* synthetic */ C115132as(C115157bb bbVar, SettableFuture settableFuture) {
        this.f319541a = bbVar;
        this.f319542b = settableFuture;
    }

    /* renamed from: a */
    public final void mo101845a(C115493i iVar) {
        C115157bb bbVar = this.f319541a;
        SettableFuture settableFuture = this.f319542b;
        String l = bbVar.mo101860l();
        if (l != null) {
            if (!iVar.f320353d.mo56113h()) {
                iVar.f320353d = C58833ax.m90834k(iVar.f320350a.f1045b);
            }
            MediaSessionCompat.Token token = (MediaSessionCompat.Token) iVar.f320353d.mo56107c();
            if (token != null) {
                settableFuture.mo57356n(new C84262b(l, token, ((C115169f) bbVar.f319601l.f319612c.instance).f319629c));
                return;
            }
            throw new NullPointerException("Null mediaSessionToken");
        }
        throw new NullPointerException("Null mediaSessionType");
    }
}
