package com.android.p271h.p272a;

import android.graphics.Bitmap;
import android.util.Log;

/* renamed from: com.android.h.a.b */
/* compiled from: PG */
final class C5154b extends Thread {

    /* renamed from: a */
    final /* synthetic */ C5157e f16369a;

    public C5154b(C5157e eVar) {
        this.f16369a = eVar;
    }

    public final void run() {
        C5153a a;
        loop0:
        while (!isInterrupted()) {
            try {
                synchronized (this.f16369a.f16389n) {
                    while (true) {
                        a = this.f16369a.f16392q.mo10228a();
                        if (a != null) {
                            break;
                        }
                        this.f16369a.f16389n.wait();
                    }
                }
                C5157e eVar = this.f16369a;
                synchronized (eVar.f16389n) {
                    if (a.f16367p == 2) {
                        a.f16367p = 4;
                        try {
                            Bitmap bitmap = (Bitmap) C5157e.f16371a.mo5126a();
                            if (!(bitmap == null || bitmap.getWidth() == a.f16368q.f16377b)) {
                                bitmap = null;
                            }
                            a.f16366o = a.f16368q.f16378c.getTile(a.f16364m, a.f16362i, a.f16363l, bitmap);
                        } catch (Throwable th) {
                            Log.w("TiledImageRenderer", "fail to decode tile", th);
                        }
                        Bitmap bitmap2 = a.f16366o;
                        synchronized (eVar.f16389n) {
                            if (a.f16367p == 32) {
                                a.f16367p = 64;
                                Bitmap bitmap3 = a.f16366o;
                                if (bitmap3 != null) {
                                    C5157e.f16371a.mo5127b(bitmap3);
                                    a.f16366o = null;
                                }
                                eVar.f16390o.mo10229b(a);
                            } else {
                                a.f16367p = bitmap2 == null ? 16 : 8;
                                if (bitmap2 != null) {
                                    eVar.f16391p.mo10229b(a);
                                    eVar.f16376E.postInvalidate();
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
