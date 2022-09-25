package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a;
import com.google.assistant.p3897e.p3917i.p3918a.C51298cn;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C16483aq implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Context f48418a;

    /* renamed from: b */
    public final /* synthetic */ C51303cs f48419b;

    public /* synthetic */ C16483aq(Context context, C51303cs csVar) {
        this.f48418a = context;
        this.f48419b = csVar;
    }

    public final void accept(Object obj, Object obj2) {
        Context context = this.f48418a;
        C51303cs csVar = this.f48419b;
        C51298cn cnVar = (C51298cn) obj2;
        if (C13315a.m29571a((String) obj, context)) {
            csVar.mo53574a(cnVar);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
