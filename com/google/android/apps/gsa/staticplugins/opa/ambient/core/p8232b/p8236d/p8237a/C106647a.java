package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8236d.p8237a;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107065e;
import com.google.assistant.p3886c.C50841m;
import com.google.assistant.p3886c.C50842n;
import com.google.common.util.C60789b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C106647a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f297303a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297304b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f297305c;

    public /* synthetic */ C106647a(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f297303a = cxVar;
        this.f297304b = cxVar2;
        this.f297305c = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f297303a;
        C60870cx cxVar2 = this.f297304b;
        C60870cx cxVar3 = this.f297305c;
        try {
            C50841m mVar = (C50841m) C50842n.f132378f.createBuilder();
            Objects.requireNonNull(mVar);
            ((Optional) C60856cj.m92909r(cxVar)).ifPresent(new C106648b(mVar));
            ((Optional) C60856cj.m92909r(cxVar2)).ifPresent(new C106649c(mVar));
            Objects.requireNonNull(mVar);
            ((Optional) C60856cj.m92909r(cxVar3)).ifPresent(new C106650d(mVar));
            byte[] byteArray = ((C50842n) mVar.build()).toByteArray();
            return C60856cj.m92900i(new String(Base64.encode(C107065e.m177786a(C60789b.m92791a(byteArray, byteArray.length)), 2), "US-ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            return C60856cj.m92900i((String) Optional.ofNullable(e2.getMessage()).orElse(BuildConfig.FLAVOR));
        }
    }
}
