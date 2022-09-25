package p5585l.p5586a.p5587a.p5588a;

/* renamed from: l.a.a.a.a */
/* compiled from: PG */
public final class C71817a {

    /* renamed from: a */
    public String f191346a;

    /* renamed from: b */
    public int f191347b;

    public C71817a(int i, String str) {
        this.f191347b = i;
        this.f191346a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C71817a aVar = (C71817a) obj;
        if (this.f191347b != aVar.f191347b) {
            return false;
        }
        String str = this.f191346a;
        String str2 = aVar.f191346a;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f191347b;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        String str = this.f191346a;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + (i2 * 31);
    }

    public final String toString() {
        String replace = this.f191346a.replace(10, 182);
        int i = this.f191347b;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "EQUAL" : "INSERT" : "DELETE";
        return "Diff(" + str + ",\"" + replace + "\")";
    }
}
