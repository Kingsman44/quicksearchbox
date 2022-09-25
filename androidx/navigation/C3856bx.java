package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.bx */
/* compiled from: PG */
public final class C3856bx extends C3860ca {

    /* renamed from: m */
    private final Class f12406m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3856bx(Class cls) {
        super(true);
        C69664n.m101061g(cls, "type");
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f12406m = cls;
        } else {
            new StringBuilder().append(cls);
            throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Parcelable or Serializable."));
        }
    }

    /* renamed from: a */
    public final Object mo8103a(String str) {
        C69664n.m101061g(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    /* renamed from: b */
    public final String mo8104b() {
        String name = this.f12406m.getName();
        C69664n.m101060f(name, "type.name");
        return name;
    }

    /* renamed from: c */
    public final void mo8105c(Bundle bundle, String str, Object obj) {
        C69664n.m101061g(str, "key");
        this.f12406m.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    /* renamed from: d */
    public final void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        bundle.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C69664n.m101066l(getClass(), obj.getClass())) {
            return false;
        }
        return C69664n.m101066l(this.f12406m, ((C3856bx) obj).f12406m);
    }

    public final int hashCode() {
        return this.f12406m.hashCode();
    }
}
