package androidx.core.p096h;

/* renamed from: androidx.core.h.m */
/* compiled from: PG */
abstract class C1960m implements C1956i {

    /* renamed from: a */
    private final C1959l f5876a;

    public C1960m(C1959l lVar) {
        this.f5876a = lVar;
    }

    /* renamed from: a */
    public final boolean mo5116a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C1959l lVar = this.f5876a;
        if (lVar == null) {
            return mo5118b();
        }
        int a = lVar.mo5117a(charSequence, i);
        if (a == 0) {
            return true;
        }
        if (a != 1) {
            return mo5118b();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo5118b();
}
