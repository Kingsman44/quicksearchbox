package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.content.Context;
import android.util.Log;
import android.util.Size;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10636a;
import com.google.android.libraries.p579ar.faceviewer.utils.C10673f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60904dr;
import com.google.mediapipe.p4722a.C62700b;
import com.google.mediapipe.p4722a.C62706h;
import com.google.mediapipe.p4722a.C62707i;
import com.google.mediapipe.p4722a.C62709k;
import com.google.mediapipe.p4723b.C62711b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.k */
/* compiled from: PG */
public final class C10610k implements C10586ag {

    /* renamed from: a */
    public static final Size f35456a = new Size(1280, 720);

    /* renamed from: b */
    public final C10636a f35457b;

    /* renamed from: c */
    public final C62711b f35458c;

    /* renamed from: d */
    public final C10609j f35459d;

    /* renamed from: e */
    public final C10673f f35460e;

    /* renamed from: f */
    public final Executor f35461f;

    /* renamed from: g */
    public C62709k f35462g;

    /* renamed from: h */
    public C62707i f35463h;

    /* renamed from: i */
    public Size f35464i;

    /* renamed from: j */
    public Size f35465j;

    /* renamed from: k */
    public int f35466k = -1;

    /* renamed from: l */
    public int f35467l = -1;

    /* renamed from: m */
    public boolean f35468m;

    /* renamed from: n */
    public boolean f35469n;

    /* renamed from: o */
    private final Context f35470o;

    /* renamed from: p */
    private final C10611l f35471p;

    public C10610k(Context context, C10636a aVar, Executor executor, C62711b bVar, C10609j jVar, Size size) {
        this.f35470o = context;
        this.f35461f = new C60904dr(executor);
        this.f35457b = aVar;
        aVar.mo18678c();
        this.f35471p = new C10611l((C58485gu) C10613n.m25587a(context, 1).map(C10612m.f35474a).orElse(C58485gu.m89845m()), size);
        this.f35458c = bVar;
        this.f35459d = jVar;
        this.f35460e = new C10673f(executor);
    }

    /* renamed from: a */
    public final Size mo18649a(Size size) {
        int rotation = this.f35470o.getDisplay().getRotation();
        if (rotation == 1) {
            rotation = 3;
        } else if (rotation == 3) {
            rotation = 1;
        }
        C10611l lVar = this.f35471p;
        Size a = C10611l.m25586a(size, rotation);
        float width = ((float) a.getWidth()) / ((float) a.getHeight());
        C58485gu guVar = lVar.f35472a;
        int size2 = guVar.size();
        Size size3 = null;
        float f = 1.0f;
        for (int i = 0; i < size2; i++) {
            Size size4 = (Size) guVar.get(i);
            float width2 = ((float) size4.getWidth()) / ((float) size4.getHeight());
            float abs = Math.abs(width2 - width);
            if (size4.getWidth() >= lVar.f35473b.getWidth() && size4.getHeight() >= lVar.f35473b.getHeight() && width2 < 1.8f && (size3 == null || (abs <= f && size4.getWidth() <= size3.getWidth() && size4.getHeight() <= size3.getHeight()))) {
                size3 = size4;
                f = abs;
            }
        }
        if (size3 == null) {
            size3 = lVar.f35473b;
        }
        Size a2 = C10611l.m25586a(size3, rotation);
        mo18658c(new C10605f(this, a2, rotation));
        return a2;
    }

    /* renamed from: b */
    public final void mo18657b() {
        this.f35469n = false;
        this.f35464i = null;
        this.f35466k = -1;
        this.f35457b.mo18677b();
        C62707i iVar = this.f35463h;
        if (iVar != null) {
            iVar.f169304a.f169348q.post(new C62700b(iVar));
            C62707i iVar2 = this.f35463h;
            C62706h hVar = iVar2.f169304a;
            if (hVar != null) {
                hVar.mo58599j();
                try {
                    iVar2.f169304a.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
                    throw new RuntimeException(e);
                }
            }
            this.f35463h = null;
        }
    }

    /* renamed from: c */
    public final void mo18658c(Runnable runnable) {
        this.f35460e.mo18712b(new C10604e(this, runnable));
    }

    /* renamed from: d */
    public final void mo18659d() {
        this.f35460e.mo18712b(new C10602c(this));
    }
}
