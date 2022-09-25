package androidx.media3.exoplayer.video.p153a;

import android.view.Surface;
import androidx.media3.exoplayer.C2845bo;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.video.a.o */
/* compiled from: PG */
public final /* synthetic */ class C3290o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3292q f9894a;

    public /* synthetic */ C3290o(C3292q qVar) {
        this.f9894a = qVar;
    }

    public final void run() {
        C3292q qVar = this.f9894a;
        Surface surface = qVar.f9910e;
        if (surface != null) {
            Iterator it = qVar.f9906a.iterator();
            while (it.hasNext()) {
                ((C2845bo) it.next()).mo6572c();
            }
        }
        C3292q.m9544a(qVar.f9909d, surface);
        qVar.f9909d = null;
        qVar.f9910e = null;
    }
}
