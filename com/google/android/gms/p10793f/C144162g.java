package com.google.android.gms.p10793f;

import com.google.android.gms.maps.C145008e;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.f.g */
/* compiled from: PG */
public abstract class C144162g {

    /* renamed from: a */
    public LinkedList f390474a;

    /* renamed from: b */
    public C145008e f390475b;

    /* renamed from: c */
    private final C144156a f390476c = new C144156a(this);

    /* renamed from: a */
    public final void mo119697a(int i) {
        while (!this.f390474a.isEmpty() && ((C144161f) this.f390474a.getLast()).mo119694a() >= i) {
            this.f390474a.removeLast();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo119698b(C144156a aVar);

    /* renamed from: c */
    public final void mo119699c(C144161f fVar) {
        if (this.f390475b != null) {
            fVar.mo119695b();
            return;
        }
        if (this.f390474a == null) {
            this.f390474a = new LinkedList();
        }
        this.f390474a.add(fVar);
        mo119698b(this.f390476c);
    }
}
