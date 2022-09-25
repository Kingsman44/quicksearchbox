package com.google.android.libraries.lens.view.p2085ax;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119096ae;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.android.libraries.lens.p2014e.p2015a.C24197p;
import com.google.android.libraries.lens.view.utils.C28109ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import com.google.p440an.p441a.C8841h;

/* renamed from: com.google.android.libraries.lens.view.ax.m */
/* compiled from: PG */
public final /* synthetic */ class C25611m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25614p f69660a;

    /* renamed from: b */
    public final /* synthetic */ String f69661b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f69662c;

    /* renamed from: d */
    public final /* synthetic */ C119096ae f69663d;

    /* renamed from: e */
    public final /* synthetic */ C119103al f69664e;

    public /* synthetic */ C25611m(C25614p pVar, String str, C58833ax axVar, C119096ae aeVar, C119103al alVar) {
        this.f69660a = pVar;
        this.f69661b = str;
        this.f69662c = axVar;
        this.f69663d = aeVar;
        this.f69664e = alVar;
    }

    public final void run() {
        C8841h hVar;
        C25614p pVar = this.f69660a;
        String str = this.f69661b;
        C58833ax axVar = this.f69662c;
        C119096ae aeVar = this.f69663d;
        C119103al alVar = this.f69664e;
        if (pVar.f69672d.compareAndSet(false, true)) {
            ((C119096ae) pVar.f69670b.mo27525b()).mo104118j("LensAndroid");
            ((C119096ae) pVar.f69670b.mo27525b()).mo104116h();
            pVar.f69674f = new C25613o(pVar, (C119096ae) pVar.f69670b.mo27525b());
            ((C119096ae) pVar.f69670b.mo27525b()).mo104110b(pVar.f69674f);
        }
        if (str.isEmpty()) {
            hVar = null;
        } else {
            hVar = C8841h.m23466a(str);
        }
        C58847bk bkVar = (C58847bk) axVar;
        int i = 0;
        for (C56235ap apVar : ((C56242aw) bkVar.f156646a).f149801a) {
            for (C56233an anVar : apVar.f149783b) {
                i += anVar.f149778b.size();
            }
        }
        if (((long) i) <= 3 && hVar != null) {
            aeVar.mo104185q(hVar.f30255g);
        } else {
            aeVar.mo104185q(BuildConfig.FLAVOR);
        }
        C25603e d = C25604f.m47222d();
        d.mo30690b(alVar);
        C58490gz gzVar = new C58490gz(4);
        int i2 = 0;
        for (C56235ap apVar2 : ((C56242aw) bkVar.f156646a).f149801a) {
            String str2 = BuildConfig.FLAVOR;
            for (C56233an anVar2 : apVar2.f149783b) {
                for (C56241av avVar : anVar2.f149778b) {
                    int length = i2 + str2.length();
                    C24197p a = C28109ak.m52387a(0, avVar);
                    gzVar.mo55429h(Integer.valueOf(length), a);
                    i2 = length + avVar.f149795c.length();
                    str2 = a.f66139d;
                }
            }
            i2++;
        }
        C58495hd f = gzVar.mo55427f(false);
        C25592a aVar = (C25592a) d;
        aVar.f69627a = f;
        aVar.f69628b = hVar;
        pVar.f69677i = d.mo30689a();
        aeVar.mo104109a(alVar);
    }
}
