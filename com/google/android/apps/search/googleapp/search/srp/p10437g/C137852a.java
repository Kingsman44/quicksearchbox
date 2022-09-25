package com.google.android.apps.search.googleapp.search.srp.p10437g;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.g.a */
/* compiled from: PG */
public final class C137852a {

    /* renamed from: a */
    public final C136832c f375064a;

    /* renamed from: b */
    private final C65603f f375065b;

    /* renamed from: c */
    private final List f375066c;

    public C137852a(C65603f fVar, C136832c cVar) {
        C69664n.m101061g(cVar, "googleUrlAnalyzer");
        this.f375065b = fVar;
        this.f375064a = cVar;
        C62971cq cqVar = fVar.f178307a;
        C69664n.m101060f(cqVar, "nonSearchPathAllowListUrisListParam.elementList");
        this.f375066c = cqVar;
    }

    /* renamed from: a */
    public final boolean mo114007a(Uri uri) {
        String queryParameter;
        C69664n.m101061g(uri, "uri");
        if (!this.f375064a.mo113398d(uri)) {
            return false;
        }
        List<String> list = this.f375066c;
        if (this.f375064a.mo113398d(uri)) {
            String path = uri.getPath();
            String c = this.f375064a.mo113397c(uri);
            for (String parse : list) {
                Uri parse2 = Uri.parse(parse);
                C136832c cVar = this.f375064a;
                C69664n.m101060f(parse2, "allowListUri");
                if (C69664n.m101066l(c, cVar.mo113397c(parse2))) {
                    String path2 = parse2.getPath();
                    if (!(path2 == null || path2.length() == 0 || C69664n.m101066l(path2, path))) {
                        if (C69764m.m101230i(path2, "*")) {
                            String s = C69764m.m101199s(path2, "*");
                            if (path != null && C69764m.m101234m(path, s)) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return true;
                }
            }
        }
        if (this.f375064a.mo113398d(uri) && (queryParameter = uri.getQueryParameter("gsas")) != null && C69664n.m101066l(queryParameter, "1")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo114008b(Uri uri) {
        C69664n.m101061g(uri, "uri");
        if (!this.f375064a.mo113398d(uri)) {
            return false;
        }
        return C69664n.m101066l(uri.getQueryParameter("gsas"), "4");
    }

    /* renamed from: c */
    public final boolean mo114009c(Uri uri) {
        C69664n.m101061g(uri, "uri");
        return this.f375064a.mo113399e(uri) && C69664n.m101066l("/sorry/index", uri.getPath());
    }
}
