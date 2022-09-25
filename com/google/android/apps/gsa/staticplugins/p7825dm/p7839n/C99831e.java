package com.google.android.apps.gsa.staticplugins.p7825dm.p7839n;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85279a;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85284d;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85286f;
import com.google.android.apps.gsa.search.shared.p6929g.C87557e;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.n.e */
/* compiled from: PG */
public final class C99831e implements C87557e {

    /* renamed from: a */
    private static final C59071e f279284a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.n.e");

    /* renamed from: b */
    private final C89688a f279285b;

    /* renamed from: c */
    private final C84411o f279286c;

    /* renamed from: d */
    private final C85286f f279287d;

    /* renamed from: e */
    private final C22871g f279288e;

    public C99831e(C89688a aVar, C84411o oVar, C85286f fVar, C22871g gVar) {
        this.f279285b = aVar;
        this.f279286c = oVar;
        this.f279287d = fVar;
        this.f279288e = gVar;
    }

    /* renamed from: a */
    private static String m165461a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    @JavascriptInterface
    public void showShareSheet(String str, String str2, String str3) {
        C84410n a = this.f279286c.mo77963a(str2, str3, this.f279285b);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String a2 = m165461a(jSONObject, "sheetTitle");
            String a3 = m165461a(jSONObject, "plainText");
            String a4 = m165461a(jSONObject, "pageUrl");
            String a5 = m165461a(jSONObject, "imageUrl");
            boolean z = true;
            if (true == C58837ba.m90859h(a2)) {
                a2 = null;
            }
            if (true == C58837ba.m90859h(a3)) {
                a3 = null;
            }
            if (true == C58837ba.m90859h(a4)) {
                a4 = null;
            }
            if (true == C58837ba.m90859h(a5)) {
                a5 = null;
            }
            C85279a aVar = new C85279a(a2, a3, a4, a5);
            if (C58837ba.m90859h(aVar.f231046b) && C58837ba.m90859h(aVar.f231047c) && C58837ba.m90859h(aVar.f231048d)) {
                z = false;
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                a.mo77959a(new C85284d());
            } else {
                new C90873ag(this.f279287d.mo78846a(aVar), this.f279288e, "showShareSheet", new C99829c(a)).mo85223a(new C99830d(a));
            }
        } catch (JSONException unused) {
            ((C59052c) ((C59052c) f279284a.mo56225c()).mo56372aa(32908)).mo56389s("Failed to parse content: %s", str);
            a.mo77959a(new C85284d());
        }
    }
}
