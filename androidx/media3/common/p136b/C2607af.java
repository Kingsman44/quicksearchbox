package androidx.media3.common.p136b;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.common.b.af */
/* compiled from: PG */
final class C2607af implements C2626n {

    /* renamed from: a */
    private static final List f7238a = new ArrayList(50);

    /* renamed from: b */
    private final Handler f7239b;

    public C2607af(Handler handler) {
        this.f7239b = handler;
    }

    /* renamed from: l */
    public static void m6885l(C2606ae aeVar) {
        List list = f7238a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(aeVar);
            }
        }
    }

    /* renamed from: m */
    private static C2606ae m6886m() {
        C2606ae aeVar;
        List list = f7238a;
        synchronized (list) {
            if (list.isEmpty()) {
                aeVar = new C2606ae();
            } else {
                aeVar = (C2606ae) list.remove(list.size() - 1);
            }
        }
        return aeVar;
    }

    /* renamed from: a */
    public final C2606ae mo6162a(int i) {
        C2606ae m = m6886m();
        m.f7237a = this.f7239b.obtainMessage(i);
        return m;
    }

    /* renamed from: b */
    public final C2606ae mo6163b(int i, Object obj) {
        C2606ae m = m6886m();
        m.f7237a = this.f7239b.obtainMessage(i, obj);
        return m;
    }

    /* renamed from: c */
    public final C2606ae mo6164c(int i, int i2, int i3) {
        C2606ae m = m6886m();
        m.f7237a = this.f7239b.obtainMessage(i, i2, i3);
        return m;
    }

    /* renamed from: d */
    public final boolean mo6165d() {
        return this.f7239b.hasMessages(0);
    }

    /* renamed from: e */
    public final C2606ae mo6166e(int i, Object obj) {
        C2606ae m = m6886m();
        m.f7237a = this.f7239b.obtainMessage(20, 0, i, obj);
        return m;
    }

    /* renamed from: f */
    public final void mo6167f(Runnable runnable) {
        this.f7239b.post(runnable);
    }

    /* renamed from: g */
    public final void mo6168g() {
        this.f7239b.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: h */
    public final void mo6169h() {
        this.f7239b.removeMessages(2);
    }

    /* renamed from: i */
    public final void mo6170i(int i) {
        this.f7239b.sendEmptyMessage(i);
    }

    /* renamed from: j */
    public final void mo6171j(long j) {
        this.f7239b.sendEmptyMessageAtTime(2, j);
    }

    /* renamed from: k */
    public final void mo6172k(C2606ae aeVar) {
        Handler handler = this.f7239b;
        Message message = aeVar.f7237a;
        message.getClass();
        handler.sendMessageAtFrontOfQueue(message);
        aeVar.f7237a = null;
        m6885l(aeVar);
    }
}
