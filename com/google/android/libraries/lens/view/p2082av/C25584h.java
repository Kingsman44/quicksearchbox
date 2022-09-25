package com.google.android.libraries.lens.view.p2082av;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.android.libraries.lens.view.main.C27380dp;
import com.google.android.libraries.lens.view.main.C27382dr;
import com.google.android.libraries.lens.view.main.C27384dt;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26748aq;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.av.h */
/* compiled from: PG */
final class C25584h implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    final /* synthetic */ C25586j f69610a;

    /* renamed from: b */
    private final int f69611b;

    /* renamed from: c */
    private final C47770dh f69612c;

    public C25584h(C25586j jVar, int i, C47770dh dhVar) {
        this.f69610a = jVar;
        this.f69611b = i;
        this.f69612c = dhVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C47538ax c = this.f69612c.mo51613c("onSurfaceTextureAvailable");
        try {
            C58974d dVar = C25586j.f69615a;
            C25586j jVar = this.f69610a;
            if (jVar.f69616b.incrementAndGet() == jVar.f69617c) {
                jVar.f69620f = true;
                C27382dr drVar = jVar.f69621g;
                drVar.getClass();
                C59071e eVar = C27384dt.f74877a;
                drVar.f74875a.mo32928O();
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25583g.m47190a(th, th);
        }
        throw th;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C58974d dVar = C25586j.f69615a;
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C47538ax c = this.f69612c.mo51613c("onSurfaceTextureSizeChanged");
        try {
            C58974d dVar = C25586j.f69615a;
            C25586j jVar = this.f69610a;
            C26748aq aqVar = jVar.f69619e[this.f69611b].f69614b;
            if (aqVar != null) {
                aqVar.mo32080a();
            }
            C27382dr drVar = jVar.f69621g;
            if (drVar != null) {
                C27384dt dtVar = drVar.f74875a;
                dtVar.f74993m.execute(C47810es.m84977q(new C27380dp(dtVar)));
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25583g.m47190a(th, th);
        }
        throw th;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
