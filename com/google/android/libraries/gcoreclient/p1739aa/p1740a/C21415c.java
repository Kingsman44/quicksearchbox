package com.google.android.libraries.gcoreclient.p1739aa.p1740a;

import android.graphics.PointF;
import android.util.Log;
import com.google.android.gms.vision.face.C146307b;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.aa.a.c */
/* compiled from: PG */
public final class C21415c {

    /* renamed from: a */
    public final C146307b f59888a;

    public C21415c(C146307b bVar) {
        this.f59888a = bVar;
    }

    /* renamed from: a */
    public final float mo26921a() {
        float f = this.f59888a.f395175g;
        Log.i("GcoreFaceImpl", "X is " + f);
        return f;
    }

    /* renamed from: b */
    public final PointF mo26922b() {
        C146307b bVar = this.f59888a;
        return new PointF(bVar.f395170b.x - (bVar.f395171c / 2.0f), bVar.f395170b.y - (bVar.f395172d / 2.0f));
    }
}
