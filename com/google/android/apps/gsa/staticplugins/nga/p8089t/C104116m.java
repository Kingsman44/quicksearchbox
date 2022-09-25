package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80624s;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122184e;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122185f;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122191l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.m */
/* compiled from: PG */
public final /* synthetic */ class C104116m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C104123t f289632a;

    /* renamed from: b */
    public final /* synthetic */ Optional f289633b;

    /* renamed from: c */
    public final /* synthetic */ Locale f289634c;

    public /* synthetic */ C104116m(C104123t tVar, Optional optional, Locale locale) {
        this.f289632a = tVar;
        this.f289633b = optional;
        this.f289634c = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C104123t tVar = this.f289632a;
        Optional optional = this.f289633b;
        Locale locale = this.f289634c;
        C80627v vVar = (C80627v) obj;
        String str = C80624s.m128248a(vVar).f221333y;
        String c = tVar.f289650f.mo74368c(vVar);
        if (C104123t.f289646b.contains(vVar) || (str.startsWith("nga_") && c.startsWith("apa_"))) {
            C122191l lVar = tVar.f289649e;
            C122184e eVar = (C122184e) C122185f.f338875f.createBuilder();
            eVar.copyOnWrite();
            ((C122185f) eVar.instance).f338879c = true;
            String languageTag = locale.toLanguageTag();
            eVar.copyOnWrite();
            languageTag.getClass();
            ((C122185f) eVar.instance).f338878b = languageTag;
            eVar.copyOnWrite();
            str.getClass();
            ((C122185f) eVar.instance).f338880d = str;
            C60870cx b = lVar.mo105561b((C122185f) eVar.build());
            C122191l lVar2 = tVar.f289649e;
            C122184e eVar2 = (C122184e) C122185f.f338875f.createBuilder();
            String str2 = (String) optional.map(C104112i.f289624a).orElse(BuildConfig.FLAVOR);
            eVar2.copyOnWrite();
            str2.getClass();
            ((C122185f) eVar2.instance).f338881e = str2;
            String languageTag2 = locale.toLanguageTag();
            eVar2.copyOnWrite();
            languageTag2.getClass();
            ((C122185f) eVar2.instance).f338878b = languageTag2;
            eVar2.copyOnWrite();
            c.getClass();
            ((C122185f) eVar2.instance).f338880d = c;
            C60870cx b2 = lVar2.mo105561b((C122185f) eVar2.build());
            ((C58970a) ((C58970a) C104123t.f289645a.mo56224b()).mo56372aa(21677)).mo56354G("Starting the migration of %s -> %s", str, c);
            C22871g gVar = tVar.f289648d;
            return gVar.mo28210j(gVar.mo28210j(b, "[NGA] toPair(x)", new C104118o(tVar, b2)), "[NGA] migrateNgaToApaGroups", new C104062g(new C104113j(tVar, str, c, optional, vVar)));
        }
        ((C58970a) ((C58970a) C104123t.f289645a.mo56226d()).mo56372aa(21678)).mo56354G("Skipping %s -> %s. Not eligible for migration", str, c);
        return C60866ct.f164955a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
