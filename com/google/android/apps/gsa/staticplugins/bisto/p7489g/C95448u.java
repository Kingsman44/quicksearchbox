package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.view.KeyEvent;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.p10712d.C142359ck;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.u */
/* compiled from: PG */
public final /* synthetic */ class C95448u implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95452y f267082a;

    /* renamed from: b */
    public final /* synthetic */ KeyEvent f267083b;

    public /* synthetic */ C95448u(C95452y yVar, KeyEvent keyEvent) {
        this.f267082a = yVar;
        this.f267083b = keyEvent;
    }

    public final void run() {
        C95452y yVar = this.f267082a;
        KeyEvent keyEvent = this.f267083b;
        C59104x b = C95452y.f267087a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WiredHeadsetConn");
        ((C59052c) ((C59052c) b).mo56372aa(14921)).mo56389s("Received volume event %s", keyEvent);
        if (keyEvent.getKeyCode() == 24) {
            if (keyEvent.getAction() == 0 && !yVar.f267093g) {
                yVar.f267093g = true;
                yVar.f267089c.mo89344a(C142359ck.EXPAND_ANNOUNCEMENT, C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT, C142359ck.FETCH_ANNOUNCEMENTS);
            } else if (keyEvent.getAction() == 1) {
                yVar.mo89370a();
            }
        } else if (keyEvent.getKeyCode() != 25) {
        } else {
            if (keyEvent.getAction() == 0) {
                yVar.f267093g = true;
                yVar.f267089c.mo89344a(C142359ck.VOLUME_DOWN_ONCE);
            } else if (keyEvent.getAction() == 1) {
                yVar.mo89370a();
            }
        }
    }
}
