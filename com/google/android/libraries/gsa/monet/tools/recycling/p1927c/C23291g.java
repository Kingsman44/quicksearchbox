package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a.C105738q;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.g */
/* compiled from: PG */
public final class C23291g extends C0673gh {

    /* renamed from: a */
    public final C22939d f63768a;

    /* renamed from: b */
    public final C22945j f63769b;

    /* renamed from: c */
    public C23296l f63770c;

    /* renamed from: d */
    public String f63771d;

    /* renamed from: e */
    public String f63772e;

    /* renamed from: f */
    final /* synthetic */ C23292h f63773f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23291g(C23292h hVar, View view, C22939d dVar, C22945j jVar) {
        super(view);
        this.f63773f = hVar;
        this.f63768a = dVar;
        this.f63769b = jVar;
    }

    /* renamed from: a */
    public final void mo28779a() {
        mo28780b();
        this.f63769b.mo28307r(this.f63768a);
        setIsRecyclable(false);
    }

    /* renamed from: b */
    public final void mo28780b() {
        C23296l lVar = this.f63770c;
        if (lVar != null) {
            C22939d dVar = this.f63768a;
            String str = this.f63771d;
            str.getClass();
            lVar.f63787H.remove(dVar);
            lVar.mo28791ji(dVar, str);
            for (C105738q qVar : lVar.f63788I) {
                Set set = qVar.f295097c;
                set.getClass();
                set.remove(dVar);
                qVar.f295098d.f295103c.remove(C105738q.m176028e(dVar));
            }
            C23292h hVar = this.f63773f;
            if (hVar.f63776c) {
                Map map = hVar.f63775b;
                String str2 = this.f63772e;
                str2.getClass();
                map.remove(str2);
            }
            this.f63769b.mo28308v(this.f63768a);
            this.f63770c = null;
            this.f63772e = null;
            this.f63771d = null;
        }
    }
}
