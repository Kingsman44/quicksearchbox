package androidx.mediarouter.p175a;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* renamed from: androidx.mediarouter.a.bo */
/* compiled from: PG */
final class C3706bo implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final Messenger f11904a;

    /* renamed from: b */
    public final C3709br f11905b;

    /* renamed from: c */
    public int f11906c = 1;

    /* renamed from: d */
    public int f11907d = 1;

    /* renamed from: e */
    public int f11908e;

    /* renamed from: f */
    public int f11909f;

    /* renamed from: g */
    public final SparseArray f11910g = new SparseArray();

    /* renamed from: h */
    final /* synthetic */ C3713bv f11911h;

    /* renamed from: i */
    private final Messenger f11912i;

    public C3706bo(C3713bv bvVar, Messenger messenger) {
        this.f11911h = bvVar;
        this.f11904a = messenger;
        C3709br brVar = new C3709br(this);
        this.f11905b = brVar;
        this.f11912i = new Messenger(brVar);
    }

    /* renamed from: a */
    public final void mo7804a(int i) {
        int i2 = this.f11906c;
        this.f11906c = i2 + 1;
        mo7811g(4, i2, i, (Object) null, (Bundle) null);
    }

    /* renamed from: b */
    public final void mo7805b(int i) {
        int i2 = this.f11906c;
        this.f11906c = i2 + 1;
        mo7811g(5, i2, i, (Object) null, (Bundle) null);
    }

    public final void binderDied() {
        this.f11911h.f11932c.post(new C3705bn(this));
    }

    /* renamed from: c */
    public final void mo7807c(C3740m mVar) {
        int i = this.f11906c;
        this.f11906c = i + 1;
        mo7811g(10, i, 0, mVar != null ? mVar.f12010a : null, (Bundle) null);
    }

    /* renamed from: d */
    public final void mo7808d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.f11906c;
        this.f11906c = i3 + 1;
        mo7811g(7, i3, i, (Object) null, bundle);
    }

    /* renamed from: e */
    public final void mo7809e(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("unselectReason", i2);
        int i3 = this.f11906c;
        this.f11906c = i3 + 1;
        mo7811g(6, i3, i, (Object) null, bundle);
    }

    /* renamed from: f */
    public final void mo7810f(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.f11906c;
        this.f11906c = i3 + 1;
        mo7811g(8, i3, i, (Object) null, bundle);
    }

    /* renamed from: g */
    public final boolean mo7811g(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        obtain.replyTo = this.f11912i;
        try {
            this.f11904a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }
}
