package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1291c;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.c.d */
/* compiled from: PG */
public final class C16571d extends C68247h {

    /* renamed from: a */
    private final C68283d f48608a;

    public C16571d(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16571d.class), aVar);
        this.f48608a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        DisplayManager displayManager = (DisplayManager) ((Context) obj).getSystemService("display");
        if (displayManager == null) {
            ((C59052c) ((C59052c) C16568a.f48598a.mo56224b()).mo56372aa(46383)).mo56386p("DisplayMetrics not produced, displayManager is null");
            obj2 = C58836b.f156633a;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayManager.getDisplay(0).getMetrics(displayMetrics);
            obj2 = C58833ax.m90834k(displayMetrics);
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48608a.mo60297gq();
    }
}
