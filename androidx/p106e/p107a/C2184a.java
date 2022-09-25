package androidx.p106e.p107a;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: androidx.e.a.a */
/* compiled from: PG */
final class C2184a extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C2186c f6198a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2184a(C2186c cVar) {
        super(new Handler());
        this.f6198a = cVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        C2186c cVar = this.f6198a;
        if (cVar.f6202c && (cursor = cVar.f6203d) != null && !cursor.isClosed()) {
            cVar.f6201b = cVar.f6203d.requery();
        }
    }
}
