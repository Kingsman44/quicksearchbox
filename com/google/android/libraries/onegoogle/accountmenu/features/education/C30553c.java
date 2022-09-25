package com.google.android.libraries.onegoogle.accountmenu.features.education;

import android.content.Context;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.EducationDatabase;
import com.google.common.base.C58881cr;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c */
/* compiled from: PG */
public final /* synthetic */ class C30553c implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f82526a;

    /* renamed from: b */
    public final /* synthetic */ ExecutorService f82527b;

    /* renamed from: c */
    public final /* synthetic */ EducationDatabase f82528c;

    public /* synthetic */ C30553c(Context context, ExecutorService executorService, EducationDatabase educationDatabase) {
        this.f82526a = context;
        this.f82527b = executorService;
        this.f82528c = educationDatabase;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Context context = this.f82526a;
        ExecutorService executorService = this.f82527b;
        EducationDatabase educationDatabase = this.f82528c;
        C30549b bVar = new C30549b(context, executorService);
        bVar.f82521d = educationDatabase;
        return bVar;
    }
}
