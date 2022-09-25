package com.facebook.litho.widget;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.litho.widget.p */
/* compiled from: PG */
final class C6551p {

    /* renamed from: a */
    public C6493cy f19515a;

    /* renamed from: b */
    public boolean f19516b;

    /* renamed from: c */
    private boolean f19517c;

    /* renamed from: d */
    private boolean f19518d;

    /* renamed from: e */
    private boolean f19519e;

    /* renamed from: a */
    public final void mo13644a(View view) {
        if (this.f19516b && !this.f19518d) {
            if (!this.f19519e) {
                this.f19518d = true;
                C6493cy cyVar = this.f19515a;
                if (cyVar != null) {
                    cyVar.mo13579a(view, 1);
                }
                this.f19516b = false;
            }
            this.f19519e = false;
        }
    }

    /* renamed from: b */
    public final void mo13645b(View view) {
        if (!this.f19517c && !this.f19518d) {
            this.f19517c = true;
            C6493cy cyVar = this.f19515a;
            if (cyVar != null) {
                cyVar.mo13579a(view, 0);
            }
        }
        this.f19519e = true;
    }

    /* renamed from: c */
    public final void mo13646c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (this.f19518d) {
                this.f19517c = false;
                this.f19516b = false;
                this.f19518d = false;
                return;
            }
            this.f19516b = false;
            this.f19519e = true;
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.f19516b && this.f19517c && !this.f19518d) {
            this.f19518d = true;
            C6493cy cyVar = this.f19515a;
            if (cyVar != null) {
                cyVar.mo13579a(view, 1);
            }
        }
    }
}
