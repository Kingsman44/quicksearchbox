package p5462h.p5473f;

import p5462h.p5473f.p5475b.C69656f;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5481k.C69704b;

/* renamed from: h.f.a */
/* compiled from: PG */
public final class C69614a {
    /* renamed from: a */
    public static final Class m101026a(C69704b bVar) {
        Class cls = ((C69657g) bVar).f186044b;
        C69664n.m101059e(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* renamed from: b */
    public static final Class m101027b(C69704b bVar) {
        C69664n.m101061g(bVar, "<this>");
        Class a = ((C69656f) bVar).mo61378a();
        if (!a.isPrimitive()) {
            C69664n.m101059e(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return a;
        }
        String name = a.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        a = Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        a = Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        a = Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        a = Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        a = Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        a = Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        a = Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        a = Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        a = Short.class;
                        break;
                    }
                    break;
            }
        }
        C69664n.m101059e(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return a;
    }
}
