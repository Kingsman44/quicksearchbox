package com.google.p3723ar.imp.view;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.google.android.filament.p10722a.C142630a;
import com.google.android.filament.p10722a.C142631b;
import com.google.android.filament.p10722a.C142632c;
import com.google.android.filament.p10722a.C142633d;
import com.google.android.filament.p10722a.C142634e;
import com.google.android.filament.p10722a.C142635f;
import com.google.common.base.C58838bb;

/* renamed from: com.google.ar.imp.view.aa */
/* compiled from: PG */
public final class C47981aa {

    /* renamed from: a */
    public final C142635f f124184a;

    /* renamed from: b */
    public final View f124185b;

    /* renamed from: c */
    public final C47993i f124186c;

    public C47981aa(C47993i iVar, View view, boolean z, View view2, float f) {
        int i;
        boolean z2 = view instanceof TextureView;
        C58838bb.m90883r(z2 || (view instanceof SurfaceView));
        this.f124186c = iVar;
        this.f124185b = view2;
        C142635f fVar = new C142635f((byte[]) null);
        this.f124184a = fVar;
        fVar.f386972f = z;
        float max = Math.max(0.1f, Math.min(1.0f, f));
        int width = (int) (((float) view.getWidth()) * max);
        int height = (int) (((float) view.getHeight()) * max);
        float f2 = view.getContext().getResources().getDisplayMetrics().density;
        fVar.f386967a = width;
        fVar.f386968b = height;
        C142632c cVar = fVar.f386971e;
        if (cVar != null) {
            cVar.mo117332b(width, height);
        }
        fVar.f386973g = new C48016z(this, iVar, view2, f2);
        if (z2) {
            TextureView textureView = (TextureView) view;
            if (fVar.mo117336c(textureView)) {
                textureView.setOpaque(fVar.f386972f);
                fVar.f386971e = new C142634e(fVar, textureView);
                C142631b bVar = new C142631b(fVar);
                textureView.setSurfaceTextureListener(bVar);
                if (textureView.isAvailable()) {
                    bVar.onSurfaceTextureAvailable(textureView.getSurfaceTexture(), fVar.f386967a, fVar.f386968b);
                    return;
                }
                return;
            }
            return;
        }
        SurfaceView surfaceView = (SurfaceView) view;
        if (fVar.mo117336c(surfaceView)) {
            surfaceView.setZOrderOnTop(!fVar.f386972f);
            int i2 = true != fVar.f386972f ? -3 : -1;
            surfaceView.getHolder().setFormat(i2);
            fVar.f386971e = new C142633d(surfaceView);
            C142630a aVar = new C142630a(fVar);
            SurfaceHolder holder = surfaceView.getHolder();
            holder.addCallback(aVar);
            int i3 = fVar.f386967a;
            if (i3 > 0 && (i = fVar.f386968b) > 0) {
                holder.setFixedSize(i3, i);
            }
            Surface surface = holder.getSurface();
            if (surface != null && surface.isValid()) {
                aVar.surfaceCreated(holder);
                aVar.surfaceChanged(holder, i2, holder.getSurfaceFrame().width(), holder.getSurfaceFrame().height());
            }
        }
    }

    /* renamed from: a */
    public final long mo53089a(long j) {
        this.f124186c.mo53096b();
        if (this.f124185b.mo53086a() == 0 || !this.f124184a.f386970d || !View.nHasSwapChain(this.f124185b.f124179a)) {
            return 0;
        }
        View view = this.f124185b;
        long j2 = view.f124179a;
        Long l = view.f124181c;
        long nRenderNextFrame = View.nRenderNextFrame(j2, l != null ? l.longValue() : j, j);
        view.f124181c = Long.valueOf(j);
        return nRenderNextFrame;
    }
}
