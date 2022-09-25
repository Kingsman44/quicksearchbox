package com.google.android.libraries.gsa.conversation.p1837a;

import android.media.MediaPlayer;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.gsa.conversation.a.ac */
/* compiled from: PG */
final class C22312ac extends C22334o {

    /* renamed from: a */
    public final C60888db f61615a;

    /* renamed from: b */
    public final C22343x f61616b;

    /* renamed from: c */
    private final C60870cx f61617c;

    /* renamed from: d */
    private final Object f61618d = new Object();

    /* renamed from: e */
    private C60870cx f61619e;

    public C22312ac(C60888db dbVar, C22343x xVar, C60870cx cxVar) {
        this.f61615a = dbVar;
        this.f61616b = xVar;
        this.f61617c = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C22333n mo27546a() {
        return C22333n.OUTPUT;
    }

    /* renamed from: b */
    public final C60870cx mo27547b() {
        C60870cx h;
        synchronized (this.f61618d) {
            if (this.f61619e == null) {
                h = C60922j.m93045h(this.f61617c, C47810es.m84966f(new C22310aa(this)), C60826bg.f164896a);
                this.f61619e = h;
            } else {
                throw new IllegalStateException("Already executed once");
            }
        }
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C60870cx mo27548c() {
        MediaPlayer mediaPlayer;
        synchronized (this.f61618d) {
            C60870cx cxVar = this.f61619e;
            if (cxVar != null) {
                cxVar.cancel(false);
            }
        }
        this.f61617c.cancel(false);
        C22343x xVar = this.f61616b;
        synchronized (xVar.f61680c) {
            if (xVar.f61684g && (mediaPlayer = xVar.f61682e) != null) {
                mediaPlayer.stop();
                C2164c cVar = xVar.f61683f;
                if (cVar != null) {
                    cVar.mo5438c();
                }
            }
            xVar.mo27568a();
        }
        return C118826c.f331423b;
    }
}
