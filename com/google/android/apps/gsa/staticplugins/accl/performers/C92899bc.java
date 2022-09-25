package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaController;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bc */
/* compiled from: PG */
final class C92899bc implements C22862b {

    /* renamed from: a */
    final /* synthetic */ C92900bd f259162a;

    /* renamed from: b */
    private int f259163b = 0;

    public C92899bc(C92900bd bdVar) {
        this.f259162a = bdVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17947a() {
        int i = C92900bd.f259164i;
        C58976aa aaVar = C58975e.f156826a;
        int i2 = this.f259163b;
        C92900bd bdVar = this.f259162a;
        if (i2 < bdVar.f259170f) {
            this.f259163b = i2 + 1;
            MediaController a = bdVar.f259171g.mo81722a((String) null, false, true);
            if (a == null || a.getPlaybackState().getState() != 3) {
                C92900bd bdVar2 = this.f259162a;
                C22871g gVar = bdVar2.f259168d;
                long a2 = bdVar2.f259166b.mo79743a(C90014bt.f247166by);
                C22862b bVar = this.f259162a.f259172h;
                bVar.getClass();
                return gVar.mo28203c("Check active media session", a2, bVar);
            }
            this.f259162a.f259172h = null;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f259162a.f259165a, "com.google.android.apps.gsa.staticplugins.opa.experience.OpaMActivity"));
            intent.putExtra("disable_auto_dismiss_when_dark", true);
            this.f259162a.f259167c.mo28212l("Launch Dreamliner media immersive", new C92898bb(this, intent));
            return C60856cj.m92900i(C22402a.f61894b);
        }
        bdVar.f259172h = null;
        return C60856cj.m92900i(C22402a.f61894b);
    }
}
