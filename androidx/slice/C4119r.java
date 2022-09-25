package androidx.slice;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: androidx.slice.r */
/* compiled from: PG */
final class C4119r {

    /* renamed from: a */
    final Uri f13155a;

    /* renamed from: b */
    final Executor f13156b;

    /* renamed from: c */
    final C4113l f13157c;

    /* renamed from: d */
    final Runnable f13158d = new C4117p(this);

    /* renamed from: e */
    public final ContentObserver f13159e = new C4118q(this, new Handler(Looper.getMainLooper()));

    /* renamed from: f */
    final /* synthetic */ C4120s f13160f;

    /* renamed from: g */
    private boolean f13161g;

    public C4119r(C4120s sVar, Uri uri, Executor executor, C4113l lVar) {
        this.f13160f = sVar;
        this.f13155a = uri;
        this.f13156b = executor;
        this.f13157c = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8635a() {
        this.f13160f.f13162a.getContentResolver().unregisterContentObserver(this.f13159e);
        if (this.f13161g) {
            this.f13160f.mo8629d(this.f13155a);
            this.f13161g = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8636b() {
        if (!this.f13161g) {
            try {
                this.f13160f.mo8627b(this.f13155a);
                this.f13161g = true;
            } catch (SecurityException unused) {
            }
        }
    }
}
