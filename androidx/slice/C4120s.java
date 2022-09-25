package androidx.slice;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Pair;

/* renamed from: androidx.slice.s */
/* compiled from: PG */
public abstract class C4120s extends C4114m {

    /* renamed from: a */
    protected final Context f13162a;

    /* renamed from: b */
    private final ArrayMap f13163b = new ArrayMap();

    public C4120s(Context context) {
        this.f13162a = context;
    }

    /* renamed from: c */
    public final void mo8628c(Uri uri, C4113l lVar) {
        C4119r rVar = new C4119r(this, uri, new C4115n(new Handler(Looper.getMainLooper())), lVar);
        Pair pair = new Pair(uri, lVar);
        synchronized (this.f13163b) {
            C4119r rVar2 = (C4119r) this.f13163b.put(pair, rVar);
            if (rVar2 != null) {
                rVar2.mo8635a();
            }
        }
        ContentProviderClient acquireContentProviderClient = rVar.f13160f.f13162a.getContentResolver().acquireContentProviderClient(rVar.f13155a);
        if (acquireContentProviderClient != null) {
            acquireContentProviderClient.release();
            rVar.f13160f.f13162a.getContentResolver().registerContentObserver(rVar.f13155a, true, rVar.f13159e);
            rVar.mo8636b();
        }
    }

    /* renamed from: e */
    public final void mo8630e(Uri uri, C4113l lVar) {
        synchronized (this.f13163b) {
            C4119r rVar = (C4119r) this.f13163b.remove(new Pair(uri, lVar));
            if (rVar != null) {
                rVar.mo8635a();
            }
        }
    }
}
