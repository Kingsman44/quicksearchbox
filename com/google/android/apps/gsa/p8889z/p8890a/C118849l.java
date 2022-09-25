package com.google.android.apps.gsa.p8889z.p8890a;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90115fm;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a.C107810g;
import com.google.common.base.C58838bb;
import com.google.common.p4535g.C59203do;
import dagger.C68214a;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.z.a.l */
/* compiled from: PG */
public final class C118849l {

    /* renamed from: a */
    C118842e f331482a;

    /* renamed from: b */
    public boolean f331483b;

    /* renamed from: c */
    C90908be f331484c;

    /* renamed from: d */
    public final Object f331485d = new Object();

    /* renamed from: e */
    public List f331486e;

    /* renamed from: f */
    public int f331487f;

    /* renamed from: g */
    private final C118843f f331488g;

    /* renamed from: h */
    private final C90929bz f331489h;

    /* renamed from: i */
    private final Context f331490i;

    /* renamed from: j */
    private final C68214a f331491j;

    /* renamed from: k */
    private MediaPlayer.OnCompletionListener f331492k;

    /* renamed from: l */
    private C118841d f331493l;

    /* renamed from: m */
    private final Object f331494m = new Object();

    /* renamed from: n */
    private byte[] f331495n;

    /* renamed from: o */
    private final boolean f331496o;

    /* renamed from: p */
    private C107810g f331497p;

    /* renamed from: l */
    private final synchronized void m197281l() {
        C118842e eVar = this.f331482a;
        if (eVar != null) {
            eVar.f331464h = true;
            eVar.f331460d.open();
            eVar.f331459c.open();
            this.f331482a = null;
        }
        this.f331483b = false;
    }

    /* renamed from: m */
    private final synchronized void m197282m(C118842e eVar) {
        m197281l();
        this.f331482a = eVar;
        C58838bb.m90883r(!eVar.f331458b);
        eVar.f331458b = true;
        eVar.f331462f.mo85139d(new C118838a(eVar));
        MediaPlayer.OnCompletionListener onCompletionListener = this.f331492k;
        if (onCompletionListener != null) {
            this.f331482a.f331466j = onCompletionListener;
            this.f331492k = null;
        }
        C118841d dVar = this.f331493l;
        if (dVar != null) {
            this.f331482a.f331467k = dVar;
        }
        C107810g gVar = this.f331497p;
        if (gVar != null) {
            this.f331482a.f331468l = gVar;
            this.f331497p = null;
        }
        if (this.f331483b) {
            this.f331482a.mo104035c(this.f331484c);
        }
    }

    /* renamed from: a */
    public final synchronized void mo104040a(C90908be beVar) {
        C118848k kVar = new C118848k(this, beVar);
        this.f331484c = kVar;
        this.f331483b = true;
        C118842e eVar = this.f331482a;
        if (eVar != null) {
            eVar.mo104035c(kVar);
        }
    }

    /* renamed from: b */
    public final void mo104041b(byte[] bArr) {
        synchronized (this.f331494m) {
            this.f331495n = bArr;
        }
    }

    /* renamed from: c */
    public final synchronized void mo104042c(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f331492k = onCompletionListener;
    }

    /* renamed from: d */
    public final synchronized void mo104043d(C118841d dVar) {
        this.f331493l = dVar;
    }

    /* renamed from: e */
    public final synchronized void mo104044e() {
        m197281l();
    }

    /* renamed from: f */
    public final synchronized boolean mo104045f() {
        C118842e eVar = this.f331482a;
        if (eVar != null) {
            try {
                MediaPlayer mediaPlayer = eVar.f331463g;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    return true;
                }
            } catch (IllegalStateException unused) {
            }
        }
        return false;
    }

    /* renamed from: g */
    public final byte[] mo104046g() {
        byte[] bArr;
        synchronized (this.f331494m) {
            bArr = this.f331495n;
            this.f331495n = null;
        }
        return bArr;
    }

    /* renamed from: h */
    public final synchronized void mo104047h(C107810g gVar) {
        this.f331497p = gVar;
    }

    /* renamed from: i */
    public final synchronized void mo104048i(Uri uri) {
        m197282m(new C118844g(this.f331488g, this.f331489h, this.f331490i, uri, this.f331491j));
    }

    /* renamed from: j */
    public final synchronized void mo104049j(File file) {
        m197282m(new C118847j(this.f331488g, this.f331489h, file, this.f331491j));
    }

    /* renamed from: k */
    public final void mo104050k(byte[] bArr, int i) {
        double d;
        this.f331487f = i;
        synchronized (this) {
            d = C59203do.f157270a;
            if (i == 2) {
                C118842e eVar = this.f331482a;
                if (eVar != null) {
                    try {
                        MediaPlayer mediaPlayer = eVar.f331463g;
                        if (mediaPlayer != null) {
                            if (mediaPlayer.getDuration() > 0) {
                                double currentPosition = (double) eVar.f331463g.getCurrentPosition();
                                double duration = (double) eVar.f331463g.getDuration();
                                Double.isNaN(currentPosition);
                                Double.isNaN(duration);
                                d = currentPosition / duration;
                            }
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                i = 2;
            }
        }
        mo104041b(bArr);
        C118846i iVar = new C118846i(this.f331488g, this.f331489h, bArr, this.f331496o, this.f331491j);
        if (i == 2) {
            iVar.f331465i = d;
        }
        m197282m(iVar);
    }

    public C118849l(C90021c cVar, C118843f fVar, C90929bz bzVar, Context context, C68214a aVar) {
        this.f331488g = fVar;
        bzVar.getClass();
        this.f331489h = bzVar;
        this.f331486e = Collections.emptyList();
        this.f331490i = context;
        this.f331491j = aVar;
        this.f331496o = cVar.mo79746e(C90115fm.f250735b);
    }
}
