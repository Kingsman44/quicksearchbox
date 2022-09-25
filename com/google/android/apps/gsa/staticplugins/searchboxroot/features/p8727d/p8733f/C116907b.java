package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8733f;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88552c;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88555f;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.f.b */
/* compiled from: PG */
public final class C116907b implements C88552c, C89200e {

    /* renamed from: a */
    private static final C58485gu f324577a = C58485gu.m89847o(308, 67);

    /* renamed from: b */
    private final C86124t f324578b;

    /* renamed from: c */
    private final C86338r f324579c;

    /* renamed from: d */
    private final C21370a f324580d;

    /* renamed from: e */
    private C88555f f324581e;

    public C116907b(C86124t tVar, C86338r rVar, C21370a aVar) {
        this.f324578b = tVar;
        this.f324579c = rVar;
        this.f324580d = aVar;
    }

    /* renamed from: c */
    public final int mo82214c(C88616t tVar) {
        if (!this.f324578b.mo79746e(C90085ej.f250161al) || !TextUtils.isEmpty(tVar.f239556a.mo84352bk()) || !this.f324579c.getBoolean("signed_out_search", true)) {
            return 1;
        }
        String string = this.f324579c.getString("previous_query", BuildConfig.FLAVOR);
        long seconds = Duration.ofMillis(this.f324580d.mo26870b() - this.f324579c.getLong("previous_query_ms", 0)).getSeconds();
        if (!TextUtils.isEmpty(string)) {
            if (seconds < 0 || seconds > this.f324578b.mo79743a(C90085ej.f250205bg)) {
                if (this.f324579c.contains("previous_query") && this.f324579c.contains("previous_query_ms")) {
                    C86337q b = this.f324579c.mo80076b();
                    b.mo80075j("previous_query");
                    b.mo80075j("previous_query_ms");
                    b.apply();
                }
                C88555f fVar = this.f324581e;
                fVar.getClass();
                C41626a c = fVar.mo82215c(tVar);
                if (c != null) {
                    Iterator it = c.f108836a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Suggestion) it.next()).f108925z.containsAll(f324577a)) {
                                C88555f fVar2 = this.f324581e;
                                fVar2.getClass();
                                fVar2.mo82216f();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else {
                tVar.f239562g.mo55429h("pq", string);
                tVar.f239562g.mo55429h("pq_sec", String.valueOf(seconds));
            }
        }
        return 1;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324581e = ((C88614r) obj).f239552w;
    }
}
