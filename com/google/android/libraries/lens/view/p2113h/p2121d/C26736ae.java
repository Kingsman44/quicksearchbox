package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Size;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.h.d.ae */
/* compiled from: PG */
public final class C26736ae extends C26747ap {

    /* renamed from: b */
    private static final C58974d f72866b = C58974d.m91135i("ConcurrentSurfaceTexture");

    /* renamed from: c */
    private boolean f72867c = true;

    /* renamed from: a */
    public final synchronized void mo32058a(Size size, C26746ao aoVar) {
        if (this.f72869a) {
            ((C58970a) ((C58970a) f72866b.mo56226d()).mo56372aa(49162)).mo56386p("setSizeTransform: ignoring, GLConsumer already abandoned!");
        } else {
            super.mo32058a(size, aoVar);
        }
    }

    public final synchronized void attachToGLContext(int i) {
        if (this.f72869a) {
            ((C58970a) ((C58970a) f72866b.mo56226d()).mo56372aa(49157)).mo56386p("attachToGLContext: ignoring, GLConsumer already abandoned!");
        } else if (!this.f72867c) {
            super.attachToGLContext(i);
            this.f72867c = true;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo32060b() {
        if (this.f72869a) {
            ((C58970a) ((C58970a) f72866b.mo56226d()).mo56372aa(49165)).mo56386p("updateTexImage: ignoring, GLConsumer already abandoned!");
            return false;
        } else if (!this.f72867c) {
            return false;
        } else {
            updateTexImage();
            return true;
        }
    }

    public final synchronized void detachFromGLContext() {
        if (this.f72869a) {
            ((C58970a) ((C58970a) f72866b.mo56226d()).mo56372aa(49159)).mo56386p("detachFromGLContext: ignoring, GLConsumer already abandoned!");
        } else if (this.f72867c) {
            this.f72867c = false;
            super.detachFromGLContext();
        }
    }

    public final synchronized void getTransformMatrix(float[] fArr) {
        int length = fArr.length;
        C58838bb.m90875j(length == 16, "Destination array for transform matrix must be exactly %s, found %s instead.", 16, length);
        super.getTransformMatrix(fArr);
    }

    public final synchronized void releaseTexImage() {
        if (this.f72869a) {
            ((C58970a) ((C58970a) f72866b.mo56226d()).mo56372aa(49161)).mo56386p("releaseTexImage: ignoring, GLConsumer already abandoned!");
        } else if (this.f72867c) {
            super.releaseTexImage();
        }
    }

    public final synchronized void setDefaultBufferSize(int i, int i2) {
        if (this.f72869a) {
            ((C58970a) ((C58970a) f72866b.mo56226d()).mo56372aa(49163)).mo56386p("setDefaultBufferSize: ignoring, GLConsumer already abandoned!");
        } else {
            super.setDefaultBufferSize(i, i2);
        }
    }
}
