package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8570c;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111593r;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19176d;
import com.google.android.libraries.assistant.p1594s.p1597b.C19195w;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.c.a */
/* compiled from: PG */
public final /* synthetic */ class C113002a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C113003b f313172a;

    /* renamed from: b */
    public final /* synthetic */ C19167ba f313173b;

    public /* synthetic */ C113002a(C113003b bVar, C19167ba baVar) {
        this.f313172a = bVar;
        this.f313173b = baVar;
    }

    public final Object call() {
        C113003b bVar = this.f313172a;
        C19195w wVar = this.f313173b.f53690r;
        if (wVar == null) {
            wVar = C19195w.f53744e;
        }
        C19176d dVar = wVar.f53749d;
        if (dVar == null) {
            dVar = C19176d.f53709f;
        }
        if (dVar.f53713c) {
            if (bVar.f313177c.isEmpty()) {
                ((C59052c) ((C59052c) C113003b.f313174a.mo56226d()).mo56372aa(27905)).mo56386p("#retrieveSuggestionsInternalWithAppPreferences: AppPreferencesDataStore not present.");
            } else {
                C60870cx a = ((C130333h) bVar.f313177c.get()).mo109665a();
                ((C111593r) bVar.f313176b.mo27525b()).mo99179d();
                C90877ak.m148480n(a);
                return Boolean.TRUE;
            }
        }
        ((C111593r) bVar.f313176b.mo27525b()).mo99179d();
        return Boolean.TRUE;
    }
}
