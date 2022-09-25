package com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a;

import android.content.Context;
import com.google.android.libraries.search.integrations.p3018c.C38502a;
import com.google.frameworks.client.p4624a.p4625a.C61302c;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.frameworks.client.a.a.a.a.d */
/* compiled from: PG */
final class C61289d implements C69464a {

    /* renamed from: a */
    final /* synthetic */ Context f165768a;

    /* renamed from: b */
    final /* synthetic */ int f165769b;

    /* renamed from: c */
    final /* synthetic */ String f165770c;

    /* renamed from: d */
    final /* synthetic */ C69464a f165771d;

    /* renamed from: e */
    private C61302c f165772e = null;

    public C61289d(Context context, int i, String str, C69464a aVar) {
        this.f165768a = context;
        this.f165769b = i;
        this.f165770c = str;
        this.f165771d = aVar;
    }

    /* renamed from: a */
    public final C61302c mo17428b() {
        if (this.f165772e == null) {
            String packageName = this.f165768a.getPackageName();
            int i = this.f165769b;
            String str = this.f165770c;
            C38502a aVar = (C38502a) this.f165771d.mo17428b();
            this.f165772e = new C61302c(packageName, i, str);
        }
        return this.f165772e;
    }
}
