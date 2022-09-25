package com.google.android.apps.gsa.staticplugins.accountswitch;

import android.accounts.AccountsException;
import com.google.android.apps.gsa.search.core.google.gaia.C86055p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.accountswitch.g */
/* compiled from: PG */
public final class C93245g {

    /* renamed from: a */
    public static final C59071e f260013a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accountswitch.g");

    /* renamed from: b */
    public Consumer f260014b;

    /* renamed from: c */
    private final C68214a f260015c;

    public C93245g(C68214a aVar) {
        this.f260015c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87578a(String str, Consumer consumer) {
        C60870cx cxVar;
        this.f260014b = consumer;
        if (str != null) {
            try {
                ((C86055p) this.f260015c.mo27525b()).mo79680n();
                cxVar = ((C86055p) this.f260015c.mo27525b()).mo79688v(str);
            } catch (AccountsException e) {
                ((C59052c) ((C59052c) ((C59052c) f260013a.mo56225c()).mo56382g(e)).mo56372aa(13477)).mo56386p("Failed to select account");
                consumer.accept(false);
                return;
            }
        } else {
            cxVar = ((C86055p) this.f260015c.mo27525b()).mo79687u();
        }
        C93244f fVar = new C93244f(this);
        C60856cj.m92911t(cxVar, C47810es.m84974n(fVar), C60826bg.f164896a);
    }
}
