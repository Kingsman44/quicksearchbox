package com.google.android.libraries.p579ar.faceviewer.p587b;

import android.content.Context;
import android.util.Size;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.C1403ad;
import androidx.camera.core.C1506cj;
import androidx.camera.core.C1570t;
import androidx.camera.lifecycle.C1580d;
import androidx.camera.lifecycle.C1584h;
import androidx.core.p097i.C1974i;
import androidx.lifecycle.C2391v;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.faceviewer.b.g */
/* compiled from: PG */
public final class C10642g implements C10636a {

    /* renamed from: a */
    public static final C59071e f35532a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.b.g");

    /* renamed from: b */
    public final C2391v f35533b;

    /* renamed from: c */
    public final Executor f35534c;

    /* renamed from: d */
    public C1570t f35535d;

    /* renamed from: e */
    public C1506cj f35536e;

    /* renamed from: f */
    private final C60870cx f35537f;

    /* renamed from: g */
    private final Executor f35538g;

    public C10642g(Context context, C2391v vVar, Executor executor, Executor executor2) {
        this.f35533b = vVar;
        this.f35534c = executor;
        this.f35538g = executor2;
        try {
            C1403ad a = Camera2Config.m2984a();
            C1584h hVar = C1584h.f4330a;
            synchronized (hVar.f4331b) {
                C1974i.m5315c(hVar.f4332c == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                hVar.f4332c = new C1580d(a);
            }
        } catch (IllegalStateException unused) {
        }
        this.f35537f = C1584h.m4197a(context);
    }

    /* renamed from: a */
    public final C60870cx mo18676a(Size size) {
        if (this.f35535d == null) {
            return C60856cj.m92899h(new IllegalStateException("Camera not initialized."));
        }
        mo18677b();
        return C60922j.m93045h(this.f35537f, new C10637b(this, size), this.f35538g);
    }

    /* renamed from: b */
    public final void mo18677b() {
        C60856cj.m92911t(this.f35537f, new C10641f(this), this.f35538g);
    }

    /* renamed from: c */
    public final void mo18678c() {
        this.f35535d = C1570t.f4296a;
    }
}
