package p5462h.p5463a.p5464a;

import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.a.a.g */
/* compiled from: PG */
public final class C69473g implements Map.Entry, C69640a {

    /* renamed from: a */
    private final C69477k f185890a;

    /* renamed from: b */
    private final int f185891b;

    public C69473g(C69477k kVar, int i) {
        this.f185890a = kVar;
        this.f185891b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return C69664n.m101066l(entry.getKey(), getKey()) && C69664n.m101066l(entry.getValue(), getValue());
    }

    public final Object getKey() {
        return this.f185890a.f185895a[this.f185891b];
    }

    public final Object getValue() {
        Object[] objArr = this.f185890a.f185896b;
        C69664n.m101058d(objArr);
        return objArr[this.f185891b];
    }

    public final int hashCode() {
        Object key = getKey();
        int i = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f185890a.mo61107e();
        Object[] i = this.f185890a.mo61115i();
        int i2 = this.f185891b;
        Object obj2 = i[i2];
        i[i2] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
