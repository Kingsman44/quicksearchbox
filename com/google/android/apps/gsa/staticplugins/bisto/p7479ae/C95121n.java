package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.p10712d.C142500hq;
import com.google.android.p10712d.C142520l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.n */
/* compiled from: PG */
public final class C95121n extends C95110c {

    /* renamed from: d */
    public static final C59071e f266130d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.n");

    /* renamed from: e */
    private final String f266131e;

    /* renamed from: f */
    private final boolean f266132f;

    public C95121n(Context context, C142500hq hqVar, C95028a aVar, Intent intent) {
        super(context, hqVar, aVar);
        this.f266131e = intent.getStringExtra("auth_token");
        this.f266132f = intent.getBooleanExtra("should_authenticate_unbind", false);
    }

    /* renamed from: a */
    public final void mo89028a() {
        Messenger messenger = this.f266102c;
        if (messenger != null) {
            Message obtain = Message.obtain((Handler) null, 3, 0, 0);
            obtain.replyTo = new Messenger(new C95120m(this));
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                C59104x c = f266130d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ExtVoiceServiceConn");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17930)).mo56386p("could not register client with external service.");
            }
        }
    }

    /* renamed from: b */
    public final void mo89029b(C142520l lVar) {
        C59104x d = f266130d.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ExtVoiceServiceConn");
        ((C59052c) ((C59052c) d).mo56372aa(17931)).mo56386p("Unsupported");
    }

    /* renamed from: d */
    public final void mo89031d(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        Messenger messenger = this.f266102c;
        if (messenger != null) {
            Message obtain = Message.obtain((Handler) null, 1, 0, 0);
            Bundle bundle = new Bundle();
            bundle.putByteArray("audio_data", bArr);
            obtain.setData(bundle);
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                C59104x c = f266130d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ExtVoiceServiceConn");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17933)).mo56386p("couldn't send voice data to remote service");
            }
        }
    }

    /* renamed from: e */
    public final void mo89032e() {
        C58976aa aaVar = C58975e.f156826a;
        Messenger messenger = this.f266102c;
        if (messenger != null) {
            try {
                messenger.send(Message.obtain((Handler) null, 0, 0, 0));
            } catch (RemoteException e) {
                C59104x c = f266130d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ExtVoiceServiceConn");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17936)).mo56386p("couldn't send voice start to remote service");
            }
        }
    }

    /* renamed from: f */
    public final void mo89033f() {
        C58976aa aaVar = C58975e.f156826a;
        Messenger messenger = this.f266102c;
        if (messenger != null) {
            try {
                messenger.send(Message.obtain((Handler) null, 2, 0, 0));
            } catch (RemoteException e) {
                C59104x c = f266130d.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ExtVoiceServiceConn");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17939)).mo56386p("couldn't send voice end to remote service");
            }
        }
    }

    /* renamed from: i */
    public final boolean mo89034i(Intent intent, int i) {
        String str;
        if (!this.f266132f || intent == null || (str = this.f266131e) == null || str.equals(intent.getStringExtra("auth_token"))) {
            return super.mo89034i(intent, i);
        }
        return false;
    }
}
