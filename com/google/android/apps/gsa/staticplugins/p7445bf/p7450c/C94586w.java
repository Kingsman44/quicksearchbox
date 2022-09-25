package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.w */
/* compiled from: PG */
public final class C94586w extends C84036z {

    /* renamed from: a */
    public static final C59071e f264559a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bf.c.w");

    /* renamed from: b */
    public final Bundle f264560b;

    /* renamed from: c */
    public final C68214a f264561c;

    /* renamed from: d */
    public final Random f264562d;

    /* renamed from: e */
    private final C86124t f264563e;

    /* renamed from: f */
    private final C84026u f264564f;

    public C94586w(Bundle bundle, C86124t tVar, C68214a aVar, C84026u uVar, Random random) {
        this.f264560b = bundle;
        this.f264563e = tVar;
        this.f264561c = aVar;
        this.f264564f = uVar;
        this.f264562d = random;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f264563e.mo79746e(C90014bt.f247350fW)) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89847o(this.f264564f.mo77487a((C60870cx) this.f264561c.mo27525b(), C94584u.f264557a), new C94585v(this));
    }
}
