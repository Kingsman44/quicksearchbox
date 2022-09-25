package com.google.android.libraries.elements.p1714d.p1724f.p1725a;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2071ce;
import androidx.core.p098j.C2072cf;
import androidx.core.p098j.C2073cg;
import androidx.core.p098j.C2082cp;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protos.youtube.elements.C66139br;
import com.google.protos.youtube.elements.C66140bs;
import com.google.protos.youtube.elements.C66142bu;
import com.google.protos.youtube.elements.C66143bv;
import com.google.protos.youtube.elements.C66144bw;
import com.google.protos.youtube.elements.C66145bx;
import com.google.protos.youtube.elements.C66167cl;
import com.google.protos.youtube.elements.C66168cm;
import com.google.protos.youtube.elements.C66223ej;
import com.google.protos.youtube.elements.C66224ek;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69981k;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.f.a.p */
/* compiled from: PG */
public final class C21092p {

    /* renamed from: a */
    public final AccessibilityManager f59121a;

    /* renamed from: b */
    public final C21091o f59122b;

    /* renamed from: c */
    public final C21082f f59123c;

    /* renamed from: d */
    public DisplayMetrics f59124d;

    /* renamed from: e */
    private final Context f59125e;

    public C21092p(Context context, C21082f fVar) {
        this.f59125e = context;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        accessibilityManager.getClass();
        this.f59121a = accessibilityManager;
        this.f59122b = new C21091o(accessibilityManager);
        this.f59124d = context.getResources().getDisplayMetrics();
        this.f59123c = fVar;
    }

    /* renamed from: a */
    public static int m39624a(DisplayMetrics displayMetrics, int i) {
        return (int) ((((float) i) / displayMetrics.density) + 0.5f);
    }

    /* renamed from: b */
    public static C2082cp m39625b() {
        C2073cg cgVar;
        if (Build.VERSION.SDK_INT >= 30) {
            cgVar = new C2072cf();
        } else {
            cgVar = new C2071ce();
        }
        cgVar.mo5214g(7, C1926c.m5198d(0, 0, 0, 0));
        return cgVar.mo5208a();
    }

    /* renamed from: c */
    public final C70120l mo26149c(C21319z zVar) {
        C69981k kVar = new C69981k(C70120l.m102047f(new C21084h(this, zVar)), C21085i.f59095a);
        C69822d dVar = C70101a.f186843k;
        return kVar;
    }

    /* renamed from: d */
    public final byte[] mo26150d(View view, int i, int i2, C2082cp cpVar) {
        if (view != null) {
            i = m39624a(this.f59124d, view.getWidth());
            i2 = m39624a(this.f59124d, view.getHeight());
        }
        DisplayMetrics displayMetrics = this.f59124d;
        int a = m39624a(displayMetrics, displayMetrics.widthPixels);
        DisplayMetrics displayMetrics2 = this.f59124d;
        int a2 = m39624a(displayMetrics2, displayMetrics2.heightPixels);
        int i3 = (a == 0 || a2 == 0) ? 1 : a2 > a ? 4 : 2;
        C66167cl clVar = (C66167cl) C66168cm.f179928j.createBuilder();
        clVar.copyOnWrite();
        C66168cm cmVar = (C66168cm) clVar.instance;
        cmVar.f179935f = 0;
        cmVar.f179930a |= 16;
        clVar.copyOnWrite();
        C66168cm cmVar2 = (C66168cm) clVar.instance;
        cmVar2.f179930a |= 1;
        cmVar2.f179931b = (float) i;
        clVar.copyOnWrite();
        C66168cm cmVar3 = (C66168cm) clVar.instance;
        cmVar3.f179930a |= 2;
        cmVar3.f179932c = (float) i2;
        C66139br brVar = (C66139br) C66140bs.f179852c.createBuilder();
        brVar.copyOnWrite();
        C66140bs bsVar = (C66140bs) brVar.instance;
        bsVar.f179855b = i3 - 1;
        bsVar.f179854a |= 1;
        C66140bs bsVar2 = (C66140bs) brVar.build();
        clVar.copyOnWrite();
        C66168cm cmVar4 = (C66168cm) clVar.instance;
        bsVar2.getClass();
        cmVar4.f179933d = bsVar2;
        cmVar4.f179930a |= 4;
        C66223ej ejVar = (C66223ej) C66224ek.f180081d.createBuilder();
        ejVar.copyOnWrite();
        C66224ek ekVar = (C66224ek) ejVar.instance;
        ekVar.f180083a |= 1;
        ekVar.f180084b = (float) a;
        ejVar.copyOnWrite();
        C66224ek ekVar2 = (C66224ek) ejVar.instance;
        ekVar2.f180083a |= 2;
        ekVar2.f180085c = (float) a2;
        C66224ek ekVar3 = (C66224ek) ejVar.build();
        clVar.copyOnWrite();
        C66168cm cmVar5 = (C66168cm) clVar.instance;
        ekVar3.getClass();
        cmVar5.f179934e = ekVar3;
        cmVar5.f179930a |= 8;
        int i4 = this.f59125e.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600 ? 1 : 2;
        clVar.copyOnWrite();
        C66168cm cmVar6 = (C66168cm) clVar.instance;
        cmVar6.f179936g = i4 - 1;
        cmVar6.f179930a |= 32;
        DisplayMetrics displayMetrics3 = this.f59124d;
        C1926c a3 = cpVar.f5994b.mo5216a(7);
        C66142bu buVar = (C66142bu) C66143bv.f179857f.createBuilder();
        C66144bw bwVar = (C66144bw) C66145bx.f179864d.createBuilder();
        int a4 = m39624a(displayMetrics3, a3.f5822c);
        bwVar.copyOnWrite();
        C66145bx bxVar = (C66145bx) bwVar.instance;
        bxVar.f179866a |= 1;
        bxVar.f179867b = (float) a4;
        C66145bx bxVar2 = (C66145bx) bwVar.build();
        buVar.copyOnWrite();
        C66143bv bvVar = (C66143bv) buVar.instance;
        bxVar2.getClass();
        bvVar.f179860b = bxVar2;
        bvVar.f179859a |= 1;
        C66144bw bwVar2 = (C66144bw) C66145bx.f179864d.createBuilder();
        int a5 = m39624a(displayMetrics3, a3.f5824e);
        bwVar2.copyOnWrite();
        C66145bx bxVar3 = (C66145bx) bwVar2.instance;
        bxVar3.f179866a |= 1;
        bxVar3.f179867b = (float) a5;
        C66145bx bxVar4 = (C66145bx) bwVar2.build();
        buVar.copyOnWrite();
        C66143bv bvVar2 = (C66143bv) buVar.instance;
        bxVar4.getClass();
        bvVar2.f179862d = bxVar4;
        bvVar2.f179859a |= 4;
        C66144bw bwVar3 = (C66144bw) C66145bx.f179864d.createBuilder();
        int a6 = m39624a(displayMetrics3, a3.f5821b);
        bwVar3.copyOnWrite();
        C66145bx bxVar5 = (C66145bx) bwVar3.instance;
        bxVar5.f179866a |= 1;
        bxVar5.f179867b = (float) a6;
        C66145bx bxVar6 = (C66145bx) bwVar3.build();
        buVar.copyOnWrite();
        C66143bv bvVar3 = (C66143bv) buVar.instance;
        bxVar6.getClass();
        bvVar3.f179861c = bxVar6;
        bvVar3.f179859a |= 2;
        C66144bw bwVar4 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar4.copyOnWrite();
        C66145bx bxVar7 = (C66145bx) bwVar4.instance;
        bxVar7.f179866a |= 1;
        bxVar7.f179867b = (float) m39624a(displayMetrics3, a3.f5823d);
        C66145bx bxVar8 = (C66145bx) bwVar4.build();
        buVar.copyOnWrite();
        C66143bv bvVar4 = (C66143bv) buVar.instance;
        bxVar8.getClass();
        bvVar4.f179863e = bxVar8;
        bvVar4.f179859a |= 8;
        C66143bv bvVar5 = (C66143bv) buVar.build();
        clVar.copyOnWrite();
        C66168cm cmVar7 = (C66168cm) clVar.instance;
        bvVar5.getClass();
        cmVar7.f179938i = bvVar5;
        cmVar7.f179930a |= 128;
        Boolean a7 = this.f59122b.mo26147a();
        if (a7 != null) {
            boolean booleanValue = a7.booleanValue();
            clVar.copyOnWrite();
            C66168cm cmVar8 = (C66168cm) clVar.instance;
            cmVar8.f179930a |= 64;
            cmVar8.f179937h = booleanValue;
        }
        return ((C66168cm) clVar.build()).toByteArray();
    }
}
