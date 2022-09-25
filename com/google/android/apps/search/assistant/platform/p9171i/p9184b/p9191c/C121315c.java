package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9191c;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.c.c */
/* compiled from: PG */
public final /* synthetic */ class C121315c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C121324l f336904a;

    public /* synthetic */ C121315c(C121324l lVar) {
        this.f336904a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        int i = 0;
        try {
            ApplicationInfo applicationInfo = this.f336904a.f336914b.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                i = applicationInfo.icon;
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) C121324l.f336913a.mo56226d()).mo56382g(e)).mo56372aa(35768)).mo56389s("Invalid package name: %s", str);
        }
        return Integer.valueOf(i);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
