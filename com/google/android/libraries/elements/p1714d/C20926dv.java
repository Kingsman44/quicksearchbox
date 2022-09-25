package com.google.android.libraries.elements.p1714d;

import android.view.View;
import com.facebook.litho.widget.C6493cy;
import com.google.android.libraries.elements.interfaces.C21238ah;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.protos.youtube.elements.C66205ds;
import com.google.protos.youtube.elements.C66206dt;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.libraries.elements.d.dv */
/* compiled from: PG */
public final /* synthetic */ class C20926dv implements C6493cy {

    /* renamed from: a */
    public final /* synthetic */ C21357r f58685a;

    /* renamed from: b */
    public final /* synthetic */ C21313t f58686b;

    /* renamed from: c */
    public final /* synthetic */ C21319z f58687c;

    /* renamed from: d */
    public final /* synthetic */ float f58688d;

    /* renamed from: e */
    public final /* synthetic */ C21357r f58689e;

    /* renamed from: f */
    public final /* synthetic */ int f58690f;

    public /* synthetic */ C20926dv(C21357r rVar, C21313t tVar, C21319z zVar, float f, C21357r rVar2, int i) {
        this.f58685a = rVar;
        this.f58686b = tVar;
        this.f58687c = zVar;
        this.f58688d = f;
        this.f58689e = rVar2;
        this.f58690f = i;
    }

    /* renamed from: a */
    public final void mo13579a(View view, int i) {
        C21357r rVar = this.f58685a;
        C21313t tVar = this.f58686b;
        C21319z zVar = this.f58687c;
        float f = this.f58688d;
        C21357r rVar2 = this.f58689e;
        int i2 = this.f58690f;
        if (i != 0) {
            if (rVar2 != null) {
                CommandOuterClass$Command a = rVar2.mo26862a();
                C21256az h = zVar.mo26806h();
                C21238ah g = zVar.mo26805g();
                C66205ds dsVar = (C66205ds) C66206dt.f180035d.createBuilder();
                int scrollX = view.getScrollX();
                dsVar.copyOnWrite();
                C66206dt dtVar = (C66206dt) dsVar.instance;
                dtVar.f180037a |= 1;
                dtVar.f180038b = ((float) scrollX) / f;
                int scrollY = view.getScrollY();
                dsVar.copyOnWrite();
                C66206dt dtVar2 = (C66206dt) dsVar.instance;
                dtVar2.f180037a |= 2;
                dtVar2.f180039c = ((float) scrollY) / f;
                C20927dw.m39354c(view, tVar, a, h, g, (C66206dt) dsVar.build());
            }
            if (i2 == 2) {
                C20927dw.m39353b(zVar);
            }
        } else if (rVar != null) {
            CommandOuterClass$Command a2 = rVar.mo26862a();
            C21256az h2 = zVar.mo26806h();
            C21238ah g2 = zVar.mo26805g();
            C66205ds dsVar2 = (C66205ds) C66206dt.f180035d.createBuilder();
            int scrollX2 = view.getScrollX();
            dsVar2.copyOnWrite();
            C66206dt dtVar3 = (C66206dt) dsVar2.instance;
            dtVar3.f180037a |= 1;
            dtVar3.f180038b = ((float) scrollX2) / f;
            int scrollY2 = view.getScrollY();
            dsVar2.copyOnWrite();
            C66206dt dtVar4 = (C66206dt) dsVar2.instance;
            dtVar4.f180037a |= 2;
            dtVar4.f180039c = ((float) scrollY2) / f;
            C20927dw.m39354c(view, tVar, a2, h2, g2, (C66206dt) dsVar2.build());
        }
    }
}
