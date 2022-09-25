package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.C127810c;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.C127815h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9819c.C129460g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.g */
/* compiled from: PG */
public final class C129483g extends C69665o implements C69630p {

    /* renamed from: a */
    public static final C129483g f355492a = new C129483g();

    public C129483g() {
        super(2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        Object obj3;
        AccountId accountId = (AccountId) obj;
        C129460g gVar = (C129460g) obj2;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(gVar, "entryFeature");
        C62940bt r0 = C62942bv.checkIsLite(C127810c.f351780d);
        gVar.mo58887l(r0);
        Object l = gVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj3 = r0.f169969b;
        } else {
            obj3 = r0.mo58889c(l);
        }
        C69664n.m101060f(obj3, "entryFeature.getExtensio…SayingData.trySayingData)");
        C127815h hVar = new C127815h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        C47243l.m84039a(hVar, (C127810c) obj3);
        return hVar;
    }
}
