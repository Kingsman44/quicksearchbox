package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125346x;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.aa */
/* compiled from: PG */
final class C125313aa implements C125346x {

    /* renamed from: a */
    final /* synthetic */ C33883a f345685a;

    /* renamed from: b */
    final /* synthetic */ Optional f345686b;

    public C125313aa(C33883a aVar, Optional optional) {
        this.f345685a = aVar;
        this.f345686b = optional;
    }

    /* renamed from: a */
    public final void mo106912a(String str) {
        this.f345685a.mo39110a(str);
    }

    /* renamed from: b */
    public final void mo106913b(String str) {
        this.f345686b.ifPresent(new C125371z(str));
    }

    /* renamed from: c */
    public final void mo106914c() {
        this.f345686b.ifPresent(C125370y.f345780a);
    }
}
