package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.graphics.SurfaceTexture;
import android.util.Size;
import com.google.common.base.C58832aw;

/* renamed from: com.google.android.libraries.lens.view.h.d.ap */
/* compiled from: PG */
public class C26747ap extends SurfaceTexture {

    /* renamed from: a */
    public boolean f72869a;

    /* renamed from: b */
    private Size f72870b;

    /* renamed from: c */
    private Size f72871c;

    /* renamed from: d */
    private C26746ao f72872d = C26745an.f72868a;

    public C26747ap() {
        super(0);
    }

    /* renamed from: c */
    private final void m49458c(Size size) {
        Size a = this.f72872d.mo32077a(size);
        this.f72871c = a;
        super.setDefaultBufferSize(a.getWidth(), this.f72871c.getHeight());
    }

    /* renamed from: a */
    public void mo32058a(Size size, C26746ao aoVar) {
        this.f72870b = size;
        this.f72872d = aoVar;
        m49458c(size);
    }

    /* renamed from: b */
    public boolean mo32060b() {
        super.updateTexImage();
        return true;
    }

    public final boolean isReleased() {
        return this.f72869a;
    }

    public final void release() {
        this.f72869a = true;
        super.release();
    }

    public void setDefaultBufferSize(int i, int i2) {
        Size size = new Size(i, i2);
        if (!C58832aw.m90831a(size, this.f72870b)) {
            this.f72870b = size;
            m49458c(size);
        }
    }
}
