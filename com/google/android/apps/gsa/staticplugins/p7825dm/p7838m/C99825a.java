package com.google.android.apps.gsa.staticplugins.p7825dm.p7838m;

import android.content.Context;
import android.databinding.C0118a;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.play.core.p3531d.C45058a;
import com.google.android.play.core.p3531d.C45062b;
import com.google.android.play.core.p3531d.C45063c;
import com.google.android.play.core.p3531d.C45064d;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4316u.C56823b;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.m.a */
/* compiled from: PG */
public final class C99825a {

    /* renamed from: b */
    private static final C59071e f279273b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.m.a");

    /* renamed from: a */
    final C45064d f279274a;

    /* renamed from: c */
    private final C89688a f279275c;

    /* renamed from: d */
    private final C84411o f279276d;

    public C99825a(Context context, C89688a aVar, C84411o oVar) {
        this.f279274a = C45063c.m80223a(context);
        this.f279275c = aVar;
        this.f279276d = oVar;
    }

    @JavascriptInterface
    public void detach(String str, String str2) {
        C84410n a = this.f279276d.mo77963a(str, str2, this.f279275c);
        this.f279274a.f117703a.mo48899a();
        a.mo77962d("{}");
    }

    @JavascriptInterface
    public void prewarm(String str, String str2, String str3) {
        C84410n a = this.f279276d.mo77963a(str2, str3, this.f279275c);
        C45058a aVar = new C45058a();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (String a2 : ((C56823b) C87556d.m142212a(str, C56823b.f151614b.getParserForType())).f151616a) {
                    aVar.mo48897a(a2);
                }
            } catch (C62974ct | IllegalArgumentException e) {
                C0118a.m110r(f279273b.mo56225c(), "Could not parse client input.", 32907, e, C58979ad.FULL);
            }
        }
        this.f279274a.f117703a.mo48900b(new C45062b(aVar));
        a.mo77962d("{}");
    }
}
