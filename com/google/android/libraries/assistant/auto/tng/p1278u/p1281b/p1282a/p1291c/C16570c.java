package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1291c;

import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.C16462a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.speech.p5208h.C66598bx;
import com.google.speech.p5208h.C66599by;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.c.c */
/* compiled from: PG */
public final class C16570c extends C68247h {

    /* renamed from: a */
    private final C68283d f48601a;

    /* renamed from: c */
    private final C68283d f48602c;

    /* renamed from: d */
    private final C68283d f48603d;

    /* renamed from: e */
    private final C68283d f48604e;

    /* renamed from: f */
    private final C68283d f48605f;

    /* renamed from: g */
    private final C68283d f48606g;

    /* renamed from: h */
    private final C68283d f48607h;

    public C16570c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C16570c.class), aVar);
        this.f48601a = C68236af.m98549d(dVar);
        this.f48602c = C68236af.m98549d(dVar2);
        this.f48603d = C68236af.m98549d(dVar3);
        this.f48604e = C68236af.m98549d(dVar4);
        this.f48605f = C68236af.m98549d(dVar5);
        this.f48606g = C68236af.m98549d(dVar6);
        this.f48607h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        String str = (String) list.get(0);
        C68282c cVar = (C68282c) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        int intValue = ((Integer) list.get(3)).intValue();
        C68282c cVar2 = (C68282c) list.get(4);
        C58833ax axVar2 = (C58833ax) list.get(5);
        C15481g gVar = (C15481g) list.get(6);
        C66598bx bxVar = (C66598bx) C66599by.f181159p.createBuilder();
        bxVar.copyOnWrite();
        C66599by byVar = (C66599by) bxVar.instance;
        byVar.f181162a = 4 | byVar.f181162a;
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
        if (C57940c.m88582i(cVar)) {
            String str4 = (String) cVar.mo60292a();
            bxVar.copyOnWrite();
            C66599by byVar6 = (C66599by) bxVar.instance;
            str4.getClass();
            byVar6.f181162a = 2 | byVar6.f181162a;
            byVar6.f181164c = str4;
        } else {
            ((C59052c) ((C59052c) C16568a.f48598a.mo56225c()).mo56372aa(46378)).mo56386p("Failed to fetch the user agent.");
        }
        if (axVar.mo56113h()) {
            int i = ((DisplayMetrics) axVar.mo56107c()).widthPixels;
            bxVar.copyOnWrite();
            C66599by byVar7 = (C66599by) bxVar.instance;
            byVar7.f181162a |= 128;
            byVar7.f181172k = i;
            int i2 = ((DisplayMetrics) axVar.mo56107c()).heightPixels;
            bxVar.copyOnWrite();
            C66599by byVar8 = (C66599by) bxVar.instance;
            byVar8.f181162a |= 256;
            byVar8.f181173l = i2;
            int i3 = ((DisplayMetrics) axVar.mo56107c()).densityDpi;
            bxVar.copyOnWrite();
            C66599by byVar9 = (C66599by) bxVar.instance;
            byVar9.f181162a |= 512;
            byVar9.f181174m = i3;
        }
        if (C57940c.m88582i(cVar2)) {
            bxVar.mo59683b((Iterable) cVar2.mo60292a());
        } else {
            ((C59052c) ((C59052c) C16568a.f48598a.mo56225c()).mo56372aa(46379)).mo56386p("Failed to fetch the heterodyne experiment tokens.");
        }
        if (axVar2.mo56113h()) {
            String str5 = (String) axVar2.mo56107c();
            bxVar.copyOnWrite();
            C66599by byVar10 = (C66599by) bxVar.instance;
            str5.getClass();
            byVar10.f181162a |= 4096;
            byVar10.f181176o = str5;
        }
        gVar.mo22352b(C37179a.f97519bl);
        return C60856cj.m92900i(new C16462a(C58833ax.m90834k((C66599by) bxVar.build()), C66599by.f181160q));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48601a.mo60297gq(), C68236af.m98546a(this.f48602c.mo60297gq()), this.f48603d.mo60297gq(), this.f48604e.mo60297gq(), C68236af.m98546a(this.f48605f.mo60297gq()), this.f48606g.mo60297gq(), this.f48607h.mo60297gq());
    }
}
