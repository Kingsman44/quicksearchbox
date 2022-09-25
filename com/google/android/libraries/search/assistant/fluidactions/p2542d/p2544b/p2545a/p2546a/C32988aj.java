package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g;
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
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aj */
/* compiled from: PG */
public final class C32988aj {

    /* renamed from: a */
    public Optional f88383a = Optional.empty();

    /* renamed from: b */
    public Optional f88384b = Optional.empty();

    /* renamed from: c */
    public Optional f88385c = Optional.empty();

    /* renamed from: d */
    public C58833ax f88386d = C58836b.f156633a;

    /* renamed from: e */
    private C52091ex f88387e;

    public C32988aj(C52091ex exVar) {
        this.f88387e = exVar;
        m61095e();
    }

    /* renamed from: e */
    private final void m61095e() {
        this.f88386d = C19046d.m36497c(this.f88387e, "recipient").mo56105a(C19046d.m36497c(this.f88387e, "callee"));
        Optional d = C33119g.m61468d(this.f88387e);
        Optional e = C33119g.m61469e(this.f88387e);
        if (d.isPresent() && (((C51254ax) d.get()).f133436a & 1) != 0) {
            this.f88383a = d;
            C51406gn gnVar = ((C51254ax) d.get()).f133437b;
            if (gnVar == null) {
                gnVar = C51406gn.f133887s;
            }
            this.f88385c = Optional.m71637of(gnVar);
        } else if (e.isPresent() && (((C51460in) e.get()).f134054a & 1) != 0) {
            this.f88384b = e;
            C51406gn gnVar2 = ((C51460in) e.get()).f134055b;
            if (gnVar2 == null) {
                gnVar2 = C51406gn.f133887s;
            }
            this.f88385c = Optional.m71637of(gnVar2);
        }
    }

    /* renamed from: a */
    public final C52091ex mo38452a() {
        if (this.f88387e != null && this.f88386d.mo56113h()) {
            C19045c cVar = new C19045c(this.f88387e, "Initiate_call");
            if (cVar.f53449b) {
                C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
                C61748j jVar = (C61748j) this.f88386d.mo56107c();
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
                this.f88387e = cVar.mo24270b(this.f88387e);
            } else {
                cVar.mo24276h("Send_digital_object");
                if (cVar.f53449b) {
                    C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
                    C61748j jVar2 = (C61748j) this.f88386d.mo56107c();
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
                    this.f88387e = cVar.mo24270b(this.f88387e);
                }
            }
        }
        if (this.f88387e != null && this.f88385c.isPresent()) {
            if (this.f88383a.isPresent() && this.f88385c.isPresent()) {
                C51253aw awVar = (C51253aw) ((C51254ax) this.f88383a.get()).toBuilder();
                C51406gn gnVar = (C51406gn) this.f88385c.get();
                awVar.copyOnWrite();
                C51254ax axVar = (C51254ax) awVar.instance;
                gnVar.getClass();
                axVar.f133437b = gnVar;
                axVar.f133436a |= 1;
                this.f88387e = C33119g.m61467c(this.f88387e, "asst.communication.call", "assistant.api.params.CallParams", ((C51254ax) awVar.build()).toByteString());
            } else if (this.f88384b.isPresent() && this.f88385c.isPresent()) {
                C51459im imVar = (C51459im) ((C51460in) this.f88384b.get()).toBuilder();
                C51406gn gnVar2 = (C51406gn) this.f88385c.get();
                imVar.copyOnWrite();
                C51460in inVar = (C51460in) imVar.instance;
                gnVar2.getClass();
                inVar.f134055b = gnVar2;
                inVar.f134054a |= 1;
                this.f88387e = C33119g.m61466b(this.f88387e, (C51460in) imVar.build());
            }
        }
        return this.f88387e;
    }

    /* renamed from: b */
    public final Optional mo38453b() {
        if (!this.f88384b.isPresent()) {
            return Optional.empty();
        }
        if (!this.f88385c.isPresent()) {
            return this.f88384b;
        }
        C51459im imVar = (C51459im) ((C51460in) this.f88384b.get()).toBuilder();
        C51406gn gnVar = (C51406gn) this.f88385c.get();
        imVar.copyOnWrite();
        C51460in inVar = (C51460in) imVar.instance;
        gnVar.getClass();
        inVar.f134055b = gnVar;
        inVar.f134054a |= 1;
        Optional of = Optional.m71637of((C51460in) imVar.build());
        this.f88384b = of;
        return of;
    }

    /* renamed from: c */
    public final Optional mo38454c() {
        if (this.f88386d.mo56113h()) {
            return Optional.m71637of((C61748j) this.f88386d.mo56107c());
        }
        return Optional.empty();
    }

    /* renamed from: d */
    public final void mo38455d(C52091ex exVar) {
        this.f88387e = exVar;
        this.f88383a = Optional.empty();
        this.f88384b = Optional.empty();
        this.f88385c = Optional.empty();
        this.f88386d = C58836b.f156633a;
        m61095e();
    }
}
