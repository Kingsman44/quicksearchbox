package android.p017a.p020c;

/* renamed from: android.a.c.c */
/* compiled from: PG */
public final class C0110c {

    /* renamed from: a */
    public final int f308a;

    /* renamed from: b */
    public final char f309b;

    /* renamed from: c */
    public short f310c;

    /* renamed from: d */
    public int f311d;

    /* renamed from: e */
    public final int f312e;

    public C0110c(int i, int i2, int i3, int i4) {
        this.f312e = i;
        this.f308a = i2;
        this.f309b = (char) i3;
        this.f310c = (short) i4;
    }

    /* renamed from: a */
    public final int mo70a() {
        int i = this.f312e;
        if (i == 6 || i == 7) {
            return C0111d.f313e[this.f310c];
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0110c cVar = (C0110c) obj;
            return this.f312e == cVar.f312e && this.f308a == cVar.f308a && this.f309b == cVar.f309b && this.f310c == cVar.f310c && this.f311d == cVar.f311d;
        }
    }

    public final int hashCode() {
        return (((((this.f312e * 37) + this.f308a) * 37) + this.f309b) * 37) + this.f310c;
    }

    public final String toString() {
        String str;
        String str2;
        int i = this.f312e;
        if (i == 6 || i == 7) {
            int a = mo70a();
            String a2 = C0108a.m69a(a);
            if (a != 0) {
                str = a2;
            } else {
                throw null;
            }
        } else {
            str = Integer.toString(this.f310c);
        }
        switch (this.f312e) {
            case 1:
                str2 = "MSG_START";
                break;
            case 2:
                str2 = "MSG_LIMIT";
                break;
            case 3:
                str2 = "SKIP_SYNTAX";
                break;
            case 4:
                str2 = "INSERT_CHAR";
                break;
            case 5:
                str2 = "REPLACE_NUMBER";
                break;
            case 6:
                str2 = "ARG_START";
                break;
            case 7:
                str2 = "ARG_LIMIT";
                break;
            case 8:
                str2 = "ARG_NUMBER";
                break;
            case 9:
                str2 = "ARG_NAME";
                break;
            case 10:
                str2 = "ARG_TYPE";
                break;
            case 11:
                str2 = "ARG_STYLE";
                break;
            case 12:
                str2 = "ARG_SELECTOR";
                break;
            case 13:
                str2 = "ARG_INT";
                break;
            default:
                str2 = "ARG_DOUBLE";
                break;
        }
        int i2 = this.f308a;
        return str2 + "(" + str + ")@" + i2;
    }
}
