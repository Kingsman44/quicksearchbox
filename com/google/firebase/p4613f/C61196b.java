package com.google.firebase.p4613f;

import com.google.firebase.components.C61152f;
import com.google.firebase.components.C61155i;
import java.util.Set;

/* renamed from: com.google.firebase.f.b */
/* compiled from: PG */
public final /* synthetic */ class C61196b implements C61155i {

    /* renamed from: a */
    public static final /* synthetic */ C61196b f165546a = new C61196b();

    private /* synthetic */ C61196b() {
    }

    /* renamed from: a */
    public final Object mo57686a(C61152f fVar) {
        Set b = fVar.mo57711b(C61199e.class);
        C61198d dVar = C61198d.f165549a;
        if (dVar == null) {
            synchronized (C61198d.class) {
                dVar = C61198d.f165549a;
                if (dVar == null) {
                    dVar = new C61198d();
                    C61198d.f165549a = dVar;
                }
            }
        }
        return new C61197c(b, dVar);
    }
}
