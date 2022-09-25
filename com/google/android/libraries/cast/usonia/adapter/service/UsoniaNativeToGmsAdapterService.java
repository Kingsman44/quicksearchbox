package com.google.android.libraries.cast.usonia.adapter.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.usonia.p10877a.C146108a;
import com.google.android.gms.usonia.p10877a.C146118k;
import com.google.android.gms.usonia.p10877a.C146119l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import p5488io.grpc.C70701ef;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.binder.C70227g;
import p5488io.grpc.binder.C70228h;

/* compiled from: PG */
public class UsoniaNativeToGmsAdapterService extends Service {

    /* renamed from: a */
    public static final C59071e f54730a = C59071e.m91332i("com.google.android.libraries.cast.usonia.adapter.service.UsoniaNativeToGmsAdapterService");

    /* renamed from: b */
    public C146119l f54731b;

    /* renamed from: c */
    private final C70228h f54732c = new C70228h();

    /* renamed from: d */
    private C70701ef f54733d;

    public final IBinder onBind(Intent intent) {
        ((C59052c) ((C59052c) f54730a.mo56224b()).mo56372aa(47932)).mo56386p("Usonia adapter service is bound");
        return this.f54732c.mo61891a();
    }

    public final void onCreate() {
        ((C59052c) ((C59052c) f54730a.mo56224b()).mo56372aa(47935)).mo56386p("Usonia adapter service created");
        C146108a aVar = new C146108a();
        aVar.f394835a = this;
        C146118k a = aVar.mo122624a();
        this.f54731b = a;
        C146006ab a2 = a.mo122625a().mo122630a();
        a2.mo122499r(new C19712ad(this));
        a2.mo122498q(C19713ae.f54746a);
        try {
            C70227g gVar = new C70227g(C70175a.m102187b(this, getClass()), this.f54732c);
            gVar.f187206a.mo62399b(new C19716d(this.f54731b.mo122626b()));
            gVar.f187206a.mo62399b(new C19723k(this.f54731b.mo122627c()));
            gVar.f187206a.mo62399b(new C19710ab(a2, this.f54731b.mo122627c()));
            C70701ef a3 = gVar.f187206a.mo61738a();
            this.f54733d = a3;
            a3.mo62396d();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f54730a.mo56225c()).mo56382g(e)).mo56372aa(47936)).mo56386p("Unable to start the gRPC server");
        }
    }

    public final void onDestroy() {
        ((C59052c) ((C59052c) f54730a.mo56224b()).mo56372aa(47937)).mo56386p("Usonia adapter service destroyed");
    }
}
