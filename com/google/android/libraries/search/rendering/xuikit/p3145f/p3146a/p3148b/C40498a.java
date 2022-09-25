package com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3148b;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4407b.p4408a.C57752c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4407b.p4408a.C57753d;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.a.b.a */
/* compiled from: PG */
public final class C40498a implements C21270bm {
    /* renamed from: a */
    public final C62917ay mo25837a() {
        C62940bt btVar = C57753d.f154288c;
        C69664n.m101060f(btVar, "colorModeProperties");
        return btVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C57753d dVar = (C57753d) obj;
        C69664n.m101061g(uVar, "context");
        C69664n.m101061g(zVar, "conversionContext");
        C69664n.m101061g(dVar, "colorModeProperties");
        C69664n.m101061g(arVar, "elementBuilder");
        int a = C57752c.m88529a(dVar.f154290a);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            arVar.mo25928E().mo13451y(0, (Paint) null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        arVar.mo25928E().mo13451y(2, paint);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
