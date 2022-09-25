package com.google.android.apps.gsa.staticplugins.p7765da.p7767b;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4486ci.p4487a.C58098c;
import com.google.p4486ci.p4487a.C58119x;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.b.e */
/* compiled from: PG */
public final class C99282e {

    /* renamed from: a */
    public static final C59071e f277726a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.da.b.e");

    /* renamed from: b */
    public final C22871g f277727b;

    /* renamed from: c */
    public final C86054o f277728c;

    /* renamed from: d */
    public final C58119x f277729d = new C58119x();

    public C99282e(C22871g gVar, C86054o oVar) {
        this.f277727b = gVar;
        this.f277728c = oVar;
    }

    /* renamed from: a */
    public static void m164643a(C58098c cVar) {
        try {
            cVar.close();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f277726a.mo56225c()).mo56382g(e)).mo56372aa(31804)).mo56386p("Failed to close data stream used for upload.");
        }
    }
}
