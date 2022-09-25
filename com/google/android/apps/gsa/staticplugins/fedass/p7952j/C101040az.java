package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.az */
/* compiled from: PG */
public final /* synthetic */ class C101040az implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f282164a;

    /* renamed from: b */
    public final /* synthetic */ List f282165b;

    public /* synthetic */ C101040az(String str, List list) {
        this.f282164a = str;
        this.f282165b = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f282164a;
        List list = this.f282165b;
        C59071e eVar = C101050bi.f282183a;
        C132769a aVar = (C132769a) ((C132798f) obj).toBuilder();
        aVar.copyOnWrite();
        C132798f fVar = (C132798f) aVar.instance;
        str.getClass();
        fVar.f362317a |= 8;
        fVar.f362321e = str;
        aVar.copyOnWrite();
        ((C132798f) aVar.instance).f362322f = C62942bv.emptyProtobufList();
        aVar.mo110905a(list);
        return (C132798f) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
