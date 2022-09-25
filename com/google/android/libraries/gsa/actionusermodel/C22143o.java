package com.google.android.libraries.gsa.actionusermodel;

import android.net.Uri;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62971cq;
import java.io.File;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.o */
/* compiled from: PG */
public final /* synthetic */ class C22143o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61064a;

    public /* synthetic */ C22143o(C22153y yVar) {
        this.f61064a = yVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C22153y yVar = this.f61064a;
        C29690f fVar = ((C17046am) obj).f49658b;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        C62971cq cqVar = fVar.f80416g;
        if (cqVar.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        String str = ((C28595b) cqVar.get(0)).f77799c;
        if (str.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C42813k kVar = yVar.f61123f;
        Uri parse = Uri.parse(str);
        C42788l lVar = new C42788l();
        lVar.f112052a = true;
        String absolutePath = ((File) kVar.mo45889c(parse, lVar)).getAbsolutePath();
        absolutePath.isEmpty();
        return C60856cj.m92900i(Optional.m71637of(absolutePath));
    }
}
