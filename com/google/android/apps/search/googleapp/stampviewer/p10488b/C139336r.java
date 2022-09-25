package com.google.android.apps.search.googleapp.stampviewer.p10488b;

import android.net.Uri;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Collection;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.r */
/* compiled from: PG */
public final class C139336r {

    /* renamed from: a */
    private static final C59071e f378949a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.b.r");

    /* renamed from: b */
    private final String f378950b;

    /* renamed from: c */
    private Optional f378951c = Optional.empty();

    public C139336r(String str) {
        this.f378950b = str;
    }

    /* renamed from: a */
    public static C139335q m226469a(C139321c cVar) {
        C139319a aVar = new C139319a();
        aVar.mo114895b(false);
        aVar.f378907a = cVar;
        return aVar.mo114894a();
    }

    /* renamed from: b */
    public static C139335q m226470b() {
        C139319a aVar = new C139319a();
        aVar.mo114895b(true);
        return aVar.mo114894a();
    }

    /* renamed from: e */
    public static C139335q m226471e(String str) {
        if (C58837ba.m90859h(str)) {
            return m226469a(C139321c.NO_PUBLISHER_URL);
        }
        return m226470b();
    }

    /* renamed from: f */
    private final Pattern m226472f() {
        if (this.f378951c.isEmpty()) {
            try {
                this.f378951c = Optional.m71637of(Pattern.compile(this.f378950b));
            } catch (PatternSyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f378949a.mo56225c()).mo56382g(e)).mo56372aa(41372)).mo56354G("Found invalid AMP Cache URL regex: \"%s\". Using default regex instead: \"%s\".", this.f378950b, ".*\\.cdn\\.ampproject\\.org.*");
                this.f378951c = Optional.m71637of(Pattern.compile(".*\\.cdn\\.ampproject\\.org.*"));
            }
        }
        return (Pattern) this.f378951c.get();
    }

    /* renamed from: g */
    private static boolean m226473g(Collection collection) {
        return Collection.EL.stream(collection).distinct().count() == ((long) collection.size());
    }

    /* renamed from: c */
    public final C139335q mo114905c(java.util.Collection collection, java.util.Collection collection2) {
        C139335q qVar;
        C139335q qVar2;
        if (!m226473g(collection2)) {
            qVar = m226469a(C139321c.DUPLICATE_PUBLISHER_URLS);
        } else {
            qVar = (C139335q) Collection.EL.stream(collection2).map(C139330l.f378945a).filter(C139331m.f378946a).findFirst().orElse(m226470b());
        }
        if (!qVar.mo114897b()) {
            return qVar;
        }
        if (!m226473g(collection)) {
            qVar2 = m226469a(C139321c.DUPLICATE_CACHE_URLS);
        } else {
            qVar2 = (C139335q) Collection.EL.stream(collection).map(new C139332n(this)).filter(C139333o.f378948a).findFirst().orElse(m226470b());
        }
        if (!qVar2.mo114897b()) {
            return qVar2;
        }
        return m226470b();
    }

    /* renamed from: d */
    public final C139335q mo114906d(String str) {
        if (C58837ba.m90859h(str)) {
            return m226469a(C139321c.NO_CACHE_URL);
        }
        if (C58837ba.m90859h(str) || !"https".equals(Uri.parse(str).getScheme())) {
            return m226469a(C139321c.INSECURE_URL);
        }
        if (C58837ba.m90859h(str) || !m226472f().matcher(str).find()) {
            return m226469a(C139321c.URL_DOES_NOT_MATCH_CACHE_REGEX);
        }
        return m226470b();
    }
}
