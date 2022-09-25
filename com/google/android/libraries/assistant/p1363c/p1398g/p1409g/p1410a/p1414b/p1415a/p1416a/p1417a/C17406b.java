package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1416a.p1417a;

import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.C17404a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66598bx;
import com.google.speech.p5208h.C66599by;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.a.a.a.b */
/* compiled from: PG */
public final class C17406b extends C68247h {

    /* renamed from: a */
    private final C68283d f50300a;

    /* renamed from: c */
    private final C68283d f50301c;

    /* renamed from: d */
    private final C68283d f50302d;

    public C17406b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C17406b.class), aVar);
        this.f50300a = C68236af.m98549d(dVar);
        this.f50301c = C68236af.m98549d(dVar2);
        this.f50302d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        String str = (String) list.get(0);
        Optional optional = (Optional) list.get(1);
        int intValue = ((Integer) list.get(2)).intValue();
        C66598bx bxVar = (C66598bx) C66599by.f181159p.createBuilder();
        bxVar.copyOnWrite();
        C66599by byVar = (C66599by) bxVar.instance;
        byVar.f181162a |= 4;
        byVar.f181167f = "Android";
        String str2 = Build.DISPLAY;
        bxVar.copyOnWrite();
        C66599by byVar2 = (C66599by) bxVar.instance;
        str2.getClass();
        byVar2.f181162a |= 8;
        byVar2.f181168g = str2;
        String str3 = Build.MODEL;
        bxVar.copyOnWrite();
        C66599by byVar3 = (C66599by) bxVar.instance;
        str3.getClass();
        byVar3.f181162a |= 64;
        byVar3.f181171j = str3;
        bxVar.copyOnWrite();
        C66599by byVar4 = (C66599by) bxVar.instance;
        str.getClass();
        byVar4.f181162a |= 16;
        byVar4.f181169h = str;
        String num = Integer.toString(intValue);
        bxVar.copyOnWrite();
        C66599by byVar5 = (C66599by) bxVar.instance;
        num.getClass();
        byVar5.f181162a |= 32;
        byVar5.f181170i = num;
        if (optional.isPresent()) {
            int i = ((DisplayMetrics) optional.get()).widthPixels;
            bxVar.copyOnWrite();
            C66599by byVar6 = (C66599by) bxVar.instance;
            byVar6.f181162a |= 128;
            byVar6.f181172k = i;
            int i2 = ((DisplayMetrics) optional.get()).heightPixels;
            bxVar.copyOnWrite();
            C66599by byVar7 = (C66599by) bxVar.instance;
            byVar7.f181162a |= 256;
            byVar7.f181173l = i2;
            int i3 = ((DisplayMetrics) optional.get()).densityDpi;
            bxVar.copyOnWrite();
            C66599by byVar8 = (C66599by) bxVar.instance;
            byVar8.f181162a |= 512;
            byVar8.f181174m = i3;
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(new C17404a(Optional.m71637of((C66599by) bxVar.build()), C66599by.f181160q));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f50300a.mo60297gq(), this.f50301c.mo60297gq(), this.f50302d.mo60297gq());
    }
}
