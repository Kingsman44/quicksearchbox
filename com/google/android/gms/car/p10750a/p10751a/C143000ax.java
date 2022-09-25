package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import com.google.android.gms.car.C143134br;
import com.google.android.gms.car.p10760f.p10761a.C143235a;
import com.google.android.gms.car.p10768k.p10769a.C143323a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.gms.car.a.a.ax */
/* compiled from: PG */
public final class C143000ax extends C142995as {

    /* renamed from: g */
    public final C142996at f388039g;

    /* renamed from: h */
    public final C60870cx f388040h;

    protected C143000ax(C142996at atVar, Looper looper) {
        super(looper);
        this.f388039g = atVar;
        this.f388031f = new C142998av(this).f388037a.mo117940t();
        this.f388040h = C60922j.m93044g(C60838bs.m92859i(C60922j.m93044g(((C143011bh) atVar).mo117957c(), C143006bc.f388049a, C60826bg.f164896a)), new C142999aw(this), new C143323a(new C144861c(Looper.getMainLooper())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final C143134br mo117937s() {
        C58838bb.m90884s(this.f388039g != null, "Client is not connected yet.");
        C143134br b = this.f388039g.mo117939b();
        b.getClass();
        return b;
    }

    /* renamed from: t */
    public final C143235a mo117940t() {
        return new C143235a(new C142997au(this));
    }

    public final String toString() {
        String str;
        C142996at atVar = this.f388039g;
        if (atVar != null) {
            str = String.valueOf(atVar.getClass()) + "@" + this.f388039g.hashCode();
        } else {
            str = "null";
        }
        return String.valueOf(getClass()) + "@" + hashCode() + "/" + str;
    }
}
