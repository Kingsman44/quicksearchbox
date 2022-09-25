package androidx.emoji.p108a;

import android.graphics.Typeface;
import androidx.core.p097i.C1974i;
import androidx.p191s.p192a.p193a.C4081b;

/* renamed from: androidx.emoji.a.y */
/* compiled from: PG */
public final class C2215y {

    /* renamed from: a */
    public final C4081b f6265a;

    /* renamed from: b */
    public final char[] f6266b;

    /* renamed from: c */
    public final C2214x f6267c;

    /* renamed from: d */
    public final Typeface f6268d;

    C2215y() {
        this.f6268d = null;
        this.f6265a = null;
        this.f6267c = new C2214x(1024);
        this.f6266b = new char[0];
    }

    public C2215y(Typeface typeface, C4081b bVar) {
        this.f6268d = typeface;
        this.f6265a = bVar;
        this.f6267c = new C2214x(1024);
        int a = bVar.mo8579a();
        this.f6266b = new char[(a + a)];
        int a2 = bVar.mo8579a();
        for (int i = 0; i < a2; i++) {
            C2201k kVar = new C2201k(this, i);
            Character.toChars(kVar.mo5518a().mo8577c(), this.f6266b, i + i);
            C1974i.m5314b(kVar.mo5518a().mo8576b() > 0, "invalid metadata codepoint length");
            this.f6267c.mo5529b(kVar, 0, kVar.mo5518a().mo8576b() - 1);
        }
    }
}
