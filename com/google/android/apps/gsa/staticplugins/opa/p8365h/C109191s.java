package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.p1963i.C23849ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.s */
/* compiled from: PG */
public final class C109191s {

    /* renamed from: a */
    public final C58974d f304019a;

    /* renamed from: b */
    public final String f304020b;

    /* renamed from: c */
    public final C68214a f304021c;

    /* renamed from: d */
    public final List f304022d = new ArrayList();

    /* renamed from: e */
    public final Context f304023e;

    /* renamed from: f */
    public final C60888db f304024f;

    /* renamed from: g */
    public final Messenger f304025g;

    /* renamed from: h */
    public final C47770dh f304026h;

    /* renamed from: i */
    public final AtomicInteger f304027i = new AtomicInteger(0);

    /* renamed from: j */
    public C109189q f304028j;

    /* renamed from: k */
    public Messenger f304029k;

    /* renamed from: l */
    public final Map f304030l = new HashMap();

    /* renamed from: m */
    private final AtomicInteger f304031m = new AtomicInteger(0);

    public C109191s(Context context, C90851k kVar, C68214a aVar, C47770dh dhVar, Looper looper, C83564a aVar2) {
        this.f304023e = context;
        this.f304024f = C23849ax.m44396a(kVar.mo85210c(C109190r.class.getName()));
        this.f304020b = "opa_broadcast_receiver";
        this.f304021c = aVar;
        this.f304026h = dhVar;
        this.f304025g = new Messenger(new C109187o(this, looper));
        this.f304019a = aVar2.mo76900a("BrdcstRcvrMsgr");
    }

    /* renamed from: a */
    public final C60870cx mo97656a(Intent intent) {
        C109184l lVar = new C109184l(this, intent, this.f304031m.incrementAndGet());
        return C60856cj.m92905n(C47810es.m84965e(lVar), this.f304024f);
    }

    /* renamed from: b */
    public final void mo97657b() {
        Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService").setPackage("com.google.android.googlequicksearchbox");
        C109189q qVar = new C109189q(this, this.f304026h, this.f304019a);
        this.f304028j = qVar;
        this.f304023e.bindService(intent, qVar, 1);
    }

    /* renamed from: c */
    public final void mo97658c() {
        ((C58970a) ((C58970a) this.f304019a.mo56224b()).mo56372aa(23870)).mo56386p("disconnect()");
        C109186n nVar = new C109186n(this);
        C60856cj.m92903l(C47810es.m84977q(nVar), this.f304024f);
    }

    /* renamed from: d */
    public final void mo97659d() {
        Messenger messenger = this.f304029k;
        if (messenger != null) {
            Iterator it = this.f304022d.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                try {
                    this.f304027i.incrementAndGet();
                    this.f304027i.get();
                    messenger.send(message);
                    it.remove();
                } catch (RemoteException e) {
                    ((C58970a) ((C58970a) ((C58970a) this.f304019a.mo56225c()).mo56382g(e)).mo56372aa(23881)).mo56386p("processMessages(): remote exception");
                }
            }
        }
    }
}
