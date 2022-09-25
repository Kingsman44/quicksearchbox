package com.google.android.apps.search.googleapp.stampviewer.webview;

import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139352h;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139550a;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139551b;
import com.google.android.apps.search.googleapp.stampviewer.webview.p10504e.C139554e;
import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.C139655e;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.w */
/* compiled from: PG */
final class C139665w implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139638n f379645a;

    public C139665w(C139638n nVar) {
        this.f379645a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139352h hVar = (C139352h) bVar;
        C139638n nVar = this.f379645a;
        if (hVar.mo114911a()) {
            nVar.f379593q = false;
            while (!nVar.f379583g.isEmpty()) {
                try {
                    nVar.mo115122e((C139655e) nVar.f379583g.removeFirst());
                } catch (JSONException e) {
                    ((C59052c) ((C59052c) ((C59052c) C139638n.f379570a.mo56226d()).mo56382g(e)).mo56372aa(41384)).mo56386p("Failed to construct queued message.");
                }
            }
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("PAGE_ATTACHMENT_STATE");
            treeSet.add("EDUCATION_STATE");
            for (String str : treeSet) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", str);
                    nVar.mo115122e(C139655e.m227076a("onDocumentState", jSONObject));
                } catch (JSONException e2) {
                    ((C59052c) ((C59052c) ((C59052c) C139638n.f379570a.mo56226d()).mo56382g(e2)).mo56372aa(41381)).mo56389s("Failed to construct %s subscription message.", str);
                }
            }
            C139343y a = C139343y.m226483a(nVar.f379579c.f379037g);
            if (a == null) {
                a = C139343y.VIEWER_MODE_UNSPECIFIED;
            }
            if (a.equals(C139343y.VIEWER_MODE_INLINE) || !nVar.f379579c.f379039i) {
                try {
                    nVar.mo115122e(C139655e.m227076a("rewind", new JSONObject()));
                } catch (JSONException e3) {
                    ((C59052c) ((C59052c) ((C59052c) C139638n.f379570a.mo56226d()).mo56382g(e3)).mo56372aa(41385)).mo56386p("Failed to construct rewind message.");
                }
            }
        }
        C139554e eVar = nVar.f379584h;
        boolean a2 = hVar.mo114911a();
        C44080d dVar = eVar.f379406b;
        C139550a aVar = (C139550a) ((C139551b) dVar.mo47045a()).toBuilder();
        aVar.copyOnWrite();
        C139551b bVar2 = (C139551b) aVar.instance;
        bVar2.f379398a |= 4;
        bVar2.f379401d = true;
        aVar.copyOnWrite();
        C139551b bVar3 = (C139551b) aVar.instance;
        bVar3.f379398a |= 8;
        bVar3.f379402e = a2;
        dVar.mo47046b((C139551b) aVar.build());
        eVar.mo115055c();
        if (nVar.f379594r) {
            nVar.f379590n.mo56160e();
            nVar.f379590n.mo56161f();
        }
        C139554e eVar2 = nVar.f379584h;
        C44080d dVar2 = eVar2.f379406b;
        C139550a aVar2 = (C139550a) ((C139551b) dVar2.mo47045a()).toBuilder();
        aVar2.copyOnWrite();
        C139551b bVar4 = (C139551b) aVar2.instance;
        bVar4.f379398a |= 1;
        bVar4.f379399b = true;
        dVar2.mo47046b((C139551b) aVar2.build());
        eVar2.mo115055c();
        nVar.mo115127j(C37182a.f97979dz.mo40806d());
        return nVar.f379596t.equals(C139343y.VIEWER_MODE_INLINE) ? C47392e.f123116b : C47392e.f123115a;
    }
}
