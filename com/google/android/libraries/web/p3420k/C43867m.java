package com.google.android.libraries.web.p3420k;

import android.os.Bundle;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.browser.internal.C43308t;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.p3353c.C43366k;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.k.m */
/* compiled from: PG */
final class C43867m extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Bundle f114313a;

    /* renamed from: b */
    final /* synthetic */ C43870p f114314b;

    /* renamed from: c */
    final /* synthetic */ boolean f114315c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43867m(Bundle bundle, C43870p pVar, boolean z) {
        super(0);
        this.f114313a = bundle;
        this.f114314b = pVar;
        this.f114315c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        String string = this.f114313a.getString("restored_initial_url");
        if (string != null) {
            C43308t a = C43309u.m76408a(this.f114314b.f114326h.mo46855b());
            C43257h k = C43257h.m76306m(string).mo46365k();
            C69664n.m101060f(k, "create(restoredInitialUrl)");
            a.mo46405d(k, C43366k.RESTORATION);
        } else if (this.f114315c && !this.f114314b.f114328j) {
            throw new IllegalStateException("You must load the initial URL asynchronously at your top-level fragment's onCreate method if WebController.hasFailedAsyncInitialUrlLoad() is true.");
        }
        return C69788q.f186170a;
    }
}
