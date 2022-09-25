package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.apps.tiktok.concurrent.C46459k;
import java.util.Set;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.aa */
/* compiled from: PG */
final class C127007aa extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C127012af f349732a;

    /* renamed from: b */
    final /* synthetic */ C119844cl f349733b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127007aa(C127012af afVar, C119844cl clVar) {
        super(0);
        this.f349732a = afVar;
        this.f349733b = clVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        if (!((C127034w) this.f349732a.f349746e.mo62784e()).f349811b.isEmpty()) {
            ((C127034w) this.f349732a.f349746e.mo62784e()).f349811b.peek();
            C127012af afVar = this.f349732a;
            afVar.f349743b.mo107895a((C34053bp) ((C127034w) afVar.f349746e.mo62784e()).f349811b.pollFirst());
        }
        if (this.f349733b.f333790a == 4) {
            Set set = ((C127034w) this.f349732a.f349746e.mo62784e()).f349814e;
            C119834cb cbVar = this.f349733b.f333792c;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
            if (!set.contains(cbVar)) {
                C127012af afVar2 = this.f349732a;
                C46459k.m82829b(C71663i.m104692e(afVar2.f349745d, (C71424ay) null, new C127037z(afVar2, this.f349733b, (C69577g) null), 3), "Failed to propagate error to ConversationDataStore", new Object[0]);
            }
        }
        Set set2 = ((C127034w) this.f349732a.f349746e.mo62784e()).f349814e;
        C119834cb cbVar2 = this.f349733b.f333792c;
        if (cbVar2 == null) {
            cbVar2 = C119834cb.f333765b;
        }
        set2.remove(cbVar2);
        C71548cy cyVar = this.f349732a.f349746e;
        cyVar.mo62807f(C127034w.m207781b((C127034w) cyVar.mo62784e(), (C34053bp) null, (C119904w) null, (C119834cb) null, (C119885dz) null, this.f349733b, 63));
        return C69788q.f186170a;
    }
}
