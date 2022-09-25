package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.os.Bundle;
import com.google.android.apps.search.googleapp.discover.p10190h.C134349c;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134703a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58887cx;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.aj */
/* compiled from: PG */
final class C134816aj implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C134904m f367059a;

    public C134816aj(C134904m mVar) {
        this.f367059a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C134703a aVar = (C134703a) bVar;
        C134904m mVar = this.f367059a;
        C69664n.m101061g(aVar, "event");
        AccountId accountId = mVar.f367320m;
        Throwable th = aVar.f366820a;
        C69664n.m101061g(accountId, "accountId");
        C134349c cVar = new C134349c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        if (cVar.getArguments() == null) {
            cVar.setArguments(new Bundle(1));
        }
        Bundle arguments = cVar.getArguments();
        if (arguments != null) {
            arguments.putString("stack_trace", C58887cx.m90975b(th));
        }
        cVar.showNow(mVar.f367327t.getChildFragmentManager(), "debug");
        return C47392e.f123115a;
    }
}
