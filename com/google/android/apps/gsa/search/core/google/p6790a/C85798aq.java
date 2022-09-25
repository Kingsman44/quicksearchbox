package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.assistant.p3897e.p3917i.p3918a.C51298cn;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C85798aq implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C91077d f231966a;

    /* renamed from: b */
    public final /* synthetic */ C51303cs f231967b;

    public /* synthetic */ C85798aq(C91077d dVar, C51303cs csVar) {
        this.f231966a = dVar;
        this.f231967b = csVar;
    }

    public final void accept(Object obj, Object obj2) {
        C91077d dVar = this.f231966a;
        C51303cs csVar = this.f231967b;
        C51298cn cnVar = (C51298cn) obj2;
        C59071e eVar = C85799ar.f231968a;
        if (dVar.f254356c.mo85346a((String) obj)) {
            csVar.mo53574a(cnVar);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
