package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.o */
/* compiled from: PG */
public final /* synthetic */ class C93043o implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C93043o f259545a = new C93043o();

    private /* synthetic */ C93043o() {
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = ChatPerformer.f259389a;
        if (!axVar.mo56113h()) {
            return C60856cj.m92899h(new Exception("Failed to get photos from downloader."));
        }
        return C60856cj.m92900i((C58485gu) Collection.EL.stream((ArrayList) axVar.mo56107c()).collect(C58370cn.f155946a));
    }
}
