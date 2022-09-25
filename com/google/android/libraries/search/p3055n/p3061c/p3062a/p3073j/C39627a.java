package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3073j;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.C67033io;
import com.google.speech.p5218j.C67034ip;
import com.google.speech.p5218j.C67070jy;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.search.n.c.a.j.a */
/* compiled from: PG */
public final /* synthetic */ class C39627a implements BiConsumer {

    /* renamed from: a */
    public static final /* synthetic */ C39627a f104309a = new C39627a();

    private /* synthetic */ C39627a() {
    }

    public final void accept(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        for (C67034ip ipVar : ((C67070jy) obj2).f182317a) {
            if ((ipVar.f182210a & 1) != 0) {
                C67033io a = C67033io.m97411a(ipVar.f182211b);
                if (a == null) {
                    a = C67033io.GH_INTERVAL_GUEST;
                }
                str = a.name();
            } else {
                str = "label absent";
            }
            C59104x b = C39628b.f104310a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HdmSodaHotwordUtils");
            ((C59052c) ((C59052c) b).mo56372aa(53787)).mo56359L("For speaker : %s, did fire: %b, label: %s.", str2, Boolean.valueOf(ipVar.f182212c), str);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
