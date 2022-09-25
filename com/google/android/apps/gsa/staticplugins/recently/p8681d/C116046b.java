package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import android.content.Context;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.b */
/* compiled from: PG */
public final class C116046b {

    /* renamed from: a */
    public static final C59071e f321792a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.d.b");

    /* renamed from: b */
    private final Context f321793b;

    /* renamed from: c */
    private final C22871g f321794c;

    public C116046b(Context context, C22871g gVar) {
        this.f321793b = context;
        this.f321794c = gVar;
    }

    /* renamed from: a */
    public final C58833ax mo102428a(String str) {
        File b = mo102429b();
        if (b.exists() && !b.isDirectory() && !b.delete()) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        } else if (b.exists() || b.mkdir()) {
            File file = new File(b, Integer.toHexString(str.hashCode()));
            C58976aa aaVar2 = C58975e.f156826a;
            file.getAbsolutePath();
            return C58833ax.m90834k(file);
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final File mo102429b() {
        return new File(this.f321793b.getFilesDir(), "recently");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo102430c(C22831b bVar, String str) {
        this.f321794c.mo28212l("RecentlyDataStorage:saveBytes", new C116044a(this, bVar, str));
    }
}
