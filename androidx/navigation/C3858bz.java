package androidx.navigation;

import android.os.Bundle;
import java.io.Serializable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.bz */
/* compiled from: PG */
public class C3858bz extends C3860ca {

    /* renamed from: m */
    private final Class f12408m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3858bz(Class cls) {
        super(true);
        C69664n.m101061g(cls, "type");
        if (!Serializable.class.isAssignableFrom(cls)) {
            new StringBuilder().append(cls);
            throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Serializable."));
        } else if (!cls.isEnum()) {
            this.f12408m = cls;
        } else {
            new StringBuilder().append(cls);
            throw new IllegalArgumentException(String.valueOf(cls).concat(" is an Enum. You should use EnumType instead."));
        }
    }

    /* renamed from: b */
    public String mo8104b() {
        String name = this.f12408m.getName();
        C69664n.m101060f(name, "type.name");
        return name;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8105c(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        C69664n.m101061g(str, "key");
        C69664n.m101061g(serializable, "value");
        this.f12408m.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8106d(Bundle bundle, String str) {
        C69664n.m101061g(str, "key");
        Serializable serializable = (Serializable) bundle.get(str);
    }

    /* renamed from: e */
    public Serializable mo8103a(String str) {
        C69664n.m101061g(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3858bz)) {
            return false;
        }
        return C69664n.m101066l(this.f12408m, ((C3858bz) obj).f12408m);
    }

    public final int hashCode() {
        return this.f12408m.hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3858bz(Class cls, byte[] bArr) {
        super(false);
        C69664n.m101061g(cls, "type");
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f12408m = cls;
        } else {
            new StringBuilder().append(cls);
            throw new IllegalArgumentException(String.valueOf(cls).concat(" does not implement Serializable."));
        }
    }
}
