package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.aq */
/* compiled from: PG */
final class C18817aq extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C0320v f52964d;

    /* renamed from: e */
    final /* synthetic */ C18819as f52965e;

    public C18817aq(C18819as asVar, C0320v vVar) {
        this.f52965e = asVar;
        this.f52964d = vVar;
    }

    /* renamed from: i */
    public final void mo1010i() {
        ((C59052c) ((C59052c) C18820at.f52972a.mo56224b()).mo56372aa(47394)).mo56389s("#onSessionDestroyed() %s", this.f52965e.f52969e.f52973b);
        try {
            this.f52964d.mo1041i(this);
            this.f52965e.f52969e.f52980i = Optional.empty();
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C18820at.f52972a.mo56226d()).mo56382g(e)).mo56372aa(47395)).mo56389s("#onSessionDestroyed() %s", this.f52965e.f52969e.f52973b);
        }
        if (this.f52965e.f52969e.f52983l.isPresent()) {
            this.f52965e.f52969e.mo24173i(14, "Media session destroyed.");
        }
        this.f52965e.f52969e.mo24167c(true);
    }
}
