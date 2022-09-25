package com.google.android.libraries.assistant.soda;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.p5218j.C66999hh;

/* renamed from: com.google.android.libraries.assistant.soda.c */
/* compiled from: PG */
public final class C19258c extends C19239ab {

    /* renamed from: a */
    public C58833ax f53966a;

    /* renamed from: b */
    public C58833ax f53967b;

    /* renamed from: c */
    private C66999hh f53968c;

    public C19258c() {
        C58836b bVar = C58836b.f156633a;
        this.f53966a = bVar;
        this.f53967b = bVar;
    }

    /* renamed from: a */
    public final C19240ac mo24389a() {
        C66999hh hhVar = this.f53968c;
        if (hhVar != null) {
            return new C19262d(hhVar, this.f53966a, this.f53967b);
        }
        throw new IllegalStateException("Missing required properties: sodaCoreConfig");
    }

    /* renamed from: b */
    public final void mo24390b(C66999hh hhVar) {
        if (hhVar != null) {
            this.f53968c = hhVar;
            return;
        }
        throw new NullPointerException("Null sodaCoreConfig");
    }
}
