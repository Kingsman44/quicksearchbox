package com.facebook.litho;

import android.graphics.Rect;
import com.facebook.p313c.C6060s;
import java.util.Map;

/* renamed from: com.facebook.litho.de */
/* compiled from: PG */
public final class C6185de implements Cloneable {

    /* renamed from: a */
    public final C6411u f18251a;

    /* renamed from: b */
    public final String f18252b;

    /* renamed from: c */
    public final C6248ev f18253c;

    /* renamed from: d */
    public final C6383hh f18254d;

    /* renamed from: e */
    public final C6407q f18255e;

    /* renamed from: f */
    public final Rect f18256f;

    /* renamed from: g */
    public final int f18257g;

    /* renamed from: h */
    public final int f18258h;

    /* renamed from: i */
    public final int f18259i;

    /* renamed from: j */
    public final C6367gt f18260j;

    /* renamed from: k */
    public final long f18261k;

    /* renamed from: l */
    public int f18262l;

    /* renamed from: m */
    public long f18263m;

    /* renamed from: n */
    public int f18264n = 0;

    /* renamed from: o */
    private final int f18265o;

    /* renamed from: p */
    private final int f18266p;

    public C6185de(C6248ev evVar, C6383hh hhVar, C6407q qVar, String str, Rect rect, int i, int i2, int i3, long j, int i4, int i5, C6367gt gtVar) {
        if (qVar != null) {
            this.f18253c = evVar;
            this.f18254d = hhVar;
            this.f18255e = qVar;
            this.f18252b = str;
            this.f18251a = qVar.f18995r;
            this.f18256f = rect;
            this.f18265o = i;
            this.f18266p = i2;
            this.f18257g = i3;
            this.f18261k = j;
            this.f18258h = i4 == 8 ? 1 : i4;
            this.f18259i = i5;
            this.f18260j = gtVar;
            return;
        }
        throw new RuntimeException("Trying to set a null Component on a LayoutOutput!");
    }

    /* renamed from: b */
    static boolean m16310b(int i) {
        return (i & 8) != 0;
    }

    /* renamed from: d */
    static boolean m16311d(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: f */
    static C6060s m16312f(C6185de deVar, C6060s sVar, Map map) {
        C6201du duVar = new C6201du(deVar);
        Rect rect = new Rect();
        deVar.mo13156e(rect);
        C6383hh hhVar = deVar.f18254d;
        return new C6060s(sVar, duVar, map, rect, hhVar != null ? hhVar.f18889c : null, sVar != null ? sVar.mo12651a() : 0);
    }

    /* renamed from: a */
    public final int mo13154a() {
        long j = this.f18263m;
        if (j == 0) {
            return 3;
        }
        return (int) ((j >> 16) & 7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo13155c() {
        if (this.f18258h == 2) {
            return false;
        }
        C6248ev evVar = this.f18253c;
        return (evVar != null && evVar.mo13074ap()) || this.f18255e.mo12819aj();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo13156e(Rect rect) {
        rect.left = this.f18256f.left - this.f18265o;
        rect.top = this.f18256f.top - this.f18266p;
        rect.right = this.f18256f.right - this.f18265o;
        rect.bottom = this.f18256f.bottom - this.f18266p;
    }
}
