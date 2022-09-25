package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88561l;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.common.p4522b.C58597ky;
import com.google.p395al.p417d.p418a.C8574bb;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.i.h */
/* compiled from: PG */
public final class C116923h implements C88561l {

    /* renamed from: a */
    private final C86124t f324626a;

    /* renamed from: b */
    private final C116920e f324627b;

    /* renamed from: c */
    private final C116921f f324628c;

    /* renamed from: d */
    private boolean f324629d = true;

    public C116923h(C86124t tVar, C116920e eVar, C116921f fVar) {
        this.f324626a = tVar;
        this.f324627b = eVar;
        this.f324628c = fVar;
    }

    /* renamed from: a */
    public final int mo82228a() {
        return 2;
    }

    /* renamed from: b */
    public final C41626a mo82229b(C88616t tVar) {
        C88616t tVar2 = tVar;
        if ((tVar2.f239561f.getBoolean("cs::on_focus") && !tVar2.f239561f.getBoolean("cs::on_focus_prefetch")) || tVar2.f239561f.getBoolean("cs::on_focus_c")) {
            this.f324628c.mo103059c();
        }
        C8575bc a = this.f324627b.mo103057a(tVar2.f239556a);
        boolean e = this.f324626a.mo79746e(C90085ej.f250169at);
        if (a == null || this.f324626a.mo79746e(C90085ej.f250117U) || (e && !"web".equals(tVar2.f239558c))) {
            return null;
        }
        if (!this.f324626a.mo79746e(C90085ej.f250104H) || (tVar2.f239561f.getBoolean("cs::on_focus_c") && this.f324629d)) {
            this.f324629d = false;
            if (a.f29693b) {
                this.f324628c.mo103060g();
            }
            if (a.f29696e) {
                this.f324628c.mo103058a();
            }
            C62971cq<C8574bb> cqVar = a.f29694c;
            if (cqVar.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i = 10;
            for (C8574bb bbVar : cqVar) {
                arrayList.add(new RootSuggestion(bbVar.f29688b, 1, 0, C58597ky.m90212c(Integer.valueOf(bbVar.f29689c)), BuildConfig.FLAVOR, C41669ai.f108954c, i, (C54228aq) null, C41679e.f109005p));
                i--;
            }
            return new C41626a(arrayList, (Bundle) null, false, true, C54231at.f142359r);
        }
        tVar2.f239561f.putBoolean("cs::on_focus_c", false);
        return null;
    }

    /* renamed from: c */
    public final void mo82230c() {
        this.f324629d = true;
    }

    /* renamed from: d */
    public final void mo82231d() {
    }
}
