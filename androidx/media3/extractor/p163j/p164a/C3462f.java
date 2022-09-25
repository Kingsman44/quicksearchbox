package androidx.media3.extractor.p163j.p164a;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.a.f */
/* compiled from: PG */
final class C3462f {

    /* renamed from: a */
    public static final int f10721a = m10032a(2, 2, 2, 0);

    /* renamed from: b */
    public static final int f10722b;

    /* renamed from: c */
    public static final int[] f10723c = {0, 0, 0, 0, 0, 2, 0};

    /* renamed from: d */
    public static final int[] f10724d = {0, 0, 0, 0, 0, 0, 2};

    /* renamed from: e */
    public static final int[] f10725e = {3, 3, 3, 3, 3, 3, 1};

    /* renamed from: f */
    public static final boolean[] f10726f = {false, false, false, true, true, true, false};

    /* renamed from: g */
    public static final int[] f10727g;

    /* renamed from: h */
    public static final int[] f10728h = {0, 1, 2, 3, 4, 3, 4};

    /* renamed from: i */
    public static final int[] f10729i = {0, 0, 0, 0, 0, 3, 3};

    /* renamed from: j */
    public static final int[] f10730j;

    /* renamed from: A */
    private int f10731A;

    /* renamed from: B */
    private int f10732B;

    /* renamed from: C */
    private int f10733C;

    /* renamed from: D */
    private int f10734D;

    /* renamed from: E */
    private int f10735E;

    /* renamed from: F */
    private int f10736F;

    /* renamed from: k */
    public final List f10737k = new ArrayList();

    /* renamed from: l */
    public final SpannableStringBuilder f10738l = new SpannableStringBuilder();

    /* renamed from: m */
    public boolean f10739m;

    /* renamed from: n */
    public boolean f10740n;

    /* renamed from: o */
    public int f10741o;

    /* renamed from: p */
    public boolean f10742p;

    /* renamed from: q */
    public int f10743q;

    /* renamed from: r */
    public int f10744r;

    /* renamed from: s */
    public int f10745s;

    /* renamed from: t */
    public int f10746t;

    /* renamed from: u */
    public boolean f10747u;

    /* renamed from: v */
    public int f10748v;

    /* renamed from: w */
    public int f10749w;

    /* renamed from: x */
    public int f10750x;

    /* renamed from: y */
    public int f10751y;

    /* renamed from: z */
    public int f10752z;

    static {
        int a = m10032a(0, 0, 0, 0);
        f10722b = a;
        int a2 = m10032a(0, 0, 0, 3);
        f10727g = new int[]{a, a2, a, a, a2, a, a};
        f10730j = new int[]{a, a, a, a, a, a2, a2};
    }

    public C3462f() {
        mo7428e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m10032a(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            androidx.media3.common.p136b.C2601a.m6834f(r4, r0)
            androidx.media3.common.p136b.C2601a.m6834f(r5, r0)
            androidx.media3.common.p136b.C2601a.m6834f(r6, r0)
            androidx.media3.common.p136b.C2601a.m6834f(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L_0x0021
            if (r7 == r1) goto L_0x0021
            r3 = 2
            if (r7 == r3) goto L_0x001e
            r3 = 3
            if (r7 == r3) goto L_0x001c
            goto L_0x0021
        L_0x001c:
            r7 = 0
            goto L_0x0023
        L_0x001e:
            r7 = 127(0x7f, float:1.78E-43)
            goto L_0x0023
        L_0x0021:
            r7 = 255(0xff, float:3.57E-43)
        L_0x0023:
            if (r4 <= r1) goto L_0x0028
            r4 = 255(0xff, float:3.57E-43)
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            if (r5 <= r1) goto L_0x002e
            r5 = 255(0xff, float:3.57E-43)
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r6 <= r1) goto L_0x0033
            r0 = 255(0xff, float:3.57E-43)
        L_0x0033:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p164a.C3462f.m10032a(int, int, int, int):int");
    }

    /* renamed from: b */
    public final SpannableString mo7425b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10738l);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f10731A != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f10731A, length, 33);
            }
            if (this.f10732B != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f10732B, length, 33);
            }
            if (this.f10733C != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f10734D), this.f10733C, length, 33);
            }
            if (this.f10735E != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f10736F), this.f10735E, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: c */
    public final void mo7426c(char c) {
        if (c == 10) {
            this.f10737k.add(mo7425b());
            this.f10738l.clear();
            if (this.f10731A != -1) {
                this.f10731A = 0;
            }
            if (this.f10732B != -1) {
                this.f10732B = 0;
            }
            if (this.f10733C != -1) {
                this.f10733C = 0;
            }
            if (this.f10735E != -1) {
                this.f10735E = 0;
            }
            while (true) {
                if ((this.f10747u && this.f10737k.size() >= this.f10746t) || this.f10737k.size() >= 15) {
                    this.f10737k.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.f10738l.append(c);
        }
    }

    /* renamed from: d */
    public final void mo7427d() {
        this.f10737k.clear();
        this.f10738l.clear();
        this.f10731A = -1;
        this.f10732B = -1;
        this.f10733C = -1;
        this.f10735E = -1;
        this.f10752z = 0;
    }

    /* renamed from: e */
    public final void mo7428e() {
        mo7427d();
        this.f10739m = false;
        this.f10740n = false;
        this.f10741o = 4;
        this.f10742p = false;
        this.f10743q = 0;
        this.f10744r = 0;
        this.f10745s = 0;
        this.f10746t = 15;
        this.f10747u = true;
        this.f10748v = 0;
        this.f10749w = 0;
        this.f10750x = 0;
        int i = f10722b;
        this.f10751y = i;
        this.f10734D = f10721a;
        this.f10736F = i;
    }

    /* renamed from: f */
    public final boolean mo7429f() {
        if (this.f10739m) {
            return this.f10737k.isEmpty() && this.f10738l.length() == 0;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo7430g(boolean z, boolean z2) {
        if (this.f10731A != -1) {
            if (!z) {
                this.f10738l.setSpan(new StyleSpan(2), this.f10731A, this.f10738l.length(), 33);
                this.f10731A = -1;
            }
        } else if (z) {
            this.f10731A = this.f10738l.length();
        }
        if (this.f10732B != -1) {
            if (!z2) {
                this.f10738l.setSpan(new UnderlineSpan(), this.f10732B, this.f10738l.length(), 33);
                this.f10732B = -1;
            }
        } else if (z2) {
            this.f10732B = this.f10738l.length();
        }
    }

    /* renamed from: h */
    public final void mo7431h(int i, int i2) {
        if (!(this.f10733C == -1 || this.f10734D == i)) {
            this.f10738l.setSpan(new ForegroundColorSpan(this.f10734D), this.f10733C, this.f10738l.length(), 33);
        }
        if (i != f10721a) {
            this.f10733C = this.f10738l.length();
            this.f10734D = i;
        }
        if (!(this.f10735E == -1 || this.f10736F == i2)) {
            this.f10738l.setSpan(new BackgroundColorSpan(this.f10736F), this.f10735E, this.f10738l.length(), 33);
        }
        if (i2 != f10722b) {
            this.f10735E = this.f10738l.length();
            this.f10736F = i2;
        }
    }
}
