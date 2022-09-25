package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.account.p8094a.C104140a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.cp */
/* compiled from: PG */
public final class C103721cp implements C103651a {

    /* renamed from: a */
    public static final C59071e f288859a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.r.c.cp");

    /* renamed from: b */
    public final C89994f f288860b;

    /* renamed from: c */
    public final C104140a f288861c;

    /* renamed from: d */
    private final C22871g f288862d;

    public C103721cp(C22871g gVar, C89994f fVar, C104140a aVar) {
        this.f288862d = gVar;
        this.f288860b = fVar;
        this.f288861c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C59071e eVar = f288859a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(21657)).mo56386p("#handleRequest.");
        if (bnVar.f219917a == 32) {
            return this.f288862d.mo28209i(this.f288862d.mo28210j(this.f288862d.mo28201a("[NGA] VoiceSearchAuthTokenHandler.handleRequest.account", new C103718cm(this)), "[NGA] VoiceSearchAuthTokenHandler.handleRequest.tokenDetails", new C103719cn(this)), "[NGA] VoiceSearchAuthTokenHandler.handleRequest.oneOffResponse", C103720co.f288858a);
        }
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(21658)).mo56386p("Invalid request. Return empty.");
        return C60856cj.m92900i(C80275dd.f220288c);
    }
}
