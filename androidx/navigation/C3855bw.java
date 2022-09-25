package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.bw */
/* compiled from: PG */
public final class C3855bw extends C3860ca {

    /* renamed from: m */
    private final Class f12405m;

    public C3855bw(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                if (cls2 != null) {
                    this.f12405m = cls2;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            new StringBuilder().append(cls);
            throw new IllegalArgumentException(cls.toString().concat(" does not implement Parcelable."));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8103a(String str) {
        C69664n.m101061g(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* renamed from: b */
    public final String mo8104b() {
        String name = this.f12405m.getName();
        C69664n.m101060f(name, "arrayType.name");
        return name;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        C69664n.m101061g(str, "key");
        this.f12405m.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        Parcelable[] parcelableArr = (Parcelable[]) bundle.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C69664n.m101066l(getClass(), obj.getClass())) {
            return false;
        }
        return C69664n.m101066l(this.f12405m, ((C3855bw) obj).f12405m);
    }

    public final int hashCode() {
        return this.f12405m.hashCode();
    }
}
