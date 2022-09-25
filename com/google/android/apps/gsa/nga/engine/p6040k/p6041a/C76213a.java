package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.FileNotFoundException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.a */
/* compiled from: PG */
public final /* synthetic */ class C76213a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76225m f211222a;

    public /* synthetic */ C76213a(C76225m mVar) {
        this.f211222a = mVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76225m mVar = this.f211222a;
        C29690f fVar = (C29690f) obj;
        C58495hd a = cu.a(fVar);
        int i = fVar.f80414e;
        Uri uri = (Uri) a.get("queries_deep_links.ldbp");
        if (uri == null) {
            return C60856cj.m92899h(new FileNotFoundException("query_deep_links resource not found in fileUris map"));
        }
        C60870cx e = mVar.f211235b.mo72194e(uri, i);
        C90875ai.m148465b(C76223k.f211232a, e, mVar.f211237d, "[NGA] DeepLinkExecutionHelper.processFiles").mo85223a(C76224l.f211233a);
        return mVar.f211237d.mo28205e(e, "[NGA] DeepLinkExecutionHelper.processFiles.catching", Exception.class, C76214b.f211223a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
