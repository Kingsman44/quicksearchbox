package com.google.android.libraries.gsa.p1859d;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.libraries.p10922ab.C146709e;

/* renamed from: com.google.android.libraries.gsa.d.l */
/* compiled from: PG */
public final class C22790l extends C146709e implements Handler.Callback {

    /* renamed from: a */
    public C22791m f62735a;

    /* renamed from: b */
    public WindowManager f62736b;

    /* renamed from: c */
    public int f62737c;

    /* renamed from: d */
    public Window f62738d;

    /* renamed from: e */
    private final Handler f62739e = new Handler(Looper.getMainLooper(), this);

    /* renamed from: a */
    public final void mo28128a(float f) {
        this.f62739e.removeMessages(2);
        Message.obtain(this.f62739e, 2, Float.valueOf(f)).sendToTarget();
    }

    /* renamed from: b */
    public final void mo28129b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("service_status", i);
        mo28130c(bundle);
    }

    /* renamed from: c */
    public final void mo28130c(Bundle bundle) {
        Message.obtain(this.f62739e, 5, 0, 0, bundle).sendToTarget();
    }

    public final boolean handleMessage(Message message) {
        if (this.f62735a == null) {
            return true;
        }
        int i = message.what;
        if (i == 2) {
            if ((this.f62735a.f62751l & 1) != 0) {
                float floatValue = ((Float) message.obj).floatValue();
                this.f62735a.f62742c.mo28139a(floatValue);
                if (floatValue <= 0.0f) {
                    this.f62735a.f62744e.mo28121a("onScroll 0, overlay closed");
                } else if (floatValue >= 1.0f) {
                    this.f62735a.f62744e.mo28121a("onScroll 1, overlay opened");
                } else {
                    this.f62735a.f62744e.mo28123c(1, "onScroll", floatValue);
                }
            }
            return true;
        } else if (i == 3) {
            WindowManager.LayoutParams attributes = this.f62738d.getAttributes();
            if (((Boolean) message.obj).booleanValue()) {
                attributes.x = this.f62737c;
                attributes.flags |= 512;
            } else {
                attributes.x = 0;
                attributes.flags &= -513;
            }
            this.f62736b.updateViewLayout(this.f62738d.getDecorView(), attributes);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            Bundle bundle = (Bundle) message.obj;
            this.f62735a.f62744e.mo28123c(2, "stateChanged", (float) message.arg1);
            C22791m mVar = this.f62735a;
            C22792n nVar = mVar.f62742c;
            if (nVar instanceof C22797s) {
                C22797s sVar = (C22797s) nVar;
                if (bundle.containsKey("minus_one_thumbnail_image_960_540") && bundle.containsKey("minus_one_product_name")) {
                    Icon icon = (Icon) bundle.getParcelable("minus_one_thumbnail_image_960_540");
                    bundle.getString("minus_one_product_name");
                    sVar.mo28145e();
                }
                if (bundle.getBoolean("overlay_animation_complete")) {
                    sVar.mo28143c();
                }
                if (((Bitmap) bundle.getParcelable("google_overlay_icon")) != null) {
                    sVar.mo28146f();
                }
                if (bundle.getBoolean("initiate_overlay_switch")) {
                    sVar.mo28144d();
                }
            }
            int i2 = bundle.getInt("service_status", -1);
            if (i2 != -1) {
                mVar.mo28133b(i2);
            }
            C22792n nVar2 = mVar.f62742c;
            if (nVar2 instanceof C22795q) {
                ((C22795q) nVar2).mo28142c();
            }
            return true;
        }
    }
}
