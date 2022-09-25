package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.v */
/* compiled from: PG */
final class C0776v {

    /* renamed from: a */
    int f2668a;

    /* renamed from: b */
    int f2669b;

    /* renamed from: c */
    Object f2670c;

    /* renamed from: d */
    int f2671d;

    public C0776v(int i, int i2, int i3, Object obj) {
        this.f2668a = i;
        this.f2669b = i2;
        this.f2671d = i3;
        this.f2670c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0776v)) {
            return false;
        }
        C0776v vVar = (C0776v) obj;
        int i = this.f2668a;
        if (i != vVar.f2668a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2671d - this.f2669b) == 1 && this.f2671d == vVar.f2669b && this.f2669b == vVar.f2671d) {
            return true;
        }
        if (this.f2671d != vVar.f2671d || this.f2669b != vVar.f2669b) {
            return false;
        }
        Object obj2 = this.f2670c;
        if (obj2 != null) {
            if (!obj2.equals(vVar.f2670c)) {
                return false;
            }
        } else if (vVar.f2670c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2668a * 31) + this.f2669b) * 31) + this.f2671d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2668a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2669b);
        sb.append("c:");
        sb.append(this.f2671d);
        sb.append(",p:");
        sb.append(this.f2670c);
        sb.append("]");
        return sb.toString();
    }
}
