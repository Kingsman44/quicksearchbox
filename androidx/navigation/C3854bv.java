package androidx.navigation;

import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.navigation.bv */
/* compiled from: PG */
public final class C3854bv extends C3858bz {

    /* renamed from: m */
    private final Class f12404m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3854bv(Class cls) {
        super(cls, (byte[]) null);
        C69664n.m101061g(cls, "type");
        if (cls.isEnum()) {
            this.f12404m = cls;
        } else {
            new StringBuilder().append(cls);
            throw new IllegalArgumentException(String.valueOf(cls).concat(" is not an Enum type."));
        }
    }

    /* renamed from: b */
    public final String mo8104b() {
        String name = this.f12404m.getName();
        C69664n.m101060f(name, "type.name");
        return name;
    }

    /* renamed from: f */
    public final Enum mo8107e(String str) {
        Enum enumR;
        C69664n.m101061g(str, "value");
        Object[] enumConstants = this.f12404m.getEnumConstants();
        C69664n.m101060f(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumR = null;
                break;
            }
            enumR = enumConstants[i];
            i++;
            if (C69764m.m101228g(((Enum) enumR).name(), str, true)) {
                break;
            }
        }
        Enum enumR2 = enumR;
        if (enumR2 != null) {
            return enumR2;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f12404m.getName() + '.');
    }
}
