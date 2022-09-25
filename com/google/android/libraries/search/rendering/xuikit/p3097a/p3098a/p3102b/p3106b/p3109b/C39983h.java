package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3109b;

import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1714d.C20873cx;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40327r;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.android.libraries.search.video.conductor.C41482e;
import com.google.android.libraries.search.video.players.C41593x;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57175f;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b.C57736l;
import com.google.protobuf.MessageLite;
import java.util.List;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.b.h */
/* compiled from: PG */
public final class C39983h implements C20873cx {

    /* renamed from: a */
    private final C41593x f105105a;

    /* renamed from: b */
    private final C40480q f105106b;

    /* renamed from: c */
    private final C21313t f105107c;

    /* renamed from: d */
    private final C40327r f105108d;

    /* renamed from: e */
    private final C41482e f105109e;

    public C39983h(C41482e eVar, C41593x xVar, C40480q qVar, C21313t tVar, C40327r rVar) {
        this.f105109e = eVar;
        this.f105105a = xVar;
        this.f105106b = qVar;
        this.f105107c = tVar;
        this.f105108d = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C6405o mo25998a(C6411u uVar, C21319z zVar, MessageLite messageLite, String str, List list) {
        C57194y yVar;
        C57736l lVar = (C57736l) messageLite;
        C39968a aVar = new C39968a();
        aVar.mo42099d(uVar, new C39978c());
        C57128al alVar = lVar.f154249b;
        if (alVar == null) {
            alVar = C57128al.f152495c;
        }
        int i = alVar.f152497a;
        if (i == 2) {
            yVar = ((C57175f) alVar.f152498b).f152642c;
            if (yVar == null) {
                yVar = C57194y.f152692i;
            }
        } else if (i == 1) {
            yVar = (C57194y) alVar.f152498b;
        } else {
            yVar = C57194y.f152692i;
        }
        float f = yVar.f152697d;
        if (f <= 0.0f) {
            f = 1.7777778f;
        }
        aVar.mo13443p(f);
        aVar.f105078a.f105096g = lVar;
        aVar.f105079d.set(5);
        aVar.f105078a.f105091b = this.f105107c;
        aVar.f105079d.set(1);
        aVar.f105078a.f105093d = zVar;
        aVar.f105079d.set(3);
        aVar.f105078a.f105092c = this.f105109e.mo44003a(BuildConfig.FLAVOR);
        aVar.f105079d.set(2);
        aVar.f105078a.f105089B = this.f105105a;
        aVar.f105079d.set(7);
        aVar.f105078a.f105088A = this.f105108d;
        aVar.f105079d.set(6);
        aVar.f105078a.f105095f = this.f105106b;
        aVar.f105079d.set(4);
        if (str != null) {
            aVar.f105078a.f105094e = str;
        }
        return aVar;
    }
}
