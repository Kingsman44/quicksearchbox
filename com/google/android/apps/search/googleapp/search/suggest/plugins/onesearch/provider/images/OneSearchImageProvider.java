package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import android.content.Context;
import android.util.Base64;
import androidx.core.content.FileProvider;
import com.bumptech.glide.load.p293a.p295b.C5686b;
import com.bumptech.glide.p290g.C5602e;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138259j;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138261l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.io.File;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public final class OneSearchImageProvider implements C138283i {

    /* renamed from: a */
    public static final C59071e f376207a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.OneSearchImageProvider");

    /* renamed from: b */
    public final Context f376208b;

    /* renamed from: c */
    public final C60887da f376209c;

    /* renamed from: d */
    public final C69464a f376210d;

    /* renamed from: e */
    public final C21370a f376211e;

    /* renamed from: f */
    public final ConcurrentHashMap f376212f = new ConcurrentHashMap();

    /* renamed from: g */
    public final C138284j f376213g;

    /* renamed from: h */
    private final Executor f376214h;

    /* compiled from: PG */
    public final class OneSearchFileProvider extends FileProvider {
    }

    public OneSearchImageProvider(Context context, C60887da daVar, Executor executor, C138284j jVar, C69464a aVar, C21370a aVar2) {
        this.f376208b = context;
        this.f376209c = daVar;
        this.f376214h = executor;
        this.f376213g = jVar;
        this.f376210d = aVar;
        this.f376211e = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo114228a(C138259j jVar) {
        C138213bu buVar = (C138213bu) C138214bv.f376051f.createBuilder();
        long c = this.f376211e.mo26871c();
        buVar.copyOnWrite();
        C138214bv bvVar = (C138214bv) buVar.instance;
        bvVar.f376053a |= 1;
        bvVar.f376054b = c;
        String str = jVar.f376161b;
        if (str.startsWith("https:") || str.startsWith("data:")) {
            C60887da daVar = this.f376209c;
            C69464a aVar = this.f376210d;
            Objects.requireNonNull(aVar);
            return C47633f.m84733g(daVar.mo19399b(new C138294t(aVar))).mo51516i(new C138295u(this, str, buVar), this.f376209c).mo51515h(new C138296v(this), this.f376214h).mo51515h(new C138297w(this, buVar), C60826bg.f164896a).mo51514f(Exception.class, new C138298x(this, str), C60826bg.f164896a);
        }
        ((C59052c) ((C59052c) f376207a.mo56226d()).mo56372aa(41149)).mo56386p("Wrong scheme passed in for image.");
        return C60856cj.m92900i(C138261l.f376163e);
    }

    /* renamed from: b */
    public final void mo114229b(C138259j jVar) {
        this.f376209c.execute(C47810es.m84977q(new C138286l(this, jVar)));
    }

    /* renamed from: c */
    public final C60870cx mo114230c(C5686b bVar, String str, Optional optional) {
        if (this.f376212f.containsKey(str)) {
            return (C60870cx) this.f376212f.get(str);
        }
        C5602e eVar = new C5602e("onesearch-".concat(String.valueOf(str)));
        File a = bVar.mo12190a(eVar);
        if (a != null) {
            return C60856cj.m92900i(a);
        }
        if (str.startsWith("data:")) {
            bVar.mo12193d(eVar, new C138287m(Base64.decode(str.substring(str.indexOf(",") + 1), 0)));
            return C60856cj.m92900i((File) Objects.requireNonNull(bVar.mo12190a(eVar)));
        }
        bVar.mo12193d(eVar, C138291q.f376243a);
        return C47633f.m84733g(C60856cj.m92900i((File) Objects.requireNonNull(bVar.mo12190a(eVar)))).mo51516i(new C138292r(this, optional, str), this.f376214h).mo51515h(new C138293s(this, str, optional), this.f376214h);
    }
}
