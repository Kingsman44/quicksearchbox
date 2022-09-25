package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.p060c.C0981k;
import androidx.p060c.C0985o;
import com.airbnb.lottie.p238c.p241c.C4882f;
import com.airbnb.lottie.p245f.C4946c;
import com.airbnb.lottie.p245f.C4947d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.k */
/* compiled from: PG */
public final class C4964k {

    /* renamed from: a */
    public final C4834al f15752a = new C4834al();

    /* renamed from: b */
    public Map f15753b;

    /* renamed from: c */
    public Map f15754c;

    /* renamed from: d */
    public Map f15755d;

    /* renamed from: e */
    public C0985o f15756e;

    /* renamed from: f */
    public C0981k f15757f;

    /* renamed from: g */
    public List f15758g;

    /* renamed from: h */
    public Rect f15759h;

    /* renamed from: i */
    public float f15760i;

    /* renamed from: j */
    public float f15761j;

    /* renamed from: k */
    public float f15762k;

    /* renamed from: l */
    public int f15763l = 0;

    /* renamed from: m */
    private final HashSet f15764m = new HashSet();

    /* renamed from: a */
    public final float mo9905a() {
        return (float) ((long) (((this.f15761j - this.f15760i) / this.f15762k) * 1000.0f));
    }

    /* renamed from: b */
    public final C4882f mo9906b(long j) {
        return (C4882f) this.f15757f.mo3678e(j);
    }

    /* renamed from: c */
    public final void mo9907c(String str) {
        ((C4946c) C4947d.f15711a).mo9784a(str, (Throwable) null);
        this.f15764m.add(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C4882f a : this.f15758g) {
            sb.append(a.mo9819a("\t"));
        }
        return sb.toString();
    }
}
