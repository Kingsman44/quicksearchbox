package com.google.android.gms.car.p10750a.p10751a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.p104d.p105a.C2164c;
import com.google.android.gms.car.p10750a.C143086f;
import com.google.android.gms.car.p10750a.C143088h;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.common.p10781d.C143860a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.car.a.a.bg */
/* compiled from: PG */
final class C143010bg implements ServiceConnection {

    /* renamed from: a */
    public C2164c f388053a;

    /* renamed from: b */
    final /* synthetic */ C143011bh f388054b;

    public C143010bg(C143011bh bhVar) {
        this.f388054b = bhVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C143011bh bhVar = this.f388054b;
        C2164c cVar = this.f388053a;
        if (iBinder == null) {
            bhVar.mo117959f(new C143086f("Gearhead Car Startup Service returned null binding."), cVar);
        } else {
            Executors.newSingleThreadExecutor().execute(new C143005bb(bhVar, iBinder, cVar));
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C143860a.m233845a().mo119312c(this.f388054b.f388055a, this);
        C143011bh bhVar = this.f388054b;
        C143088h hVar = new C143088h();
        bhVar.mo117958e(hVar, this.f388053a);
        if (C143316a.m232515e("GH.GhCarClientCtor", 4)) {
            C143316a.m232514d(4, "GH.GhCarClientCtor", hVar, "onConnectionLost: %s", C61301b.m93812a(hVar.getMessage()));
        }
        C143011bh.m231977d(bhVar.f388057c, new C143007bd(bhVar));
    }
}
