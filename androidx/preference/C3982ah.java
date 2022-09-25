package androidx.preference;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: androidx.preference.ah */
/* compiled from: PG */
final class C3982ah extends C0642fd {

    /* renamed from: a */
    private final C0640fb f12801a;

    /* renamed from: b */
    private final RecyclerView f12802b;

    /* renamed from: c */
    private final Preference f12803c;

    public C3982ah(C0640fb fbVar, RecyclerView recyclerView, Preference preference) {
        this.f12801a = fbVar;
        this.f12802b = recyclerView;
        this.f12803c = preference;
    }

    /* renamed from: h */
    private final void m11478h() {
        this.f12801a.mObservable.unregisterObserver(this);
        int b = ((C3985ak) this.f12801a).mo8417b(this.f12803c);
        if (b != -1) {
            this.f12802b.scrollToPosition(b);
        }
    }

    /* renamed from: a */
    public final void mo2831a() {
        m11478h();
    }

    /* renamed from: b */
    public final void mo2832b(int i, int i2) {
        m11478h();
    }

    /* renamed from: c */
    public final void mo2833c(int i, int i2, Object obj) {
        m11478h();
    }

    /* renamed from: d */
    public final void mo2834d(int i, int i2) {
        m11478h();
    }

    /* renamed from: e */
    public final void mo2835e(int i, int i2) {
        m11478h();
    }

    /* renamed from: g */
    public final void mo2837g(int i, int i2) {
        m11478h();
    }
}
