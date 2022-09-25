package androidx.slice.widget;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.C4121t;

/* renamed from: androidx.slice.widget.ak */
/* compiled from: PG */
final class C4133ak extends LiveData {

    /* renamed from: h */
    final C4114m f13275h;

    /* renamed from: i */
    Uri f13276i;

    /* renamed from: j */
    final C4113l f13277j = new C4131ai(this);

    /* renamed from: k */
    private final Runnable f13278k = new C4132aj(this);

    public C4133ak(Context context, Uri uri) {
        this.f13275h = new C4121t(context);
        this.f13276i = uri;
    }

    /* renamed from: b */
    static final void m11863b(Throwable th) {
        Log.e("SliceLiveData", "Error binding slice", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        AsyncTask.execute(this.f13278k);
        Uri uri = this.f13276i;
        if (uri != null) {
            this.f13275h.mo8628c(uri, this.f13277j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        Uri uri = this.f13276i;
        if (uri != null) {
            this.f13275h.mo8630e(uri, this.f13277j);
        }
    }
}
