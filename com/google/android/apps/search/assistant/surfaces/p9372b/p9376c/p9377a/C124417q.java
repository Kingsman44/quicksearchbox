package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51305cu;
import com.google.assistant.p3897e.p3917i.p3918a.C51329dr;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.q */
/* compiled from: PG */
public final /* synthetic */ class C124417q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124419s f343377a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f343378b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f343379c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f343380d;

    public /* synthetic */ C124417q(C124419s sVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f343377a = sVar;
        this.f343378b = cxVar;
        this.f343379c = cxVar2;
        this.f343380d = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        String str = BuildConfig.FLAVOR;
        C124419s sVar = this.f343377a;
        C60870cx cxVar2 = this.f343378b;
        C60870cx cxVar3 = this.f343379c;
        C60870cx cxVar4 = this.f343380d;
        ((C59052c) ((C59052c) C124419s.f343384a.mo56224b()).mo56372aa(37035)).mo56386p("Finished fetching device properties");
        try {
            String str2 = (String) C60856cj.m92909r(cxVar2);
            str2.getClass();
            str = str2;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C124419s.f343384a.mo56226d()).mo56382g(e)).mo56372aa(37036)).mo56386p("Invalid account when deriving DeviceProperties.");
        } catch (NullPointerException e2) {
            ((C59052c) ((C59052c) ((C59052c) C124419s.f343384a.mo56226d()).mo56382g(e2)).mo56372aa(37037)).mo56386p("Non-google account when deriving DeviceProperties.");
        }
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        if (str.isEmpty()) {
            cxVar = C60856cj.m92900i(C51333dv.UNKNOWN_USER_CREDENTIAL_STATUS);
        } else {
            C60870cx a = sVar.f343388d.mo103966a(str);
            C60870cx a2 = sVar.f343389e.mo103965a(str);
            cxVar = C47638k.m84753d(a, a2).mo51520a(new C124418r(booleanValue, a, a2), sVar.f343387c);
        }
        C51303cs csVar = (C51303cs) ((C51334dw) C60856cj.m92909r(cxVar4)).toBuilder();
        C51305cu cuVar = C51305cu.VOICE_MODALITY;
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        dwVar.f133701o = cuVar.f133565f;
        dwVar.f133685a |= 16384;
        C51329dr drVar = C51329dr.UNKNOWN_STATUS;
        csVar.copyOnWrite();
        C51334dw dwVar2 = (C51334dw) csVar.instance;
        dwVar2.f133667H = drVar.f133640d;
        dwVar2.f133688b |= 8192;
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C124416p((C51334dw) csVar.build())), sVar.f343387c);
    }
}
