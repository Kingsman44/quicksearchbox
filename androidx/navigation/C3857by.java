package androidx.navigation;

import android.os.Bundle;
import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.by */
/* compiled from: PG */
public final class C3857by extends C3860ca {

    /* renamed from: m */
    private final Class f12407m;

    public C3857by(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                if (cls2 != null) {
                    this.f12407m = cls2;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            new StringBuilder().append(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Serializable."));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8103a(String str) {
        C69664n.m101061g(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* renamed from: b */
    public final String mo8104b() {
        String name = this.f12407m.getName();
        C69664n.m101060f(name, "arrayType.name");
        return name;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        Serializable[] serializableArr = (Serializable[]) obj;
        C69664n.m101061g(str, "key");
        this.f12407m.cast(serializableArr);
        bundle.putSerializable(str, (Serializable) serializableArr);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        Serializable[] serializableArr = (Serializable[]) bundle.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C69664n.m101066l(getClass(), obj.getClass())) {
            return false;
        }
        return C69664n.m101066l(this.f12407m, ((C3857by) obj).f12407m);
    }

    public final int hashCode() {
        return this.f12407m.hashCode();
    }
}
