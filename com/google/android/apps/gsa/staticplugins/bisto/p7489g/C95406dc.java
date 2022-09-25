package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.google.android.apps.gsa.nga.shared.p6339f.C81027b;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95245u;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95246v;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95248x;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95249y;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96501u;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.dc */
/* compiled from: PG */
public final class C95406dc extends C95444q {

    /* renamed from: i */
    private final C95248x f266935i;

    public C95406dc(C22871g gVar, C81027b bVar, C96501u uVar, C95850a aVar, C95249y yVar, C95355bf bfVar) {
        super(gVar, bVar, uVar, aVar);
        C22871g gVar2 = (C22871g) yVar.f266490a.mo17428b();
        gVar2.getClass();
        Context context = (Context) yVar.f266491b.mo17428b();
        context.getClass();
        C95850a aVar2 = (C95850a) yVar.f266492c.mo17428b();
        aVar2.getClass();
        C68214a a = C68219e.m98518a(((C68226l) yVar.f266493d).f184585a);
        a.getClass();
        C95248x xVar = new C95248x(gVar2, context, aVar2, a, bfVar);
        this.f266935i = xVar;
        Object systemService = xVar.f266476b.getSystemService("audio");
        systemService.getClass();
        xVar.f266479e = (AudioManager) systemService;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            defaultAdapter.getProfileProxy(xVar.f266476b, new C95245u(xVar), 1);
        }
        xVar.f266476b.registerReceiver(xVar.f266478d, new IntentFilter("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"));
        xVar.f266482h = xVar.f266487m.mo89270k();
        String str = xVar.f266482h;
        if (str == null) {
            C59104x c = C95248x.f266475a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
            ((C59052c) ((C59052c) c).mo56372aa(14751)).mo56386p("deviceId is null");
            return;
        }
        C60856cj.m92911t(((C89492cd) xVar.f266477c.mo27525b()).mo83408n(str), new C95246v(xVar, str), C60826bg.f164896a);
        ((C89492cd) xVar.f266477c.mo27525b()).mo83360B(C58528ij.m90011K(18, 21), xVar);
    }

    /* renamed from: a */
    public final C60870cx mo89348a() {
        return this.f266935i.mo89137b();
    }

    /* renamed from: b */
    public final C60870cx mo89349b() {
        return this.f266935i.mo89138c();
    }
}
