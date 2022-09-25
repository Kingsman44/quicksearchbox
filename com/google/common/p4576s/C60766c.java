package com.google.common.p4576s;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* renamed from: com.google.common.s.c */
/* compiled from: PG */
class C60766c {

    /* renamed from: a */
    private final C58495hd f164811a = C58729pv.f156485a;

    /* renamed from: a */
    public Type mo57212a(TypeVariable typeVariable, C60766c cVar) {
        Type type = (Type) this.f164811a.get(new C60767d(typeVariable));
        if (type != null) {
            return C60768e.m92771a(type, cVar);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0) {
            return typeVariable;
        }
        Type[] b = C60768e.m92772b(bounds, cVar);
        if (!C60778o.f164825a || !Arrays.equals(bounds, b)) {
            return C60784u.m92782e(typeVariable.getGenericDeclaration(), typeVariable.getName(), b);
        }
        return typeVariable;
    }
}
