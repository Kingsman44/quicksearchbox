package com.google.android.libraries.mdi.download.p2243e;

import androidx.core.app.C1800aq;
import androidx.core.app.C1839z;
import com.google.android.libraries.mdi.download.foreground.C29421a;
import com.google.android.libraries.mdi.download.foreground.C29422b;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.mdi.download.e.l */
/* compiled from: PG */
public final /* synthetic */ class C29362l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29348ab f79589a;

    /* renamed from: b */
    public final /* synthetic */ C29359i f79590b;

    /* renamed from: c */
    public final /* synthetic */ C29422b f79591c;

    public /* synthetic */ C29362l(C29348ab abVar, C29359i iVar, C29422b bVar) {
        this.f79589a = abVar;
        this.f79590b = iVar;
        this.f79591c = bVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C29348ab abVar = this.f79589a;
        C29359i iVar = this.f79590b;
        C29422b bVar = this.f79591c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return (C60870cx) axVar.mo56107c();
        }
        C29423c.m54386i(abVar.f79553a);
        if (iVar.mo34672d().mo34384b()) {
            str = C29423c.m54382e(abVar.f79553a);
        } else {
            str = C29423c.m54381d(abVar.f79553a);
        }
        String str2 = str;
        C1800aq aqVar = new C1800aq(abVar.f79553a);
        C1839z b = C29423c.m54379b(abVar.f79553a, iVar.mo34669a(), iVar.mo34677h(), (String) iVar.mo34675f().mo56109e(iVar.mo34679i()));
        C29422b d = C29422b.m54375d(iVar.mo34671c());
        C29421a aVar = (C29421a) d;
        int hashCode = aVar.f79765a.hashCode();
        C29423c.m54385h(abVar.f79553a, (Class) abVar.f79554b.mo56107c(), aVar.f79765a, b, hashCode);
        aqVar.mo5003b((String) null, hashCode, b.mo5013a());
        C29376z zVar = new C29376z(abVar, d, b, iVar, aqVar, hashCode, str2);
        ((C29349ac) abVar.f79556d.mo56107c()).mo34667c(iVar.mo34671c(), zVar);
        C60871cy cyVar = new C60871cy((Callable) C29363m.f79592a);
        C29364n nVar = new C29364n(abVar, iVar);
        C60870cx h = C60922j.m93045h(cyVar, C47810es.m84966f(nVar), abVar.f79555c);
        C29369s sVar = new C29369s(abVar, zVar);
        C60856cj.m92911t(h, C47810es.m84974n(sVar), C60826bg.f164896a);
        C60870cx b2 = abVar.f79559g.mo34565b(((C29421a) bVar).f79765a, h);
        C29365o oVar = new C29365o(cyVar, h);
        return C60922j.m93045h(b2, C47810es.m84966f(oVar), abVar.f79555c);
    }
}
