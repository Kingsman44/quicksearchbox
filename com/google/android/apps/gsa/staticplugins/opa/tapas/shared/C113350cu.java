package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cu */
/* compiled from: PG */
public final /* synthetic */ class C113350cu implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113367dh f313874a;

    /* renamed from: b */
    public final /* synthetic */ Context f313875b;

    public /* synthetic */ C113350cu(C113367dh dhVar, Context context) {
        this.f313874a = dhVar;
        this.f313875b = context;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C113367dh dhVar = this.f313874a;
        Context context = this.f313875b;
        C113365df dfVar = (C113365df) obj;
        C113286bk a = dfVar.mo99996a();
        int b = a.mo99930b();
        int i = b - 1;
        if (b != 0) {
            if (i == 0) {
                String e = a.mo99942e();
                if (TextUtils.isEmpty(e)) {
                    cxVar = C60856cj.m92899h(new IllegalArgumentException("Uri string empty"));
                } else {
                    Drawable drawable = (Drawable) dhVar.f313910d.f314084a.get(e);
                    if (drawable != null) {
                        cxVar = C60856cj.m92900i(drawable);
                    } else {
                        Uri parse = Uri.parse(e);
                        if ("android.resource".equals(parse.getScheme())) {
                            cxVar = C113367dh.m187563b(parse, context);
                        } else {
                            cxVar = C60922j.m93044g(dhVar.f313909c.mo85418e(parse, 7), new C113354cy(dhVar, e), C60826bg.f164896a);
                        }
                    }
                }
            } else if (i == 1) {
                cxVar = C60856cj.m92900i(a.mo99934c());
            } else if (i == 2) {
                cxVar = C113367dh.m187562a(a.mo99938d(), context);
            } else if (i == 3) {
                String a2 = a.mo99929a();
                cxVar = C60922j.m93044g(dhVar.f313911e.mo99924a(a2), new C113353cx(a2), C60826bg.f164896a);
            } else if (i == 4) {
                C113251ad adVar = dhVar.f313911e;
                C113424fe f = a.mo99947f();
                LauncherActivityInfoCompat b2 = f.mo100072b();
                cxVar = adVar.mo99928e(adVar.f313610c, b2.getComponentName().getPackageName(), new C113511w(adVar, b2, f.mo100071a()));
            } else {
                throw new AssertionError("Icon source kind not handled");
            }
            C60870cx e2 = C90877ak.m148471e(C60922j.m93044g(cxVar, new C113345cp(dfVar), C60826bg.f164896a), dhVar.f313914h.mo79743a(C90063do.f249540fU), TimeUnit.MILLISECONDS, dhVar.f313913g);
            String obj2 = dfVar.mo99996a().toString();
            C90873ag b3 = C90875ai.m148465b(C113360da.f313903a, e2, dhVar.f313912f, "Log fetch fails");
            b3.mo85224b(C113366dg.class, new C113361db(obj2));
            b3.mo85224b(Resources.NotFoundException.class, new C113346cq());
            b3.mo85224b(CancellationException.class, C113347cr.f313871a);
            b3.mo85223a(new C113348cs(obj2));
            return e2;
        }
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
