package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4273bs.p4277b.p4278a.C56473m;
import com.google.speech.grammar.pumpkin.C66528t;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.v */
/* compiled from: PG */
public final class C98552v extends C66528t {

    /* renamed from: a */
    private static final C59071e f275199a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.v");

    /* renamed from: b */
    private final C86124t f275200b;

    /* renamed from: c */
    private final C85596b f275201c;

    /* renamed from: d */
    private final String f275202d;

    public C98552v(C86124t tVar, C85596b bVar, String str) {
        this.f275200b = tVar;
        this.f275201c = bVar;
        this.f275202d = str;
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        if (this.f275200b.mo79746e(C90086ek.f250368bn)) {
            try {
                C56473m mVar = (C56473m) C90877ak.m148472f(this.f275201c.mo20301a(str));
                mVar.f150852a.size();
                if (mVar.f150852a.size() != 0) {
                    return 1.0f;
                }
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f275199a.mo56225c()).mo56382g(e)).mo56372aa(30806)).mo56386p("error getting WebRef Annotation");
            }
        }
        if (!Pattern.matches(true != this.f275202d.equals("sv-SE") ? ".*(radio|Radio|FM|fm|AM|am|A\\.M\\.|a\\.m\\.)" : ".*(radio|radion|Radion|Radio|FM|fm|AM|am|A\\.M\\.|a\\.m\\.)", str) || Pattern.matches(".*\\d+.*", str)) {
            return Pattern.matches(".*(10[0-9]\\s?[\\.|\\,]\\s?[0-9]|[6789][0-9]\\s?[\\.|\\,]\\s?[0-9]|1[0-7]\\:?[0-9]{2}|[56789]\\:?[0-9]{2}).*", str) ? 0.9f : 0.0f;
        }
        return 1.0f;
    }
}
