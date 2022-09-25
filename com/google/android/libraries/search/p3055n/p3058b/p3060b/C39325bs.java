package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.android.libraries.assistant.soda.p1602a.C19237b;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5218j.C67171p;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.n.b.b.bs */
/* compiled from: PG */
public final /* synthetic */ class C39325bs implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C39326bt f103580a;

    /* renamed from: b */
    public final /* synthetic */ C67171p f103581b;

    public /* synthetic */ C39325bs(C39326bt btVar, C67171p pVar) {
        this.f103580a = btVar;
        this.f103581b = pVar;
    }

    public final void run() {
        C39326bt btVar = this.f103580a;
        C67171p pVar = this.f103581b;
        if (btVar.f103585d) {
            pVar.f182578b.mo59031d();
            try {
                if (btVar.f103587f.isPresent()) {
                    ((C19237b) btVar.f103587f.get()).mo24387a(pVar.f182578b.mo59174N());
                }
                if (btVar.f103588g.isPresent()) {
                    ((C19237b) btVar.f103588g.get()).mo24387a(pVar.f182578b.mo59174N());
                }
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C39326bt.f103582a.mo56226d()).mo56382g(e)).mo56372aa(53470)).mo56386p("Unable to dump preamble audio");
            }
        } else {
            ((C59052c) ((C59052c) C39326bt.f103582a.mo56226d()).mo56372aa(53468)).mo56387q("Dropping dump of %d query bytes", pVar.f182578b.mo59031d());
        }
    }
}
