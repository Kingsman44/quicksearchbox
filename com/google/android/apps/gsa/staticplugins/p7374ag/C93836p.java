package com.google.android.apps.gsa.staticplugins.p7374ag;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.p */
/* compiled from: PG */
public final /* synthetic */ class C93836p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C93809aa f262091a;

    /* renamed from: b */
    public final /* synthetic */ String f262092b;

    /* renamed from: c */
    public final /* synthetic */ Callable f262093c;

    public /* synthetic */ C93836p(C93809aa aaVar, String str, Callable callable) {
        this.f262091a = aaVar;
        this.f262092b = str;
        this.f262093c = callable;
    }

    public final Object call() {
        C93809aa aaVar = this.f262091a;
        String str = this.f262092b;
        Callable callable = this.f262093c;
        if (aaVar.f262046l == null) {
            try {
                return callable.call();
            } catch (Throwable th) {
                throw new C90457d(th, (int) C89885b.COOKIE_MANAGER_EXCEPTION_VALUE);
            }
        } else {
            C59104x c = C93809aa.f262034a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WebViewCookiesAsync");
            ((C59052c) ((C59052c) c).mo56372aa(19072)).mo56389s("Can't execute task (%s), because cookies are disabled", str);
            throw aaVar.f262046l;
        }
    }
}
