package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.content.pm.PackageManager;
import com.google.android.libraries.assistant.auto.tng.common.p933q.p934a.C13317a;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51690ar;
import com.google.assistant.p3897e.p3921j.C51691as;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C16546l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C13317a f48538a;

    /* renamed from: b */
    public final /* synthetic */ PackageManager f48539b;

    public /* synthetic */ C16546l(C13317a aVar, PackageManager packageManager) {
        this.f48538a = aVar;
        this.f48539b = packageManager;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C13317a aVar = this.f48538a;
        PackageManager packageManager = this.f48539b;
        int i = C16554t.f48556a;
        C51098gh a = aVar.mo21022a((String) obj, packageManager);
        if (a == null) {
            return null;
        }
        C51690ar arVar = (C51690ar) C51691as.f135610d.createBuilder();
        arVar.copyOnWrite();
        C51691as asVar = (C51691as) arVar.instance;
        asVar.f135613b = a;
        asVar.f135612a |= 1;
        return (C51691as) arVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
