package com.google.android.libraries.assistant.p1467d;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.assistant.p1467d.p1468a.p1469a.p1470a.C17812a;
import com.google.android.libraries.assistant.p1467d.p1468a.p1469a.p1470a.C17813b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17918t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.assistant.d.l */
/* compiled from: PG */
public final class C17934l implements C17812a {

    /* renamed from: a */
    public static final Uri f51367a = new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.GsaPublicContentProvider").appendPath("morris_provider").appendPath("com.google.android.googlequicksearchbox.MorrisProvider").build();

    /* renamed from: b */
    static final C17918t[] f51368b = {C17918t.SUPPORT_ON_VOICE_PLATE_STATE_CHANGED, C17918t.SUPPORT_UNBIND_INTEGRATION_SERVICE};

    /* renamed from: c */
    public final Context f51369c;

    /* renamed from: d */
    protected final C17813b f51370d;

    /* renamed from: e */
    public final List f51371e = new ArrayList();

    /* renamed from: f */
    C17873ac f51372f;

    /* renamed from: g */
    protected final C17928f f51373g;

    /* renamed from: h */
    private final C60887da f51374h;

    /* renamed from: i */
    private final List f51375i;

    public C17934l(Context context) {
        C143701ac a = C143701ac.m233450a(context);
        this.f51369c = context;
        new C17933k(this, Looper.getMainLooper());
        this.f51375i = new ArrayList();
        this.f51374h = C60895di.m92995a(Executors.newSingleThreadExecutor());
        C17813b bVar = new C17813b();
        this.f51370d = bVar;
        bVar.f51112a = this;
        this.f51373g = new C17928f(context, bVar, false, new C17931i(this, context, a));
    }

    /* renamed from: c */
    public static void m35122c(C60870cx cxVar, String str) {
        C17932j jVar = new C17932j(str);
        C60856cj.m92911t(cxVar, C47810es.m84974n(jVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo23490a() {
        Log.v("AssistantIntegClient", "#getMorrisEligibilityStatusAsync");
        return this.f51374h.mo19399b(new C17929g(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo23491b(C17914p pVar) {
        Log.v("AssistantIntegClient", "#sendData()");
        List list = this.f51375i;
        pVar.copyOnWrite();
        C17881ak akVar = (C17881ak) pVar.instance;
        C17881ak akVar2 = C17881ak.f51231h;
        C62971cq cqVar = akVar.f51237e;
        if (!cqVar.mo58948c()) {
            akVar.f51237e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) akVar.f51237e);
        C60870cx g = C60922j.m93044g(this.f51373g.f51359b, new C17836c((C17881ak) pVar.build()), C60826bg.f164896a);
        C60856cj.m92911t(g, new C17927e(), C60826bg.f164896a);
        this.f51375i.clear();
        return g;
    }
}
