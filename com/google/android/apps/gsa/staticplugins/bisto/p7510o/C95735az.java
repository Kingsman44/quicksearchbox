package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95688l;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95655d;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95065ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95239o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142360cl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.az */
/* compiled from: PG */
public final class C95735az {

    /* renamed from: a */
    public C95688l f268033a;

    /* renamed from: b */
    public final AtomicBoolean f268034b = new AtomicBoolean(false);

    /* renamed from: c */
    public final Context f268035c;

    /* renamed from: d */
    private final C95065ab f268036d;

    /* renamed from: e */
    private final C95239o f268037e;

    /* renamed from: f */
    private final C95355bf f268038f;

    /* renamed from: g */
    private final C68214a f268039g;

    /* renamed from: h */
    private final C95708a f268040h;

    /* renamed from: i */
    private final C22871g f268041i;

    public C95735az(Context context, C22871g gVar, C95065ab abVar, C95239o oVar, C95355bf bfVar, C68214a aVar, C95708a aVar2) {
        this.f268036d = abVar;
        this.f268037e = oVar;
        this.f268038f = bfVar;
        this.f268039g = aVar;
        this.f268040h = aVar2;
        this.f268041i = gVar;
        this.f268035c = context;
    }

    /* renamed from: d */
    private final void m158572d(boolean z) {
        this.f268041i.mo28212l("mute-prompt", new C95734ay(this, z));
        this.f268038f.mo89277r(true != z ? 9 : 8);
    }

    /* renamed from: e */
    private final void m158573e(boolean z) {
        this.f268034b.set(z);
        ((C89492cd) this.f268039g.mo27525b()).mo83392ah(this.f268038f.mo89270k(), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo89719a() {
        C124548d b = ((C89492cd) this.f268039g.mo27525b()).mo83401b(this.f268038f.mo89270k());
        if (b != null && b.mo106498al() == 3) {
            m158573e(true);
            m158572d(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo89720b(C95294af afVar, C142360cl clVar, int i) {
        C62963cj cjVar = new C62963cj(clVar.f386306b, C142360cl.f386302c);
        if (!cjVar.contains(C142359ck.MIC_MUTE)) {
            return false;
        }
        m158573e(true);
        this.f268036d.mo88997c();
        this.f268037e.mo89159g(afVar);
        m158572d(true);
        this.f268040h.mo89667b(cjVar, C142359ck.MIC_MUTE, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo89721c(int i, byte[] bArr, int i2) {
        if (!this.f268034b.get()) {
            return false;
        }
        if (i == 9) {
            C142360cl clVar = (C142360cl) C62942bv.parseFrom((C62942bv) C142360cl.f386303e, bArr);
            ArrayList arrayList = new ArrayList(new C62963cj(clVar.f386306b, C142360cl.f386302c));
            arrayList.removeAll(C95655d.f267745u);
            arrayList.remove(C142359ck.COMPLETE_VOICE_INPUT);
            if (arrayList.contains(C142359ck.MIC_UNMUTE)) {
                m158573e(false);
                m158572d(false);
                this.f268040h.mo89667b(new C62963cj(clVar.f386306b, C142360cl.f386302c), C142359ck.MIC_UNMUTE, i2);
                return true;
            } else if (arrayList.isEmpty()) {
                return true;
            } else {
                this.f268041i.mo28212l("unmute-prompt", new C95733ax(this));
                C58976aa aaVar = C58975e.f156826a;
                return true;
            }
        } else if (i != 2) {
            return true;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f268036d.mo88997c();
            return true;
        }
    }
}
