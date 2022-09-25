package com.google.android.apps.gsa.search.core.p6500ac;

import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.protobuf.MessageLite;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.search.core.ac.n */
/* compiled from: PG */
public final class C84410n {

    /* renamed from: d */
    private static final C59071e f229673d = C59071e.m91332i("com.google.android.apps.gsa.search.core.ac.n");

    /* renamed from: a */
    public final String f229674a;

    /* renamed from: b */
    public final String f229675b;

    /* renamed from: c */
    public final C89688a f229676c;

    /* renamed from: e */
    private final C22871g f229677e;

    public C84410n(String str, String str2, C89688a aVar, C22871g gVar) {
        this.f229674a = str;
        this.f229675b = str2;
        this.f229676c = aVar;
        this.f229677e = gVar;
    }

    /* renamed from: a */
    public final void mo77959a(Exception exc) {
        C56848d b = C84412p.m134716b(exc);
        ((C59052c) ((C59052c) ((C59052c) f229673d.mo56225c()).mo56382g(exc)).mo56372aa(8568)).mo56389s("Silk promise failed with ID: %s", b.f151672b);
        mo77960b(C84412p.m134717c(b));
    }

    /* renamed from: b */
    public final void mo77960b(String str) {
        this.f229677e.mo28212l("failPromise", new C84408l(this, str));
    }

    /* renamed from: c */
    public final void mo77961c(MessageLite messageLite) {
        try {
            this.f229677e.mo28212l("resolvePromise", new C84409m(this, new JSONObject().put("result", C87556d.m142213b(messageLite))));
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void mo77962d(String str) {
        this.f229677e.mo28212l("resolvePromise", new C84407k(this, str));
    }
}
