package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124526g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.iz */
/* compiled from: PG */
public final class C96311iz extends C83869ac {

    /* renamed from: a */
    private final Context f269511a;

    /* renamed from: b */
    private final String f269512b;

    /* renamed from: c */
    private final C68214a f269513c;

    public C96311iz(Context context, String str, C68214a aVar) {
        this.f269511a = context;
        str.getClass();
        this.f269512b = str;
        this.f269513c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133537b(new C96310iy());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C124548d b = ((C89492cd) this.f269513c.mo27525b()).mo83401b(this.f269512b);
        return (b == null || C124526g.m203993a(b)) && !C36619a.m65148d(this.f269511a);
    }
}
