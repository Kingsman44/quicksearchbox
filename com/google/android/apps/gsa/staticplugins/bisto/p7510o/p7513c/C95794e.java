package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95379cc;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142359ck;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.c.e */
/* compiled from: PG */
public final class C95794e {

    /* renamed from: a */
    public final C22871g f268230a;

    /* renamed from: b */
    public final AudioManager f268231b;

    /* renamed from: c */
    public final C95379cc f268232c;

    /* renamed from: d */
    public C60870cx f268233d;

    /* renamed from: e */
    public C60870cx f268234e;

    /* renamed from: f */
    private final C22870f f268235f = new C95792c(this);

    /* renamed from: g */
    private final C22870f f268236g = new C95793d(this);

    public C95794e(Context context, C22871g gVar, C95379cc ccVar) {
        this.f268231b = (AudioManager) context.getSystemService("audio");
        this.f268230a = gVar;
        this.f268232c = ccVar;
    }

    /* renamed from: a */
    public final C142359ck mo89774a(List list) {
        if (list.contains(C142359ck.VOLUME_DOWN_STOP)) {
            C60870cx cxVar = this.f268234e;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f268234e = null;
            }
            return C142359ck.VOLUME_DOWN_STOP;
        } else if (list.contains(C142359ck.VOLUME_UP_STOP)) {
            C60870cx cxVar2 = this.f268233d;
            if (cxVar2 != null) {
                cxVar2.cancel(false);
                this.f268233d = null;
            }
            return C142359ck.VOLUME_UP_STOP;
        } else if (list.contains(C142359ck.VOLUME_DOWN_ONCE)) {
            mo89775b(false);
            return C142359ck.VOLUME_DOWN_ONCE;
        } else if (list.contains(C142359ck.VOLUME_UP_ONCE)) {
            mo89775b(true);
            return C142359ck.VOLUME_UP_ONCE;
        } else if (list.contains(C142359ck.VOLUME_DOWN_START)) {
            if (mo89775b(false)) {
                this.f268234e = this.f268230a.mo28208h("down", 800, this.f268236g);
            }
            return C142359ck.VOLUME_DOWN_START;
        } else if (!list.contains(C142359ck.VOLUME_UP_START)) {
            return null;
        } else {
            if (mo89775b(true)) {
                this.f268233d = this.f268230a.mo28208h("up", 800, this.f268235f);
            }
            return C142359ck.VOLUME_UP_START;
        }
    }

    /* renamed from: b */
    public final boolean mo89775b(boolean z) {
        AudioManager audioManager = this.f268231b;
        audioManager.getClass();
        int streamVolume = audioManager.getStreamVolume(3);
        AudioManager audioManager2 = this.f268231b;
        audioManager2.getClass();
        int streamMaxVolume = audioManager2.getStreamMaxVolume(3);
        if (streamVolume == streamMaxVolume && z) {
            this.f268232c.mo89316a(streamVolume, true);
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (streamVolume != 0 || z) {
            int i = true != z ? -1 : 1;
            int i2 = streamVolume + i;
            this.f268232c.mo89316a(i2, true);
            AudioManager audioManager3 = this.f268231b;
            audioManager3.getClass();
            audioManager3.adjustStreamVolume(3, i, 0);
            C58976aa aaVar2 = C58975e.f156826a;
            AudioManager audioManager4 = this.f268231b;
            audioManager4.getClass();
            audioManager4.getStreamVolume(3);
            return (i2 != streamMaxVolume || !z) && (i2 != 0 || z);
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return false;
        }
    }
}
