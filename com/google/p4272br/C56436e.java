package com.google.p4272br;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.br.e */
/* compiled from: PG */
final class C56436e {

    /* renamed from: a */
    int f150733a;

    /* renamed from: b */
    int f150734b;

    /* renamed from: c */
    int f150735c;

    /* renamed from: d */
    int[] f150736d;

    public C56436e(int i) {
        this.f150733a = i;
    }

    /* renamed from: a */
    static boolean m88131a(int i) {
        return i >= 8;
    }

    /* renamed from: b */
    private static String m88132b(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        for (int c : iArr) {
            C56432ab.m88119c(sb, c);
        }
        sb.append('\"');
        return sb.toString();
    }

    public final String toString() {
        switch (this.f150733a) {
            case 1:
                return "alt -> " + this.f150734b + ", " + this.f150735c;
            case 2:
                return "altmatch -> " + this.f150734b + ", " + this.f150735c;
            case 3:
                return "cap " + this.f150735c + " -> " + this.f150734b;
            case 4:
                return "empty " + this.f150735c + " -> " + this.f150734b;
            case 5:
                return "fail";
            case 6:
                return "match";
            case 7:
                return "nop -> " + this.f150734b;
            case 8:
                if (this.f150736d == null) {
                    return "rune <null>";
                }
                StringBuilder sb = new StringBuilder("rune ");
                sb.append(m88132b(this.f150736d));
                sb.append(1 != (this.f150735c & 1) ? BuildConfig.FLAVOR : "/i");
                sb.append(" -> ");
                sb.append(this.f150734b);
                return sb.toString();
            case 9:
                return "rune1 " + m88132b(this.f150736d) + " -> " + this.f150734b;
            case 10:
                return "any -> " + this.f150734b;
            case 11:
                return "anynotnl -> " + this.f150734b;
            default:
                throw new IllegalStateException("unhandled case in Inst.toString");
        }
    }
}
