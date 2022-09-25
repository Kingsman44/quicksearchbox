package com.google.android.libraries.assistant.soda.p1606e.p1607a;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.p4526f.C59052c;
import java.io.File;
import java.io.IOException;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.soda.e.a.e */
/* compiled from: PG */
public final /* synthetic */ class C19291e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C19299m f54014a;

    public /* synthetic */ C19291e(C19299m mVar) {
        this.f54014a = mVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        try {
            return Optional.m71637of(((File) this.f54014a.f54024d.mo45889c((Uri) obj, new C42788l())).getAbsolutePath());
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C19299m.f54021a.mo56226d()).mo56382g(e)).mo56372aa(47721)).mo56386p("Failed to get hotmatch model absolute path");
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
