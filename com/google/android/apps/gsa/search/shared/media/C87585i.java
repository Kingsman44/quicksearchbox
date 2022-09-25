package com.google.android.apps.gsa.search.shared.media;

import android.media.session.MediaController;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.shared.media.i */
/* compiled from: PG */
public final /* synthetic */ class C87585i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87594r f236630a;

    /* renamed from: b */
    public final /* synthetic */ MediaController f236631b;

    public /* synthetic */ C87585i(C87594r rVar, MediaController mediaController) {
        this.f236630a = rVar;
        this.f236631b = mediaController;
    }

    public final void run() {
        C87594r rVar = this.f236630a;
        rVar.mo81730j(new C0320v(rVar.f236649b, MediaSessionCompat.Token.fromToken(this.f236631b.getSessionToken())));
    }
}
