package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107074n;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107075o;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107076p;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58890d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bl */
/* compiled from: PG */
public final /* synthetic */ class C106904bl implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297807a;

    public /* synthetic */ C106904bl(C106918bz bzVar) {
        this.f297807a = bzVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C107076p pVar = this.f297807a.f297831f;
        Uri parse = Uri.parse((String) obj);
        if (parse == null) {
            ((C58970a) ((C58970a) pVar.f298127a.mo56225c()).mo56372aa(23475)).mo56389s("#loadByteString: Invalid uri: %s", (Object) null);
            return C47633f.m84733g(C60856cj.m92900i(C63088z.f170246b));
        }
        String scheme = parse.getScheme();
        if (scheme == null) {
            ((C58970a) ((C58970a) pVar.f298127a.mo56225c()).mo56372aa(23474)).mo56389s("#loadByteString: Invalid uri scheme: %s", parse);
            return C47633f.m84733g(C60856cj.m92900i(C63088z.f170246b));
        } else if (C90772bp.m148278E(parse)) {
            ((C58970a) ((C58970a) pVar.f298127a.mo56224b()).mo56372aa(23476)).mo56389s("#loadImageFromContentUri: %s", parse);
            return C47633f.m84733g(((C91189au) pVar.f298128b.mo27525b()).mo85418e(parse, 7)).mo51515h(new C107074n(pVar), pVar.f298129c).mo51513e(Exception.class, new C107075o(pVar, parse), pVar.f298129c);
        } else if (C58890d.m90990e(scheme, "https") || C58890d.m90990e(scheme, "http")) {
            return pVar.mo95773a(parse);
        } else {
            ((C58970a) ((C58970a) pVar.f298127a.mo56225c()).mo56372aa(23473)).mo56389s("#loadByteString: Unsupported uri scheme: %s", parse);
            return C47633f.m84733g(C60856cj.m92900i(C63088z.f170246b));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
