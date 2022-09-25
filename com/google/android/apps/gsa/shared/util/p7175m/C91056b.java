package com.google.android.apps.gsa.shared.util.p7175m;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.search.C90506n;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.search.p7138b.C90489e;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.common.util.C60789b;
import com.google.knowledge.p4661a.C61734a;
import com.google.knowledge.p4661a.C61765b;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.knowledge.p4682d.C61992c;
import com.google.knowledge.p4682d.C61993d;
import com.google.knowledge.p4682d.C61996g;
import com.google.knowledge.p4686e.p4687a.p4688a.p4689a.C62003c;
import com.google.knowledge.p4686e.p4687a.p4688a.p4689a.C62004d;
import com.google.p4481ch.p4485b.C58092g;
import com.google.p4481ch.p4485b.C58095j;
import com.google.protobuf.C62940bt;
import com.google.protos.p4881ar.p4882a.C63770a;
import com.google.protos.p4881ar.p4882a.C63771b;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.util.m.b */
/* compiled from: PG */
public final class C91056b {

    /* renamed from: a */
    public static final C59071e f254322a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.m.b");

    /* renamed from: a */
    public static Intent m148748a(Intent intent, String str, C90491g gVar) {
        Intent intent2 = new Intent(intent);
        intent2.setAction("android.intent.action.WEB_SEARCH");
        intent2.removeExtra("android.intent.extra.TEXT");
        intent2.putExtra("query", str);
        intent2.putExtra("search-options-proto", C90506n.m147606a(gVar));
        return intent2;
    }

    /* renamed from: b */
    public static Bundle m148749b(Intent intent, String str, C90491g gVar) {
        String str2;
        Query H = Query.f252741b.mo84252O(str, gVar, (Parcelable) null, false, (C58881cr) null).mo84245H(0, false, QueryTriggerType.INTENT);
        C87565h hVar = new C87565h();
        hVar.f236565k = H;
        if (m148755h(intent)) {
            str2 = true != intent.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER") ? "and.opa.define" : "and.opa.define.ss";
        } else {
            str2 = m148757j(intent) ? true != intent.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER") ? "and.opa.translate" : "and.opa.translate.ss" : BuildConfig.FLAVOR;
        }
        hVar.f236523a = str2;
        hVar.f236556b = m148750c(intent);
        hVar.f236560f = 1;
        hVar.f236506J = true;
        hVar.f236498B = false;
        hVar.f236508L = true;
        return hVar.mo81685a();
    }

    /* renamed from: c */
    public static e m148750c(Intent intent) {
        if (m148755h(intent)) {
            if (intent.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER")) {
                return e.bN;
            }
            return e.bM;
        } else if (!m148757j(intent)) {
            return e.a;
        } else {
            if (intent.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER")) {
                return e.bP;
            }
            return e.bO;
        }
    }

    /* renamed from: d */
    public static C90491g m148751d(Intent intent, String str, String str2) {
        C58833ax k = C58833ax.m90834k(str2);
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "Define";
        C61734a aVar = (C61734a) C61765b.f166847c.createBuilder();
        aVar.copyOnWrite();
        C61765b bVar = (C61765b) aVar.instance;
        bVar.f166849a |= 8;
        bVar.f166850b = "en";
        mVar.copyOnWrite();
        C61752n nVar2 = (C61752n) mVar.instance;
        C61765b bVar2 = (C61765b) aVar.build();
        bVar2.getClass();
        nVar2.f166814e = bVar2;
        nVar2.f166810a |= 16;
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = "Term";
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        tVar.f166826a = 1;
        tVar.f166827b = (String) ((C58847bk) k).f156646a;
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C61758t tVar2 = (C61758t) sVar.build();
        tVar2.getClass();
        jVar.f166803b = tVar2;
        jVar.f166802a = 3;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar2.f166797e = jVar2;
        hVar2.f166793a |= 4;
        mVar.mo58184c(gVar);
        C63770a aVar2 = (C63770a) C63771b.f172510a.createBuilder();
        C62940bt btVar = C61993d.f167537b;
        C61992c cVar = (C61992c) C61993d.f167536a.createBuilder();
        cVar.mo58885m(C61996g.f167542a, (C61752n) mVar.build());
        aVar2.mo58885m(btVar, (C61993d) cVar.build());
        C63771b bVar3 = (C63771b) aVar2.build();
        C58092g gVar2 = (C58092g) C58095j.f155284e.createBuilder();
        gVar2.copyOnWrite();
        C58095j jVar3 = (C58095j) gVar2.instance;
        jVar3.f155287b = 34;
        jVar3.f155286a |= 1;
        gVar2.copyOnWrite();
        C58095j jVar4 = (C58095j) gVar2.instance;
        bVar3.getClass();
        jVar4.f155289d = bVar3;
        jVar4.f155286a |= 33554432;
        gVar2.copyOnWrite();
        C58095j jVar5 = (C58095j) gVar2.instance;
        str.getClass();
        jVar5.f155286a |= 4096;
        jVar5.f155288c = str;
        String k2 = m148758k((C58095j) gVar2.build());
        String str3 = true != intent.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER") ? "1t:68447" : "1t:67315";
        C90489e eVar = (C90489e) C90491g.f252884z.createBuilder();
        eVar.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar.instance;
        gVar3.f252886a |= 2;
        gVar3.f252888c = k2;
        eVar.copyOnWrite();
        C90491g gVar4 = (C90491g) eVar.instance;
        gVar4.f252886a |= 8192;
        gVar4.f252899n = str3;
        return (C90491g) eVar.build();
    }

    /* renamed from: e */
    public static C90491g m148752e(Intent intent, String str, Optional optional, Context context) {
        String k = m148758k(new C62004d(new C62003c(context)).mo58483a(23, str, optional.map(C91055a.f254321a), Optional.empty()));
        String str2 = true != intent.hasExtra("android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER") ? "1t:69216" : "1t:69217";
        C90489e eVar = (C90489e) C90491g.f252884z.createBuilder();
        eVar.copyOnWrite();
        C90491g gVar = (C90491g) eVar.instance;
        gVar.f252886a |= 2;
        gVar.f252888c = k;
        eVar.copyOnWrite();
        C90491g gVar2 = (C90491g) eVar.instance;
        gVar2.f252886a |= 8192;
        gVar2.f252899n = str2;
        return (C90491g) eVar.build();
    }

    /* renamed from: f */
    public static String m148753f(String str, Context context) {
        return context.getResources().getString(R.string.define_query, new Object[]{str});
    }

    /* renamed from: g */
    public static String m148754g(String str, Optional optional, Context context) {
        if (optional.isPresent()) {
            String displayLanguage = ((Locale) optional.get()).getDisplayLanguage(Locale.getDefault());
            return context.getResources().getString(R.string.translate_query_with_source_language, new Object[]{str, displayLanguage});
        }
        return context.getResources().getString(R.string.translate_query, new Object[]{str});
    }

    /* renamed from: h */
    public static boolean m148755h(Intent intent) {
        return "android.intent.action.DEFINE".equals(intent.getAction());
    }

    /* renamed from: i */
    public static boolean m148756i(Intent intent) {
        return m148755h(intent) || m148757j(intent);
    }

    /* renamed from: j */
    public static boolean m148757j(Intent intent) {
        return "android.intent.action.TRANSLATE".equals(intent.getAction());
    }

    /* renamed from: k */
    private static String m148758k(C58095j jVar) {
        byte[] byteArray = jVar.toByteArray();
        byte[] a = C60789b.m92791a(byteArray, byteArray.length);
        return C59326i.f157517e.mo56826f().mo56837l(a, a.length);
    }
}
