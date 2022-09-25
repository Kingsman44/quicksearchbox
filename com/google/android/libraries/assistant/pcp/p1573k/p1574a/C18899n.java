package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.pm.PackageItemInfo;
import com.google.common.p4522b.C58480gp;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.n */
/* compiled from: PG */
public final /* synthetic */ class C18899n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f53183a;

    public /* synthetic */ C18899n(C58480gp gpVar) {
        this.f53183a = gpVar;
    }

    public final void accept(Object obj) {
        C58480gp gpVar = this.f53183a;
        for (PackageItemInfo packageItemInfo : (Collection) ((Map.Entry) obj).getValue()) {
            if (packageItemInfo != null) {
                gpVar.mo55395g(packageItemInfo);
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
