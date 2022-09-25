package com.google.android.libraries.componentview.p1697d;

import android.view.View;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4271bq.C56425d;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.d.n */
/* compiled from: PG */
public abstract class C20483n extends C20470a implements C20475f {

    /* renamed from: l */
    public C58485gu f57600l = C58485gu.m89845m();

    /* renamed from: m */
    public C20470a f57601m;

    public C20483n(C56425d dVar) {
        super(dVar);
    }

    /* renamed from: b */
    public final C60870cx mo25099b() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C56425d mo25107g(C56425d dVar);

    /* renamed from: kA */
    public final /* bridge */ /* synthetic */ List mo25239kA() {
        C20470a aVar;
        if (this.f57600l.isEmpty() && (aVar = this.f57601m) != null) {
            this.f57600l = C58485gu.m89846n(aVar);
        }
        return this.f57600l;
    }

    /* renamed from: kB */
    public final void mo25240kB() {
        mo25108kx();
        mo25252z(this.f57588z);
    }

    /* renamed from: kD */
    public void mo25181kD(float f, float f2, float f3, float f4) {
        C20470a aVar = this.f57601m;
        if (aVar != null) {
            aVar.mo25181kD(f, f2, f3, f4);
        }
    }

    /* renamed from: kH */
    public final View mo25098kH() {
        C20470a aVar = this.f57601m;
        if (aVar == null) {
            return null;
        }
        return aVar.mo25098kH();
    }

    /* renamed from: kx */
    public abstract void mo25108kx();

    /* renamed from: ky */
    public C20476g mo25200ky() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        if (list == null || list.isEmpty()) {
            return mo25107g((C56425d) null);
        }
        return mo25107g((C56425d) list.get(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo25248u(C56425d dVar) {
        C20470a aVar = this.f57601m;
        if (aVar != null) {
            aVar.mo25248u(dVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo25252z(C56425d dVar) {
        mo25248u(dVar);
        C20470a aVar = this.f57601m;
        if (aVar != null) {
            aVar.mo25252z(dVar);
        }
    }
}
