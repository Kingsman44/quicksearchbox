package androidx.media3.common;

import java.io.IOException;

/* renamed from: androidx.media3.common.az */
/* compiled from: PG */
public class C2599az extends IOException {

    /* renamed from: a */
    public final boolean f7216a;

    /* renamed from: b */
    public final int f7217b;

    protected C2599az(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f7216a = z;
        this.f7217b = i;
    }

    /* renamed from: a */
    public static C2599az m6819a(String str, Throwable th) {
        return new C2599az(str, th, true, 1);
    }

    /* renamed from: b */
    public static C2599az m6820b(String str, Throwable th) {
        return new C2599az(str, th, true, 0);
    }

    /* renamed from: c */
    public static C2599az m6821c(String str, Throwable th) {
        return new C2599az(str, th, true, 4);
    }

    /* renamed from: d */
    public static C2599az m6822d(String str) {
        return new C2599az(str, (Throwable) null, false, 1);
    }
}
