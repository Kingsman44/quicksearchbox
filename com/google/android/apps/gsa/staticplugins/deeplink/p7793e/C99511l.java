package com.google.android.apps.gsa.staticplugins.deeplink.p7793e;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84668f;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52151hc;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.e.l */
/* compiled from: PG */
public final class C99511l extends C86734a implements C84668f {

    /* renamed from: a */
    private static final C59071e f278456a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.e.l");

    /* renamed from: b */
    private final Context f278457b;

    /* renamed from: c */
    private final C85005h f278458c;

    /* renamed from: f */
    private final C86124t f278459f;

    public C99511l(Context context, C85005h hVar, C86124t tVar) {
        super(C118575h.WORKER_DEEPLINK, "recipesdeeplink");
        this.f278457b = context;
        this.f278458c = hVar;
        this.f278459f = tVar;
    }

    /* renamed from: a */
    public final void mo78406a(Uri uri) {
        C58833ax axVar;
        if (this.f278459f.mo79746e(C89968ag.f246512l)) {
            String host = uri.getHost();
            if (host == null || !host.equals("assistant.google.com")) {
                ((C59052c) ((C59052c) f278456a.mo56226d()).mo56372aa(19289)).mo56389s("Deeplink is missing recipes host: %s. Ignoring.", uri);
                axVar = C58836b.f156633a;
            } else {
                String path = uri.getPath();
                if (path == null || !path.equals("/recipes")) {
                    ((C59052c) ((C59052c) f278456a.mo56226d()).mo56372aa(19290)).mo56389s("Deeplink is missing recipes path prefix: %s. Ignoring.", uri);
                    axVar = C58836b.f156633a;
                } else {
                    String queryParameter = uri.getQueryParameter("encrypted_docid");
                    if (queryParameter == null) {
                        ((C59052c) ((C59052c) f278456a.mo56226d()).mo56372aa(19291)).mo56389s("Docid missing in deeplink: %s. Ignoring.", uri);
                        axVar = C58836b.f156633a;
                    } else {
                        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
                        mVar.copyOnWrite();
                        C61752n nVar = (C61752n) mVar.instance;
                        nVar.f166810a |= 4;
                        nVar.f166811b = "StartGuidanceStepByStep";
                        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
                        gVar.copyOnWrite();
                        C61746h hVar = (C61746h) gVar.instance;
                        hVar.f166793a |= 2;
                        hVar.f166796d = "encrypted_docid";
                        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
                        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
                        sVar.copyOnWrite();
                        C61758t tVar = (C61758t) sVar.instance;
                        tVar.f166826a = 1;
                        tVar.f166827b = queryParameter;
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
                        C52151hc hcVar = (C52151hc) C52152hd.f136850c.createBuilder();
                        C63088z byteString = ((C61752n) mVar.build()).toByteString();
                        hcVar.copyOnWrite();
                        C52152hd hdVar = (C52152hd) hcVar.instance;
                        byteString.getClass();
                        hdVar.f136852a |= 1;
                        hdVar.f136853b = byteString;
                        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                        jzVar.copyOnWrite();
                        C52230ka kaVar = (C52230ka) jzVar.instance;
                        kaVar.f137059a |= 1;
                        kaVar.f137060b = "assistant.api.client_input.IntentInput";
                        C63088z byteString2 = ((C52152hd) hcVar.build()).toByteString();
                        jzVar.copyOnWrite();
                        C52230ka kaVar2 = (C52230ka) jzVar.instance;
                        byteString2.getClass();
                        kaVar2.f137059a |= 2;
                        kaVar2.f137061c = byteString2;
                        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
                        dsVar.copyOnWrite();
                        C51805du duVar = (C51805du) dsVar.instance;
                        duVar.f135926a |= 1;
                        duVar.f135927b = "asst_input.INTENT";
                        dsVar.mo53729a("intent_input", (C52230ka) jzVar.build());
                        axVar = C58833ax.m90834k((C51805du) dsVar.build());
                    }
                }
            }
            if (axVar.mo56113h()) {
                C87565h hVar3 = new C87565h();
                hVar3.f236517U = ((C51805du) axVar.mo56107c()).toByteArray();
                hVar3.f236523a = "and.opa.launcher.shortcut";
                hVar3.f236497A = true;
                hVar3.f236560f = 3;
                hVar3.f236549at = this.f278457b.getString(R.string.recipes_processing_message);
                this.f278458c.mo78612H(hVar3.mo81685a(), false);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f278456a.mo56226d()).mo56372aa(19292)).mo56386p("Recipes deeplink is disabled.");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
