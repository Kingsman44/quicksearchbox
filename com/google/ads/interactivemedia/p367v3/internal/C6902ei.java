package com.google.ads.interactivemedia.p367v3.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ei */
/* compiled from: PG */
final class C6902ei implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, afu, C6983hi, C6817be, C6813ba, C6905el, C6889dw {

    /* renamed from: a */
    final /* synthetic */ C6903ej f21990a;

    public /* synthetic */ C6902ei(C6903ej ejVar) {
        this.f21990a = ejVar;
    }

    /* renamed from: A */
    public final void mo15798A(String str, long j, long j2) {
        Iterator it = this.f21990a.f22008j.iterator();
        while (it.hasNext()) {
            ((C6983hi) it.next()).mo15798A(str, j, j2);
        }
    }

    /* renamed from: B */
    public final void mo15799B(C6864cy cyVar) {
        this.f21990a.f22017s = cyVar;
        Iterator it = this.f21990a.f22008j.iterator();
        while (it.hasNext()) {
            ((C6983hi) it.next()).mo15799B(cyVar);
        }
    }

    /* renamed from: C */
    public final void mo15800C(long j) {
        Iterator it = this.f21990a.f22008j.iterator();
        while (it.hasNext()) {
            ((C6983hi) it.next()).mo15800C(j);
        }
    }

    /* renamed from: D */
    public final void mo15801D(int i, long j, long j2) {
        Iterator it = this.f21990a.f22008j.iterator();
        while (it.hasNext()) {
            ((C6983hi) it.next()).mo15801D(i, j, j2);
        }
    }

    /* renamed from: E */
    public final void mo15802E(C7022iu iuVar) {
        Iterator it = this.f21990a.f22008j.iterator();
        while (it.hasNext()) {
            ((C6983hi) it.next()).mo15802E(iuVar);
        }
        this.f21990a.f22017s = null;
        this.f21990a.f21991A = null;
        this.f21990a.f21992B = 0;
    }

    /* renamed from: F */
    public final void mo15803F(boolean z) {
        if (this.f21990a.f21995E != z) {
            this.f21990a.f21995E = z;
            C6903ej.m20245E(this.f21990a);
        }
    }

    /* renamed from: a */
    public final void mo14693a(C7022iu iuVar) {
        this.f21990a.f22024z = iuVar;
        Iterator it = this.f21990a.f22007i.iterator();
        while (it.hasNext()) {
            ((afu) it.next()).mo14693a(iuVar);
        }
    }

    /* renamed from: b */
    public final void mo14694b(String str, long j, long j2) {
        Iterator it = this.f21990a.f22007i.iterator();
        while (it.hasNext()) {
            ((afu) it.next()).mo14694b(str, j, j2);
        }
    }

    /* renamed from: c */
    public final void mo14695c(C6864cy cyVar) {
        this.f21990a.f22016r = cyVar;
        Iterator it = this.f21990a.f22007i.iterator();
        while (it.hasNext()) {
            ((afu) it.next()).mo14695c(cyVar);
        }
    }

    /* renamed from: d */
    public final void mo14696d(int i, long j) {
        Iterator it = this.f21990a.f22007i.iterator();
        while (it.hasNext()) {
            ((afu) it.next()).mo14696d(i, j);
        }
    }

    /* renamed from: e */
    public final void mo14697e(int i, int i2, int i3, float f) {
        Iterator it = this.f21990a.f22003e.iterator();
        while (it.hasNext()) {
            afk afk = (afk) it.next();
            if (!this.f21990a.f22007i.contains(afk)) {
                afk.mo14668e(i, i2, i3, f);
            }
        }
        Iterator it2 = this.f21990a.f22007i.iterator();
        while (it2.hasNext()) {
            ((afu) it2.next()).mo14697e(i, i2, i3, f);
        }
    }

    /* renamed from: f */
    public final void mo14698f(Surface surface) {
        if (this.f21990a.f22018t == surface) {
            Iterator it = this.f21990a.f22003e.iterator();
            while (it.hasNext()) {
                ((afk) it.next()).mo14666L();
            }
        }
        Iterator it2 = this.f21990a.f22007i.iterator();
        while (it2.hasNext()) {
            ((afu) it2.next()).mo14698f(surface);
        }
    }

    /* renamed from: g */
    public final void mo15743g(C6912es esVar, int i) {
        if (esVar.mo15780s() == 1) {
            Object obj = esVar.mo15852v(0, new C6911er()).f22046d;
        }
    }

    /* renamed from: h */
    public final void mo15744h(C6873dg dgVar, int i) {
    }

    /* renamed from: i */
    public final void mo15745i(C7362vj vjVar, abb abb) {
    }

    /* renamed from: j */
    public final void mo15746j(List list) {
    }

    /* renamed from: k */
    public final void mo15747k(boolean z) {
    }

    /* renamed from: l */
    public final void mo15748l(boolean z, int i) {
    }

    /* renamed from: m */
    public final void mo15749m(int i) {
        C6903ej.m20256P(this.f21990a);
    }

    /* renamed from: n */
    public final void mo15750n(boolean z, int i) {
        C6903ej.m20256P(this.f21990a);
    }

    /* renamed from: o */
    public final void mo15751o(int i) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f21990a.m20266aa(new Surface(surfaceTexture), true);
        this.f21990a.m20267ab(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f21990a.m20266aa((Surface) null, true);
        this.f21990a.m20267ab(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f21990a.m20267ab(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: p */
    public final void mo15752p(boolean z) {
    }

    /* renamed from: q */
    public final void mo15753q(C6826bn bnVar) {
    }

    /* renamed from: r */
    public final void mo15754r(int i) {
    }

    /* renamed from: s */
    public final void mo15755s(C6888dv dvVar) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f21990a.m20267ab(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f21990a.m20266aa(surfaceHolder.getSurface(), false);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f21990a.m20266aa((Surface) null, false);
        this.f21990a.m20267ab(0, 0);
    }

    /* renamed from: t */
    public final void mo15756t() {
    }

    /* renamed from: u */
    public final void mo15757u() {
    }

    /* renamed from: v */
    public final void mo15758v() {
        C6903ej.m20256P(this.f21990a);
    }

    /* renamed from: w */
    public final void mo14699w(C7022iu iuVar) {
        Iterator it = this.f21990a.f22007i.iterator();
        while (it.hasNext()) {
            ((afu) it.next()).mo14699w(iuVar);
        }
        this.f21990a.f22016r = null;
        this.f21990a.f22024z = null;
    }

    /* renamed from: x */
    public final void mo14700x(long j, int i) {
        Iterator it = this.f21990a.f22007i.iterator();
        while (it.hasNext()) {
            ((afu) it.next()).mo14700x(j, i);
        }
    }

    /* renamed from: y */
    public final void mo15811y(C7022iu iuVar) {
        this.f21990a.f21991A = iuVar;
        Iterator it = this.f21990a.f22008j.iterator();
        while (it.hasNext()) {
            ((C6983hi) it.next()).mo15811y(iuVar);
        }
    }

    /* renamed from: z */
    public final void mo15812z(int i) {
        if (this.f21990a.f21992B != i) {
            this.f21990a.f21992B = i;
            C6903ej.m20243C(this.f21990a);
        }
    }
}
