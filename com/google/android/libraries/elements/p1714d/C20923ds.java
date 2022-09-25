package com.google.android.libraries.elements.p1714d;

import androidx.core.widget.C2129p;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.elements.interfaces.C21238ah;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.protos.youtube.elements.C66205ds;
import com.google.protos.youtube.elements.C66206dt;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.libraries.elements.d.ds */
/* compiled from: PG */
public final /* synthetic */ class C20923ds implements C2129p {

    /* renamed from: a */
    public final /* synthetic */ C21313t f58671a;

    /* renamed from: b */
    public final /* synthetic */ C21357r f58672b;

    /* renamed from: c */
    public final /* synthetic */ C21319z f58673c;

    /* renamed from: d */
    public final /* synthetic */ float f58674d;

    public /* synthetic */ C20923ds(C21313t tVar, C21357r rVar, C21319z zVar, float f) {
        this.f58671a = tVar;
        this.f58672b = rVar;
        this.f58673c = zVar;
        this.f58674d = f;
    }

    /* renamed from: a */
    public final void mo4777a(NestedScrollView nestedScrollView, int i, int i2, int i3) {
        C21313t tVar = this.f58671a;
        C21357r rVar = this.f58672b;
        C21319z zVar = this.f58673c;
        float f = this.f58674d;
        CommandOuterClass$Command a = rVar.mo26862a();
        C21256az h = zVar.mo26806h();
        C21238ah g = zVar.mo26805g();
        C66205ds dsVar = (C66205ds) C66206dt.f180035d.createBuilder();
        dsVar.copyOnWrite();
        C66206dt dtVar = (C66206dt) dsVar.instance;
        dtVar.f180037a |= 1;
        dtVar.f180038b = ((float) i) / f;
        dsVar.copyOnWrite();
        C66206dt dtVar2 = (C66206dt) dsVar.instance;
        dtVar2.f180037a |= 2;
        dtVar2.f180039c = ((float) i2) / f;
        C20927dw.m39354c(nestedScrollView, tVar, a, h, g, (C66206dt) dsVar.build());
    }
}
