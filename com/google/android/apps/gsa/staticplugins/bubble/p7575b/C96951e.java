package com.google.android.apps.gsa.staticplugins.bubble.p7575b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88403aa;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.staticplugins.bubble.p7590h.C97024b;
import com.google.android.libraries.search.p2998g.C38334a;
import com.google.android.libraries.search.p2998g.C38387c;
import com.google.android.libraries.search.p2998g.C38389e;
import com.google.android.libraries.search.p2998g.C38392h;
import com.google.android.libraries.search.p2998g.C38393i;
import com.google.android.libraries.search.p2998g.C38395k;
import com.google.android.libraries.search.p2998g.p2999a.C38365f;
import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p2998g.p2999a.C38380u;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40126e;
import com.google.android.libraries.search.rendering.xuikit.bubbles.activity.C40093a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.b.e */
/* compiled from: PG */
public final class C96951e implements C38393i {

    /* renamed from: a */
    private static final C59071e f270969a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.b.e");

    /* renamed from: b */
    private final C68214a f270970b;

    /* renamed from: c */
    private final Context f270971c;

    /* renamed from: d */
    private final C96947a f270972d;

    public C96951e(C68214a aVar, Context context, C96947a aVar2) {
        this.f270970b = aVar;
        this.f270971c = context;
        this.f270972d = aVar2;
    }

    /* renamed from: a */
    public final C38392h mo41409a(C38395k kVar) {
        C38380u uVar;
        Optional optional;
        Object obj;
        Object obj2;
        if (!((C84474e) this.f270970b.mo27525b()).mo78089ac()) {
            return C38334a.f101514a;
        }
        C38370k kVar2 = kVar.f101640b;
        if (kVar2 == null) {
            kVar2 = C38370k.f101593f;
        }
        C38365f fVar = kVar2.f101598d;
        if (fVar == null) {
            fVar = C38365f.f101578c;
        }
        if (fVar.f101580a == 2) {
            uVar = (C38380u) fVar.f101581b;
        } else {
            uVar = C38380u.f101620d;
        }
        C88431bb bbVar = uVar.f101624c;
        if (bbVar == null) {
            bbVar = C88431bb.f239082a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C88403aa.f239031b);
        bbVar.mo58887l(r0);
        if (bbVar.f169962ag.mo58857o(r0.f169971d)) {
            return new C38387c("Handle close ALL bubbles request not implemented");
        }
        C62940bt r02 = C62942bv.checkIsLite(C38346a.f101532a);
        bbVar.mo58887l(r02);
        if (bbVar.f169962ag.mo58857o(r02.f169971d)) {
            C62940bt r03 = C62942bv.checkIsLite(C38346a.f101532a);
            bbVar.mo58887l(r03);
            Object l = bbVar.f169962ag.mo58854l(r03.f169971d);
            if (l == null) {
                obj2 = r03.f169969b;
            } else {
                obj2 = r03.mo58889c(l);
            }
            optional = Optional.ofNullable((C88474x) C97024b.m160592a((C38348c) obj2).mo56111f());
        } else {
            C62940bt r04 = C62942bv.checkIsLite(C88403aa.f239030a);
            bbVar.mo58887l(r04);
            if (bbVar.f169962ag.mo58857o(r04.f169971d)) {
                C62940bt r05 = C62942bv.checkIsLite(C88403aa.f239030a);
                bbVar.mo58887l(r05);
                Object l2 = bbVar.f169962ag.mo58854l(r05.f169971d);
                if (l2 == null) {
                    obj = r05.f169969b;
                } else {
                    obj = r05.mo58889c(l2);
                }
                optional = Optional.m71637of((C88474x) obj);
            } else {
                optional = Optional.empty();
            }
        }
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) f270969a.mo56225c()).mo56372aa(18333)).mo56386p("No bubble data present in deeplink");
            return new C38387c("No bubble data present in deeplink");
        }
        Optional a = this.f270972d.mo65584a((C88474x) optional.get()).mo90383a();
        if (a.isPresent()) {
            return C38389e.m67663a(C58485gu.m89846n(C40093a.m69617a(this.f270971c, (C40126e) a.get())));
        }
        ((C59052c) ((C59052c) f270969a.mo56225c()).mo56372aa(18332)).mo56386p("Cannot extract bubble parameters from the deeplink");
        return new C38387c("Cannot extract bubble parameters from the deeplink");
    }
}
