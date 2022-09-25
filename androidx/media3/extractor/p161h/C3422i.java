package androidx.media3.extractor.p161h;

import androidx.media3.common.p136b.C2604ac;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.h.i */
/* compiled from: PG */
final class C3422i implements C3419f {

    /* renamed from: a */
    private final C2604ac f10484a;

    /* renamed from: b */
    private final int f10485b;

    /* renamed from: c */
    private final int f10486c;

    /* renamed from: d */
    private int f10487d;

    /* renamed from: e */
    private int f10488e;

    public C3422i(C3415b bVar) {
        C2604ac acVar = bVar.f10462a;
        this.f10484a = acVar;
        acVar.mo6131A(12);
        this.f10486c = acVar.mo6141i() & PrivateKeyType.INVALID;
        this.f10485b = acVar.mo6141i();
    }

    /* renamed from: a */
    public final int mo7387a() {
        return -1;
    }

    /* renamed from: b */
    public final int mo7388b() {
        return this.f10485b;
    }

    /* renamed from: c */
    public final int mo7389c() {
        int i = this.f10486c;
        if (i == 8) {
            return this.f10484a.mo6139g();
        }
        if (i == 16) {
            return this.f10484a.mo6142j();
        }
        int i2 = this.f10487d;
        this.f10487d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f10488e & 15;
        }
        int g = this.f10484a.mo6139g();
        this.f10488e = g;
        return (g & 240) >> 4;
    }
}
