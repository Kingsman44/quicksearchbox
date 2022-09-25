package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.content.pm.PackageManager;
import com.google.android.libraries.assistant.auto.tng.common.p933q.p934a.C13317a;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51690ar;
import com.google.assistant.p3897e.p3921j.C51691as;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C16552r implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f48551a;

    /* renamed from: b */
    public final /* synthetic */ List f48552b;

    /* renamed from: c */
    public final /* synthetic */ C13317a f48553c;

    /* renamed from: d */
    public final /* synthetic */ PackageManager f48554d;

    public /* synthetic */ C16552r(C58485gu guVar, List list, C13317a aVar, PackageManager packageManager) {
        this.f48551a = guVar;
        this.f48552b = list;
        this.f48553c = aVar;
        this.f48554d = packageManager;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51098gh a;
        C58485gu guVar = this.f48551a;
        List list = this.f48552b;
        C13317a aVar = this.f48553c;
        PackageManager packageManager = this.f48554d;
        String str = (String) obj;
        int i = C16554t.f48556a;
        if (guVar.contains(str) || list.contains(str) || (a = aVar.mo21022a(str, packageManager)) == null) {
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
