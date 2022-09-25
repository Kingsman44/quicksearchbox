package androidx.slice;

import android.database.ContentObserver;
import android.os.AsyncTask;
import android.os.Handler;

/* renamed from: androidx.slice.q */
/* compiled from: PG */
final class C4118q extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C4119r f13154a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4118q(C4119r rVar, Handler handler) {
        super(handler);
        this.f13154a = rVar;
    }

    public final void onChange(boolean z) {
        AsyncTask.execute(this.f13154a.f13158d);
    }
}
