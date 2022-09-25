package com.google.android.libraries.search.silk.p3162a.p3167e;

import android.app.Activity;
import com.google.android.libraries.silk.p3205a.p3218g.C41721a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.silk.a.e.a */
/* compiled from: PG */
public final class C40567a implements C41721a {

    /* renamed from: a */
    private final Activity f106469a;

    public C40567a(C58833ax axVar) {
        C58838bb.m90884s(axVar.mo56113h(), "SilkCloseApi cannot be used in FragmentHost and should not be used if the client is not hosted in an activity");
        this.f106469a = (Activity) axVar.mo56107c();
    }

    /* renamed from: a */
    public final C60870cx mo42520a() {
        this.f106469a.finish();
        return C60866ct.f164955a;
    }
}
