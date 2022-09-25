package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.p293a.p295b.C5686b;
import com.bumptech.glide.load.p293a.p295b.C5687c;
import com.bumptech.glide.load.p293a.p295b.C5691g;

/* renamed from: com.bumptech.glide.load.a.ac */
/* compiled from: PG */
public final class C5660ac {

    /* renamed from: a */
    private volatile C5686b f17055a;

    /* renamed from: b */
    private final C5691g f17056b;

    public C5660ac(C5691g gVar) {
        this.f17056b = gVar;
    }

    /* renamed from: a */
    public final C5686b mo12137a() {
        if (this.f17055a == null) {
            synchronized (this) {
                if (this.f17055a == null) {
                    this.f17055a = this.f17056b.mo12195a();
                }
                if (this.f17055a == null) {
                    this.f17055a = new C5687c();
                }
            }
        }
        return this.f17055a;
    }
}
