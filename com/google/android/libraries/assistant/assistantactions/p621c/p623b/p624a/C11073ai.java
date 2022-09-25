package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d;
import com.google.assistant.p3897e.p3917i.p3918a.C51253aw;
import com.google.assistant.p3897e.p3917i.p3918a.C51254ax;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3917i.p3918a.C51459im;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.ai */
/* compiled from: PG */
final class C11073ai {

    /* renamed from: a */
    public C58833ax f36350a;

    /* renamed from: b */
    public C58833ax f36351b;

    /* renamed from: c */
    public C58833ax f36352c;

    /* renamed from: d */
    public C58833ax f36353d;

    /* renamed from: e */
    private C52091ex f36354e;

    public C11073ai(C52091ex exVar) {
        C58836b bVar = C58836b.f156633a;
        this.f36350a = bVar;
        this.f36351b = bVar;
        this.f36352c = bVar;
        this.f36353d = bVar;
        this.f36354e = exVar;
        m26188d();
    }

    /* renamed from: d */
    private final void m26188d() {
        this.f36353d = C19046d.m36497c(this.f36354e, "recipient").mo56105a(C19046d.m36497c(this.f36354e, "callee"));
        C58833ax d = C11210e.m26592d(this.f36354e);
        C58833ax e = C11210e.m26593e(this.f36354e);
        if (d.mo56113h() && (((C51254ax) d.mo56107c()).f133436a & 1) != 0) {
            this.f36350a = d;
            C51406gn gnVar = ((C51254ax) d.mo56107c()).f133437b;
            if (gnVar == null) {
                gnVar = C51406gn.f133887s;
            }
            this.f36352c = C58833ax.m90834k(gnVar);
        } else if (e.mo56113h() && (((C51460in) e.mo56107c()).f134054a & 1) != 0) {
            this.f36351b = e;
            C51406gn gnVar2 = ((C51460in) e.mo56107c()).f134055b;
            if (gnVar2 == null) {
                gnVar2 = C51406gn.f133887s;
            }
            this.f36352c = C58833ax.m90834k(gnVar2);
        }
    }

    /* renamed from: a */
    public final C52091ex mo19552a() {
        if (this.f36354e != null && this.f36353d.mo56113h()) {
            C19045c cVar = new C19045c(this.f36354e, "Initiate_call");
            if (cVar.f53449b) {
                C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
                C61748j jVar = (C61748j) this.f36353d.mo56107c();
                gVar.copyOnWrite();
                C61746h hVar = (C61746h) gVar.instance;
                jVar.getClass();
                hVar.f166797e = jVar;
                hVar.f166793a |= 4;
                gVar.copyOnWrite();
                C61746h hVar2 = (C61746h) gVar.instance;
                hVar2.f166793a |= 2;
                hVar2.f166796d = "callee";
                cVar.mo24275g((C61746h) gVar.build());
                this.f36354e = cVar.mo24270b(this.f36354e);
            } else {
                cVar.mo24276h("Send_digital_object");
                if (cVar.f53449b) {
                    C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
                    C61748j jVar2 = (C61748j) this.f36353d.mo56107c();
                    gVar2.copyOnWrite();
                    C61746h hVar3 = (C61746h) gVar2.instance;
                    jVar2.getClass();
                    hVar3.f166797e = jVar2;
                    hVar3.f166793a |= 4;
                    gVar2.copyOnWrite();
                    C61746h hVar4 = (C61746h) gVar2.instance;
                    hVar4.f166793a |= 2;
                    hVar4.f166796d = "recipient";
                    cVar.mo24275g((C61746h) gVar2.build());
                    this.f36354e = cVar.mo24270b(this.f36354e);
                }
            }
        }
        if (this.f36354e != null && this.f36352c.mo56113h()) {
            if (this.f36350a.mo56113h() && this.f36352c.mo56113h()) {
                C51253aw awVar = (C51253aw) ((C51254ax) this.f36350a.mo56107c()).toBuilder();
                C51406gn gnVar = (C51406gn) this.f36352c.mo56107c();
                awVar.copyOnWrite();
                C51254ax axVar = (C51254ax) awVar.instance;
                gnVar.getClass();
                axVar.f133437b = gnVar;
                axVar.f133436a |= 1;
                this.f36354e = C11210e.m26591c(this.f36354e, "asst.communication.call", "assistant.api.params.CallParams", ((C51254ax) awVar.build()).toByteString());
            } else if (this.f36351b.mo56113h() && this.f36352c.mo56113h()) {
                C51459im imVar = (C51459im) ((C51460in) this.f36351b.mo56107c()).toBuilder();
                C51406gn gnVar2 = (C51406gn) this.f36352c.mo56107c();
                imVar.copyOnWrite();
                C51460in inVar = (C51460in) imVar.instance;
                gnVar2.getClass();
                inVar.f134055b = gnVar2;
                inVar.f134054a |= 1;
                this.f36354e = C11210e.m26590b(this.f36354e, (C51460in) imVar.build());
            }
        }
        return this.f36354e;
    }

    /* renamed from: b */
    public final C58833ax mo19553b() {
        if (!this.f36351b.mo56113h()) {
            return C58836b.f156633a;
        }
        if (!this.f36352c.mo56113h()) {
            return this.f36351b;
        }
        C51459im imVar = (C51459im) ((C51460in) this.f36351b.mo56107c()).toBuilder();
        C51406gn gnVar = (C51406gn) this.f36352c.mo56107c();
        imVar.copyOnWrite();
        C51460in inVar = (C51460in) imVar.instance;
        gnVar.getClass();
        inVar.f134055b = gnVar;
        inVar.f134054a |= 1;
        C58833ax k = C58833ax.m90834k((C51460in) imVar.build());
        this.f36351b = k;
        return k;
    }

    /* renamed from: c */
    public final void mo19554c(C52091ex exVar) {
        this.f36354e = exVar;
        C58836b bVar = C58836b.f156633a;
        this.f36350a = bVar;
        this.f36351b = bVar;
        this.f36352c = bVar;
        this.f36353d = bVar;
        m26188d();
    }
}
