package com.google.android.libraries.web.webview.p3480e;

import androidx.p201w.C4366j;
import androidx.p201w.C4367k;
import com.google.android.libraries.web.localassets.AccountStorageWebDirectory;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C71802l;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.webview.e.c */
/* compiled from: PG */
final class C44404c extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C44407f f115435a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44404c(C44407f fVar) {
        super(0);
        this.f115435a = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C44407f fVar = this.f115435a;
        if (!fVar.f115445d) {
            return null;
        }
        try {
            List<C44402a> list = (List) C71802l.m105039a(new C44405d(fVar, (C69577g) null));
            ArrayList arrayList = new ArrayList();
            for (C44402a aVar : list) {
                AccountStorageWebDirectory accountStorageWebDirectory = aVar.f115427a;
                File file = aVar.f115428b;
                String str = accountStorageWebDirectory.f114365a;
                C4366j.m12516a("/".concat(String.valueOf(str)), new C4367k(fVar.f115444c, file), arrayList);
            }
            return C4366j.m12517b(arrayList);
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) C44407f.f115442a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(54213));
            cVar.mo56386p("Failed to retrieve local asset files.");
            return null;
        }
    }
}
