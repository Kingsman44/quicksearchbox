package androidx.media3.p132b;

import com.google.common.p4522b.C58439fb;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4522b.C58639mm;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.media3.b.u */
/* compiled from: PG */
final class C2517u extends C58439fb {

    /* renamed from: a */
    private final Map f6923a;

    public C2517u(Map map) {
        this.f6923a = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo5942b() {
        return this.f6923a;
    }

    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return C58570jy.m90164p(new C58639mm(entrySet().iterator()), obj);
    }

    public final Set entrySet() {
        return C58758qx.m90652j(super.entrySet(), C2515s.f6921a);
    }

    public final boolean equals(Object obj) {
        return obj != null && C58662ni.m90356o(this, obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f6923a;
    }

    public final int hashCode() {
        return C58758qx.m90643a(entrySet());
    }

    public final boolean isEmpty() {
        if (!super.isEmpty()) {
            return super.size() == 1 && super.containsKey((Object) null);
        }
        return true;
    }

    public final Set keySet() {
        return C58758qx.m90652j(super.keySet(), C2516t.f6922a);
    }

    public final int size() {
        return super.size() - (super.containsKey((Object) null) ? 1 : 0);
    }
}
