package com.google.android.apps.search.fedora.p10106i;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.fedora.p10099e.C132779aj;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.i.p */
/* compiled from: PG */
public final /* synthetic */ class C132942p implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C132948v f362621a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f362622b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f362623c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f362624d;

    public /* synthetic */ C132942p(C132948v vVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f362621a = vVar;
        this.f362622b = cxVar;
        this.f362623c = cxVar2;
        this.f362624d = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C132948v vVar = this.f362621a;
        C60870cx cxVar = this.f362622b;
        C60870cx cxVar2 = this.f362623c;
        C60870cx cxVar3 = this.f362624d;
        String str = (String) ((Optional) C60856cj.m92909r(cxVar)).orElse(BuildConfig.FLAVOR);
        List list = (List) C60856cj.m92909r(cxVar2);
        C132779aj ajVar = (C132779aj) C60856cj.m92909r(cxVar3);
        if (TextUtils.equals(ajVar.f362248c, str)) {
            C62971cq<String> cqVar = ajVar.f362249d;
            if (cqVar.size() == list.size()) {
                for (String contains : cqVar) {
                    if (!list.contains(contains)) {
                    }
                }
                return C60866ct.f164955a;
            }
        }
        C59104x b = C132948v.f362631a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PolicyConfigSync");
        ((C59052c) ((C59052c) b).mo56372aa(39945)).mo56386p("Policy config changed for account. Refreshing.");
        return C47633f.m84733g(vVar.f362633c.mo110921i(new C132945s(str, list)));
    }
}
