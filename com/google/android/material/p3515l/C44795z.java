package com.google.android.material.p3515l;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.l.z */
/* compiled from: PG */
public final class C44795z {
    @Deprecated

    /* renamed from: a */
    public float f116818a;
    @Deprecated

    /* renamed from: b */
    public float f116819b;
    @Deprecated

    /* renamed from: c */
    public float f116820c;
    @Deprecated

    /* renamed from: d */
    public float f116821d;
    @Deprecated

    /* renamed from: e */
    public float f116822e;

    /* renamed from: f */
    public final List f116823f = new ArrayList();

    /* renamed from: g */
    private final List f116824g = new ArrayList();

    public C44795z() {
        mo48160e();
    }

    /* renamed from: g */
    private final void m79440g(float f) {
        float f2 = this.f116821d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f116819b;
                float f5 = this.f116820c;
                C44791v vVar = new C44791v(f4, f5, f4, f5);
                vVar.f116813e = this.f116821d;
                vVar.f116814f = f3;
                this.f116824g.add(new C44789t());
                this.f116821d = f;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C44794y mo48156a(Matrix matrix) {
        m79440g(this.f116822e);
        new Matrix(matrix);
        new ArrayList(this.f116824g);
        return new C44788s();
    }

    /* renamed from: b */
    public final void mo48157b(C44794y yVar, float f, float f2) {
        m79440g(f);
        this.f116824g.add(yVar);
        this.f116821d = f2;
    }

    /* renamed from: c */
    public final void mo48158c(Matrix matrix, Path path) {
        int size = this.f116823f.size();
        for (int i = 0; i < size; i++) {
            ((C44793x) this.f116823f.get(i)).mo48155a(matrix, path);
        }
    }

    /* renamed from: d */
    public final void mo48159d(float f, float f2) {
        C44792w wVar = new C44792w();
        wVar.f116815a = f;
        wVar.f116816b = f2;
        this.f116823f.add(wVar);
        C44790u uVar = new C44790u(wVar, this.f116819b, this.f116820c);
        mo48157b(uVar, uVar.mo48154a() + 270.0f, uVar.mo48154a() + 270.0f);
        this.f116819b = f;
        this.f116820c = f2;
    }

    /* renamed from: e */
    public final void mo48160e() {
        mo48161f(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: f */
    public final void mo48161f(float f, float f2, float f3) {
        this.f116818a = f;
        this.f116819b = 0.0f;
        this.f116820c = f;
        this.f116821d = f2;
        this.f116822e = (f2 + f3) % 360.0f;
        this.f116823f.clear();
        this.f116824g.clear();
    }
}
