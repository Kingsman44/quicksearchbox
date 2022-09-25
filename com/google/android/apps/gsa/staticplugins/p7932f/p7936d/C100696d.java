package com.google.android.apps.gsa.staticplugins.p7932f.p7936d;

import android.content.Intent;
import com.google.android.libraries.assistant.ampactions.C11032e;
import com.google.android.libraries.assistant.ampactions.C11033f;
import com.google.android.libraries.assistant.ampactions.C11039l;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.d.d */
/* compiled from: PG */
public final /* synthetic */ class C100696d implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100700h f281555a;

    public /* synthetic */ C100696d(C100700h hVar) {
        this.f281555a = hVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C100700h hVar = this.f281555a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C11039l lVar = hVar.f281559a;
            Intent intent = (Intent) axVar.mo56107c();
            lVar.f36262i.setOnClickListener(new C11032e(lVar, intent));
            lVar.f36264k.setOnClickListener(new C11033f(lVar, intent));
        }
    }
}
