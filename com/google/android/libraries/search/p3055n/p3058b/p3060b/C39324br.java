package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import android.content.Context;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.assistant.soda.p1602a.C19236a;
import com.google.android.libraries.assistant.soda.p1602a.C19237b;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60948g;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67174s;
import com.google.speech.p5218j.C67175t;
import java.io.IOException;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.br */
/* compiled from: PG */
public final /* synthetic */ class C39324br implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C39326bt f103577a;

    /* renamed from: b */
    public final /* synthetic */ C39655ci f103578b;

    /* renamed from: c */
    public final /* synthetic */ Context f103579c;

    public /* synthetic */ C39324br(C39326bt btVar, C39655ci ciVar, Context context) {
        this.f103577a = btVar;
        this.f103578b = ciVar;
        this.f103579c = context;
    }

    public final void run() {
        int i;
        C39326bt btVar = this.f103577a;
        C39655ci ciVar = this.f103578b;
        Context context = this.f103579c;
        C67175t a = C39327bu.m68738a(ciVar);
        btVar.f103585d = true;
        C60948g gVar = C60948g.f165068a;
        btVar.f103586e = Optional.m71637of(Instant.now());
        String a2 = C39326bt.m68736a(context, "query", (Instant) btVar.f103586e.get());
        ((C59052c) ((C59052c) C39326bt.f103582a.mo56224b()).mo56372aa(53472)).mo56389s("Preparing to dump audio to: %s", a2);
        boolean z = false;
        try {
            C67174s a3 = C67174s.m97431a(a.f182591b);
            if (a3 == null) {
                a3 = C67174s.INT16;
            }
            int c = C19245ah.m36695c(a3) * 8;
            int i2 = a.f182592c;
            int i3 = a.f182593d;
            C67174s a4 = C67174s.m97431a(a.f182591b);
            if (a4 == null) {
                a4 = C67174s.INT16;
            }
            btVar.f103587f = Optional.m71637of(new C19237b(a2, c, i2, i3, a4 == C67174s.FLOAT32));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C39326bt.f103582a.mo56226d()).mo56382g(e)).mo56372aa(53476)).mo56386p("Unable to dump query audio");
        }
        if ((ciVar.f104380a & 8) != 0) {
            try {
                String a5 = C39326bt.m68736a(context, "hwquery", (Instant) btVar.f103586e.get());
                C67174s a6 = C67174s.m97431a(a.f182591b);
                if (a6 == null) {
                    a6 = C67174s.INT16;
                }
                int c2 = C19245ah.m36695c(a6) * 8;
                int i4 = a.f182592c;
                int i5 = a.f182593d;
                C67174s a7 = C67174s.m97431a(a.f182591b);
                if (a7 == null) {
                    a7 = C67174s.INT16;
                }
                btVar.f103588g = Optional.m71637of(new C19237b(a5, c2, i4, i5, a7 == C67174s.FLOAT32));
            } catch (IOException e2) {
                ((C59052c) ((C59052c) ((C59052c) C39326bt.f103582a.mo56226d()).mo56382g(e2)).mo56372aa(53475)).mo56386p("Unable to dump hotword+query audio");
            }
        }
        if ((ciVar.f104380a & 8) != 0) {
            C67050je jeVar = ciVar.f104384e;
            if (jeVar == null) {
                jeVar = C67050je.f182262f;
            }
            C67073ka kaVar = jeVar.f182266c;
            if (kaVar == null) {
                kaVar = C67073ka.f182324f;
            }
            C67171p pVar = kaVar.f182327b;
            if (pVar == null) {
                pVar = C67171p.f182575e;
            }
            ((C59052c) ((C59052c) C39326bt.f103582a.mo56224b()).mo56372aa(53473)).mo56387q("Dumping %d preamble bytes", pVar.f182578b.mo59031d());
            try {
                String a8 = C39326bt.m68736a(context, "hotword", (Instant) btVar.f103586e.get());
                C67174s sVar = C67174s.INVALID;
                C67175t tVar = pVar.f182579c;
                if (tVar == null) {
                    tVar = C67175t.f182588e;
                }
                C67174s a9 = C67174s.m97431a(tVar.f182591b);
                if (a9 == null) {
                    a9 = C67174s.INT16;
                }
                int ordinal = a9.ordinal();
                if (ordinal == 1) {
                    i = 16;
                } else if (ordinal == 2 || ordinal == 3) {
                    i = 32;
                } else {
                    C59104x c3 = C19236a.f53909a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "soda_audio");
                    C59052c cVar = (C59052c) ((C59052c) c3).mo56372aa(47671);
                    C67175t tVar2 = pVar.f182579c;
                    if (tVar2 == null) {
                        tVar2 = C67175t.f182588e;
                    }
                    C67174s a10 = C67174s.m97431a(tVar2.f182591b);
                    if (a10 == null) {
                        a10 = C67174s.INT16;
                    }
                    cVar.mo56389s("Invalid sample format: %s", a10);
                    i = 0;
                }
                C67175t tVar3 = pVar.f182579c;
                int i6 = (tVar3 == null ? C67175t.f182588e : tVar3).f182592c;
                int i7 = (tVar3 == null ? C67175t.f182588e : tVar3).f182593d;
                if (tVar3 == null) {
                    tVar3 = C67175t.f182588e;
                }
                C67174s a11 = C67174s.m97431a(tVar3.f182591b);
                if (a11 == null) {
                    a11 = C67174s.INT16;
                }
                int ordinal2 = a11.ordinal();
                if (!(ordinal2 == 1 || ordinal2 == 2)) {
                    if (ordinal2 != 3) {
                        C59104x c4 = C19236a.f53909a.mo56225c();
                        c4.mo56378ag(C58975e.f156826a, "soda_audio");
                        C59052c cVar2 = (C59052c) ((C59052c) c4).mo56372aa(47672);
                        C67175t tVar4 = pVar.f182579c;
                        if (tVar4 == null) {
                            tVar4 = C67175t.f182588e;
                        }
                        C67174s a12 = C67174s.m97431a(tVar4.f182591b);
                        if (a12 == null) {
                            a12 = C67174s.INT16;
                        }
                        cVar2.mo56389s("Invalid sample format: %s", a12);
                    } else {
                        z = true;
                    }
                }
                C19237b bVar = new C19237b(a8, i, i6, i7, z);
                bVar.mo24387a(pVar.f182578b.mo59174N());
                bVar.close();
                if (btVar.f103588g.isPresent()) {
                    ((C19237b) btVar.f103588g.get()).mo24387a(pVar.f182578b.mo59174N());
                }
            } catch (IOException e3) {
                ((C59052c) ((C59052c) ((C59052c) C39326bt.f103582a.mo56226d()).mo56382g(e3)).mo56372aa(53474)).mo56386p("Unable to dump preamble audio");
            }
        }
    }
}
