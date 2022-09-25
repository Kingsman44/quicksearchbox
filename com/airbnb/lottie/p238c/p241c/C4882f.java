package com.airbnb.lottie.p238c.p241c;

import com.airbnb.lottie.C4964k;
import com.airbnb.lottie.p238c.p239a.C4844b;
import com.airbnb.lottie.p238c.p239a.C4852j;
import com.airbnb.lottie.p238c.p239a.C4853k;
import com.airbnb.lottie.p238c.p239a.C4854l;
import com.evernote.android.state.BuildConfig;
import java.util.List;
import java.util.Locale;

/* renamed from: com.airbnb.lottie.c.c.f */
/* compiled from: PG */
public final class C4882f {

    /* renamed from: a */
    public final List f15570a;

    /* renamed from: b */
    public final C4964k f15571b;

    /* renamed from: c */
    public final String f15572c;

    /* renamed from: d */
    public final long f15573d;

    /* renamed from: e */
    public final long f15574e;

    /* renamed from: f */
    public final String f15575f;

    /* renamed from: g */
    public final List f15576g;

    /* renamed from: h */
    public final C4854l f15577h;

    /* renamed from: i */
    public final int f15578i;

    /* renamed from: j */
    public final int f15579j;

    /* renamed from: k */
    public final int f15580k;

    /* renamed from: l */
    public final float f15581l;

    /* renamed from: m */
    public final float f15582m;

    /* renamed from: n */
    public final int f15583n;

    /* renamed from: o */
    public final int f15584o;

    /* renamed from: p */
    public final C4852j f15585p;

    /* renamed from: q */
    public final C4853k f15586q;

    /* renamed from: r */
    public final C4844b f15587r;

    /* renamed from: s */
    public final List f15588s;

    /* renamed from: t */
    public final boolean f15589t;

    /* renamed from: u */
    public final int f15590u;

    /* renamed from: v */
    public final int f15591v;

    public C4882f(List list, C4964k kVar, String str, long j, int i, long j2, String str2, List list2, C4854l lVar, int i2, int i3, int i4, float f, float f2, int i5, int i6, C4852j jVar, C4853k kVar2, List list3, int i7, C4844b bVar, boolean z) {
        this.f15570a = list;
        this.f15571b = kVar;
        this.f15572c = str;
        this.f15573d = j;
        this.f15590u = i;
        this.f15574e = j2;
        this.f15575f = str2;
        this.f15576g = list2;
        this.f15577h = lVar;
        this.f15578i = i2;
        this.f15579j = i3;
        this.f15580k = i4;
        this.f15581l = f;
        this.f15582m = f2;
        this.f15583n = i5;
        this.f15584o = i6;
        this.f15585p = jVar;
        this.f15586q = kVar2;
        this.f15588s = list3;
        this.f15591v = i7;
        this.f15587r = bVar;
        this.f15589t = z;
    }

    /* renamed from: a */
    public final String mo9819a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f15572c);
        sb.append("\n");
        C4882f b = this.f15571b.mo9906b(this.f15574e);
        if (b != null) {
            sb.append("\t\tParents: ");
            sb.append(b.f15572c);
            C4882f b2 = this.f15571b.mo9906b(b.f15574e);
            while (b2 != null) {
                sb.append("->");
                sb.append(b2.f15572c);
                b2 = this.f15571b.mo9906b(b2.f15574e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.f15576g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.f15576g.size());
            sb.append("\n");
        }
        if (!(this.f15578i == 0 || this.f15579j == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f15578i), Integer.valueOf(this.f15579j), Integer.valueOf(this.f15580k)}));
        }
        if (!this.f15570a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object next : this.f15570a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return mo9819a(BuildConfig.FLAVOR);
    }
}
