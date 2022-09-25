package com.google.android.apps.search.sceneviewer.modelviewer;

import android.content.Context;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ImpModelView;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.WebModelView;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ao */
/* compiled from: PG */
public final /* synthetic */ class C141588ao implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ImpModelView f384361a;

    /* renamed from: b */
    public final /* synthetic */ Context f384362b;

    public /* synthetic */ C141588ao(ImpModelView impModelView, Context context) {
        this.f384361a = impModelView;
        this.f384362b = context;
    }

    public final C60870cx apply(Object obj) {
        ImpModelView impModelView = this.f384361a;
        Context context = this.f384362b;
        List list = (List) obj;
        if (impModelView.isSuccessfullyInitialized()) {
            return C60856cj.m92900i(impModelView);
        }
        return C60856cj.m92900i(new WebModelView(context));
    }
}
