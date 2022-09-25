package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120814g;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120815h;
import com.google.speech.p5218j.C67023ie;
import com.google.speech.p5218j.C67024if;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C120653ag implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ boolean f335595a;

    /* renamed from: b */
    public final /* synthetic */ C120814g f335596b;

    public /* synthetic */ C120653ag(boolean z, C120814g gVar) {
        this.f335595a = z;
        this.f335596b = gVar;
    }

    public final void accept(Object obj) {
        int i;
        int a;
        boolean z = this.f335595a;
        C120814g gVar = this.f335596b;
        C67024if ifVar = (C67024if) obj;
        if (z && (a = C67023ie.m97409a(i)) != 0) {
            boolean z2 = true;
            if (a != 1) {
                int a2 = C67023ie.m97409a((i = ifVar.f182186a));
                if (a2 == 0 || a2 != 3) {
                    z2 = false;
                }
                gVar.copyOnWrite();
                C120815h hVar = (C120815h) gVar.instance;
                C120815h hVar2 = C120815h.f335972f;
                hVar.f335974a |= 2;
                hVar.f335978e = z2;
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
