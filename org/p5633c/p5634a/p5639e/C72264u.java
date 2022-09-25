package org.p5633c.p5634a.p5639e;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.util.Arrays;
import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.C72295s;

/* renamed from: org.c.a.e.u */
/* compiled from: PG */
public final class C72264u {

    /* renamed from: a */
    public final C72132a f192278a;

    /* renamed from: b */
    public C72288l f192279b;

    /* renamed from: c */
    public Integer f192280c;

    /* renamed from: d */
    public final Locale f192281d;

    /* renamed from: e */
    public C72262s[] f192282e = new C72262s[8];

    /* renamed from: f */
    public int f192283f;

    /* renamed from: g */
    public boolean f192284g;

    /* renamed from: h */
    public Object f192285h;

    public C72264u(C72132a aVar, Locale locale) {
        C72132a c = C72285i.m106775c(aVar);
        this.f192279b = c.mo63325C();
        this.f192278a = c.mo63347d();
        this.f192281d = locale == null ? Locale.getDefault() : locale;
    }

    /* renamed from: a */
    static int m106664a(C72291o oVar, C72291o oVar2) {
        if (oVar == null || !oVar.mo63566i()) {
            return (oVar2 == null || !oVar2.mo63566i()) ? 0 : -1;
        }
        if (oVar2 == null || !oVar2.mo63566i()) {
            return 1;
        }
        return -oVar.compareTo(oVar2);
    }

    /* renamed from: b */
    public final Object mo63638b() {
        if (this.f192285h == null) {
            this.f192285h = new C72263t(this);
        }
        return this.f192285h;
    }

    /* renamed from: c */
    public final void mo63639c(C72262s sVar) {
        C72262s[] sVarArr = this.f192282e;
        int i = this.f192283f;
        int length = sVarArr.length;
        if (i == length || this.f192284g) {
            if (i == length) {
                length = i + i;
            }
            C72262s[] sVarArr2 = new C72262s[length];
            System.arraycopy(sVarArr, 0, sVarArr2, 0, i);
            this.f192282e = sVarArr2;
            this.f192284g = false;
            sVarArr = sVarArr2;
        }
        this.f192285h = null;
        sVarArr[i] = sVar;
        this.f192283f = i + 1;
    }

    /* renamed from: d */
    public final void mo63640d(C72283g gVar, int i) {
        mo63639c(new C72262s(gVar.mo63646a(this.f192278a), i));
    }

    /* renamed from: e */
    public final long mo63641e(String str) {
        C72262s[] sVarArr = this.f192282e;
        int i = this.f192283f;
        if (this.f192284g) {
            sVarArr = (C72262s[]) sVarArr.clone();
            this.f192282e = sVarArr;
            this.f192284g = false;
        }
        if (i > 10) {
            Arrays.sort(sVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (sVarArr[i4].compareTo(sVarArr[i3]) <= 0) {
                        break;
                    }
                    C72262s sVar = sVarArr[i3];
                    sVarArr[i3] = sVarArr[i4];
                    sVarArr[i4] = sVar;
                    i3 = i4;
                }
            }
        }
        long j = 0;
        if (i > 0) {
            C72291o a = C72293q.f192440e.mo63674a(this.f192278a);
            C72291o a2 = C72293q.f192442g.mo63674a(this.f192278a);
            C72291o A = sVarArr[0].f192269a.mo63464A();
            if (m106664a(A, a) >= 0 && m106664a(A, a2) <= 0) {
                mo63640d(C72283g.f192391g, SimpleSnackbar.LENGTH_SHORT);
                return mo63641e(str);
            }
        }
        int i5 = 0;
        while (i5 < i) {
            try {
                j = sVarArr[i5].mo63636b(j, true);
                i5++;
            } catch (C72294r e) {
                if (str != null) {
                    String str2 = "Cannot parse \"" + str + "\"";
                    String str3 = e.f192449a;
                    if (str3 == null) {
                        e.f192449a = str2;
                    } else {
                        e.f192449a = str2 + ": " + str3;
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            j = sVarArr[i6].mo63636b(j, i6 == i + -1);
            i6++;
        }
        Integer num = this.f192280c;
        if (num != null) {
            return j - ((long) num.intValue());
        }
        C72288l lVar = this.f192279b;
        if (lVar == null) {
            return j;
        }
        int i7 = lVar.mo63661i(j);
        long j2 = j - ((long) i7);
        if (i7 == this.f192279b.mo37823a(j2)) {
            return j2;
        }
        String str4 = "Illegal instant due to time zone offset transition (" + String.valueOf(this.f192279b) + ")";
        if (str != null) {
            str4 = "Cannot parse \"" + str + "\": " + str4;
        }
        throw new C72295s(str4);
    }

    /* renamed from: f */
    public final void mo63642f(Object obj) {
        if (obj instanceof C72263t) {
            C72263t tVar = (C72263t) obj;
            if (this == tVar.f192277e) {
                this.f192279b = tVar.f192273a;
                this.f192280c = tVar.f192274b;
                this.f192282e = tVar.f192275c;
                int i = tVar.f192276d;
                if (i < this.f192283f) {
                    this.f192284g = true;
                }
                this.f192283f = i;
                this.f192285h = obj;
            }
        }
    }
}
