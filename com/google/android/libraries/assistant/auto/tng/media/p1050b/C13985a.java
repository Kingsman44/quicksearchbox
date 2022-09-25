package com.google.android.libraries.assistant.auto.tng.media.p1050b;

import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14046h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1367b.C16939a;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.b.a */
/* compiled from: PG */
final class C13985a implements C16939a {
    /* renamed from: a */
    public final Optional mo21377a(String str) {
        Optional a = C14046h.m30338a(str);
        if (a.isEmpty()) {
            ((C59052c) ((C59052c) C13986b.f42577a.mo56226d()).mo56372aa(45310)).mo56386p("The news Url does not exist");
        } else {
            ((C59052c) ((C59052c) C13986b.f42577a.mo56224b()).mo56372aa(45309)).mo56389s("The news Url is %s.", a.get());
        }
        return a;
    }

    /* renamed from: b */
    public final /* synthetic */ Optional mo21378b() {
        return Optional.empty();
    }
}
