package androidx.emoji.p108a;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: androidx.emoji.a.r */
/* compiled from: PG */
final class C2208r extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C2210t f6252a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2208r(C2210t tVar, Handler handler) {
        super(handler);
        this.f6252a = tVar;
    }

    public final void onChange(boolean z, Uri uri) {
        this.f6252a.mo5527a();
    }
}
