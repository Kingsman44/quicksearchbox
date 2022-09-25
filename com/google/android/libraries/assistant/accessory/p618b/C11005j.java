package com.google.android.libraries.assistant.accessory.p618b;

import android.bluetooth.BluetoothDevice;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.wearable.C146414i;
import com.google.assistant.p3739a.p3740a.C48113j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.accessory.b.j */
/* compiled from: PG */
public final class C11005j implements C60845bz {

    /* renamed from: a */
    private static final C59071e f36168a = C59071e.m91332i("com.google.android.libraries.assistant.accessory.b.j");

    /* renamed from: b */
    private final C11011p f36169b;

    /* renamed from: c */
    private final C146414i f36170c;

    /* renamed from: d */
    private final boolean f36171d;

    public C11005j(C11011p pVar, C146414i iVar, boolean z) {
        this.f36169b = pVar;
        this.f36170c = iVar;
        this.f36171d = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = f36168a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PeerMessageFutureCallback");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42537)).mo56386p("RemotePeerStateCommunicator doesn't collect peer message successfully.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C11003h hVar = (C11003h) optional.get();
            Optional e = this.f36169b.mo19412e(hVar.mo19391h());
            C11017v.m26077f((C48113j) C11017v.m26073b(hVar, e.isPresent() ? ((BluetoothDevice) e.get()).getName() : BuildConfig.FLAVOR).toBuilder(), this.f36170c, this.f36169b, this.f36171d);
        }
    }
}
