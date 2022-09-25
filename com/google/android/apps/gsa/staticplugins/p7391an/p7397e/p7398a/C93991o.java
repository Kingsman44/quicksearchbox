package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.o */
/* compiled from: PG */
public final /* synthetic */ class C93991o implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C94001y f262514a;

    public /* synthetic */ C93991o(C94001y yVar) {
        this.f262514a = yVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C94001y yVar = this.f262514a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            axVar.mo56107c();
            DoodleData doodleData = (DoodleData) axVar.mo56107c();
            if (!TextUtils.isEmpty(yVar.mo88268e(doodleData))) {
                yVar.f262529e.mo28211k(yVar.f262528d.mo85418e(Uri.parse(yVar.mo88268e(doodleData)), 19), "Load doodle image", new C93999w(yVar, doodleData));
                return;
            }
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        yVar.mo88271h();
    }
}
