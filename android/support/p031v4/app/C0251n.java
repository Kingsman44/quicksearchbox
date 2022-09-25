package android.support.p031v4.app;

import android.content.Context;
import androidx.core.p094f.C1893f;

/* renamed from: android.support.v4.app.n */
/* compiled from: PG */
final class C0251n extends C0252o {

    /* renamed from: c */
    private final boolean f910c;

    /* renamed from: d */
    private boolean f911d = false;

    /* renamed from: e */
    private C0168an f912e;

    public C0251n(C0238dc dcVar, C1893f fVar, boolean z) {
        super(dcVar, fVar);
        this.f910c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0168an mo765a(Context context) {
        if (this.f911d) {
            return this.f912e;
        }
        C0238dc dcVar = this.f913a;
        C0168an a = C0170ap.m370a(context, dcVar.f872a, dcVar.f876e == 2, this.f910c);
        this.f912e = a;
        this.f911d = true;
        return a;
    }
}
