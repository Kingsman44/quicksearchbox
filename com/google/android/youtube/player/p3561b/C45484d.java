package com.google.android.youtube.player.p3561b;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;

/* renamed from: com.google.android.youtube.player.b.d */
final class C45484d extends C45477bi {

    /* renamed from: a */
    final /* synthetic */ C45485e f118888a;

    public /* synthetic */ C45484d(C45485e eVar) {
        this.f118888a = eVar;
    }

    /* renamed from: a */
    public final String mo49625a(String str) {
        return this.f118888a.f118903o.mo44101a(str);
    }

    /* renamed from: b */
    public final void mo49626b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("dev_key", this.f118888a.f118899k);
        bundle2.putBundle("forwarding_state", bundle);
        C45470bb bbVar = new C45470bb();
        bbVar.f118884a.mo49654t(bundle2);
        bbVar.show(this.f118888a.mo49637b(), "com.google.android.youtube.dialog_fragment_tag");
    }

    /* renamed from: c */
    public final void mo49627c() {
        if (!(this.f118888a.f118890b instanceof C45470bb)) {
            C45457ap.m81128a("Cannot dismiss a non-fullscreen playback.", new Object[0]);
        }
        Fragment c = this.f118888a.mo49637b().f634a.mo671c("com.google.android.youtube.dialog_fragment_tag");
        if (!(c instanceof C45470bb)) {
            C45457ap.m81128a("Cannot find fullscreen playback.", new Object[0]);
        } else {
            ((C45470bb) c).dismissAllowingStateLoss();
        }
    }

    /* renamed from: d */
    public final void mo49628d(int i, int i2) {
        char c = 0;
        char c2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (char) 0 : 4 : 3 : 2 : 1;
        if (i2 == 0) {
            c = 1;
        } else if (i2 == 1) {
            c = 2;
        } else if (i2 == 2) {
            c = 3;
        } else if (i2 == 3) {
            c = 4;
        }
        C45504x xVar = null;
        if (!(c2 == 0 || c == 0)) {
            xVar = new C45504x();
        }
        if (xVar != null) {
            this.f118888a.f118892d.mo44072i(xVar);
        }
    }

    /* renamed from: e */
    public final void mo49629e(boolean z) {
        this.f118888a.f118892d.mo49620a(z);
    }

    /* renamed from: f */
    public final void mo49630f(int i) {
        C45447af a = C45447af.m81104a(i);
        if (a != null) {
            this.f118888a.f118894f.mo44074n(a);
        }
    }

    /* renamed from: g */
    public final void mo49631g(boolean z) {
        this.f118888a.f118895g.mo44102a(z);
    }

    /* renamed from: h */
    public final void mo49632h(int i, long j) {
        int i2;
        switch (i) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            default:
                i2 = 0;
                break;
        }
        C45448ag agVar = i2 == 0 ? null : new C45448ag(i2, j);
        if (agVar != null) {
            this.f118888a.f118893e.mo44073m((YouTubeEmbedSupportFragment) null, agVar);
        }
    }
}
