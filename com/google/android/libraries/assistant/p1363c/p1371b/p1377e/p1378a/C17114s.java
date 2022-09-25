package com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a;

import com.google.android.apps.gsa.languagepack.p5871e.C74619b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.c.b.e.a.s */
/* compiled from: PG */
public final /* synthetic */ class C17114s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f49792a;

    public /* synthetic */ C17114s(String str) {
        this.f49792a = str;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f49792a;
        C58974d dVar = C17119x.f49800a;
        int a = C74619b.m120643a(((C17096a) obj).f49762a.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0) {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56225c()).mo56372aa(42615)).mo56389s("Scheduled LP download for %s: ENQUEUE_STATUS_FAIL", str);
        } else if (i == 1) {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56224b()).mo56372aa(42613)).mo56389s("Scheduled LP download for %s: ENQUEUE_STATUS_ALREADY_DOWNLOADING", str);
        } else if (i == 2) {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56224b()).mo56372aa(42612)).mo56389s("Scheduled LP download for %s: ENQUEUE_STATUS_SUCCESS", str);
        } else if (i != 3) {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56226d()).mo56372aa(42616)).mo56389s("Scheduled LP download for %s: ENQUEUE_STATUS_ALREADY_INSTALLED", str);
        } else {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56226d()).mo56372aa(42614)).mo56389s("Scheduled LP download for %s: ENQUEUE_STATUS_NOT_DOWNLOADABLE", str);
        }
        return C60866ct.f164955a;
    }
}
