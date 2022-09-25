package com.google.android.libraries.logging.p2182b;

import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.C60934v;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.b.g */
/* compiled from: PG */
public final /* synthetic */ class C28276g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C28278i f76952a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f76953b;

    /* renamed from: c */
    public final /* synthetic */ C28281l f76954c;

    public /* synthetic */ C28276g(C28278i iVar, SettableFuture settableFuture, C28281l lVar) {
        this.f76952a = iVar;
        this.f76953b = settableFuture;
        this.f76954c = lVar;
    }

    public final C60870cx apply(Object obj) {
        C28278i iVar = this.f76952a;
        SettableFuture settableFuture = this.f76953b;
        C28281l lVar = this.f76954c;
        List<C28282m> list = (List) obj;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size + size + 1);
        arrayList.add(settableFuture);
        for (C28282m mVar : list) {
            try {
                List<C28279j> b = iVar.mo33776b(mVar.f76963a.getClass());
                List<C28279j> b2 = iVar.mo33776b(C28280k.class);
                ArrayList arrayList2 = new ArrayList(b.size() + b2.size());
                for (C28279j a : b) {
                    arrayList2.add(C28278i.m52864a(mVar, a));
                }
                for (C28279j a2 : b2) {
                    arrayList2.add(C28278i.m52864a(mVar, a2));
                }
                arrayList.add(C60922j.m93044g(C60856cj.m92896e(arrayList2), new C58819aj((Object) null), C60826bg.f164896a));
                arrayList.add(mVar.f76964b);
            } catch (Throwable th) {
                arrayList.add(C60856cj.m92899h(th));
            }
        }
        return C60856cj.m92892a(arrayList).mo57335b(new C28274e(lVar, settableFuture, C60856cj.m92894c(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a)), iVar.f76955a);
    }
}
