package com.google.android.libraries.lens.common.text.p2004a.p2005a;

/* renamed from: com.google.android.libraries.lens.common.text.a.a.c */
/* compiled from: PG */
public final class C24119c extends C24118b {

    /* renamed from: f */
    private volatile transient boolean f65856f;

    /* renamed from: g */
    private volatile transient boolean f65857g;

    public C24119c(float f, float f2, float f3, float f4, float f5) {
        super(f, f2, f3, f4, f5);
    }

    /* renamed from: f */
    public final boolean mo29536f() {
        if (!this.f65857g) {
            synchronized (this) {
                if (!this.f65857g) {
                    float f = this.f65854d;
                    float f2 = this.f65855e;
                    boolean z = false;
                    if (f > 0.0f && f2 > f) {
                        z = true;
                    }
                    this.f65856f = z;
                    this.f65857g = true;
                }
            }
        }
        return this.f65856f;
    }
}
