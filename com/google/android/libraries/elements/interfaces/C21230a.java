package com.google.android.libraries.elements.interfaces;

import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.elements.interfaces.a */
/* compiled from: PG */
public final class C21230a extends C21309p {

    /* renamed from: a */
    public View f59560a;

    /* renamed from: b */
    public View f59561b;

    /* renamed from: c */
    public C21295ck f59562c;

    /* renamed from: d */
    public SenderStateOuterClass$SenderState f59563d;

    /* renamed from: e */
    public C21248ar f59564e;

    /* renamed from: f */
    public C21256az f59565f;

    /* renamed from: g */
    private C21319z f59566g;

    public C21230a() {
    }

    public C21230a(C21311r rVar) {
        C21257b bVar = (C21257b) rVar;
        this.f59560a = bVar.f59574a;
        this.f59561b = bVar.f59575b;
        this.f59562c = bVar.f59576c;
        this.f59563d = bVar.f59577d;
        this.f59564e = bVar.f59578e;
        this.f59565f = bVar.f59579f;
        this.f59566g = bVar.f59580g;
    }

    /* renamed from: a */
    public final C21311r mo26698a() {
        C21319z zVar = this.f59566g;
        if (zVar != null) {
            return new C21257b(this.f59560a, this.f59561b, this.f59562c, this.f59563d, this.f59564e, this.f59565f, zVar);
        }
        throw new IllegalStateException("Missing required properties: conversionContext");
    }

    /* renamed from: b */
    public final SenderStateOuterClass$SenderState mo26699b() {
        return this.f59563d;
    }

    /* renamed from: c */
    public final void mo26700c(C21319z zVar) {
        if (zVar != null) {
            this.f59566g = zVar;
            return;
        }
        throw new NullPointerException("Null conversionContext");
    }

    /* renamed from: d */
    public final void mo26701d(C21248ar arVar) {
        this.f59564e = arVar;
    }

    /* renamed from: e */
    public final void mo26702e(SenderStateOuterClass$SenderState senderStateOuterClass$SenderState) {
        this.f59563d = senderStateOuterClass$SenderState;
    }

    /* renamed from: f */
    public final void mo26703f(View view) {
        this.f59560a = view;
    }
}
