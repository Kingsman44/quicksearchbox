package com.google.common.p4576s;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.common.s.b */
/* compiled from: PG */
final class C60765b extends C60766c {

    /* renamed from: a */
    final /* synthetic */ TypeVariable f164809a;

    /* renamed from: b */
    final /* synthetic */ C60766c f164810b;

    public C60765b(TypeVariable typeVariable, C60766c cVar) {
        this.f164809a = typeVariable;
        this.f164810b = cVar;
    }

    /* renamed from: a */
    public final Type mo57212a(TypeVariable typeVariable, C60766c cVar) {
        if (typeVariable.getGenericDeclaration().equals(this.f164809a.getGenericDeclaration())) {
            return typeVariable;
        }
        return this.f164810b.mo57212a(typeVariable, cVar);
    }
}
