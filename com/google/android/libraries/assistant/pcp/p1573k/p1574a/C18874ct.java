package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ct */
/* compiled from: PG */
public final /* synthetic */ class C18874ct implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18874ct f53135a = new C18874ct();

    private /* synthetic */ C18874ct() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C0320v vVar = (C0320v) obj;
        String g = vVar.mo1039g();
        C59104x b = C18887df.f53161a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) b).mo56372aa(47503)).mo56389s("#onSuccess() MediaControllerCompat settable future success, packageName %s", g);
        if (vVar.mo1037e() == null) {
            C59104x d = C18887df.f53161a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
            ((C59052c) ((C59052c) d).mo56372aa(47505)).mo56389s("#onSuccess() TransportControls is null for %s, can not play.", g);
            return Optional.empty();
        }
        C59104x b2 = C18887df.f53161a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TNG.MediaHelper");
        ((C59052c) ((C59052c) b2).mo56372aa(47504)).mo56389s("#onSuccess() Ready to play item for media session: %s.", g);
        return Optional.m71637of(vVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
