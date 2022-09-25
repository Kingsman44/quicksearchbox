package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.r */
/* compiled from: PG */
public final class C125929r {

    /* renamed from: a */
    private static final C59071e f347125a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.m.r");

    /* renamed from: b */
    private final C125937z f347126b;

    /* renamed from: c */
    private final boolean f347127c;

    /* renamed from: d */
    private final boolean f347128d;

    /* renamed from: e */
    private final C58528ij f347129e;

    /* renamed from: f */
    private final C58528ij f347130f;

    public C125929r(C125937z zVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f347126b = zVar;
        this.f347127c = z;
        this.f347128d = z4;
        C58526ih ihVar = new C58526ih();
        if (z2) {
            ihVar.mo55373c(Locale.ENGLISH);
        }
        if (z3) {
            ihVar.mo55373c(Locale.GERMAN);
        }
        this.f347129e = ihVar.mo55486f();
        C58526ih ihVar2 = new C58526ih();
        if (z5) {
            ihVar2.mo55373c(Locale.ENGLISH);
        }
        if (z6) {
            ihVar2.mo55373c(Locale.GERMAN);
        }
        this.f347130f = ihVar2.mo55486f();
    }

    /* renamed from: a */
    public final boolean mo107180a(Locale locale) {
        C125931t a = this.f347126b.mo107202a();
        if (!a.mo107198q(a.f347138e)) {
            C59052c cVar = (C59052c) f347125a.mo56224b();
            cVar.mo56374ac(1, TimeUnit.MINUTES);
            ((C59052c) cVar.mo56372aa(36790)).mo56386p("Keyboard does not support emoji search. [SD]");
            return false;
        } else if (this.f347128d && !Collection.EL.stream(this.f347130f).noneMatch(new C125928q(locale))) {
            return true;
        } else {
            C59052c cVar2 = (C59052c) f347125a.mo56224b();
            cVar2.mo56374ac(1, TimeUnit.MINUTES);
            ((C59052c) cVar2.mo56372aa(36789)).mo56389s("Emoji search is disabled for locale %s. [SD]", locale);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo107181b(Locale locale) {
        C125931t a = this.f347126b.mo107202a();
        if (!a.mo107198q(a.f347137d)) {
            C59052c cVar = (C59052c) f347125a.mo56224b();
            cVar.mo56374ac(1, TimeUnit.MINUTES);
            ((C59052c) cVar.mo56372aa(36792)).mo56386p("Keyboard does not support emoji suggestions. [SD]");
            return false;
        } else if (this.f347127c && !Collection.EL.stream(this.f347129e).noneMatch(new C125927p(locale))) {
            return true;
        } else {
            C59052c cVar2 = (C59052c) f347125a.mo56224b();
            cVar2.mo56374ac(1, TimeUnit.MINUTES);
            ((C59052c) cVar2.mo56372aa(36791)).mo56389s("Emoji suggestions are disabled for locale %s. [SD]", locale);
            return false;
        }
    }
}
